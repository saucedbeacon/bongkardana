package id.dana.auth.face;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/auth/face/FaceAuthenticationKybException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FaceAuthenticationKybException extends Exception {
    @NotNull
    private final String errorMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationKybException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "errorMessage");
        this.errorMessage = str;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
