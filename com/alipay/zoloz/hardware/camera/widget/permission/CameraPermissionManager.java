package com.alipay.zoloz.hardware.camera.widget.permission;

import android.app.Activity;
import android.app.FragmentManager;
import com.alipay.zoloz.hardware.camera.widget.PermissionCameraSurfaceView;

public class CameraPermissionManager {
    private static final String FRAGMENT_TAG = "camera.permission.manager.fragment.tag";
    private PermissionFragment mPermissionFragment;

    public CameraPermissionManager(PermissionCameraSurfaceView permissionCameraSurfaceView) {
        PermissionFragment permissionManagerFragment = getPermissionManagerFragment((Activity) permissionCameraSurfaceView.getContext());
        this.mPermissionFragment = permissionManagerFragment;
        permissionManagerFragment.init(permissionCameraSurfaceView);
    }

    private PermissionFragment getPermissionManagerFragment(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        PermissionFragment permissionFragment = (PermissionFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (permissionFragment != null) {
            return permissionFragment;
        }
        PermissionFragment permissionFragment2 = new PermissionFragment();
        fragmentManager.beginTransaction().add(permissionFragment2, FRAGMENT_TAG).commit();
        fragmentManager.executePendingTransactions();
        return permissionFragment2;
    }

    public void requestPermission() {
        this.mPermissionFragment.requestPermission();
    }

    public boolean hasCameraPermission() {
        return this.mPermissionFragment.hasCameraPermission();
    }
}
