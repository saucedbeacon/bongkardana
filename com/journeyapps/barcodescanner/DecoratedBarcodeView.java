package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.DecodeFormatManager;
import com.google.zxing.client.android.DecodeHintManager;
import com.google.zxing.client.android.Intents;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.MultiDexApplication;
import o.buildMediaButtonPendingIntent;
import o.getExtraLayoutSpace;
import o.performLoadChildren;
import o.performLoadItem;

public class DecoratedBarcodeView extends FrameLayout {
    /* access modifiers changed from: private */
    public ViewfinderView getMax;
    private getMax getMin;
    private BarcodeView length;
    private TextView setMin;

    public interface getMax {
    }

    class setMax implements performLoadItem {
        private performLoadItem setMin;

        public setMax(performLoadItem performloaditem) {
            this.setMin = performloaditem;
        }

        public final void getMax(performLoadChildren performloadchildren) {
            this.setMin.getMax(performloadchildren);
        }

        public final void getMin(List<ResultPoint> list) {
            for (ResultPoint addPossibleResultPoint : list) {
                DecoratedBarcodeView.this.getMax.addPossibleResultPoint(addPossibleResultPoint);
            }
            this.setMin.getMin(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        setMin((AttributeSet) null);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin(attributeSet);
    }

    private void setMin(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.zxing_view_zxing_scanner_layout, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.length = barcodeView;
        if (barcodeView != null) {
            barcodeView.initializeAttributes(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.getMax = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.length);
                this.setMin = (TextView) findViewById(R.id.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void initializeFromIntent(Intent intent) {
        int intExtra;
        Set<BarcodeFormat> parseDecodeFormats = DecodeFormatManager.parseDecodeFormats(intent);
        Map<DecodeHintType, Object> parseDecodeHints = DecodeHintManager.parseDecodeHints(intent);
        CameraSettings cameraSettings = new CameraSettings();
        if (intent.hasExtra(Intents.Scan.CAMERA_ID) && (intExtra = intent.getIntExtra(Intents.Scan.CAMERA_ID, -1)) >= 0) {
            cameraSettings.setMax = intExtra;
        }
        if (intent.hasExtra(Intents.Scan.TORCH_ENABLED) && intent.getBooleanExtra(Intents.Scan.TORCH_ENABLED, false)) {
            setTorchOn();
        }
        String stringExtra = intent.getStringExtra(Intents.Scan.PROMPT_MESSAGE);
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra(Intents.Scan.SCAN_TYPE, 0);
        String stringExtra2 = intent.getStringExtra(Intents.Scan.CHARACTER_SET);
        new MultiFormatReader().setHints(parseDecodeHints);
        this.length.setCameraSettings(cameraSettings);
        this.length.setDecoderFactory(new MultiDexApplication(parseDecodeFormats, parseDecodeHints, stringExtra2, intExtra2));
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.length.setCameraSettings(cameraSettings);
    }

    public void setDecoderFactory(buildMediaButtonPendingIntent buildmediabuttonpendingintent) {
        this.length.setDecoderFactory(buildmediabuttonpendingintent);
    }

    public buildMediaButtonPendingIntent getDecoderFactory() {
        return this.length.getDecoderFactory();
    }

    public CameraSettings getCameraSettings() {
        return this.length.getCameraSettings();
    }

    public void setStatusText(String str) {
        TextView textView = this.setMin;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void pause() {
        this.length.pause();
    }

    public void pauseAndWait() {
        this.length.pauseAndWait();
    }

    public void resume() {
        this.length.resume();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public ViewfinderView getViewFinder() {
        return this.getMax;
    }

    public TextView getStatusView() {
        return this.setMin;
    }

    public void decodeSingle(performLoadItem performloaditem) {
        this.length.decodeSingle(new setMax(performloaditem));
    }

    public void decodeContinuous(performLoadItem performloaditem) {
        this.length.decodeContinuous(new setMax(performloaditem));
    }

    public void setTorchOn() {
        this.length.setTorch(true);
    }

    public void setTorchOff() {
        this.length.setTorch(false);
    }

    public void changeCameraParameters(getExtraLayoutSpace getextralayoutspace) {
        this.length.changeCameraParameters(getextralayoutspace);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        } else if (i == 25) {
            setTorchOff();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setTorchListener(getMax getmax) {
        this.getMin = getmax;
    }
}
