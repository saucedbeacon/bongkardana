package com.alibaba.griver.image.photo.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.StateListDrawable;
import androidx.annotation.ColorInt;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.image.R;
import com.alibaba.griver.ui.ant.basic.AUIconDrawable;
import com.alibaba.griver.ui.ant.model.IconPaintBuilder;
import com.alibaba.griver.ui.ant.utils.StateListUtils;

public class IconUtils {
    public static StateListDrawable getTitleIcon_White(Context context, int i) {
        return getTitleIcon(context, i, context.getResources().getColor(R.color.griver_image_AU_COLOR_UNIVERSAL_BG));
    }

    public static StateListDrawable getTitleIcon(Context context, int i, int i2) {
        return getIconListDrawable(context, DensityUtil.dip2px(context, 22.0f), StateListUtils.getColorStateList(i2, 1728053247 & i2, 0), i);
    }

    public static StateListDrawable getIconListDrawable(Context context, int i, ColorStateList colorStateList, int i2) {
        if (colorStateList == null) {
            return null;
        }
        int defaultColor = colorStateList.getDefaultColor();
        int colorForState = colorStateList.getColorForState(new int[]{16842919}, 0);
        int colorForState2 = colorStateList.getColorForState(new int[]{16842913}, 0);
        return getIconListDrawable(context, i, defaultColor, colorForState, colorStateList.getColorForState(new int[]{-16842910}, 0), colorForState2, i2);
    }

    public static StateListDrawable getIconListDrawable(Context context, int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @ColorInt int i5, int i6) {
        AUIconDrawable aUIconDrawable = null;
        if (i2 == 0) {
            return null;
        }
        if (i == 0) {
            i = DensityUtil.dip2px(context, 20.0f);
        }
        AUIconDrawable aUIconDrawable2 = new AUIconDrawable(context, new IconPaintBuilder(i2, i, i6));
        AUIconDrawable aUIconDrawable3 = i3 != 0 ? new AUIconDrawable(context, new IconPaintBuilder(i3, i, i6)) : null;
        AUIconDrawable aUIconDrawable4 = i4 != 0 ? new AUIconDrawable(context, new IconPaintBuilder(i4, i, i6)) : null;
        if (i5 != 0) {
            aUIconDrawable = new AUIconDrawable(context, new IconPaintBuilder(i5, i, i6));
        }
        return StateListUtils.getStateListDrawable(aUIconDrawable2, aUIconDrawable3, aUIconDrawable4, aUIconDrawable);
    }
}
