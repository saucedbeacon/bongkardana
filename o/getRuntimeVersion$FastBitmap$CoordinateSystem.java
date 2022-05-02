package o;

import com.twilio.verify.TwilioVerifyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
final class getRuntimeVersion$FastBitmap$CoordinateSystem<T> implements updateProgress<String> {
    final /* synthetic */ getRuntimeVersion getMin;

    getRuntimeVersion$FastBitmap$CoordinateSystem(getRuntimeVersion getruntimeversion) {
        this.getMin = getruntimeversion;
    }

    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<String> r4) {
        Intrinsics.checkNotNullParameter(r4, "emitter");
        RecyclerView$Adapter$StateRestorationPolicy max = this.getMin.setMin;
        if (max != null) {
            max.length(new Function1<List<? extends getHeight>, Unit>() {
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends getHeight>) (List) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<? extends getHeight> list) {
                    Intrinsics.checkNotNullParameter(list, "it");
                    if (!list.isEmpty()) {
                        r4.onSuccess(((getHeight) list.get(0)).getMin());
                    } else {
                        r4.onSuccess("");
                    }
                }
            }, new Function1<TwilioVerifyException, Unit>() {
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TwilioVerifyException) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                    Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                    r4.onSuccess("");
                }
            });
        } else {
            r4.onSuccess("");
        }
    }
}
