package id.dana.plugin.bca;

import org.jetbrains.annotations.NotNull;

public class BcaIntegrationKitProdBridge extends BcaIntegrationKitBridge {
    @NotNull
    public String getEnvironment() {
        return "PROD";
    }
}
