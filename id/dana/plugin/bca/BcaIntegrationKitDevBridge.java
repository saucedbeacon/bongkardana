package id.dana.plugin.bca;

import org.jetbrains.annotations.NotNull;

public class BcaIntegrationKitDevBridge extends BcaIntegrationKitBridge {
    @NotNull
    public String getEnvironment() {
        return "DEV";
    }
}
