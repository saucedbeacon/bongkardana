package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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
import o.IntRange;
import o.layoutDecoratedWithMargins;
import o.onAddFocusables;
import o.setMeasurementCacheEnabled;

public class UCropFragment extends Fragment {
    public static final Bitmap.CompressFormat setMax = Bitmap.CompressFormat.JPEG;
    private ViewGroup FastBitmap$CoordinateSystem;
    private TextView Grayscale$Algorithm;
    private TransformImageView.getMax ICustomTabsCallback = new TransformImageView.getMax() {
        public final void setMax(float f) {
            UCropFragment.length(UCropFragment.this, f);
        }

        public final void length(float f) {
            UCropFragment.setMin(UCropFragment.this, f);
        }

        public final void setMax() {
            UCropFragment.this.IsOverlapping.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.invoke.setClickable(false);
            layoutDecoratedWithMargins unused = UCropFragment.this.setMin;
        }

        public final void getMin(@NonNull Exception exc) {
            layoutDecoratedWithMargins unused = UCropFragment.this.setMin;
            new getMax(new Intent().putExtra("com.yalantis.ucrop.Error", exc));
        }
    };
    /* access modifiers changed from: private */
    public UCropView IsOverlapping;
    private Bitmap.CompressFormat Mean$Arithmetic = setMax;
    private final View.OnClickListener b = new View.OnClickListener() {
        public final void onClick(View view) {
            if (!view.isSelected()) {
                UCropFragment.this.getMin(view.getId());
            }
        }
    };
    private int[] create = {1, 2, 3};
    private OverlayView equals;
    @ColorInt
    private int getMax;
    private int getMin;
    private ViewGroup hashCode;
    /* access modifiers changed from: private */
    public View invoke;
    private TextView invokeSuspend;
    private ViewGroup isInside;
    private int length;
    private int onNavigationEvent = 90;
    /* access modifiers changed from: private */
    public layoutDecoratedWithMargins setMin;
    private ViewGroup toDoubleRange;
    /* access modifiers changed from: private */
    public GestureCropImageView toFloatRange;
    private boolean toIntRange;
    private ViewGroup toString;
    /* access modifiers changed from: private */
    public List<ViewGroup> valueOf = new ArrayList();
    private ViewGroup values;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.setMin = (layoutDecoratedWithMargins) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement UCropFragmentCallback");
            throw new ClassCastException(sb.toString());
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(setMeasurementCacheEnabled.setMax.ucrop_fragment_photobox, viewGroup, false);
        Bundle arguments = getArguments();
        this.length = arguments.getInt("com.yalantis.ucrop.UcropColorWidgetActive", IntRange.setMax(getContext(), setMeasurementCacheEnabled.getMin.FastBitmap$CoordinateSystem));
        this.getMin = arguments.getInt("com.yalantis.ucrop.UcropLogoColor", IntRange.setMax(getContext(), setMeasurementCacheEnabled.getMin.getMax));
        this.toIntRange = !arguments.getBoolean("com.yalantis.ucrop.HideBottomControls", false);
        this.getMax = arguments.getInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", IntRange.setMax(getContext(), setMeasurementCacheEnabled.getMin.length));
        UCropView uCropView = (UCropView) inflate.findViewById(setMeasurementCacheEnabled.length.invoke);
        this.IsOverlapping = uCropView;
        this.toFloatRange = uCropView.getCropImageView();
        this.equals = this.IsOverlapping.getOverlayView();
        this.toFloatRange.setTransformImageListener(this.ICustomTabsCallback);
        ((ImageView) inflate.findViewById(setMeasurementCacheEnabled.length.length)).setColorFilter(this.getMin, PorterDuff.Mode.SRC_ATOP);
        inflate.findViewById(setMeasurementCacheEnabled.length.ICustomTabsCallback).setBackgroundColor(this.getMax);
        ViewGroup viewGroup2 = null;
        if (this.toIntRange) {
            View.inflate(getContext(), setMeasurementCacheEnabled.setMax.ucrop_controls, (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.onNavigationEvent));
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.toString);
            this.isInside = viewGroup3;
            viewGroup3.setOnClickListener(this.b);
            ViewGroup viewGroup4 = (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.values);
            this.toDoubleRange = viewGroup4;
            viewGroup4.setOnClickListener(this.b);
            ViewGroup viewGroup5 = (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.toDoubleRange);
            this.hashCode = viewGroup5;
            viewGroup5.setOnClickListener(this.b);
            this.toString = (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.toFloatRange);
            this.FastBitmap$CoordinateSystem = (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.IsOverlapping);
            this.values = (ViewGroup) inflate.findViewById(setMeasurementCacheEnabled.length.toIntRange);
            int i = arguments.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                parcelableArrayList = new ArrayList();
                parcelableArrayList.add(new AspectRatio((String) null, 1.0f, 1.0f));
                parcelableArrayList.add(new AspectRatio((String) null, 3.0f, 4.0f));
                parcelableArrayList.add(new AspectRatio(getString(setMeasurementCacheEnabled.equals.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
                parcelableArrayList.add(new AspectRatio((String) null, 3.0f, 2.0f));
                parcelableArrayList.add(new AspectRatio((String) null, 16.0f, 9.0f));
                i = 2;
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(setMeasurementCacheEnabled.length.toFloatRange);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(setMeasurementCacheEnabled.setMax.ucrop_aspect_ratio, viewGroup2);
                frameLayout.setLayoutParams(layoutParams);
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
                aspectRatioTextView.setActiveColor(this.length);
                aspectRatioTextView.setAspectRatio((AspectRatio) it.next());
                linearLayout.addView(frameLayout);
                this.valueOf.add(frameLayout);
                viewGroup2 = null;
            }
            this.valueOf.get(i).setSelected(true);
            for (ViewGroup onClickListener : this.valueOf) {
                onClickListener.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        UCropFragment.this.toFloatRange.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                        UCropFragment.this.toFloatRange.setImageToWrapCropBounds();
                        if (!view.isSelected()) {
                            for (ViewGroup viewGroup : UCropFragment.this.valueOf) {
                                viewGroup.setSelected(viewGroup == view);
                            }
                        }
                    }
                });
            }
            this.Grayscale$Algorithm = (TextView) inflate.findViewById(setMeasurementCacheEnabled.length.Mean$Arithmetic);
            ((HorizontalProgressWheelView) inflate.findViewById(setMeasurementCacheEnabled.length.FastBitmap$CoordinateSystem)).setScrollingListener(new HorizontalProgressWheelView.getMin() {
                public final void length(float f) {
                    UCropFragment.this.toFloatRange.postRotate(f / 42.0f);
                }

                public final void getMin() {
                    UCropFragment.this.toFloatRange.setImageToWrapCropBounds();
                }

                public final void setMin() {
                    UCropFragment.this.toFloatRange.cancelAllAnimations();
                }
            });
            ((HorizontalProgressWheelView) inflate.findViewById(setMeasurementCacheEnabled.length.FastBitmap$CoordinateSystem)).setMiddleLineColor(this.length);
            inflate.findViewById(setMeasurementCacheEnabled.length.create).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    UCropFragment.isInside(UCropFragment.this);
                }
            });
            inflate.findViewById(setMeasurementCacheEnabled.length.getCause).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    UCropFragment.toFloatRange(UCropFragment.this);
                }
            });
            this.invokeSuspend = (TextView) inflate.findViewById(setMeasurementCacheEnabled.length.Grayscale$Algorithm);
            ((HorizontalProgressWheelView) inflate.findViewById(setMeasurementCacheEnabled.length.hashCode)).setScrollingListener(new HorizontalProgressWheelView.getMin() {
                public final void length(float f) {
                    if (f > 0.0f) {
                        UCropFragment.this.toFloatRange.zoomInImage(UCropFragment.this.toFloatRange.getCurrentScale() + (f * ((UCropFragment.this.toFloatRange.getMaxScale() - UCropFragment.this.toFloatRange.getMinScale()) / 15000.0f)));
                    } else {
                        UCropFragment.this.toFloatRange.zoomOutImage(UCropFragment.this.toFloatRange.getCurrentScale() + (f * ((UCropFragment.this.toFloatRange.getMaxScale() - UCropFragment.this.toFloatRange.getMinScale()) / 15000.0f)));
                    }
                }

                public final void getMin() {
                    UCropFragment.this.toFloatRange.setImageToWrapCropBounds();
                }

                public final void setMin() {
                    UCropFragment.this.toFloatRange.cancelAllAnimations();
                }
            });
            ((HorizontalProgressWheelView) inflate.findViewById(setMeasurementCacheEnabled.length.hashCode)).setMiddleLineColor(this.length);
            ImageView imageView = (ImageView) inflate.findViewById(setMeasurementCacheEnabled.length.setMin);
            ImageView imageView2 = (ImageView) inflate.findViewById(setMeasurementCacheEnabled.length.getMin);
            ImageView imageView3 = (ImageView) inflate.findViewById(setMeasurementCacheEnabled.length.setMax);
            imageView.setImageDrawable(new onAddFocusables(imageView.getDrawable(), this.length));
            imageView2.setImageDrawable(new onAddFocusables(imageView2.getDrawable(), this.length));
            imageView3.setImageDrawable(new onAddFocusables(imageView3.getDrawable(), this.length));
        }
        Uri uri = (Uri) arguments.getParcelable("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) arguments.getParcelable("com.yalantis.ucrop.OutputUri");
        String string = arguments.getString("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf2 = !TextUtils.isEmpty(string) ? Bitmap.CompressFormat.valueOf(string) : null;
        if (valueOf2 == null) {
            valueOf2 = setMax;
        }
        this.Mean$Arithmetic = valueOf2;
        this.onNavigationEvent = arguments.getInt("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArray = arguments.getIntArray("com.yalantis.ucrop.AllowedGestures");
        if (intArray != null && intArray.length == 3) {
            this.create = intArray;
        }
        this.toFloatRange.setMaxBitmapSize(arguments.getInt("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.toFloatRange.setMaxScaleMultiplier(arguments.getFloat("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.toFloatRange.setImageToWrapCropBoundsAnimDuration((long) arguments.getInt("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.equals.setFreestyleCropEnabled(arguments.getBoolean("com.yalantis.ucrop.FreeStyleCrop", false));
        this.equals.setDimmedColor(arguments.getInt("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(setMeasurementCacheEnabled.getMin.getMin)));
        this.equals.setCircleDimmedLayer(arguments.getBoolean("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.equals.setShowCropFrame(arguments.getBoolean("com.yalantis.ucrop.ShowCropFrame", true));
        this.equals.setCropFrameColor(arguments.getInt("com.yalantis.ucrop.CropFrameColor", getResources().getColor(setMeasurementCacheEnabled.getMin.setMin)));
        this.equals.setCropFrameStrokeWidth(arguments.getInt("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.getMin)));
        this.equals.setShowCropGrid(arguments.getBoolean("com.yalantis.ucrop.ShowCropGrid", true));
        this.equals.setCropGridRowCount(arguments.getInt("com.yalantis.ucrop.CropGridRowCount", 2));
        this.equals.setCropGridColumnCount(arguments.getInt("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.equals.setCropGridColor(arguments.getInt("com.yalantis.ucrop.CropGridColor", getResources().getColor(setMeasurementCacheEnabled.getMin.setMax)));
        this.equals.setCropGridStrokeWidth(arguments.getInt("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.setMax)));
        float f = arguments.getFloat("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float f2 = arguments.getFloat("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int i2 = arguments.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayList2 = arguments.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (f > 0.0f && f2 > 0.0f) {
            ViewGroup viewGroup6 = this.isInside;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            this.toFloatRange.setTargetAspectRatio(f / f2);
        } else if (parcelableArrayList2 == null || i2 >= parcelableArrayList2.size()) {
            this.toFloatRange.setTargetAspectRatio(0.0f);
        } else {
            this.toFloatRange.setTargetAspectRatio(((AspectRatio) parcelableArrayList2.get(i2)).length / ((AspectRatio) parcelableArrayList2.get(i2)).setMax);
        }
        int i3 = arguments.getInt("com.yalantis.ucrop.MaxSizeX", 0);
        int i4 = arguments.getInt("com.yalantis.ucrop.MaxSizeY", 0);
        if (i3 > 0 && i4 > 0) {
            this.toFloatRange.setMaxResultImageSizeX(i3);
            this.toFloatRange.setMaxResultImageSizeY(i4);
        }
        if (uri == null || uri2 == null) {
            new getMax(new Intent().putExtra("com.yalantis.ucrop.Error", new NullPointerException(getString(setMeasurementCacheEnabled.equals.ucrop_error_input_data_is_absent))));
        } else {
            try {
                this.toFloatRange.setImageUri(uri, uri2);
            } catch (Exception e) {
                new getMax(new Intent().putExtra("com.yalantis.ucrop.Error", e));
            }
        }
        if (!this.toIntRange) {
            setMax(0);
        } else if (this.isInside.getVisibility() == 0) {
            getMin(setMeasurementCacheEnabled.length.toString);
        } else {
            getMin(setMeasurementCacheEnabled.length.toDoubleRange);
        }
        if (this.invoke == null) {
            this.invoke = new View(getContext());
            this.invoke.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.invoke.setClickable(true);
        }
        ((RelativeLayout) inflate.findViewById(setMeasurementCacheEnabled.length.onNavigationEvent)).addView(this.invoke);
        return inflate;
    }

    /* access modifiers changed from: private */
    public void getMin(@IdRes int i) {
        if (this.toIntRange) {
            this.isInside.setSelected(i == setMeasurementCacheEnabled.length.toString);
            this.toDoubleRange.setSelected(i == setMeasurementCacheEnabled.length.values);
            this.hashCode.setSelected(i == setMeasurementCacheEnabled.length.toDoubleRange);
            int i2 = 8;
            this.toString.setVisibility(i == setMeasurementCacheEnabled.length.toString ? 0 : 8);
            this.FastBitmap$CoordinateSystem.setVisibility(i == setMeasurementCacheEnabled.length.values ? 0 : 8);
            ViewGroup viewGroup = this.values;
            if (i == setMeasurementCacheEnabled.length.toDoubleRange) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
            if (i == setMeasurementCacheEnabled.length.toDoubleRange) {
                setMax(0);
            } else if (i == setMeasurementCacheEnabled.length.values) {
                setMax(1);
            } else {
                setMax(2);
            }
        }
    }

    private void setMax(int i) {
        GestureCropImageView gestureCropImageView = this.toFloatRange;
        int[] iArr = this.create;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.toFloatRange;
        int[] iArr2 = this.create;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    public class getMax {
        public int length = 96;
        public Intent setMin;

        public getMax(Intent intent) {
            this.setMin = intent;
        }
    }

    static /* synthetic */ void length(UCropFragment uCropFragment, float f) {
        TextView textView = uCropFragment.Grayscale$Algorithm;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    static /* synthetic */ void setMin(UCropFragment uCropFragment, float f) {
        TextView textView = uCropFragment.invokeSuspend;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    static /* synthetic */ void isInside(UCropFragment uCropFragment) {
        GestureCropImageView gestureCropImageView = uCropFragment.toFloatRange;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        uCropFragment.toFloatRange.setImageToWrapCropBounds();
    }

    static /* synthetic */ void toFloatRange(UCropFragment uCropFragment) {
        uCropFragment.toFloatRange.postRotate(90.0f);
        uCropFragment.toFloatRange.setImageToWrapCropBounds();
    }
}
