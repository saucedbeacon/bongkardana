package o;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
import o.SearchView;

public final class onVoiceClicked implements SearchView.SavedState<PointF, PointF> {
    private final List<setTitleMarginTop<PointF>> setMax;

    public onVoiceClicked() {
        this.setMax = Collections.singletonList(new setTitleMarginTop(new PointF(0.0f, 0.0f)));
    }

    public onVoiceClicked(List<setTitleMarginTop<PointF>> list) {
        this.setMax = list;
    }

    public final List<setTitleMarginTop<PointF>> setMin() {
        return this.setMax;
    }

    public final boolean getMin() {
        return this.setMax.size() == 1 && this.setMax.get(0).getMax();
    }

    public final setInputType<PointF, PointF> getMax() {
        if (this.setMax.get(0).getMax()) {
            return new getQueryHint(this.setMax);
        }
        return new setIconifiedByDefault(this.setMax);
    }
}
