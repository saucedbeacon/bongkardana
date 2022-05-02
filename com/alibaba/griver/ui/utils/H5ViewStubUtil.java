package com.alibaba.griver.ui.utils;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.IdRes;

public class H5ViewStubUtil {
    public static <T> T getView(View view, @IdRes int i, @IdRes int i2) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            return viewStub.inflate();
        }
        return view.findViewById(i2);
    }

    public static void setViewVisibility(View view, @IdRes int i, @IdRes int i2, int i3) {
        if (view != null) {
            if (view.findViewById(i) == null) {
                View findViewById = view.findViewById(i2);
                if (findViewById != null) {
                    findViewById.setVisibility(i3);
                }
            } else if (i3 == 0) {
                ((ViewStub) view.findViewById(i)).inflate().setVisibility(i3);
            }
        }
    }
}
