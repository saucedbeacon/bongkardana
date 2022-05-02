package o;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.EncoderThread;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import o.didChildRangeChange;

@RequiresApi(api = 18)
public class getDeepestFocusedViewWithId extends dispatchLayoutStep3 {
    private static final String getMin;
    /* access modifiers changed from: private */
    public static final CameraLogger toIntRange;
    /* access modifiers changed from: private */
    public final dispatchLayoutStep1 FastBitmap$CoordinateSystem;
    private Map<Long, Long> Grayscale$Algorithm = new HashMap();
    /* access modifiers changed from: private */
    public boolean IsOverlapping = false;
    private long Mean$Arithmetic = 0;
    private setMin equals;
    /* access modifiers changed from: private */
    public fillRemainingScrollValues hashCode;
    private int invoke = 0;
    private int invokeSuspend = 0;
    private length isInside;
    /* access modifiers changed from: private */
    public recoverFocusFromState toDoubleRange;
    /* access modifiers changed from: private */
    public dispatchLayoutStep2 toFloatRange;
    /* access modifiers changed from: private */
    public final LinkedBlockingQueue<recordAnimationInfoIfBouncedHiddenView> toString = new LinkedBlockingQueue<>();
    private long valueOf = 0;
    /* access modifiers changed from: private */
    public handleMissingPreInfoForChangeError values = new handleMissingPreInfoForChangeError();

    static {
        String simpleName = getDeepestFocusedViewWithId.class.getSimpleName();
        getMin = simpleName;
        toIntRange = CameraLogger.setMin(simpleName);
    }

