package id.dana.util.media;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MimeType {
    public static final String IMAGE_ALL = "image/*";
    public static final String JSON = "application/json";
    public static final String PDF = "application/pdf";
}
