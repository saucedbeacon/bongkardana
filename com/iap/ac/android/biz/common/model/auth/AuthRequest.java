package com.iap.ac.android.biz.common.model.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

public class AuthRequest {
    @Nullable
    public String acquirerId;
    @NonNull
    public String authClientId;
    @Nullable
    public String authRedirectUrl;
    @NonNull
    public String clientId;
    @Nullable
    public String passThroughInfo;
    @Nullable
    public String referenceAgreementId;
    @NonNull
    public Set<String> scopes;
}
