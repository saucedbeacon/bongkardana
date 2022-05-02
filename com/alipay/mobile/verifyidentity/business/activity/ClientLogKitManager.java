package com.alipay.mobile.verifyidentity.business.activity;

public class ClientLogKitManager {
    public static ClientLogKit logKit = new DefaultClientLogKit();

    public static void injectClientLogKit(ClientLogKit clientLogKit) {
        if (clientLogKit != null) {
            logKit = clientLogKit;
        }
    }

    public static ClientLogKit getClientLogKit() {
        return logKit;
    }
}
