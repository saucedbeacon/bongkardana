package id.dana.domain.payasset.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface CardScheme {
    public static final String AMERICAN_EXPRESS = "AMEXW7ID";
    public static final String BCA = "BCAC7ID";
    public static final String GPN = "GPN";
    public static final String JCB = "JCBW7ID";
    public static final String MASTERCARD = "MASTW7ID";
    public static final String VISA = "VISAW7ID";
}
