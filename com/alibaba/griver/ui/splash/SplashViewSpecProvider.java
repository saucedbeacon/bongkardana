package com.alibaba.griver.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class SplashViewSpecProvider extends DefaultViewSpecProvider {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9206a = false;
    private static int b;
    private Activity c;

    public SplashViewSpecProvider(Activity activity) {
        super(activity);
        this.c = activity;
    }

    private static void a(Context context) {
        if (!f9206a) {
            int screenWidth = DimensionUtil.getScreenWidth(context);
            int screenHeight = DimensionUtil.getScreenHeight(context);
            if (screenWidth < screenHeight) {
                b = screenWidth;
            } else {
                b = screenHeight;
            }
            f9206a = true;
        }
    }

    public int getWidthSpec() {
        a(this.c);
        StringBuilder sb = new StringBuilder("fragmentOptEnabled getWidthSpec: ");
        sb.append(b);
        RVLogger.debug("SplashViewSpecProvider", sb.toString());
        return View.MeasureSpec.makeMeasureSpec(b, 1073741824);
    }

    public int getHeightSpec() {
        RVLogger.debug("SplashViewSpecProvider", "fragmentOptEnabled not calculate for getHeightSpec");
        return View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
    }
}
