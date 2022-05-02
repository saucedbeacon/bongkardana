package id.dana.danah5.ocrreceipt;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/danah5/ocrreceipt/OCRReceiptException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message", "", "event", "(Ljava/lang/String;Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRReceiptException extends IllegalStateException {
    @NotNull
    private final String event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OCRReceiptException(@NotNull String str, @NotNull String str2) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "event");
        this.event = str2;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }
}
