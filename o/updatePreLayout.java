package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import o.setAllowsGoneWidget;
import o.setIds;

public final class updatePreLayout implements setElevation<InputStream, Bitmap> {
    private final setOnHide length;
    private final setAllowsGoneWidget setMax;

    public final /* bridge */ /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return true;
    }

    public updatePreLayout(setAllowsGoneWidget setallowsgonewidget, setOnHide setonhide) {
        this.setMax = setallowsgonewidget;
        this.length = setonhide;
    }

    /* access modifiers changed from: private */
    /* renamed from: length */
    public fireTrigger<Bitmap> getMax(@NonNull InputStream inputStream, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        setReferenceTags setreferencetags;
        boolean z;
        if (inputStream instanceof setReferenceTags) {
            setreferencetags = (setReferenceTags) inputStream;
            z = false;
        } else {
            setreferencetags = new setReferenceTags(inputStream, this.length);
            z = true;
        }
        offsetChildByInset max = offsetChildByInset.setMax(setreferencetags);
        dispatchDependentViewsChanged dispatchdependentviewschanged = new dispatchDependentViewsChanged(max);
        getMin getmin = new getMin(setreferencetags, max);
        try {
            setAllowsGoneWidget setallowsgonewidget = this.setMax;
            return setallowsgonewidget.setMax(new setIds.getMin(dispatchdependentviewschanged, setallowsgonewidget.IsOverlapping, setallowsgonewidget.toIntRange), i, i2, motionHelper, getmin);
        } finally {
            max.setMax();
            if (z) {
                setreferencetags.setMin();
            }
        }
    }

    static class getMin implements setAllowsGoneWidget.length {
        private final offsetChildByInset setMax;
        private final setReferenceTags setMin;

        getMin(setReferenceTags setreferencetags, offsetChildByInset offsetchildbyinset) {
            this.setMin = setreferencetags;
            this.setMax = offsetchildbyinset;
        }

        public final void setMin() {
            this.setMin.getMin();
        }

        public final void length(rebuildScene rebuildscene, Bitmap bitmap) throws IOException {
            IOException iOException = this.setMax.length;
            if (iOException != null) {
                if (bitmap != null) {
                    rebuildscene.setMin(bitmap);
                }
                throw iOException;
            }
        }
    }
}
