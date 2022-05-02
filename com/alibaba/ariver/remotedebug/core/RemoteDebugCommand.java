package com.alibaba.ariver.remotedebug.core;

public interface RemoteDebugCommand {
    public static final String CMD_DEBUG_JS = "CMD:DEBUG_MSG:";
    public static final String CMD_HIT_BREAKPOINT = "CMD:HIT_BREAKPOINT";
    public static final String CMD_LOCAL_DISCONNECTED = "CMD:LOCAL_DISCONNECTED";
    public static final String CMD_RECV_RENDER_DEBUG = "CMD:RECV_RENDER_DEBUG:";
    public static final String CMD_RELEASE_BREAKPOINT = "CMD:RELEASE_BREAKPOINT";
    public static final String CMD_REMOTE_DISCONNECTED = "CMD:REMOTE_DISCONNECTED";
    public static final String CMD_WORKERID_AND_PLATFORM = "CMD:REGISTER_WORKER:%s:%s";
}
