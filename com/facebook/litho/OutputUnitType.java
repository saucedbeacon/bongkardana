package com.facebook.litho;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface OutputUnitType {
    public static final int BACKGROUND = 1;
    public static final int BORDER = 4;
    public static final int CONTENT = 0;
    public static final int FOREGROUND = 2;
    public static final int HOST = 3;
}
