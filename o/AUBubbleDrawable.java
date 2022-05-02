package o;

import android.content.Context;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lid/dana/tracker/branch/BranchEventStrategy;", "Lid/dana/tracker/EventStrategy;", "context", "Landroid/content/Context;", "eventName", "", "properties", "", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V", "getContext", "()Landroid/content/Context;", "getEventName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "execute", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUBubbleDrawable implements convertSpToPx {
    @NotNull
    final Context getMax;
    @NotNull
    final Map<String, Object> getMin;
    @NotNull
    final String length;

    public AUBubbleDrawable(@NotNull Context context, @NotNull String str, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(map, "properties");
        this.getMax = context;
        this.length = str;
        this.getMin = map;
    }

    public final void length() {
        setHeight setheight = setHeight.setMax;
        setHeight.setMax(this);
    }
}
