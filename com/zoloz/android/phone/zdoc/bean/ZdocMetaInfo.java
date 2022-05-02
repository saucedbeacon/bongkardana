package com.zoloz.android.phone.zdoc.bean;

import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.config.BisSdkModuleEnum;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.zoloz.android.phone.zdoc.activities.FalconCardNativeActivityNew;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;

public class ZdocMetaInfo extends BioMetaInfo implements INotProguard {
    public ZdocMetaInfo() {
        BioAppDescription bioAppDescription = new BioAppDescription();
        bioAppDescription.setBioType(110);
        bioAppDescription.setBioAction(0);
        bioAppDescription.setAppName(FalconCardNativeActivityNew.class.getName());
        bioAppDescription.setAppInterfaceName(FalconCardNativeActivityNew.class.getName());
        addApplication(bioAppDescription);
        BioServiceDescription bioServiceDescription = new BioServiceDescription();
        bioServiceDescription.setClazz(ZdocRecordService.class);
        bioServiceDescription.setInterfaceName(ZdocRecordService.class.getName());
        addExtService(bioServiceDescription);
        addProductID(Long.valueOf(BisSdkModuleEnum.SME_UDOC.getProductID()));
    }
}
