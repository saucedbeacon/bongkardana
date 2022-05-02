package id.dana.ocr.receipt;

import android.graphics.Bitmap;
import id.dana.ocr.receipt.model.ReceiptInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lid/dana/ocr/receipt/ReceiptOcr;", "", "applyRule", "jsonStrRule", "", "parse", "", "receiptBmp", "Landroid/graphics/Bitmap;", "merchantAliases", "", "callback", "Lid/dana/ocr/receipt/ReceiptOcr$Callback;", "Callback", "library_release"}, k = 1, mv = {1, 1, 16})
public interface ReceiptOcr {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lid/dana/ocr/receipt/ReceiptOcr$Callback;", "", "onFailure", "", "cause", "", "onSuccess", "receiptInfo", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "library_release"}, k = 1, mv = {1, 1, 16})
    public interface Callback {
        void onFailure(@NotNull Throwable th);

        void onSuccess(@NotNull ReceiptInfo receiptInfo);
    }

    void length(@NotNull Bitmap bitmap, @NotNull List<String> list, @NotNull Callback callback);

    @NotNull
    ReceiptOcr setMax(@NotNull String str);
}
