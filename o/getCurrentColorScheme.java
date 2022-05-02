package o;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import o.createDialog;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/globalnetwork/source/mapper/parser/GeoCodeParser;", "", "()V", "getCountryCode", "", "geocoderResult", "Lid/dana/data/geocode/model/GeocoderResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCurrentColorScheme {
    @NotNull
    public static final getCurrentColorScheme INSTANCE = new getCurrentColorScheme();

    private getCurrentColorScheme() {
    }

    @NotNull
    public final String getCountryCode(@NotNull createDialog createdialog) {
        Intrinsics.checkNotNullParameter(createdialog, "geocoderResult");
        for (createDialog.length length : createdialog.getResults()[0].getAddress_components()) {
            if (ArraysKt.contains((T[]) length.getTypes(), "country")) {
                return length.getShort_name();
            }
        }
        return "";
    }
}