    public getDeepestFocusedViewWithId(@NonNull recoverFocusFromState recoverfocusfromstate) {
        super("AudioEncoder");
        recoverFocusFromState recoverfocusfromstate2 = new recoverFocusFromState();
        recoverfocusfromstate2.setMax = recoverfocusfromstate.setMax;
        recoverfocusfromstate2.setMin = recoverfocusfromstate.setMin;
        recoverfocusfromstate2.length = recoverfocusfromstate.length;
        recoverfocusfromstate2.getMax = recoverfocusfromstate.getMax;
        recoverfocusfromstate2.getMin = recoverfocusfromstate.getMin;
        this.toDoubleRange = recoverfocusfromstate2;
        this.FastBitmap$CoordinateSystem = new dispatchLayoutStep1(recoverfocusfromstate2.equals * recoverfocusfromstate2.setMin);
        this.equals = new setMin(this, (byte) 0);
        this.isInside = new length(this, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public final void length(@NonNull didChildRangeChange.setMin setmin, long j) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.toDoubleRange.getMax, this.toDoubleRange.getMin, this.toDoubleRange.setMin);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("channel-mask", this.toDoubleRange.setMin());
        createAudioFormat.setInteger("bitrate", this.toDoubleRange.setMax);
        try {
            if (this.toDoubleRange.length != null) {
                this.setMin = MediaCodec.createByCodecName(this.toDoubleRange.length);
            } else {
                this.setMin = MediaCodec.createEncoderByType(this.toDoubleRange.getMax);
            }
            this.setMin.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.setMin.start();
            this.toFloatRange = new dispatchLayoutStep2(this.toDoubleRange.setMin * 1024);
            this.hashCode = new fillRemainingScrollValues(this.toDoubleRange);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public final void setMax() {
        this.IsOverlapping = false;
        this.isInside.start();
        this.equals.start();
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public final void setMin() {
        this.IsOverlapping = true;
    }

    /* access modifiers changed from: protected */
    public final void getMax() {
        super.getMax();
        this.IsOverlapping = false;
        this.equals = null;
        this.isInside = null;
        dispatchLayoutStep2 dispatchlayoutstep2 = this.toFloatRange;
        if (dispatchlayoutstep2 != null) {
            synchronized (dispatchlayoutstep2.setMin) {
                dispatchlayoutstep2.length.clear();
            }
            this.toFloatRange = null;
        }
    }

    /* access modifiers changed from: protected */
    public final int getMin() {
        return this.toDoubleRange.setMax;
    }

    class length extends Thread {
        private long IsOverlapping;
        private long getMax;
        private ByteBuffer getMin;
        private int setMax;
        private AudioRecord setMin;

        /* synthetic */ length(getDeepestFocusedViewWithId getdeepestfocusedviewwithid, byte b) {
            this();
        }

        private length() {
            this.IsOverlapping = Long.MIN_VALUE;
            setPriority(10);
            int i = getDeepestFocusedViewWithId.this.toDoubleRange.getMin;
            int min = getDeepestFocusedViewWithId.this.toDoubleRange.setMin();
            recoverFocusFromState unused = getDeepestFocusedViewWithId.this.toDoubleRange;
            int minBufferSize = AudioRecord.getMinBufferSize(i, min, 2);
            recoverFocusFromState unused2 = getDeepestFocusedViewWithId.this.toDoubleRange;
            int i2 = getDeepestFocusedViewWithId.this.toDoubleRange.setMin * 1024 * 50;
            while (i2 < minBufferSize) {
                i2 += getDeepestFocusedViewWithId.this.toDoubleRange.setMin * 1024;
            }
            int i3 = getDeepestFocusedViewWithId.this.toDoubleRange.getMin;
            int min2 = getDeepestFocusedViewWithId.this.toDoubleRange.setMin();
            recoverFocusFromState unused3 = getDeepestFocusedViewWithId.this.toDoubleRange;
            this.setMin = new AudioRecord(5, i3, min2, 2, i2);
        }

        public final void run() {
            boolean z;
            this.setMin.startRecording();
            while (true) {
                z = false;
                if (getDeepestFocusedViewWithId.this.IsOverlapping) {
                    break;
                } else if (!getDeepestFocusedViewWithId.this.equals()) {
                    getMax(false);
                }
            }
            getDeepestFocusedViewWithId.toIntRange.getMax(2, "Stop was requested. We're out of the loop. Will post an endOfStream.");
            while (!z) {
                z = getMax(true);
            }
            this.setMin.stop();
            this.setMin.release();
            this.setMin = null;
        }

        private boolean getMax(boolean z) {
            int i;
            boolean z2 = z;
            ByteBuffer byteBuffer = (ByteBuffer) getDeepestFocusedViewWithId.this.toFloatRange.length();
            this.getMin = byteBuffer;
            if (byteBuffer == null) {
                if (z2) {
                    getDeepestFocusedViewWithId.toIntRange.getMax(0, "read thread - eos: true - No buffer, retrying.");
                } else {
                    getDeepestFocusedViewWithId.toIntRange.getMax(2, "read thread - eos: false - Skipping audio frame,", "encoding is too slow.");
                    getDeepestFocusedViewWithId.getMin(getDeepestFocusedViewWithId.this, 6);
                }
                return false;
            }
            byteBuffer.clear();
            this.setMax = this.setMin.read(this.getMin, getDeepestFocusedViewWithId.this.toDoubleRange.setMin * 1024);
            getDeepestFocusedViewWithId.toIntRange.getMax(0, "read thread - eos:", Boolean.valueOf(z), "- Read new audio frame. Bytes:", Integer.valueOf(this.setMax));
            int i2 = this.setMax;
            if (i2 > 0) {
                dispatchLayoutStep1 length2 = getDeepestFocusedViewWithId.this.FastBitmap$CoordinateSystem;
                long j = (long) i2;
                long j2 = (j * 1000000) / ((long) length2.getMax);
                long nanoTime = (System.nanoTime() / 1000) - j2;
                if (length2.setMin == 0) {
                    length2.getMin = nanoTime;
                }
                long j3 = length2.getMin + ((length2.setMin * 1000000) / ((long) length2.getMax));
                long j4 = nanoTime - j3;
                if (j4 >= j2 * 2) {
                    length2.getMin = nanoTime;
                    length2.setMin = j;
                    length2.setMax = j4;
                    j3 = length2.getMin;
                } else {
                    length2.setMax = 0;
                    length2.setMin += j;
                }
                this.getMax = j3;
                if (this.IsOverlapping == Long.MIN_VALUE) {
                    this.IsOverlapping = j3;
                    getDeepestFocusedViewWithId getdeepestfocusedviewwithid = getDeepestFocusedViewWithId.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    recoverFocusFromState max = getDeepestFocusedViewWithId.this.toDoubleRange;
                    getdeepestfocusedviewwithid.setMax = currentTimeMillis - ((j * 1000) / ((long) (max.equals * max.setMin)));
                }
                if (!getDeepestFocusedViewWithId.this.equals()) {
                    if ((this.getMax - this.IsOverlapping > getDeepestFocusedViewWithId.this.length) && !z2) {
                        getDeepestFocusedViewWithId.toIntRange.getMax(2, "read thread - this frame reached the maxLength! deltaUs:", Long.valueOf(this.getMax - this.IsOverlapping));
                        getDeepestFocusedViewWithId.this.toIntRange();
                    }
                }
                dispatchLayoutStep1 length3 = getDeepestFocusedViewWithId.this.FastBitmap$CoordinateSystem;
                int i3 = getDeepestFocusedViewWithId.this.toDoubleRange.setMin * 1024;
                if (length3.setMax == 0) {
                    i = 0;
                } else {
                    i = (int) (length3.setMax / ((((long) i3) * 1000000) / ((long) length3.getMax)));
                }
                if (i > 0) {
                    long j5 = this.getMax - getDeepestFocusedViewWithId.this.FastBitmap$CoordinateSystem.setMax;
                    long j6 = (long) (getDeepestFocusedViewWithId.this.toDoubleRange.setMin * 1024);
                    recoverFocusFromState max2 = getDeepestFocusedViewWithId.this.toDoubleRange;
                    long j7 = (j6 * 1000000) / ((long) (max2.equals * max2.setMin));
                    getDeepestFocusedViewWithId.toIntRange.getMax(2, "read thread - GAPS: trying to add", Integer.valueOf(i), "noise buffers. PERFORMANCE_MAX_GAPS:", 8);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= Math.min(i, 8)) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = (ByteBuffer) getDeepestFocusedViewWithId.this.toFloatRange.length();
                        if (byteBuffer2 == null) {
                            getDeepestFocusedViewWithId.toIntRange.getMax(3, "read thread - GAPS: aborting because we have no free buffer.");
                            break;
                        }
                        byteBuffer2.clear();
                        fillRemainingScrollValues intRange = getDeepestFocusedViewWithId.this.hashCode;
                        intRange.setMin.clear();
                        if (intRange.setMin.capacity() == byteBuffer2.remaining()) {
                            intRange.setMin.position(0);
                        } else {
                            intRange.setMin.position(fillRemainingScrollValues.length.nextInt(intRange.setMin.capacity() - byteBuffer2.remaining()));
                        }
                        intRange.setMin.limit(intRange.setMin.position() + byteBuffer2.remaining());
                        byteBuffer2.put(intRange.setMin);
                        byteBuffer2.rewind();
                        getMin(byteBuffer2, j5, false);
                        j5 += j7;
                        i4++;
                    }
                }
                getDeepestFocusedViewWithId.toIntRange.getMax(0, "read thread - eos:", Boolean.valueOf(z), "- mLastTimeUs:", Long.valueOf(this.getMax));
                this.getMin.limit(this.setMax);
                getMin(this.getMin, this.getMax, z2);
                return true;
            } else if (i2 == -3) {
                getDeepestFocusedViewWithId.toIntRange.getMax(3, "read thread - eos:", Boolean.valueOf(z), "- Got AudioRecord.ERROR_INVALID_OPERATION");
                return true;
            } else if (i2 != -2) {
                return true;
            } else {
                getDeepestFocusedViewWithId.toIntRange.getMax(3, "read thread - eos:", Boolean.valueOf(z), "- Got AudioRecord.ERROR_BAD_VALUE");
                return true;
            }
        }

        private void getMin(@NonNull ByteBuffer byteBuffer, long j, boolean z) {
            int remaining = byteBuffer.remaining();
            recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview = (recordAnimationInfoIfBouncedHiddenView) getDeepestFocusedViewWithId.this.values.length();
            recordanimationinfoifbouncedhiddenview.setMax = byteBuffer;
            recordanimationinfoifbouncedhiddenview.getMax = j;
            recordanimationinfoifbouncedhiddenview.length = remaining;
            recordanimationinfoifbouncedhiddenview.equals = z;
            getDeepestFocusedViewWithId.this.toString.add(recordanimationinfoifbouncedhiddenview);
        }
    }

    class setMin extends Thread {
        /* synthetic */ setMin(getDeepestFocusedViewWithId getdeepestfocusedviewwithid, byte b) {
            this();
        }

        private setMin() {
        }

        public final void run() {
            while (true) {
                if (!getDeepestFocusedViewWithId.this.toString.isEmpty()) {
                    getDeepestFocusedViewWithId.toIntRange.getMax(0, "encoding thread - performing", Integer.valueOf(getDeepestFocusedViewWithId.this.toString.size()), "pending operations.");
                    while (true) {
                        recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview = (recordAnimationInfoIfBouncedHiddenView) getDeepestFocusedViewWithId.this.toString.peek();
                        if (recordanimationinfoifbouncedhiddenview == null) {
                            continue;
                            break;
                        } else if (recordanimationinfoifbouncedhiddenview.equals) {
                            getDeepestFocusedViewWithId.this.getMin(recordanimationinfoifbouncedhiddenview);
                            getMax(recordanimationinfoifbouncedhiddenview);
                            handleMissingPreInfoForChangeError min = getDeepestFocusedViewWithId.this.values;
                            synchronized (min.setMin) {
                                min.length.clear();
                            }
                            return;
                        } else if (getDeepestFocusedViewWithId.this.length(recordanimationinfoifbouncedhiddenview)) {
                            getMax(recordanimationinfoifbouncedhiddenview);
                        } else {
                            getDeepestFocusedViewWithId.getMin(getDeepestFocusedViewWithId.this, 3);
                        }
                    }
                } else {
                    getDeepestFocusedViewWithId.getMin(getDeepestFocusedViewWithId.this, 3);
                }
            }
        }

        private void getMax(@NonNull recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview) {
            getDeepestFocusedViewWithId.toIntRange.getMax(0, "encoding thread - performing pending operation for timestamp:", Long.valueOf(recordanimationinfoifbouncedhiddenview.getMax), "- encoding.");
            recordanimationinfoifbouncedhiddenview.setMin.put(recordanimationinfoifbouncedhiddenview.setMax);
            getDeepestFocusedViewWithId.this.toFloatRange.getMin(recordanimationinfoifbouncedhiddenview.setMax);
            getDeepestFocusedViewWithId.this.toString.remove(recordanimationinfoifbouncedhiddenview);
            getDeepestFocusedViewWithId.this.getMax(recordanimationinfoifbouncedhiddenview);
            boolean z = recordanimationinfoifbouncedhiddenview.equals;
            getDeepestFocusedViewWithId.this.values.getMin(recordanimationinfoifbouncedhiddenview);
            getDeepestFocusedViewWithId.toIntRange.getMax(0, "encoding thread - performing pending operation for timestamp:", Long.valueOf(recordanimationinfoifbouncedhiddenview.getMax), "- draining.");
            getDeepestFocusedViewWithId.this.setMin(z);
        }
    }

    static /* synthetic */ void getMin(getDeepestFocusedViewWithId getdeepestfocusedviewwithid, int i) {
        try {
            recoverFocusFromState recoverfocusfromstate = getdeepestfocusedviewwithid.toDoubleRange;
            Thread.sleep((((long) ((getdeepestfocusedviewwithid.toDoubleRange.setMin * 1024) * i)) * 1000) / ((long) (recoverfocusfromstate.equals * recoverfocusfromstate.setMin)));
        } catch (InterruptedException unused) {
        }
    }
}
