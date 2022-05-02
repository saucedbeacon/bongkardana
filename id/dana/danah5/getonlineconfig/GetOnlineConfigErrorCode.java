package id.dana.danah5.getonlineconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface GetOnlineConfigErrorCode {
    public static final String GENERAL_ERROR = "001";
    public static final String PAYLOAD_NOT_MATCH = "003";
    public static final String SECTION_UNDEFINED = "002";
}
