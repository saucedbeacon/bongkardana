package id.dana.nearbyrevamp;

import android.content.Context;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.IntRange;
import o.setMyBeaconListener;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
final class NewNearbyMeActivity$Mean$Arithmetic extends Lambda implements Function0<Unit> {
    final /* synthetic */ NewNearbyMeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewNearbyMeActivity$Mean$Arithmetic(NewNearbyMeActivity newNearbyMeActivity) {
        super(0);
        this.this$0 = newNearbyMeActivity;
    }

    public final void invoke() {
        NewNearbyMeActivity newNearbyMeActivity = this.this$0;
        newNearbyMeActivity.IsOverlapping = IntRange.length((Context) newNearbyMeActivity, (int) R.drawable.ic_avatar_grey_default);
        setMyBeaconListener.length(this.this$0, new Runnable(this) {
            final /* synthetic */ NewNearbyMeActivity$Mean$Arithmetic getMax;

            {
                this.getMax = r1;
            }

            public final void run() {
                this.getMax.this$0.invokeSuspend();
            }
        });
    }
}
