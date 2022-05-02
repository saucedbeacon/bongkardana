package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.social.model.FeedModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o.AUBaseDialog;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u001c\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020\u000fH\u0016J\u0006\u0010%\u001a\u00020\u000fJ\u0006\u0010&\u001a\u00020\u000fJ\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/social/view/BubbleFeedView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "maxItem", "reactionViewRuler", "Landroid/view/View;", "calculateReactionContainerThenSetContent", "", "feedModel", "Lid/dana/social/model/FeedModel;", "getLayout", "hideAllButtonAndReactionSection", "hideCommentButton", "hideSaymojiButton", "hideSpace", "parseAttrs", "setDate", "date", "", "setDesc", "textSpan", "Landroid/text/Spannable;", "setFeedReactionVisibility", "visible", "", "setFeedReactions", "setSaymojiReactionSectionView", "isVisible", "setup", "showCommentButton", "showSaymojiButton", "triggerAddNewReactions", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BubbleFeedView extends BaseRichView {
    private HashMap getMax;
    private View length;
    /* access modifiers changed from: private */
    public int setMax;

    @JvmOverloads
    public BubbleFeedView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public BubbleFeedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_bubble_feed;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BubbleFeedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BubbleFeedView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public BubbleFeedView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = 2;
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super.parseAttrs(context, attributeSet);
        if (attributeSet != null) {
            setStyledAttributes(context, attributeSet, resetInternal.getMin.extraCallbackWithResult);
            try {
                boolean z = getStyledAttributes().getBoolean(0, false);
                ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
                if (reactionSectionView != null) {
                    View view = reactionSectionView;
                    boolean z2 = !z;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(z2 ? 0 : 8);
                }
                if (z) {
                    setSaymojiReactionSectionView(false);
                    hideSaymojiButton();
                    hideCommentButton();
                }
            } finally {
                getStyledAttributes().recycle();
            }
        }
    }

    public final void hideCommentButton() {
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.Experimental$Level);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
        if (reactionSectionView != null) {
            reactionSectionView.setShowCommentCount(false);
        }
    }

    public final void showCommentButton() {
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.Experimental$Level);
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
        ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
        if (reactionSectionView != null) {
            reactionSectionView.setShowCommentCount(true);
        }
    }

    public final void showSaymojiButton() {
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.UseExperimental);
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    public final void hideSaymojiButton() {
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.UseExperimental);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    public final void setSaymojiReactionSectionView(boolean z) {
        ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
        if (reactionSectionView != null) {
            View view = reactionSectionView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void setDesc(@Nullable Spannable spannable) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getSplitTrack);
        if (textView != null) {
            textView.setText(spannable);
            AUBaseDialog.getMax getmax = AUBaseDialog.length;
            textView.setMovementMethod(AUBaseDialog.getMax.getMax());
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
    }

    public final void setDate(@Nullable String str) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbTintList);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setFeedReactions(@NotNull FeedModel feedModel) {
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        if (this.length == null) {
            ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
            View findViewById = reactionSectionView != null ? reactionSectionView.findViewById(R.id.f72992131365934) : null;
            this.length = findViewById;
            if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new setMin(findViewById, this, feedModel));
                return;
            }
            return;
        }
        ReactionSectionView reactionSectionView2 = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
        if (reactionSectionView2 != null) {
            reactionSectionView2.setReactionsContentView(feedModel, this.setMax);
        }
    }

    public final void setFeedReactionVisibility(boolean z) {
        ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
        if (reactionSectionView != null) {
            View view = reactionSectionView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/social/view/BubbleFeedView$calculateReactionContainerThenSetContent$1$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ FeedModel getMax;
        final /* synthetic */ View getMin;
        final /* synthetic */ BubbleFeedView setMax;

        setMin(View view, BubbleFeedView bubbleFeedView, FeedModel feedModel) {
            this.getMin = view;
            this.setMax = bubbleFeedView;
            this.getMax = feedModel;
        }

        public final void onGlobalLayout() {
            this.setMax.setMax = MathKt.roundToInt(((float) ((int) (((float) this.getMin.getMeasuredWidth()) / Resources.getSystem().getDisplayMetrics().density))) / 78.0f);
            ReactionSectionView reactionSectionView = (ReactionSectionView) this.setMax._$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
            if (reactionSectionView != null) {
                reactionSectionView.setReactionsContentView(this.getMax, this.setMax.setMax);
            }
            this.getMin.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public final void triggerAddNewReactions(@NotNull FeedModel feedModel) {
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.isHideOnContentScrollEnabled);
        if (reactionSectionView != null) {
            reactionSectionView.addNewReaction(feedModel);
        }
    }

    public final void hideSpace() {
        Space space = (Space) _$_findCachedViewById(resetInternal.setMax.getFirstBaselineToTopHeight);
        if (space != null) {
            View view = space;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }
}
