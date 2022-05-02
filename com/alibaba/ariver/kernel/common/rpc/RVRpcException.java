package com.alibaba.ariver.kernel.common.rpc;

public class RVRpcException extends RuntimeException {
    public static final int DEFAULT_RPC_EXCEPTION_CODE = -1;
    private int code;

    public RVRpcException(int i) {
        this.code = i;
    }

    public RVRpcException(String str, int i) {
        super(str);
        this.code = i;
    }

    public RVRpcException(String str, Throwable th, int i) {
        super(str, th);
        this.code = i;
    }

    public RVRpcException(Throwable th, int i) {
        super(th);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
