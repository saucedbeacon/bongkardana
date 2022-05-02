package o;

import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.GriverBaseActivity;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyme/mapper/MerchantConsultReviewMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/MerchantConsult;", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "shopMapper", "Lid/dana/nearbyme/mapper/ShopMapper;", "merchantReviewTagMapper", "Lid/dana/nearbyme/mapper/MerchantReviewTagMapper;", "(Lid/dana/nearbyme/mapper/ShopMapper;Lid/dana/nearbyme/mapper/MerchantReviewTagMapper;)V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class m extends setSpeed<DiskUtil, MerchantConsultReviewModel> {
    private final AMCSConfigRpcFacade getMin;
    private final GriverBaseActivity.Lite2 setMax;

    public final /* synthetic */ Object map(Object obj) {
        DiskUtil diskUtil = (DiskUtil) obj;
        Intrinsics.checkNotNullParameter(diskUtil, "oldItem");
        Object apply = this.setMax.apply(diskUtil.getReviewableShop());
        Intrinsics.checkNotNullExpressionValue(apply, "shopMapper.apply(oldItem.reviewableShop)");
        ShopModel shopModel = (ShopModel) apply;
        Iterable<getExtensionFromMimeType> positiveTags = diskUtil.getPositiveTags();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(positiveTags, 10));
        for (getExtensionFromMimeType apply2 : positiveTags) {
            arrayList.add((MerchantReviewTagModel) this.getMin.apply(apply2));
        }
        List list = (List) arrayList;
        Iterable<getExtensionFromMimeType> negativeSentiments = diskUtil.getNegativeSentiments();
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(negativeSentiments, 10));
        for (getExtensionFromMimeType apply3 : negativeSentiments) {
            arrayList2.add((MerchantReviewTagModel) this.getMin.apply(apply3));
        }
        List list2 = (List) arrayList2;
        String merchantId = diskUtil.getReviewableShop().getMerchantId();
        if (merchantId == null) {
            merchantId = "";
        }
        return new MerchantConsultReviewModel(shopModel, list, list2, "", merchantId, 0);
    }

    @Inject
    public m(@NotNull GriverBaseActivity.Lite2 lite2, @NotNull AMCSConfigRpcFacade aMCSConfigRpcFacade) {
        Intrinsics.checkNotNullParameter(lite2, "shopMapper");
        Intrinsics.checkNotNullParameter(aMCSConfigRpcFacade, "merchantReviewTagMapper");
        this.setMax = lite2;
        this.getMin = aMCSConfigRpcFacade;
    }
}
