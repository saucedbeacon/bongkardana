package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import o.MenuRes;

@RequiresApi(21)
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    /* access modifiers changed from: private */
    @Nullable
    public static WeakReference<View> capturedSharedElement;
    private boolean entering = true;
    @Nullable
    private Rect returnEndBounds;
    @Nullable
    private ShapeProvider shapeProvider = new ShapeableViewShapeProvider();
    private boolean sharedElementReenterTransitionEnabled = false;
    private boolean transparentWindowBackgroundEnabled = true;

    public interface ShapeProvider {
        @Nullable
        ShapeAppearanceModel provideShape(@NonNull View view);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Nullable
        public ShapeAppearanceModel provideShape(@NonNull View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        capturedSharedElement = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        ShapeAppearanceModel provideShape;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (!(onCreateSnapshotView == null || (weakReference = capturedSharedElement) == null || this.shapeProvider == null || (view = weakReference.get()) == null || (provideShape = this.shapeProvider.provideShape(view)) == null)) {
            onCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, provideShape);
        }
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity activity;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (activity = ContextUtils.getActivity(view.getContext())) != null) {
            Window window = activity.getWindow();
            if (this.entering) {
                setUpEnterTransform(window);
            } else {
                setUpReturnTransform(activity, window);
            }
        }
    }

    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.entering && !list2.isEmpty() && this.returnEndBounds != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.height(), 1073741824));
            view.layout(this.returnEndBounds.left, this.returnEndBounds.top, this.returnEndBounds.right, this.returnEndBounds.bottom);
        }
    }

    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, (Object) null);
        }
        if (!this.entering && !list2.isEmpty()) {
            this.returnEndBounds = TransitionUtils.getRelativeBoundsRect(list2.get(0));
        }
        this.entering = false;
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public void setShapeProvider(@Nullable ShapeProvider shapeProvider2) {
        this.shapeProvider = shapeProvider2;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.transparentWindowBackgroundEnabled;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.transparentWindowBackgroundEnabled = z;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.sharedElementReenterTransitionEnabled;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.sharedElementReenterTransitionEnabled = z;
    }

    private void setUpEnterTransform(final Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.sharedElementReenterTransitionEnabled) {
                window.setSharedElementReenterTransition((Transition) null);
            }
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() {
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }

                    public void onTransitionEnd(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.restoreWindowBackground(window);
                    }
                });
            }
        }
    }

    private void setUpReturnTransform(final Activity activity, final Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new TransitionListenerAdapter() {
                public void onTransitionEnd(Transition transition) {
                    View view;
                    if (!(MaterialContainerTransformSharedElementCallback.capturedSharedElement == null || (view = (View) MaterialContainerTransformSharedElementCallback.capturedSharedElement.get()) == null)) {
                        view.setAlpha(1.0f);
                        WeakReference unused = MaterialContainerTransformSharedElementCallback.capturedSharedElement = null;
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() {
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public static void removeWindowBackground(Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(MenuRes.getMin(0, BlendModeCompat.CLEAR));
    }

    /* access modifiers changed from: private */
    public static void restoreWindowBackground(Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }
}
