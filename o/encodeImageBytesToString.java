package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.promoquest.model.QuestModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.UrlMapExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/promoquest/adapter/MissionDetailQuestAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/promoquest/views/QuestViewHolder;", "Lid/dana/promoquest/model/QuestModel;", "actionFactory", "Lid/dana/promoquest/handler/PromoQuestActionFactory;", "questAction", "Lid/dana/promoquest/PromoQuestListener$QuestAction;", "redeemQuestListener", "Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;", "isFlexibleMission", "", "(Lid/dana/promoquest/handler/PromoQuestActionFactory;Lid/dana/promoquest/PromoQuestListener$QuestAction;Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "RedeemQuestListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class encodeImageBytesToString extends IMultiInstanceInvalidationCallback.Stub<SessionBridgeExtension, QuestModel> {
    private final boolean getMax;
    private final getMin getMin;
    private final loadLocalImageInternal length;
    private final UrlMapExtension.getMax setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;", "", "onSuccessRedeem", "", "questId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMax(@NotNull String str);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        int itemCount = getItemCount();
        List max = getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        return new SessionBridgeExtension(context, viewGroup, itemCount, max, this.length, this.setMax, this.getMin, this.getMax);
    }

    public encodeImageBytesToString(@NotNull loadLocalImageInternal loadlocalimageinternal, @NotNull UrlMapExtension.getMax getmax, @NotNull getMin getmin, boolean z) {
        Intrinsics.checkNotNullParameter(loadlocalimageinternal, "actionFactory");
        Intrinsics.checkNotNullParameter(getmax, "questAction");
        Intrinsics.checkNotNullParameter(getmin, "redeemQuestListener");
        this.length = loadlocalimageinternal;
        this.setMax = getmax;
        this.getMin = getmin;
        this.getMax = z;
    }
}
