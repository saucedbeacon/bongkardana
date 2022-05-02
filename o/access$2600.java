package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toQrUserBankModel", "Lid/dana/requestmoney/model/QrUserBankModel;", "Lid/dana/domain/qrbarcode/QrUserBankResult;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class access$2600 {
    @NotNull
    public static final access$2800 length(@NotNull GriverAppXInterceptor griverAppXInterceptor) {
        Intrinsics.checkNotNullParameter(griverAppXInterceptor, "$this$toQrUserBankModel");
        String qrCode = griverAppXInterceptor.getQrCode();
        if (qrCode == null) {
            qrCode = "";
        }
        return new access$2800(qrCode, griverAppXInterceptor.getExpireTimeInSecond(), griverAppXInterceptor.getExpireDateTimestamp());
    }
}
