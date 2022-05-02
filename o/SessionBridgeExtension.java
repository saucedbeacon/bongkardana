package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.promoquest.model.QuestModel;
import id.dana.promoquest.views.QuestView;
import id.dana.referral.MyReferralDetailActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ConstraintProxy$StorageNotLowProxy;
import o.UrlMapExtension;
import o.encodeImageBytesToString;
import o.getDuration;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010!\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020\u0013H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006%"}, d2 = {"Lid/dana/promoquest/views/QuestViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/promoquest/model/QuestModel;", "context", "Landroid/content/Context;", "resource", "", "parent", "Landroid/view/ViewGroup;", "itemCount", "items", "", "actionFactory", "Lid/dana/promoquest/handler/PromoQuestActionFactory;", "questAction", "Lid/dana/promoquest/PromoQuestListener$QuestAction;", "redeemMissionDetailQuestListener", "Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;", "isFlexibleMission", "", "(Landroid/content/Context;ILandroid/view/ViewGroup;ILjava/util/List;Lid/dana/promoquest/handler/PromoQuestActionFactory;Lid/dana/promoquest/PromoQuestListener$QuestAction;Lid/dana/promoquest/adapter/MissionDetailQuestAdapter$RedeemQuestListener;Z)V", "getItemCount", "()I", "getItems", "()Ljava/util/List;", "getParent", "()Landroid/view/ViewGroup;", "qvQuest", "Lid/dana/promoquest/views/QuestView;", "getResource", "bindData", "", "data", "getQuestNumber", "isCompletedOrFinish", "nextQuestExist", "shouldIgniteTrackerLine", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SessionBridgeExtension extends Ignore<QuestModel> {
    private final encodeImageBytesToString.getMin IsOverlapping;
    private final UrlMapExtension.getMax equals;
    private final int getMax;
    @NotNull
    private final ViewGroup getMin;
    @NotNull
    private final List<QuestModel> isInside;
    private final QuestView setMax;
    private final int setMin = R.layout.view_quest_mission_detail_holder;
    private final loadLocalImageInternal toFloatRange;
    private final boolean toIntRange;

    public final /* synthetic */ void setMax(Object obj) {
        QuestModel questModel = (QuestModel) obj;
        if (questModel != null) {
            this.setMax.setActionFactory(this.toFloatRange);
            this.setMax.setQuest(questModel, getAdapterPosition() + 1, this.equals);
            this.setMax.setRedeemQuestListener(this.IsOverlapping);
            this.setMax.setCardBehavior(setMin(), getAdapterPosition() + 1, this.getMax, this.toIntRange);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionBridgeExtension(@NotNull Context context, @NotNull ViewGroup viewGroup, int i, @NotNull List<QuestModel> list, @NotNull loadLocalImageInternal loadlocalimageinternal, @NotNull UrlMapExtension.getMax getmax, @NotNull encodeImageBytesToString.getMin getmin, boolean z) {
        super(context, R.layout.view_quest_mission_detail_holder, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        Intrinsics.checkNotNullParameter(loadlocalimageinternal, "actionFactory");
        Intrinsics.checkNotNullParameter(getmax, "questAction");
        Intrinsics.checkNotNullParameter(getmin, "redeemMissionDetailQuestListener");
        this.getMin = viewGroup;
        this.getMax = i;
        this.isInside = list;
        this.toFloatRange = loadlocalimageinternal;
        this.equals = getmax;
        this.IsOverlapping = getmin;
        this.toIntRange = z;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        QuestView questView = (QuestView) view.findViewById(resetInternal.setMax.onNestedScroll);
        Intrinsics.checkNotNullExpressionValue(questView, "itemView.qv_quest_new");
        this.setMax = questView;
    }

    private final boolean setMin() {
        return setMax() && getMax();
    }

    private final boolean getMax() {
        return Intrinsics.areEqual((Object) "COMPLETE", (Object) this.isInside.get(getAdapterPosition() + 1).getMax) || Intrinsics.areEqual((Object) "FINISH", (Object) this.isInside.get(getAdapterPosition() + 1).getMax);
    }

    /* renamed from: o.SessionBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<MyReferralDetailActivity> {
        @InjectedFieldSignature("id.dana.referral.MyReferralDetailActivity.referralTrackerPresenter")
        public static void setMin(MyReferralDetailActivity myReferralDetailActivity, ConstraintProxy$StorageNotLowProxy.setMin setmin) {
            myReferralDetailActivity.referralTrackerPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.referral.MyReferralDetailActivity.readDeepLinkPropertiesPresenter")
        public static void getMax(MyReferralDetailActivity myReferralDetailActivity, getDuration.length length) {
            myReferralDetailActivity.readDeepLinkPropertiesPresenter = length;
        }
    }

    private final boolean setMax() {
        if (getAdapterPosition() + 1 >= this.getMax || this.isInside.get(getAdapterPosition() + 1).getMax == null) {
            return false;
        }
        return true;
    }
}
