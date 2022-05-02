package o;

import kotlin.jvm.functions.Function1;

final class isCustom implements Function1 {
    private final jetifyAs length;
    private final String setMin;

    public isCustom(jetifyAs jetifyas, String str) {
        this.length = jetifyas;
        this.setMin = str;
    }

    public final Object invoke(Object obj) {
        return jetifyAs.setMax(this.length, this.setMin, (DiskUtil) obj);
    }
}
