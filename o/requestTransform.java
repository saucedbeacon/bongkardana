package o;

import com.iap.ac.config.lite.ConfigCenter;
import javax.inject.Inject;
import o.getPageSize;

public final class requestTransform implements getPageSize.setMin {
    private final copyBackForwardList getMax;
    private boolean getMin = false;
    private getPageSize.getMin setMax;

    @Inject
    public requestTransform(copyBackForwardList copybackforwardlist, getPageSize.getMin getmin) {
        this.getMax = copybackforwardlist;
        this.setMax = getmin;
    }

    public final void setMin() {
        boolean boolConfig = ConfigCenter.getInstance().getBoolConfig("feature_f2fpay_V2", false);
        this.getMin = boolConfig;
        this.setMax.length(Boolean.valueOf(boolConfig));
    }

    public final Boolean length() {
        return Boolean.valueOf(this.getMin);
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
