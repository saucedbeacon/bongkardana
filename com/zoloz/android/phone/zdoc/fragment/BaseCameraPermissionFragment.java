package com.zoloz.android.phone.zdoc.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alipay.zoloz.hardware.camera.widget.CameraSurfaceView;
import com.zoloz.android.phone.zdoc.R;
import o.IntRange;

public abstract class BaseCameraPermissionFragment extends BaseFragment implements PermissionDialogEvent {
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 1;
    private boolean isFirst = true;
    private CameraSurfaceView mCameraSurfaceView;
    protected View mRootView;

    /* access modifiers changed from: protected */
    public abstract void alertCameraNoPermissionDialog(PermissionDialogEvent permissionDialogEvent);

    /* access modifiers changed from: protected */
    public abstract void alertSystemError();

    /* access modifiers changed from: protected */
    public abstract int getLayoutId();

    /* access modifiers changed from: protected */
    public abstract void onCameraInit();

    /* access modifiers changed from: protected */
    public abstract void onInitView();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.mRootView;
        if (view == null) {
            try {
                this.mRootView = layoutInflater.inflate(getLayoutId(), viewGroup, false);
            } catch (Exception unused) {
                alertSystemError();
            }
            initView();
        } else {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mRootView);
            }
        }
        return this.mRootView;
    }

    /* access modifiers changed from: protected */
    public void initView() {
        CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        this.mCameraSurfaceView = cameraSurfaceView;
        cameraSurfaceView.setVisibility(4);
        this.mCameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        onInitView();
        onCameraInit();
    }

    public void onResume() {
        super.onResume();
        this.mCameraSurfaceView.setVisibility(0);
    }

    public void onPause() {
        super.onPause();
        this.mCameraSurfaceView.setVisibility(4);
    }

    public void checkCameraPermission() {
        if (!this.isFirst) {
            alertCameraNoPermissionDialog(this);
            return;
        }
        this.isFirst = false;
        if (hasCameraPermission()) {
            dealCameraHasPermission();
        } else {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
        }
    }

    /* access modifiers changed from: protected */
    public boolean hasCameraPermission() {
        return Build.VERSION.SDK_INT < 23 || IntRange.length((Context) getActivity(), "android.permission.CAMERA") == 0;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            alertCameraNoPermissionDialog(this);
        } else {
            dealCameraHasPermission();
        }
    }

    /* access modifiers changed from: protected */
    public void dealCameraHasPermission() {
        if (this.mCameraSurfaceView != null) {
            onCameraInit();
            this.mCameraSurfaceView.setVisibility(0);
        }
    }

    public void execute() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        StringBuilder sb = new StringBuilder("package:");
        sb.append(getContext().getPackageName());
        intent.setData(Uri.parse(sb.toString()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public View findViewById(int i) {
        return this.mRootView.findViewById(i);
    }
}
