package o;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.mask;

public class FontRes extends IntRange {
    private static getMin setMin;

    public interface getMin {
        boolean setMax(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i);
    }

    public interface setMax {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface setMin {
        void validateRequestPermissionsRequestCode(int i);
    }

    protected FontRes() {
    }

    public static void setMax(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void getMin(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    public static void length(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void setMax(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    @Nullable
    public static Uri setMin(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static void getMin(@NonNull Activity activity, @Nullable mask mask) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(mask != null ? new length(mask) : null);
        }
    }

    public static void setMax(@NonNull Activity activity, @Nullable mask mask) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(mask != null ? new length(mask) : null);
        }
    }

    public static void getMax(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void getMin(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static void getMin(@NonNull final Activity activity, @NonNull final String[] strArr, @IntRange(from = 0) final int i) {
        getMin getmin = setMin;
        if (getmin == null || !getmin.setMax(activity, strArr, i)) {
            int length2 = strArr.length;
            int i2 = 0;
            while (i2 < length2) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder("Permission request for permissions ");
                    sb.append(Arrays.toString(strArr));
                    sb.append(" must not contain null or empty values");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof setMin) {
                    ((setMin) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof setMax) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length2 = strArr.length;
                        for (int i = 0; i < length2; i++) {
                            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                        }
                        ((setMax) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }

    public static boolean getMax(@NonNull Activity activity, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void toFloatRange(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (Build.VERSION.SDK_INT <= 23) {
            new Handler(activity.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (!activity.isFinishing() && !value.getMax(activity)) {
                        activity.recreate();
                    }
                }
            });
        } else if (!value.getMax(activity)) {
            activity.recreate();
        }
    }

    @RequiresApi(21)
    static class length extends SharedElementCallback {
        private final mask getMax;

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        public void onRejectSharedElements(List<View> list) {
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        length(mask mask) {
            this.getMax = mask;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap min;
            mask mask = this.getMax;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (!(drawable == null || background != null || (min = mask.getMin(drawable)) == null)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", min);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                    }
                    return bundle;
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                return null;
            }
            float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int i = (int) (((float) round) * min2);
            int i2 = (int) (((float) round2) * min2);
            if (mask.getMin == null) {
                mask.getMin = new Matrix();
            }
            mask.getMin.set(matrix);
            mask.getMin.postTranslate(-rectF.left, -rectF.top);
            mask.getMin.postScale(min2, min2);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.concat(mask.getMin);
            view.draw(canvas);
            return createBitmap;
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return mask.setMin(context, parcelable);
        }

        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            mask.getMax(new mask.getMax() {
                public void length() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }
}
