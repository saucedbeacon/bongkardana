package com.alipay.zoloz.hardware.camera.widget.permission;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import androidx.annotation.NonNull;
import com.alipay.zoloz.hardware.camera.widget.PermissionCameraSurfaceView;

public class PermissionFragment extends Fragment {
    private final int PERMISSIONS_REQUEST_CODE = 100;
    private boolean mHasCameraPermission = true;
    private PermissionCameraSurfaceView mSurfaceView;

    public void init(PermissionCameraSurfaceView permissionCameraSurfaceView) {
        this.mSurfaceView = permissionCameraSurfaceView;
        checkCameraPermission();
    }

    private void checkCameraPermission() {
        if (isMarshmallow()) {
            this.mHasCameraPermission = isGranted("android.permission.CAMERA");
        }
    }

    public boolean hasCameraPermission() {
        return this.mHasCameraPermission;
    }

    public void onResume() {
        super.onResume();
        if (!this.mHasCameraPermission) {
            checkCameraPermission();
            this.mSurfaceView.setVisibility(0);
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.mHasCameraPermission) {
            this.mSurfaceView.setVisibility(4);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.mSurfaceView.release();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(23)
    public boolean isGranted(String str) {
        return getActivity().checkSelfPermission(str) == 0;
    }

    private boolean isMarshmallow() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public void requestPermission() {
        if (isMarshmallow()) {
            this.mSurfaceView.setVisibility(4);
            requestPermissions(new String[]{"android.permission.CAMERA"}, 100);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (100 == i) {
            if (iArr[0] == 0) {
                this.mHasCameraPermission = true;
            }
            this.mSurfaceView.setVisibility(0);
        }
    }
}
