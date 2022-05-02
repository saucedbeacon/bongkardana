package id.dana.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Filter {
    public static final String KEY = "key";
    public static final String NAME = "name";
}
