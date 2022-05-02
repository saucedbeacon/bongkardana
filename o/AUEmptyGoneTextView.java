package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.social.view.FeedCommentView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.AUListDialog;
import o.getProgressViewStartOffset;
import o.getQueueTitle;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/social/view/activity/detail/FeedCommentViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/state/ViewHolderState;", "Lid/dana/social/model/FeedCommentModel;", "parent", "Landroid/view/ViewGroup;", "getItemAtPosition", "Lkotlin/Function1;", "", "feedCommentInteraction", "Lid/dana/social/view/activity/detail/FeedCommentInteraction;", "onDeleteComment", "", "isOwnActivity", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lid/dana/social/view/activity/detail/FeedCommentInteraction;Lkotlin/jvm/functions/Function1;Z)V", "bindData", "item", "setupRetryInteraction", "showMenu", "v", "Landroid/view/View;", "menuRes", "showPopUpConfirmationDeleteComment", "model", "updateFeedCommentState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUEmptyGoneTextView extends Ignore<AUHorizontalListView.RecyclerListener<? extends resurrectSelectionIfNeeded>> {
    /* access modifiers changed from: private */
    public final Function1<Integer, resurrectSelectionIfNeeded> getMax;
    /* access modifiers changed from: private */
    public final updateData getMin;
    /* access modifiers changed from: private */
    public final Function1<Integer, Unit> setMax;
    /* access modifiers changed from: private */
    public final boolean setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ resurrectSelectionIfNeeded $model;
        final /* synthetic */ AUEmptyGoneTextView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(AUEmptyGoneTextView aUEmptyGoneTextView, resurrectSelectionIfNeeded resurrectselectionifneeded) {
            super(1);
            this.this$0 = aUEmptyGoneTextView;
            this.$model = resurrectselectionifneeded;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.getMin.length(this.$model);
            this.this$0.setMax.invoke(Integer.valueOf(this.this$0.getAbsoluteAdapterPosition()));
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        resurrectSelectionIfNeeded resurrectselectionifneeded;
        AUHorizontalListView.RecyclerListener recyclerListener = (AUHorizontalListView.RecyclerListener) obj;
        if (!(recyclerListener instanceof AUHorizontalListView.RecyclerListener.length)) {
            recyclerListener = null;
        }
        AUHorizontalListView.RecyclerListener.length length2 = (AUHorizontalListView.RecyclerListener.length) recyclerListener;
        if (length2 != null && (resurrectselectionifneeded = (resurrectSelectionIfNeeded) length2.length) != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ((FeedCommentView) view.findViewById(resetInternal.setMax.markerClass)).bind(resurrectselectionifneeded);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            FeedCommentView feedCommentView = (FeedCommentView) view2.findViewById(resetInternal.setMax.markerClass);
            if (feedCommentView != null) {
                int i = AUListDialog.ListDialogItem.length[resurrectselectionifneeded.getMin.ordinal()];
                if (i == 1) {
                    feedCommentView.renderSendingSubmitComment();
                } else if (i == 2) {
                    feedCommentView.renderFailedSubmitComment();
                } else if (i == 3) {
                    feedCommentView.renderSuccessSubmitComment();
                } else if (i == 4) {
                    feedCommentView.renderDefaultComment();
                } else if (i == 5) {
                    feedCommentView.showDim();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AUEmptyGoneTextView(@NotNull ViewGroup viewGroup, @NotNull Function1<? super Integer, resurrectSelectionIfNeeded> function1, @NotNull updateData updatedata, @NotNull Function1<? super Integer, Unit> function12, boolean z) {
        super(viewGroup.getContext(), R.layout.item_feed_comment, viewGroup);
        AppCompatImageView appCompatImageView;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "getItemAtPosition");
        Intrinsics.checkNotNullParameter(updatedata, "feedCommentInteraction");
        Intrinsics.checkNotNullParameter(function12, "onDeleteComment");
        this.getMax = function1;
        this.getMin = updatedata;
        this.setMax = function12;
        this.setMin = z;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        FeedCommentView feedCommentView = (FeedCommentView) view.findViewById(resetInternal.setMax.markerClass);
        if (feedCommentView != null) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) feedCommentView._$_findCachedViewById(resetInternal.setMax.setTintMode);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new setMin(this));
            }
            CircleImageView circleImageView = (CircleImageView) feedCommentView._$_findCachedViewById(resetInternal.setMax.getPlaybackState);
            if (circleImageView != null) {
                circleImageView.setOnClickListener(new getMin(this));
            }
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        FeedCommentView feedCommentView2 = (FeedCommentView) view2.findViewById(resetInternal.setMax.markerClass);
        if (feedCommentView2 != null && (appCompatImageView = (AppCompatImageView) feedCommentView2._$_findCachedViewById(resetInternal.setMax.createCheckBox)) != null) {
            appCompatImageView.setOnClickListener(new setMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/activity/detail/FeedCommentViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ AUEmptyGoneTextView getMax;

        setMin(AUEmptyGoneTextView aUEmptyGoneTextView) {
            this.getMax = aUEmptyGoneTextView;
        }

        public final void onClick(View view) {
            resurrectSelectionIfNeeded resurrectselectionifneeded = (resurrectSelectionIfNeeded) this.getMax.getMax.invoke(Integer.valueOf(this.getMax.getAbsoluteAdapterPosition()));
            if (this.getMax.setMin) {
                if (resurrectselectionifneeded.length()) {
                    AUEmptyGoneTextView aUEmptyGoneTextView = this.getMax;
                    Intrinsics.checkNotNullExpressionValue(view, "it");
                    AUEmptyGoneTextView.setMax(aUEmptyGoneTextView, view, R.menu.f75112131623936);
                    return;
                }
                AUEmptyGoneTextView aUEmptyGoneTextView2 = this.getMax;
                Intrinsics.checkNotNullExpressionValue(view, "it");
                AUEmptyGoneTextView.setMax(aUEmptyGoneTextView2, view, R.menu.f75142131623939);
            } else if (resurrectselectionifneeded.length()) {
                AUEmptyGoneTextView aUEmptyGoneTextView3 = this.getMax;
                Intrinsics.checkNotNullExpressionValue(view, "it");
                AUEmptyGoneTextView.setMax(aUEmptyGoneTextView3, view, R.menu.f75112131623936);
            } else {
                AUEmptyGoneTextView aUEmptyGoneTextView4 = this.getMax;
                Intrinsics.checkNotNullExpressionValue(view, "it");
                AUEmptyGoneTextView.setMax(aUEmptyGoneTextView4, view, R.menu.f75132131623938);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/activity/detail/FeedCommentViewHolder$1$2"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ AUEmptyGoneTextView setMin;

        getMin(AUEmptyGoneTextView aUEmptyGoneTextView) {
            this.setMin = aUEmptyGoneTextView;
        }

        public final void onClick(View view) {
            this.setMin.getMin.setMin((resurrectSelectionIfNeeded) this.setMin.getMax.invoke(Integer.valueOf(this.setMin.getAbsoluteAdapterPosition())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "onMenuItemClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements getQueueTitle.length {
        final /* synthetic */ AUEmptyGoneTextView getMax;

        length(AUEmptyGoneTextView aUEmptyGoneTextView) {
            this.getMax = aUEmptyGoneTextView;
        }

        public final boolean length(@NotNull MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            Integer valueOf = Integer.valueOf(this.getMax.getAbsoluteAdapterPosition());
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf == null) {
                return false;
            }
            resurrectSelectionIfNeeded resurrectselectionifneeded = (resurrectSelectionIfNeeded) this.getMax.getMax.invoke(Integer.valueOf(valueOf.intValue()));
            int itemId = menuItem.getItemId();
            if (itemId == R.id.f56242131364193) {
                AUEmptyGoneTextView.length(this.getMax, resurrectselectionifneeded);
            } else if (itemId == R.id.f56262131364195) {
                this.getMax.getMin.setMax(this.getMax.getAbsoluteAdapterPosition(), resurrectselectionifneeded);
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ AUEmptyGoneTextView length;

        setMax(AUEmptyGoneTextView aUEmptyGoneTextView) {
            this.length = aUEmptyGoneTextView;
        }

        public final void onClick(View view) {
            Integer valueOf = Integer.valueOf(this.length.getAbsoluteAdapterPosition());
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.length.getMin.getMax((resurrectSelectionIfNeeded) this.length.getMax.invoke(Integer.valueOf(valueOf.intValue())));
            }
        }
    }

    public static final /* synthetic */ void length(AUEmptyGoneTextView aUEmptyGoneTextView, resurrectSelectionIfNeeded resurrectselectionifneeded) {
        Context context = aUEmptyGoneTextView.length;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
        getmax.toFloatRange = aUEmptyGoneTextView.length.getString(R.string.feed_popup_title_delete_comment);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = aUEmptyGoneTextView.length.getString(R.string.feed_popup_desc_delete_comment);
        String string = aUEmptyGoneTextView.length.getString(R.string.button_delete);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.button_delete)");
        if (string != null) {
            String upperCase = string.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            getProgressViewStartOffset.getMax min = getmax2.setMin(upperCase, new getMax(aUEmptyGoneTextView, resurrectselectionifneeded));
            String string2 = aUEmptyGoneTextView.length.getString(R.string.option_cancel);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.option_cancel)");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
                getProgressViewStartOffset.getMax getmax3 = min;
                getmax3.toDoubleRange = upperCase2;
                getmax3.values = null;
                getProgressViewStartOffset.getMax max = getmax3.setMax(true);
                new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin().show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public static final /* synthetic */ void setMax(AUEmptyGoneTextView aUEmptyGoneTextView, View view, int i) {
        Context context = aUEmptyGoneTextView.length;
        Intrinsics.checkNotNull(context);
        getQueueTitle getqueuetitle = new getQueueTitle(context, view);
        new MediaDescriptionCompat(getqueuetitle.setMin).inflate(i, getqueuetitle.getMin);
        getqueuetitle.getMax = new length(aUEmptyGoneTextView);
        if (!getqueuetitle.length.setMax()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
