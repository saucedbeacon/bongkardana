package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BZ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J&\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J`\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u001a\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\n\u001a\u00020\u0007J\t\u0010 \u001a\u00020!HÖ\u0001R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "result", "cancelHandler", "Lkotlinx/coroutines/CancelHandler;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "idempotentResume", "cancelCause", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelled", "", "getCancelled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "invokeHandlers", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
final class getAD107 {
    @Nullable
    @JvmField
    public final Object getMax;
    @Nullable
    @JvmField
    public final Object getMin;
    @Nullable
    @JvmField
    public final Function1<Throwable, Unit> length;
    @Nullable
    @JvmField
    public final Throwable setMax;
    @Nullable
    @JvmField
    public final xp3 setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAD107)) {
            return false;
        }
        getAD107 getad107 = (getAD107) obj;
        return Intrinsics.areEqual(this.getMax, getad107.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) getad107.setMin) && Intrinsics.areEqual((Object) this.length, (Object) getad107.length) && Intrinsics.areEqual(this.getMin, getad107.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) getad107.setMax);
    }

    public final int hashCode() {
        Object obj = this.getMax;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        xp3 xp3 = this.setMin;
        int hashCode2 = (hashCode + (xp3 != null ? xp3.hashCode() : 0)) * 31;
        Function1<Throwable, Unit> function1 = this.length;
        int hashCode3 = (hashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31;
        Object obj2 = this.getMin;
        int hashCode4 = (hashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.setMax;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.getMax);
        sb.append(", cancelHandler=");
        sb.append(this.setMin);
        sb.append(", onCancellation=");
        sb.append(this.length);
        sb.append(", idempotentResume=");
        sb.append(this.getMin);
        sb.append(", cancelCause=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    private getAD107(@Nullable Object obj, @Nullable xp3 xp3, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.getMax = obj;
        this.setMin = xp3;
        this.length = function1;
        this.getMin = obj2;
        this.setMax = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getAD107(Object obj, xp3 xp3, Function1 function1, Object obj2, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : xp3, (i & 4) != 0 ? null : function1, (Object) null, (i & 16) != 0 ? null : th);
    }

    public final boolean length() {
        return this.setMax != null;
    }

    public static /* synthetic */ getAD107 setMin(getAD107 getad107, Object obj, xp3 xp3, Function1<Throwable, Unit> function1, Object obj2, Throwable th, int i) {
        if ((i & 1) != 0) {
            obj = getad107.getMax;
        }
        Object obj3 = obj;
        if ((i & 2) != 0) {
            xp3 = getad107.setMin;
        }
        xp3 xp32 = xp3;
        if ((i & 4) != 0) {
            function1 = getad107.length;
        }
        Function1<Throwable, Unit> function12 = function1;
        if ((i & 8) != 0) {
            obj2 = getad107.getMin;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = getad107.setMax;
        }
        return new getAD107(obj3, xp32, function12, obj4, th);
    }
}
