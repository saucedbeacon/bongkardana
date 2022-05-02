package o;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.EncoderThread;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.didChildRangeChange;

@RequiresApi(api = 18)
public abstract class dispatchLayoutStep3 {
    /* access modifiers changed from: private */
    public static final CameraLogger IsOverlapping;
    private static final String getMin;
    private getChangedHolderKey FastBitmap$CoordinateSystem;
    private long Mean$Arithmetic = Long.MIN_VALUE;
    private didChildRangeChange.setMin equals;
    protected ensureTopGlow getMax;
    private findMinMaxChildLayoutPositions hashCode;
    private long invoke = 0;
    private long invokeSuspend = Long.MIN_VALUE;
    /* access modifiers changed from: private */
    public int isInside = 0;
    long length;
    long setMax = 0;
    protected MediaCodec setMin;
    private MediaCodec.BufferInfo toDoubleRange;
    private int toFloatRange;
    /* access modifiers changed from: private */
    public final String toIntRange;
    private boolean toString;
    private final Map<String, AtomicInteger> values = new HashMap();

    /* access modifiers changed from: protected */
    public abstract int getMin();

    /* access modifiers changed from: protected */
    @EncoderThread
    public void getMin(@NonNull String str, @Nullable Object obj) {
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public abstract void length(@NonNull didChildRangeChange.setMin setmin, long j);

    /* access modifiers changed from: protected */
    @EncoderThread
    public abstract void setMax();

    /* access modifiers changed from: protected */
    @EncoderThread
    public abstract void setMin();

    static {
        String simpleName = dispatchLayoutStep3.class.getSimpleName();
        getMin = simpleName;
        IsOverlapping = CameraLogger.setMin(simpleName);
    }

    protected dispatchLayoutStep3(@NonNull String str) {
        this.toIntRange = str;
    }

    /* access modifiers changed from: private */
    public void getMax(int i) {
        if (this.Mean$Arithmetic == Long.MIN_VALUE) {
            this.Mean$Arithmetic = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.Mean$Arithmetic;
        this.Mean$Arithmetic = System.currentTimeMillis();
        String str = null;
        switch (i) {
            case 0:
                str = NetworkUtils.NETWORK_TYPE_NONE;
                break;
            case 1:
                str = "PREPARING";
                break;
            case 2:
                str = "PREPARED";
                break;
            case 3:
                str = "STARTING";
                break;
            case 4:
                str = "STARTED";
                break;
            case 5:
                str = "LIMIT_REACHED";
                break;
            case 6:
                str = "STOPPING";
                break;
            case 7:
                str = "STOPPED";
                break;
        }
        IsOverlapping.getMax(2, this.toIntRange, "setState:", str, "millisSinceLastState:", Long.valueOf(currentTimeMillis));
        this.isInside = i;
    }

    /* access modifiers changed from: package-private */
    public final void getMax(@NonNull final didChildRangeChange.setMin setmin, final long j) {
        int i = this.isInside;
        if (i > 0) {
            IsOverlapping.getMax(3, this.toIntRange, "Wrong state while preparing. Aborting.", Integer.valueOf(i));
            return;
        }
        this.equals = setmin;
        this.toDoubleRange = new MediaCodec.BufferInfo();
        this.length = j;
        ensureTopGlow max = ensureTopGlow.getMax(this.toIntRange);
        this.getMax = max;
        max.getMax.setPriority(10);
        IsOverlapping.setMax(this.toIntRange, "Prepare was called. Posting.");
        ensureTopGlow ensuretopglow = this.getMax;
        ensuretopglow.length.post(new Runnable() {
            public final void run() {
                dispatchLayoutStep3.IsOverlapping.getMax(1, dispatchLayoutStep3.this.toIntRange, "Prepare was called. Executing.");
                dispatchLayoutStep3.this.getMax(1);
                dispatchLayoutStep3.this.length(setmin, j);
                dispatchLayoutStep3.this.getMax(2);
            }
        });
    }

    public final void IsOverlapping() {
        IsOverlapping.getMax(2, this.toIntRange, "Start was called. Posting.");
        ensureTopGlow ensuretopglow = this.getMax;
        ensuretopglow.length.post(new Runnable() {
            public final void run() {
                if (dispatchLayoutStep3.this.isInside < 2 || dispatchLayoutStep3.this.isInside >= 3) {
                    dispatchLayoutStep3.IsOverlapping.getMax(3, dispatchLayoutStep3.this.toIntRange, "Wrong state while starting. Aborting.", Integer.valueOf(dispatchLayoutStep3.this.isInside));
                    return;
                }
                dispatchLayoutStep3.this.getMax(3);
                dispatchLayoutStep3.IsOverlapping.getMax(2, dispatchLayoutStep3.this.toIntRange, "Start was called. Executing.");
                dispatchLayoutStep3.this.setMax();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@NonNull final String str, @Nullable final Object obj) {
        if (!this.values.containsKey(str)) {
            this.values.put(str, new AtomicInteger(0));
        }
        final AtomicInteger atomicInteger = this.values.get(str);
        atomicInteger.incrementAndGet();
        IsOverlapping.length(this.toIntRange, "Notify was called. Posting. pendingEvents:", Integer.valueOf(atomicInteger.intValue()));
        ensureTopGlow ensuretopglow = this.getMax;
        ensuretopglow.length.post(new Runnable() {
            public final void run() {
                dispatchLayoutStep3.IsOverlapping.getMax(0, dispatchLayoutStep3.this.toIntRange, "Notify was called. Executing. pendingEvents:", Integer.valueOf(atomicInteger.intValue()));
                dispatchLayoutStep3.this.getMin(str, obj);
                atomicInteger.decrementAndGet();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void toFloatRange() {
        int i = this.isInside;
        if (i >= 6) {
            IsOverlapping.getMax(3, this.toIntRange, "Wrong state while stopping. Aborting.", Integer.valueOf(i));
            return;
        }
        getMax(6);
        IsOverlapping.getMax(2, this.toIntRange, "Stop was called. Posting.");
        ensureTopGlow ensuretopglow = this.getMax;
        ensuretopglow.length.post(new Runnable() {
            public final void run() {
                dispatchLayoutStep3.IsOverlapping.getMax(2, dispatchLayoutStep3.this.toIntRange, "Stop was called. Executing.");
                dispatchLayoutStep3.this.setMin();
            }
        });
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void getMax() {
        IsOverlapping.getMax(2, this.toIntRange, "is being released. Notifying controller and releasing codecs.");
        didChildRangeChange.setMin setmin = this.equals;
        int i = this.toFloatRange;
        synchronized (didChildRangeChange.this.IsOverlapping) {
            didChildRangeChange.getMax.getMax(2, "notifyStopped:", "Called for track", Integer.valueOf(i));
            if (didChildRangeChange.hashCode(didChildRangeChange.this) == didChildRangeChange.this.setMax.size()) {
                didChildRangeChange.getMax.getMax(2, "requestStop:", "All encoders have been stopped.", "Stopping the muxer.");
                ensureTopGlow intRange = didChildRangeChange.this.toIntRange;
                didChildRangeChange.setMin.AnonymousClass1 r2 = new Runnable() {
                    public final void run() {
                        didChildRangeChange.toString(didChildRangeChange.this);
                    }
                };
                if (Thread.currentThread() == intRange.getMax) {
                    r2.run();
                } else {
                    intRange.length.post(r2);
                }
            }
        }
        this.setMin.stop();
        this.setMin.release();
        this.setMin = null;
        getChangedHolderKey getchangedholderkey = this.FastBitmap$CoordinateSystem;
        synchronized (getchangedholderkey.setMin) {
            getchangedholderkey.length.clear();
        }
        this.FastBitmap$CoordinateSystem = null;
        this.hashCode = null;
        getMax(7);
        this.getMax.setMax();
    }

    /* access modifiers changed from: protected */
    public final boolean length(@NonNull recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview) {
        ByteBuffer byteBuffer;
        if (this.hashCode == null) {
            this.hashCode = new findMinMaxChildLayoutPositions(this.setMin);
        }
        int dequeueInputBuffer = this.setMin.dequeueInputBuffer(0);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        recordanimationinfoifbouncedhiddenview.getMin = dequeueInputBuffer;
        findMinMaxChildLayoutPositions findminmaxchildlayoutpositions = this.hashCode;
        if (Build.VERSION.SDK_INT >= 21) {
            byteBuffer = findminmaxchildlayoutpositions.setMax.getInputBuffer(dequeueInputBuffer);
        } else {
            byteBuffer = findminmaxchildlayoutpositions.getMax[dequeueInputBuffer];
            byteBuffer.clear();
        }
        recordanimationinfoifbouncedhiddenview.setMin = byteBuffer;
        return true;
    }

    /* access modifiers changed from: protected */
    public final void getMin(@NonNull recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview) {
        do {
        } while (!length(recordanimationinfoifbouncedhiddenview));
    }

    /* access modifiers changed from: protected */
    public final void getMax(recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview) {
        recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview2 = recordanimationinfoifbouncedhiddenview;
        IsOverlapping.getMax(0, this.toIntRange, "ENCODING - Buffer:", Integer.valueOf(recordanimationinfoifbouncedhiddenview2.getMin), "Bytes:", Integer.valueOf(recordanimationinfoifbouncedhiddenview2.length), "Presentation:", Long.valueOf(recordanimationinfoifbouncedhiddenview2.getMax));
        if (recordanimationinfoifbouncedhiddenview2.equals) {
            this.setMin.queueInputBuffer(recordanimationinfoifbouncedhiddenview2.getMin, 0, 0, recordanimationinfoifbouncedhiddenview2.getMax, 4);
        } else {
            this.setMin.queueInputBuffer(recordanimationinfoifbouncedhiddenview2.getMin, 0, recordanimationinfoifbouncedhiddenview2.length, recordanimationinfoifbouncedhiddenview2.getMax, 0);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"LogNotTimber"})
    public final void setMin(boolean z) {
        ByteBuffer byteBuffer;
        IsOverlapping.getMax(1, this.toIntRange, "DRAINING - EOS:", Boolean.valueOf(z));
        MediaCodec mediaCodec = this.setMin;
        if (mediaCodec == null) {
            IsOverlapping.getMax(3, "drain() was called before prepare() or after releasing.");
            return;
        }
        if (this.hashCode == null) {
            this.hashCode = new findMinMaxChildLayoutPositions(mediaCodec);
        }
        while (true) {
            int dequeueOutputBuffer = this.setMin.dequeueOutputBuffer(this.toDoubleRange, 0);
            IsOverlapping.getMax(1, this.toIntRange, "DRAINING - Got status:", Integer.valueOf(dequeueOutputBuffer));
            if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                findMinMaxChildLayoutPositions findminmaxchildlayoutpositions = this.hashCode;
                if (Build.VERSION.SDK_INT < 21) {
                    findminmaxchildlayoutpositions.getMin = findminmaxchildlayoutpositions.setMax.getOutputBuffers();
                }
            } else if (dequeueOutputBuffer == -2) {
                if (!this.equals.setMin()) {
                    this.toFloatRange = this.equals.length(this.setMin.getOutputFormat());
                    getMax(4);
                    this.FastBitmap$CoordinateSystem = new getChangedHolderKey(this.toFloatRange);
                } else {
                    throw new RuntimeException("MediaFormat changed twice.");
                }
            } else if (dequeueOutputBuffer < 0) {
                IsOverlapping.setMin("Unexpected result from dequeueOutputBuffer: ".concat(String.valueOf(dequeueOutputBuffer)));
            } else {
                findMinMaxChildLayoutPositions findminmaxchildlayoutpositions2 = this.hashCode;
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = findminmaxchildlayoutpositions2.setMax.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    byteBuffer = findminmaxchildlayoutpositions2.getMin[dequeueOutputBuffer];
                }
                if (!((this.toDoubleRange.flags & 2) != 0) && this.equals.setMin() && this.toDoubleRange.size != 0) {
                    byteBuffer.position(this.toDoubleRange.offset);
                    byteBuffer.limit(this.toDoubleRange.offset + this.toDoubleRange.size);
                    if (this.invokeSuspend == Long.MIN_VALUE) {
                        long j = this.toDoubleRange.presentationTimeUs;
                        this.invokeSuspend = j;
                        IsOverlapping.getMin(this.toIntRange, "DRAINING - Got the first presentation time:", Long.valueOf(j));
                    }
                    long j2 = this.toDoubleRange.presentationTimeUs;
                    this.invoke = j2;
                    this.toDoubleRange.presentationTimeUs = ((this.setMax * 1000) + j2) - this.invokeSuspend;
                    IsOverlapping.length(this.toIntRange, "DRAINING - About to write(). Adjusted presentation:", Long.valueOf(this.toDoubleRange.presentationTimeUs));
                    animateChange animatechange = (animateChange) this.FastBitmap$CoordinateSystem.length();
                    animatechange.getMax = this.toDoubleRange;
                    animatechange.setMax = this.toFloatRange;
                    animatechange.getMin = byteBuffer;
                    length(this.FastBitmap$CoordinateSystem, animatechange);
                }
                this.setMin.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (!z && !this.toString) {
                    long j3 = this.invokeSuspend;
                    if (j3 != Long.MIN_VALUE) {
                        long j4 = this.invoke;
                        if (j4 - j3 > this.length) {
                            IsOverlapping.getMin(this.toIntRange, "DRAINING - Reached maxLength! mLastTimeUs:", Long.valueOf(j4), "mStartTimeUs:", Long.valueOf(this.invokeSuspend), "mDeltaUs:", Long.valueOf(this.invoke - this.invokeSuspend), "mMaxLengthUs:", Long.valueOf(this.length));
                            toIntRange();
                            return;
                        }
                    }
                }
                if ((this.toDoubleRange.flags & 4) != 0) {
                    IsOverlapping.getMin(this.toIntRange, "DRAINING - Got EOS. Releasing the codec.");
                    getMax();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void length(@NonNull getChangedHolderKey getchangedholderkey, @NonNull animateChange animatechange) {
        int i;
        didChildRangeChange.setMin setmin = this.equals;
        Integer num = setmin.setMin.get(Integer.valueOf(animatechange.setMax));
        Map<Integer, Integer> map = setmin.setMin;
        Integer valueOf = Integer.valueOf(animatechange.setMax);
        if (num == null) {
            i = 1;
        } else {
            num = Integer.valueOf(num.intValue() + 1);
            i = num.intValue();
        }
        map.put(valueOf, Integer.valueOf(i));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(animatechange.getMax.presentationTimeUs / 1000);
        CameraLogger min = didChildRangeChange.getMax;
        StringBuilder sb = new StringBuilder();
        sb.append(instance.get(13));
        sb.append(":");
        sb.append(instance.get(14));
        min.length("write:", "Writing into muxer -", "track:", Integer.valueOf(animatechange.setMax), "presentation:", Long.valueOf(animatechange.getMax.presentationTimeUs), "readable:", sb.toString(), "count:", num);
        didChildRangeChange.this.length.writeSampleData(animatechange.setMax, animatechange.getMin, animatechange.getMax);
        getchangedholderkey.getMin(animatechange);
    }

    /* access modifiers changed from: protected */
    public final void isInside() {
        toIntRange();
    }

    /* access modifiers changed from: protected */
    public final boolean equals() {
        return this.toString;
    }

    /* access modifiers changed from: package-private */
    public final void toIntRange() {
        if (this.toString) {
            IsOverlapping.getMax(2, this.toIntRange, "onMaxLengthReached: Called twice.");
            return;
        }
        this.toString = true;
        int i = this.isInside;
        if (i >= 5) {
            IsOverlapping.getMax(2, this.toIntRange, "onMaxLengthReached: Reached in wrong state. Aborting.", Integer.valueOf(i));
            return;
        }
        IsOverlapping.getMax(2, this.toIntRange, "onMaxLengthReached: Requesting a stop.");
        getMax(5);
        this.equals.setMax(this.toFloatRange);
    }

    /* access modifiers changed from: protected */
    public final int getMin(@NonNull String str) {
        return this.values.get(str).intValue();
    }
}
