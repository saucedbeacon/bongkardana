package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ariver.app.activity.ActivityHelper;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.griver.api.appinfo.AppType;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.ui.widget.MovableFrameLayout;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.R;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import java.io.File;

public class b {
    public static void a(Activity activity, ActivityHelper activityHelper) {
        if (activity != null && activityHelper != null) {
            MovableFrameLayout movableFrameLayout = (MovableFrameLayout) activity.findViewById(R.id.rl_diagnostic_tool);
            if ("YES".equalsIgnoreCase(GriverInnerConfig.getConfig(GriverConfigConstants.KEY_DIAG_DEV_TOOL_DISABLED))) {
                movableFrameLayout.setVisibility(8);
                return;
            }
            String config = GriverInnerConfig.getConfig(GriverConfigConstants.KEY_DIAG_DEV_TOOL_URL);
            if (TextUtils.isEmpty(config)) {
                movableFrameLayout.setVisibility(8);
            } else if (activityHelper.getStartClientBundle() == null || activityHelper.getStartClientBundle().startParams == null || activityHelper.getStartClientBundle().sceneParams == null) {
                movableFrameLayout.setVisibility(8);
            } else {
                Bundle bundle = activityHelper.getStartClientBundle().startParams;
                Bundle bundle2 = activityHelper.getStartClientBundle().sceneParams;
                boolean equals = TextUtils.equals(GriverEnv.getAlwaysShowDiagnosticTool(), "YES");
                if (TextUtils.equals(BundleUtils.getString(bundle2, "appType"), AppType.WEB_H5.name())) {
                    movableFrameLayout.setVisibility(8);
                } else if (equals || AppInfoScene.isDevSource(bundle)) {
                    a(activity, config);
                    movableFrameLayout.setVisibility(0);
                } else {
                    movableFrameLayout.setVisibility(8);
                }
            }
        }
    }

    public static void a(Activity activity, final String str) {
        TextView textView = (TextView) activity.findViewById(R.id.tv_diagnostic_tool);
        StringBuilder sb = new StringBuilder("h5iconfont");
        sb.append(File.separator);
        sb.append("titlebar.ttf");
        textView.setTypeface(TypefaceCache.getTypeface(activity, "h5iconfont", sb.toString()));
        final Bundle bundle = new Bundle();
        bundle.putInt("titleColor", FlexItem.MAX_SIZE);
        bundle.putInt("backButtonColor", FlexItem.MAX_SIZE);
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                Griver.openUrl(GriverEnv.getApplicationContext(), str, bundle);
            }
        });
    }
}
