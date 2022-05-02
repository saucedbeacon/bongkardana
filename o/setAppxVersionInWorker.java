package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/ott/repository/OttEntityRepository;", "Lid/dana/domain/ott/repository/OttRepository;", "ottEntityDataFactory", "Lid/dana/data/ott/repository/source/OttEntityDataFactory;", "(Lid/dana/data/ott/repository/source/OttEntityDataFactory;)V", "createOttData", "Lid/dana/data/ott/repository/source/OttEntityData;", "getOttVerify", "Lio/reactivex/Observable;", "Lid/dana/domain/ott/OttVerifyResult;", "ottValue", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppxVersionInWorker implements containsRelativeParentPath {
    private final sendPushCallBack getMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/ott/OttVerifyResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/ott/OttVerifyEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<isPrestarted, StartupParamsUtils> {
        public static final getMax getMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            isPrestarted isprestarted = (isPrestarted) obj;
            Intrinsics.checkNotNullParameter(isprestarted, "it");
            Intrinsics.checkNotNullParameter(isprestarted, "$this$toOttVerifyResult");
            return new StartupParamsUtils(isprestarted.getUserId(), isprestarted.getMerchantId(), isprestarted.getNeedLogout(), isprestarted.getMobileNo());
        }
    }

    @Inject
    public setAppxVersionInWorker(@NotNull sendPushCallBack sendpushcallback) {
        Intrinsics.checkNotNullParameter(sendpushcallback, "ottEntityDataFactory");
        this.getMax = sendpushcallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<StartupParamsUtils> getOttVerify(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "ottValue");
        sendPushCallBack sendpushcallback = this.getMax;
        TitleBarRightButtonView.AnonymousClass1<R> map = new getLogTag(sendpushcallback.getMax, sendpushcallback.getMin, sendpushcallback.setMin, sendpushcallback.setMax).setMax(str).map(getMax.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "createOttData().getOttVe…p{it.toOttVerifyResult()}");
        return map;
    }
}
