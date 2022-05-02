package id.dana.richview.donation;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.DonationModule;
import id.dana.richview.widgetcard.WidgetCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.RVResourcePresetProxy;
import o.getServiceData;
import o.isShowMenu;
import o.parseFromBytes;
import o.releaseCamera;
import o.resetInternal;
import o.setWebViewClient;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/richview/donation/DonationView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "donatinPresenter", "Lid/dana/donation/DonationContract$Presenter;", "getDonatinPresenter", "()Lid/dana/donation/DonationContract$Presenter;", "setDonatinPresenter", "(Lid/dana/donation/DonationContract$Presenter;)V", "donations", "", "Lid/dana/donation/model/DonationCampaignModel;", "learnMoreUrl", "", "getLayout", "injectComponent", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DonationView extends BaseRichView {
    @Inject
    public parseFromBytes.getMax donatinPresenter;
    /* access modifiers changed from: private */
    public String length;
    /* access modifiers changed from: private */
    public List<getServiceData> setMax;
    private HashMap setMin;

    @JvmOverloads
    public DonationView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public DonationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_donation;
    }

    public static final /* synthetic */ List access$getDonations$p(DonationView donationView) {
        List<getServiceData> list = donationView.setMax;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("donations");
        }
        return list;
    }

    public static final /* synthetic */ String access$getLearnMoreUrl$p(DonationView donationView) {
        String str = donationView.length;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnMoreUrl");
        }
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DonationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DonationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public DonationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final parseFromBytes.getMax getDonatinPresenter() {
        parseFromBytes.getMax getmax = this.donatinPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("donatinPresenter");
        }
        return getmax;
    }

    public final void setDonatinPresenter(@NotNull parseFromBytes.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.donatinPresenter = getmax;
    }

    public final void setup() {
        WidgetCardView widgetCardView = (WidgetCardView) _$_findCachedViewById(resetInternal.setMax.getTransitionState);
        widgetCardView.setActionButtonListener(new setMax(this));
        widgetCardView.setOnItemClickListener(new getMax(this));
        parseFromBytes.getMax getmax = this.donatinPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("donatinPresenter");
        }
        getmax.getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/richview/donation/DonationView$setup$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ DonationView length;

        setMax(DonationView donationView) {
            this.length = donationView;
        }

        public final void onClick(View view) {
            String min = isShowMenu.setMin(DonationView.access$getLearnMoreUrl$p(this.length));
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(learnMoreUrl)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/richview/donation/DonationView$setup$1$2", "Lid/dana/richview/widgetcard/WidgetCardView$OnItemClickListener;", "onItemClick", "", "position", "", "widgetItem", "Lid/dana/richview/widgetcard/WidgetItem;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements WidgetCardView.setMin {
        final /* synthetic */ DonationView getMin;

        getMax(DonationView donationView) {
            this.getMin = donationView;
        }

        public final void getMin(int i, @NotNull releaseCamera releasecamera) {
            Intrinsics.checkNotNullParameter(releasecamera, "widgetItem");
            this.getMin.getDonatinPresenter().getMin((getServiceData) DonationView.access$getDonations$p(this.getMin).get(i));
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        RVResourcePresetProxy.InputStreamGetter.getMin getmin = new RVResourcePresetProxy.InputStreamGetter.getMin((byte) 0);
        if (r4 != null) {
            getmin.getMax = r4;
            getmin.getMin = new DonationModule(new length(this));
            stopIgnoring.setMin(getmin.getMin, DonationModule.class);
            stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
            new RVResourcePresetProxy.InputStreamGetter(getmin.getMin, getmin.getMax, (byte) 0).setMin(this);
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"id/dana/richview/donation/DonationView$injectComponent$1", "Lid/dana/donation/DonationContract$View;", "onSuccessGetDonationConfig", "", "donationCampaign", "Lid/dana/domain/featureconfig/model/DonationCampaignConfig;", "onSuccessGetDonationUrl", "donationUrl", "", "onSuccessGetDonations", "donationCampaigns", "", "Lid/dana/donation/model/DonationCampaignModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements parseFromBytes.getMin {
        final /* synthetic */ DonationView getMin;

        length(DonationView donationView) {
            this.getMin = donationView;
        }

        public final void setMin(@NotNull List<getServiceData> list) {
            Intrinsics.checkNotNullParameter(list, "donationCampaigns");
            this.getMin.setMax = list;
            WidgetCardView widgetCardView = (WidgetCardView) this.getMin._$_findCachedViewById(resetInternal.setMax.getTransitionState);
            Intrinsics.checkNotNullParameter(list, "$this$toWidgetItems");
            Iterable<getServiceData> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getServiceData getservicedata : iterable) {
                String str = getservicedata.setMax;
                Intrinsics.checkNotNullParameter(getservicedata, "$this$toWidgetItem");
                Intrinsics.checkNotNullParameter(str, "id");
                arrayList.add(new releaseCamera(str, getservicedata.setMin, getservicedata.getMin, Boolean.valueOf(getservicedata.setMin()), getservicedata.getMax));
            }
            widgetCardView.setWidgets((List) arrayList);
        }

        public final void setMax(@NotNull setWebViewClient setwebviewclient) {
            Intrinsics.checkNotNullParameter(setwebviewclient, "donationCampaign");
            WidgetCardView widgetCardView = (WidgetCardView) this.getMin._$_findCachedViewById(resetInternal.setMax.getTransitionState);
            Intrinsics.checkNotNullExpressionValue(widgetCardView, "wcv_donation");
            widgetCardView.setVisibility(0);
            DonationView donationView = this.getMin;
            String min = isShowMenu.setMin(setwebviewclient.getRedirectUrl());
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(donationCampaign.redirectUrl)");
            donationView.length = min;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "donationUrl");
            String min = isShowMenu.setMin(str);
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(donationUrl)");
            DanaH5.startContainerFullUrl(min);
        }
    }
}
