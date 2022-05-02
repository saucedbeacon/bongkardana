package o;

import id.dana.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.SharedDataBridgeExtension;
import o.addApp;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
final class SharedDataBridgeExtension$FastBitmap$CoordinateSystem extends Lambda implements Function1<List<? extends String>, Unit> {
    final /* synthetic */ SharedDataBridgeExtension this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedDataBridgeExtension$FastBitmap$CoordinateSystem(SharedDataBridgeExtension sharedDataBridgeExtension) {
        super(1);
        this.this$0 = sharedDataBridgeExtension;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<String>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        SharedDataBridgeExtension sharedDataBridgeExtension = this.this$0;
        Intrinsics.checkNotNullParameter(list, "supportedCountries");
        String string = sharedDataBridgeExtension.getMin.getString(R.string.google_api_key);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.google_api_key)");
        sharedDataBridgeExtension.setMax.execute(addApp.setMin.Companion.forApiKeyAndTracker(string), new SharedDataBridgeExtension.equals(sharedDataBridgeExtension, list), new SharedDataBridgeExtension.IsOverlapping(sharedDataBridgeExtension));
    }
}
