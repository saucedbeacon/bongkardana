package com.iap.ac.android.biz.common.model.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

public class AuthPageRequest {
    @Nullable
    public String authClientLogo;
    @Nullable
    public String authClientName;
    @NonNull
    public String clientId;
    @Nullable
    public String passThroughInfo;
    @NonNull
    public Set<String> scopes;
}
