package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.social.model.FeedModel;
import id.dana.social.view.GroupedFeedsView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/social/adapter/GroupedFeedViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/SocialFeedClickListener;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "clickGroupedContent", "decorateExtendInfoWithLocalizedContent", "groupedFeedModel", "Lid/dana/social/model/GroupedFeedModel;", "getAndPredicate", "", "getAvatar", "", "listOfActivity", "Lid/dana/social/model/FeedModel;", "getOtherPredicate", "setupOnClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class WebSocketBridgeExtension extends Ignore<setEmptyView> {
    @NotNull
    private final ViewGroup getMax;
    private final initContent getMin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSocketBridgeExtension(@NotNull ViewGroup viewGroup, @NotNull initContent initcontent) {
        super(viewGroup.getContext(), R.layout.viewholder_grouped_feed, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedClickListener");
        this.getMax = viewGroup;
        this.getMin = initcontent;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        GroupedFeedsView groupedFeedsView = (GroupedFeedsView) view.findViewById(resetInternal.setMax.setVerticalAlign);
        if (groupedFeedsView != null) {
            groupedFeedsView.setSocialFeedClickListener(this.getMin);
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        GroupedFeedsView groupedFeedsView2 = (GroupedFeedsView) view2.findViewById(resetInternal.setMax.setVerticalAlign);
        if (groupedFeedsView2 != null) {
            groupedFeedsView2.setBubbleFeedOnClickListener(new setMin(this));
        }
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        GroupedFeedsView groupedFeedsView3 = (GroupedFeedsView) view3.findViewById(resetInternal.setMax.setVerticalAlign);
        if (groupedFeedsView3 != null) {
            groupedFeedsView3.setProfileImageClickListener(new getMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ WebSocketBridgeExtension setMax;

        setMin(WebSocketBridgeExtension webSocketBridgeExtension) {
            this.setMax = webSocketBridgeExtension;
        }

        public final void onClick(View view) {
            WebSocketBridgeExtension.getMin(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ WebSocketBridgeExtension setMin;

        getMax(WebSocketBridgeExtension webSocketBridgeExtension) {
            this.setMin = webSocketBridgeExtension;
        }

        public final void onClick(View view) {
            WebSocketBridgeExtension.getMin(this.setMin);
        }
    }

    private static List<String> setMin(List<FeedModel> list) {
        String str;
        Iterable<FeedModel> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (FeedModel feedModel : iterable) {
            HashMap<String, String> hashMap = feedModel.IsOverlapping;
            if (hashMap != null) {
                str = setBuildNumber.getProfileAvatar(hashMap);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return CollectionsKt.distinct((List) arrayList);
    }

    /* renamed from: setMin */
    public void setMax(@NotNull setEmptyView setemptyview) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(setemptyview, "data");
        setFocusableInTouchMode setfocusableintouchmode = setemptyview.getMax;
        if (setfocusableintouchmode != null) {
            List<? extends HashMap<String, String>> list = setfocusableintouchmode.setMax;
            if (list.size() > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append(setBuildNumber.getNickName((HashMap) list.get(0)));
                sb.append(", ");
                sb.append(setBuildNumber.getNickName((HashMap) list.get(1)));
                sb.append(' ');
                String string = this.length.getString(R.string.and_predicate);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.and_predicate)");
                sb.append(string);
                sb.append(' ');
                String string2 = this.length.getString(R.string.other_predicate);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.other_predicate)");
                sb.append(string2);
                str = sb.toString();
            } else if (list.size() > 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(setBuildNumber.getNickName((HashMap) list.get(0)));
                sb2.append(", ");
                sb2.append(setBuildNumber.getNickName((HashMap) list.get(1)));
                sb2.append(' ');
                String string3 = this.length.getString(R.string.and_predicate);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.and_predicate)");
                sb2.append(string3);
                sb2.append(' ');
                sb2.append(setBuildNumber.getNickName((HashMap) list.get(2)));
                str = sb2.toString();
            } else if (list.size() > 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(setBuildNumber.getNickName((HashMap) list.get(0)));
                sb3.append(' ');
                String string4 = this.length.getString(R.string.and_predicate);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.and_predicate)");
                sb3.append(string4);
                sb3.append(' ');
                sb3.append(setBuildNumber.getNickName((HashMap) list.get(1)));
                str = sb3.toString();
            } else {
                str = setBuildNumber.getNickName((HashMap) list.get(0));
            }
            setBuildNumber.setActorNickname(setfocusableintouchmode.length, str);
            setBuildNumber.setDisplayName(setfocusableintouchmode.length, str);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            GroupedFeedsView groupedFeedsView = (GroupedFeedsView) view.findViewById(resetInternal.setMax.setVerticalAlign);
            if (groupedFeedsView != null) {
                groupedFeedsView.setProfileAvatar(setMin(setfocusableintouchmode.setMin));
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            GroupedFeedsView groupedFeedsView2 = (GroupedFeedsView) view2.findViewById(resetInternal.setMax.setVerticalAlign);
            if (groupedFeedsView2 != null) {
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                groupedFeedsView2.setDesc(setemptyview.getMax(context, this.getMin));
            }
            FeedModel feedModel = (FeedModel) CollectionsKt.firstOrNull(setfocusableintouchmode.setMin);
            if (feedModel != null && (str2 = feedModel.getMin) != null) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                GroupedFeedsView groupedFeedsView3 = (GroupedFeedsView) view3.findViewById(resetInternal.setMax.setVerticalAlign);
                if (groupedFeedsView3 != null) {
                    groupedFeedsView3.setDate(str2);
                }
            }
        }
    }

    public static final /* synthetic */ void getMin(WebSocketBridgeExtension webSocketBridgeExtension) {
        if (webSocketBridgeExtension.getBindingAdapterPosition() >= 0) {
            webSocketBridgeExtension.getMin.getMax(webSocketBridgeExtension.getBindingAdapterPosition());
        }
    }
}
