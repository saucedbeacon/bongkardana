package com.alibaba.ariver.kernel.api.invoke;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.immutable.ImmutableList;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.reflect.Method;

public class ScheduleExtensionInvoker extends ExtensionInvoker {

    /* renamed from: a  reason: collision with root package name */
    private RVExecutorService f10081a = ((RVExecutorService) RVProxy.get(RVExecutorService.class));

    public ScheduleExtensionInvoker(ExtensionInvoker extensionInvoker) {
        super(extensionInvoker);
    }

    /* access modifiers changed from: protected */
    public ExtensionInvoker.InvokeResult onInvoke(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        final long currentTimeMillis = System.currentTimeMillis();
        ThreadType threadType = (ThreadType) method.getAnnotation(ThreadType.class);
        ExecutorType value = threadType != null ? threadType.value() : ExecutorType.SYNC;
        if (threadType != null && ExecutorUtils.currentThreadInArray(threadType.transSyncThreadNames()) && !a()) {
            value = ExecutorType.SYNC;
        }
        int i = AnonymousClass3.$SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType[value.ordinal()];
        boolean z = true;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("method ");
            sb.append(method);
            sb.append(" cost ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            RVLogger.debug("AriverKernel:ExtensionInvoker:Schedule", sb.toString());
            return ExtensionInvoker.InvokeResult.proceed();
        } else if (i != 2) {
            if (i == 3) {
                Class cls = obj.getClass().getInterfaces().length > 0 ? obj.getClass().getInterfaces()[0] : null;
                if (cls == null || (!cls.getName().startsWith("com.alipay.mobile.nebulax") && !cls.getName().startsWith("com.alibaba.ariver"))) {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb2 = new StringBuilder("extension ");
                    sb2.append(obj);
                    sb2.append(" want to execute on URGENT_DISPLAY but not nebulax class!");
                    RVLogger.w("AriverKernel:ExtensionInvoker:Schedule", sb2.toString());
                    value = ExecutorType.URGENT;
                }
            }
            final Method method2 = method;
            final ImmutableList<Extension> immutableList2 = immutableList;
            final Object obj2 = obj;
            final Object[] objArr2 = objArr;
            this.f10081a.getExecutor(value).execute(new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder("method ");
                    sb.append(method2);
                    sb.append(" cost ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    RVLogger.debug("AriverKernel:ExtensionInvoker:Schedule", sb.toString());
                    ScheduleExtensionInvoker.this.proceedSafe(immutableList2, obj2, method2, objArr2);
                }
            });
            return ExtensionInvoker.InvokeResult.pending();
        } else {
            final Method method3 = method;
            final ImmutableList<Extension> immutableList3 = immutableList;
            final Object obj3 = obj;
            final Object[] objArr3 = objArr;
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder("method ");
                    sb.append(method3);
                    sb.append(" cost ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    RVLogger.debug("AriverKernel:ExtensionInvoker:Schedule", sb.toString());
                    ScheduleExtensionInvoker.this.proceedSafe(immutableList3, obj3, method3, objArr3);
                }
            });
            return ExtensionInvoker.InvokeResult.pending();
        }
    }

    /* renamed from: com.alibaba.ariver.kernel.api.invoke.ScheduleExtensionInvoker$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType[] r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType = r0
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.SYNC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$kernel$common$service$executor$ExecutorType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.kernel.common.service.executor.ExecutorType r1 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT_DISPLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.api.invoke.ScheduleExtensionInvoker.AnonymousClass3.<clinit>():void");
        }
    }

    private boolean a() {
        return TextUtils.equals(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("ta_disable_trans_sync_thread", (String) null), "yes");
    }
}
