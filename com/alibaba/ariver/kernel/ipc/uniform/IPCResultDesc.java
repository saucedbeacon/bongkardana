package com.alibaba.ariver.kernel.ipc.uniform;

public class IPCResultDesc {
    public static final int DEAD_OBJECT_ERROR = 201;
    public static final String DEAD_OBJECT_MSG = "android.os.DeadObjectException";
    public static final int INVOKE_METHOD_ERROR_CODE = 104;
    public static final String INVOKE_METHOD_ERROR_MSG = "Invoke method error";
    public static final int IPC_NO_BINDER_CODE = 2;
    public static final String IPC_NO_BINDER_MSG = "IPC no bind， Please try again later";
    public static final int IPC_PARAMER_ERROR_CODE = 3;
    public static final String IPC_PARAMER_ERROR_MSG = "Parameter more than one,and not all Serialize,please check it";
    public static final int METHOD_NOT_FOUND_CODE = 101;
    public static final String METHOD_NOT_FOUND_MSG = "Method not found";
    public static final int NO_REGISTRANT_CODE = 1;
    public static final String NO_REGISTRANT_MSG = "Peer not registered";
    public static final int NUMBER_OF_PARAMETERS_NOT_MATCH_CODE = 102;
    public static final String NUMBER_OF_PARAMETERS_NOT_MATCH_MSG = "The number of parameters does not match";
    public static final int PARAM_DESRIALIZ_ERROR_CODE = 103;
    public static final String PARAM_DESRIALIZ_ERROR_MSG = "Param deserializ error";
    public static final int RETURN_IPCRESULT_IS_NULL_CODE = 106;
    public static final String RETURN_IPCRESULT_IS_NULL_MSG = "Returns the ipcResult is null";
    public static final int RETURN_TYPE_NOT_MATCH_CODE = 105;
    public static final String RETURN_TYPE_NOT_MATCH_MSG = "Return type not match";
    public static final int SERVICE_NOT_FOUND_CODE = 100;
    public static final String SERVICE_NOT_FOUND_MSG = "Service bean not found";
    public static final int SUCCESS_CODE = 0;
    public static final int SYS_ERROR = 200;
}
