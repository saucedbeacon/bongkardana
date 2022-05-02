package id.dana.social.adapter;

import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.social.view.BubbleFeedView;
import id.dana.social.view.FeedsView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.initContent;
import o.resetInternal;
import o.setBuildNumber;
import o.setEmptyView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0002JF\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020&2*\u0010'\u001a&\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010(j\u0012\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u0001`)H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lid/dana/social/adapter/FeedViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "showCommentButton", "", "showSaymojiButton", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/SocialFeedClickListener;ZZ)V", "getParent", "()Landroid/view/ViewGroup;", "value", "getShowCommentButton", "()Z", "setShowCommentButton", "(Z)V", "getShowSaymojiButton", "setShowSaymojiButton", "viewFeed", "Lid/dana/social/view/FeedsView;", "getViewFeed", "()Lid/dana/social/view/FeedsView;", "setViewFeed", "(Lid/dana/social/view/FeedsView;)V", "bindData", "", "data", "bindViewFromFeedModel", "feedModel", "Lid/dana/social/model/FeedModel;", "bindViewFromGroupedFeedModel", "first", "getAvatar", "", "imageUrl", "type", "", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class FeedViewHolder extends Ignore<setEmptyView> {
    public boolean getMax;
    /* access modifiers changed from: private */
    public final initContent getMin;
    @NotNull
    private final ViewGroup setMax;
    public boolean setMin;
    @BindView(2131365868)
    public FeedsView viewFeed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewHolder(@NotNull ViewGroup viewGroup, @NotNull initContent initcontent, boolean z, boolean z2) {
        super(viewGroup.getContext(), R.layout.viewholder_feed, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedClickListener");
        this.setMax = viewGroup;
        this.getMin = initcontent;
        FeedsView feedsView = this.viewFeed;
        if (feedsView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFeed");
        }
        feedsView.setShowCommentButton(z);
        FeedsView feedsView2 = this.viewFeed;
        if (feedsView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFeed");
        }
        feedsView2.setShowSaymojiButton(z2);
        FeedsView feedsView3 = this.viewFeed;
        if (feedsView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFeed");
        }
        feedsView3.setSocialFeedClickListener(this.getMin);
        FeedsView feedsView4 = this.viewFeed;
        if (feedsView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFeed");
        }
        BubbleFeedView bubbleFeedView = (BubbleFeedView) feedsView4._$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView != null) {
            bubbleFeedView.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ FeedViewHolder getMin;

                {
                    this.getMin = r1;
                }

                public final void onClick(View view) {
                    if (this.getMin.getBindingAdapterPosition() >= 0) {
                        this.getMin.getMin.setMax(this.getMin.getBindingAdapterPosition());
                    }
                }
            });
        }
        FeedsView feedsView5 = this.viewFeed;
        if (feedsView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFeed");
        }
        feedsView5.setProfileImageClickListener(new Function0<Unit>(this) {
            final /* synthetic */ FeedViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                if (this.this$0.getBindingAdapterPosition() >= 0) {
                    this.this$0.getMin.getMin(this.this$0.getBindingAdapterPosition());
                }
            }
        });
    }

    private static String getMax(String str, int i, HashMap<String, String> hashMap) {
        if (i == 9 || i == 15) {
            str = hashMap != null ? setBuildNumber.getProfileAvatar(hashMap) : null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0 = r0.setMin;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMax(@org.jetbrains.annotations.Nullable o.setEmptyView r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00c4
            id.dana.social.model.FeedModel r0 = r9.setMax
            r1 = 5
            java.lang.String r2 = "context"
            java.lang.String r3 = "viewFeed"
            if (r0 != 0) goto L_0x006f
            o.setFocusableInTouchMode r0 = r9.getMax
            if (r0 == 0) goto L_0x001a
            java.util.List<id.dana.social.model.FeedModel> r0 = r0.setMin
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            id.dana.social.model.FeedModel r0 = (id.dana.social.model.FeedModel) r0
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x006e
            id.dana.social.view.FeedsView r4 = r8.viewFeed
            if (r4 != 0) goto L_0x0024
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0024:
            java.lang.String r5 = r0.equals
            int r6 = r9.getMin
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r0.IsOverlapping
            java.lang.String r5 = getMax(r5, r6, r7)
            r4.setProfileAvatar(r5)
            id.dana.social.view.FeedsView r4 = r8.viewFeed
            if (r4 != 0) goto L_0x0038
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0038:
            android.content.Context r5 = r8.length
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            o.initContent r2 = r8.getMin
            o.AUMaskImage r2 = r9.getMax(r5, r2)
            r4.setDesc(r2)
            id.dana.social.view.FeedsView r2 = r8.viewFeed
            if (r2 != 0) goto L_0x004d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x004d:
            java.lang.String r4 = r0.getMin
            r2.setDate(r4)
            id.dana.social.view.FeedsView r2 = r8.viewFeed
            if (r2 != 0) goto L_0x0059
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0059:
            r2.setReaction(r0)
            int r9 = r9.getMin
            if (r9 != r1) goto L_0x006e
            id.dana.social.view.FeedsView r9 = r8.viewFeed
            if (r9 != 0) goto L_0x0067
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0067:
            boolean r0 = r0.length()
            r9.showUnreadBadge(r0)
        L_0x006e:
            return
        L_0x006f:
            id.dana.social.model.FeedModel r0 = r9.setMax
            if (r0 == 0) goto L_0x00c4
            id.dana.social.view.FeedsView r4 = r8.viewFeed
            if (r4 != 0) goto L_0x007a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x007a:
            java.lang.String r5 = r0.equals
            int r6 = r9.getMin
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r0.IsOverlapping
            java.lang.String r5 = getMax(r5, r6, r7)
            r4.setProfileAvatar(r5)
            id.dana.social.view.FeedsView r4 = r8.viewFeed
            if (r4 != 0) goto L_0x008e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x008e:
            android.content.Context r5 = r8.length
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            o.initContent r2 = r8.getMin
            o.AUMaskImage r2 = r9.getMax(r5, r2)
            r4.setDesc(r2)
            id.dana.social.view.FeedsView r2 = r8.viewFeed
            if (r2 != 0) goto L_0x00a3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00a3:
            java.lang.String r4 = r0.getMin
            r2.setDate(r4)
            id.dana.social.view.FeedsView r2 = r8.viewFeed
            if (r2 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00af:
            r2.setReaction(r0)
            int r9 = r9.getMin
            if (r9 != r1) goto L_0x00c4
            id.dana.social.view.FeedsView r9 = r8.viewFeed
            if (r9 != 0) goto L_0x00bd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00bd:
            boolean r0 = r0.length()
            r9.showUnreadBadge(r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.adapter.FeedViewHolder.setMax(o.setEmptyView):void");
    }
}
