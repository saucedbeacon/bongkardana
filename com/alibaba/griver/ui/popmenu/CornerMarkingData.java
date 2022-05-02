package com.alibaba.griver.ui.popmenu;

public class CornerMarkingData {
    public String action;
    public String callback;
    public boolean exposed;
    public String icon;
    public String menuIconUrl;
    public String mid;
    public String name;
    public String noticeId;
    public String options;
    public String superscript;

    public String toJavaScript() {
        try {
            return String.format("javascript:(function(){function tinyApp_presetPopMenu_ready(callback){if(window.AlipayJSBridge){callback&&callback();}else{document.addEventListener('AlipayJSBridgeReady',callback,false);}}tinyApp_presetPopMenu_ready(AlipayJSBridge.call('%s', %s, %s));})();", new Object[]{this.action, this.options, this.callback});
        } catch (Exception unused) {
            return "";
        }
    }
}
