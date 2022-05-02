package id.dana.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Source {
    public static final String AMCS = "amcs";
    public static final String LOCAL = "local";
    public static final String MOCK = "mock";
    public static final String NETWORK = "network";
    public static final String SPLIT = "split";
}
