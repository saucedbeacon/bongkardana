package id.dana.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ServiceItemEditState {
    public static final int ADD = 1;
    public static final int NONE = 0;
    public static final int REMOVE = 2;
    public static final int SWAP = 3;
}
