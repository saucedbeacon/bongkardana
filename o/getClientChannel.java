package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/data/sendmoney/repository/source/network/request/WithdrawInitRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "needCertifiedUser", "", "payMethod", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getNeedCertifiedUser", "()Ljava/lang/Boolean;", "setNeedCertifiedUser", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPayMethod", "()Ljava/lang/String;", "setPayMethod", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lid/dana/data/sendmoney/repository/source/network/request/WithdrawInitRequest;", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getClientChannel extends BaseRpcRequest {
    @Nullable
    private Boolean needCertifiedUser;
    @Nullable
    private String payMethod;

    public static /* synthetic */ getClientChannel copy$default(getClientChannel getclientchannel, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = getclientchannel.needCertifiedUser;
        }
        if ((i & 2) != 0) {
            str = getclientchannel.payMethod;
        }
        return getclientchannel.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.needCertifiedUser;
    }

    @Nullable
    public final String component2() {
        return this.payMethod;
    }

    @NotNull
    public final getClientChannel copy(@Nullable Boolean bool, @Nullable String str) {
        return new getClientChannel(bool, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClientChannel)) {
            return false;
        }
        getClientChannel getclientchannel = (getClientChannel) obj;
        return Intrinsics.areEqual((Object) this.needCertifiedUser, (Object) getclientchannel.needCertifiedUser) && Intrinsics.areEqual((Object) this.payMethod, (Object) getclientchannel.payMethod);
    }

    public final int hashCode() {
        Boolean bool = this.needCertifiedUser;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.payMethod;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawInitRequest(needCertifiedUser=");
        sb.append(this.needCertifiedUser);
        sb.append(", payMethod=");
        sb.append(this.payMethod);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final Boolean getNeedCertifiedUser() {
        return this.needCertifiedUser;
    }

    public final void setNeedCertifiedUser(@Nullable Boolean bool) {
        this.needCertifiedUser = bool;
    }

    @Nullable
    public final String getPayMethod() {
        return this.payMethod;
    }

    public final void setPayMethod(@Nullable String str) {
        this.payMethod = str;
    }

    public getClientChannel(@Nullable Boolean bool, @Nullable String str) {
        this.needCertifiedUser = bool;
        this.payMethod = str;
    }
}
