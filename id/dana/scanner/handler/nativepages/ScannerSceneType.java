package id.dana.scanner.handler.nativepages;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ScannerSceneType {
    public static final String SCENE_QRIS_TOP_UP_KYB = "QR_SCANNER_KYB";
    public static final String SCENE_SPLIT_BILL = "SPLIT_BILL_ADD_PARTICIPANT";
}
