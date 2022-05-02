package com.alibaba.ariver.integration;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.NodeInstance;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.ipc.ServerMsgReceiver;
import com.alibaba.ariver.engine.common.bridge.dispatch.BridgeDispatcher;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.integration.ipc.server.a;
import com.alibaba.ariver.integration.ipc.server.c;
import com.alibaba.ariver.ipc.RemoteCallClient;
import com.alibaba.ariver.kernel.BuildConfig;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.api.extension.DefaultExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionOpt;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.registry.BridgeDSLRegistry;
import com.alibaba.ariver.kernel.api.extension.registry.DefaultExtensionRegistry;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionRegistry;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.ReflectUtils;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.kernel.ipc.RVRemoteCallerProxy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public class RVInitializer {
    private static final String MANIFEST_CLZ = "com.alibaba.ariver.AriverManifest";
    private static final String MANIFEST_COMMONABILITY_CLZ = "com.alibaba.ariver.commonability.integration.ManifestManager";
    private static final String MANIFEST_META_KEY = "ariver_manifest";
    private static boolean alreadyInited = false;
    private static boolean alreadySetupProxy = false;
    private static String[] optPackages = {BuildConfig.APPLICATION_ID, com.alibaba.ariver.kernel.api.BuildConfig.APPLICATION_ID, com.alibaba.ariver.app.BuildConfig.APPLICATION_ID, com.alibaba.ariver.app.api.BuildConfig.APPLICATION_ID, "com.alibaba.ariver.resource", com.alibaba.ariver.resource.api.BuildConfig.APPLICATION_ID, com.alibaba.ariver.engine.BuildConfig.APPLICATION_ID, com.alibaba.ariver.engine.api.BuildConfig.APPLICATION_ID, "com.alibaba.ariver.jsapi", "com.alibaba.ariver.integration", "com.alibaba.ariver.permission", "com.alibaba.ariver.permission.api", "com.alibaba.ariver.commonability.file", "com.alibaba.ariver.commonability.device", "com.alipay.mobile.aompfilemanager", "com.alipay.mobile.nebulax.resource.biz", "com.alipay.mobile.nebulax.integration.base", "com.alipay.mobile.nebulax.integration.wallet"};
    private static ExtensionManager sExtensionManager;
    private static AtomicBoolean sOptOptimizeInited = new AtomicBoolean(false);
    private static RVProxy.Printer sPrinter;
    private static RVManifest sProjectManifest;

    public static void setPrinter(RVProxy.Printer printer) {
        sPrinter = printer;
    }

    private static synchronized RVProxy.Printer getPrinter() {
        RVProxy.Printer printer;
        synchronized (RVInitializer.class) {
            if (sPrinter == null) {
                sPrinter = new RVProxy.EmptyPrinter();
            }
            printer = sPrinter;
        }
        return printer;
    }

    public static RVManifest getProjectManifest() {
        return sProjectManifest;
    }

    public static synchronized void reset() {
        synchronized (RVInitializer.class) {
            alreadyInited = false;
            alreadySetupProxy = false;
        }
    }

    public static synchronized void init(Context context) {
        synchronized (RVInitializer.class) {
            init(context, (ExtensionManager) null);
        }
    }

    public static synchronized void init(Context context, @Nullable ExtensionManager extensionManager) {
        ExtensionRegistry extensionRegistry;
        BridgeDSLRegistry bridgeDSLRegistry;
        synchronized (RVInitializer.class) {
            if (!alreadyInited) {
                getPrinter().print("begin RVInitializer.init");
                alreadyInited = true;
                ensureManifestFile(context);
                setupProxy(context);
                try {
                    getPrinter().print("RVInitializer.init step 1");
                    if (extensionManager != null) {
                        extensionRegistry = extensionManager.getExtensionRegistry();
                    } else {
                        extensionRegistry = new DefaultExtensionRegistry();
                    }
                    if (extensionManager != null) {
                        bridgeDSLRegistry = extensionManager.getBridgeDSLRegistry();
                    } else {
                        bridgeDSLRegistry = new BridgeDSLRegistry();
                    }
                    getPrinter().print("RVInitializer.init step 2");
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i = 0;
                    List<RVManifest.BridgeExtensionManifest> bridgeExtensions = sProjectManifest.getBridgeExtensions();
                    if (bridgeExtensions != null) {
                        i = bridgeExtensions.size();
                        for (RVManifest.BridgeExtensionManifest next : bridgeExtensions) {
                            if (next.isRawType) {
                                extensionRegistry.register(next.extensionMetaInfo);
                            } else {
                                extensionRegistry.register(next.target, next.scope);
                            }
                            if (next.bridgeDSLs != null && !next.bridgeDSLs.isEmpty()) {
                                bridgeDSLRegistry.register(next.bridgeDSLs);
                            }
                        }
                    }
                    RVProxy.Printer printer = getPrinter();
                    StringBuilder sb = new StringBuilder("register bridge done with size: ");
                    sb.append(i);
                    sb.append(", cost: ");
                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    printer.print(sb.toString());
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    List<ExtensionMetaInfo> extensions = sProjectManifest.getExtensions();
                    registerExtensionsForFinalExecute(extensions);
                    if (extensions != null) {
                        i = extensions.size();
                        for (ExtensionMetaInfo register : extensions) {
                            extensionRegistry.register(register);
                        }
                    }
                    RVProxy.Printer printer2 = getPrinter();
                    StringBuilder sb2 = new StringBuilder("register extension done with size: ");
                    sb2.append(i);
                    sb2.append(", cost: ");
                    sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime2);
                    printer2.print(sb2.toString());
                    if (extensionManager == null) {
                        extensionManager = new DefaultExtensionManager(sProjectManifest.getAccessController(), sProjectManifest.getRemoteController(), extensionRegistry, bridgeDSLRegistry);
                    }
                    RVProxy.Printer printer3 = getPrinter();
                    StringBuilder sb3 = new StringBuilder("register bridge done with jsapi count: ");
                    sb3.append(extensionRegistry.getActionCount());
                    printer3.print(sb3.toString());
                    BridgeDispatcher.getInstance().bindExtensionManager(extensionManager);
                    ExtensionPoint.bind(extensionManager);
                    NodeInstance.bindExtensionManager(extensionManager);
                    sExtensionManager = extensionManager;
                    if (ProcessUtils.isMainProcess()) {
                        ServerMsgReceiver.getInstance().registerBizHandler(IpcMessageConstants.BIZ_APP, new a());
                        ServerMsgReceiver.getInstance().registerBizHandler(IpcMessageConstants.BIZ_APP, new c(extensionManager));
                        IpcChannelManager.getInstance().registerServerChannel(new IIpcChannel.Stub() {
                            public final boolean isFinishing() {
                                return false;
                            }

                            public final void sendMessage(IpcMessage ipcMessage) {
                                ServerMsgReceiver.getInstance().handleMessage(ipcMessage);
                            }
                        });
                        List<RVManifest.ServiceBeanManifest> serviceBeans = sProjectManifest.getServiceBeans(extensionManager);
                        if (serviceBeans != null) {
                            for (RVManifest.ServiceBeanManifest next2 : serviceBeans) {
                                ((RVRemoteCallerProxy) RVProxy.get(RVRemoteCallerProxy.class)).registerServiceBean(next2.beanClass, next2.beanObject.get());
                            }
                        }
                    } else {
                        RemoteCallClient.prepare();
                    }
                    setupOptimize();
                    getPrinter().print("end RVInitializer.init");
                } catch (Throwable th) {
                    RVProxy.Printer printer4 = getPrinter();
                    StringBuilder sb4 = new StringBuilder("setup ExtensionManager exception!");
                    sb4.append(Log.getStackTraceString(th));
                    printer4.print(sb4.toString());
                    throw new IllegalStateException("setup ExtensionManager exception!", th);
                }
            }
        }
    }

    private static void registerExtensionsForFinalExecute(List<ExtensionMetaInfo> list) {
        list.add(new ExtensionMetaInfo("ariver-build", "com.alibaba.ariver.jsapi.logging.RVPerfLogLifeCycleExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.page.PageInitPoint", "com.alibaba.ariver.app.api.point.page.PageExitPoint", "com.alibaba.ariver.app.api.point.app.AppExitPoint"}), (Class<? extends Scope>) App.class));
    }

    public static ExtensionManager getExtensionManager() {
        return sExtensionManager;
    }

    public static synchronized void setupProxy(Context context) {
        int i;
        synchronized (RVInitializer.class) {
            if (!alreadySetupProxy) {
                getPrinter().print("begin setupProxy");
                alreadySetupProxy = true;
                ensureManifestFile(context);
                try {
                    RVProxy.setPrinter(getPrinter());
                    List<RVManifest.IProxyManifest> proxies = sProjectManifest.getProxies();
                    if (proxies == null) {
                        i = 0;
                    } else {
                        i = proxies.size();
                    }
                    getPrinter().print("setupProxy size ".concat(String.valueOf(i)));
                    if (proxies != null) {
                        for (RVManifest.IProxyManifest next : proxies) {
                            if (next instanceof RVManifest.ProxyManifest) {
                                RVProxy.set(((RVManifest.ProxyManifest) next).proxiableClass, ((RVManifest.ProxyManifest) next).implObject);
                            } else if (next instanceof RVManifest.LazyProxyManifest) {
                                RVProxy.setLazy(((RVManifest.LazyProxyManifest) next).proxiableClass, ((RVManifest.LazyProxyManifest) next).implObject);
                            }
                        }
                    }
                    RVProxy.sHasSetupProxy = true;
                } catch (Throwable th) {
                    RVProxy.Printer printer = getPrinter();
                    StringBuilder sb = new StringBuilder("setupProxy error!");
                    sb.append(Log.getStackTraceString(th));
                    printer.print(sb.toString());
                    throw new IllegalStateException("setupProxy error!", th);
                }
            }
        }
    }

    public static void setProjectManifest(RVManifest rVManifest) {
        sProjectManifest = rVManifest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void ensureManifestFile(android.content.Context r6) {
        /*
            com.alibaba.ariver.integration.RVManifest r0 = sProjectManifest
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.alibaba.ariver.kernel.common.RVProxy$Printer r1 = getPrinter()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ensureManifestFile "
            r2.<init>(r3)
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.print(r2)
            r1 = 0
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0067 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x0081
            android.os.Bundle r2 = r6.metaData     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0081
            android.os.Bundle r2 = r6.metaData     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "ariver_manifest"
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0081
            android.os.Bundle r6 = r6.metaData     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "com.alibaba.griver.core.GriverManifest"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0067 }
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "got Manifest class from metaData: "
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0067 }
            r2.print(r3)     // Catch:{ all -> 0x0067 }
            java.lang.Object r6 = r6.newInstance()     // Catch:{ all -> 0x0067 }
            com.alibaba.ariver.integration.RVManifest r6 = (com.alibaba.ariver.integration.RVManifest) r6     // Catch:{ all -> 0x0067 }
            goto L_0x0082
        L_0x0067:
            r6 = move-exception
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getStringValueFromMetaData!"
            r3.<init>(r4)
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.print(r6)
        L_0x0081:
            r6 = r1
        L_0x0082:
            if (r6 != 0) goto L_0x00bd
            java.lang.String r2 = "com.alibaba.ariver.AriverManifest"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x00a3 }
            com.alibaba.ariver.kernel.common.RVProxy$Printer r3 = getPrinter()     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = "got Manifest class: "
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x00a3 }
            r3.print(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ all -> 0x00a3 }
            com.alibaba.ariver.integration.RVManifest r2 = (com.alibaba.ariver.integration.RVManifest) r2     // Catch:{ all -> 0x00a3 }
            r6 = r2
            goto L_0x00bd
        L_0x00a3:
            r2 = move-exception
            com.alibaba.ariver.kernel.common.RVProxy$Printer r3 = getPrinter()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "generate manifest exception!"
            r4.<init>(r5)
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.print(r2)
        L_0x00bd:
            if (r6 == 0) goto L_0x0127
            r0.add(r6)
            java.lang.String r2 = "com.alibaba.ariver.commonability.integration.ManifestManager"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x00e1 }
            com.alibaba.ariver.kernel.common.RVProxy$Printer r3 = getPrinter()     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "got commonAbility Manifest class: "
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x00e1 }
            r3.print(r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ all -> 0x00e1 }
            com.alibaba.ariver.integration.RVManifest r2 = (com.alibaba.ariver.integration.RVManifest) r2     // Catch:{ all -> 0x00e1 }
            r1 = r2
            goto L_0x00fb
        L_0x00e1:
            r2 = move-exception
            com.alibaba.ariver.kernel.common.RVProxy$Printer r3 = getPrinter()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "generate commonAbility manifest exception!"
            r4.<init>(r5)
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.print(r2)
        L_0x00fb:
            if (r1 != 0) goto L_0x0107
            com.alibaba.ariver.kernel.common.RVProxy$Printer r1 = getPrinter()
            java.lang.String r2 = "commonAbilityManifest null!!"
            r1.print(r2)
            goto L_0x010a
        L_0x0107:
            r0.add(r1)
        L_0x010a:
            com.alibaba.ariver.integration.RVManifestWrapper r1 = new com.alibaba.ariver.integration.RVManifestWrapper
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()
            r1.<init>(r0, r2)
            sProjectManifest = r1
            com.alibaba.ariver.kernel.common.RVProxy$Printer r0 = getPrinter()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "got mainManifest file: "
            java.lang.String r6 = r1.concat(r6)
            r0.print(r6)
            return
        L_0x0127:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot find com.alibaba.ariver.AriverManifest"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.integration.RVInitializer.ensureManifestFile(android.content.Context):void");
    }

    static void setupOptimize() {
        if (!((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_apt", true)) {
            ExtensionPoint.clearProxyGenerator();
            ExtensionOpt.clearAllMethodInvokeOptimizer();
            sOptOptimizeInited.getAndSet(false);
        } else if (!sOptOptimizeInited.getAndSet(true)) {
            for (String str : optPackages) {
                try {
                    String initClassNameFromPkgName = initClassNameFromPkgName(str);
                    RVProxy.Printer printer = getPrinter();
                    StringBuilder sb = new StringBuilder("RVInitializer.setupOptimize get final class name: ");
                    sb.append(initClassNameFromPkgName);
                    sb.append(" for packageName: ");
                    sb.append(str);
                    printer.print(sb.toString());
                    Class<?> cls = Class.forName("com.alibaba.ariver.apt.".concat(String.valueOf(initClassNameFromPkgName)));
                    if (cls != null) {
                        ReflectUtils.invokeMethod((Class) cls, "opt1");
                        ReflectUtils.invokeMethod((Class) cls, "opt2");
                        ReflectUtils.invokeMethod((Class) cls, "opt3");
                    }
                } catch (Throwable th) {
                    RVProxy.Printer printer2 = getPrinter();
                    StringBuilder sb2 = new StringBuilder("RVInitializer.setupOptimize error: ");
                    sb2.append(th.getMessage());
                    printer2.print(sb2.toString());
                }
            }
        }
    }

    private static String initClassNameFromPkgName(String str) {
        String[] strArr = {"com.alipay.mobile.nebulax.integration.wallet", "com.alibaba.ariver.commonability.device", "com.alibaba.ariver.commonability.file"};
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (str.startsWith(str2)) {
                str = str2;
            }
        }
        String[] split = str.split("\\.");
        int i2 = 4;
        if (str.startsWith("com.alipay.mobile.nebulax")) {
            i2 = 6;
        } else if (str.startsWith("com.alibaba.ariver.commonability")) {
            i2 = 5;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        for (String str3 : split) {
            if (i3 > i2 || (i3 > i2 - 1 && !"api".equalsIgnoreCase(str3))) {
                break;
            }
            if (i3 > 0) {
                sb.append("_");
            }
            sb.append(str3);
            i3++;
        }
        sb.append("_ExtOpt");
        String obj = sb.toString();
        System.out.println("get final class name: ".concat(String.valueOf(obj)));
        return obj;
    }
}
