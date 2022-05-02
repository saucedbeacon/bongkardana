package id.dana.data.user.source.network.request;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UserInfoRequest extends BaseRpcRequest implements Serializable {
    public static final String BALANCE = "BALANCE";
    public static final String FACE_AUTH = "FACE_AUTH";
    public static final String FULL = "FULL";
    public static final String KYC_INFO = "KYC_INFO";
    public static final String SIMPLE = "SIMPLE";
    public static final String STATUS_INFO = "STATUS_INFO";
    public static final String USER_PAN = "USER_PAN";
    public String queryType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface QueryTpeDef {
    }
}
