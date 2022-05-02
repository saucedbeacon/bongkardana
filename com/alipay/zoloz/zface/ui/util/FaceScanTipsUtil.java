package com.alipay.zoloz.zface.ui.util;

import android.content.res.Resources;
import android.text.TextUtils;
import com.alipay.mobile.security.bio.config.bean.FaceTips;
import com.alipay.zoloz.toyger.R2;
import com.alipay.zoloz.zface.beans.FaceRemoteConfig;
import o.PlaybackStateCompat;

public class FaceScanTipsUtil {
    private PlaybackStateCompat<Integer, String> mRemindText;

    public FaceScanTipsUtil(Resources resources) {
        this.mRemindText = new PlaybackStateCompat<>();
        initLocalTips(resources);
    }

    public FaceScanTipsUtil(Resources resources, FaceRemoteConfig faceRemoteConfig) {
        this(resources);
        updateRemoteTips(faceRemoteConfig);
    }

    public void updateRemoteTips(FaceRemoteConfig faceRemoteConfig) {
        FaceTips faceTips;
        if (faceRemoteConfig != null && (faceTips = faceRemoteConfig.getFaceTips()) != null) {
            updateTips(1, faceTips.topText_noface);
            updateTips(2, faceTips.topText_rectwidth);
            updateTips(3, faceTips.topText_max_rectwidth);
            updateTips(4, faceTips.topText_integrity);
            updateTips(5, faceTips.topText_pitch);
            updateTips(6, faceTips.topText_yaw);
            updateTips(7, faceTips.topText_stay);
            updateTips(8, faceTips.topText_light);
            updateTips(9, faceTips.topText_quality);
            updateTips(10, faceTips.topText_openness);
            updateTips(11, faceTips.topText_blink);
        }
    }

    private void updateTips(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mRemindText.put(Integer.valueOf(i), str);
        }
    }

    private void initLocalTips(Resources resources) {
        if (resources != null) {
            this.mRemindText.put(1, R2.string.zface_no_face());
            this.mRemindText.put(2, R2.string.zface_distance_too_far());
            this.mRemindText.put(3, R2.string.zface_distance_too_close());
            this.mRemindText.put(4, R2.string.zface_not_in_center());
            this.mRemindText.put(5, R2.string.zface_bad_pitch());
            this.mRemindText.put(6, R2.string.zface_bad_yaw());
            this.mRemindText.put(7, R2.string.zface_is_moving());
            this.mRemindText.put(8, R2.string.zface_bad_brightness());
            this.mRemindText.put(9, R2.string.zface_bad_quality());
            this.mRemindText.put(10, R2.string.zface_bad_eye_openness());
            this.mRemindText.put(11, R2.string.zface_blink_openness());
            this.mRemindText.put(12, R2.string.zface_stack_time());
            this.mRemindText.put(13, R2.string.zface_head_up());
            this.mRemindText.put(14, R2.string.zface_head_up_right());
            this.mRemindText.put(15, R2.string.zface_head_right());
            this.mRemindText.put(16, R2.string.zface_head_right_down());
            this.mRemindText.put(17, R2.string.zface_head_down());
            this.mRemindText.put(18, R2.string.zface_head_down_left());
            this.mRemindText.put(19, R2.string.zface_head_left());
            this.mRemindText.put(20, R2.string.zface_head_left_up());
            this.mRemindText.put(21, R2.string.zface_mouth_open());
        }
    }

    public String getReimindTxt(int i) {
        return this.mRemindText.get(Integer.valueOf(i));
    }
}
