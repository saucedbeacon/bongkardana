package o;

import com.alipay.iap.android.common.utils.security.RSAHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/data/encryptcardno/EncryptCardNumber;", "", "()V", "CARD_NUMBER_JSON_KEY", "", "encrypt", "input", "publicKey", "encryptCardEnabled", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class parseFromJSON {
    @NotNull
    public static final parseFromJSON getMax = new parseFromJSON();

    private parseFromJSON() {
    }

    @JvmStatic
    @NotNull
    public static final String getMax(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "input");
        Intrinsics.checkNotNullParameter(str2, "publicKey");
        if (!z) {
            return "";
        }
        String encrypt = RSAHelper.encrypt(new JSONObject().put("cardNo", str).toString(), str2);
        Intrinsics.checkNotNullExpressionValue(encrypt, "RSAHelper.encrypt(inputI…on.toString(), publicKey)");
        return encrypt;
    }
}
