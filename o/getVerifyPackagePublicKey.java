package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

final class getVerifyPackagePublicKey implements Function1 {
    private final List getMax;
    private final BLEServiceUnit length;

    public getVerifyPackagePublicKey(BLEServiceUnit bLEServiceUnit, List list) {
        this.length = bLEServiceUnit;
        this.getMax = list;
    }

    public final Object invoke(Object obj) {
        return BLEServiceUnit.length(this.length, this.getMax, (String) obj);
    }
}
