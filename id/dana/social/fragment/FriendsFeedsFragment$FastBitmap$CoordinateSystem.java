package id.dana.social.fragment;

import androidx.lifecycle.LiveData;
import androidx.work.WorkInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.onMeasure;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "observer", "Landroidx/lifecycle/Observer;", "", "Landroidx/work/WorkInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
final class FriendsFeedsFragment$FastBitmap$CoordinateSystem extends Lambda implements Function1<onMeasure<List<? extends WorkInfo>>, Unit> {
    final /* synthetic */ LiveData $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FriendsFeedsFragment$FastBitmap$CoordinateSystem(LiveData liveData) {
        super(1);
        this.$this_with = liveData;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((onMeasure<List<WorkInfo>>) (onMeasure) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull onMeasure<List<WorkInfo>> onmeasure) {
        Intrinsics.checkNotNullParameter(onmeasure, "observer");
        this.$this_with.length(onmeasure);
    }
}
