package o;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o.setTranslationX;

public final class setDesignInformation<T> implements setElevation<T, Bitmap> {
    private static final setMax getMax = new setMax();
    public static final setTranslationX<Integer> setMax = setTranslationX.setMax("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new setTranslationX.getMax<Integer>() {
        private final ByteBuffer getMin = ByteBuffer.allocate(4);

        public final /* synthetic */ void length(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.getMin) {
                    this.getMin.position(0);
                    messageDigest.update(this.getMin.putInt(num.intValue()).array());
                }
            }
        }
    });
    public static final setTranslationX<Long> setMin = setTranslationX.setMax("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new setTranslationX.getMax<Long>() {
        private final ByteBuffer setMax = ByteBuffer.allocate(8);

        public final /* synthetic */ void length(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.setMax) {
                this.setMax.position(0);
                messageDigest.update(this.setMax.putLong(l.longValue()).array());
            }
        }
    });
    private final rebuildScene getMin;
    private final setMax isInside;
    private final getMin<T> length;

    @VisibleForTesting
    interface getMin<T> {
        void setMin(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public final boolean length(@NonNull T t, @NonNull MotionHelper motionHelper) {
        return true;
    }

    public static setElevation<AssetFileDescriptor, Bitmap> getMax(rebuildScene rebuildscene) {
        return new setDesignInformation(rebuildscene, new getMax((byte) 0));
    }

    public static setElevation<ParcelFileDescriptor, Bitmap> getMin(rebuildScene rebuildscene) {
        return new setDesignInformation(rebuildscene, new setMin());
    }

    @RequiresApi(api = 23)
    public static setElevation<ByteBuffer, Bitmap> setMin(rebuildScene rebuildscene) {
        return new setDesignInformation(rebuildscene, new length());
    }

    private setDesignInformation(rebuildScene rebuildscene, getMin<T> getmin) {
        this(rebuildscene, getmin, getMax);
    }

    @VisibleForTesting
    private setDesignInformation(rebuildScene rebuildscene, getMin<T> getmin, setMax setmax) {
        this.getMin = rebuildscene;
        this.length = getmin;
        this.isInside = setmax;
    }

    public final fireTrigger<Bitmap> getMax(@NonNull T t, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        Bitmap bitmap;
        setTranslationX<Long> settranslationx = setMin;
        long longValue = ((Long) (motionHelper.length.containsKey(settranslationx) ? motionHelper.length.get(settranslationx) : settranslationx.getMax)).longValue();
        if (longValue >= 0 || longValue == -1) {
            setTranslationX<Integer> settranslationx2 = setMax;
            Integer num = (Integer) (motionHelper.length.containsKey(settranslationx2) ? motionHelper.length.get(settranslationx2) : settranslationx2.getMax);
            if (num == null) {
                num = 2;
            }
            setTranslationX<DownsampleStrategy> settranslationx3 = DownsampleStrategy.IsOverlapping;
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) (motionHelper.length.containsKey(settranslationx3) ? motionHelper.length.get(settranslationx3) : settranslationx3.getMax);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.equals;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.length.setMin(mediaMetadataRetriever, t);
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT < 27 || i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || downsampleStrategy2 == DownsampleStrategy.toFloatRange) {
                    bitmap = null;
                } else {
                    bitmap = getMin(mediaMetadataRetriever, longValue, intValue, i, i2, downsampleStrategy2);
                }
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                mediaMetadataRetriever.release();
                rebuildScene rebuildscene = this.getMin;
                if (bitmap == null) {
                    return null;
                }
                return new getType(bitmap, rebuildscene);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: ".concat(String.valueOf(longValue)));
        }
    }

    @TargetApi(27)
    private static Bitmap getMin(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float min = downsampleStrategy.setMin(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * min), Math.round(min * ((float) parseInt2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    static class setMax {
        setMax() {
        }
    }

    static final class getMax implements getMin<AssetFileDescriptor> {
        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }

        public final /* synthetic */ void setMin(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class setMin implements getMin<ParcelFileDescriptor> {
        setMin() {
        }

        public final /* synthetic */ void setMin(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    @RequiresApi(23)
    static final class length implements getMin<ByteBuffer> {
        public final /* synthetic */ void setMin(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            final ByteBuffer byteBuffer = (ByteBuffer) obj;
            mediaMetadataRetriever.setDataSource(new MediaDataSource() {
                public final void close() {
                }

                public final int readAt(long j, byte[] bArr, int i, int i2) {
                    if (j >= ((long) byteBuffer.limit())) {
                        return -1;
                    }
                    byteBuffer.position((int) j);
                    int min = Math.min(i2, byteBuffer.remaining());
                    byteBuffer.get(bArr, i, min);
                    return min;
                }

                public final long getSize() {
                    return (long) byteBuffer.limit();
                }
            });
        }

        length() {
        }
    }
}
