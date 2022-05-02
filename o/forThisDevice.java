package o;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lid/dana/domain/social/Result;", "T", "", "()V", "toString", "", "Error", "Success", "Lid/dana/domain/social/Result$Success;", "Lid/dana/domain/social/Result$Error;", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class forThisDevice<T> {
    private forThisDevice() {
    }

    public /* synthetic */ forThisDevice(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/domain/social/Result$Success;", "T", "", "Lid/dana/domain/social/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lid/dana/domain/social/Result$Success;", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax<T> extends forThisDevice<T> {
        @NotNull
        private final T data;

        public static /* synthetic */ setMax copy$default(setMax setmax, T t, int i, Object obj) {
            if ((i & 1) != 0) {
                t = setmax.data;
            }
            return setmax.copy(t);
        }

        @NotNull
        public final T component1() {
            return this.data;
        }

        @NotNull
        public final setMax<T> copy(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "data");
            return new setMax<>(t);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.data, (Object) ((setMax) obj).data);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.data;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(data=");
            sb.append(this.data);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(@NotNull T t) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(t, "data");
            this.data = t;
        }

        @NotNull
        public final T getData() {
            return this.data;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lid/dana/domain/social/Result$Error;", "Lid/dana/domain/social/Result;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends forThisDevice {
        @NotNull
        private final Exception exception;

        public static /* synthetic */ getMin copy$default(getMin getmin, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = getmin.exception;
            }
            return getmin.copy(exc);
        }

        @NotNull
        public final Exception component1() {
            return this.exception;
        }

        @NotNull
        public final getMin copy(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "exception");
            return new getMin(exc);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMin) && Intrinsics.areEqual((Object) this.exception, (Object) ((getMin) obj).exception);
            }
            return true;
        }

        public final int hashCode() {
            Exception exc = this.exception;
            if (exc != null) {
                return exc.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(exception=");
            sb.append(this.exception);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull Exception exc) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(exc, "exception");
            this.exception = exc;
        }

        @NotNull
        public final Exception getException() {
            return this.exception;
        }
    }

    @NotNull
    public String toString() {
        if (this instanceof setMax) {
            StringBuilder sb = new StringBuilder("Success[data=");
            sb.append(((setMax) this).getData());
            sb.append(']');
            return sb.toString();
        } else if (this instanceof getMin) {
            StringBuilder sb2 = new StringBuilder("Error[exception=");
            sb2.append(((getMin) this).getException());
            sb2.append(']');
            return sb2.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
