package com.facebook.litho;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface FrameworkLogEvents {

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogEventId {
    }
}
