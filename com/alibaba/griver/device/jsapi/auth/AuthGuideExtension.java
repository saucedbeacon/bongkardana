package com.alibaba.griver.device.jsapi.auth;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.permission.api.extension.PermissionGuildePoint;
import com.alibaba.griver.api.jsapi.auth.GriverAuthGuideContentExtension;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.device.R;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsCategories;
import id.dana.utils.permission.ManifestPermission;

public class AuthGuideExtension implements PermissionGuildePoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public boolean startPermissionGuide(String str, String str2) {
        String[] strArr;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        final String str8 = str;
        Application applicationContext = GriverEnv.getApplicationContext();
        boolean z = false;
        if (applicationContext == null || str8 == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1382453013:
                if (str8.equals(RequestPermissionsCategories.NOTIFICATION)) {
                    c = 6;
                    break;
                }
                break;
            case 75165:
                if (str8.equals("LBS")) {
                    c = 3;
                    break;
                }
                break;
            case 76105234:
                if (str8.equals("PHOTO")) {
                    c = 2;
                    break;
                }
                break;
            case 243470936:
                if (str8.equals("LBSSERVICE")) {
                    c = 4;
                    break;
                }
                break;
            case 440126534:
                if (str8.equals("SHORTCUT")) {
                    c = 8;
                    break;
                }
                break;
            case 769887116:
                if (str8.equals("SELFSTARTING")) {
                    c = 9;
                    break;
                }
                break;
            case 776097981:
                if (str8.equals("ADDRESSBOOK")) {
                    c = 0;
                    break;
                }
                break;
            case 1856013610:
                if (str8.equals(RequestPermissionsCategories.MICROPHONE)) {
                    c = 5;
                    break;
                }
                break;
            case 1979102811:
                if (str8.equals("BACKGROUNDER")) {
                    c = 7;
                    break;
                }
                break;
            case 1980544805:
                if (str8.equals(RequestPermissionsCategories.CAMERA)) {
                    c = 1;
                    break;
                }
                break;
        }
        String str9 = null;
        String str10 = "";
        switch (c) {
            case 0:
                strArr = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
                str10 = applicationContext.getString(R.string.griver_contact);
                break;
            case 1:
                strArr = new String[]{"android.permission.CAMERA"};
                str10 = applicationContext.getString(R.string.griver_camera);
                break;
            case 2:
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
                str10 = applicationContext.getString(R.string.griver_device_storage);
                break;
            case 3:
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", ManifestPermission.ACCESS_COARSE_LOCATION};
                str10 = applicationContext.getString(R.string.griver_location);
                break;
            case 4:
                str10 = applicationContext.getString(R.string.griver_location_service);
                break;
            case 5:
                str10 = applicationContext.getString(R.string.griver_microphone);
                strArr = new String[]{id.dana.util.permission.ManifestPermission.RECORD_AUDIO};
                break;
            case 6:
                str10 = applicationContext.getString(R.string.griver_notification);
                break;
            case 8:
                strArr = new String[]{"com.android.launcher.permission.INSTALL_SHORTCUT", "com.android.launcher.permission.UNINSTALL_SHORTCUT"};
                break;
        }
        strArr = null;
        if (TextUtils.equals(str8, "LBSSERVICE")) {
            if (a((Context) applicationContext)) {
                return false;
            }
        } else if (a(strArr)) {
            return false;
        }
        final Activity activity = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity().get();
        if (TextUtils.isEmpty(str10) || activity == null) {
            return false;
        }
        GriverAuthGuideContentExtension.AuthGuideContent authGuideContent = ((GriverAuthGuideContentExtension) RVProxy.get(GriverAuthGuideContentExtension.class)).getAuthGuideContent(str8);
        String string = applicationContext.getString(R.string.griver_open_specific_permission, new Object[]{str10});
        String string2 = applicationContext.getString(R.string.griver_device_go_to_specific_permission, new Object[]{str10});
        String string3 = applicationContext.getString(R.string.griver_go_to_enable_permission);
        String string4 = applicationContext.getString(R.string.griver_base_cancel);
        if (authGuideContent != null) {
            String a2 = a(authGuideContent.title, string);
            String a3 = a(authGuideContent.message, string2);
            String a4 = a(authGuideContent.positiveButtonText, string3);
            String a5 = a(authGuideContent.negativeButtonText, string4);
            String a6 = a(authGuideContent.positiveButtonColor, (String) null);
            str3 = a5;
            str7 = a(authGuideContent.negativeButtonColor, (String) null);
            str5 = a3;
            str6 = a2;
            str4 = a4;
            str9 = a6;
            z = authGuideContent.cancelable;
        } else {
            str3 = string4;
            str7 = null;
            str5 = string2;
            str6 = string;
            str4 = string3;
        }
        CreateDialogParam createDialogParam = new CreateDialogParam(str6, str5, str4, str3, (String) null);
        createDialogParam.positiveTextColor = str9;
        createDialogParam.negativeTextColor = str7;
        createDialogParam.cancelable = z;
        createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.equals("LBSSERVICE", str8)) {
                    AuthGuideExtension.this.a(activity);
                } else {
                    AuthGuideExtension.this.b(activity);
                }
            }
        };
        Dialog createDialog = ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).createDialog(activity, createDialogParam);
        if (createDialog != null) {
            createDialog.show();
            ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).applyShow(createDialog, createDialogParam);
        }
        return true;
    }

    private String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    private boolean a(@NonNull Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
            return false;
        }
        GriverLogger.d("TAG", "lbs service is enabled");
        return true;
    }

    private boolean a(String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (!PermissionUtils.hasPermission(strArr[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void a(@NonNull Activity activity) {
        try {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception e) {
            GriverLogger.e("TAG", "go to system setting failed", e);
        }
    }

    /* access modifiers changed from: private */
    public void b(@NonNull Activity activity) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), (String) null));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            GriverLogger.e("TAG", "go to app setting failed", e);
        }
    }
}
