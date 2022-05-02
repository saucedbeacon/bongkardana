package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Page;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/data/donation/repository/source/DonationCampaignEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/donation/DonationRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "donationCampaignDataFactory", "Lid/dana/data/donation/repository/source/DonationCampaignDataFactory;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/donation/repository/source/DonationCampaignDataFactory;)V", "createNetworkDonationCampaignData", "Lid/dana/data/donation/repository/DonationCampaignEntityData;", "getDonationCampaigns", "Lio/reactivex/Observable;", "", "Lid/dana/domain/donation/model/DonationCampaign;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageContext extends setMinProgress implements getBuiltInZoomControls {
    private final Page.RenderReadyListener donationCampaignDataFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/donation/model/DonationCampaign;", "kotlin.jvm.PlatformType", "donationCampaigns", "Lid/dana/data/donation/repository/source/network/result/DonationCampaignResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<getContentView, List<? extends getDisplayZoomControls>> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getContentView getcontentview = (getContentView) obj;
            Intrinsics.checkNotNullParameter(getcontentview, "donationCampaigns");
            return Page.AnimStore.toDonationList(getcontentview);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public PageContext(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull Page.RenderReadyListener renderReadyListener) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(renderReadyListener, "donationCampaignDataFactory");
        this.donationCampaignDataFactory = renderReadyListener;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getDisplayZoomControls>> getDonationCampaigns() {
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest(createNetworkDonationCampaignData().getDonationCampaigns()).map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "authenticatedRequest(cre…paigns.toDonationList() }");
        return map;
    }

    private final onRenderReady createNetworkDonationCampaignData() {
        return this.donationCampaignDataFactory.createData("network");
    }
}
