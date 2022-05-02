package com.alibaba.ariver.app.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

@Keep
public class DefaultViewSpecProvider implements ViewSpecProvider {
    private static boolean ISGET = false;
    private static int SCREEN_WIDTH = 0;
    private static final int TAB_BAR_HEIGHT_DP = 52;
    private static final String TAG = "AriverApp:DefaultViewSpecProvider";
    private static final int TITLE_BAR_HEIGHT_DP = 48;
    private Activity mActivity;

    public DefaultViewSpecProvider(Activity activity) {
        this.mActivity = activity;
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        return this.mActivity;
    }

    private static void initWidthAndHeight(Context context) {
        if (!ISGET) {
            int screenWidth = DimensionUtil.getScreenWidth(context);
            int screenHeight = DimensionUtil.getScreenHeight(context);
            if (screenWidth < screenHeight) {
                SCREEN_WIDTH = screenWidth;
            } else {
                SCREEN_WIDTH = screenHeight;
            }
            ISGET = true;
        }
    }

    public int getWidthSpec() {
        initWidthAndHeight(this.mActivity);
        StringBuilder sb = new StringBuilder("fragmentOptEnabled getWidthSpec: ");
        sb.append(SCREEN_WIDTH);
        RVLogger.debug(TAG, sb.toString());
        return View.MeasureSpec.makeMeasureSpec(SCREEN_WIDTH, 1073741824);
    }

    public int getHeightSpec() {
        RVLogger.debug(TAG, "fragmentOptEnabled not calculate for getHeightSpec");
        return View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
    }

    public int getTitleBarHeightSpec() {
        initWidthAndHeight(this.mActivity);
        int titleBarHeight = getTitleBarHeight();
        RVLogger.debug(TAG, "fragmentOptEnabled getTitleBarHeightSpec: ".concat(String.valueOf(titleBarHeight)));
        return View.MeasureSpec.makeMeasureSpec(titleBarHeight, 1073741824);
    }

    public int getTitleBarRawHeight() {
        return DimensionUtil.dip2px(getActivity(), 48.0f);
    }

    /* access modifiers changed from: protected */
    public int getTitleBarHeight() {
        int titleBarRawHeight = getTitleBarRawHeight();
        return StatusBarUtils.isSupport() ? titleBarRawHeight + StatusBarUtils.getStatusBarHeight(getActivity()) : titleBarRawHeight;
    }

    /* access modifiers changed from: protected */
    public int getTabBarHeight() {
        return DimensionUtil.dip2px(getActivity(), 52.0f);
    }

    public int getPageHeightSpec(boolean z) {
        return View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
    }

    public int getTabBarHeightSpec() {
        initWidthAndHeight(this.mActivity);
        int tabBarHeight = getTabBarHeight();
        RVLogger.debug(TAG, "getTabBarHeightSpec: ".concat(String.valueOf(tabBarHeight)));
        return View.MeasureSpec.makeMeasureSpec(tabBarHeight, 1073741824);
    }
}
