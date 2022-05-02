package com.alibaba.griver.image.photo.listener;

import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alibaba.griver.image.photo.meta.PhotoMenu;
import com.alibaba.griver.image.photo.widget.PhotoPreview;

public interface PhotoPagerListener {

    public interface V2 extends PhotoPagerListener {
        boolean onMenuClicked(PhotoMenu photoMenu);
    }

    public interface V3 extends V2 {
        void onPageSelected(int i, PhotoInfo photoInfo);
    }

    public interface V4 extends V3 {
        boolean onMenuClicked(PhotoMenu photoMenu, PhotoInfo photoInfo, PhotoPreview photoPreview);
    }

    void onPageClicked();

    boolean onPageLongClicked(String str, int i);

    void onPageScrolledAcross(int i, int i2, String str, String str2);

    void onPageSelected(int i, int i2, String str);
}
