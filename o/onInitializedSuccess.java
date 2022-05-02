package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.offlinemerchant.model.OfflineOnlineMerchantInfoModel;
import id.dana.richview.imageview.ImageWithHorizontalDescriptionView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Lid/dana/globalsearch/onlinemerchant/adapter/OnlineMerchantItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setDataToView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onInitializedSuccess extends Ignore<PaySearchInfoModel> {
    public final /* synthetic */ void setMax(Object obj) {
        ImageWithHorizontalDescriptionView imageWithHorizontalDescriptionView;
        PaySearchInfoModel paySearchInfoModel = (PaySearchInfoModel) obj;
        if (paySearchInfoModel != null && (imageWithHorizontalDescriptionView = (ImageWithHorizontalDescriptionView) this.itemView.findViewById(resetInternal.setMax.dispatchSubMenuSelected)) != null) {
            imageWithHorizontalDescriptionView.showImage(paySearchInfoModel.getLogo());
            imageWithHorizontalDescriptionView.setTitleText(paySearchInfoModel.getName());
            OfflineOnlineMerchantInfoModel offlineOnlineMerchantInfoModel = (OfflineOnlineMerchantInfoModel) setBridgeManifests.length(paySearchInfoModel.getInfo(), OfflineOnlineMerchantInfoModel.class);
            if (offlineOnlineMerchantInfoModel.isVerified()) {
                Context context = imageWithHorizontalDescriptionView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                Drawable max = startBeaconDiscovery.getMax(context, R.drawable.ic_verify_blue);
                Intrinsics.checkNotNull(max);
                imageWithHorizontalDescriptionView.setTitleBadge(max);
            } else if (offlineOnlineMerchantInfoModel.isKyb()) {
                Context context2 = imageWithHorizontalDescriptionView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                Drawable max2 = startBeaconDiscovery.getMax(context2, R.drawable.ic_dana_bisnis_blue);
                Intrinsics.checkNotNull(max2);
                imageWithHorizontalDescriptionView.setTitleBadgeWithVector(max2);
            } else {
                imageWithHorizontalDescriptionView.setFirstLineBadgeGone();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onInitializedSuccess(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_search_result, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
