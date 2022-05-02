package com.alibaba.griver.ui.popmenu;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import java.util.List;

public interface ITinyMenuPopupWindow {

    public interface OnMenuWindowDismissListener {
        void onDismiss(ITinyMenuPopupWindow iTinyMenuPopupWindow);
    }

    void doDismissWithAnimation(boolean z);

    boolean isShowMenu();

    void isShowRecentUseTinyAppArea(boolean z);

    boolean isShowing();

    void setCurrentAppId(String str);

    void setH5Page(Page page);

    void setMenuClickListener(View.OnClickListener onClickListener);

    void setMenus(List<TinyMenuItemData> list);

    void setMiniAbout(TinyMenuItemData tinyMenuItemData);

    void setOnMenuWindowDismissListener(OnMenuWindowDismissListener onMenuWindowDismissListener);

    void setOnShowListener(DialogInterface.OnShowListener onShowListener);

    void setRecentUseTinyAppList(List<TinyMenuFunctionModel> list);

    void setTinyAppDesc(String str);

    void showMenu(Context context);

    void updateCornerMarking(List<CornerMarkingData> list);

    void updateFavoriteMenuItem(boolean z, List<TinyMenuItemData> list);

    void updateMessageMenuItem(List<TinyMenuItemData> list);
}
