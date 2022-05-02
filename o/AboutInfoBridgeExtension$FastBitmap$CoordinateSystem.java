package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AboutInfoBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/kycrenewal/model/ShowDialogPreference;", "invoke"}, k = 3, mv = {1, 4, 2})
public final class AboutInfoBridgeExtension$FastBitmap$CoordinateSystem extends Lambda implements Function1<uncaughtException, Unit> {
    final /* synthetic */ AboutInfoBridgeExtension this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutInfoBridgeExtension$FastBitmap$CoordinateSystem(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
        super(1);
        this.this$0 = aboutInfoBridgeExtension;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((uncaughtException) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull uncaughtException uncaughtexception) {
        Intrinsics.checkNotNullParameter(uncaughtexception, "it");
        if (uncaughtexception.getShow() && AboutInfoBridgeExtension.setMax(uncaughtexception.getTimeStamp())) {
            AboutInfoBridgeExtension aboutInfoBridgeExtension = this.this$0;
            aboutInfoBridgeExtension.toFloatRange.execute(onReceivedIcon.INSTANCE, new AboutInfoBridgeExtension.toFloatRange(aboutInfoBridgeExtension), AboutInfoBridgeExtension.toIntRange.INSTANCE);
        } else if (uncaughtexception.getShow() && AboutInfoBridgeExtension.getMax(uncaughtexception.getTimeStamp())) {
            this.this$0.length();
        }
    }
}
