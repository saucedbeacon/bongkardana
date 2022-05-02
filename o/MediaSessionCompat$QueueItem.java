package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import o.ParcelableVolumeInfo;

@RequiresApi(17)
public class MediaSessionCompat$QueueItem extends MediaSessionCompat$MediaSessionImplBase$MediaSessionStub {
    public void getMin() {
        ParcelableVolumeInfo.setMin = new ParcelableVolumeInfo.setMax() {
            public void setMax(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
