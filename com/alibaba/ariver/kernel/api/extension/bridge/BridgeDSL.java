package com.alibaba.ariver.kernel.api.extension.bridge;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class BridgeDSL {
    public static final String CMD = "cmd";
    public static final String EVENT = "event";
    public static final String INVOKE = "invoke";
    public static final String NAME = "name";
    public static final String NAME_SPACE = "namespace";
    public static final String TYPE = "type";
    String cmd;
    String name;
    String namespace;
    String type;

    public BridgeDSL(String str, String str2, String str3, String str4) {
        this.cmd = str;
        this.name = str2;
        this.namespace = str3;
        this.type = str4;
    }

    public BridgeDSL(String str, String str2, String str3) {
        this.name = str;
        this.namespace = str2;
        this.type = str3;
        this.cmd = "";
    }

    public String toJSONString() {
        if (TextUtils.equals(INVOKE, this.type)) {
            StringBuilder sb = new StringBuilder("{'namespace':'");
            sb.append(this.namespace);
            sb.append("','name':'");
            sb.append(this.name);
            sb.append("','cmd':'");
            sb.append(this.cmd);
            sb.append("','type':'");
            sb.append(this.type);
            sb.append("'}");
            return sb.toString();
        } else if (TextUtils.equals("event", this.type)) {
            StringBuilder sb2 = new StringBuilder("{'namespace':'");
            sb2.append(this.namespace);
            sb2.append("','name':'");
            sb2.append(this.name);
            sb2.append("','type':'");
            sb2.append(this.type);
            sb2.append("'}");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("Register DSL error: Invalid type [");
            sb3.append(this.type);
            sb3.append("]");
            RVLogger.e(sb3.toString());
            return "";
        }
    }
}
