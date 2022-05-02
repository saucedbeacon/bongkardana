package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import o.IntRange;
import o.dispatchOnCancelled;
import o.getTransformedBoundingBox;
import o.onAddFocusables;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.setMeasurementCacheEnabled;

public class UCropActivity extends AppCompatActivity {
    public static final int ALL = 3;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    public static final int SCALE = 1;
    public static final byte[] length = {34, -55, -33, ImageFileType.HEAD_WEBP_0, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 13;
    private int FastBitmap$CoordinateSystem;
    private ViewGroup Grayscale$Algorithm;
    private ViewGroup ICustomTabsCallback;
    @DrawableRes
    private int IsOverlapping;
    private ViewGroup Mean$Arithmetic;
    private final View.OnClickListener asBinder = new View.OnClickListener() {
        public final void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.getMin(view.getId());
            }
        }
    };
    /* access modifiers changed from: private */
    public List<ViewGroup> b = new ArrayList();
    private TextView create;
    @DrawableRes
    private int equals;
    private int[] extraCallback = {1, 2, 3};
    private Bitmap.CompressFormat extraCallbackWithResult = DEFAULT_COMPRESS_FORMAT;
    private ViewGroup getCause;
    private int getMax;
    private int getMin;
    /* access modifiers changed from: private */
    public UCropView hashCode;
    private OverlayView invoke;
    private ViewGroup invokeSuspend;
    @ColorInt
    private int isInside;
    private TransformImageView.getMax onMessageChannelReady = new TransformImageView.getMax() {
        public final void setMax(float f) {
            UCropActivity.access$000(UCropActivity.this, f);
        }

        public final void length(float f) {
            UCropActivity.access$100(UCropActivity.this, f);
        }

        public final void setMax() {
            UCropActivity.this.hashCode.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.onPostMessage.setClickable(false);
            boolean unused = UCropActivity.this.toDoubleRange = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        public final void getMin(@NonNull Exception exc) {
            UCropActivity.this.setResultError(exc);
            UCropActivity.this.finish();
        }
    };
    private TextView onNavigationEvent;
    /* access modifiers changed from: private */
    public View onPostMessage;
    private int onRelationshipValidationResult = 90;
    private String setMax;
    /* access modifiers changed from: private */
    public boolean toDoubleRange = true;
    private int toFloatRange;
    private int toIntRange;
    private boolean toString;
    private ViewGroup valueOf;
    /* access modifiers changed from: private */
    public GestureCropImageView values;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(byte r7, short r8, short r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = length
            int r7 = r7 * 165
            int r7 = 176 - r7
            int r9 = r9 * 45
            int r9 = r9 + 56
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L_0x0031
        L_0x0018:
            r3 = 0
        L_0x0019:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L_0x0028
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0028:
            byte r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r6
        L_0x0031:
            int r7 = -r7
            int r0 = r0 + r7
            int r7 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.length(byte, short, short):java.lang.String");
    }

    static /* synthetic */ void access$100(UCropActivity uCropActivity, float f) {
        int length2;
        int min;
        Context baseContext = uCropActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-520394989, oncanceled);
            onCancelLoad.getMin(-520394989, oncanceled);
        }
        TextView textView = uCropActivity.create;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int length3;
        int min2;
        Window window;
        int length4;
        int min3;
        int min4;
        int length5;
        int length6;
        int min5;
        int max;
        byte[] bArr = length;
        String length7 = length((byte) bArr[8], (short) bArr[85], (byte) bArr[96]);
        byte[] bArr2 = length;
        String length8 = length((byte) bArr2[96], 174, (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length7, length8);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length9 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length9) {
            onCanceled oncanceled = new onCanceled(nextInt, length9, 1);
            onCancelLoad.setMax(1422509577, oncanceled);
            onCancelLoad.getMin(1422509577, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1422509577 == (max = dispatchOnCancelled.getMax(applicationContext2, 1422509577)))) {
            onCanceled oncanceled2 = new onCanceled(1422509577, max, 512);
            onCancelLoad.setMax(1422509577, oncanceled2);
            onCancelLoad.getMin(1422509577, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length6 = applicationContext3.fileList().length) == (min5 = dispatchOnCancelled.setMin(applicationContext3, length6)))) {
            onCanceled oncanceled3 = new onCanceled(length6, min5, 8);
            onCancelLoad.setMax(1422509577, oncanceled3);
            onCancelLoad.getMin(1422509577, oncanceled3);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1422509577, oncanceled4);
            onCancelLoad.getMin(1422509577, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(setMeasurementCacheEnabled.setMax.ucrop_activity_photobox);
        Intent intent = getIntent();
        this.getMax = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", IntRange.setMax(this, setMeasurementCacheEnabled.getMin.equals));
        this.getMin = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", IntRange.setMax(this, setMeasurementCacheEnabled.getMin.isInside));
        this.toIntRange = intent.getIntExtra("com.yalantis.ucrop.UcropColorWidgetActive", IntRange.setMax(this, setMeasurementCacheEnabled.getMin.FastBitmap$CoordinateSystem));
        this.toFloatRange = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", IntRange.setMax(this, setMeasurementCacheEnabled.getMin.IsOverlapping));
        this.IsOverlapping = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", setMeasurementCacheEnabled.getMax.ucrop_ic_cross);
        this.equals = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", setMeasurementCacheEnabled.getMax.ucrop_ic_done);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.setMax = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(setMeasurementCacheEnabled.equals.ucrop_label_edit_photo);
        }
        this.setMax = stringExtra;
        this.FastBitmap$CoordinateSystem = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", IntRange.setMax(this, setMeasurementCacheEnabled.getMin.getMax));
        this.toString = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.isInside = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", IntRange.setMax(this, setMeasurementCacheEnabled.getMin.length));
        int max3 = dispatchOnCancelled.getMax(0);
        if (max3 != 0) {
            onCanceled oncanceled5 = new onCanceled(0, max3, 16);
            onCancelLoad.setMax(301189715, oncanceled5);
            onCancelLoad.getMin(301189715, oncanceled5);
        }
        int i = this.getMax;
        Context baseContext4 = getBaseContext();
        Context applicationContext4 = baseContext4 != null ? baseContext4.getApplicationContext() : null;
        if (!(applicationContext4 == null || i == (length5 = dispatchOnCancelled.length(applicationContext4, i)))) {
            onCanceled oncanceled6 = new onCanceled(i, length5, 4);
            onCancelLoad.setMax(-253674033, oncanceled6);
            onCancelLoad.getMin(-253674033, oncanceled6);
        }
        Context baseContext5 = getBaseContext();
        Context applicationContext5 = baseContext5 != null ? baseContext5.getApplicationContext() : null;
        if (!(applicationContext5 == null || i == (min4 = dispatchOnCancelled.setMin(applicationContext5, i)))) {
            onCanceled oncanceled7 = new onCanceled(i, min4, 8);
            onCancelLoad.setMax(-253674033, oncanceled7);
            onCancelLoad.getMin(-253674033, oncanceled7);
        }
        Context baseContext6 = getBaseContext();
        Context applicationContext6 = baseContext6 != null ? baseContext6.getApplicationContext() : null;
        if (!(applicationContext6 == null || (length4 = applicationContext6.fileList().length) == (min3 = dispatchOnCancelled.getMin(applicationContext6, length4)))) {
            onCanceled oncanceled8 = new onCanceled(length4, min3, 32);
            onCancelLoad.setMax(-253674033, oncanceled8);
            onCancelLoad.getMin(-253674033, oncanceled8);
        }
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
        Toolbar toolbar = (Toolbar) findViewById(setMeasurementCacheEnabled.length.invokeSuspend);
        toolbar.setBackgroundColor(this.getMin);
        toolbar.setTitleTextColor(this.toFloatRange);
        TextView textView = (TextView) toolbar.findViewById(setMeasurementCacheEnabled.length.valueOf);
        textView.setTextColor(this.toFloatRange);
        textView.setText(this.setMax);
        Drawable mutate = IntRange.length((Context) this, this.IsOverlapping).mutate();
        mutate.setColorFilter(this.toFloatRange, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setMax();
        }
        UCropView uCropView = (UCropView) findViewById(setMeasurementCacheEnabled.length.invoke);
        this.hashCode = uCropView;
        this.values = uCropView.getCropImageView();
        this.invoke = this.hashCode.getOverlayView();
        this.values.setTransformImageListener(this.onMessageChannelReady);
        ((ImageView) findViewById(setMeasurementCacheEnabled.length.length)).setColorFilter(this.FastBitmap$CoordinateSystem, PorterDuff.Mode.SRC_ATOP);
        findViewById(setMeasurementCacheEnabled.length.ICustomTabsCallback).setBackgroundColor(this.isInside);
        if (this.toString) {
            View.inflate(this, setMeasurementCacheEnabled.setMax.ucrop_controls, (ViewGroup) findViewById(setMeasurementCacheEnabled.length.onNavigationEvent));
            ViewGroup viewGroup = (ViewGroup) findViewById(setMeasurementCacheEnabled.length.toString);
            this.Grayscale$Algorithm = viewGroup;
            viewGroup.setOnClickListener(this.asBinder);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(setMeasurementCacheEnabled.length.values);
            this.invokeSuspend = viewGroup2;
            viewGroup2.setOnClickListener(this.asBinder);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(setMeasurementCacheEnabled.length.toDoubleRange);
            this.valueOf = viewGroup3;
            viewGroup3.setOnClickListener(this.asBinder);
            this.Mean$Arithmetic = (ViewGroup) findViewById(setMeasurementCacheEnabled.length.toFloatRange);
            this.getCause = (ViewGroup) findViewById(setMeasurementCacheEnabled.length.IsOverlapping);
            this.ICustomTabsCallback = (ViewGroup) findViewById(setMeasurementCacheEnabled.length.toIntRange);
            getMin(intent);
            Context baseContext7 = getBaseContext();
            Context applicationContext7 = baseContext7 != null ? baseContext7.getApplicationContext() : null;
            if (!(applicationContext7 == null || (length3 = applicationContext7.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext7, length3)))) {
                onCanceled oncanceled9 = new onCanceled(length3, min2, 32);
                onCancelLoad.setMax(122080838, oncanceled9);
                onCancelLoad.getMin(122080838, oncanceled9);
            }
            this.onNavigationEvent = (TextView) findViewById(setMeasurementCacheEnabled.length.Mean$Arithmetic);
            ((HorizontalProgressWheelView) findViewById(setMeasurementCacheEnabled.length.FastBitmap$CoordinateSystem)).setScrollingListener(new HorizontalProgressWheelView.getMin() {
                public final void length(float f) {
                    UCropActivity.this.values.postRotate(f / 42.0f);
                }

                public final void getMin() {
                    UCropActivity.this.values.setImageToWrapCropBounds();
                }

                public final void setMin() {
                    UCropActivity.this.values.cancelAllAnimations();
                }
            });
            ((HorizontalProgressWheelView) findViewById(setMeasurementCacheEnabled.length.FastBitmap$CoordinateSystem)).setMiddleLineColor(this.toIntRange);
            findViewById(setMeasurementCacheEnabled.length.create).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    UCropActivity.access$700(UCropActivity.this);
                }
            });
            findViewById(setMeasurementCacheEnabled.length.getCause).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    UCropActivity.access$800(UCropActivity.this, 90);
                }
            });
            this.create = (TextView) findViewById(setMeasurementCacheEnabled.length.Grayscale$Algorithm);
            ((HorizontalProgressWheelView) findViewById(setMeasurementCacheEnabled.length.hashCode)).setScrollingListener(new HorizontalProgressWheelView.getMin() {
                public final void length(float f) {
                    if (f > 0.0f) {
                        UCropActivity.this.values.zoomInImage(UCropActivity.this.values.getCurrentScale() + (f * ((UCropActivity.this.values.getMaxScale() - UCropActivity.this.values.getMinScale()) / 15000.0f)));
                    } else {
                        UCropActivity.this.values.zoomOutImage(UCropActivity.this.values.getCurrentScale() + (f * ((UCropActivity.this.values.getMaxScale() - UCropActivity.this.values.getMinScale()) / 15000.0f)));
                    }
                }

                public final void getMin() {
                    UCropActivity.this.values.setImageToWrapCropBounds();
                }

                public final void setMin() {
                    UCropActivity.this.values.cancelAllAnimations();
                }
            });
            ((HorizontalProgressWheelView) findViewById(setMeasurementCacheEnabled.length.hashCode)).setMiddleLineColor(this.toIntRange);
            ImageView imageView = (ImageView) findViewById(setMeasurementCacheEnabled.length.setMin);
            ImageView imageView2 = (ImageView) findViewById(setMeasurementCacheEnabled.length.getMin);
            ImageView imageView3 = (ImageView) findViewById(setMeasurementCacheEnabled.length.setMax);
            imageView.setImageDrawable(new onAddFocusables(imageView.getDrawable(), this.toIntRange));
            imageView2.setImageDrawable(new onAddFocusables(imageView2.getDrawable(), this.toIntRange));
            imageView3.setImageDrawable(new onAddFocusables(imageView3.getDrawable(), this.toIntRange));
        }
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        String stringExtra2 = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf2 = !TextUtils.isEmpty(stringExtra2) ? Bitmap.CompressFormat.valueOf(stringExtra2) : null;
        if (valueOf2 == null) {
            valueOf2 = DEFAULT_COMPRESS_FORMAT;
        }
        this.extraCallbackWithResult = valueOf2;
        this.onRelationshipValidationResult = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.extraCallback = intArrayExtra;
        }
        this.values.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.values.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.values.setImageToWrapCropBoundsAnimDuration((long) intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.invoke.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.invoke.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(setMeasurementCacheEnabled.getMin.getMin)));
        this.invoke.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.invoke.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.invoke.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(setMeasurementCacheEnabled.getMin.setMin)));
        this.invoke.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.getMin)));
        this.invoke.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.invoke.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.invoke.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.invoke.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(setMeasurementCacheEnabled.getMin.setMax)));
        this.invoke.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.setMax)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup4 = this.Grayscale$Algorithm;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            this.values.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.values.setTargetAspectRatio(0.0f);
        } else {
            this.values.setTargetAspectRatio(((AspectRatio) parcelableArrayListExtra.get(intExtra)).length / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).setMax);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.values.setMaxResultImageSizeX(intExtra2);
            this.values.setMaxResultImageSizeY(intExtra3);
        }
        if (uri == null || uri2 == null) {
            setResultError(new NullPointerException(getString(setMeasurementCacheEnabled.equals.ucrop_error_input_data_is_absent)));
            finish();
        } else {
            try {
                this.values.setImageUri(uri, uri2);
            } catch (Exception e) {
                setResultError(e);
                finish();
            }
        }
        if (!this.toString) {
            setMin(0);
        } else if (this.Grayscale$Algorithm.getVisibility() == 0) {
            getMin(setMeasurementCacheEnabled.length.toString);
        } else {
            getMin(setMeasurementCacheEnabled.length.toDoubleRange);
        }
        Context baseContext8 = getBaseContext();
        if (baseContext8 != null) {
            context = baseContext8.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled10 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(2021931111, oncanceled10);
            onCancelLoad.getMin(2021931111, oncanceled10);
        }
        if (this.onPostMessage == null) {
            this.onPostMessage = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, setMeasurementCacheEnabled.length.invokeSuspend);
            this.onPostMessage.setLayoutParams(layoutParams);
            this.onPostMessage.setClickable(true);
        }
        ((RelativeLayout) findViewById(setMeasurementCacheEnabled.length.onNavigationEvent)).addView(this.onPostMessage);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(setMeasurementCacheEnabled.toIntRange.setMax, menu);
        MenuItem findItem = menu.findItem(setMeasurementCacheEnabled.length.equals);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.toFloatRange, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                e.getMessage();
                getString(setMeasurementCacheEnabled.equals.ucrop_mutate_exception_hint);
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(setMeasurementCacheEnabled.length.isInside);
        Drawable length2 = IntRange.length((Context) this, this.equals);
        if (length2 == null) {
            return true;
        }
        length2.mutate();
        length2.setColorFilter(this.toFloatRange, PorterDuff.Mode.SRC_ATOP);
        findItem2.setIcon(length2);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(setMeasurementCacheEnabled.length.isInside).setVisible(!this.toDoubleRange);
        menu.findItem(setMeasurementCacheEnabled.length.equals).setVisible(this.toDoubleRange);
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1844051310, oncanceled);
            onCancelLoad.getMin(-1844051310, oncanceled);
        }
        if (menuItem.getItemId() == setMeasurementCacheEnabled.length.isInside) {
            cropAndSaveImage();
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.values;
        if (gestureCropImageView != null) {
            gestureCropImageView.cancelAllAnimations();
        }
    }

    private void getMin(@NonNull Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio((String) null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(setMeasurementCacheEnabled.equals.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(setMeasurementCacheEnabled.length.toFloatRange);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(setMeasurementCacheEnabled.setMax.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.toIntRange);
            aspectRatioTextView.setAspectRatio((AspectRatio) it.next());
            linearLayout.addView(frameLayout);
            this.b.add(frameLayout);
        }
        this.b.get(intExtra).setSelected(true);
        for (ViewGroup onClickListener : this.b) {
            onClickListener.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    UCropActivity.this.values.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                    UCropActivity.this.values.setImageToWrapCropBounds();
                    if (!view.isSelected()) {
                        for (ViewGroup viewGroup : UCropActivity.this.b) {
                            viewGroup.setSelected(viewGroup == view);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void getMin(@IdRes int i) {
        if (this.toString) {
            this.Grayscale$Algorithm.setSelected(i == setMeasurementCacheEnabled.length.toString);
            this.invokeSuspend.setSelected(i == setMeasurementCacheEnabled.length.values);
            this.valueOf.setSelected(i == setMeasurementCacheEnabled.length.toDoubleRange);
            int i2 = 8;
            this.Mean$Arithmetic.setVisibility(i == setMeasurementCacheEnabled.length.toString ? 0 : 8);
            this.getCause.setVisibility(i == setMeasurementCacheEnabled.length.values ? 0 : 8);
            ViewGroup viewGroup = this.ICustomTabsCallback;
            if (i == setMeasurementCacheEnabled.length.toDoubleRange) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
            if (i == setMeasurementCacheEnabled.length.toDoubleRange) {
                setMin(0);
            } else if (i == setMeasurementCacheEnabled.length.values) {
                setMin(1);
            } else {
                setMin(2);
            }
        }
    }

    private void setMin(int i) {
        int length2;
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(1832759319, oncanceled);
            onCancelLoad.getMin(1832759319, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1832759319, oncanceled2);
            onCancelLoad.getMin(1832759319, oncanceled2);
        }
        GestureCropImageView gestureCropImageView = this.values;
        int[] iArr = this.extraCallback;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.values;
        int[] iArr2 = this.extraCallback;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void cropAndSaveImage() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1654754979, oncanceled);
            onCancelLoad.getMin(1654754979, oncanceled);
        }
        this.onPostMessage.setClickable(true);
        this.toDoubleRange = true;
        supportInvalidateOptionsMenu();
        this.values.cropAndSaveImage(this.extraCallbackWithResult, this.onRelationshipValidationResult, new getTransformedBoundingBox() {
            public final void getMin(@NonNull Uri uri, int i, int i2, int i3, int i4) {
                UCropActivity uCropActivity = UCropActivity.this;
                uCropActivity.setResultUri(uri, uCropActivity.values.getTargetAspectRatio(), i, i2, i3, i4);
                UCropActivity.this.finish();
            }

            public final void getMin(@NonNull Throwable th) {
                UCropActivity.this.setResultError(th);
                UCropActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void setResultUri(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }

    /* access modifiers changed from: protected */
    public void setResultError(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    static /* synthetic */ void access$000(UCropActivity uCropActivity, float f) {
        TextView textView = uCropActivity.onNavigationEvent;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    static /* synthetic */ void access$700(UCropActivity uCropActivity) {
        GestureCropImageView gestureCropImageView = uCropActivity.values;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        uCropActivity.values.setImageToWrapCropBounds();
    }

    static /* synthetic */ void access$800(UCropActivity uCropActivity, int i) {
        uCropActivity.values.postRotate((float) i);
        uCropActivity.values.setImageToWrapCropBounds();
    }
}
