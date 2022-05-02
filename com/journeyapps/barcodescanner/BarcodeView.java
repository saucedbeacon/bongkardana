package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.DecodeHintType;
import com.google.zxing.client.android.R;
import java.util.HashMap;
import java.util.List;
import o.ContiguousPagedList$FetchState;
import o.MultiDexApplication;
import o.PageResult$ResultType;
import o.buildMediaButtonPendingIntent;
import o.getMediaButtonReceiverComponent;
import o.performLoadChildren;
import o.performLoadItem;

public class BarcodeView extends CameraPreview {
    /* access modifiers changed from: private */
    public DecodeMode getMax = DecodeMode.NONE;
    private Handler getMin = new Handler(this.toFloatRange);
    /* access modifiers changed from: private */
    public performLoadItem length = null;
    private getMediaButtonReceiverComponent setMax;
    private buildMediaButtonPendingIntent setMin = new MultiDexApplication();
    private final Handler.Callback toFloatRange = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == R.id.zxing_decode_succeeded) {
                performLoadChildren performloadchildren = (performLoadChildren) message.obj;
                if (!(performloadchildren == null || BarcodeView.this.length == null || BarcodeView.this.getMax == DecodeMode.NONE)) {
                    BarcodeView.this.length.getMax(performloadchildren);
                    if (BarcodeView.this.getMax == DecodeMode.SINGLE) {
                        BarcodeView.this.stopDecoding();
                    }
                }
                return true;
            } else if (message.what == R.id.zxing_decode_failed) {
                return true;
            } else {
                if (message.what != R.id.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.length == null || BarcodeView.this.getMax == DecodeMode.NONE)) {
                    BarcodeView.this.length.getMin(list);
                }
                return true;
            }
        }
    };

    enum DecodeMode {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private ContiguousPagedList$FetchState setMax() {
        if (this.setMin == null) {
            this.setMin = createDefaultDecoderFactory();
        }
        PageResult$ResultType pageResult$ResultType = new PageResult$ResultType();
        HashMap hashMap = new HashMap();
        hashMap.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, pageResult$ResultType);
        ContiguousPagedList$FetchState min = this.setMin.getMin(hashMap);
        pageResult$ResultType.setMin = min;
        return min;
    }

    public buildMediaButtonPendingIntent getDecoderFactory() {
        return this.setMin;
    }

    public void decodeSingle(performLoadItem performloaditem) {
        this.getMax = DecodeMode.SINGLE;
        this.length = performloaditem;
        getMax();
    }

    public void decodeContinuous(performLoadItem performloaditem) {
        this.getMax = DecodeMode.CONTINUOUS;
        this.length = performloaditem;
        getMax();
    }

    public void stopDecoding() {
        this.getMax = DecodeMode.NONE;
        this.length = null;
        getMediaButtonReceiverComponent getmediabuttonreceivercomponent = this.setMax;
        if (getmediabuttonreceivercomponent != null) {
            getmediabuttonreceivercomponent.setMax();
            this.setMax = null;
        }
    }

    /* access modifiers changed from: protected */
    public buildMediaButtonPendingIntent createDefaultDecoderFactory() {
        return new MultiDexApplication();
    }

    /* access modifiers changed from: protected */
    public void previewStarted() {
        super.previewStarted();
        getMax();
    }

    public void setDecoderFactory(buildMediaButtonPendingIntent buildmediabuttonpendingintent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.setMin = buildmediabuttonpendingintent;
            getMediaButtonReceiverComponent getmediabuttonreceivercomponent = this.setMax;
            if (getmediabuttonreceivercomponent != null) {
                getmediabuttonreceivercomponent.getMin = setMax();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    private void getMax() {
        getMediaButtonReceiverComponent getmediabuttonreceivercomponent = this.setMax;
        if (getmediabuttonreceivercomponent != null) {
            getmediabuttonreceivercomponent.setMax();
            this.setMax = null;
        }
        if (this.getMax != DecodeMode.NONE && isPreviewActive()) {
            getMediaButtonReceiverComponent getmediabuttonreceivercomponent2 = new getMediaButtonReceiverComponent(getCameraInstance(), setMax(), this.getMin);
            this.setMax = getmediabuttonreceivercomponent2;
            getmediabuttonreceivercomponent2.getMax = getPreviewFramingRect();
            this.setMax.getMin();
        }
    }

    public void pause() {
        getMediaButtonReceiverComponent getmediabuttonreceivercomponent = this.setMax;
        if (getmediabuttonreceivercomponent != null) {
            getmediabuttonreceivercomponent.setMax();
            this.setMax = null;
        }
        super.pause();
    }
}
