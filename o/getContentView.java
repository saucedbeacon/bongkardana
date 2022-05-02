package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/data/donation/repository/source/network/result/DonationCampaignResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "donationCampaigns", "", "Lid/dana/data/donation/model/DonationCampaignsEntity;", "(Ljava/util/List;)V", "getDonationCampaigns", "()Ljava/util/List;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getContentView extends BaseRpcResult {
    @NotNull
    private final List<onPageHide> donationCampaigns;

    public getContentView(@NotNull List<onPageHide> list) {
        Intrinsics.checkNotNullParameter(list, "donationCampaigns");
        this.donationCampaigns = list;
    }

    @NotNull
    public final List<onPageHide> getDonationCampaigns() {
        return this.donationCampaigns;
    }
}
