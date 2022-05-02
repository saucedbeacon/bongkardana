package com.iap.ac.android.diagnoselog.rpc.marmotconfig;

import java.io.Serializable;

public class MarmotConfigResult implements Serializable {
    public String OSSAccessKeyId;
    public String Signature;
    public String key;
    public String policy;
    public Boolean success;
    public String taskId;
    public String uploadUrl;
}
