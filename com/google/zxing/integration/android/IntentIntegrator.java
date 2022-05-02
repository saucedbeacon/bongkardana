package com.google.zxing.integration.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.zxing.client.android.Intents;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntentIntegrator {
    public static final Collection<String> ALL_CODE_TYPES = null;
    public static final String CODE_128 = "CODE_128";
    public static final String CODE_39 = "CODE_39";
    public static final String CODE_93 = "CODE_93";
    public static final String DATA_MATRIX = "DATA_MATRIX";
    public static final String EAN_13 = "EAN_13";
    public static final String EAN_8 = "EAN_8";
    public static final String ITF = "ITF";
    public static final Collection<String> ONE_D_CODE_TYPES = list(UPC_A, UPC_E, EAN_8, EAN_13, RSS_14, CODE_39, CODE_93, CODE_128, ITF, RSS_14, RSS_EXPANDED);
    public static final String PDF_417 = "PDF_417";
    public static final Collection<String> PRODUCT_CODE_TYPES = list(UPC_A, UPC_E, EAN_8, EAN_13, RSS_14);
    public static final String QR_CODE = "QR_CODE";
    public static final int REQUEST_CODE = 49374;
    public static final String RSS_14 = "RSS_14";
    public static final String RSS_EXPANDED = "RSS_EXPANDED";
    private static final String TAG = IntentIntegrator.class.getSimpleName();
    public static final String UPC_A = "UPC_A";
    public static final String UPC_E = "UPC_E";
    private final Activity activity;
    private Class<?> captureActivity;
    private Collection<String> desiredBarcodeFormats;
    private Fragment fragment;
    private final Map<String, Object> moreExtras = new HashMap(3);
    private int requestCode = REQUEST_CODE;
    private androidx.fragment.app.Fragment supportFragment;

    /* access modifiers changed from: protected */
    public Class<?> getDefaultCaptureActivity() {
        return CaptureActivity.class;
    }

    public IntentIntegrator(Activity activity2) {
        this.activity = activity2;
    }

    public Class<?> getCaptureActivity() {
        if (this.captureActivity == null) {
            this.captureActivity = getDefaultCaptureActivity();
        }
        return this.captureActivity;
    }

    public IntentIntegrator setCaptureActivity(Class<?> cls) {
        this.captureActivity = cls;
        return this;
    }

    public IntentIntegrator setRequestCode(int i) {
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("requestCode out of range");
        }
        this.requestCode = i;
        return this;
    }

    public static IntentIntegrator forSupportFragment(androidx.fragment.app.Fragment fragment2) {
        IntentIntegrator intentIntegrator = new IntentIntegrator(fragment2.getActivity());
        intentIntegrator.supportFragment = fragment2;
        return intentIntegrator;
    }

    @TargetApi(11)
    public static IntentIntegrator forFragment(Fragment fragment2) {
        IntentIntegrator intentIntegrator = new IntentIntegrator(fragment2.getActivity());
        intentIntegrator.fragment = fragment2;
        return intentIntegrator;
    }

    public Map<String, ?> getMoreExtras() {
        return this.moreExtras;
    }

    public final IntentIntegrator addExtra(String str, Object obj) {
        this.moreExtras.put(str, obj);
        return this;
    }

    public final IntentIntegrator setPrompt(String str) {
        if (str != null) {
            addExtra(Intents.Scan.PROMPT_MESSAGE, str);
        }
        return this;
    }

    public IntentIntegrator setOrientationLocked(boolean z) {
        addExtra(Intents.Scan.ORIENTATION_LOCKED, Boolean.valueOf(z));
        return this;
    }

    public IntentIntegrator setCameraId(int i) {
        if (i >= 0) {
            addExtra(Intents.Scan.CAMERA_ID, Integer.valueOf(i));
        }
        return this;
    }

    public IntentIntegrator setTorchEnabled(boolean z) {
        addExtra(Intents.Scan.TORCH_ENABLED, Boolean.valueOf(z));
        return this;
    }

    public IntentIntegrator setBeepEnabled(boolean z) {
        addExtra(Intents.Scan.BEEP_ENABLED, Boolean.valueOf(z));
        return this;
    }

    public IntentIntegrator setBarcodeImageEnabled(boolean z) {
        addExtra(Intents.Scan.BARCODE_IMAGE_ENABLED, Boolean.valueOf(z));
        return this;
    }

    public IntentIntegrator setDesiredBarcodeFormats(Collection<String> collection) {
        this.desiredBarcodeFormats = collection;
        return this;
    }

    public IntentIntegrator setDesiredBarcodeFormats(String... strArr) {
        this.desiredBarcodeFormats = Arrays.asList(strArr);
        return this;
    }

    public final void initiateScan() {
        startActivityForResult(createScanIntent(), this.requestCode);
    }

    public IntentIntegrator setTimeout(long j) {
        addExtra(Intents.Scan.TIMEOUT, Long.valueOf(j));
        return this;
    }

    public Intent createScanIntent() {
        Intent intent = new Intent(this.activity, getCaptureActivity());
        intent.setAction(Intents.Scan.ACTION);
        if (this.desiredBarcodeFormats != null) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.desiredBarcodeFormats) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(next);
            }
            intent.putExtra(Intents.Scan.FORMATS, sb.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        attachMoreExtras(intent);
        return intent;
    }

    public final void initiateScan(Collection<String> collection) {
        setDesiredBarcodeFormats(collection);
        initiateScan();
    }

    /* access modifiers changed from: protected */
    public void startActivityForResult(Intent intent, int i) {
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i);
            return;
        }
        androidx.fragment.app.Fragment fragment3 = this.supportFragment;
        if (fragment3 != null) {
            fragment3.startActivityForResult(intent, i);
        } else {
            this.activity.startActivityForResult(intent, i);
        }
    }

    /* access modifiers changed from: protected */
    public void startActivity(Intent intent) {
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            fragment2.startActivity(intent);
            return;
        }
        androidx.fragment.app.Fragment fragment3 = this.supportFragment;
        if (fragment3 != null) {
            fragment3.startActivity(intent);
        } else {
            this.activity.startActivity(intent);
        }
    }

    public static IntentResult parseActivityResult(int i, int i2, Intent intent) {
        if (i == 49374) {
            return parseActivityResult(i2, intent);
        }
        return null;
    }

    public static IntentResult parseActivityResult(int i, Intent intent) {
        Integer num;
        if (i != -1) {
            return new IntentResult(intent);
        }
        String stringExtra = intent.getStringExtra(Intents.Scan.RESULT);
        String stringExtra2 = intent.getStringExtra(Intents.Scan.RESULT_FORMAT);
        byte[] byteArrayExtra = intent.getByteArrayExtra(Intents.Scan.RESULT_BYTES);
        int intExtra = intent.getIntExtra(Intents.Scan.RESULT_ORIENTATION, Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            num = null;
        } else {
            num = Integer.valueOf(intExtra);
        }
        return new IntentResult(stringExtra, stringExtra2, byteArrayExtra, num, intent.getStringExtra(Intents.Scan.RESULT_ERROR_CORRECTION_LEVEL), intent.getStringExtra(Intents.Scan.RESULT_BARCODE_IMAGE_PATH), intent);
    }

    private static List<String> list(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    private void attachMoreExtras(Intent intent) {
        for (Map.Entry next : this.moreExtras.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Integer) {
                intent.putExtra(str, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(str, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(str, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(str, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(str, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
        }
    }
}
