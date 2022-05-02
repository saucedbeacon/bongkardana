package com.alibaba.griver.init;

public class IAPGriverConfig extends IAPConfig {
    private static IAPGriverConfig instance;

    private IAPGriverConfig() {
    }

    public static synchronized IAPGriverConfig getInstance() {
        IAPGriverConfig iAPGriverConfig;
        synchronized (IAPGriverConfig.class) {
            if (instance == null) {
                instance = new IAPGriverConfig();
            }
            iAPGriverConfig = instance;
        }
        return iAPGriverConfig;
    }
}
