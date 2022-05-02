package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/ReferralPageConfig;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/ReferralPageConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
final class exitApp$Mean$Arithmetic<T, R> implements RedDotDrawable<AppNode.AnonymousClass5, getCurrentPageSnapshot> {
    final /* synthetic */ exitApp setMax;

    exitApp$Mean$Arithmetic(exitApp exitapp) {
        this.setMax = exitapp;
    }

    public final /* synthetic */ Object apply(Object obj) {
        AppNode.AnonymousClass5 r2 = (AppNode.AnonymousClass5) obj;
        Intrinsics.checkNotNullParameter(r2, "sourceItem");
        return (getCurrentPageSnapshot) this.setMax.referralPageConfigResultMapper.apply(r2);
    }
}
