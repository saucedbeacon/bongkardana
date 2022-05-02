package com.alibaba.griver.ui.ant.theme;

import com.alibaba.griver.ui.R;

public class AUDefaultTheme extends AUAbsTheme {

    /* renamed from: a  reason: collision with root package name */
    private static final AUDefaultTheme f10569a = new AUDefaultTheme();

    private AUDefaultTheme() {
        initTheme();
    }

    public static final AUDefaultTheme getInstence() {
        return f10569a;
    }

    /* access modifiers changed from: protected */
    public void initTheme() {
        put(AUThemeKey.MAIN_BTN_HEIGHT, Integer.valueOf(R.dimen.griver_AU_HEIGHT10));
        put(AUThemeKey.MAIN_BTN_BACKGROUND, Integer.valueOf(R.drawable.griver_ui_button_bg_for_main));
        put(AUThemeKey.MAIN_BTN_TEXTCOLOR, Integer.valueOf(R.color.griver_ui_button_textcolor_white));
        put(AUThemeKey.MAIN_BTN_TEXTSIZE, Integer.valueOf(R.dimen.griver_AU_TEXTSIZE5));
        put(AUThemeKey.SUB_BTN_HEIGHT, Integer.valueOf(R.dimen.griver_AU_HEIGHT10));
        put(AUThemeKey.SUB_BTN_BACKGROUND, Integer.valueOf(R.drawable.griver_ui_button_bg_for_sub));
        put(AUThemeKey.SUB_BTN_TEXTCOLOR, Integer.valueOf(R.color.griver_ui_button_textcolor_black));
        put(AUThemeKey.SUB_BTN_TEXTSIZE, Integer.valueOf(R.dimen.griver_AU_TEXTSIZE5));
        put(AUThemeKey.WARN_BTN_HEIGHT, Integer.valueOf(R.dimen.griver_AU_HEIGHT10));
        put(AUThemeKey.WARN_BTN_BACKGROUND, Integer.valueOf(R.drawable.griver_ui_button_bg_for_warn));
        put(AUThemeKey.WARN_BTN_TEXTCOLOR, Integer.valueOf(R.color.griver_ui_button_textcolor_white));
        put(AUThemeKey.WARN_BTN_TEXTSIZE, Integer.valueOf(R.dimen.griver_AU_TEXTSIZE5));
        put(AUThemeKey.ASS_TRANS_BTN_HEIGHT, Integer.valueOf(R.dimen.griver_AU_SPACE7));
        put(AUThemeKey.ASS_TRANS_BTN_BACKGROUND, Integer.valueOf(R.drawable.griver_ui_button_bg_for_ass_transparent));
        put(AUThemeKey.ASS_TRANS_BTN_TEXTCOLOR, Integer.valueOf(R.color.griver_ui_button_textcolor_blue));
        put(AUThemeKey.ASS_TRANS_BTN_TEXTSIZE, Integer.valueOf(R.dimen.griver_AU_TEXTSIZE3));
        put(AUThemeKey.NO_RECT_BTN_HEIGHT, Integer.valueOf(R.dimen.griver_AU_SPACE12));
        put(AUThemeKey.NO_RECT_BTN_BACKGROUND, 17170445);
        put(AUThemeKey.NO_RECT_BTN_TEXTCOLOR, Integer.valueOf(R.color.griver_AU_COLOR9));
        put(AUThemeKey.NO_RECT_BTN_TEXTSIZE, Integer.valueOf(R.dimen.griver_AU_TEXTSIZE5));
    }
}
