package com.alibaba.griver.api.ui.titlebar;

import android.graphics.drawable.Drawable;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverButtonStyleExtension extends GriverExtension {
    String getContent();

    Drawable getIconDrawable();

    String getType();
}
