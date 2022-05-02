package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.social.model.FeedModel;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUMaskImage;
import o.CornerMarkingDataProvider;
import o.getBluetoothAdapterState;
import o.initContent;
import o.initContentView;
import o.onTabClick;
import o.resetInternal;
import o.setOverScrollMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\u0007H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0010\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020#H\u0002J\u0015\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020&¢\u0006\u0002\u0010-J\u0014\u0010.\u001a\u00020#2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020#00J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\fJ\b\u00106\u001a\u00020#H\u0016J\u000e\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020&J\u000e\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\fJ\u000e\u0010;\u001a\u00020#2\u0006\u0010:\u001a\u00020\fR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006<"}, d2 = {"Lid/dana/social/view/FeedsView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "notificationMode", "getNotificationMode", "()Z", "setNotificationMode", "(Z)V", "showCommentButton", "getShowCommentButton", "setShowCommentButton", "showSaymojiButton", "getShowSaymojiButton", "setShowSaymojiButton", "showSaymojiReactionSectionView", "getShowSaymojiReactionSectionView", "setShowSaymojiReactionSectionView", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "getSocialFeedClickListener", "()Lid/dana/social/adapter/SocialFeedClickListener;", "setSocialFeedClickListener", "(Lid/dana/social/adapter/SocialFeedClickListener;)V", "getLayout", "parseAttrs", "", "setDate", "date", "", "setDesc", "data", "Lid/dana/social/utils/FeedRegexData;", "setDropShadow", "setProfileAvatar", "url", "(Ljava/lang/String;)Lkotlin/Unit;", "setProfileImageClickListener", "avatarClick", "Lkotlin/Function0;", "setReaction", "feedModel", "Lid/dana/social/model/FeedModel;", "setReactionVisibility", "visible", "setup", "setupNotificationTypeBadge", "contentType", "showUnreadBadge", "read", "toggleUnreadNotificationBadge", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedsView extends BaseRichView {
    private boolean getMax;
    private boolean getMin;
    private boolean length;
    private HashMap setMax;
    private boolean setMin;
    public initContent socialFeedClickListener;

    @JvmOverloads
    public FeedsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_feed;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = true;
        this.length = true;
        this.setMin = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = true;
        this.length = true;
        this.setMin = true;
    }

    @NotNull
    public final initContent getSocialFeedClickListener() {
        initContent initcontent = this.socialFeedClickListener;
        if (initcontent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialFeedClickListener");
        }
        return initcontent;
    }

    public final void setSocialFeedClickListener(@NotNull initContent initcontent) {
        Intrinsics.checkNotNullParameter(initcontent, "<set-?>");
        this.socialFeedClickListener = initcontent;
    }

    public final boolean getShowSaymojiReactionSectionView() {
        return this.getMin;
    }

    public final void setShowSaymojiReactionSectionView(boolean z) {
        this.getMin = z;
        BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView != null) {
            bubbleFeedView.setSaymojiReactionSectionView(z);
        }
    }

    public final boolean getShowSaymojiButton() {
        return this.length;
    }

    public final void setShowSaymojiButton(boolean z) {
        this.length = z;
        if (z) {
            BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
            if (bubbleFeedView != null) {
                bubbleFeedView.showSaymojiButton();
                return;
            }
            return;
        }
        BubbleFeedView bubbleFeedView2 = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView2 != null) {
            bubbleFeedView2.hideSaymojiButton();
        }
    }

    public final boolean getShowCommentButton() {
        return this.setMin;
    }

    public final void setShowCommentButton(boolean z) {
        this.setMin = z;
        if (z) {
            BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
            if (bubbleFeedView != null) {
                bubbleFeedView.showCommentButton();
                return;
            }
            return;
        }
        BubbleFeedView bubbleFeedView2 = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView2 != null) {
            bubbleFeedView2.hideCommentButton();
        }
    }

    public final boolean getNotificationMode() {
        return this.getMax;
    }

    public final void setNotificationMode(boolean z) {
        this.getMax = z;
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getExtras);
        if (circleImageView != null) {
            View view = circleImageView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        setShowCommentButton(false);
        setShowSaymojiButton(false);
        setShowSaymojiReactionSectionView(false);
    }

    public final void parseAttrs(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.MediaMetadataCompat$TextKey);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.FeedsView)");
        try {
            setShowCommentButton(obtainStyledAttributes.getBoolean(0, true));
            setShowSaymojiButton(obtainStyledAttributes.getBoolean(1, true));
            setShowSaymojiReactionSectionView(obtainStyledAttributes.getBoolean(2, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Nullable
    public final Unit setProfileAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getPlaybackState);
        if (circleImageView == null) {
            return null;
        }
        setOverScrollMode.getMax(circleImageView, str, R.drawable.avatar_placeholder);
        return Unit.INSTANCE;
    }

    public final void setDesc(@NotNull AUMaskImage aUMaskImage) {
        Spannable spannable;
        Intrinsics.checkNotNullParameter(aUMaskImage, "data");
        BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView != null) {
            if (!aUMaskImage.getMin.isEmpty()) {
                initContentView.setMin setmin = initContentView.getMin;
                spannable = initContentView.setMin.getMax(aUMaskImage, Integer.valueOf(R.font.f33542131296264), false);
            } else {
                spannable = new SpannableString(aUMaskImage.setMax);
            }
            bubbleFeedView.setDesc(spannable);
        }
    }

    public final void setDate(@Nullable String str) {
        if (str != null) {
            ((BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias)).setDate(str);
        }
    }

    public final void showUnreadBadge(boolean z) {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.performMenuItemShortcut);
        if (imageView != null) {
            View view = imageView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void toggleUnreadNotificationBadge(boolean z) {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setForceShowIcon);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_view_feed_unread_notification_badge");
        imageView.setVisibility(z ^ true ? 0 : 8);
    }

    public final void setupNotificationTypeBadge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "contentType");
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getExtras);
        if (circleImageView != null) {
            onTabClick.getMax getmax = onTabClick.getMin;
            circleImageView.setImageResource(onTabClick.getMax.getMax(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ Function0 getMin;

        length(Function0 function0) {
            this.getMin = function0;
        }

        public final void onClick(View view) {
            this.getMin.invoke();
        }
    }

    public final void setProfileImageClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "avatarClick");
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getPlaybackState);
        if (circleImageView != null) {
            circleImageView.setOnClickListener(new length(function0));
        }
    }

    public final void setReaction(@NotNull FeedModel feedModel) {
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView != null) {
            bubbleFeedView.setFeedReactions(feedModel);
        }
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.UseExperimental);
        if (imageButton != null) {
            imageButton.setOnClickListener(new getMin(this, feedModel));
        }
        ImageButton imageButton2 = (ImageButton) _$_findCachedViewById(resetInternal.setMax.Experimental$Level);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new setMin(this, feedModel));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ FeedModel setMax;
        final /* synthetic */ FeedsView setMin;

        getMin(FeedsView feedsView, FeedModel feedModel) {
            this.setMin = feedsView;
            this.setMax = feedModel;
        }

        public final void onClick(View view) {
            BubbleFeedView bubbleFeedView = (BubbleFeedView) this.setMin._$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
            if (bubbleFeedView != null) {
                bubbleFeedView.triggerAddNewReactions(this.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ FeedModel getMin;
        final /* synthetic */ FeedsView setMax;

        setMin(FeedsView feedsView, FeedModel feedModel) {
            this.setMax = feedsView;
            this.getMin = feedModel;
        }

        public final void onClick(View view) {
            SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
            Context context = this.setMax.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            SocialActivityDetail.setMax.setMax(context, this.getMin);
        }
    }

    public final void setReactionVisibility(boolean z) {
        BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView != null) {
            bubbleFeedView.setFeedReactionVisibility(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/social/view/FeedsView$setDropShadow$1$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "p0", "Landroid/view/View;", "p1", "Landroid/graphics/Outline;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends ViewOutlineProvider {
        setMax() {
        }

        public final void getOutline(@Nullable View view, @Nullable Outline outline) {
            if (outline != null) {
                outline.setRect(0, 0, 0, 0);
            }
        }
    }

    public final void setup() {
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setVerticalStyle);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "$this$elevate");
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(_$_findCachedViewById, (int) TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.onItemClick);
        if (imageView != null) {
            View view = imageView;
            Intrinsics.checkNotNullParameter(view, "$this$elevate");
            Resources system2 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system2, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(view, (int) TypedValue.applyDimension(1, 4.1f, system2.getDisplayMetrics()));
        }
        ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.UseExperimental);
        if (imageButton != null) {
            View view2 = imageButton;
            Intrinsics.checkNotNullParameter(view2, "$this$elevate");
            Resources system3 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system3, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(view2, (int) TypedValue.applyDimension(1, 5.0f, system3.getDisplayMetrics()));
        }
        ImageButton imageButton2 = (ImageButton) _$_findCachedViewById(resetInternal.setMax.Experimental$Level);
        if (imageButton2 != null) {
            View view3 = imageButton2;
            Intrinsics.checkNotNullParameter(view3, "$this$elevate");
            Resources system4 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system4, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(view3, (int) TypedValue.applyDimension(1, 5.0f, system4.getDisplayMetrics()));
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(resetInternal.setMax.lookForSelectablePosition);
        if (_$_findCachedViewById2 != null) {
            if (CornerMarkingDataProvider.length()) {
                _$_findCachedViewById2.setOutlineProvider(new setMax());
            }
            Intrinsics.checkNotNullParameter(_$_findCachedViewById2, "$this$elevate");
            Resources system5 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system5, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(_$_findCachedViewById2, (int) TypedValue.applyDimension(1, 4.1f, system5.getDisplayMetrics()));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$ErrorCode);
        if (constraintLayout != null) {
            if (CornerMarkingDataProvider.length()) {
                constraintLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            View view4 = constraintLayout;
            Intrinsics.checkNotNullParameter(view4, "$this$elevate");
            Resources system6 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system6, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(view4, (int) TypedValue.applyDimension(1, 4.1f, system6.getDisplayMetrics()));
        }
    }
}
