package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0003\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/request/BaseLoyaltyRequest;", "T", "", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "setBody", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lid/dana/data/loyalty/repository/source/network/request/BaseLoyaltyRequest;", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$85$1<T> {
    private T body;

    public static /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$85$1 copy$default(com_alibaba_ariver_app_api_ExtOpt$85$1 com_alibaba_ariver_app_api_extopt_85_1, T t, int i, Object obj) {
        if ((i & 1) != 0) {
            t = com_alibaba_ariver_app_api_extopt_85_1.body;
        }
        return com_alibaba_ariver_app_api_extopt_85_1.copy(t);
    }

    public final T component1() {
        return this.body;
    }

    @NotNull
    public final com_alibaba_ariver_app_api_ExtOpt$85$1<T> copy(T t) {
        return new com_alibaba_ariver_app_api_ExtOpt$85$1<>(t);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof com_alibaba_ariver_app_api_ExtOpt$85$1) && Intrinsics.areEqual((Object) this.body, (Object) ((com_alibaba_ariver_app_api_ExtOpt$85$1) obj).body);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.body;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLoyaltyRequest(body=");
        sb.append(this.body);
        sb.append(")");
        return sb.toString();
    }

    public com_alibaba_ariver_app_api_ExtOpt$85$1(T t) {
        this.body = t;
    }

    public final T getBody() {
        return this.body;
    }

    public final void setBody(T t) {
        this.body = t;
    }
}
