package com.alipay.plus.push.core.rpc.bind.pb;

public final class UnbindReqPbPB {
    public static final String DEFAULT_APPID = "";
    public static final String DEFAULT_DELIVERYTOKEN = "";
    public static final String DEFAULT_USERID = "";
    public static final String DEFAULT_WORKSPACEID = "";
    public static final int TAG_APPID = 1;
    public static final int TAG_DELIVERYTOKEN = 4;
    public static final int TAG_USERID = 3;
    public static final int TAG_WORKSPACEID = 2;
    public String appId;
    public String deliveryToken;
    public String userId;
    public String workspaceId;

    public UnbindReqPbPB(UnbindReqPbPB unbindReqPbPB) {
        this.appId = unbindReqPbPB.appId;
        this.workspaceId = unbindReqPbPB.workspaceId;
        this.userId = unbindReqPbPB.userId;
        this.deliveryToken = unbindReqPbPB.deliveryToken;
    }

    public UnbindReqPbPB() {
    }

    public static class Builder {
        private UnbindReqPbPB unbindReqPbPB = new UnbindReqPbPB();

        public Builder appId(String str) {
            this.unbindReqPbPB.appId = str;
            return this;
        }

        public Builder workspaceId(String str) {
            this.unbindReqPbPB.workspaceId = str;
            return this;
        }

        public Builder userId(String str) {
            this.unbindReqPbPB.userId = str;
            return this;
        }

        public Builder deliveryToken(String str) {
            this.unbindReqPbPB.deliveryToken = str;
            return this;
        }

        public UnbindReqPbPB build() {
            return this.unbindReqPbPB;
        }
    }

    public final UnbindReqPbPB fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.appId = (String) obj;
        } else if (i == 2) {
            this.workspaceId = (String) obj;
        } else if (i == 3) {
            this.userId = (String) obj;
        } else if (i == 4) {
            this.deliveryToken = (String) obj;
        }
        return this;
    }
}
