package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.Unit;
import o.RVOpenAuthHelper;
import o.addAnimatorUpdateListener;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
final class setBizContent$FastBitmap$CoordinateSystem<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, BaseRpcResult> {
    final /* synthetic */ String getMax;
    final /* synthetic */ String setMax;
    final /* synthetic */ setBizContent setMin;

    setBizContent$FastBitmap$CoordinateSystem(setBizContent setbizcontent, String str, String str2) {
        this.setMin = setbizcontent;
        this.getMax = str;
        this.setMax = str2;
    }

    public final /* synthetic */ Object processFacade(Object obj) {
        RVOpenAuthHelper.AnonymousClass3 r0 = new RVOpenAuthHelper.AnonymousClass3(this.getMax, this.setMax);
        r0.envInfo = this.setMin.generateMobileEnvInfo();
        Unit unit = Unit.INSTANCE;
        return ((AuthSkipRequestModel) obj).reportFeedComment(r0);
    }
}
