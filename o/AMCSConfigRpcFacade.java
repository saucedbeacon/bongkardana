package o;

import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/mapper/MerchantReviewTagMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/Tag;", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "()V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AMCSConfigRpcFacade extends setSpeed<getExtensionFromMimeType, MerchantReviewTagModel> {
    public final /* synthetic */ Object map(Object obj) {
        getExtensionFromMimeType getextensionfrommimetype = (getExtensionFromMimeType) obj;
        Intrinsics.checkNotNullParameter(getextensionfrommimetype, "oldItem");
        return new MerchantReviewTagModel(getextensionfrommimetype.getId(), getextensionfrommimetype.getDescription());
    }
}
