package com.alipay.zoloz.hardware;

import android.text.TextUtils;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.biometrics.common.annotation.NotProguard;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.zoloz.hardware.isp.IspService;

@NotProguard
public class HardwareMetaInfo extends BioMetaInfo {
    public static final String ASTRA_PRO_ISP_SERVICE = "com.alipay.zoloz.hardware.isp.AstraProIspService";

    public HardwareMetaInfo() {
        if (TextUtils.equals("", BuildConfig.ISP_ASTRA_PRO) || TextUtils.equals("", BuildConfig.ISP_ASTRA_PRO2)) {
            try {
                BioServiceDescription bioServiceDescription = new BioServiceDescription();
                bioServiceDescription.setClazz(Class.forName(ASTRA_PRO_ISP_SERVICE));
                bioServiceDescription.setInterfaceName(IspService.class.getName());
                addExtService(bioServiceDescription);
            } catch (Throwable unused) {
            }
        }
    }
}
