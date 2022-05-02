package com.alibaba.ariver.kernel.common.utils;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.StringRes;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;

public class LangResourceUtil {
    public static String getString(Context context, @StringRes int i) {
        if (context != null) {
            return context.getString(i);
        }
        return a(i);
    }

    public static String getString(@StringRes int i) {
        return a(i);
    }

    private static String a(@StringRes int i) {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        Activity activity = rVEnvironmentService.getTopActivity().get();
        if (activity != null) {
            return activity.getString(i);
        }
        return rVEnvironmentService.getApplicationContext().getString(i);
    }
}
