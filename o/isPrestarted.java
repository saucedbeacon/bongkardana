package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/data/ott/OttVerifyEntity;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "userId", "", "merchantId", "needLogout", "", "mobileNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getMobileNo", "setMobileNo", "getNeedLogout", "()Ljava/lang/Boolean;", "setNeedLogout", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getUserId", "setUserId", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isPrestarted extends BaseRpcResult {
    @Nullable
    private String merchantId;
    @Nullable
    private String mobileNo;
    @Nullable
    private Boolean needLogout;
    @Nullable
    private String userId;

    public isPrestarted() {
        this((String) null, (String) null, (Boolean) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isPrestarted(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str3);
    }

    @Nullable
    public final Boolean getNeedLogout() {
        return this.needLogout;
    }

    public final void setNeedLogout(@Nullable Boolean bool) {
        this.needLogout = bool;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final void setMobileNo(@Nullable String str) {
        this.mobileNo = str;
    }

    public isPrestarted(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        this.userId = str;
        this.merchantId = str2;
        this.needLogout = bool;
        this.mobileNo = str3;
    }
}
