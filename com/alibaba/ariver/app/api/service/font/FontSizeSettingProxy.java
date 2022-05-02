package com.alibaba.ariver.app.api.service.font;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface FontSizeSettingProxy extends Proxiable {

    public interface OnFontSizeSettingChangeListener {
        void onChange(FontSizeSetting fontSizeSetting);
    }

    FontSizeSetting getFontSizeSetting();

    void registerFontSizeChangeListener(OnFontSizeSettingChangeListener onFontSizeSettingChangeListener);

    void unRegiseterFontSizeChangeListener(OnFontSizeSettingChangeListener onFontSizeSettingChangeListener);
}
