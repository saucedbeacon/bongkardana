package id.dana.nearbyrevamp;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.setMyBeaconListener;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 4, 2})
final class NewNearbyMeActivity$Grayscale$Algorithm extends Lambda implements Function1<Drawable, Unit> {
    final /* synthetic */ NewNearbyMeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewNearbyMeActivity$Grayscale$Algorithm(NewNearbyMeActivity newNearbyMeActivity) {
        super(1);
        this.this$0 = newNearbyMeActivity;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Drawable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Drawable drawable) {
        this.this$0.IsOverlapping = drawable;
        setMyBeaconListener.length(this.this$0, new Runnable(this) {
            final /* synthetic */ NewNearbyMeActivity$Grayscale$Algorithm setMin;

            {
                this.setMin = r1;
            }

            public final void run() {
                this.setMin.this$0.invokeSuspend();
            }
        });
    }
}
