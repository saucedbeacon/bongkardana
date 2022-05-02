package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.BeepManager;
import com.google.zxing.client.android.InactivityTimer;
import com.google.zxing.client.android.Intents;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

public class applyOptions {
    public static int getMin = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
    /* access modifiers changed from: private */
    public static final String values = applyOptions.class.getSimpleName();
    /* access modifiers changed from: private */
    public boolean FastBitmap$CoordinateSystem = false;
    private final CameraPreview.setMax Grayscale$Algorithm = new CameraPreview.setMax() {
        public final void getMax() {
        }

        public final void length() {
        }

        public final void setMin() {
        }

        public final void getMax(Exception exc) {
            applyOptions applyoptions = applyOptions.this;
            applyoptions.length(applyoptions.length.getString(R.string.zxing_msg_camera_framework_bug));
        }

        public final void getMin() {
            if (applyOptions.this.FastBitmap$CoordinateSystem) {
                String unused = applyOptions.values;
                applyOptions.this.length.finish();
            }
        }
    };
    public boolean IsOverlapping = true;
    public String equals = "";
    public int getMax = -1;
    public boolean hashCode = false;
    public BeepManager isInside;
    public Activity length;
    public boolean setMax = false;
    public DecoratedBarcodeView setMin;
    public Handler toDoubleRange;
    public boolean toFloatRange = false;
    public InactivityTimer toIntRange;
    public performLoadItem toString = new performLoadItem() {
        public final void getMin(List<ResultPoint> list) {
        }

        public final void getMax(performLoadChildren performloadchildren) {
            applyOptions.this.setMin.pause();
            applyOptions.this.isInside.playBeepSoundAndVibrate();
            applyOptions.this.toDoubleRange.post(new VolumeProviderCompat$ControlType(this, performloadchildren));
        }

        static /* synthetic */ void setMin(AnonymousClass1 r6, performLoadChildren performloadchildren) {
            applyOptions applyoptions = applyOptions.this;
            String length2 = applyoptions.length(performloadchildren);
            Intent intent = new Intent(Intents.Scan.ACTION);
            intent.addFlags(524288);
            intent.putExtra(Intents.Scan.RESULT, performloadchildren.toString());
            intent.putExtra(Intents.Scan.RESULT_FORMAT, performloadchildren.setMax().toString());
            byte[] length3 = performloadchildren.length();
            if (length3 != null && length3.length > 0) {
                intent.putExtra(Intents.Scan.RESULT_BYTES, length3);
            }
            Map<ResultMetadataType, Object> max = performloadchildren.getMax();
            if (max != null) {
                if (max.containsKey(ResultMetadataType.UPC_EAN_EXTENSION)) {
                    intent.putExtra(Intents.Scan.RESULT_UPC_EAN_EXTENSION, max.get(ResultMetadataType.UPC_EAN_EXTENSION).toString());
                }
                Number number = (Number) max.get(ResultMetadataType.ORIENTATION);
                if (number != null) {
                    intent.putExtra(Intents.Scan.RESULT_ORIENTATION, number.intValue());
                }
                String str = (String) max.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
                if (str != null) {
                    intent.putExtra(Intents.Scan.RESULT_ERROR_CORRECTION_LEVEL, str);
                }
                Iterable<byte[]> iterable = (Iterable) max.get(ResultMetadataType.BYTE_SEGMENTS);
                if (iterable != null) {
                    int i = 0;
                    for (byte[] putExtra : iterable) {
                        intent.putExtra(Intents.Scan.RESULT_BYTE_SEGMENTS_PREFIX.concat(String.valueOf(i)), putExtra);
                        i++;
                    }
                }
            }
            if (length2 != null) {
                intent.putExtra(Intents.Scan.RESULT_BARCODE_IMAGE_PATH, length2);
            }
            applyoptions.length.setResult(-1, intent);
            applyoptions.setMin();
        }
    };

    public applyOptions(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        this.length = activity;
        this.setMin = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().addStateListener(this.Grayscale$Algorithm);
        this.toDoubleRange = new Handler();
        this.toIntRange = new InactivityTimer(activity, new onReceive(this));
        this.isInside = new BeepManager(activity);
    }

    public final void length(int i, int[] iArr) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1933822352, oncanceled);
            onCancelLoad.getMin(1933822352, oncanceled);
        }
        if (i != getMin) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Intent intent = new Intent(Intents.Scan.ACTION);
            intent.putExtra(Intents.Scan.MISSING_CAMERA_PERMISSION, true);
            this.length.setResult(0, intent);
            if (this.IsOverlapping) {
                length(this.equals);
            } else {
                setMin();
            }
        } else {
            this.setMin.resume();
        }
    }

    /* access modifiers changed from: package-private */
    public final String length(performLoadChildren performloadchildren) {
        if (this.setMax) {
            Bitmap min = performloadchildren.setMin();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.length.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                min.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        if (this.setMin.getBarcodeView().isCameraClosed()) {
            this.length.finish();
        } else {
            this.FastBitmap$CoordinateSystem = true;
        }
        this.setMin.pause();
        this.toIntRange.cancel();
    }

    /* access modifiers changed from: protected */
    public final void length(String str) {
        if (!this.length.isFinishing() && !this.toFloatRange && !this.FastBitmap$CoordinateSystem) {
            if (str.isEmpty()) {
                str = this.length.getString(R.string.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.length);
            builder.setTitle(this.length.getString(R.string.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(R.string.zxing_button_ok, new handleIntent(this));
            builder.setOnCancelListener(new performCustomAction(this));
            builder.show();
        }
    }
}
