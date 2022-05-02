package o;

import com.twilio.verify.TwilioVerifyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
final class getRuntimeVersion$Mean$Arithmetic<T> implements updateProgress<List<? extends String>> {
    final /* synthetic */ getRuntimeVersion getMin;
    final /* synthetic */ String setMax;

    getRuntimeVersion$Mean$Arithmetic(getRuntimeVersion getruntimeversion, String str) {
        this.getMin = getruntimeversion;
        this.setMax = str;
    }

    public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<List<String>> r5) {
        Intrinsics.checkNotNullParameter(r5, "emitter");
        RecyclerView$Adapter$StateRestorationPolicy max = this.getMin.setMin;
        if (max != null) {
            max.setMin((getPaddingTop) new getPaddingStart(this.setMax), (Function1<? super getHeight, Unit>) new Function1<getHeight, Unit>() {
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((getHeight) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull getHeight getheight) {
                    Intrinsics.checkNotNullParameter(getheight, "it");
                    if (getheight.getMin().length() > 0) {
                        r5.onSuccess(CollectionsKt.listOf(getheight.getMin(), getheight.IsOverlapping()));
                    } else {
                        r5.onSuccess(CollectionsKt.emptyList());
                    }
                }
            }, (Function1<? super TwilioVerifyException, Unit>) new Function1<TwilioVerifyException, Unit>() {
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TwilioVerifyException) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                    Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                    r5.onSuccess(CollectionsKt.emptyList());
                }
            });
        } else {
            r5.onSuccess(CollectionsKt.emptyList());
        }
    }
}
