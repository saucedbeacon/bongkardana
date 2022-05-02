package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
final class APWebChromeClient$FastBitmap$CoordinateSystem extends Lambda implements Function1<Throwable, Unit> {
    public static final APWebChromeClient$FastBitmap$CoordinateSystem INSTANCE = new APWebChromeClient$FastBitmap$CoordinateSystem();

    APWebChromeClient$FastBitmap$CoordinateSystem() {
        super(1);
    }

    public final void invoke(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "it");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }
}
