package com.alibaba.ariver.kernel.api.security;

public enum ApiPermissionCheckResult {
    IGNORE,
    ALLOW,
    DENY,
    DENY_N22101("N22101"),
    DENY_N22102("N22102"),
    DENY_N22103("N22103"),
    DENY_N22104("N22104"),
    DENY_N22105("N22105"),
    DENY_N22106("N22106"),
    DENY_N22107("N22107"),
    DENY_N22108("N22108"),
    DENY_N22109("N22109"),
    DENY_N22110("N22110"),
    DENY_N22111("N22111"),
    DENY_N22201("N22201"),
    DENY_N22202("N22202"),
    DENY_N22203("N22203"),
    DENY_N22204("N22204"),
    DENY_N22205("N22205"),
    DENY_N22206("N22206"),
    DENY_N22207("N22207");
    
    private boolean hasSignature;
    private String signature;

    private ApiPermissionCheckResult(String str) {
        this.hasSignature = false;
        this.signature = str;
        this.hasSignature = true;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final boolean hasSignature() {
        return this.hasSignature;
    }

    public final boolean isSuccess() {
        return IGNORE == this || ALLOW == this;
    }
}
