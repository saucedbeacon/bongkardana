package o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import o.calculateDyToMakeVisible;
import o.onEnterLayoutOrScroll;

public final class getItemAnimator extends onEnterLayoutOrScroll<TextureView, SurfaceTexture> {
    private View toDoubleRange;

    public final boolean toFloatRange() {
        return true;
    }

    public getItemAnimator(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final View length() {
        return this.toDoubleRange;
    }

    @NonNull
    public final Class<SurfaceTexture> getMax() {
        return SurfaceTexture.class;
    }

    public final void getMax(final int i) {
        super.getMax(i);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((TextureView) this.getMax).post(new Runnable() {
            public final void run() {
                Matrix matrix = new Matrix();
                float f = ((float) getItemAnimator.this.toIntRange) / 2.0f;
                float f2 = ((float) getItemAnimator.this.IsOverlapping) / 2.0f;
                if (i % 180 != 0) {
                    float f3 = ((float) getItemAnimator.this.IsOverlapping) / ((float) getItemAnimator.this.toIntRange);
                    matrix.postScale(f3, 1.0f / f3, f, f2);
                }
                matrix.postRotate((float) i, f, f2);
                ((TextureView) getItemAnimator.this.getMax).setTransform(matrix);
                taskCompletionSource.setResult(null);
            }
        });
        try {
            Tasks.await(taskCompletionSource.getTask());
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void length(@Nullable final onEnterLayoutOrScroll.getMax getmax) {
        ((TextureView) this.getMax).post(new Runnable() {
            public final void run() {
                float f;
                if (getItemAnimator.this.isInside != 0 && getItemAnimator.this.equals != 0 && getItemAnimator.this.IsOverlapping != 0 && getItemAnimator.this.toIntRange != 0) {
                    predictiveItemAnimationsEnabled max = predictiveItemAnimationsEnabled.setMax(getItemAnimator.this.toIntRange, getItemAnimator.this.IsOverlapping);
                    predictiveItemAnimationsEnabled max2 = predictiveItemAnimationsEnabled.setMax(getItemAnimator.this.equals, getItemAnimator.this.isInside);
                    float f2 = 1.0f;
                    if (((float) max.setMin) / ((float) max.getMax) >= ((float) max2.setMin) / ((float) max2.getMax)) {
                        f = (((float) max.setMin) / ((float) max.getMax)) / (((float) max2.setMin) / ((float) max2.getMax));
                    } else {
                        f2 = (((float) max2.setMin) / ((float) max2.getMax)) / (((float) max.setMin) / ((float) max.getMax));
                        f = 1.0f;
                    }
                    ((TextureView) getItemAnimator.this.getMax).setScaleX(f2);
                    ((TextureView) getItemAnimator.this.getMax).setScaleY(f);
                    getItemAnimator.this.length = f2 > 1.02f || f > 1.02f;
                    onEnterLayoutOrScroll.setMin.getMax(1, "crop:", "applied scaleX=", Float.valueOf(f2));
                    onEnterLayoutOrScroll.setMin.getMax(1, "crop:", "applied scaleY=", Float.valueOf(f));
                }
            }
        });
    }

    @NonNull
    public final /* synthetic */ Object getMin() {
        return ((TextureView) this.getMax).getSurfaceTexture();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final /* synthetic */ View setMin(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(calculateDyToMakeVisible.setMin.cameraview_texture_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        TextureView textureView = (TextureView) inflate.findViewById(calculateDyToMakeVisible.length.getMax);
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                getItemAnimator.this.getMax(i, i2);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                getItemAnimator.this.length(i, i2);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                getItemAnimator getitemanimator = getItemAnimator.this;
                getitemanimator.toIntRange = 0;
                getitemanimator.IsOverlapping = 0;
                if (getitemanimator.setMax == null) {
                    return true;
                }
                getitemanimator.setMax.cancelNotification();
                return true;
            }
        });
        this.toDoubleRange = inflate;
        return textureView;
    }
}
