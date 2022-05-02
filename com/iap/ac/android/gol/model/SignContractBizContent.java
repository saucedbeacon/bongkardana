package com.iap.ac.android.gol.model;

import androidx.annotation.Nullable;
import java.util.Set;

public class SignContractBizContent {
    public String acquirerId;
    public String authClientId;
    public String authClientLogo;
    public String authClientName;
    public String authRedirectUrl;
    public String authState;
    public String clientId;
    @Nullable
    public String passThroughInfo;
    public String pspId;
    public String referenceAgreementId;
    public Set<String> scopes;
    public String terminalType;
}
