package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

class InstallerPackageNameProvider {
    private static final String NO_INSTALLER_PACKAGE_NAME = "";
    private String installerPackageName;

    InstallerPackageNameProvider() {
    }

    /* access modifiers changed from: package-private */
    public synchronized String getInstallerPackageName(Context context) {
        if (this.installerPackageName == null) {
            this.installerPackageName = loadInstallerPackageName(context);
        }
        if ("".equals(this.installerPackageName)) {
            return null;
        }
        return this.installerPackageName;
    }

    private static String loadInstallerPackageName(Context context) {
        String installerPackageName2 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName2 == null ? "" : installerPackageName2;
    }
}
