package com.google.android.play.core.install.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface AppUpdateType {
    public static final int FLEXIBLE = 0;
    public static final int IMMEDIATE = 1;
}
