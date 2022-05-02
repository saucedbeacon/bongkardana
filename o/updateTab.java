package o;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import o.SearchView;
import o.setInputType;

public final class updateTab implements setImeOptions, setInputType.getMin, onNothingSelected {
    private final String getMax;
    private final LottieDrawable getMin;
    private final SearchView.SearchAutoComplete isInside;
    private final Path length = new Path();
    private final setInputType<?, PointF> setMax;
    private final setInputType<?, PointF> setMin;
    private addTab toFloatRange = new addTab();
    private boolean toIntRange;

    public updateTab(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, SearchView.SearchAutoComplete searchAutoComplete) {
        this.getMax = searchAutoComplete.length;
        this.getMin = lottieDrawable;
        this.setMax = new getQueryHint(searchAutoComplete.setMax.setMin);
        this.setMin = searchAutoComplete.getMin.getMax();
        this.isInside = searchAutoComplete;
        setInputType<?, PointF> setinputtype = this.setMax;
        if (setinputtype != null) {
            onkeypreime.setMax.add(setinputtype);
        }
        setInputType<?, PointF> setinputtype2 = this.setMin;
        if (setinputtype2 != null) {
            onkeypreime.setMax.add(setinputtype2);
        }
        this.setMax.getMin.add(this);
        this.setMin.getMin.add(this);
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        for (int i = 0; i < list.size(); i++) {
            animateToTab animatetotab = list.get(i);
            if (animatetotab instanceof getImeOptions) {
                getImeOptions getimeoptions = (getImeOptions) animatetotab;
                if (getimeoptions.setMin == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.toFloatRange.setMin.add(getimeoptions);
                    getimeoptions.length.add(this);
                }
            }
        }
    }

    public final String setMin() {
        return this.getMax;
    }

    public final Path getMax() {
        if (this.toIntRange) {
            return this.length;
        }
        this.length.reset();
        if (this.isInside.setMin()) {
            this.toIntRange = true;
            return this.length;
        }
        PointF equals = this.setMax.equals();
        float f = equals.x / 2.0f;
        float f2 = equals.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.length.reset();
        if (this.isInside.length()) {
            float f5 = -f2;
            this.length.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.length.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.length.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.length.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.length.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.length.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.length.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.length.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.length.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.length.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF equals2 = this.setMin.equals();
        this.length.offset(equals2.x, equals2.y);
        this.length.close();
        this.toFloatRange.getMin(this.length);
        this.toIntRange = true;
        return this.length;
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        getTitleMarginTop.getMin(setmaxwidth, i, list, setmaxwidth2, this);
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        if (t == MenuPopupWindow$MenuDropDownListView.isInside) {
            this.setMax.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.toDoubleRange) {
            this.setMin.getMin(settitlemarginbottom);
        }
    }

    public final void setMax() {
        this.toIntRange = false;
        this.getMin.invalidateSelf();
    }
}
