package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.List;
import o.ConcatAdapter$Config$StableIdMode;
import o.GridLayoutManager;
import o.computeScrollVectorForPosition;
import o.getExtraLayoutSpace;
import o.getReverseLayout;
import o.onAnchorReady;
import o.onLayoutChildren;
import o.onLayoutCompleted;
import o.performSearch;
import o.resolveShouldLayoutReverse;
import o.setStackFromEnd;
import o.smoothScrollToPosition;
import o.updateAnchorFromChildren;
import o.updateAnchorInfoForLayout;

public class CameraPreview extends ViewGroup {
    /* access modifiers changed from: private */
    public static final String getMax = CameraPreview.class.getSimpleName();
    private setStackFromEnd FastBitmap$CoordinateSystem;
    private setStackFromEnd Grayscale$Algorithm = null;
    private double ICustomTabsCallback = 0.1d;
    private TextureView IsOverlapping;
    private Rect Mean$Arithmetic;
    private onAnchorReady b = null;
    private final Handler.Callback create = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == R.id.zxing_prewiew_size_ready) {
                CameraPreview.access$300(CameraPreview.this, (setStackFromEnd) message.obj);
                return true;
            } else if (message.what == R.id.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.isActive()) {
                    return false;
                }
                CameraPreview.this.pause();
                CameraPreview.this.extraCallback.getMax(exc);
                return false;
            } else if (message.what != R.id.zxing_camera_closed) {
                return false;
            } else {
                CameraPreview.this.extraCallback.getMin();
                return false;
            }
        }
    };
    private GridLayoutManager equals;
    /* access modifiers changed from: private */
    public final setMax extraCallback = new setMax() {
        public final void length() {
            for (setMax length : CameraPreview.this.toString) {
                length.length();
            }
        }

        public final void setMin() {
            for (setMax min : CameraPreview.this.toString) {
                min.setMin();
            }
        }

        public final void getMax() {
            for (setMax max : CameraPreview.this.toString) {
                max.getMax();
            }
        }

        public final void getMax(Exception exc) {
            for (setMax max : CameraPreview.this.toString) {
                max.getMax(exc);
            }
        }

        public final void getMin() {
            for (setMax min : CameraPreview.this.toString) {
                min.getMin();
            }
        }
    };
    private ConcatAdapter$Config$StableIdMode extraCallbackWithResult = new ConcatAdapter$Config$StableIdMode() {
        public final void getMax() {
            CameraPreview.this.setMin.postDelayed(new performSearch(this), 250);
        }
    };
    private final SurfaceHolder.Callback getCause = new SurfaceHolder.Callback() {
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            setStackFromEnd unused = CameraPreview.this.invokeSuspend = null;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                String unused = CameraPreview.getMax;
                return;
            }
            setStackFromEnd unused2 = CameraPreview.this.invokeSuspend = new setStackFromEnd(i2, i3);
            CameraPreview.this.setMax();
        }
    };
    private boolean getMin = false;
    private setStackFromEnd hashCode;
    private Rect invoke = null;
    /* access modifiers changed from: private */
    public setStackFromEnd invokeSuspend;
    private SurfaceView isInside;
    private getReverseLayout length;
    private boolean onNavigationEvent = false;
    private WindowManager setMax;
    /* access modifiers changed from: private */
    public Handler setMin;
    private CameraSettings toDoubleRange = new CameraSettings();
    private boolean toFloatRange = false;
    private int toIntRange = -1;
    /* access modifiers changed from: private */
    public List<setMax> toString = new ArrayList();
    private Rect valueOf = null;
    private onLayoutCompleted values;

    public interface setMax {
        void getMax();

        void getMax(Exception exc);

        void getMin();

        void length();

        void setMin();
    }

    /* access modifiers changed from: protected */
    public void previewStarted() {
    }

    public CameraPreview(Context context) {
        super(context);
        setMin(context, (AttributeSet) null);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin(context, attributeSet);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin(context, attributeSet);
    }

    private void setMin(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        initializeAttributes(attributeSet);
        this.setMax = (WindowManager) context.getSystemService("window");
        this.setMin = new Handler(this.create);
        this.equals = new GridLayoutManager();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.getMin) {
            TextureView textureView = new TextureView(getContext());
            this.IsOverlapping = textureView;
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return false;
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    setStackFromEnd unused = CameraPreview.this.invokeSuspend = new setStackFromEnd(i, i2);
                    CameraPreview.this.setMax();
                }
            });
            addView(this.IsOverlapping);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.isInside = surfaceView;
        surfaceView.getHolder().addCallback(this.getCause);
        addView(this.isInside);
    }

    /* access modifiers changed from: protected */
    public void initializeAttributes(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.Grayscale$Algorithm = new setStackFromEnd(dimension, dimension2);
        }
        this.getMin = obtainStyledAttributes.getBoolean(R.styleable.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(R.styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.b = new smoothScrollToPosition();
        } else if (integer == 2) {
            this.b = new updateAnchorInfoForLayout();
        } else if (integer == 3) {
            this.b = new updateAnchorFromChildren();
        }
        obtainStyledAttributes.recycle();
    }

    public void addStateListener(setMax setmax) {
        this.toString.add(setmax);
    }

    public void setTorch(boolean z) {
        this.onNavigationEvent = z;
        getReverseLayout getreverselayout = this.length;
        if (getreverselayout != null) {
            getreverselayout.getMax(z);
        }
    }

    public void changeCameraParameters(getExtraLayoutSpace getextralayoutspace) {
        getReverseLayout getreverselayout = this.length;
        if (getreverselayout == null) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        } else if (getreverselayout.IsOverlapping) {
            onLayoutChildren onlayoutchildren = getreverselayout.getMax;
            resolveShouldLayoutReverse resolveshouldlayoutreverse = new resolveShouldLayoutReverse(getreverselayout, getextralayoutspace);
            synchronized (onlayoutchildren.setMax) {
                onlayoutchildren.length();
                onlayoutchildren.getMax.post(resolveshouldlayoutreverse);
            }
        }
    }

    public void setPreviewScalingStrategy(onAnchorReady onanchorready) {
        this.b = onanchorready;
    }

    public onAnchorReady getPreviewScalingStrategy() {
        onAnchorReady onanchorready = this.b;
        if (onanchorready != null) {
            return onanchorready;
        }
        if (this.IsOverlapping != null) {
            return new smoothScrollToPosition();
        }
        return new updateAnchorInfoForLayout();
    }

    /* access modifiers changed from: protected */
    public Matrix calculateTextureTransform(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        float f;
        float f2 = ((float) setstackfromend.getMax) / ((float) setstackfromend.setMax);
        float f3 = ((float) setstackfromend2.getMax) / ((float) setstackfromend2.setMax);
        float f4 = 1.0f;
        if (f2 < f3) {
            f4 = f3 / f2;
            f = 1.0f;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        matrix.postTranslate((((float) setstackfromend.getMax) - (((float) setstackfromend.getMax) * f4)) / 2.0f, (((float) setstackfromend.setMax) - (((float) setstackfromend.setMax) * f)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: private */
    public void setMax() {
        Rect rect;
        setStackFromEnd setstackfromend = this.invokeSuspend;
        if (setstackfromend != null && this.hashCode != null && (rect = this.Mean$Arithmetic) != null) {
            if (this.isInside == null || !setstackfromend.equals(new setStackFromEnd(rect.width(), this.Mean$Arithmetic.height()))) {
                TextureView textureView = this.IsOverlapping;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.hashCode != null) {
                        this.IsOverlapping.setTransform(calculateTextureTransform(new setStackFromEnd(this.IsOverlapping.getWidth(), this.IsOverlapping.getHeight()), this.hashCode));
                    }
                    getMin(new computeScrollVectorForPosition(this.IsOverlapping.getSurfaceTexture()));
                    return;
                }
                return;
            }
            getMin(new computeScrollVectorForPosition(this.isInside.getHolder()));
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        setStackFromEnd setstackfromend = new setStackFromEnd(i3 - i, i4 - i2);
        this.FastBitmap$CoordinateSystem = setstackfromend;
        getReverseLayout getreverselayout = this.length;
        if (getreverselayout != null && getreverselayout.length == null) {
            onLayoutCompleted onlayoutcompleted = new onLayoutCompleted(this.setMax.getDefaultDisplay().getRotation(), setstackfromend);
            this.values = onlayoutcompleted;
            onlayoutcompleted.setMin = getPreviewScalingStrategy();
            getReverseLayout getreverselayout2 = this.length;
            onLayoutCompleted onlayoutcompleted2 = this.values;
            getreverselayout2.length = onlayoutcompleted2;
            getreverselayout2.getMin.toIntRange = onlayoutcompleted2;
            getReverseLayout getreverselayout3 = this.length;
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("Must be called from the main thread.");
            } else if (getreverselayout3.IsOverlapping) {
                onLayoutChildren onlayoutchildren = getreverselayout3.getMax;
                Runnable runnable = getreverselayout3.toString;
                synchronized (onlayoutchildren.setMax) {
                    onlayoutchildren.length();
                    onlayoutchildren.getMax.post(runnable);
                }
                boolean z2 = this.onNavigationEvent;
                if (z2) {
                    this.length.getMax(z2);
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.isInside;
        if (surfaceView != null) {
            Rect rect = this.Mean$Arithmetic;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, this.Mean$Arithmetic.top, this.Mean$Arithmetic.right, this.Mean$Arithmetic.bottom);
            }
        } else {
            TextureView textureView = this.IsOverlapping;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public Rect getFramingRect() {
        return this.invoke;
    }

    public Rect getPreviewFramingRect() {
        return this.valueOf;
    }

    public setStackFromEnd getPreviewSize() {
        return this.hashCode;
    }

    public CameraSettings getCameraSettings() {
        return this.toDoubleRange;
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.toDoubleRange = cameraSettings;
    }

    public void pauseAndWait() {
        getReverseLayout cameraInstance = getCameraInstance();
        pause();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.length() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public setStackFromEnd getFramingRectSize() {
        return this.Grayscale$Algorithm;
    }

    public void setFramingRectSize(setStackFromEnd setstackfromend) {
        this.Grayscale$Algorithm = setstackfromend;
    }

    public double getMarginFraction() {
        return this.ICustomTabsCallback;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.ICustomTabsCallback = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public boolean isUseTextureView() {
        return this.getMin;
    }

    public void setUseTextureView(boolean z) {
        this.getMin = z;
    }

    /* access modifiers changed from: protected */
    public boolean isActive() {
        return this.length != null;
    }

    /* access modifiers changed from: protected */
    public getReverseLayout createCameraInstance() {
        getReverseLayout getreverselayout = new getReverseLayout(getContext());
        CameraSettings cameraSettings = this.toDoubleRange;
        if (!getreverselayout.IsOverlapping) {
            getreverselayout.equals = cameraSettings;
            getreverselayout.getMin.IsOverlapping = cameraSettings;
        }
        return getreverselayout;
    }

    private void getMin(computeScrollVectorForPosition computescrollvectorforposition) {
        getReverseLayout getreverselayout;
        if (!this.toFloatRange && (getreverselayout = this.length) != null) {
            getreverselayout.setMax = computescrollvectorforposition;
            this.length.setMax();
            this.toFloatRange = true;
            previewStarted();
            this.extraCallback.setMin();
        }
    }

    public getReverseLayout getCameraInstance() {
        return this.length;
    }

    public boolean isPreviewActive() {
        return this.toFloatRange;
    }

    /* access modifiers changed from: protected */
    public Rect calculateFramingRect(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.Grayscale$Algorithm != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.Grayscale$Algorithm.getMax) / 2), Math.max(0, (rect3.height() - this.Grayscale$Algorithm.setMax) / 2));
            return rect3;
        }
        double width = (double) rect3.width();
        double d = this.ICustomTabsCallback;
        Double.isNaN(width);
        double d2 = width * d;
        double height = (double) rect3.height();
        double d3 = this.ICustomTabsCallback;
        Double.isNaN(height);
        int min = (int) Math.min(d2, height * d3);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.onNavigationEvent);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public boolean isCameraClosed() {
        getReverseLayout getreverselayout = this.length;
        return getreverselayout == null || getreverselayout.length();
    }

    public void resume() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.length == null) {
                getReverseLayout createCameraInstance = createCameraInstance();
                this.length = createCameraInstance;
                createCameraInstance.setMin = this.setMin;
                getReverseLayout getreverselayout = this.length;
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    getreverselayout.IsOverlapping = true;
                    getreverselayout.toIntRange = false;
                    onLayoutChildren onlayoutchildren = getreverselayout.getMax;
                    Runnable runnable = getreverselayout.isInside;
                    synchronized (onlayoutchildren.setMax) {
                        onlayoutchildren.length++;
                        synchronized (onlayoutchildren.setMax) {
                            onlayoutchildren.length();
                            onlayoutchildren.getMax.post(runnable);
                        }
                    }
                    this.toIntRange = this.setMax.getDefaultDisplay().getRotation();
                } else {
                    throw new IllegalStateException("Must be called from the main thread.");
                }
            }
            if (this.invokeSuspend != null) {
                setMax();
            } else {
                SurfaceView surfaceView = this.isInside;
                if (surfaceView != null) {
                    surfaceView.getHolder().addCallback(this.getCause);
                } else {
                    TextureView textureView = this.IsOverlapping;
                    if (textureView != null) {
                        if (textureView.isAvailable()) {
                            new TextureView.SurfaceTextureListener() {
                                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                                    return false;
                                }

                                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                }

                                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                                    onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                                }

                                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                                    setStackFromEnd unused = CameraPreview.this.invokeSuspend = new setStackFromEnd(i, i2);
                                    CameraPreview.this.setMax();
                                }
                            }.onSurfaceTextureAvailable(this.IsOverlapping.getSurfaceTexture(), this.IsOverlapping.getWidth(), this.IsOverlapping.getHeight());
                        } else {
                            this.IsOverlapping.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                                    return false;
                                }

                                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                }

                                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                                    onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                                }

                                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                                    setStackFromEnd unused = CameraPreview.this.invokeSuspend = new setStackFromEnd(i, i2);
                                    CameraPreview.this.setMax();
                                }
                            });
                        }
                    }
                }
            }
            requestLayout();
            GridLayoutManager gridLayoutManager = this.equals;
            Context context = getContext();
            ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = this.extraCallbackWithResult;
            if (gridLayoutManager.length != null) {
                gridLayoutManager.length.disable();
            }
            gridLayoutManager.length = null;
            gridLayoutManager.setMax = null;
            gridLayoutManager.getMax = null;
            Context applicationContext = context.getApplicationContext();
            gridLayoutManager.getMax = concatAdapter$Config$StableIdMode;
            gridLayoutManager.setMax = (WindowManager) applicationContext.getSystemService("window");
            gridLayoutManager.length = new OrientationEventListener(applicationContext) {
                public final void onOrientationChanged(int i) {
                    int rotation;
                    WindowManager windowManager = GridLayoutManager.this.setMax;
                    ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = GridLayoutManager.this.getMax;
                    if (GridLayoutManager.this.setMax != null && concatAdapter$Config$StableIdMode != null && (rotation = windowManager.getDefaultDisplay().getRotation()) != GridLayoutManager.this.setMin) {
                        GridLayoutManager.this.setMin = rotation;
                        concatAdapter$Config$StableIdMode.getMax();
                    }
                }
            };
            gridLayoutManager.length.enable();
            gridLayoutManager.setMin = gridLayoutManager.setMax.getDefaultDisplay().getRotation();
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public void pause() {
        TextureView textureView;
        SurfaceView surfaceView;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.toIntRange = -1;
            getReverseLayout getreverselayout = this.length;
            if (getreverselayout == null) {
                this.setMin.sendEmptyMessage(R.id.zxing_camera_closed);
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                if (getreverselayout.IsOverlapping) {
                    onLayoutChildren onlayoutchildren = getreverselayout.getMax;
                    Runnable runnable = getreverselayout.values;
                    synchronized (onlayoutchildren.setMax) {
                        onlayoutchildren.length();
                        onlayoutchildren.getMax.post(runnable);
                    }
                } else {
                    getreverselayout.toIntRange = true;
                }
                getreverselayout.IsOverlapping = false;
                this.length = null;
                this.toFloatRange = false;
            } else {
                throw new IllegalStateException("Must be called from the main thread.");
            }
            if (this.invokeSuspend == null && (surfaceView = this.isInside) != null) {
                surfaceView.getHolder().removeCallback(this.getCause);
            }
            if (this.invokeSuspend == null && (textureView = this.IsOverlapping) != null) {
                textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.FastBitmap$CoordinateSystem = null;
            this.hashCode = null;
            this.valueOf = null;
            GridLayoutManager gridLayoutManager = this.equals;
            if (gridLayoutManager.length != null) {
                gridLayoutManager.length.disable();
            }
            gridLayoutManager.length = null;
            gridLayoutManager.setMax = null;
            gridLayoutManager.getMax = null;
            this.extraCallback.getMax();
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    static /* synthetic */ void access$300(CameraPreview cameraPreview, setStackFromEnd setstackfromend) {
        cameraPreview.hashCode = setstackfromend;
        setStackFromEnd setstackfromend2 = cameraPreview.FastBitmap$CoordinateSystem;
        if (setstackfromend2 == null) {
            return;
        }
        if (setstackfromend2 == null || setstackfromend == null || cameraPreview.values == null) {
            cameraPreview.valueOf = null;
            cameraPreview.invoke = null;
            cameraPreview.Mean$Arithmetic = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = setstackfromend.getMax;
        int i2 = cameraPreview.hashCode.setMax;
        int i3 = cameraPreview.FastBitmap$CoordinateSystem.getMax;
        int i4 = cameraPreview.FastBitmap$CoordinateSystem.setMax;
        onLayoutCompleted onlayoutcompleted = cameraPreview.values;
        Rect length2 = onlayoutcompleted.setMin.length(cameraPreview.hashCode, onlayoutcompleted.getMin);
        if (length2.width() > 0 && length2.height() > 0) {
            cameraPreview.Mean$Arithmetic = length2;
            cameraPreview.invoke = cameraPreview.calculateFramingRect(new Rect(0, 0, i3, i4), cameraPreview.Mean$Arithmetic);
            Rect rect = new Rect(cameraPreview.invoke);
            rect.offset(-cameraPreview.Mean$Arithmetic.left, -cameraPreview.Mean$Arithmetic.top);
            Rect rect2 = new Rect((rect.left * i) / cameraPreview.Mean$Arithmetic.width(), (rect.top * i2) / cameraPreview.Mean$Arithmetic.height(), (rect.right * i) / cameraPreview.Mean$Arithmetic.width(), (rect.bottom * i2) / cameraPreview.Mean$Arithmetic.height());
            cameraPreview.valueOf = rect2;
            if (rect2 == null || rect2.width() <= 0 || cameraPreview.valueOf.height() <= 0) {
                cameraPreview.valueOf = null;
                cameraPreview.invoke = null;
            } else {
                cameraPreview.extraCallback.length();
            }
        }
        cameraPreview.requestLayout();
        cameraPreview.setMax();
    }

    public static /* synthetic */ void access$600(CameraPreview cameraPreview) {
        if (cameraPreview.isActive() && cameraPreview.setMax.getDefaultDisplay().getRotation() != cameraPreview.toIntRange) {
            cameraPreview.pause();
            cameraPreview.resume();
        }
    }
}
