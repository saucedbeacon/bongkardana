package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import o.IntRange;

public class PassportMaskView extends BaseMaskView {
    public PassportMaskView(Context context) {
        super(context);
    }

    public PassportMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PassportMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public List<BaseMaskView.AbsMaskDrawer> getCoverDrawer(int i, int i2) {
        return toList(new BaseMaskView.CoverMaskDrawer(createCoverPath()));
    }

    /* access modifiers changed from: protected */
    public List<BaseMaskView.AbsMaskDrawer> getFrameDrawer(int i, int i2) {
        return toList(new BaseMaskView.FrameMaskDrawer(createFramePath()));
    }

    private Path createCoverPath() {
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 30.0f, 30.0f, Path.Direction.CCW);
        return path;
    }

    private Path createFramePath() {
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 30.0f, 30.0f, Path.Direction.CCW);
        float height = this.mCaptureRect.top + (this.mCaptureRect.height() / 2.0f);
        path.moveTo(this.mCaptureRect.left, height);
        path.lineTo(this.mCaptureRect.right, height);
        float height2 = this.mCaptureRect.top + ((this.mCaptureRect.height() * 388.0f) / 448.0f);
        path.moveTo(this.mCaptureRect.left, height2);
        path.lineTo(this.mCaptureRect.right, height2);
        return path;
    }

    /* access modifiers changed from: protected */
    public RectF calcCaptureRect(int i, int i2) {
        double d = (double) i;
        Double.isNaN(d);
        int i3 = (int) (0.1d * d);
        Double.isNaN(d);
        int i4 = (int) (0.9d * d);
        double d2 = (double) i2;
        Double.isNaN(d2);
        int i5 = (int) (0.15d * d2);
        double d3 = (double) i5;
        Double.isNaN(d);
        Double.isNaN(d3);
        int i6 = (int) (d3 + (((d * 0.8d) * 448.0d) / 315.0d));
        if (getInvisibleHeight() + i6 > getHeight()) {
            double height = (double) (getHeight() - getInvisibleHeight());
            Double.isNaN(d2);
            Double.isNaN(height);
            i6 = (int) (height - (d2 * 0.05d));
            int i7 = (int) (((float) ((i6 - i5) * 315)) / 448.0f);
            int width = (int) (((float) (getWidth() - i7)) / 2.0f);
            i4 = width + i7;
            i3 = width;
        }
        return new RectF((float) i3, (float) i5, (float) i4, (float) i6);
    }

    public int getTipsBottomMargin() {
        double height = (double) getHeight();
        Double.isNaN(height);
        return (int) (height * 0.85d);
    }

    class MRZMarkDrawer extends BaseMaskView.AbsMaskDrawer {
        public MRZMarkDrawer(Path path) {
            super(path);
        }

        public void draw(Canvas canvas, Paint paint) {
            canvas.save();
            canvas.clipPath(this.mPath, Region.Op.INTERSECT);
            canvas.drawColor(IntRange.setMax(PassportMaskView.this.getContext(), R.color.z_white_50));
            canvas.restore();
        }
    }
}
