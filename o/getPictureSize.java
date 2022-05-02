package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.di.PerActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.MediaInfo;
import o.convertDipToPx;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteAnalyticsTracker;", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$AnalyticsTracker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "execute", "", "builderFunction", "Lkotlin/Function1;", "Lid/dana/tracker/EventTrackerModel$Builder;", "Lkotlin/ExtensionFunctionType;", "trackAutoSwitchPayment", "source", "", "isActive", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class getPictureSize implements MediaInfo.length {
    private final Context setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ boolean $isActive;
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(String str, boolean z) {
            super(1);
            this.$source = str;
            this.$isActive = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.AUTO_SWITCH_PAYMENT;
            length.setMax("Source", this.$source);
            length.setMin("Result", this.$isActive);
        }
    }

    @Inject
    public getPictureSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = context;
    }

    public final void length(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "source");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.setMax);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new length(str, z).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }
}
