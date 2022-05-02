package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.preview.RendererThread;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o.calculateDyToMakeVisible;
import o.onEnterLayoutOrScroll;

public final class setItemAnimator extends dispatchContentChangedIfNecessary<GLSurfaceView, SurfaceTexture> {
    @VisibleForTesting
    float FastBitmap$CoordinateSystem = 1.0f;
    private View Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public setChildDrawingOrderCallback Mean$Arithmetic;
    public final Set<isAccessibilityEnabled> hashCode = new CopyOnWriteArraySet();
    /* access modifiers changed from: private */
    public int invoke = 0;
    /* access modifiers changed from: private */
    public SurfaceTexture invokeSuspend;
    /* access modifiers changed from: private */
    public boolean toDoubleRange;
    /* access modifiers changed from: private */
    public final float[] toString = new float[16];
    /* access modifiers changed from: private */
    public getMinFlingVelocity valueOf;
    @VisibleForTesting
    float values = 1.0f;

    public final boolean toFloatRange() {
        return true;
    }

    public setItemAnimator(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final View length() {
        return this.Grayscale$Algorithm;
    }

    public final void setMin() {
        super.setMin();
        ((GLSurfaceView) this.getMax).onResume();
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        ((GLSurfaceView) this.getMax).onPause();
    }

    public final void isInside() {
        super.isInside();
        this.hashCode.clear();
    }

    public class getMax implements GLSurfaceView.Renderer {
        public getMax() {
        }

        @RendererThread
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (setItemAnimator.this.Mean$Arithmetic == null) {
                setChildDrawingOrderCallback unused = setItemAnimator.this.Mean$Arithmetic = new clearOnScrollListeners();
            }
            getMinFlingVelocity unused2 = setItemAnimator.this.valueOf = new getMinFlingVelocity(setItemAnimator.this.Mean$Arithmetic);
            setItemAnimator setitemanimator = setItemAnimator.this;
            int unused3 = setitemanimator.invoke = setitemanimator.valueOf.setMin();
            SurfaceTexture unused4 = setItemAnimator.this.invokeSuspend = new SurfaceTexture(setItemAnimator.this.invoke);
            ((GLSurfaceView) setItemAnimator.this.getMax).queueEvent(new Runnable() {
                public final void run() {
                    for (isAccessibilityEnabled max : setItemAnimator.this.hashCode) {
                        max.setMax(setItemAnimator.this.invoke);
                    }
                }
            });
            setItemAnimator.this.invokeSuspend.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    ((GLSurfaceView) setItemAnimator.this.getMax).requestRender();
                }
            });
        }

        @RendererThread
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            gl10.glViewport(0, 0, i, i2);
            setItemAnimator.this.Mean$Arithmetic.getMax(i, i2);
            if (!setItemAnimator.this.toDoubleRange) {
                setItemAnimator.this.getMax(i, i2);
                boolean unused = setItemAnimator.this.toDoubleRange = true;
            } else if (i != setItemAnimator.this.toIntRange || i2 != setItemAnimator.this.IsOverlapping) {
                setItemAnimator.this.length(i, i2);
            }
        }

        @RendererThread
        public final void onDrawFrame(GL10 gl10) {
            if (setItemAnimator.this.invokeSuspend != null && setItemAnimator.this.equals > 0 && setItemAnimator.this.isInside > 0) {
                setItemAnimator.this.invokeSuspend.updateTexImage();
                setItemAnimator.this.invokeSuspend.getTransformMatrix(setItemAnimator.this.toString);
                if (setItemAnimator.this.toFloatRange != 0) {
                    Matrix.translateM(setItemAnimator.this.toString, 0, 0.5f, 0.5f, 0.0f);
                    Matrix.rotateM(setItemAnimator.this.toString, 0, (float) setItemAnimator.this.toFloatRange, 0.0f, 0.0f, 1.0f);
                    Matrix.translateM(setItemAnimator.this.toString, 0, -0.5f, -0.5f, 0.0f);
                }
                if (setItemAnimator.this.toIntRange()) {
                    Matrix.translateM(setItemAnimator.this.toString, 0, (1.0f - setItemAnimator.this.values) / 2.0f, (1.0f - setItemAnimator.this.FastBitmap$CoordinateSystem) / 2.0f, 0.0f);
                    Matrix.scaleM(setItemAnimator.this.toString, 0, setItemAnimator.this.values, setItemAnimator.this.FastBitmap$CoordinateSystem, 1.0f);
                }
                getMinFlingVelocity max = setItemAnimator.this.valueOf;
                setItemAnimator.this.invokeSuspend.getTimestamp();
                max.setMax(setItemAnimator.this.invoke, setItemAnimator.this.toString);
                for (isAccessibilityEnabled length : setItemAnimator.this.hashCode) {
                    length.length(setItemAnimator.this.invokeSuspend, setItemAnimator.this.values, setItemAnimator.this.FastBitmap$CoordinateSystem);
                }
            }
        }
    }

    @NonNull
    public final Class<SurfaceTexture> getMax() {
        return SurfaceTexture.class;
    }

    /* access modifiers changed from: protected */
    public final void length(@Nullable onEnterLayoutOrScroll.getMax getmax) {
        float f;
        float f2;
        if (this.equals > 0 && this.isInside > 0 && this.toIntRange > 0 && this.IsOverlapping > 0) {
            predictiveItemAnimationsEnabled max = predictiveItemAnimationsEnabled.setMax(this.toIntRange, this.IsOverlapping);
            predictiveItemAnimationsEnabled max2 = predictiveItemAnimationsEnabled.setMax(this.equals, this.isInside);
            if (((float) max.setMin) / ((float) max.getMax) >= ((float) max2.setMin) / ((float) max2.getMax)) {
                f = (((float) max.setMin) / ((float) max.getMax)) / (((float) max2.setMin) / ((float) max2.getMax));
                f2 = 1.0f;
            } else {
                f2 = (((float) max2.setMin) / ((float) max2.getMax)) / (((float) max.setMin) / ((float) max.getMax));
                f = 1.0f;
            }
            this.length = f2 > 1.02f || f > 1.02f;
            this.values = 1.0f / f2;
            this.FastBitmap$CoordinateSystem = 1.0f / f;
            ((GLSurfaceView) this.getMax).requestRender();
        }
    }

    @NonNull
    public final setChildDrawingOrderCallback equals() {
        return this.Mean$Arithmetic;
    }

    public final void length(@NonNull final setChildDrawingOrderCallback setchilddrawingordercallback) {
        this.Mean$Arithmetic = setchilddrawingordercallback;
        if (setMax()) {
            setchilddrawingordercallback.getMax(this.toIntRange, this.IsOverlapping);
        }
        ((GLSurfaceView) this.getMax).queueEvent(new Runnable() {
            public final void run() {
                if (setItemAnimator.this.valueOf != null) {
                    setItemAnimator.this.valueOf.setMin = setchilddrawingordercallback;
                }
                for (isAccessibilityEnabled max : setItemAnimator.this.hashCode) {
                    max.setMax(setchilddrawingordercallback);
                }
            }
        });
    }

    @NonNull
    public final /* bridge */ /* synthetic */ Object getMin() {
        return this.invokeSuspend;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final /* synthetic */ View setMin(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(calculateDyToMakeVisible.setMin.cameraview_gl_view, viewGroup, false);
        final GLSurfaceView gLSurfaceView = (GLSurfaceView) viewGroup2.findViewById(calculateDyToMakeVisible.length.length);
        final getMax getmax = new getMax();
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(getmax);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                setItemAnimator setitemanimator = setItemAnimator.this;
                setitemanimator.toIntRange = 0;
                setitemanimator.IsOverlapping = 0;
                if (setitemanimator.setMax != null) {
                    setitemanimator.setMax.cancelNotification();
                }
                gLSurfaceView.queueEvent(new Runnable() {
                    public final void run() {
                        getMax getmax = getmax;
                        if (setItemAnimator.this.invokeSuspend != null) {
                            setItemAnimator.this.invokeSuspend.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                            setItemAnimator.this.invokeSuspend.release();
                            SurfaceTexture unused = setItemAnimator.this.invokeSuspend = null;
                        }
                        int unused2 = setItemAnimator.this.invoke = 0;
                        if (setItemAnimator.this.valueOf != null) {
                            getMinFlingVelocity max = setItemAnimator.this.valueOf;
                            if (max.length != -1) {
                                max.setMax.getMax();
                                GLES20.glDeleteProgram(max.length);
                                max.length = -1;
                            }
                            getMinFlingVelocity unused3 = setItemAnimator.this.valueOf = null;
                        }
                    }
                });
                boolean unused = setItemAnimator.this.toDoubleRange = false;
            }
        });
        viewGroup.addView(viewGroup2, 0);
        this.Grayscale$Algorithm = viewGroup2;
        return gLSurfaceView;
    }
}
