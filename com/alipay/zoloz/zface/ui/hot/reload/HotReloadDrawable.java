package com.alipay.zoloz.zface.ui.hot.reload;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.ap.zoloz.hot.reload.ViewLoadService;
import zoloz.ap.com.toolkit.R2;

public class HotReloadDrawable {
    public static Drawable zface_titlebar_bg() {
        GradientDrawable gradientDrawable = getGradientDrawable();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(R2.color.titlebar_split_line_color());
        shapeDrawable.setPadding(0, 0, 0, 1);
        return new LayerDrawable(new Drawable[]{shapeDrawable, gradientDrawable});
    }

    public static Drawable zface_titlebar_bg_without_line() {
        return getGradientDrawable();
    }

    private static GradientDrawable getGradientDrawable() {
        ViewLoadService viewLoadService = (ViewLoadService) BioServiceManager.getCurrentInstance().getBioService(ViewLoadService.class);
        int titlebar_start_color = R2.color.titlebar_start_color();
        int titlebar_end_color = R2.color.titlebar_end_color();
        if (viewLoadService != null && viewLoadService.configContainKey("color", "titlebar_color")) {
            titlebar_start_color = R2.color.titlebar_color();
            titlebar_end_color = titlebar_start_color;
        }
        if (viewLoadService != null && viewLoadService.configContainKey("color", "titlebar_start_color")) {
            titlebar_start_color = R2.color.titlebar_start_color();
        }
        if (viewLoadService != null && viewLoadService.configContainKey("color", "titlebar_end_color")) {
            titlebar_end_color = R2.color.titlebar_end_color();
        }
        return new GradientDrawable(getOrientation(), new int[]{titlebar_start_color, titlebar_end_color});
    }

    private static GradientDrawable.Orientation getOrientation() {
        int titlebar_bg_angle = 90 - R2.integer.titlebar_bg_angle();
        while (titlebar_bg_angle < 0) {
            titlebar_bg_angle += AUScreenAdaptTool.WIDTH_BASE;
        }
        int i = titlebar_bg_angle % AUScreenAdaptTool.WIDTH_BASE;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        if (i == 0) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if (i == 45) {
            return GradientDrawable.Orientation.BL_TR;
        }
        if (i == 90) {
            return GradientDrawable.Orientation.BOTTOM_TOP;
        }
        if (i == 135) {
            return GradientDrawable.Orientation.BR_TL;
        }
        if (i == 180) {
            return GradientDrawable.Orientation.RIGHT_LEFT;
        }
        if (i == 225) {
            return GradientDrawable.Orientation.TR_BL;
        }
        if (i == 270) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (i != 315) {
            return orientation;
        }
        return GradientDrawable.Orientation.TL_BR;
    }
}
