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

public class MRZMaskView extends BaseMaskView {
    public static final float[] BOTTOM_RADII = {0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 30.0f, 30.0f, 30.0f};
    public static final float ROUND_CORNER = 30.0f;

    public MRZMaskView(Context context) {
        super(context);
    }

    public MRZMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MRZMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public List<BaseMaskView.AbsMaskDrawer> getCoverDrawer(int i, int i2) {
        return toList(new BaseMaskView.CoverMaskDrawer(createPath()), new MRZMarkDrawer(createWriteCoverPath()));
    }

    /* access modifiers changed from: protected */
    public List<BaseMaskView.AbsMaskDrawer> getFrameDrawer(int i, int i2) {
        return toList(new BaseMaskView.FrameMaskDrawer(createFramePath()));
    }

    /* access modifiers changed from: protected */
    public RectF calcCaptureRect(int i, int i2) {
        float f = (float) i;
        float f2 = f * 0.95f;
        float f3 = (float) ((int) (((float) i2) * 0.2f));
        return new RectF((float) ((int) (0.05f * f)), f3, (float) ((int) f2), (float) ((int) (((f2 * 500.0f) / 712.0f) + f3)));
    }

    private Path createWriteCoverPath() {
        RectF rectF = new RectF(this.mCaptureRect);
        rectF.top = this.mCaptureRect.top + (this.mCaptureRect.height() * 0.75f);
        Path path = new Path();
        path.addRoundRect(rectF, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    private Path createFramePath() {
        Path path = new Path();
        float height = this.mCaptureRect.top + (this.mCaptureRect.height() * 0.75f);
        path.moveTo(this.mCaptureRect.left, height);
        path.lineTo(this.mCaptureRect.right, height);
        path.addRoundRect(this.mCaptureRect, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    private Path createPath() {
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    class MRZMarkDrawer extends BaseMaskView.AbsMaskDrawer {
        public MRZMarkDrawer(Path path) {
            super(path);
        }

        public void draw(Canvas canvas, Paint paint) {
            canvas.save();
            canvas.clipPath(this.mPath, Region.Op.INTERSECT);
            canvas.drawColor(IntRange.setMax(MRZMaskView.this.getContext(), R.color.z_white_50));
            canvas.restore();
        }
    }
}
