package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.alipay.mobile.security.bio.config.BisRuntimeInfoEnum;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.service.local.language.LanguageService;
import com.alipay.mobile.security.bio.workspace.Env;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Runtime {
    private static final String LAUNCHER_APPLICATION = "com.alipay.mobile.quinox.LauncherApplication";
    public static final String TAG = "Runtime";
    private static Object bundleContext;
    private static Method findClassLoaderByBundleName;
    private static Method getResourcesByBundle;
    private static FrameworkDesc sFrameworkDesc;
    private static Boolean sIsRunningOnQuinox = null;
    private static HashMap<String, ModuleDesc> sModuleDescMap;

    static {
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.framework.LauncherApplicationAgent");
            Method declaredMethod = cls.getDeclaredMethod("getmBundleContext", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            bundleContext = invoke;
            Class<?> cls2 = invoke.getClass();
            Method method = cls2.getMethod("getResourcesByBundle", new Class[]{String.class});
            getResourcesByBundle = method;
            method.setAccessible(true);
            Method method2 = cls2.getMethod("findClassLoaderByBundleName", new Class[]{String.class});
            findClassLoaderByBundleName = method2;
            method2.setAccessible(true);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean isRunningOnQuinox(Context context) {
        if (sIsRunningOnQuinox == null) {
            synchronized (LAUNCHER_APPLICATION) {
                if (sIsRunningOnQuinox == null) {
                    sIsRunningOnQuinox = Boolean.valueOf(LAUNCHER_APPLICATION.equals(context.getApplicationContext().getClass().getName()));
                }
            }
        }
        return sIsRunningOnQuinox.booleanValue();
    }

    public static ClassLoader getClassLoaderByBundleName(String str) {
        try {
            return (ClassLoader) findClassLoaderByBundleName.invoke(bundleContext, new Object[]{str});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Resources getResourcesByBundleName(String str) {
        try {
            return (Resources) getResourcesByBundle.invoke(bundleContext, new Object[]{str});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<BioMetaInfo> getBioMetaInfoList() {
        ArrayList arrayList = new ArrayList();
        for (ModuleDesc next : sModuleDescMap.values()) {
            if (next.mBioMetaInfoList != null && !next.mBioMetaInfoList.isEmpty()) {
                arrayList.addAll(next.mBioMetaInfoList);
            }
        }
        return arrayList;
    }

    public static BioServiceDescription getBioServiceDescriptionByInterface(Context context, String str) {
        inflateModules(context, isRunningOnQuinox(context));
        return getBioServiceDescriptionByInterface(str);
    }

    private static BioServiceDescription getBioServiceDescriptionByInterface(String str) {
        BioServiceDescription bioServiceDescription = null;
        for (ModuleDesc next : sModuleDescMap.values()) {
            if (next.mBioServiceDescription != null && !next.mBioServiceDescription.isEmpty()) {
                Iterator<BioServiceDescription> it = next.mBioServiceDescription.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        continue;
                        break;
                    }
                    BioServiceDescription next2 = it.next();
                    if (TextUtils.equals(str, next2.getInterfaceName())) {
                        bioServiceDescription = next2;
                        continue;
                        break;
                    }
                }
            }
            if (bioServiceDescription != null) {
                break;
            }
        }
        return bioServiceDescription;
    }

    public static void getLocalService(Context context, HashMap<String, LocalService> hashMap, HashMap<String, BioServiceDescription> hashMap2) {
        inflateModules(context, isRunningOnQuinox(context));
        ArrayList<BioServiceDescription> arrayList = new ArrayList<>();
        for (ModuleDesc next : sModuleDescMap.values()) {
            if (next.mBioServiceDescription != null && !next.mBioServiceDescription.isEmpty()) {
                arrayList.addAll(next.mBioServiceDescription);
            }
        }
        for (BioServiceDescription bioServiceDescription : arrayList) {
            if (bioServiceDescription.isLazy()) {
                if (hashMap2 != null) {
                    hashMap2.put(bioServiceDescription.getInterfaceName(), bioServiceDescription);
                }
            } else if (hashMap != null) {
                try {
                    hashMap.put(bioServiceDescription.getInterfaceName(), (LocalService) bioServiceDescription.getClazz().newInstance());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?> loadClass(android.content.Context r2, boolean r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            if (r3 == 0) goto L_0x0015
            java.lang.ClassLoader r3 = getClassLoaderByBundleName(r5)
            if (r3 == 0) goto L_0x0015
            java.lang.Class r3 = r3.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r0.add(r3)
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x002c
            java.lang.Class<com.alipay.mobile.security.bio.runtime.Runtime> r5 = com.alipay.mobile.security.bio.runtime.Runtime.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L_0x002c
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0029 }
            goto L_0x002c
        L_0x0029:
            r0.add(r5)
        L_0x002c:
            if (r3 != 0) goto L_0x0040
            if (r2 == 0) goto L_0x0040
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r2 == 0) goto L_0x0040
            boolean r5 = r0.contains(r2)
            if (r5 != 0) goto L_0x0040
            java.lang.Class r3 = r2.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0040 }
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.runtime.Runtime.loadClass(android.content.Context, boolean, java.lang.String, java.lang.String):java.lang.Class");
    }

    public static String getFrameworkVersion(Context context) {
        return getSdkVersion(context, sFrameworkDesc.frameworkVersion, getBioMetaInfoList());
    }

    public static String getMetaInfos(Context context, Map<String, Object> map) {
        if (context != null) {
            boolean isRunningOnQuinox = isRunningOnQuinox(context);
            inflateModules(context, isRunningOnQuinox);
            List<BioMetaInfo> bioMetaInfoList = getBioMetaInfoList();
            String sdkVersion = getSdkVersion(context, sFrameworkDesc.frameworkVersion, bioMetaInfoList);
            String sdkModule = getSdkModule(context, bioMetaInfoList);
            String runtimeInfo = getRuntimeInfo(context, bioMetaInfoList, isRunningOnQuinox, map);
            StringBuilder sb = new StringBuilder();
            sb.append(sdkVersion);
            sb.append(":");
            sb.append(sdkModule);
            sb.append(",");
            sb.append(runtimeInfo);
            return sb.toString();
        }
        throw new BioIllegalArgumentException("Context is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void inflateModules(android.content.Context r6, boolean r7) {
        /*
            java.lang.Class<com.alipay.mobile.security.bio.runtime.Runtime> r0 = com.alipay.mobile.security.bio.runtime.Runtime.class
            monitor-enter(r0)
            com.alipay.mobile.security.bio.runtime.FrameworkDesc r1 = sFrameworkDesc     // Catch:{ all -> 0x0150 }
            if (r1 != 0) goto L_0x000d
            com.alipay.mobile.security.bio.runtime.FrameworkDesc r1 = com.alipay.mobile.security.bio.runtime.FrameworkDesc.create(r6)     // Catch:{ all -> 0x0150 }
            sFrameworkDesc = r1     // Catch:{ all -> 0x0150 }
        L_0x000d:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0150 }
            r1.<init>()     // Catch:{ all -> 0x0150 }
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r2 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            if (r2 != 0) goto L_0x00cb
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.runtime.FrameworkDesc r3 = sFrameworkDesc     // Catch:{ all -> 0x0150 }
            java.util.List<com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc> r3 = r3.configs     // Catch:{ all -> 0x0150 }
            int r3 = r3.size()     // Catch:{ all -> 0x0150 }
            r2.<init>(r3)     // Catch:{ all -> 0x0150 }
            sModuleDescMap = r2     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.runtime.FrameworkDesc r2 = sFrameworkDesc     // Catch:{ all -> 0x0150 }
            java.util.List<com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc> r2 = r2.configs     // Catch:{ all -> 0x0150 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0150 }
        L_0x002d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc r3 = (com.alipay.mobile.security.bio.runtime.FrameworkDesc.ConfigDesc) r3     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.runtime.ModuleDesc r4 = com.alipay.mobile.security.bio.runtime.ModuleDesc.create(r6, r7, r3)     // Catch:{ all -> 0x0150 }
            if (r7 == 0) goto L_0x0089
            boolean r5 = r3.dev     // Catch:{ all -> 0x0150 }
            if (r5 == 0) goto L_0x005b
            boolean r5 = r3.dynamic     // Catch:{ all -> 0x0150 }
            if (r5 == 0) goto L_0x0051
            if (r4 == 0) goto L_0x002d
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r5 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.configFileName     // Catch:{ all -> 0x0150 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x002d
        L_0x0051:
            if (r4 == 0) goto L_0x002d
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r5 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.configFileName     // Catch:{ all -> 0x0150 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x002d
        L_0x005b:
            boolean r5 = r3.dynamic     // Catch:{ all -> 0x0150 }
            if (r5 == 0) goto L_0x006f
            if (r4 != 0) goto L_0x0067
            java.lang.String r3 = r3.bundleName     // Catch:{ all -> 0x0150 }
            r1.add(r3)     // Catch:{ all -> 0x0150 }
            goto L_0x002d
        L_0x0067:
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r5 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.configFileName     // Catch:{ all -> 0x0150 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x002d
        L_0x006f:
            if (r4 == 0) goto L_0x0079
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r5 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.configFileName     // Catch:{ all -> 0x0150 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x002d
        L_0x0079:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "There is a static bundle can't be found: "
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x0150 }
            r6.<init>(r7)     // Catch:{ all -> 0x0150 }
            throw r6     // Catch:{ all -> 0x0150 }
        L_0x0089:
            boolean r5 = r3.dev     // Catch:{ all -> 0x0150 }
            if (r5 != 0) goto L_0x00bb
            boolean r5 = r3.dynamic     // Catch:{ all -> 0x0150 }
            if (r5 != 0) goto L_0x00ab
            if (r4 == 0) goto L_0x009b
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r5 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.configFileName     // Catch:{ all -> 0x0150 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x002d
        L_0x009b:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "There is a static bundle can't be found: "
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x0150 }
            r6.<init>(r7)     // Catch:{ all -> 0x0150 }
            throw r6     // Catch:{ all -> 0x0150 }
        L_0x00ab:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "On no-quinox, there is a dynamic bundle: "
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x0150 }
            r6.<init>(r7)     // Catch:{ all -> 0x0150 }
            throw r6     // Catch:{ all -> 0x0150 }
        L_0x00bb:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "On no-quinox, there is a dev bundle: "
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x0150 }
            r6.<init>(r7)     // Catch:{ all -> 0x0150 }
            throw r6     // Catch:{ all -> 0x0150 }
        L_0x00cb:
            if (r7 == 0) goto L_0x00fa
            com.alipay.mobile.security.bio.runtime.FrameworkDesc r2 = sFrameworkDesc     // Catch:{ all -> 0x0150 }
            java.util.List<com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc> r2 = r2.configs     // Catch:{ all -> 0x0150 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0150 }
        L_0x00d5:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc r3 = (com.alipay.mobile.security.bio.runtime.FrameworkDesc.ConfigDesc) r3     // Catch:{ all -> 0x0150 }
            boolean r4 = r3.dynamic     // Catch:{ all -> 0x0150 }
            if (r4 == 0) goto L_0x00d5
            r4 = 1
            com.alipay.mobile.security.bio.runtime.ModuleDesc r4 = com.alipay.mobile.security.bio.runtime.ModuleDesc.create(r6, r4, r3)     // Catch:{ all -> 0x0150 }
            if (r4 != 0) goto L_0x00f2
            java.lang.String r3 = r3.bundleName     // Catch:{ all -> 0x0150 }
            r1.add(r3)     // Catch:{ all -> 0x0150 }
            goto L_0x00d5
        L_0x00f2:
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r5 = sModuleDescMap     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.configFileName     // Catch:{ all -> 0x0150 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x00d5
        L_0x00fa:
            if (r7 == 0) goto L_0x014e
            java.lang.Class<com.alipay.mobile.security.bio.service.local.dynamicrelease.DynamicReleaseService> r7 = com.alipay.mobile.security.bio.service.local.dynamicrelease.DynamicReleaseService.class
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.service.BioServiceDescription r7 = getBioServiceDescriptionByInterface(r7)     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.service.local.LocalService r7 = com.alipay.mobile.security.bio.service.BioServiceManager.getLocalService((android.content.Context) r6, (com.alipay.mobile.security.bio.service.BioServiceDescription) r7)     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.service.local.dynamicrelease.DynamicReleaseService r7 = (com.alipay.mobile.security.bio.service.local.dynamicrelease.DynamicReleaseService) r7     // Catch:{ all -> 0x0150 }
            if (r7 == 0) goto L_0x012d
            com.alipay.mobile.security.bio.runtime.FrameworkDesc r2 = sFrameworkDesc     // Catch:{ all -> 0x0150 }
            java.util.List<com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc> r2 = r2.configs     // Catch:{ all -> 0x0150 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0150 }
        L_0x0116:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x012d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0150 }
            com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc r3 = (com.alipay.mobile.security.bio.runtime.FrameworkDesc.ConfigDesc) r3     // Catch:{ all -> 0x0150 }
            boolean r4 = r3.dynamic     // Catch:{ all -> 0x0150 }
            if (r4 == 0) goto L_0x0116
            java.lang.String r3 = r3.bundleName     // Catch:{ all -> 0x0150 }
            r4 = 0
            r7.monitorCoverage(r3, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x0116
        L_0x012d:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0150 }
            if (r2 != 0) goto L_0x014e
            com.alipay.mobile.security.bio.utils.StringUtil.collection2String(r1)     // Catch:{ all -> 0x0150 }
            if (r7 != 0) goto L_0x013a
            monitor-exit(r0)
            return
        L_0x013a:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0150 }
        L_0x013e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0150 }
            if (r2 == 0) goto L_0x014e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0150 }
            r7.trigDynamicRelease(r6, r2)     // Catch:{ all -> 0x0150 }
            goto L_0x013e
        L_0x014e:
            monitor-exit(r0)
            return
        L_0x0150:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x0154
        L_0x0153:
            throw r6
        L_0x0154:
            goto L_0x0153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.runtime.Runtime.inflateModules(android.content.Context, boolean):void");
    }

    private static String getSdkVersion(Context context, String str, List<BioMetaInfo> list) {
        if (list == null || list.isEmpty()) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(".") + 1;
        int parseInt = Integer.parseInt(str.substring(lastIndexOf));
        for (BioMetaInfo revision : list) {
            String revision2 = revision.getRevision(context);
            if (!TextUtils.isEmpty(revision2)) {
                parseInt += Integer.parseInt(revision2.replace(".", ""));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, lastIndexOf));
        sb.append(parseInt);
        return sb.toString();
    }

    private static String getSdkModule(Context context, List<BioMetaInfo> list) {
        int i = 0;
        for (BioMetaInfo next : list) {
            List<Long> productIDs = next.getProductIDs();
            if (productIDs != null && !productIDs.isEmpty()) {
                for (Long longValue : productIDs) {
                    double d = (double) i;
                    double pow = Math.pow(2.0d, (double) longValue.longValue());
                    Double.isNaN(d);
                    i = (int) (d + pow);
                }
            }
            List<Long> productIDs2 = next.getProductIDs(context);
            if (productIDs2 != null && !productIDs2.isEmpty()) {
                for (Long longValue2 : productIDs2) {
                    double d2 = (double) i;
                    double pow2 = Math.pow(2.0d, (double) longValue2.longValue());
                    Double.isNaN(d2);
                    i = (int) (d2 + pow2);
                }
            }
            List<BioAppDescription> applications = next.getApplications();
            if (applications != null && !applications.isEmpty()) {
                for (BioAppDescription productID : applications) {
                    long productID2 = productID.getProductID();
                    if (-1 != productID2) {
                        double d3 = (double) i;
                        double pow3 = Math.pow(2.0d, (double) productID2);
                        Double.isNaN(d3);
                        i = (int) (d3 + pow3);
                    }
                }
            }
        }
        return "".concat(String.valueOf(i));
    }

    private static String getRuntimeInfo(Context context, List<BioMetaInfo> list, boolean z, Map<String, Object> map) {
        int pow = (1 != Env.getProtocolFormat(context) ? (int) (Math.pow(2.0d, (double) BisRuntimeInfoEnum.PROTOCOL_FORMAT.getProductID()) + 0.0d) : 0) + (new LanguageService().getCurrentLanguage() * 4);
        for (BioMetaInfo runtimeInfoIDs : list) {
            List<Integer> runtimeInfoIDs2 = runtimeInfoIDs.getRuntimeInfoIDs(context, map);
            if (runtimeInfoIDs2 != null && !runtimeInfoIDs2.isEmpty()) {
                for (Integer intValue : runtimeInfoIDs2) {
                    double d = (double) pow;
                    double pow2 = Math.pow(2.0d, (double) intValue.intValue());
                    Double.isNaN(d);
                    pow = (int) (d + pow2);
                }
            }
        }
        return "".concat(String.valueOf(pow));
    }

    public static boolean startActivity(Intent intent) {
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.framework.LauncherApplicationAgent");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("getMicroApplicationContext", new Class[0]);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(invoke, new Object[0]);
            Method method3 = invoke2.getClass().getMethod("getTopApplication", new Class[0]);
            method3.setAccessible(true);
            Object invoke3 = method3.invoke(invoke2, new Object[0]);
            Method method4 = invoke2.getClass().getMethod("startExtActivity", new Class[]{Class.forName("com.alipay.mobile.framework.app.MicroApplication"), Intent.class});
            method4.setAccessible(true);
            method4.invoke(invoke2, new Object[]{invoke3, intent});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
