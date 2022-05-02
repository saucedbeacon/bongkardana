package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.authcode.interactor.GetAuthCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.APWebSettings;
import o.parseFromBytes;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/donation/DonationPresenter;", "Lid/dana/donation/DonationContract$Presenter;", "view", "Lid/dana/donation/DonationContract$View;", "getDonationCampaigns", "Lid/dana/domain/donation/interactor/GetDonationCampaigns;", "getAuthcode", "Lid/dana/domain/authcode/interactor/GetAuthCode;", "getDonationCampaignConfig", "Lid/dana/domain/featureconfig/interactor/GetDonationCampaignConfig;", "(Lid/dana/donation/DonationContract$View;Lid/dana/domain/donation/interactor/GetDonationCampaigns;Lid/dana/domain/authcode/interactor/GetAuthCode;Lid/dana/domain/featureconfig/interactor/GetDonationCampaignConfig;)V", "authcodeWithQueryString", "", "url", "authcode", "", "donationCampaign", "Lid/dana/donation/model/DonationCampaignModel;", "getDonationCampaign", "getDonationUrl", "getDonationUrlWithAuthcode", "getDonations", "onDestroy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class getAdvertiseFlags implements parseFromBytes.getMax {
    @NotNull
    public static final setMin setMax = new setMin((byte) 0);
    private final APWebSettings.ZoomDensity getMax;
    /* access modifiers changed from: private */
    public final parseFromBytes.getMin getMin;
    private final GetAuthCode length;
    private final getAllowContentAccess setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.logNetworkException(DanaLogConstants.BizType.DONATION_WIDGET, DanaLogConstants.ExceptionType.DONATION_CAMPAIGN_EXCEPTION, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/authcode/AuthCodeResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<SplashEntryInfo, Unit> {
        final /* synthetic */ getServiceData $donationCampaign;
        final /* synthetic */ getAdvertiseFlags this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getAdvertiseFlags getadvertiseflags, getServiceData getservicedata) {
            super(1);
            this.this$0 = getadvertiseflags;
            this.$donationCampaign = getservicedata;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SplashEntryInfo) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SplashEntryInfo splashEntryInfo) {
            Intrinsics.checkNotNullParameter(splashEntryInfo, "it");
            this.this$0.getMin.setMin(getAdvertiseFlags.setMin(this.$donationCampaign, splashEntryInfo.getAuthCode()));
        }
    }

    @Inject
    public getAdvertiseFlags(@NotNull parseFromBytes.getMin getmin, @NotNull getAllowContentAccess getallowcontentaccess, @NotNull GetAuthCode getAuthCode, @NotNull APWebSettings.ZoomDensity zoomDensity) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(getallowcontentaccess, "getDonationCampaigns");
        Intrinsics.checkNotNullParameter(getAuthCode, "getAuthcode");
        Intrinsics.checkNotNullParameter(zoomDensity, "getDonationCampaignConfig");
        this.getMin = getmin;
        this.setMin = getallowcontentaccess;
        this.length = getAuthCode;
        this.getMax = zoomDensity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/donation/DonationPresenter$getDonations$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/featureconfig/model/DonationCampaignConfig;", "onError", "", "e", "", "onNext", "donationCampaign", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<setWebViewClient> {
        final /* synthetic */ getAdvertiseFlags setMin;

        setMax(getAdvertiseFlags getadvertiseflags) {
            this.setMin = getadvertiseflags;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setWebViewClient setwebviewclient = (setWebViewClient) obj;
            Intrinsics.checkNotNullParameter(setwebviewclient, "donationCampaign");
            super.onNext(setwebviewclient);
            if (setwebviewclient.isFeatureEnable()) {
                this.setMin.getMin.setMax(setwebviewclient);
                this.setMin.setMin.execute(new getMax(this.setMin));
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            updateActionSheetContent.e(DanaLogConstants.BizType.DONATION_WIDGET, DanaLogConstants.ExceptionType.DONATION_CAMPAIGN_EXCEPTION, th);
        }
    }

    public final void getMin() {
        this.getMax.execute(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/donation/DonationPresenter$getDonationCampaign$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/donation/model/DonationCampaign;", "onError", "", "e", "", "onNext", "donationCampaigns", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<List<? extends getDisplayZoomControls>> {
        final /* synthetic */ getAdvertiseFlags setMax;

        getMax(getAdvertiseFlags getadvertiseflags) {
            this.setMax = getadvertiseflags;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "donationCampaigns");
            super.onNext(list);
            parseFromBytes.getMin min = this.setMax.getMin;
            Intrinsics.checkNotNullParameter(list, "$this$toDonationList");
            Iterable<getDisplayZoomControls> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getDisplayZoomControls getdisplayzoomcontrols : iterable) {
                Intrinsics.checkNotNullParameter(getdisplayzoomcontrols, "$this$toDonationCampign");
                arrayList.add(new getServiceData(getdisplayzoomcontrols.getAggregator(), getdisplayzoomcontrols.getFundRaiserName(), getdisplayzoomcontrols.getVerified(), getdisplayzoomcontrols.getBackgroundImage(), getdisplayzoomcontrols.getRedirectType(), getdisplayzoomcontrols.getTitle(), getdisplayzoomcontrols.getRedirectValue().getCliendId(), getdisplayzoomcontrols.getRedirectValue().getScopes(), getdisplayzoomcontrols.getRedirectValue().getAgreed(), getdisplayzoomcontrols.getRedirectValue().getUrl(), (String) null, 1024));
            }
            min.setMin((List<getServiceData>) CollectionsKt.toMutableList((List) arrayList));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            updateActionSheetContent.logNetworkException(DanaLogConstants.BizType.DONATION_WIDGET, DanaLogConstants.ExceptionType.DONATION_CAMPAIGN_EXCEPTION, th);
        }
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
        this.getMax.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/donation/DonationPresenter$Companion;", "", "()V", "AUTH_TYPE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void getMin(@NotNull getServiceData getservicedata) {
        Intrinsics.checkNotNullParameter(getservicedata, "donationCampaign");
        if (Intrinsics.areEqual((Object) getservicedata.length, (Object) "AUTH")) {
            this.length.execute(GetAuthCode.length.Companion.forGetAuthCode(getservicedata.IsOverlapping, getservicedata.setMax, getservicedata.equals, getservicedata.getMax()), new length(this, getservicedata), getMin.INSTANCE);
        } else {
            this.getMin.setMin(getservicedata.IsOverlapping);
        }
    }

    public static final /* synthetic */ String setMin(getServiceData getservicedata, String str) {
        String str2;
        getServiceData getservicedata2 = getservicedata;
        String str3 = getservicedata2.IsOverlapping;
        String str4 = getservicedata2.toIntRange;
        CharSequence charSequence = str;
        boolean z = true;
        if (!(charSequence == null || charSequence.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) "?", false, 2, (Object) null)) {
                str2 = "?authCode=".concat(String.valueOf(str));
            } else if (StringsKt.endsWith$default(str3, "?", false, 2, (Object) null)) {
                str2 = StringsKt.replace$default("?authCode=".concat(String.valueOf(str)), "?", "", false, 4, (Object) null);
            } else {
                str2 = StringsKt.replace$default("?authCode=".concat(String.valueOf(str)), "?", "&", false, 4, (Object) null);
            }
            sb.append(str2);
            str3 = sb.toString();
        }
        if (str4.length() <= 0) {
            z = false;
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append("&requestId=");
            sb2.append(str4);
            str3 = sb2.toString();
        }
        String str5 = str3;
        CharSequence charSequence2 = str5;
        return (!StringsKt.contains$default(charSequence2, (CharSequence) "&", false, 2, (Object) null) || StringsKt.contains$default(charSequence2, (CharSequence) "?", false, 2, (Object) null)) ? str5 : StringsKt.replaceFirst$default(str5, "&", "?", false, 4, (Object) null);
    }
}
