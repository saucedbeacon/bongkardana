package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0003\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/response/BaseLoyaltyResponse;", "T", "", "body", "resultInfo", "Lid/dana/data/loyalty/repository/source/network/response/LoyaltyResultInfo;", "(Ljava/lang/Object;Lid/dana/data/loyalty/repository/source/network/response/LoyaltyResultInfo;)V", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getResultInfo", "()Lid/dana/data/loyalty/repository/source/network/response/LoyaltyResultInfo;", "setResultInfo", "(Lid/dana/data/loyalty/repository/source/network/response/LoyaltyResultInfo;)V", "component1", "component2", "copy", "(Ljava/lang/Object;Lid/dana/data/loyalty/repository/source/network/response/LoyaltyResultInfo;)Lid/dana/data/loyalty/repository/source/network/response/BaseLoyaltyResponse;", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$89$1<T> {
    private T body;
    @Nullable
    private com_alibaba_ariver_app_api_ExtOpt$86$1 resultInfo;

    public static /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$89$1 copy$default(com_alibaba_ariver_app_api_ExtOpt$89$1 com_alibaba_ariver_app_api_extopt_89_1, T t, com_alibaba_ariver_app_api_ExtOpt$86$1 com_alibaba_ariver_app_api_extopt_86_1, int i, Object obj) {
        if ((i & 1) != 0) {
            t = com_alibaba_ariver_app_api_extopt_89_1.body;
        }
        if ((i & 2) != 0) {
            com_alibaba_ariver_app_api_extopt_86_1 = com_alibaba_ariver_app_api_extopt_89_1.resultInfo;
        }
        return com_alibaba_ariver_app_api_extopt_89_1.copy(t, com_alibaba_ariver_app_api_extopt_86_1);
    }

    public final T component1() {
        return this.body;
    }

    @Nullable
    public final com_alibaba_ariver_app_api_ExtOpt$86$1 component2() {
        return this.resultInfo;
    }

    @NotNull
    public final com_alibaba_ariver_app_api_ExtOpt$89$1<T> copy(T t, @Nullable com_alibaba_ariver_app_api_ExtOpt$86$1 com_alibaba_ariver_app_api_extopt_86_1) {
        return new com_alibaba_ariver_app_api_ExtOpt$89$1<>(t, com_alibaba_ariver_app_api_extopt_86_1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com_alibaba_ariver_app_api_ExtOpt$89$1)) {
            return false;
        }
        com_alibaba_ariver_app_api_ExtOpt$89$1 com_alibaba_ariver_app_api_extopt_89_1 = (com_alibaba_ariver_app_api_ExtOpt$89$1) obj;
        return Intrinsics.areEqual((Object) this.body, (Object) com_alibaba_ariver_app_api_extopt_89_1.body) && Intrinsics.areEqual((Object) this.resultInfo, (Object) com_alibaba_ariver_app_api_extopt_89_1.resultInfo);
    }

    public final int hashCode() {
        T t = this.body;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        com_alibaba_ariver_app_api_ExtOpt$86$1 com_alibaba_ariver_app_api_extopt_86_1 = this.resultInfo;
        if (com_alibaba_ariver_app_api_extopt_86_1 != null) {
            i = com_alibaba_ariver_app_api_extopt_86_1.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLoyaltyResponse(body=");
        sb.append(this.body);
        sb.append(", resultInfo=");
        sb.append(this.resultInfo);
        sb.append(")");
        return sb.toString();
    }

    public com_alibaba_ariver_app_api_ExtOpt$89$1(T t, @Nullable com_alibaba_ariver_app_api_ExtOpt$86$1 com_alibaba_ariver_app_api_extopt_86_1) {
        this.body = t;
        this.resultInfo = com_alibaba_ariver_app_api_extopt_86_1;
    }

    public final T getBody() {
        return this.body;
    }

    public final void setBody(T t) {
        this.body = t;
    }

    @Nullable
    public final com_alibaba_ariver_app_api_ExtOpt$86$1 getResultInfo() {
        return this.resultInfo;
    }

    public final void setResultInfo(@Nullable com_alibaba_ariver_app_api_ExtOpt$86$1 com_alibaba_ariver_app_api_extopt_86_1) {
        this.resultInfo = com_alibaba_ariver_app_api_extopt_86_1;
    }
}
