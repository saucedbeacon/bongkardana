package o;

import android.app.Activity;
import android.content.Intent;
import com.google.android.exoplayer2.C;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.home.HomeTabActivity;
import id.dana.tracker.TrackerKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u000b\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lid/dana/social/deeplink/FeatureFriendship;", "", "()V", "invoke", "", "activity", "Landroid/app/Activity;", "Lorg/jetbrains/annotations/NotNull;", "params", "", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class attachFlagView {
    @NotNull
    public static final attachFlagView setMin = new attachFlagView();

    private attachFlagView() {
    }

    @JvmStatic
    public static final void setMax(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        Intent intent = new Intent(activity, HomeTabActivity.class);
        intent.putExtra("target", map.get("target"));
        intent.putExtra("Source", TrackerKey.SourceType.FEED_DEEPLINK);
        intent.setFlags(C.ENCODING_PCM_A_LAW);
        Unit unit = Unit.INSTANCE;
        activity.startActivity(intent);
    }
}
