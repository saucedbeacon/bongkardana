package id.dana.domain.registration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AuthenticationMethod {
    public static final String FACE_LOGIN = "MIC_FACE";
    public static final String PASSWORD = "PASSWORD";
}
