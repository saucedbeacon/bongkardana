package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u001a\u001a\u0010\b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\t"}, d2 = {"toBillerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "Lid/dana/domain/sendmoney/model/BillerX2B;", "customerNumber", "", "toConstrucUrlNewBank", "authCode", "uuid", "toConstrucUrlRecents", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class isVivoY11 {
    @NotNull
    public static final getCurrX setMax(@NotNull getExtraDataParsers getextradataparsers, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getextradataparsers, "$this$toBillerX2BModel");
        Intrinsics.checkNotNullParameter(str, "customerNumber");
        return new getCurrX(getextradataparsers.getBillerName(), getextradataparsers.getInstId(), getextradataparsers.getPrefix(), getextradataparsers.getClientId(), getextradataparsers.getRedirectUrl(), getextradataparsers.getScopes(), getextradataparsers.getAgreed(), str, 256);
    }
}
