package com.alipay.iap.android.aplog.api;

public interface ProcessInfo {
    public static final String ALIAS_MAIN = "main";
    public static final String ALIAS_TOOLS = "tools";
    public static final String ALIAS_UNKNOWN = "unknown";

    String getMainProcessName();

    String getPackageName();

    String getProcessAlias();

    int getProcessID();

    String getProcessNameByID(int i);

    String getProcessTag();

    String getToolsProcessName();

    boolean isMainProcess();

    boolean isToolsProcess();
}
