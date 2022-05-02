package com.iap.ac.android.mpm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.constants.ACConstants;

public class DecodeParameter {
    @Nullable
    public String acDecodeConfigFromServer;
    @NonNull
    public String codeValue;
    @Nullable
    public String merchantType;
    @NonNull
    public String scene = ACConstants.Scene.SOURCE_FROM_SCAN;
    @Nullable
    public String sourceAppPackageName;

    public String toString() {
        return String.format("DecodeParameter[code=%s,merchantType=%s,scene=%s,pkg=%s,config=%s]", new Object[]{this.codeValue, this.merchantType, this.scene, this.sourceAppPackageName, this.acDecodeConfigFromServer});
    }
}
