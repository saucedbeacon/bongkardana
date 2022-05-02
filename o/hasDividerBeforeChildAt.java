package o;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0005H&J'\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\u0017\u001a\u00020\u0005H&J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u0019"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "IT", "SL", "", "checkAllItems", "", "checkItems", "indices", "", "disableItems", "getItemCount", "", "isItemChecked", "", "index", "positiveButtonClicked", "replaceItems", "items", "", "listener", "(Ljava/util/List;Ljava/lang/Object;)V", "toggleAllChecked", "toggleItems", "uncheckAllItems", "uncheckItems", "core"}, k = 1, mv = {1, 1, 16})
public interface hasDividerBeforeChildAt<IT, SL> {
    void checkAllItems();

    void checkItems(@NotNull int[] iArr);

    void disableItems(@NotNull int[] iArr);

    int getItemCount();

    boolean isItemChecked(int i);

    void positiveButtonClicked();

    void replaceItems(@NotNull List<? extends IT> list, @Nullable SL sl);

    void toggleAllChecked();

    void toggleItems(@NotNull int[] iArr);

    void uncheckAllItems();

    void uncheckItems(@NotNull int[] iArr);
}
