package id.dana.ocr.constant;

import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/ocr/constant/ErrorOcr;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface ErrorOcr {
    @NotNull
    public static final String BASE64_ENCODING_FAILED = "009";
    @NotNull
    public static final String CAMERA_RESULT_NULL = "010";
    @NotNull
    public static final String CANNOT_RECOGNIZE_RECEIPT = "006";
    @NotNull
    public static final Companion Companion = Companion.setMin;
    @NotNull
    public static final String DATA_NOT_ENOUGH = "004";
    @NotNull
    public static final String DONT_HAVE_CAMERA_PERMISSION = "005";
    @NotNull
    public static final String FILE_NOT_FOUND = "013";
    @NotNull
    public static final String GENERAL_ERROR = "001";
    @NotNull
    public static final String PARAM_NOT_ENOUGH = "007";
    @NotNull
    public static final String STORAGE_FULL = "003";
    @NotNull
    public static final String USER_CANCELLED = "002";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/ocr/constant/ErrorOcr$Companion;", "", "()V", "BASE64_ENCODING_FAILED", "", "CAMERA_RESULT_NULL", "CANNOT_RECOGNIZE_RECEIPT", "DATA_NOT_ENOUGH", "DONT_HAVE_CAMERA_PERMISSION", "FILE_NOT_FOUND", "GENERAL_ERROR", "PARAM_NOT_ENOUGH", "STORAGE_FULL", "USER_CANCELLED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        static final /* synthetic */ Companion setMin = new Companion();

        private Companion() {
        }
    }
}
