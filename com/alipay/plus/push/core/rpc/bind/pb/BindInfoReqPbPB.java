package com.alipay.plus.push.core.rpc.bind.pb;

public final class BindInfoReqPbPB {
    public static final String DEFAULT_APPID = "";
    public static final String DEFAULT_DELIVERYTOKEN = "";
    public static final Integer DEFAULT_OSTYPE = 0;
    public static final String DEFAULT_USERID = "";
    public static final String DEFAULT_WORKSPACEID = "";
    public static final int TAG_APPID = 1;
    public static final int TAG_DELIVERYTOKEN = 4;
    public static final int TAG_OSTYPE = 5;
    public static final int TAG_USERID = 3;
    public static final int TAG_WORKSPACEID = 2;
    public String appId;
    public String deliveryToken;
    public Integer osType;
    public String userId;
    public String workspaceId;

    public BindInfoReqPbPB(BindInfoReqPbPB bindInfoReqPbPB) {
        this.appId = bindInfoReqPbPB.appId;
        this.workspaceId = bindInfoReqPbPB.workspaceId;
        this.userId = bindInfoReqPbPB.userId;
        this.deliveryToken = bindInfoReqPbPB.deliveryToken;
        this.osType = bindInfoReqPbPB.osType;
    }

    public BindInfoReqPbPB() {
    }

    public static class Builder {
        private BindInfoReqPbPB bindInfoReqPbPB = new BindInfoReqPbPB();

        public Builder workspaceId(String str) {
            this.bindInfoReqPbPB.workspaceId = str;
            return this;
        }

        public Builder appId(String str) {
            this.bindInfoReqPbPB.appId = str;
            return this;
        }

        public Builder deliveryToken(String str) {
            this.bindInfoReqPbPB.deliveryToken = str;
            return this;
        }

        public Builder userId(String str) {
            this.bindInfoReqPbPB.userId = str;
            return this;
        }

        public Builder osType(int i) {
            this.bindInfoReqPbPB.osType = Integer.valueOf(i);
            return this;
        }

        public BindInfoReqPbPB build() {
            return this.bindInfoReqPbPB;
        }
    }

    public final BindInfoReqPbPB fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.appId = (String) obj;
        } else if (i == 2) {
            this.workspaceId = (String) obj;
        } else if (i == 3) {
            this.userId = (String) obj;
        } else if (i == 4) {
            this.deliveryToken = (String) obj;
        } else if (i == 5) {
            this.osType = (Integer) obj;
        }
        return this;
    }
}
