package o;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.EncoderThread;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(api = 18)
public class didChildRangeChange {
    public static final CameraLogger getMax;
    private static final String getMin;
    /* access modifiers changed from: private */
    public final Object IsOverlapping = new Object();
    /* access modifiers changed from: private */
    public boolean equals = false;
    private int isInside = 0;
    /* access modifiers changed from: private */
    public MediaMuxer length;
    public final List<dispatchLayoutStep3> setMax = new ArrayList();
    private int setMin = 0;
    /* access modifiers changed from: private */
    public int toDoubleRange;
    private final setMin toFloatRange = new setMin();
    /* access modifiers changed from: private */
    public final ensureTopGlow toIntRange = ensureTopGlow.getMax("EncoderEngine");
    /* access modifiers changed from: private */
    public int toString = 0;
    /* access modifiers changed from: private */
    public length values;

    public interface length {
        @EncoderThread
        void getMin(int i, @Nullable Exception exc);

        @EncoderThread
        void setMax();
    }

    static /* synthetic */ int IsOverlapping(didChildRangeChange didchildrangechange) {
        int i = didchildrangechange.setMin - 1;
        didchildrangechange.setMin = i;
        return i;
    }

    static /* synthetic */ int getMin(didChildRangeChange didchildrangechange) {
        int i = didchildrangechange.setMin + 1;
        didchildrangechange.setMin = i;
        return i;
    }

    static /* synthetic */ int hashCode(didChildRangeChange didchildrangechange) {
        int i = didchildrangechange.isInside + 1;
        didchildrangechange.isInside = i;
        return i;
    }

    static {
        String simpleName = didChildRangeChange.class.getSimpleName();
        getMin = simpleName;
        getMax = CameraLogger.setMin(simpleName);
    }

    public didChildRangeChange(@NonNull File file, @NonNull clearOldPositions clearoldpositions, @Nullable getDeepestFocusedViewWithId getdeepestfocusedviewwithid, int i, long j, @Nullable length length2) {
        this.values = length2;
        this.setMax.add(clearoldpositions);
        if (getdeepestfocusedviewwithid != null) {
            this.setMax.add(getdeepestfocusedviewwithid);
        }
        try {
            this.length = new MediaMuxer(file.toString(), 0);
            int i2 = 0;
            for (dispatchLayoutStep3 min : this.setMax) {
                i2 += min.getMin();
            }
            long j2 = (j / ((long) (i2 / 8))) * 1000 * 1000;
            long j3 = ((long) i) * 1000;
            if (j > 0 && i > 0) {
                this.toDoubleRange = j2 < j3 ? 2 : 1;
                j2 = Math.min(j2, j3);
            } else if (j > 0) {
                this.toDoubleRange = 2;
            } else if (i > 0) {
                this.toDoubleRange = 1;
                j2 = j3;
            } else {
                j2 = Long.MAX_VALUE;
            }
            getMax.getMin("Computed a max duration of", Float.valueOf(((float) j2) / 1000000.0f));
            for (dispatchLayoutStep3 max : this.setMax) {
                max.getMax(this.toFloatRange, j2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void getMin(String str, Object obj) {
        getMax.getMax(0, "Passing event to encoders:", str);
        for (dispatchLayoutStep3 min : this.setMax) {
            min.setMin(str, obj);
        }
    }

    public final void length() {
        getMax.getMax(1, "Passing event to encoders:", "STOP");
        for (dispatchLayoutStep3 floatRange : this.setMax) {
            floatRange.toFloatRange();
        }
        length length2 = this.values;
        if (length2 != null) {
            length2.setMax();
        }
    }

    public class setMin {
        @SuppressLint({"UseSparseArrays"})
        Map<Integer, Integer> setMin = new HashMap();

        public setMin() {
        }

        public final int length(@NonNull MediaFormat mediaFormat) {
            int addTrack;
            synchronized (didChildRangeChange.this.IsOverlapping) {
                if (!didChildRangeChange.this.equals) {
                    addTrack = didChildRangeChange.this.length.addTrack(mediaFormat);
                    didChildRangeChange.getMax.getMin("notifyStarted:", "Assigned track", Integer.valueOf(addTrack), "to format", mediaFormat.getString("mime"));
                    if (didChildRangeChange.getMin(didChildRangeChange.this) == didChildRangeChange.this.setMax.size()) {
                        didChildRangeChange.getMax.getMin("notifyStarted:", "All encoders have started.", "Starting muxer and dispatching onEncodingStart().");
                        ensureTopGlow intRange = didChildRangeChange.this.toIntRange;
                        AnonymousClass3 r2 = new Runnable() {
                            public final void run() {
                                didChildRangeChange.this.length.start();
                                boolean unused = didChildRangeChange.this.equals = true;
                                if (didChildRangeChange.this.values != null) {
                                    length unused2 = didChildRangeChange.this.values;
                                }
                            }
                        };
                        if (Thread.currentThread() == intRange.getMax) {
                            r2.run();
                        } else {
                            intRange.length.post(r2);
                        }
                    }
                } else {
                    throw new IllegalStateException("Trying to start but muxer started already");
                }
            }
            return addTrack;
        }

        public final boolean setMin() {
            boolean max;
            synchronized (didChildRangeChange.this.IsOverlapping) {
                max = didChildRangeChange.this.equals;
            }
            return max;
        }

        public final void setMax(int i) {
            synchronized (didChildRangeChange.this.IsOverlapping) {
                didChildRangeChange.getMax.getMax(2, "requestStop:", "Called for track", Integer.valueOf(i));
                if (didChildRangeChange.IsOverlapping(didChildRangeChange.this) == 0) {
                    didChildRangeChange.getMax.getMax(2, "requestStop:", "All encoders have requested a stop.", "Stopping them.");
                    int unused = didChildRangeChange.this.toString = didChildRangeChange.this.toDoubleRange;
                    ensureTopGlow intRange = didChildRangeChange.this.toIntRange;
                    AnonymousClass2 r1 = new Runnable() {
                        public final void run() {
                            didChildRangeChange.this.length();
                        }
                    };
                    if (Thread.currentThread() == intRange.getMax) {
                        r1.run();
                    } else {
                        intRange.length.post(r1);
                    }
                }
            }
        }
    }

    static /* synthetic */ void toString(didChildRangeChange didchildrangechange) {
        getMax.getMax(1, "end:", "Releasing muxer after all encoders have been released.");
        MediaMuxer mediaMuxer = didchildrangechange.length;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            try {
                didchildrangechange.length.release();
            } catch (Exception e2) {
                if (e == null) {
                    e = e2;
                }
            }
            didchildrangechange.length = null;
        } else {
            e = null;
        }
        getMax.getMax(2, "end:", "Dispatching end to listener - reason:", Integer.valueOf(didchildrangechange.toString), "error:", e);
        length length2 = didchildrangechange.values;
        if (length2 != null) {
            length2.getMin(didchildrangechange.toString, e);
            didchildrangechange.values = null;
        }
        didchildrangechange.toString = 0;
        didchildrangechange.setMin = 0;
        didchildrangechange.isInside = 0;
        didchildrangechange.equals = false;
        didchildrangechange.toIntRange.setMax();
        getMax.getMax(1, "end:", "Completed.");
    }
}
