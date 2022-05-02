package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o.SearchView;

public final class replaceText implements isLandscapeMode {
    public final SearchView.SavedState<PointF, PointF> getMax;
    public final onTextFocusChanged getMin;
    private final boolean length;
    public final String setMax;
    public final SearchView.SavedState<PointF, PointF> setMin;

    public replaceText(String str, SearchView.SavedState<PointF, PointF> savedState, SearchView.SavedState<PointF, PointF> savedState2, onTextFocusChanged ontextfocuschanged, boolean z) {
        this.setMax = str;
        this.getMax = savedState;
        this.setMin = savedState2;
        this.getMin = ontextfocuschanged;
        this.length = z;
    }

    public final boolean length() {
        return this.length;
    }

    public final animateToTab length(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime) {
        return new setSearchableInfo(lottieDrawable, onkeypreime, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.getMax);
        sb.append(", size=");
        sb.append(this.setMin);
        sb.append('}');
        return sb.toString();
    }
}
