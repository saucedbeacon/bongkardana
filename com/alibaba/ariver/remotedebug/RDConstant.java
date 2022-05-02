package com.alibaba.ariver.remotedebug;

public interface RDConstant {
    public static final String ACTION_CALL_BRIDGE = "callBridge";
    public static final String CONFIG_H5_REMOTEDEBUG_USE_OPEN_CHANNEL = "h5_remoteDebugUseOpenchannel";
    public static final String IS_REMOTE_X = "isRemoteX";
    public static final String JAVASCRIPT_SCHEME = "javascript:";
    public static final String KEY_CONSOLE_HOST_APP_START_TOKEN = "consoleHostAppStartToken";
    public static final String KYLIN_BRIDGE = "https://alipay.kylinBridge";
    public static final String REMOTE_DEBUG_ID = "ws-remote-debug-";
    public static final String RENDER_DEBUG_MESSAGE = "renderDebugMessage";
    public static final String SOCKET_MESSAGE = "socketMessage";
    public static final String TINY_DEBUG_CONSOLE = "tinyDebugConsole";
    public static final String WEBSOCKET_HOST_URL_OPEN_CHANNEL = "wss://openchannel.alipay.com/group/connect/%s?scene=tinyAppDebug&roleType=TINYAPP&roleId=%s";
    public static final String WEBSOCKET_HOST_URL_OPEN_CHANNEL_PREFIX = "wss://openchannel.alipay.com/group/connect/";
    public static final String WEBSOCKET_HOST_URL_PREFIX = "wss://hpmweb.alipay.com/host/";
    public static final String WEBSOCKET_HOST_URL_PRE_PREFIX = "wss://hpmweb-pre.alipay.com/host/";
}
