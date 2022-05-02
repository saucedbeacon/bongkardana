package o;

import id.dana.DanaApplication;
import java.util.List;

public final class isAdapterPositionUnknown implements RedDotManager {
    public static final isAdapterPositionUnknown getMin = new isAdapterPositionUnknown();

    public final void accept(Object obj) {
        DanaApplication.getMax((List) obj);
    }
}
