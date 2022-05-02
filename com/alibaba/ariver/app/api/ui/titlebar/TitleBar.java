package com.alibaba.ariver.app.api.ui.titlebar;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.ColorInt;
import com.alibaba.ariver.app.api.Page;

public interface TitleBar {
    void attachPage(Page page);

    View getContent();

    View getDivider();

    Bitmap getImgTitle();

    String getSubTitle();

    String getTitle();

    @ColorInt
    int getTitleColor();

    String getTransparentTitle();

    void onDestroy();

    void setDivider(View view);

    void setTitle(String str, String str2, String str3, String str4, boolean z);

    void setTitleColor(int i, boolean z, boolean z2);

    void setTransparentTitle(String str);

    void showBackButton(boolean z);

    void showOptionMenu(boolean z);

    void showTitleLoading(boolean z);
}
