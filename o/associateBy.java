package o;

import android.os.SystemClock;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\rX\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/base/ThrottledOnClickListener;", "Landroid/view/View$OnClickListener;", "interval", "", "onClick", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "(JLkotlin/jvm/functions/Function1;)V", "lastClickMap", "", "clickedView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class associateBy implements View.OnClickListener {
    private final Map<View, Long> length;
    private final Function1<View, Unit> setMax;
    private final long setMin;

    private associateBy(@NotNull Function1<? super View, Unit> function1, byte b) {
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.setMin = 1000;
        this.setMax = function1;
        this.length = new WeakHashMap();
    }

    public /* synthetic */ associateBy(Function1 function1) {
        this(function1, (byte) 0);
    }

    public final void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "clickedView");
        Long l = this.length.get(view);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.length.put(view, Long.valueOf(uptimeMillis));
        if (l == null || uptimeMillis - l.longValue() > this.setMin) {
            this.setMax.invoke(view);
        }
    }
}
