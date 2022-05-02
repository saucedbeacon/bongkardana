package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import o.PlaybackStateCompat;

@RequiresApi(21)
public class MediaSessionCompat$ResultReceiverWrapper implements PlaybackStateCompat.Actions {
    public void getMin() {
    }

    public void getMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        mediaSessionCompat$SessionFlags.setMin(new PlaybackStateCompat.CustomAction(colorStateList, f));
        View max = mediaSessionCompat$SessionFlags.getMax();
        max.setClipToOutline(true);
        max.setElevation(f2);
        setMin(mediaSessionCompat$SessionFlags, f3);
    }

    public void length(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f) {
        isInside(mediaSessionCompat$SessionFlags).setMax(f);
    }

    public void setMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f) {
        isInside(mediaSessionCompat$SessionFlags).getMax(f, mediaSessionCompat$SessionFlags.length(), mediaSessionCompat$SessionFlags.setMax());
        toFloatRange(mediaSessionCompat$SessionFlags);
    }

    public float getMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).getMax();
    }

    public float setMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return setMin(mediaSessionCompat$SessionFlags) * 2.0f;
    }

    public float getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return setMin(mediaSessionCompat$SessionFlags) * 2.0f;
    }

    public float setMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).setMin();
    }

    public void getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f) {
        mediaSessionCompat$SessionFlags.getMax().setElevation(f);
    }

    public float length(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return mediaSessionCompat$SessionFlags.getMax().getElevation();
    }

    public void toFloatRange(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        if (!mediaSessionCompat$SessionFlags.length()) {
            mediaSessionCompat$SessionFlags.getMin(0, 0, 0, 0);
            return;
        }
        float max = getMax(mediaSessionCompat$SessionFlags);
        float min = setMin(mediaSessionCompat$SessionFlags);
        int ceil = (int) Math.ceil((double) ParcelableVolumeInfo.getMin(max, min, mediaSessionCompat$SessionFlags.setMax()));
        int ceil2 = (int) Math.ceil((double) ParcelableVolumeInfo.getMax(max, min, mediaSessionCompat$SessionFlags.setMax()));
        mediaSessionCompat$SessionFlags.getMin(ceil, ceil2, ceil, ceil2);
    }

    public void toIntRange(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        setMin(mediaSessionCompat$SessionFlags, getMax(mediaSessionCompat$SessionFlags));
    }

    public void equals(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        setMin(mediaSessionCompat$SessionFlags, getMax(mediaSessionCompat$SessionFlags));
    }

    public void getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, @Nullable ColorStateList colorStateList) {
        isInside(mediaSessionCompat$SessionFlags).getMax(colorStateList);
    }

    public ColorStateList IsOverlapping(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return isInside(mediaSessionCompat$SessionFlags).getMin();
    }

    private PlaybackStateCompat.CustomAction isInside(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags) {
        return (PlaybackStateCompat.CustomAction) mediaSessionCompat$SessionFlags.getMin();
    }
}
