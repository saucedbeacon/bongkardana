package com.alibaba.griver.ui.popmenu;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.ui.titlebar.H5NavMenuItem;
import java.util.List;

public class H5TinyPopMenu implements IH5TinyPopMenu {
    public static final String DEVELOPER_CUSTOM_MENU = "setCustomPopMenu";
    public static final String SHOW_BACK_TO_HOMEPAGE = "showBackToHomepage";
    public static final String SHOW_BACK_TO_HOME_POP_MENU = "showBackToHomeBackMenu";
    public static final String SHOW_BACK_TO_HOME_TITLE_BAR = "showBackToHomeTitleBar";
    public static final String SHOW_DESKTOP_POP_MENU = "showDesktopMenu";
    public static final String SHOW_FAVORITE_POP_MENU = "showFavoriteMenu";
    public static final String SHOW_SHARE_POP_MENU = "showShareMenu";
    public static final Object TAG_VIEW = new Object();

    /* renamed from: a  reason: collision with root package name */
    private IH5TinyPopMenu f10588a;
    private TitleBarTheme b;
    private boolean c = false;
    private boolean d = false;
    private List<H5NavMenuItem> e;

    public enum TitleBarTheme {
        TITLE_BAR_THEME_BLUE,
        TITLE_BAR_THEME_WHITE,
        TITLE_BAR_THEME_CUSTOM
    }

    public void showMenu() {
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.showMenu();
        }
    }

    public void onRelease() {
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.onRelease();
            this.f10588a = null;
        }
        this.b = null;
        this.d = false;
        this.c = false;
        this.e = null;
    }

    public void init(Page page, String str, Context context, ViewGroup viewGroup) {
        a(viewGroup);
        if (this.f10588a == null) {
            this.f10588a = a();
        }
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            try {
                iH5TinyPopMenu.init(page, str, context, viewGroup);
            } catch (Throwable unused) {
                RVLogger.e("H5TinyPopMenu", "new tiny menu init failed");
            }
        }
    }

    private IH5TinyPopMenu a() {
        return new TinyBlurMenu();
    }

    public void onSwitchToWhiteTheme() {
        this.b = TitleBarTheme.TITLE_BAR_THEME_WHITE;
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.onSwitchToWhiteTheme();
        }
    }

    public void onSwitchToBlueTheme() {
        this.b = TitleBarTheme.TITLE_BAR_THEME_BLUE;
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.onSwitchToBlueTheme();
        }
    }

    public void setH5MenuList(List<H5NavMenuItem> list, boolean z) {
        this.e = list;
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.setH5MenuList(list, z);
        }
    }

    public void setH5ShowOptionMenuFlag() {
        this.c = true;
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.setH5ShowOptionMenuFlag();
        }
    }

    public void setH5OptionMenuTextFlag() {
        this.d = true;
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            iH5TinyPopMenu.setH5OptionMenuTextFlag();
        }
    }

    public boolean containsFavoriteMenuItem() {
        IH5TinyPopMenu iH5TinyPopMenu = this.f10588a;
        if (iH5TinyPopMenu != null) {
            return iH5TinyPopMenu.containsFavoriteMenuItem();
        }
        return false;
    }

    private void a(ViewGroup viewGroup) {
        try {
            if (this.b == TitleBarTheme.TITLE_BAR_THEME_WHITE) {
                if (this.f10588a != null) {
                    this.f10588a.onSwitchToWhiteTheme();
                }
            } else if (this.b == TitleBarTheme.TITLE_BAR_THEME_BLUE && this.f10588a != null) {
                this.f10588a.onSwitchToBlueTheme();
            }
            if (!(this.e == null || this.f10588a == null)) {
                this.f10588a.setH5MenuList(this.e, false);
            }
            if (this.c && this.f10588a != null) {
                this.f10588a.setH5ShowOptionMenuFlag();
            }
            if (this.d && this.f10588a != null) {
                this.f10588a.setH5OptionMenuTextFlag();
            }
        } catch (Throwable th) {
            RVLogger.e("H5TinyPopMenu", th);
        }
    }
}
