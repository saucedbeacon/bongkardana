package com.alibaba.ariver.app.api.mtop;

import java.io.Serializable;

public class SendMtopResponse implements Serializable {
    public byte[] data;
    public String errorCode;
    public String errorMsg;
    public boolean success;
}
