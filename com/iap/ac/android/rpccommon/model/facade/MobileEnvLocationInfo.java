package com.iap.ac.android.rpccommon.model.facade;

import java.io.Serializable;

public class MobileEnvLocationInfo implements Serializable {
    public String latitude;
    public String longitude;
    public String status;
    public String type;
    public long updateTime = 0;
}
