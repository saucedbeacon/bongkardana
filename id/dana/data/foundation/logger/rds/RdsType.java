package id.dana.data.foundation.logger.rds;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RdsType {
    public static final String KEY_RDS = "rdsJsonUa";
    public static final String KEY_RDS_SCENE = "rdsScene";
}
