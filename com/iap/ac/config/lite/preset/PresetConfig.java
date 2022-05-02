package com.iap.ac.config.lite.preset;

import java.util.List;

public class PresetConfig {
    public List<SiteConfig> firstPartyConfig;

    public static class SiteConfig {
        public String amcsGatewayUrl;
        public String androidProductId;
        public String appId;
        public String authCode;
        public String env;
        public String gatewayAppId;
        public String gatewayWorkspaceId;
        public String logGatewayUrl;
        public int schemeVersion;
        public String workspaceId;
    }
}
