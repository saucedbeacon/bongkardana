package com.alibaba.griver.api.h5.appinfo;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;

public class GriverH5AppInfo implements Serializable {
    public String appId;
    public String downloadURL;
    public String extendInfo;
    public String index;
    public String publishingStatus;
    public String remoteURLPrefix;
    public boolean shouldLoadRemote;
    public String type;
    public String updatePolicy;
    public String version;

    public static class AppType {
        public static final String NORMAL = "normal";
        public static final String RESOURCE = "resource";
        public static final String SPA = "spa";
    }

    public static class UpdatePolicy {
        public static final String BLOCK_AND_WAIT = "blockAndWait";
        public static final String LOAD_PREVIOUS = "loadPrevious";
        public static final String LOAD_REMOTE = "loadRemote";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubAppConfig ");
        sb.append(JSON.toJSONString(this));
        return sb.toString();
    }
}
