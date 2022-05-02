package com.alibaba.griver.ui.titlebar;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface TitleView {

    public enum OptionType {
        ICON,
        TEXT,
        MENU
    }

    void enableTitleSegControl(boolean z);

    ColorDrawable getContentBackgroundView();

    View getContentView();

    View getDivider();

    TextView getMainTitleView();

    View getOptionMenuContainer();

    View getPopAnchor();

    TextView getSubTitleView();

    String getTitle();

    void initTitleSegControl(JSONObject jSONObject);

    void openTranslucentStatusBarSupport(int i);

    void performLastSegItemChecked(boolean z);

    void releaseViewList();

    void resetTitleColor(int i);

    void setBackButtonColor(int i);

    void setBackCloseButtonImage(String str);

    void setBackCloseButtonImage(String str, Bundle bundle);

    void setBackHomeButtonColor(int i);

    void setButtonIcon(Bitmap bitmap, int i);

    void setButtonSize(float f);

    void setCloseButtonColor(int i);

    void setImgTitle(Bitmap bitmap);

    void setImgTitle(Bitmap bitmap, String str);

    void setOptionMenu(String str, String str2, String str3, boolean z, String str4, boolean z2, JSONArray jSONArray, String str5, String str6, String str7);

    void setOptionMenuColor(int i);

    void setOptionType(OptionType optionType);

    void setOptionType(OptionType optionType, int i, boolean z);

    void setPage(Page page);

    void setSubTitle(String str);

    void setTitle(String str);

    void setTitleBackgroundImage(int i);

    void setTitleLoading(int i);

    void setTitleTextColor(int i);

    void setTitleView(View view);

    void showBackButton(boolean z);

    void showCloseButton(boolean z);

    void showOptionMenu(boolean z);

    void showTitleDisclaimer(boolean z);

    void showTitleLoading(boolean z);

    void switchToBlueTheme();

    void switchToCustomTheme(int i);

    void switchToWhiteTheme();
}
