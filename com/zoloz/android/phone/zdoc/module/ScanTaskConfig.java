package com.zoloz.android.phone.zdoc.module;

import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.alipay.zoloz.toyger.doc.ToygerDocConfig;
import java.io.Serializable;

public class ScanTaskConfig extends ToygerDocConfig implements Serializable {
    public static final CharSequence SCAN_ANGLE = "angleimage";
    public static final CharSequence SCAN_DOC = BlobStatic.SUB_TYPE_DOC_IMAGE;
    public static final CharSequence SCAN_FLASH = "flashimage";
    public int alertTime;
    public FaceROI faceROI;
    public int flash;
    public int guideStayTime;
    public String plateType;
    public int rotationAngle;
    public String rotationMode;
    public int showDuration;
    public String subType;
    public boolean useFlash;
}
