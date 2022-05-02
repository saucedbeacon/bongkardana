package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.RVStartParams;

public class PageSource {
    public String sourceDesc = "";
    public String sourcePageAppLogToken = "";
    public SourceType sourceType = SourceType.UNKNOWN;

    public enum SourceType {
        START_APP("startApp"),
        PUSH_WINDOW(RVStartParams.FROM_TYPE_PUSH_WINDOW),
        SWITCH_TAB("switchTab"),
        EMBED_VIEW("embedView"),
        HREF_CHANGE("hrefChange"),
        UNKNOWN("unknown");
        
        private String raw;

        private SourceType(String str) {
            this.raw = str;
        }

        public final String getRaw() {
            return this.raw;
        }
    }
}
