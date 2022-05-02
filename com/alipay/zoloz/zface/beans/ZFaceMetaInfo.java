package com.alipay.zoloz.zface.beans;

import android.content.Context;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.config.BisSdkModuleEnum;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.zoloz.toyger.ToygerMetaInfo;
import com.alipay.zoloz.zface.services.ToygerIspService;
import com.alipay.zoloz.zface.services.ZFaceRecordService;
import java.util.List;
import java.util.Map;

public class ZFaceMetaInfo extends BioMetaInfo implements INotProguard {
    public List<Long> getProductIDs(Context context) {
        return null;
    }

    public String getRevision(Context context) {
        return "";
    }

    public List<Integer> getRuntimeInfoIDs(Context context, Map<String, Object> map) {
        return null;
    }

    public ZFaceMetaInfo() {
        BioServiceDescription bioServiceDescription = new BioServiceDescription();
        bioServiceDescription.setClazz(ZFaceRecordService.class);
        bioServiceDescription.setInterfaceName(ZFaceRecordService.class.getName());
        addExtService(bioServiceDescription);
        BioServiceDescription bioServiceDescription2 = new BioServiceDescription();
        bioServiceDescription2.setClazz(ToygerIspService.class);
        bioServiceDescription2.setInterfaceName(ToygerIspService.class.getName());
        addExtService(bioServiceDescription2);
        addProductID(Long.valueOf(BisSdkModuleEnum.SME_PANO.getProductID()));
        addProductID(Long.valueOf(BisSdkModuleEnum.SME_ZFACE_CHERRY.getProductID()));
        if (ToygerMetaInfo.isGemini()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_GEMINI.getProductID()));
        }
        if (ToygerMetaInfo.isDragonfly()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_DRAGONFLY.getProductID()));
        }
        if (ToygerMetaInfo.isBat()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_3D.getProductID()));
        }
        if (ToygerMetaInfo.isBlink()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_ZFACE_BLINK.getProductID()));
        }
    }
}
