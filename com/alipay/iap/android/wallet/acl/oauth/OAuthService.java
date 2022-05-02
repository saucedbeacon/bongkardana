package com.alipay.iap.android.wallet.acl.oauth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseResult;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;
import java.util.Map;
import java.util.Set;

@ServiceMetaInfo(category = ServiceCategory.ACL, serviceName = "aplus.service.oauth", type = ServiceType.OAUTH)
public interface OAuthService extends BaseService {
    public static final String SCOPE_AGREEMENT_PAY = "AGREEMENT_PAY";
    public static final String SCOPE_AUTH_BASE = "auth_base";
    public static final String SCOPE_AUTH_USER = "auth_user";
    public static final String SCOPE_BASE_USER_INFO = "BASE_USER_INFO";
    public static final String SCOPE_HASH_LOGIN_ID = "HASH_LOGIN_ID";
    public static final String SCOPE_USER_AVATAR = "USER_AVATAR";
    public static final String SCOPE_USER_BIRTHDAY = "USER_BIRTHDAY";
    public static final String SCOPE_USER_CONTACTINFO = "USER_CONTACTINFO";
    public static final String SCOPE_USER_GENDER = "USER_GENDER";
    public static final String SCOPE_USER_ID = "USER_ID";
    public static final String SCOPE_USER_INFO = "USER_INFO";
    public static final String SCOPE_USER_INFO_FOR_CN = "USER_INFO_FOR_CN";
    public static final String SCOPE_USER_LOGIN_ID = "USER_LOGIN_ID";
    public static final String SCOPE_USER_NAME = "USER_NAME";
    public static final String SCOPE_USER_NATIONALITY = "USER_NATIONALITY";
    public static final String SCOPE_USER_NICKNAME = "USER_NICKNAME";

    void consultAuthPage(String str, Map<String, String> map, APIContext aPIContext, Callback<OAuthConsultResult> callback);

    void consultAuthPage(String str, Set<String> set, Map<String, String> map, APIContext aPIContext, Callback<OAuthConsultResult> callback);

    void getAuthCode(String str, OAuthCodeFlowType oAuthCodeFlowType, Map<String, String> map, APIContext aPIContext, Callback<OAuthResult> callback);

    void getAuthCode(String str, Set<String> set, OAuthCodeFlowType oAuthCodeFlowType, Map<String, String> map, APIContext aPIContext, Callback<OAuthResult> callback);

    void getAuthorizedScopes(String str, Map<String, String> map, APIContext aPIContext, Callback<OAuthScopeQueryResult> callback);

    void revokeAuthorizedScopes(@NonNull String str, @NonNull Set<String> set, @Nullable Map<String, String> map, @Nullable APIContext aPIContext, @NonNull Callback<BaseResult> callback);

    void showAuthPage(String str, String str2, String str3, Set<String> set, Map<String, String> map, APIContext aPIContext, Callback<OAuthPageConfirmResult> callback);
}
