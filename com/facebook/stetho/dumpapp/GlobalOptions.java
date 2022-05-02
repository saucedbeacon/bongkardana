package com.facebook.stetho.dumpapp;

import id.dana.usereducation.constant.BottomSheetType;
import o.appendCode;
import o.appendUpMsgLens;

public class GlobalOptions {
    public final appendCode optionHelp = new appendCode("h", "help", false, "Print this help");
    public final appendCode optionListPlugins = new appendCode("l", BottomSheetType.LIST, false, "List available plugins");
    public final appendCode optionProcess = new appendCode("p", "process", true, "Specify target process");
    public final appendUpMsgLens options;

    public GlobalOptions() {
        appendUpMsgLens appendupmsglens = new appendUpMsgLens();
        this.options = appendupmsglens;
        appendupmsglens.addOption(this.optionHelp);
        this.options.addOption(this.optionListPlugins);
        this.options.addOption(this.optionProcess);
    }
}
