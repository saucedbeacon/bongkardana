package id.dana.ocr.constant;

import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/ocr/constant/ErrorUploadReceipt;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface ErrorUploadReceipt {
    @NotNull
    public static final Companion Companion = Companion.getMax;
    @NotNull
    public static final String DATA_NOT_FOUND = "012";
    @NotNull
    public static final String FAILED_UPLOAD_IMAGE = "011";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/ocr/constant/ErrorUploadReceipt$Companion;", "", "()V", "DATA_NOT_FOUND", "", "FAILED_UPLOAD_IMAGE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        static final /* synthetic */ Companion getMax = new Companion();

        private Companion() {
        }
    }
}
