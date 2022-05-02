package o;

import id.dana.sendmoney.recipient.RecipientType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/mapper/PayMethodMapper;", "", "()V", "toTransferType", "", "recipientType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class forceFinished {
    @NotNull
    public static final forceFinished setMin = new forceFinished();

    private forceFinished() {
    }

    @NotNull
    public static String setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "recipientType");
        int hashCode = str.hashCode();
        if (hashCode == 110366) {
            return str.equals(RecipientType.OTC) ? "OTC" : "BANK_TRANSFER";
        }
        if (hashCode != 3321850) {
            if (hashCode == 951526432 && str.equals("contact")) {
                return "BALANCE";
            }
            return "BANK_TRANSFER";
        } else if (str.equals("link")) {
            return "LINK";
        } else {
            return "BANK_TRANSFER";
        }
    }
}
