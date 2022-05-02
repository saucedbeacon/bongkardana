package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.RemoteCallResult;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lid/dana/data/recentrecipient/mapper/BankCardConversionMapper;", "", "()V", "transform", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "recentRecipient", "result", "Lid/dana/data/recentrecipient/model/BankCardConversionResult;", "Lid/dana/data/recentrecipient/model/BankCardConversionRequest;", "publicKey", "", "encryptCardEnabled", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ValueStore {
    @NotNull
    public final isError transform(@NotNull getMonitorToken getmonitortoken, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(getmonitortoken, "recentRecipient");
        Intrinsics.checkNotNullParameter(str, "publicKey");
        String number = getmonitortoken.getNumber();
        String replace$default = number != null ? StringsKt.replace$default(number, " ", "", false, 4, (Object) null) : null;
        if (replace$default == null) {
            replace$default = "";
        }
        String max = parseFromJSON.getMax(replace$default, str, z);
        if (max.length() > 0) {
            String id2 = getmonitortoken.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "recentRecipient.id");
            return new isError(max, "", id2);
        }
        String id3 = getmonitortoken.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "recentRecipient.id");
        return new isError("", replace$default, id3);
    }

    @NotNull
    public final getMonitorToken transform(@NotNull getMonitorToken getmonitortoken, @NotNull RemoteCallResult.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(getmonitortoken, "recentRecipient");
        Intrinsics.checkNotNullParameter(r3, "result");
        getmonitortoken.setNumber(r3.getFormattedMaskedCardNo());
        getmonitortoken.setCardIndexNo(r3.getCardIndexNo());
        return getmonitortoken;
    }
}
