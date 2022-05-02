package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class setAutoShow implements Callable {
    private final String getMin;

    public setAutoShow(String str) {
        this.getMin = str;
    }

    public final Object call() {
        return ConfigCenter.getInstance().getSectionConfig(this.getMin);
    }
}
