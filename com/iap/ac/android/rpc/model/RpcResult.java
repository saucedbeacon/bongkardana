package com.iap.ac.android.rpc.model;

import java.io.Serializable;

public class RpcResult<T> implements Serializable {
    private static final long serialVersionUID = 8238795488637043019L;
    public String memo;
    public T result;
    public int resultStatus;
    public String tips;
}
