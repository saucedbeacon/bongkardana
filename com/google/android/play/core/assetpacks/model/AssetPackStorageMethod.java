package com.google.android.play.core.assetpacks.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface AssetPackStorageMethod {
    public static final int APK_ASSETS = 1;
    public static final int STORAGE_FILES = 0;
}
