package com.alibaba.griver.image.photo.utils;

import android.widget.ImageView;
import com.alibaba.griver.image.R;
import java.util.List;

public class CommonUtils {
    public static void setTitleBarBackDrawable(ImageView imageView) {
        if (imageView != null) {
            imageView.setImageDrawable(IconUtils.getTitleIcon_White(imageView.getContext(), R.string.griver_image_iconfont_back));
        }
    }

    public static boolean isIndexValidInList(List list, int i) {
        if (i < 0 || list == null || list.isEmpty() || list.size() <= i) {
            return false;
        }
        return true;
    }
}
