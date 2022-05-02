package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TinyMenuPopupWindow;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/tracker/branch/BranchTracker;", "", "()V", "execute", "", "event", "Lid/dana/tracker/branch/BranchEventStrategy;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setHeight {
    @NotNull
    public static final setHeight setMax = new setHeight();

    private setHeight() {
    }

    public static void setMax(@NotNull AUBubbleDrawable aUBubbleDrawable) {
        Intrinsics.checkNotNullParameter(aUBubbleDrawable, "event");
        TinyMenuPopupWindow.TinyAppImageLoader tinyAppImageLoader = new TinyMenuPopupWindow.TinyAppImageLoader(aUBubbleDrawable.length);
        Map<String, Object> map = aUBubbleDrawable.getMin;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                tinyAppImageLoader.getMax((String) next.getKey(), String.valueOf(next.getValue()));
            }
        }
        tinyAppImageLoader.getMin(aUBubbleDrawable.getMax);
    }
}
