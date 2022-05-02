package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnimRetriever;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "animateBar", "Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder;", "animateIcon", "Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class ensureMenuView {
    public final Context setMin;

    public ensureMenuView(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.setMin = context;
    }
}
