package o;

import android.os.Handler;
import java.lang.Exception;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\f\b\u0001\u0010\u0002*\u00060\u0003j\u0002`\u00042\u00020\u0005B\u0001\u0012b\u0010\u0006\u001a^\u0012)\u0012'\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012)\u0012'\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bRj\u0010\u0006\u001a^\u0012)\u0012'\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012)\u0012'\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/twilio/verify/threading/Task;", "T", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/Runnable;", "block", "Lkotlin/Function2;", "Lkotlin/Function1;", "", "Lcom/twilio/verify/threading/SafeSuccessResult;", "Lkotlin/ParameterName;", "name", "onSuccess", "Lcom/twilio/verify/threading/SafeError;", "onError", "success", "error", "handler", "Landroid/os/Handler;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/os/Handler;)V", "run", "safeError", "exception", "(Ljava/lang/Exception;)V", "safeSuccess", "result", "(Ljava/lang/Object;)V", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getDecoratedMeasuredWidth<T, E extends Exception> implements Runnable {
    private final Function2<Function1<? super T, Unit>, Function1<? super E, Unit>, Unit> getMin;
    private final Handler length;
    /* access modifiers changed from: private */
    public final Function1<E, Unit> setMax;
    /* access modifiers changed from: private */
    public final Function1<T, Unit> setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0003*\u00060\u0004j\u0002`\u00052\u0015\u0010\u0006\u001a\u0011H\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "T", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p1", "Lkotlin/ParameterName;", "name", "exception", "invoke", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class length extends FunctionReference implements Function1<E, Unit> {
        length(getDecoratedMeasuredWidth getdecoratedmeasuredwidth) {
            super(1, getdecoratedmeasuredwidth);
        }

        public final String getName() {
            return "safeError";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(getDecoratedMeasuredWidth.class);
        }

        public final String getSignature() {
            return "safeError(Ljava/lang/Exception;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull E e) {
            Intrinsics.checkParameterIsNotNull(e, "p1");
            getDecoratedMeasuredWidth.getMax((getDecoratedMeasuredWidth) this.receiver, e);
        }
    }

    private getDecoratedMeasuredWidth(@NotNull Function2<? super Function1<? super T, Unit>, ? super Function1<? super E, Unit>, Unit> function2, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super E, Unit> function12, @Nullable Handler handler) {
        Intrinsics.checkParameterIsNotNull(function2, "block");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        this.getMin = function2;
        this.setMin = function1;
        this.setMax = function12;
        this.length = handler;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getDecoratedMeasuredWidth(kotlin.jvm.functions.Function2 r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 == 0) goto L_0x001a
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
        L_0x001a:
            r3.<init>(r4, r5, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDecoratedMeasuredWidth.<init>(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0003*\u00060\u0004j\u0002`\u00052\u0015\u0010\u0006\u001a\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "T", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p1", "Lkotlin/ParameterName;", "name", "result", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class setMax extends FunctionReference implements Function1<T, Unit> {
        setMax(getDecoratedMeasuredWidth getdecoratedmeasuredwidth) {
            super(1, getdecoratedmeasuredwidth);
        }

        public final String getName() {
            return "safeSuccess";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(getDecoratedMeasuredWidth.class);
        }

        public final String getSignature() {
            return "safeSuccess(Ljava/lang/Object;)V";
        }

        public final void invoke(T t) {
            getDecoratedMeasuredWidth.length((getDecoratedMeasuredWidth) this.receiver, t);
        }
    }

    public final void run() {
        getDecoratedMeasuredWidth getdecoratedmeasuredwidth = this;
        this.getMin.invoke(new setMax(getdecoratedmeasuredwidth), new length(getdecoratedmeasuredwidth));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0003*\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "run", "com/twilio/verify/threading/Task$safeSuccess$1$1"}, k = 3, mv = {1, 1, 16})
    static final class getMin implements Runnable {
        final /* synthetic */ Object length;
        final /* synthetic */ getDecoratedMeasuredWidth setMin;

        getMin(getDecoratedMeasuredWidth getdecoratedmeasuredwidth, Object obj) {
            this.setMin = getdecoratedmeasuredwidth;
            this.length = obj;
        }

        public final void run() {
            this.setMin.setMin.invoke(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0003*\u00060\u0004j\u0002`\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "run", "com/twilio/verify/threading/Task$safeError$1$1"}, k = 3, mv = {1, 1, 16})
    static final class getMax implements Runnable {
        final /* synthetic */ getDecoratedMeasuredWidth setMax;
        final /* synthetic */ Exception setMin;

        getMax(getDecoratedMeasuredWidth getdecoratedmeasuredwidth, Exception exc) {
            this.setMax = getdecoratedmeasuredwidth;
            this.setMin = exc;
        }

        public final void run() {
            this.setMax.setMax.invoke(this.setMin);
        }
    }

    public static final /* synthetic */ void length(getDecoratedMeasuredWidth getdecoratedmeasuredwidth, Object obj) {
        Handler handler = getdecoratedmeasuredwidth.length;
        if (handler != null) {
            handler.post(new getMin(getdecoratedmeasuredwidth, obj));
        } else {
            getdecoratedmeasuredwidth.setMin.invoke(obj);
        }
    }

    public static final /* synthetic */ void getMax(getDecoratedMeasuredWidth getdecoratedmeasuredwidth, Exception exc) {
        Handler handler = getdecoratedmeasuredwidth.length;
        if (handler != null) {
            handler.post(new getMax(getdecoratedmeasuredwidth, exc));
        } else {
            getdecoratedmeasuredwidth.setMax.invoke(exc);
        }
    }
}
