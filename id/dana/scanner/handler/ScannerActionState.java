package id.dana.scanner.handler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ScannerActionState {
    public static final String ADD_PARTICIPANT = "Add Participant";
    public static final String IDLE = "Idle";
    public static final String INVALID_QR_CODE = "Invalid QR Code";
    public static final String PROCESSING = "Processing";
    public static final String SEND_TO_SELF = "Send to self";
}
