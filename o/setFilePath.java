package o;

import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.MoneyView;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lid/dana/data/statement/repository/source/network/response/UserAccumulateSummary;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "bizType", "", "description", "amount", "Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;", "(Ljava/lang/String;Ljava/lang/String;Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;)V", "getAmount", "()Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;", "setAmount", "(Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;)V", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "getDescription", "setDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFilePath extends BaseRpcResult {
    @NotNull
    private MoneyView amount;
    @NotNull
    private String bizType;
    @NotNull
    private String description;

    public setFilePath() {
        this((String) null, (String) null, (MoneyView) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setFilePath copy$default(setFilePath setfilepath, String str, String str2, MoneyView moneyView, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setfilepath.bizType;
        }
        if ((i & 2) != 0) {
            str2 = setfilepath.description;
        }
        if ((i & 4) != 0) {
            moneyView = setfilepath.amount;
        }
        return setfilepath.copy(str, str2, moneyView);
    }

    @NotNull
    public final String component1() {
        return this.bizType;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final MoneyView component3() {
        return this.amount;
    }

    @NotNull
    public final setFilePath copy(@NotNull String str, @NotNull String str2, @NotNull MoneyView moneyView) {
        Intrinsics.checkNotNullParameter(str, "bizType");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(moneyView, "amount");
        return new setFilePath(str, str2, moneyView);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFilePath)) {
            return false;
        }
        setFilePath setfilepath = (setFilePath) obj;
        return Intrinsics.areEqual((Object) this.bizType, (Object) setfilepath.bizType) && Intrinsics.areEqual((Object) this.description, (Object) setfilepath.description) && Intrinsics.areEqual((Object) this.amount, (Object) setfilepath.amount);
    }

    public final int hashCode() {
        String str = this.bizType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MoneyView moneyView = this.amount;
        if (moneyView != null) {
            i = moneyView.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAccumulateSummary(bizType=");
        sb.append(this.bizType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizType = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setFilePath(String str, String str2, MoneyView moneyView, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new MoneyView() : moneyView);
    }

    @NotNull
    public final MoneyView getAmount() {
        return this.amount;
    }

    public final void setAmount(@NotNull MoneyView moneyView) {
        Intrinsics.checkNotNullParameter(moneyView, "<set-?>");
        this.amount = moneyView;
    }

    public setFilePath(@NotNull String str, @NotNull String str2, @NotNull MoneyView moneyView) {
        Intrinsics.checkNotNullParameter(str, "bizType");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(moneyView, "amount");
        this.bizType = str;
        this.description = str2;
        this.amount = moneyView;
    }
}
