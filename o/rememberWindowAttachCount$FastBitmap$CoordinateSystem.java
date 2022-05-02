package o;

import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.tracker.TrackerKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.convertDipToPx;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
final class rememberWindowAttachCount$FastBitmap$CoordinateSystem extends Lambda implements Function1<convertDipToPx.length, Unit> {
    final /* synthetic */ String $active;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    rememberWindowAttachCount$FastBitmap$CoordinateSystem(String str) {
        super(1);
        this.$active = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((convertDipToPx.length) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull convertDipToPx.length length) {
        Intrinsics.checkNotNullParameter(length, "$receiver");
        length.getMax = TrackerKey.Event.FRIENDSHIP_SET_MUTE;
        if (Intrinsics.areEqual((Object) this.$active, (Object) "ACTIVE")) {
            length.setMax(TrackerKey.Property.IS_MUTED, "false");
        } else {
            length.setMax(TrackerKey.Property.IS_MUTED, SummaryActivity.CHECKED);
        }
    }
}
