package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u001aH\u0002J\u0014\u0010$\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010(\u001a\u00020\u001aH\u0016J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001fJ\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\fR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lid/dana/social/view/GroupedFeedsView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "notificationMode", "getNotificationMode", "()Z", "setNotificationMode", "(Z)V", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "getSocialFeedClickListener", "()Lid/dana/social/adapter/SocialFeedClickListener;", "setSocialFeedClickListener", "(Lid/dana/social/adapter/SocialFeedClickListener;)V", "getLayout", "setBubbleFeedOnClickListener", "", "onClickListener", "Landroid/view/View$OnClickListener;", "setDate", "date", "", "setDesc", "data", "Lid/dana/social/utils/FeedRegexData;", "setDropShadow", "setProfileAvatar", "listOfUrl", "", "setProfileImageClickListener", "setup", "setupNotificationTypeBadge", "contentType", "toggleUnreadNotificationBadge", "read", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GroupedFeedsView extends BaseRichView {
    private HashMap setMax;
    private boolean setMin;
    public initContent socialFeedClickListener;

    @JvmOverloads
    public GroupedFeedsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GroupedFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_grouped_feed;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupedFeedsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GroupedFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public GroupedFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
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

    public final boolean getNotificationMode() {
        return this.setMin;
    }

    public final void setNotificationMode(boolean z) {
        this.setMin = z;
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getExtras);
        if (circleImageView != null) {
            View view = circleImageView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void setProfileAvatar(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "listOfUrl");
        if (list.size() > 1) {
            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.setVolumeTo);
            if (circleImageView != null) {
                setOverScrollMode.getMax(circleImageView, list.get(0), R.drawable.avatar_placeholder);
            }
            CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getQueue);
            if (circleImageView2 != null) {
                setOverScrollMode.getMax(circleImageView2, list.get(1), R.drawable.avatar_placeholder);
            }
        } else if (list.size() == 1) {
            CircleImageView circleImageView3 = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.setVolumeTo);
            if (circleImageView3 != null) {
                setOverScrollMode.getMax(circleImageView3, list.get(0), R.drawable.avatar_placeholder);
            }
            CircleImageView circleImageView4 = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getQueue);
            if (circleImageView4 != null) {
                setOverScrollMode.getMax(circleImageView4, list.get(0), R.drawable.avatar_placeholder);
            }
        }
    }

    public final void setBubbleFeedOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        BubbleFeedView bubbleFeedView = (BubbleFeedView) _$_findCachedViewById(resetInternal.setMax.setHorizontalBias);
        if (bubbleFeedView != null) {
            bubbleFeedView.setOnClickListener(onClickListener);
        }
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

    public final void setProfileImageClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.Size);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    public final void setupNotificationTypeBadge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "contentType");
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getExtras);
        if (circleImageView != null) {
            onTabClick.getMax getmax = onTabClick.getMin;
            circleImageView.setImageResource(onTabClick.getMax.getMax(str));
        }
    }

    public final void toggleUnreadNotificationBadge(boolean z) {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setForceShowIcon);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_view_feed_unread_notification_badge");
        imageView.setVisibility(z ^ true ? 0 : 8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/social/view/GroupedFeedsView$setDropShadow$1$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "p0", "Landroid/view/View;", "p1", "Landroid/graphics/Outline;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends ViewOutlineProvider {
        setMin() {
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
        View _$_findCachedViewById2 = _$_findCachedViewById(resetInternal.setMax.lookForSelectablePosition);
        if (_$_findCachedViewById2 != null) {
            if (CornerMarkingDataProvider.length()) {
                _$_findCachedViewById2.setOutlineProvider(new setMin());
            }
            Intrinsics.checkNotNullParameter(_$_findCachedViewById2, "$this$elevate");
            Resources system3 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system3, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(_$_findCachedViewById2, (int) TypedValue.applyDimension(1, 4.1f, system3.getDisplayMetrics()));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$ErrorCode);
        if (constraintLayout != null) {
            if (CornerMarkingDataProvider.length()) {
                constraintLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            View view2 = constraintLayout;
            Intrinsics.checkNotNullParameter(view2, "$this$elevate");
            Resources system4 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system4, "Resources.getSystem()");
            getBluetoothAdapterState.getMin(view2, (int) TypedValue.applyDimension(1, 4.1f, system4.getDisplayMetrics()));
        }
    }
}
