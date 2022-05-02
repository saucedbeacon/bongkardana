package com.alibaba.griver.ui.popmenu;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.ui.popmenu.ITinyMenuPopupWindow;
import java.util.List;

public class TinyMenuPopupWindowProxy implements ITinyMenuPopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private TinyMenuPopupWindow f10602a;
    private LandScapeTinyMenuPopupWindow b;

    public TinyMenuPopupWindowProxy(Context context) {
        this.f10602a = new TinyMenuPopupWindow(context);
        this.b = new LandScapeTinyMenuPopupWindow(context);
    }

    public static String getOrientation(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            str = a((Activity) context);
        }
        return str == null ? a(context) : str;
    }

    private static String a(Activity activity) {
        int requestedOrientation = activity.getRequestedOrientation();
        if (requestedOrientation == 0) {
            return "landscape";
        }
        if (requestedOrientation != 1) {
            return null;
        }
        return RVParams.LONG_PORTRAIT;
    }

    private static String a(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return RVParams.LONG_PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }

    public void setCurrentAppId(String str) {
        this.f10602a.setCurrentAppId(str);
        this.b.setCurrentAppId(str);
    }

    public void setH5Page(Page page) {
        this.f10602a.setH5Page(page);
        this.b.setH5Page(page);
    }

    public boolean isShowMenu() {
        return this.f10602a.isShowMenu() || this.b.isShowMenu();
    }

    public boolean isShowing() {
        return this.f10602a.isShowing() || this.b.isShowing();
    }

    public void showMenu(Context context) {
        String orientation = getOrientation(context);
        RVLogger.d("TinyMenuPopupWindowProxy", "showMenu ".concat(String.valueOf(orientation)));
        if ("landscape".equals(orientation)) {
            RVLogger.d("TinyMenuPopupWindowProxy", "show Menu landscape");
            this.b.showMenu(context);
            return;
        }
        RVLogger.d("TinyMenuPopupWindowProxy", "show Menu normal");
        this.f10602a.showMenu(context);
    }

    public void setMenuClickListener(View.OnClickListener onClickListener) {
        this.f10602a.setMenuClickListener(onClickListener);
        this.b.setMenuClickListener(onClickListener);
    }

    public void setOnMenuWindowDismissListener(ITinyMenuPopupWindow.OnMenuWindowDismissListener onMenuWindowDismissListener) {
        this.f10602a.setOnMenuWindowDismissListener(onMenuWindowDismissListener);
        this.b.setOnMenuWindowDismissListener(onMenuWindowDismissListener);
    }

    public void setMenus(List<TinyMenuItemData> list) {
        this.f10602a.setMenus(list);
        this.b.setMenus(list);
    }

    public void setRecentUseTinyAppList(List<TinyMenuFunctionModel> list) {
        this.f10602a.setRecentUseTinyAppList(list);
        this.b.setRecentUseTinyAppList(list);
    }

    public void isShowRecentUseTinyAppArea(boolean z) {
        this.f10602a.isShowRecentUseTinyAppArea(z);
        this.b.isShowRecentUseTinyAppArea(z);
    }

    public void updateFavoriteMenuItem(boolean z, List<TinyMenuItemData> list) {
        this.f10602a.updateFavoriteMenuItem(z, list);
        this.b.updateFavoriteMenuItem(z, list);
    }

    public void updateMessageMenuItem(List<TinyMenuItemData> list) {
        this.f10602a.updateMessageMenuItem(list);
        this.b.updateMessageMenuItem(list);
    }

    public void setTinyAppDesc(String str) {
        this.f10602a.setTinyAppDesc(str);
        this.b.setTinyAppDesc(str);
    }

    public void setMiniAbout(TinyMenuItemData tinyMenuItemData) {
        this.f10602a.setMiniAbout(tinyMenuItemData);
        this.b.setMiniAbout(tinyMenuItemData);
    }

    public void updateCornerMarking(List<CornerMarkingData> list) {
        this.f10602a.updateCornerMarking(list);
        this.b.updateCornerMarking(list);
    }

    public void doDismissWithAnimation(boolean z) {
        if (RVStartParams.KEY_LANDSCAPE_SHORT.equals(getOrientation(GriverEnv.getApplicationContext()))) {
            this.b.doDismissWithAnimation(z);
        } else {
            this.f10602a.doDismissWithAnimation(z);
        }
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f10602a.setOnShowListener(onShowListener);
        this.b.setOnShowListener(onShowListener);
    }
}
