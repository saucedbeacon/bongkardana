package id.dana.social.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o.IntRange;
import o.dispatchOnCancelled;
import o.getInsetDodgeRect;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.setBuildNumber;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0007J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0014\u0010&\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0(J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020!2\u0006\u0010*\u001a\u00020+J\u000e\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020%J\u0010\u0010/\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u000101J\u0010\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u000101J\u000e\u00104\u001a\u00020!2\u0006\u00105\u001a\u000201J\b\u00106\u001a\u00020!H\u0016J\b\u00107\u001a\u00020!H\u0002J\u000e\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020%J\b\u0010:\u001a\u00020!H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006;"}, d2 = {"Lid/dana/social/view/FeedsMeHeaderView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "badge", "Lcom/google/android/material/badge/BadgeDrawable;", "value", "feedNotificationCount", "getFeedNotificationCount", "()I", "setFeedNotificationCount", "(I)V", "<set-?>", "Lcom/ethanhua/skeleton/SkeletonScreen;", "profileNameSkeleton", "getProfileNameSkeleton", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setProfileNameSkeleton", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "profileNameSkeleton$delegate", "Lkotlin/Lazy;", "getLayout", "getPrivacyText", "", "intSrc", "hideShimmer", "", "renderNotificationCount", "renderNotificationIcon", "isEnable", "", "setOnFeedNotificationClicked", "onClick", "Lkotlin/Function0;", "setOnProfileNameSectionClicked", "clickListener", "Landroid/view/View$OnClickListener;", "setOnSettingIconSectionClicked", "setPrivacy", "sharePrivacy", "setProfileAvatar", "url", "", "setProfileName", "text", "setUsername", "username", "setup", "setupNotificationBadge", "showKycVerified", "show", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedsMeHeaderView extends BaseRichView {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FeedsMeHeaderView.class, "profileNameSkeleton", "getProfileNameSkeleton()Lcom/ethanhua/skeleton/SkeletonScreen;", 0))};
    private int getMax;
    private final Lazy getMin;
    private HashMap length;
    private BadgeDrawable setMin;

    @JvmOverloads
    public FeedsMeHeaderView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedsMeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_header_feeds_me;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedsMeHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedsMeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = LazyKt.lazy(new setMax(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FeedsMeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = LazyKt.lazy(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<getInsetDodgeRect> {
        final /* synthetic */ FeedsMeHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(FeedsMeHeaderView feedsMeHeaderView) {
            super(0);
            this.this$0 = feedsMeHeaderView;
        }

        public final getInsetDodgeRect invoke() {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((TextView) this.this$0._$_findCachedViewById(resetInternal.setMax.getChildVerticalGravity));
            setmax.getMax = R.layout.view_profile_name_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            return getinsetdodgerect;
        }
    }

    public final int getFeedNotificationCount() {
        return this.getMax;
    }

    public final void setFeedNotificationCount(int i) {
        this.getMax = i;
        BadgeDrawable badgeDrawable = this.setMin;
        if (badgeDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
        }
        badgeDrawable.setNumber(i);
        renderNotificationCount();
    }

    public final void setProfileAvatar(@Nullable String str) {
        Context context = getContext();
        if (context != null) {
            ((updateCornerMarking) Glide.getMax(context)).equals().length(str).setMax((int) R.drawable.avatar_placeholder).setMin((int) R.drawable.avatar_placeholder).length((ImageView) (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getPlaybackState));
        }
    }

    public final void showKycVerified(boolean z) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.getCurrent);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "iv_kyc_verified");
        appCompatImageView.setVisibility(z ? 0 : 8);
    }

    public final void setPrivacy(boolean z) {
        if (z) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.BrowserServiceFileProvider);
            if (textView != null) {
                CharSequence text = getContext().getText(R.string.my_feeds_header_share_unlocked);
                Intrinsics.checkNotNullExpressionValue(text, "context.getText(intSrc)");
                textView.setText(text);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onMeasure);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.ic_share_unlock);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.BrowserServiceFileProvider);
        if (textView2 != null) {
            CharSequence text2 = getContext().getText(R.string.my_feeds_header_share_locked);
            Intrinsics.checkNotNullExpressionValue(text2, "context.getText(intSrc)");
            textView2.setText(text2);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onMeasure);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(R.drawable.ic_share_lock);
        }
    }

    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        CharSequence charSequence = str;
        if (charSequence.length() > 0) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(0);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "tv_username");
            appCompatTextView2.setText(charSequence);
            return;
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "tv_username");
        appCompatTextView3.setVisibility(8);
    }

    public final void setProfileName(@Nullable String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1219238276, oncanceled);
            onCancelLoad.getMin(1219238276, oncanceled);
        }
        if (Intrinsics.areEqual((Object) "%fetching%", (Object) str)) {
            ((onDetachedFromLayoutParams) this.getMin.getValue()).getMin();
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.addOnContextAvailableListener);
            if (constraintLayout != null) {
                constraintLayout.setClickable(false);
                return;
            }
            return;
        }
        ((onDetachedFromLayoutParams) this.getMin.getValue()).length();
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getChildVerticalGravity);
        if (textView != null) {
            textView.setText(str);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.addOnContextAvailableListener);
        if (constraintLayout2 != null) {
            constraintLayout2.setClickable(true);
        }
    }

    public final void setOnSettingIconSectionClicked(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.StringDef);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    public final void setOnProfileNameSectionClicked(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.addOnContextAvailableListener);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(onClickListener);
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

    public final void setOnFeedNotificationClicked(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onClick");
        ((FrameLayout) _$_findCachedViewById(resetInternal.setMax.min)).setOnClickListener(new length(function0));
    }

    @SuppressLint({"RestrictedApi", "UnsafeExperimentalUsageError"})
    public final void renderNotificationCount() {
        if (this.getMax > 0) {
            BadgeDrawable badgeDrawable = this.setMin;
            if (badgeDrawable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("badge");
            }
            BadgeUtils.attachBadgeDrawable(badgeDrawable, (View) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createSpinner), (FrameLayout) _$_findCachedViewById(resetInternal.setMax.min));
            return;
        }
        BadgeDrawable badgeDrawable2 = this.setMin;
        if (badgeDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
        }
        BadgeUtils.detachBadgeDrawable(badgeDrawable2, (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createSpinner));
    }

    public final void renderNotificationIcon(boolean z) {
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.min);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_feed_notification");
        frameLayout.setVisibility(z ? 0 : 8);
    }

    public final void setup() {
        BadgeDrawable create = BadgeDrawable.create(getContext());
        Intrinsics.checkNotNullExpressionValue(create, "BadgeDrawable.create(context)");
        create.setMaxCharacterCount(2);
        create.setNumber(this.getMax);
        create.setHorizontalOffset(16);
        create.setVerticalOffset(-12);
        Unit unit = Unit.INSTANCE;
        this.setMin = create;
    }
}
