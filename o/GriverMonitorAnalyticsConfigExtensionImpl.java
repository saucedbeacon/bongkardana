package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.model.CdpContentModel;
import id.dana.richview.SubscriptionBannerItemView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.GriverManifest;
import o.GyroscopeSensorService;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 >2\u00020\u0001:\u0001>B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0002J*\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020+2\u0006\u0010*\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u00010+H\u0002J\"\u00101\u001a\u00020(2\u0006\u0010/\u001a\u00020+2\u0006\u0010*\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u00010+H\u0002J\b\u00102\u001a\u00020+H\u0016J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0002J\b\u00109\u001a\u000204H\u0002J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020(H\u0002J\u0010\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020(H\u0002R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0015j\b\u0012\u0004\u0012\u00020\t`\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lid/dana/home/subscription/SubscriptionBannerView;", "Lid/dana/onboarding/view/BaseSimpleView;", "subscriptionList", "", "Lid/dana/model/CdpContentModel;", "onSubscriptionItemClickListener", "Lid/dana/home/banner/NewPromotionBannerAdapter$OnSubscriptionItemClickListener;", "(Ljava/util/List;Lid/dana/home/banner/NewPromotionBannerAdapter$OnSubscriptionItemClickListener;)V", "itemSubscriptionBanner1", "Lid/dana/richview/SubscriptionBannerItemView;", "getItemSubscriptionBanner1", "()Lid/dana/richview/SubscriptionBannerItemView;", "setItemSubscriptionBanner1", "(Lid/dana/richview/SubscriptionBannerItemView;)V", "itemSubscriptionBanner2", "getItemSubscriptionBanner2", "setItemSubscriptionBanner2", "itemSubscriptionBanner3", "getItemSubscriptionBanner3", "setItemSubscriptionBanner3", "itemSubscriptionBannerList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemSubscriptionBannerList", "()Ljava/util/ArrayList;", "setItemSubscriptionBannerList", "(Ljava/util/ArrayList;)V", "shimmerView", "Landroid/view/View;", "getShimmerView", "()Landroid/view/View;", "setShimmerView", "(Landroid/view/View;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeletonScreen", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setSkeletonScreen", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "getLayout", "", "getRemainingDays", "dueDate", "", "getSubscriptionStatus", "resources", "Landroid/content/res/Resources;", "widgetType", "paymentStatus", "getSubscriptionStatusStyle", "getTitle", "hideShimmer", "", "init", "initShimmeringView", "loadSubscriptionItemToView", "openSubscriptionPage", "setupSubscriptionItemUi", "showIndicator", "subscriptionMoreCount", "showSubscriptionItem", "subscriptionCount", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverMonitorAnalyticsConfigExtensionImpl extends GyroscopeSensorService.SensorChangedListener {
    @NotNull
    public static final setMin isInside = new setMin((byte) 0);
    @NotNull
    private ArrayList<SubscriptionBannerItemView> IsOverlapping = new ArrayList<>();
    public View getMax;
    public SubscriptionBannerItemView getMin;
    public SubscriptionBannerItemView length;
    public SubscriptionBannerItemView setMax;
    public onDetachedFromLayoutParams setMin;
    private final List<CdpContentModel> toDoubleRange;
    /* access modifiers changed from: private */
    public final GriverManifest.AnonymousClass54.getMin toString;

    public final int setMax() {
        return R.layout.view_subscription_banner;
    }

    @NotNull
    public final String setMin() {
        return "";
    }

    public GriverMonitorAnalyticsConfigExtensionImpl(@NotNull List<? extends CdpContentModel> list, @NotNull GriverManifest.AnonymousClass54.getMin getmin) {
        Intrinsics.checkNotNullParameter(list, "subscriptionList");
        Intrinsics.checkNotNullParameter(getmin, "onSubscriptionItemClickListener");
        this.toDoubleRange = list;
        this.toString = getmin;
    }

    private final void length() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
        }
        ondetachedfromlayoutparams.length();
        View view = this.getMax;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
        }
        view.setVisibility(8);
    }

    private final void getMax(int i) {
        int i2 = 0;
        while (i2 < i) {
            SubscriptionBannerItemView subscriptionBannerItemView = this.IsOverlapping.get(i2);
            CdpContentModel cdpContentModel = this.toDoubleRange.get(i2);
            Resources resources = subscriptionBannerItemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            String str = cdpContentModel.setMin;
            Intrinsics.checkNotNullExpressionValue(str, "subscriptionItem.contentType");
            String str2 = cdpContentModel.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(str2, "subscriptionItem.announcementSubscriptionDueDate");
            String min = setMin(resources, str, str2, cdpContentModel.b);
            String str3 = cdpContentModel.setMin;
            Intrinsics.checkNotNullExpressionValue(str3, "subscriptionItem.contentType");
            String str4 = cdpContentModel.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(str4, "subscriptionItem.announcementSubscriptionDueDate");
            int length2 = length(str3, str4, cdpContentModel.b);
            String str5 = cdpContentModel.getCause;
            Intrinsics.checkNotNullExpressionValue(str5, "subscriptionItem.announcementGoodsName");
            subscriptionBannerItemView.setMerchantTitle(str5);
            subscriptionBannerItemView.setSubscriptionStatus(min);
            subscriptionBannerItemView.setSubscriptionStatusStyle(length2);
            String str6 = cdpContentModel.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(str6, "subscriptionItem.announcementTotalAmount");
            subscriptionBannerItemView.setSubscriptionAmount(str6);
            String str7 = cdpContentModel.getCause;
            Intrinsics.checkNotNullExpressionValue(str7, "subscriptionItem.announcementGoodsName");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (str7 != null) {
                String lowerCase = str7.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                subscriptionBannerItemView.loadImage(lowerCase);
                subscriptionBannerItemView.setOnClickListener(new setMax(cdpContentModel, this, i2));
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/home/subscription/SubscriptionBannerView$showSubscriptionItem$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ int getMax;
        final /* synthetic */ CdpContentModel getMin;
        final /* synthetic */ GriverMonitorAnalyticsConfigExtensionImpl length;

        setMax(CdpContentModel cdpContentModel, GriverMonitorAnalyticsConfigExtensionImpl griverMonitorAnalyticsConfigExtensionImpl, int i) {
            this.getMin = cdpContentModel;
            this.length = griverMonitorAnalyticsConfigExtensionImpl;
            this.getMax = i;
        }

        public final void onClick(View view) {
            this.length.toString.getMax(this.getMin);
        }
    }

    private static String setMin(Resources resources, String str, String str2, String str3) {
        String str4;
        if (!Intrinsics.areEqual((Object) str, (Object) "SUBSCRIPTION_PAY_STATUS") || str3 == null) {
            int max = setMax(str2);
            if (max == 0) {
                str4 = resources.getString(R.string.subscription_status_due_date_today);
            } else if (max != 1) {
                str4 = resources.getString(R.string.subscription_status_due_date_other, new Object[]{Integer.valueOf(max)});
            } else {
                str4 = resources.getString(R.string.subscription_status_due_date_tomorrow);
            }
            Intrinsics.checkNotNullExpressionValue(str4, "when (val remainingDays …ningDays) }\n            }");
            return str4;
        }
        String string = resources.getString(Intrinsics.areEqual((Object) str3, (Object) "FAILED") ? R.string.subscription_payment_failed : R.string.subscription_payment_success);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …ent_success\n            )");
        return string;
    }

    private final int length(String str, String str2, String str3) {
        boolean areEqual = Intrinsics.areEqual((Object) str, (Object) "SUBSCRIPTION_PAY_STATUS");
        int i = R.color.f18142131099680;
        if (!areEqual || str3 == null) {
            int max = setMax(str2);
            Context context = this.equals;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            if (max != 0) {
                i = R.color.f23952131100331;
            }
            return IntRange.setMax(context, i);
        }
        Context context2 = this.equals;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        if (Intrinsics.areEqual((Object) str3, (Object) "FAILED")) {
            i = R.color.f20042131099905;
        }
        return IntRange.setMax(context2, i);
    }

    private static int setMax(String str) {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        return (int) ConfirmPopup.AnonymousClass1.setMax(new Date(instance.getTimeInMillis()), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/home/subscription/SubscriptionBannerView$showIndicator$1$1$1", "id/dana/home/subscription/SubscriptionBannerView$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ GriverMonitorAnalyticsConfigExtensionImpl getMax;
        final /* synthetic */ int setMin;

        getMax(GriverMonitorAnalyticsConfigExtensionImpl griverMonitorAnalyticsConfigExtensionImpl, int i) {
            this.getMax = griverMonitorAnalyticsConfigExtensionImpl;
            this.setMin = i;
        }

        public final void onClick(View view) {
            DanaH5.startContainerFullUrl("https://m.dana.id/i/dana-my-bills/lifestyle-subscription-list?openSection=gn_strategy");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/home/subscription/SubscriptionBannerView$Companion;", "", "()V", "EXTEND_INFO_KEY", "", "MAX_SUBSCRIPTION_LIST", "", "PAYMENT_STATUS_FAILED", "PAYMENT_STATUS_SUCCESS", "SUBSCRIPTION", "SUBSCRIPTION_DUE_DATE_TODAY", "SUBSCRIPTION_DUE_DATE_TOMORROW", "SUBSCRIPTION_PAY_STATUS", "SUBSCRIPTION_SUMMARY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void getMin() {
        View view = this.toFloatRange;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        View findViewById = view.findViewById(R.id.f60662131364654);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.shimmerView)");
        this.getMax = findViewById;
        if (findViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
        }
        findViewById.setVisibility(0);
        View view2 = this.getMax;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
        }
        getInsetDodgeRect min = containsFavoriteMenuItem.getMin(view2, R.layout.view_skeleton_subscription_banner);
        Intrinsics.checkNotNullExpressionValue(min, "ShimmeringUtil.bind(shim…eton_subscription_banner)");
        this.setMin = min;
        View view3 = this.toFloatRange;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        View findViewById2 = view3.findViewById(R.id.f46882131363235);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.itemSubscriptionBanner1)");
        this.getMin = (SubscriptionBannerItemView) findViewById2;
        View view4 = this.toFloatRange;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        View findViewById3 = view4.findViewById(R.id.f46892131363236);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.itemSubscriptionBanner2)");
        this.setMax = (SubscriptionBannerItemView) findViewById3;
        View view5 = this.toFloatRange;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        View findViewById4 = view5.findViewById(R.id.f46902131363237);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.itemSubscriptionBanner3)");
        this.length = (SubscriptionBannerItemView) findViewById4;
        this.IsOverlapping.clear();
        ArrayList<SubscriptionBannerItemView> arrayList = this.IsOverlapping;
        SubscriptionBannerItemView subscriptionBannerItemView = this.getMin;
        if (subscriptionBannerItemView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemSubscriptionBanner1");
        }
        arrayList.add(subscriptionBannerItemView);
        ArrayList<SubscriptionBannerItemView> arrayList2 = this.IsOverlapping;
        SubscriptionBannerItemView subscriptionBannerItemView2 = this.setMax;
        if (subscriptionBannerItemView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemSubscriptionBanner2");
        }
        arrayList2.add(subscriptionBannerItemView2);
        ArrayList<SubscriptionBannerItemView> arrayList3 = this.IsOverlapping;
        SubscriptionBannerItemView subscriptionBannerItemView3 = this.length;
        if (subscriptionBannerItemView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemSubscriptionBanner3");
        }
        arrayList3.add(subscriptionBannerItemView3);
        if (this.toDoubleRange.size() > 3) {
            int size = this.toDoubleRange.size() - 3;
            View view6 = this.toFloatRange;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            View findViewById5 = view6.findViewById(R.id.f71852131365819);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.viewIndicator)");
            CardView cardView = (CardView) findViewById5;
            View findViewById6 = view6.findViewById(R.id.f63472131364971);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.tvIndicatorCount)");
            cardView.setVisibility(0);
            cardView.setOnClickListener(new getMax(this, size));
            ((TextView) findViewById6).setText(view6.getContext().getString(R.string.subscription_banner_more_indicator, new Object[]{String.valueOf(size)}));
            getMax(3);
            return;
        }
        getMax(this.toDoubleRange.size());
    }
}
