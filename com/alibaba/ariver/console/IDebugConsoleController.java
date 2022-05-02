package com.alibaba.ariver.console;

public interface IDebugConsoleController {
    void preloadConsole();

    void sendMsgToConsole(String str);

    void showToggleButton(boolean z);

    void toggleConsole();
}
