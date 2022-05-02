package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import o.setScaleY;

public final class setChildrenConstraints implements setElevation<ByteBuffer, getViewWidget> {
    private static final setMin getMax = new setMin();
    private static final getMax setMin = new getMax();
    private final getTargetWidget IsOverlapping;
    private final List<ImageHeaderParser> getMin;
    private final Context length;
    private final setMin setMax;
    private final getMax toFloatRange;

    public setChildrenConstraints(Context context, List<ImageHeaderParser> list, rebuildScene rebuildscene, setOnHide setonhide) {
        this(context, list, rebuildscene, setonhide, getMax, setMin);
    }

    @VisibleForTesting
    private setChildrenConstraints(Context context, List<ImageHeaderParser> list, rebuildScene rebuildscene, setOnHide setonhide, setMin setmin, getMax getmax) {
        this.length = context.getApplicationContext();
        this.getMin = list;
        this.toFloatRange = getmax;
        this.IsOverlapping = new getTargetWidget(rebuildscene, setonhide);
        this.setMax = setmin;
    }

    /* access modifiers changed from: private */
    public boolean length(@NonNull ByteBuffer byteBuffer, @NonNull MotionHelper motionHelper) throws IOException {
        ImageHeaderParser.ImageType imageType;
        setTranslationX<Boolean> settranslationx = getPaddingWidth.length;
        if (((Boolean) (motionHelper.length.containsKey(settranslationx) ? motionHelper.length.get(settranslationx) : settranslationx.getMax)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.getMin;
        if (byteBuffer == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            imageType = setScaleY.setMin(list, new setScaleY.length(byteBuffer) {
                final /* synthetic */ ByteBuffer length;

                {
                    this.length = r1;
                }

                public final ImageHeaderParser.ImageType getMax(ImageHeaderParser imageHeaderParser) throws IOException {
                    return imageHeaderParser.setMax(this.length);
                }
            });
        }
        return imageType == ImageHeaderParser.ImageType.GIF;
    }

    /* access modifiers changed from: private */
    /* renamed from: setMax */
    public updateHierarchy getMax(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull MotionHelper motionHelper) {
        Layer min = this.setMax.setMin(byteBuffer);
        try {
            return getMax(byteBuffer, i, i2, min, motionHelper);
        } finally {
            this.setMax.getMax(min);
        }
    }

    @Nullable
    private updateHierarchy getMax(ByteBuffer byteBuffer, int i, int i2, Layer layer, MotionHelper motionHelper) {
        Bitmap.Config config;
        int i3;
        Layer layer2 = layer;
        MotionHelper motionHelper2 = motionHelper;
        long max = getDependencySortedChildren.setMax();
        try {
            if (layer2.length != null) {
                if (!layer.setMax()) {
                    layer.length();
                    if (!layer.setMax()) {
                        layer.setMin();
                        if (layer2.setMin.length < 0) {
                            layer2.setMin.getMin = 1;
                        }
                    }
                }
                setVerticalGap setverticalgap = layer2.setMin;
                if (setverticalgap.length > 0) {
                    if (setverticalgap.getMin == 0) {
                        setTranslationX<DecodeFormat> settranslationx = getPaddingWidth.setMax;
                        if ((motionHelper2.length.containsKey(settranslationx) ? motionHelper2.length.get(settranslationx) : settranslationx.getMax) == DecodeFormat.PREFER_RGB_565) {
                            config = Bitmap.Config.RGB_565;
                        } else {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        int min = Math.min(setverticalgap.toIntRange / i2, setverticalgap.isInside / i);
                        if (min == 0) {
                            i3 = 0;
                        } else {
                            i3 = Integer.highestOneBit(min);
                        }
                        setMaxElementsWrap setmaxelementswrap = new setMaxElementsWrap(this.IsOverlapping, setverticalgap, byteBuffer, Math.max(1, i3));
                        setmaxelementswrap.length(config);
                        setmaxelementswrap.getMax();
                        Bitmap equals = setmaxelementswrap.equals();
                        if (equals == null) {
                            if (Log.isLoggable("BufferGifDecoder", 2)) {
                                getDependencySortedChildren.length(max);
                            }
                            return null;
                        }
                        updateHierarchy updatehierarchy = new updateHierarchy(new getViewWidget(this.length, setmaxelementswrap, getBrightness.setMin(), i, i2, equals));
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            getDependencySortedChildren.length(max);
                        }
                        return updatehierarchy;
                    }
                }
                return null;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                getDependencySortedChildren.length(max);
            }
        }
    }

    @VisibleForTesting
    static class getMax {
        getMax() {
        }
    }

    @VisibleForTesting
    static class setMin {
        private final Queue<Layer> getMax = getDependents.length(0);

        setMin() {
        }

        /* access modifiers changed from: package-private */
        public final synchronized Layer setMin(ByteBuffer byteBuffer) {
            Layer poll;
            poll = this.getMax.poll();
            if (poll == null) {
                poll = new Layer();
            }
            poll.length = null;
            Arrays.fill(poll.setMax, (byte) 0);
            poll.setMin = new setVerticalGap();
            poll.getMin = 0;
            poll.length = byteBuffer.asReadOnlyBuffer();
            poll.length.position(0);
            poll.length.order(ByteOrder.LITTLE_ENDIAN);
            return poll;
        }

        /* access modifiers changed from: package-private */
        public final synchronized void getMax(Layer layer) {
            layer.length = null;
            layer.setMin = null;
            this.getMax.offer(layer);
        }
    }
}
