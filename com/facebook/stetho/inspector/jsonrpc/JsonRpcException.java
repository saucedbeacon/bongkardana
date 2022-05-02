package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;

public class JsonRpcException extends Exception {
    private final JsonRpcError mErrorMessage;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsonRpcException(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode r1 = r3.code
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r3.message
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            java.lang.Object r3 = com.facebook.stetho.common.Util.throwIfNull(r3)
            com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError r3 = (com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError) r3
            r2.mErrorMessage = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.jsonrpc.JsonRpcException.<init>(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError):void");
    }

    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }
}
