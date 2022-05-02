package com.alibaba.griver.api.common.network;

import java.io.Serializable;

public class DownloadRequest implements Serializable {
    public String appId;
    public String deployVersion;
    public String downloadFilePath;
    public String downloadUrl;
    public int retryTime;
    public boolean urgent;
    public String version;
}
