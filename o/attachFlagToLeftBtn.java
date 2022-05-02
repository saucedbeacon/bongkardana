package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.social.model.FeedModel;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u000b\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lid/dana/social/deeplink/FeatureFriendshipDetail;", "", "()V", "invoke", "", "activity", "Landroid/app/Activity;", "Lorg/jetbrains/annotations/NotNull;", "params", "", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class attachFlagToLeftBtn {
    @NotNull
    public static final attachFlagToLeftBtn setMin = new attachFlagToLeftBtn();

    private attachFlagToLeftBtn() {
    }

    @JvmStatic
    public static final void length(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Activity activity2 = activity;
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(activity2, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map2, "params");
        String str = map2.get("activityID");
        String str2 = "";
        String str3 = str == null ? str2 : str;
        if (!(str3.length() == 0)) {
            String str4 = map2.get("commentID");
            if (str4 != null) {
                str2 = str4;
            }
            SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
            FeedModel.setMax setmax2 = FeedModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullParameter(str3, "id");
            FeedModel feedModel = r4;
            FeedModel feedModel2 = new FeedModel(str3, (String) null, (String) null, (Long) null, (String) null, (String) null, false, (HashMap) null, (String) null, (String) null, false, 0, (List) null, (List) null, (String) null, (String) null, 65534);
            Intent max = SocialActivityDetail.setMax.getMax(activity2, feedModel, map2.get("source"), str2);
            SocialActivityDetail.setMax setmax3 = SocialActivityDetail.Companion;
            activity2.startActivityForResult(max, SocialActivityDetail.setMax.setMax());
        }
    }
}
