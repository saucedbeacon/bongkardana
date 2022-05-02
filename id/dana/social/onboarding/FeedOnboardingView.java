package id.dana.social.onboarding;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager2.widget.ViewPager2;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.tabs.TabLayout;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.DanaH5;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.AUSegment;
import o.BLEBridgeExtension;
import o.H5TinyPopMenu;
import o.isShowMenu;
import o.resetInternal;
import o.stopBeaconDiscovery;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0019J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lid/dana/social/onboarding/FeedOnboardingView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "Lid/dana/social/common/FeedOnboardingListener;", "listener", "getListener", "()Lid/dana/social/common/FeedOnboardingListener;", "setListener", "(Lid/dana/social/common/FeedOnboardingListener;)V", "getLayout", "renderButtonDisabled", "", "renderButtonEnabled", "renderButtonError", "setup", "setupTabLayout", "()Lkotlin/Unit;", "setupTnc", "setupViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedOnboardingView extends BaseRichView {
    private HashMap getMin;
    @Nullable
    private AUSegment.AnonymousClass5 setMax;

    @JvmOverloads
    public FeedOnboardingView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedOnboardingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_feed_onboarding;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ AUSegment.AnonymousClass5 $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(AUSegment.AnonymousClass5 r1) {
            super(1);
            this.$value = r1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            AUSegment.AnonymousClass5 r2 = this.$value;
            if (r2 != null) {
                r2.setMax();
            }
        }
    }

    @Nullable
    public final AUSegment.AnonymousClass5 getListener() {
        return this.setMax;
    }

    public final void setListener(@Nullable AUSegment.AnonymousClass5 r3) {
        this.setMax = r3;
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub);
        if (danaButtonPrimaryView != null) {
            H5TinyPopMenu.getMin(danaButtonPrimaryView, new getMax(r3));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedOnboardingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedOnboardingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FeedOnboardingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void renderButtonDisabled() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.cancelPositionAnimator);
        if (textView != null) {
            textView.setVisibility(8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setEnabled(false);
            Context context = danaButtonPrimaryView.getContext();
            String string = context != null ? context.getString(R.string.social_feeds_loading) : null;
            if (string == null) {
                string = "";
            }
            danaButtonPrimaryView.setDanaButtonView(0, string, "", (Drawable) null);
        }
    }

    public final void renderButtonError() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.cancelPositionAnimator);
        if (textView != null) {
            textView.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setEnabled(true);
            Context context = danaButtonPrimaryView.getContext();
            String string = context != null ? context.getString(R.string.try_again) : null;
            if (string == null) {
                string = "";
            }
            danaButtonPrimaryView.setDanaButtonView(1, string, "", (Drawable) null);
        }
    }

    public final void renderButtonEnabled() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.cancelPositionAnimator);
        if (textView != null) {
            textView.setVisibility(8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setEnabled(true);
            Context context = danaButtonPrimaryView.getContext();
            String string = context != null ? context.getString(R.string.feed_onboarding_activate) : null;
            if (string == null) {
                string = "";
            }
            danaButtonPrimaryView.setDanaButtonView(1, string, "", (Drawable) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(0);
        }

        public final void invoke() {
            String min = isShowMenu.setMin("/m/standalone/tnc");
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(DanaUrl.TERMS_AND_CONDITION)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    public final void setup() {
        ViewPager2 viewPager2 = (ViewPager2) _$_findCachedViewById(resetInternal.setMax.animateTo);
        if (viewPager2 != null) {
            Context context = viewPager2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            viewPager2.setAdapter(new AUHorizontalListView.CheckForLongPress(context));
        }
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(resetInternal.setMax.getFixedWidthMajor);
        if (tabLayout != null) {
            ViewPager2 viewPager22 = (ViewPager2) _$_findCachedViewById(resetInternal.setMax.animateTo);
            Intrinsics.checkNotNullExpressionValue(viewPager22, "vp_content");
            BLEBridgeExtension.setMax(tabLayout, viewPager22, BLEBridgeExtension.length.INSTANCE);
            Unit unit = Unit.INSTANCE;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsService$Relation);
        if (appCompatTextView != null) {
            String string = getContext().getString(R.string.tnc);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.tnc)");
            stopBeaconDiscovery.setMax(appCompatTextView, string, getMin.INSTANCE);
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
