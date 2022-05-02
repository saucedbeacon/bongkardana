package com.alibaba.griver.image.framework.utils;

import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.image.framework.encode.APEncodeResult;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.mode.APCenterCropMode;
import com.alibaba.griver.image.framework.mode.APMaxLenMode;
import com.alibaba.griver.image.framework.mode.APMinLenMode;
import com.alibaba.griver.image.framework.mode.APSpecificCropMode;
import com.alibaba.griver.image.framework.mode.CenterCropMode;
import com.alibaba.griver.image.framework.mode.NoneScaleMode;
import com.alibaba.griver.image.framework.mode.SpecificCropMode;

public class AlipayImageParamConverter {
    public static APEncodeOptions from(APEncodeOptions aPEncodeOptions) {
        APEncodeOptions aPEncodeOptions2 = new APEncodeOptions();
        aPEncodeOptions2.quality = aPEncodeOptions.quality;
        aPEncodeOptions2.requireOutputInfo = aPEncodeOptions.requireOutputInfo;
        aPEncodeOptions2.outFormat = aPEncodeOptions.outFormat;
        aPEncodeOptions2.outputFile = aPEncodeOptions.outputFile;
        aPEncodeOptions2.autoRotate = aPEncodeOptions.autoRotate;
        aPEncodeOptions2.forceRotate = aPEncodeOptions.forceRotate;
        int i = aPEncodeOptions.mode.type;
        if (i == 0) {
            aPEncodeOptions2.mode = new APMaxLenMode(((APMaxLenMode) aPEncodeOptions.mode).len);
        } else if (i == 1) {
            aPEncodeOptions2.mode = new APMinLenMode(((APMinLenMode) aPEncodeOptions.mode).len);
        } else if (i == 2) {
            APCenterCropMode aPCenterCropMode = (APCenterCropMode) aPEncodeOptions.mode;
            aPEncodeOptions2.mode = new CenterCropMode(aPCenterCropMode.width, aPCenterCropMode.height);
        } else if (i == 3) {
            APSpecificCropMode aPSpecificCropMode = (APSpecificCropMode) aPEncodeOptions.mode;
            aPEncodeOptions2.mode = new SpecificCropMode(aPSpecificCropMode.x, aPSpecificCropMode.y, aPSpecificCropMode.width, aPSpecificCropMode.height);
        } else if (i == 4) {
            aPEncodeOptions2.mode = new NoneScaleMode();
        }
        return aPEncodeOptions2;
    }

    public static APEncodeResult from(APEncodeResult aPEncodeResult) {
        APEncodeResult aPEncodeResult2 = new APEncodeResult();
        aPEncodeResult2.code = aPEncodeResult.code;
        aPEncodeResult2.encodeData = aPEncodeResult.encodeData;
        aPEncodeResult2.extra = aPEncodeResult.extra;
        aPEncodeResult2.encodeFilePath = aPEncodeResult.encodeFilePath;
        if (aPEncodeResult.imageInfo != null) {
            aPEncodeResult2.imageInfo = new APImageInfo(aPEncodeResult.imageInfo.width, aPEncodeResult.imageInfo.height, aPEncodeResult.imageInfo.orientation);
        }
        return aPEncodeResult2;
    }

    public static APImageInfo from(APImageInfo aPImageInfo) {
        if (aPImageInfo != null) {
            return new APImageInfo(aPImageInfo.width, aPImageInfo.height, aPImageInfo.orientation);
        }
        return null;
    }
}
