package id.dana.camera;

import android.content.Context;
import android.view.View;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.richview.camera.DanaCameraView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.calculateDtToFit;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lid/dana/camera/DanaCameraActivity;", "Lid/dana/base/BaseActivity;", "()V", "getLayout", "", "init", "", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaCameraActivity extends BaseActivity {
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_dana_camera;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(1263606558, oncanceled);
        onCancelLoad.getMin(1263606558, oncanceled);
        return R.layout.activity_dana_camera;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/camera/DanaCameraActivity$init$1", "Lid/dana/richview/camera/DanaCameraView$DanaCameraListener;", "onCameraPermissionDenied", "", "onImageCaptured", "result", "Lcom/otaliastudios/cameraview/PictureResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements DanaCameraView.getMin {
        final /* synthetic */ DanaCameraActivity getMin;

        public final void setMax(@NotNull calculateDtToFit calculatedttofit) {
            Intrinsics.checkNotNullParameter(calculatedttofit, "result");
        }

        length(DanaCameraActivity danaCameraActivity) {
            this.getMin = danaCameraActivity;
        }

        public final void setMin() {
            this.getMin.finish();
        }
    }

    public final void init() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-707949269, oncanceled);
            onCancelLoad.getMin(-707949269, oncanceled);
        }
        ((DanaCameraView) _$_findCachedViewById(resetInternal.setMax.evictAll)).setDanaCameraListener(new length(this));
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (((DanaCameraView) _$_findCachedViewById(resetInternal.setMax.evictAll)).hasPermissionsResult(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
