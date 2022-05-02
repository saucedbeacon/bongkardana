package o;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.controls.Audio;
import com.otaliastudios.cameraview.controls.VideoCodec;
import com.otaliastudios.cameraview.internal.DeviceEncoders;
import o.exceptionLabel;
import o.findNextViewToFocus;

public abstract class dispatchLayout extends findNextViewToFocus {
    private static final String length;
    protected static final CameraLogger setMin;
    private CamcorderProfile IsOverlapping;
    protected MediaRecorder getMax;
    private boolean toIntRange;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract CamcorderProfile getMax(@NonNull exceptionLabel.setMax setmax);

    /* access modifiers changed from: protected */
    public abstract void length(@NonNull MediaRecorder mediaRecorder);

    static {
        String simpleName = dispatchLayout.class.getSimpleName();
        length = simpleName;
        setMin = CameraLogger.setMin(simpleName);
    }

    public dispatchLayout(@Nullable findNextViewToFocus.length length2) {
        super(length2);
    }

    /* access modifiers changed from: protected */
    public final boolean length(@NonNull exceptionLabel.setMax setmax) {
        if (this.toIntRange) {
            return true;
        }
        return getMin(setmax, true);
    }

    private boolean getMin(@NonNull exceptionLabel.setMax setmax, boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int max;
        int length2;
        exceptionLabel.setMax setmax2 = setmax;
        boolean z3 = z;
        while (true) {
            char c = 1;
            char c2 = 2;
            setMin.getMax(1, "prepareMediaRecorder:", "Preparing on thread", Thread.currentThread());
            this.getMax = new MediaRecorder();
            this.IsOverlapping = getMax(setmax);
            length(this.getMax);
            if (setmax2.toIntRange == Audio.ON) {
                i = this.IsOverlapping.audioChannels;
            } else if (setmax2.toIntRange == Audio.MONO) {
                i = 1;
            } else {
                i = setmax2.toIntRange == Audio.STEREO ? 2 : 0;
            }
            z2 = i > 0;
            if (z2) {
                this.getMax.setAudioSource(0);
            }
            if (setmax2.toFloatRange == VideoCodec.H_264) {
                this.IsOverlapping.videoCodec = 2;
                this.IsOverlapping.fileFormat = 2;
            } else if (setmax2.toFloatRange == VideoCodec.H_263) {
                this.IsOverlapping.videoCodec = 1;
                this.IsOverlapping.fileFormat = 2;
            }
            this.getMax.setOutputFormat(this.IsOverlapping.fileFormat);
            if (setmax2.FastBitmap$CoordinateSystem <= 0) {
                setmax2.FastBitmap$CoordinateSystem = this.IsOverlapping.videoFrameRate;
            }
            if (setmax2.toString <= 0) {
                setmax2.toString = this.IsOverlapping.videoBitRate;
            }
            if (setmax2.values <= 0 && z2) {
                setmax2.values = this.IsOverlapping.audioBitRate;
            }
            char c3 = 4;
            if (z3) {
                int i4 = this.IsOverlapping.audioCodec;
                String str = MimeTypes.AUDIO_AMR_NB;
                switch (i4) {
                    case 2:
                        str = MimeTypes.AUDIO_AMR_WB;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str = MimeTypes.AUDIO_AAC;
                        break;
                    case 6:
                        str = MimeTypes.AUDIO_VORBIS;
                        break;
                }
                int i5 = this.IsOverlapping.videoCodec;
                String str2 = MimeTypes.VIDEO_H264;
                if (i5 == 1) {
                    str2 = MimeTypes.VIDEO_H263;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        str2 = MimeTypes.VIDEO_MP4V;
                    } else if (i5 == 4) {
                        str2 = MimeTypes.VIDEO_VP8;
                    } else if (i5 == 5) {
                        str2 = MimeTypes.VIDEO_H265;
                    }
                }
                String str3 = str2;
                boolean z4 = setmax2.getMax % 180 != 0;
                if (z4) {
                    shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = setmax2.length;
                    setmax2.length = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent.getMin, shoulddeferaccessibilityevent.getMax);
                }
                boolean z5 = false;
                shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = null;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (!z5) {
                    CameraLogger cameraLogger = setMin;
                    Object[] objArr = new Object[6];
                    objArr[0] = "prepareMediaRecorder:";
                    objArr[c] = "Checking DeviceEncoders...";
                    objArr[c2] = "videoOffset:";
                    objArr[3] = Integer.valueOf(i9);
                    objArr[c3] = "audioOffset:";
                    objArr[5] = Integer.valueOf(i10);
                    cameraLogger.setMax(objArr);
                    try {
                        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent3 = shoulddeferaccessibilityevent2;
                        String str4 = str3;
                        DeviceEncoders deviceEncoders = new DeviceEncoders(0, str4, str, i9, i10);
                        try {
                            shoulddeferaccessibilityevent2 = deviceEncoders.setMax(setmax2.length);
                            try {
                                max = deviceEncoders.getMax(setmax2.toString);
                                try {
                                    length2 = deviceEncoders.length(shoulddeferaccessibilityevent2, setmax2.FastBitmap$CoordinateSystem);
                                    str3 = str4;
                                } catch (DeviceEncoders.VideoException e) {
                                    e = e;
                                    str3 = str4;
                                    i6 = max;
                                    setMin.setMax("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                                    i9++;
                                    c = 1;
                                    c2 = 2;
                                    c3 = 4;
                                } catch (DeviceEncoders.AudioException e2) {
                                    e = e2;
                                    str3 = str4;
                                    i6 = max;
                                    setMin.setMax("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                                    i10++;
                                    c = 1;
                                    c2 = 2;
                                    c3 = 4;
                                }
                            } catch (DeviceEncoders.VideoException e3) {
                                e = e3;
                                str3 = str4;
                                setMin.setMax("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                                i9++;
                                c = 1;
                                c2 = 2;
                                c3 = 4;
                            } catch (DeviceEncoders.AudioException e4) {
                                e = e4;
                                str3 = str4;
                                setMin.setMax("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                                i10++;
                                c = 1;
                                c2 = 2;
                                c3 = 4;
                            }
                            try {
                                deviceEncoders.length(str3, shoulddeferaccessibilityevent2, length2, max);
                                if (z2) {
                                    int min = deviceEncoders.getMin(setmax2.values);
                                    try {
                                        deviceEncoders.length(str, min, this.IsOverlapping.audioSampleRate, i);
                                        i7 = min;
                                    } catch (DeviceEncoders.VideoException e5) {
                                        e = e5;
                                        i7 = min;
                                        i6 = max;
                                        i8 = length2;
                                        setMin.setMax("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                                        i9++;
                                        c = 1;
                                        c2 = 2;
                                        c3 = 4;
                                    } catch (DeviceEncoders.AudioException e6) {
                                        e = e6;
                                        i7 = min;
                                        i6 = max;
                                        i8 = length2;
                                        setMin.setMax("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                                        i10++;
                                        c = 1;
                                        c2 = 2;
                                        c3 = 4;
                                    }
                                }
                                i6 = max;
                                i8 = length2;
                                z5 = true;
                            } catch (DeviceEncoders.VideoException e7) {
                                e = e7;
                                i6 = max;
                                i8 = length2;
                                setMin.setMax("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                                i9++;
                                c = 1;
                                c2 = 2;
                                c3 = 4;
                            } catch (DeviceEncoders.AudioException e8) {
                                e = e8;
                                i6 = max;
                                i8 = length2;
                                setMin.setMax("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                                i10++;
                                c = 1;
                                c2 = 2;
                                c3 = 4;
                            }
                        } catch (DeviceEncoders.VideoException e9) {
                            e = e9;
                            str3 = str4;
                            shoulddeferaccessibilityevent2 = shoulddeferaccessibilityevent3;
                            setMin.setMax("prepareMediaRecorder:", "Got VideoException:", e.getMessage());
                            i9++;
                            c = 1;
                            c2 = 2;
                            c3 = 4;
                        } catch (DeviceEncoders.AudioException e10) {
                            e = e10;
                            str3 = str4;
                            shoulddeferaccessibilityevent2 = shoulddeferaccessibilityevent3;
                            setMin.setMax("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                            i10++;
                            c = 1;
                            c2 = 2;
                            c3 = 4;
                        }
                        c = 1;
                        c2 = 2;
                        c3 = 4;
                    } catch (RuntimeException unused) {
                        setMin.getMin("prepareMediaRecorder:", "Could not respect encoders parameters.", "Trying again without checking encoders.");
                        z3 = false;
                    }
                }
                setmax2.length = shoulddeferaccessibilityevent2;
                setmax2.toString = i6;
                setmax2.values = i7;
                setmax2.FastBitmap$CoordinateSystem = i8;
                if (z4) {
                    shouldDeferAccessibilityEvent shoulddeferaccessibilityevent4 = setmax2.length;
                    setmax2.length = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent4.getMin, shoulddeferaccessibilityevent4.getMax);
                }
            }
        }
        boolean z6 = setmax2.getMax % 180 != 0;
        MediaRecorder mediaRecorder = this.getMax;
        if (z6) {
            i2 = setmax2.length.getMin;
        } else {
            i2 = setmax2.length.getMax;
        }
        if (z6) {
            i3 = setmax2.length.getMax;
        } else {
            i3 = setmax2.length.getMin;
        }
        mediaRecorder.setVideoSize(i2, i3);
        this.getMax.setVideoFrameRate(setmax2.FastBitmap$CoordinateSystem);
        this.getMax.setVideoEncoder(this.IsOverlapping.videoCodec);
        this.getMax.setVideoEncodingBitRate(setmax2.toString);
        if (z2) {
            this.getMax.setAudioChannels(i);
            this.getMax.setAudioSamplingRate(this.IsOverlapping.audioSampleRate);
            this.getMax.setAudioEncoder(this.IsOverlapping.audioCodec);
            this.getMax.setAudioEncodingBitRate(setmax2.values);
        }
        if (setmax2.setMax != null) {
            this.getMax.setLocation((float) setmax2.setMax.getLatitude(), (float) setmax2.setMax.getLongitude());
        }
        if (setmax2.setMin != null) {
            this.getMax.setOutputFile(setmax2.setMin.getAbsolutePath());
        } else if (setmax2.isInside != null) {
            this.getMax.setOutputFile(setmax2.isInside);
        } else {
            throw new IllegalStateException("file and fileDescriptor are both null.");
        }
        this.getMax.setOrientationHint(setmax2.getMax);
        MediaRecorder mediaRecorder2 = this.getMax;
        int i11 = (setmax2.IsOverlapping > 0 ? 1 : (setmax2.IsOverlapping == 0 ? 0 : -1));
        long j = setmax2.IsOverlapping;
        if (i11 > 0) {
            double d = (double) j;
            Double.isNaN(d);
            j = Math.round(d / 0.9d);
        }
        mediaRecorder2.setMaxFileSize(j);
        CameraLogger cameraLogger2 = setMin;
        double d2 = (double) setmax2.IsOverlapping;
        Double.isNaN(d2);
        cameraLogger2.setMax("prepareMediaRecorder:", "Increased max size from", Long.valueOf(setmax2.IsOverlapping), "to", Long.valueOf(Math.round(d2 / 0.9d)));
        this.getMax.setMaxDuration(setmax2.hashCode);
        this.getMax.setOnInfoListener(new MediaRecorder.OnInfoListener() {
            public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
                boolean z;
                dispatchLayout.setMin.getMax(1, "OnInfoListener:", "Received info", Integer.valueOf(i), Integer.valueOf(i2), "Thread: ", Thread.currentThread());
                switch (i) {
                    case 800:
                        dispatchLayout.this.getMin.toDoubleRange = 2;
                        break;
                    case SecExceptionCode.SEC_ERROR_PKG_VALID_INVALID_PARAM:
                    case SecExceptionCode.SEC_ERROR_PKG_VALID_INVALID_JPG:
                        dispatchLayout.this.getMin.toDoubleRange = 1;
                        break;
                    default:
                        z = false;
                        break;
                }
                z = true;
                if (z) {
                    dispatchLayout.setMin.getMax(1, "OnInfoListener:", "Stopping");
                    dispatchLayout.this.setMin(false);
                }
            }
        });
        this.getMax.setOnErrorListener(new MediaRecorder.OnErrorListener() {
            public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
                dispatchLayout.setMin.getMax(3, "OnErrorListener: got error", Integer.valueOf(i), Integer.valueOf(i2), ". Stopping.");
                dispatchLayout.this.getMin = null;
                dispatchLayout dispatchlayout = dispatchLayout.this;
                StringBuilder sb = new StringBuilder("MediaRecorder error: ");
                sb.append(i);
                sb.append(" ");
                sb.append(i2);
                dispatchlayout.setMax = new RuntimeException(sb.toString());
                dispatchLayout.setMin.setMax("OnErrorListener:", "Stopping");
                dispatchLayout.this.setMin(false);
            }
        });
        try {
            this.getMax.prepare();
            this.toIntRange = true;
            this.setMax = null;
            return true;
        } catch (Exception e11) {
            setMin.getMin("prepareMediaRecorder:", "Error while preparing media recorder.", e11);
            this.toIntRange = false;
            this.setMax = e11;
            return false;
        }
    }

    public void setMin() {
        if (!length(this.getMin)) {
            this.getMin = null;
            setMin(false);
            return;
        }
        try {
            this.getMax.start();
            isInside();
        } catch (Exception e) {
            setMin.getMax(2, "start:", "Error while starting media recorder.", e);
            this.getMin = null;
            this.setMax = e;
            setMin(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void length(boolean z) {
        if (this.getMax != null) {
            toIntRange();
            try {
                setMin.getMax(1, "stop:", "Stopping MediaRecorder...");
                this.getMax.stop();
                setMin.getMax(1, "stop:", "Stopped MediaRecorder.");
            } catch (Exception e) {
                this.getMin = null;
                if (this.setMax == null) {
                    setMin.getMax(2, "stop:", "Error while closing media recorder.", e);
                    this.setMax = e;
                }
            }
            try {
                setMin.getMax(1, "stop:", "Releasing MediaRecorder...");
                this.getMax.release();
                setMin.getMax(1, "stop:", "Released MediaRecorder.");
            } catch (Exception e2) {
                this.getMin = null;
                if (this.setMax == null) {
                    setMin.getMax(2, "stop:", "Error while releasing media recorder.", e2);
                    this.setMax = e2;
                }
            }
        }
        this.IsOverlapping = null;
        this.getMax = null;
        this.toIntRange = false;
        getMin();
    }
}
