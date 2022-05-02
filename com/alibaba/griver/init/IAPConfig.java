package com.alibaba.griver.init;

import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alibaba.griver.core.GriverConfiguration;

public class IAPConfig extends GriverConfiguration {
    private String alwaysShowDiagnosticTool = "";
    private String authCode;
    private String env;
    private String environment;
    private IAPIntegrationConfiguration extra;
    private String gatewayUrl = "";
    private String gpSignature = "";
    private String useAmcsLite;
    private String useSecurityGuard;

    public String getEnv() {
        return this.env;
    }

    public void setEnv(String str) {
        this.env = str;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public String getAuthCode() {
        String str = this.authCode;
        return str == null ? SecurityConstants.DEFAULT_AUTH_CODE : str;
    }

    public void setAuthCode(String str) {
        this.authCode = str;
    }

    public String getUseAmcsLite() {
        return this.useAmcsLite;
    }

    public void setUseAmcsLite(String str) {
        this.useAmcsLite = str;
    }

    public String getUseSecurityGuard() {
        return this.useSecurityGuard;
    }

    public void setUseSecurityGuard(String str) {
        this.useSecurityGuard = str;
    }

    public String getGpSignature() {
        return this.gpSignature;
    }

    public void setGpSignature(String str) {
        this.gpSignature = str;
    }

    public IAPIntegrationConfiguration getExtra() {
        return this.extra;
    }

    public void setExtra(IAPIntegrationConfiguration iAPIntegrationConfiguration) {
        this.extra = iAPIntegrationConfiguration;
    }

    public String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public void setGatewayUrl(String str) {
        this.gatewayUrl = str;
    }

    public String getAlwaysShowDiagnosticTool() {
        return this.alwaysShowDiagnosticTool;
    }

    public void setAlwaysShowDiagnosticTool(String str) {
        this.alwaysShowDiagnosticTool = str;
    }
}
