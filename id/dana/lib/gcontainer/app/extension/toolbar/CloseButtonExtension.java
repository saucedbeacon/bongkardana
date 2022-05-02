package id.dana.lib.gcontainer.app.extension.toolbar;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.alibaba.griver.api.ui.titlebar.GriverCloseButtonStyleExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.WindowBridgeExtension;
import o.cancelAll;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"Lid/dana/lib/gcontainer/app/extension/toolbar/CloseButtonExtension;", "Lcom/alibaba/griver/api/ui/titlebar/GriverCloseButtonStyleExtension;", "()V", "getContent", "", "getIconDrawable", "Landroid/graphics/drawable/Drawable;", "getType", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class CloseButtonExtension implements GriverCloseButtonStyleExtension {
    @Nullable
    public final String getContent() {
        return WindowBridgeExtension.AnonymousClass1.setMax().getMax.getMax;
    }

    @Nullable
    public final String getType() {
        if (WindowBridgeExtension.AnonymousClass1.setMax().getMax.length != 0) {
            return "icon";
        }
        CharSequence charSequence = WindowBridgeExtension.AnonymousClass1.setMax().getMax.getMax;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return "text";
        }
        return null;
    }

    @Nullable
    public final Drawable getIconDrawable() {
        Drawable mutate;
        if (!Intrinsics.areEqual((Object) getType(), (Object) "icon")) {
            return null;
        }
        Drawable min = cancelAll.getMin(WindowBridgeExtension.AnonymousClass1.getMax(), WindowBridgeExtension.AnonymousClass1.setMax().getMax.length);
        if (WindowBridgeExtension.AnonymousClass1.setMax().getMax.setMax != 0) {
            int max = IntRange.setMax(WindowBridgeExtension.AnonymousClass1.getMax(), WindowBridgeExtension.AnonymousClass1.setMax().getMax.setMax);
            if (!(min == null || (mutate = min.mutate()) == null)) {
                mutate.setColorFilter(max, PorterDuff.Mode.SRC_IN);
            }
        }
        return min;
    }
}
