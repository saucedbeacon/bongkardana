package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lid/dana/data/login/source/network/model/EvUrlStatusResult;", "", "callTime", "", "called", "", "complete", "(JZZ)V", "getCallTime", "()J", "setCallTime", "(J)V", "getCalled", "()Z", "setCalled", "(Z)V", "getComplete", "setComplete", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$63$1 {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private long callTime;
    private boolean called;
    private boolean complete;

    public static /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$63$1 copy$default(com_alibaba_ariver_app_api_ExtOpt$63$1 com_alibaba_ariver_app_api_extopt_63_1, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = com_alibaba_ariver_app_api_extopt_63_1.callTime;
        }
        if ((i & 2) != 0) {
            z = com_alibaba_ariver_app_api_extopt_63_1.called;
        }
        if ((i & 4) != 0) {
            z2 = com_alibaba_ariver_app_api_extopt_63_1.complete;
        }
        return com_alibaba_ariver_app_api_extopt_63_1.copy(j, z, z2);
    }

    public final long component1() {
        return this.callTime;
    }

    public final boolean component2() {
        return this.called;
    }

    public final boolean component3() {
        return this.complete;
    }

    @NotNull
    public final com_alibaba_ariver_app_api_ExtOpt$63$1 copy(long j, boolean z, boolean z2) {
        return new com_alibaba_ariver_app_api_ExtOpt$63$1(j, z, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com_alibaba_ariver_app_api_ExtOpt$63$1)) {
            return false;
        }
        com_alibaba_ariver_app_api_ExtOpt$63$1 com_alibaba_ariver_app_api_extopt_63_1 = (com_alibaba_ariver_app_api_ExtOpt$63$1) obj;
        return this.callTime == com_alibaba_ariver_app_api_extopt_63_1.callTime && this.called == com_alibaba_ariver_app_api_extopt_63_1.called && this.complete == com_alibaba_ariver_app_api_extopt_63_1.complete;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EvUrlStatusResult(callTime=");
        sb.append(this.callTime);
        sb.append(", called=");
        sb.append(this.called);
        sb.append(", complete=");
        sb.append(this.complete);
        sb.append(")");
        return sb.toString();
    }

    public com_alibaba_ariver_app_api_ExtOpt$63$1(long j, boolean z, boolean z2) {
        this.callTime = j;
        this.called = z;
        this.complete = z2;
    }

    public final long getCallTime() {
        return this.callTime;
    }

    public final boolean getCalled() {
        return this.called;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setCallTime(long j) {
        this.callTime = j;
    }

    public final void setCalled(boolean z) {
        this.called = z;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/login/source/network/model/EvUrlStatusResult$Companion;", "", "()V", "createNewHitEvUrl", "Lid/dana/data/login/source/network/model/EvUrlStatusResult;", "callTime", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final com_alibaba_ariver_app_api_ExtOpt$63$1 createNewHitEvUrl(long j) {
            return new com_alibaba_ariver_app_api_ExtOpt$63$1(j, true, false);
        }
    }

    public final int hashCode() {
        int hashCode = Long.valueOf(this.callTime).hashCode() * 31;
        boolean z = this.called;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.complete;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }
}
