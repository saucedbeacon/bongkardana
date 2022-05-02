package com.alipay.plus.push.core.rpc;

public final class ResultPbPB {
    public static final String DEFAULT_CODE = "";
    public static final String DEFAULT_MESSAGE = "";
    public static final Boolean DEFAULT_SUCCESS = Boolean.FALSE;
    public static final int TAG_CODE = 2;
    public static final int TAG_MESSAGE = 3;
    public static final int TAG_SUCCESS = 1;
    public String code;
    public String message;
    public Boolean success;

    public ResultPbPB(ResultPbPB resultPbPB) {
        if (resultPbPB != null) {
            this.success = resultPbPB.success;
            this.code = resultPbPB.code;
            this.message = resultPbPB.message;
        }
    }

    public ResultPbPB() {
    }

    public final ResultPbPB fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.success = (Boolean) obj;
        } else if (i == 2) {
            this.code = (String) obj;
        } else if (i == 3) {
            this.message = (String) obj;
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{success=");
        sb.append(this.success);
        sb.append(", code='");
        sb.append(this.code);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
