package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import o.ParcelableVolumeInfo;
import o.PlaybackStateCompat;

public class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub implements PlaybackStateCompat.Actions {
    final RectF setMin = new RectF();

    public void toIntRange(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
    }

    public void getMin() {
        ParcelableVolumeInfo.setMin = new ParcelableVolumeInfo.setMax() {
            public final void setMax(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.this.setMin.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    Paint paint2 = paint;
                    canvas.drawArc(MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.this.setMin, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.this.setMin, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.this.setMin, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.this.setMin, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint2);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint2);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    public void getMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        ParcelableVolumeInfo max = setMax(context, colorStateList, f, f2, f3);
        max.toFloatRange = mediaSessionCompat$SessionFlags.setMax();
        max.invalidateSelf();
        mediaSessionCompat$SessionFlags.setMin(max);
        toFloatRange(mediaSessionCompat$SessionFlags);
    }

    private ParcelableVolumeInfo setMax(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new ParcelableVolumeInfo(context.getResources(), colorStateList, f, f2, f3);
    }

    public void toFloatRange(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        Rect rect = new Rect();
        isInside(mediaSessionCompat$SessionFlags).getPadding(rect);
        mediaSessionCompat$SessionFlags.getMin((int) Math.ceil((double) setMax(mediaSessionCompat$SessionFlags)), (int) Math.ceil((double) getMin(mediaSessionCompat$SessionFlags)));
        mediaSessionCompat$SessionFlags.getMin(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void equals(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        isInside.toFloatRange = mediaSessionCompat$SessionFlags.setMax();
        isInside.invalidateSelf();
        toFloatRange(mediaSessionCompat$SessionFlags);
    }

    public void getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, @Nullable ColorStateList colorStateList) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        isInside.getMax(colorStateList);
        isInside.invalidateSelf();
    }

    public ColorStateList IsOverlapping(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).toIntRange;
    }

    public void length(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (isInside.getMin != f2) {
                isInside.getMin = f2;
                isInside.isInside = true;
                isInside.invalidateSelf();
            }
            toFloatRange(mediaSessionCompat$SessionFlags);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public float setMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).getMin;
    }

    public void getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        isInside.getMin(f, isInside.getMax);
    }

    public float length(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).length;
    }

    public void setMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        isInside.getMin(isInside.length, f);
        toFloatRange(mediaSessionCompat$SessionFlags);
    }

    public float getMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).getMax;
    }

    public float setMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        return (Math.max(isInside.getMax, isInside.getMin + ((float) isInside.setMax) + (isInside.getMax / 2.0f)) * 2.0f) + ((isInside.getMax + ((float) isInside.setMax)) * 2.0f);
    }

    public float getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        ParcelableVolumeInfo isInside = isInside(mediaSessionCompat$SessionFlags);
        return (Math.max(isInside.getMax, isInside.getMin + ((float) isInside.setMax) + ((isInside.getMax * 1.5f) / 2.0f)) * 2.0f) + (((isInside.getMax * 1.5f) + ((float) isInside.setMax)) * 2.0f);
    }

    private ParcelableVolumeInfo isInside(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return (ParcelableVolumeInfo) mediaSessionCompat$SessionFlags.getMin();
    }
}
