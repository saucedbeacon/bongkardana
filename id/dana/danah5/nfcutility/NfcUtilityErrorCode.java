package id.dana.danah5.nfcutility;

import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/danah5/nfcutility/NfcUtilityErrorCode;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface NfcUtilityErrorCode {
    @NotNull
    public static final String CARD_NOT_SUPPORTED_NFC = "004";
    @NotNull
    public static final String CARD_READ_ERROR = "005";
    @NotNull
    public static final String CARD_WRITE_ERROR = "006";
    @NotNull
    public static final setMin Companion = setMin.$$INSTANCE;
    @NotNull
    public static final String DEVICE_NOT_SUPPORTED = "002";
    @NotNull
    public static final String GENERAL_ERROR = "001";
    @NotNull
    public static final String NFC_FEATURE_DISABLED = "003";
    @NotNull
    public static final String TIMEOUT_NFC = "007";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/danah5/nfcutility/NfcUtilityErrorCode$Companion;", "", "()V", "CARD_NOT_SUPPORTED_NFC", "", "CARD_READ_ERROR", "CARD_WRITE_ERROR", "DEVICE_NOT_SUPPORTED", "GENERAL_ERROR", "NFC_FEATURE_DISABLED", "TIMEOUT_NFC", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        static final /* synthetic */ setMin $$INSTANCE = new setMin();
        @NotNull
        public static final String CARD_NOT_SUPPORTED_NFC = "004";
        @NotNull
        public static final String CARD_READ_ERROR = "005";
        @NotNull
        public static final String CARD_WRITE_ERROR = "006";
        @NotNull
        public static final String DEVICE_NOT_SUPPORTED = "002";
        @NotNull
        public static final String GENERAL_ERROR = "001";
        @NotNull
        public static final String NFC_FEATURE_DISABLED = "003";
        @NotNull
        public static final String TIMEOUT_NFC = "007";

        private setMin() {
        }
    }
}
