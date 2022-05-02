package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import id.dana.showcase.ActionType;
import id.dana.showcase.view.SimpleContentView;
import o.PhotoView;

public class getRect extends getValidShowingPhoto {
    private final setUseAmcsLite setMin;

    public final /* bridge */ /* synthetic */ PhotoView.PhotoInter getMax() {
        return super.getMax();
    }

    public final /* bridge */ /* synthetic */ void setMax() {
        super.setMax();
    }

    public final /* bridge */ /* synthetic */ void setMin(@ActionType int i) {
        super.setMin(i);
    }

    getRect(onLongPress onlongpress, Activity activity, setUseAmcsLite setuseamcslite, PhotoView.FlingRunnable flingRunnable) {
        super(onlongpress, activity, flingRunnable);
        this.setMin = setuseamcslite;
    }

    getRect(onLongPress onlongpress, Activity activity, setUseAmcsLite setuseamcslite, PhotoView.FlingRunnable flingRunnable, boolean z, boolean z2) {
        super(onlongpress, activity, flingRunnable, z, z2);
        this.setMin = setuseamcslite;
    }

    /* access modifiers changed from: protected */
    public final setUseAmcsLite length() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    public View getMin() {
        SimpleContentView simpleContentView = new SimpleContentView((Context) this.setMax.get(), this.setMin.setMax);
        simpleContentView.setOnSimpleContentActionListener(new PhotoView.ScaleListener(this));
        simpleContentView.setButtonText(((calInterpolate) this.length).IsOverlapping);
        simpleContentView.setButtonContentDescription(((calInterpolate) this.length).equals);
        return simpleContentView;
    }

    /* access modifiers changed from: protected */
    public final void setMin() {
        length(this.setMin);
    }

    /* access modifiers changed from: protected */
    public final boolean IsOverlapping() {
        return super.IsOverlapping() || this.setMin == null;
    }
}
