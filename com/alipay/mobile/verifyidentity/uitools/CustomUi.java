package com.alipay.mobile.verifyidentity.uitools;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import com.alipay.CustomUiImpl;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;

public class CustomUi {
    private static CustomUiInterface customUiInterface;
    private static CustomUiInterface defaultCustomUiInterface = new CustomUiImpl();

    public static void setCustomUiInterface(CustomUiInterface customUiInterface2) {
        customUiInterface = customUiInterface2;
    }

    public static void showTipToast(Activity activity, int i, String str) {
        CustomUiInterface customUiInterface2;
        CustomUiInterface customUiInterface3 = customUiInterface;
        if ((customUiInterface3 == null || !customUiInterface3.showTipToast(activity, i, str)) && (customUiInterface2 = defaultCustomUiInterface) != null) {
            customUiInterface2.showTipToast(activity, i, str);
        }
    }

    public static void showCenterToast(Activity activity, String str) {
        CustomUiInterface customUiInterface2;
        CustomUiInterface customUiInterface3 = customUiInterface;
        if ((customUiInterface3 == null || !customUiInterface3.showCenterToast(activity, str)) && (customUiInterface2 = defaultCustomUiInterface) != null) {
            customUiInterface2.showCenterToast(activity, str);
        }
    }

    public static void showCenterToast(Activity activity, String str, int i) {
        CustomUiInterface customUiInterface2;
        CustomUiInterface customUiInterface3 = customUiInterface;
        if ((customUiInterface3 == null || !customUiInterface3.showCenterToast(activity, str, i)) && (customUiInterface2 = defaultCustomUiInterface) != null) {
            customUiInterface2.showCenterToast(activity, str, i);
        }
    }

    public static void showCenterToast(Activity activity, String str, int i, int i2) {
        CustomUiInterface customUiInterface2;
        CustomUiInterface customUiInterface3 = customUiInterface;
        if ((customUiInterface3 == null || !customUiInterface3.showCenterToast(activity, str, i, i2)) && (customUiInterface2 = defaultCustomUiInterface) != null) {
            customUiInterface2.showCenterToast(activity, str, i);
        }
    }

    public static void showCommonDialog(Activity activity, String str, String str2, int i, boolean z, ModalInterface modalInterface) {
        CustomUiInterface customUiInterface2;
        CustomUiInterface customUiInterface3 = customUiInterface;
        if ((customUiInterface3 == null || !customUiInterface3.showCommonDialog(activity, str, str2, i, z, modalInterface)) && (customUiInterface2 = defaultCustomUiInterface) != null) {
            customUiInterface2.showCommonDialog(activity, str, str2, i, z, modalInterface);
        }
    }

    public static Dialog createLoadingDialog(Activity activity) {
        Dialog createLoadingDialog;
        CustomUiInterface customUiInterface2 = customUiInterface;
        if (customUiInterface2 != null && (createLoadingDialog = customUiInterface2.createLoadingDialog(activity)) != null) {
            return createLoadingDialog;
        }
        CustomUiInterface customUiInterface3 = defaultCustomUiInterface;
        if (customUiInterface3 != null) {
            return customUiInterface3.createLoadingDialog(activity);
        }
        return null;
    }

    public static Typeface getTitleTypeface() {
        Typeface titleTextType;
        CustomUiInterface customUiInterface2 = customUiInterface;
        if (customUiInterface2 != null && (titleTextType = customUiInterface2.titleTextType()) != null) {
            return titleTextType;
        }
        CustomUiInterface customUiInterface3 = defaultCustomUiInterface;
        if (customUiInterface3 != null) {
            return customUiInterface3.titleTextType();
        }
        return null;
    }

    public static Typeface getBodyTitleTypeface() {
        Typeface bodyTitleTextType;
        CustomUiInterface customUiInterface2 = customUiInterface;
        if (customUiInterface2 != null && (bodyTitleTextType = customUiInterface2.bodyTitleTextType()) != null) {
            return bodyTitleTextType;
        }
        CustomUiInterface customUiInterface3 = defaultCustomUiInterface;
        if (customUiInterface3 != null) {
            return customUiInterface3.bodyTitleTextType();
        }
        return null;
    }

    public static Typeface getContentTypeface() {
        Typeface bodyContentTextType;
        CustomUiInterface customUiInterface2 = customUiInterface;
        if (customUiInterface2 != null && (bodyContentTextType = customUiInterface2.bodyContentTextType()) != null) {
            return bodyContentTextType;
        }
        CustomUiInterface customUiInterface3 = defaultCustomUiInterface;
        if (customUiInterface3 != null) {
            return customUiInterface3.bodyContentTextType();
        }
        return null;
    }
}
