package id.dana.danah5.bioutility;

import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/danah5/bioutility/BioUtilityErrorCode;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface BioUtilityErrorCode {
    @NotNull
    public static final getMax Companion = getMax.$$INSTANCE;
    @NotNull
    public static final String FACE_AUTH_CANCEL = "003";
    @NotNull
    public static final String FACE_AUTH_FAIL = "002";
    @NotNull
    public static final String FACE_AUTH_INVALID_PARAMS = "005";
    @NotNull
    public static final String FACE_AUTH_TIMEOUT = "004";
    @NotNull
    public static final String GENERAL_ERROR = "001";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/danah5/bioutility/BioUtilityErrorCode$Companion;", "", "()V", "FACE_AUTH_CANCEL", "", "FACE_AUTH_FAIL", "FACE_AUTH_INVALID_PARAMS", "FACE_AUTH_TIMEOUT", "GENERAL_ERROR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        static final /* synthetic */ getMax $$INSTANCE = new getMax();
        @NotNull
        public static final String FACE_AUTH_CANCEL = "003";
        @NotNull
        public static final String FACE_AUTH_FAIL = "002";
        @NotNull
        public static final String FACE_AUTH_INVALID_PARAMS = "005";
        @NotNull
        public static final String FACE_AUTH_TIMEOUT = "004";
        @NotNull
        public static final String GENERAL_ERROR = "001";

        private getMax() {
        }
    }
}
