package o;

import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/utils/SafeClickListener;", "Landroid/view/View$OnClickListener;", "defaultInternal", "", "onSafeClick", "Lkotlin/Function1;", "Landroid/view/View;", "", "(ILkotlin/jvm/functions/Function1;)V", "lastTimeClicked", "", "onClick", "v", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class showMenu implements View.OnClickListener {
    private final Function1<View, Unit> length;
    private int setMax;
    private long setMin;

    private showMenu(@NotNull Function1<? super View, Unit> function1, byte b) {
        Intrinsics.checkNotNullParameter(function1, "onSafeClick");
        this.setMax = 1000;
        this.length = function1;
    }

    public /* synthetic */ showMenu(Function1 function1) {
        this(function1, (byte) 0);
    }

    public final void onClick(@Nullable View view) {
        if (SystemClock.elapsedRealtime() - this.setMin >= ((long) this.setMax)) {
            this.setMin = SystemClock.elapsedRealtime();
            if (view != null) {
                this.length.invoke(view);
            }
        }
    }
}
