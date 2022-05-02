package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 4, 1})
final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements Function0<Class<?>> {
    final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.getClassHeader();
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<?> invoke() {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = r8.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass r0 = r0.getKotlinClass()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.getClassHeader()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.getMultifileClassName()
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            if (r2 == 0) goto L_0x0042
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0042
            kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = r8.this$0
            kotlin.reflect.jvm.internal.KPackageImpl r0 = kotlin.reflect.jvm.internal.KPackageImpl.this
            java.lang.Class r0 = r0.getJClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r3 = 47
            r4 = 46
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default((java.lang.String) r2, (char) r3, (char) r4, (boolean) r5, (int) r6, (java.lang.Object) r7)
            java.lang.Class r0 = r0.loadClass(r1)
            return r0
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2.invoke():java.lang.Class");
    }
}
