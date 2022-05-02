package com.iap.ac.android.biz.common.model;

import java.util.List;
import java.util.Map;

public class AuthResult {
    public String authCode;
    public Map<String, String> authErrorScopes;
    public String authRedirectUrl;
    public String authState;
    public List<String> authSuccessScopes;
    public String errorCode;
    public String errorMessage;
}
