package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import o.AnyRes;
import o.AnyThread;
import o.BinderThread;
import o.from;
import o.to;

public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private AnyRes length;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        AnyRes anyRes = this.length;
        if (anyRes.onExtrasChanged <= 0 && anyRes.onVolumeInfoChanged <= 0) {
            return;
        }
        if (z) {
            anyRes.onShuffleModeChanged = anyRes.onVolumeInfoChanged;
            anyRes.IMediaSession = anyRes.onExtrasChanged;
            return;
        }
        anyRes.onShuffleModeChanged = anyRes.onExtrasChanged;
        anyRes.IMediaSession = anyRes.onVolumeInfoChanged;
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        onMeasure(this.length, i, i2);
    }

    public void onMeasure(BinderThread binderThread, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (binderThread != null) {
            binderThread.getMax(mode, size, mode2, size2);
            setMeasuredDimension(binderThread.IMediaControllerCallback$Stub, binderThread.IMediaControllerCallback$Stub$Proxy);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void loadParameters(from.length length2, AnyThread anyThread, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(length2, anyThread, layoutParams, sparseArray);
        if (anyThread instanceof AnyRes) {
            AnyRes anyRes = (AnyRes) anyThread;
            if (layoutParams.extraCommand != -1) {
                anyRes.onMetadataChanged = layoutParams.extraCommand;
            }
        }
    }

    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.length = new AnyRes();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.onSessionDestroyed);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.onRepeatModeChanged) {
                    this.length.onMetadataChanged = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.onExtrasChanged) {
                    AnyRes anyRes = this.length;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    anyRes.onRepeatModeChanged = dimensionPixelSize;
                    anyRes.onQueueChanged = dimensionPixelSize;
                    anyRes.onShuffleModeChangedRemoved = dimensionPixelSize;
                    anyRes.onCaptioningEnabledChanged = dimensionPixelSize;
                    anyRes.onExtrasChanged = dimensionPixelSize;
                    anyRes.onVolumeInfoChanged = dimensionPixelSize;
                } else if (index == to.length.sendMediaButton) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        AnyRes anyRes2 = this.length;
                        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        anyRes2.onExtrasChanged = dimensionPixelSize2;
                        anyRes2.onShuffleModeChanged = dimensionPixelSize2;
                        anyRes2.IMediaSession = dimensionPixelSize2;
                    }
                } else if (index == to.length.sendCommand) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.length.onVolumeInfoChanged = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    }
                } else if (index == to.length.onShuffleModeChangedRemoved) {
                    AnyRes anyRes3 = this.length;
                    int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    anyRes3.onRepeatModeChanged = dimensionPixelSize3;
                    anyRes3.onShuffleModeChanged = dimensionPixelSize3;
                } else if (index == to.length.onCaptioningEnabledChanged) {
                    this.length.onQueueChanged = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == to.length.onVolumeInfoChanged) {
                    AnyRes anyRes4 = this.length;
                    int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    anyRes4.onShuffleModeChangedRemoved = dimensionPixelSize4;
                    anyRes4.IMediaSession = dimensionPixelSize4;
                } else if (index == to.length.IMediaSession) {
                    this.length.onCaptioningEnabledChanged = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == to.length.prepareFromSearch) {
                    this.length.IMediaControllerCallback = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.getRepeatMode) {
                    this.length.setMax = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.removeQueueItemAt) {
                    this.length.getMin = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.setVolumeTo) {
                    this.length.length = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.getExtras) {
                    this.length.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.getMetadata) {
                    this.length.setMin = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.getShuffleMode) {
                    this.length.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(index, 0);
                } else if (index == to.length.getRatingType) {
                    this.length.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == to.length.getQueue) {
                    this.length.MediaMetadataCompat = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == to.length.isCaptioningEnabled) {
                    this.length.MediaMetadataCompat$LongKey = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == to.length.adjustVolume) {
                    this.length.MediaMetadataCompat$BitmapKey = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == to.length.addQueueItemAt) {
                    this.length.MediaMetadataCompat$TextKey = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == to.length.addQueueItem) {
                    this.length.MediaMetadataCompat$RatingKey = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == to.length.getPlaybackState) {
                    this.length.onEvent = obtainStyledAttributes.getInt(index, 2);
                } else if (index == to.length.removeQueueItem) {
                    this.length.RatingCompat = obtainStyledAttributes.getInt(index, 2);
                } else if (index == to.length.getQueueTitle) {
                    this.length.RatingCompat$StarStyle = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == to.length.prepareFromMediaId) {
                    this.length.RatingCompat$Style = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == to.length.isShuffleModeEnabledRemoved) {
                    this.length.onQueueTitleChanged = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.length;
        validateParams();
    }

    public void setOrientation(int i) {
        this.length.onMetadataChanged = i;
        requestLayout();
    }

    public void setPadding(int i) {
        AnyRes anyRes = this.length;
        anyRes.onRepeatModeChanged = i;
        anyRes.onQueueChanged = i;
        anyRes.onShuffleModeChangedRemoved = i;
        anyRes.onCaptioningEnabledChanged = i;
        anyRes.onExtrasChanged = i;
        anyRes.onVolumeInfoChanged = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        AnyRes anyRes = this.length;
        anyRes.onRepeatModeChanged = i;
        anyRes.onShuffleModeChanged = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.length.onQueueChanged = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        AnyRes anyRes = this.length;
        anyRes.onShuffleModeChangedRemoved = i;
        anyRes.IMediaSession = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.length.onCaptioningEnabledChanged = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.length.IMediaControllerCallback = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.length.setMax = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.length.getMin = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.length.MediaBrowserCompat$SearchResultReceiver = f;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.length.MediaMetadataCompat$RatingKey = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.length.length = i;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.length.setMin = i;
        requestLayout();
    }

    public void setFirstHorizontalBias(float f) {
        this.length.MediaMetadataCompat = f;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.length.MediaMetadataCompat$BitmapKey = f;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.length.onEvent = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.length.RatingCompat = i;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.length.RatingCompat$StarStyle = i;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.length.RatingCompat$Style = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.length.onQueueTitleChanged = i;
        requestLayout();
    }
}
