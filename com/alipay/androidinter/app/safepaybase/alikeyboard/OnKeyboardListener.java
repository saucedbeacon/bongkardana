package com.alipay.androidinter.app.safepaybase.alikeyboard;

public interface OnKeyboardListener {
    void onDel();

    void onInput(String str);

    void onOK();

    void onStatisticEvent(String str);
}
