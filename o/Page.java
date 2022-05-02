package o;

import id.dana.data.constant.BranchLinkConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class Page implements getAdapterPosition<onAppFinish> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getOrigin> userConfigEntityRepositoryProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lid/dana/data/donation/model/RedirectValueEntity;", "", "clientId", "", "scopes", "agreed", "", "url", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAgreed", "()Z", "setAgreed", "(Z)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getScopes", "setScopes", "getUrl", "setUrl", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class ExitListener {
        private boolean agreed;
        @NotNull
        private String clientId;
        @NotNull
        private String scopes;
        @NotNull
        private String url;

        public ExitListener() {
            this((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public ExitListener(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "clientId");
            Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.SCOPES);
            Intrinsics.checkNotNullParameter(str3, "url");
            this.clientId = str;
            this.scopes = str2;
            this.agreed = z;
            this.url = str3;
        }

        @NotNull
        public final String getClientId() {
            return this.clientId;
        }

        public final void setClientId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.clientId = str;
        }

        @NotNull
        public final String getScopes() {
            return this.scopes;
        }

        public final void setScopes(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.scopes = str;
        }

        public final boolean getAgreed() {
            return this.agreed;
        }

        public final void setAgreed(boolean z) {
            this.agreed = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExitListener(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/donation/repository/source/DonationCampaignDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/donation/repository/DonationCampaignEntityData;", "networkDonationCampaignEntityData", "Lid/dana/data/donation/repository/source/network/NetworkDonationCampaignEntityData;", "(Lid/dana/data/donation/repository/source/network/NetworkDonationCampaignEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class RenderReadyListener extends uncheckItems<onRenderReady> {
        private final getErrorView networkDonationCampaignEntityData;

        @Inject
        public RenderReadyListener(@NotNull getErrorView geterrorview) {
            Intrinsics.checkNotNullParameter(geterrorview, "networkDonationCampaignEntityData");
            this.networkDonationCampaignEntityData = geterrorview;
        }

        @NotNull
        public final onRenderReady createData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "source");
            return this.networkDonationCampaignEntityData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, d2 = {"toDonationCampaign", "Lid/dana/domain/donation/model/DonationCampaign;", "Lid/dana/data/donation/model/DonationCampaignsEntity;", "toDonationList", "", "Lid/dana/data/donation/repository/source/network/result/DonationCampaignResult;", "toRedirectValue", "Lid/dana/domain/donation/model/RedirectValue;", "Lid/dana/data/donation/model/RedirectValueEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
    public final class AnimStore {
        @NotNull
        public static final List<getDisplayZoomControls> toDonationList(@NotNull getContentView getcontentview) {
            Intrinsics.checkNotNullParameter(getcontentview, "$this$toDonationList");
            Iterable<onPageHide> donationCampaigns = getcontentview.getDonationCampaigns();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(donationCampaigns, 10));
            for (onPageHide donationCampaign : donationCampaigns) {
                arrayList.add(toDonationCampaign(donationCampaign));
            }
            return CollectionsKt.toMutableList((List) arrayList);
        }

        @NotNull
        public static final getDisplayZoomControls toDonationCampaign(@NotNull onPageHide onpagehide) {
            Intrinsics.checkNotNullParameter(onpagehide, "$this$toDonationCampaign");
            return new getDisplayZoomControls(onpagehide.getAggregator(), onpagehide.getFundRaiserName(), onpagehide.getVerified(), onpagehide.getBackgroundImage(), onpagehide.getRedirectType(), onpagehide.getTitle(), toRedirectValue(onpagehide.getRedirectValue()));
        }

        @NotNull
        public static final getAllowFileAccess toRedirectValue(@NotNull ExitListener exitListener) {
            Intrinsics.checkNotNullParameter(exitListener, "$this$toRedirectValue");
            return new getAllowFileAccess(exitListener.getClientId(), exitListener.getScopes(), exitListener.getAgreed(), exitListener.getUrl());
        }
    }

    public Page(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<onCallBack> bVar5, b.C0007b<getOrigin> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.configEntityDataFactoryProvider = bVar5;
        this.userConfigEntityRepositoryProvider = bVar6;
    }

    public final onAppFinish get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.configEntityDataFactoryProvider.get(), this.userConfigEntityRepositoryProvider.get());
    }

    public static Page create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<onCallBack> bVar5, b.C0007b<getOrigin> bVar6) {
        return new Page(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static onAppFinish newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, onCallBack oncallback, getOrigin getorigin) {
        return new onAppFinish(dialogLayout, r9, backKeyDownPoint, getapplaunchparams, oncallback, getorigin);
    }
}
