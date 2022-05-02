package o;

import id.dana.data.Source;
import id.dana.domain.bcaoneklik.model.BcaOneKlikInterceptData;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/bcaoneklik/BcaOneKlikInterceptEntityRepository;", "Lid/dana/domain/bcaoneklik/BcaOneKlikInterceptRepository;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "createConfigSplitData", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "getBcaOneKlikInterceptDataConfig", "Lio/reactivex/Observable;", "Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRepeatCount implements ReleaseWebViewPoint {
    private onCallBack setMax;

    @Inject
    public getRepeatCount(@NotNull onCallBack oncallback) {
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        this.setMax = oncallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BcaOneKlikInterceptData> getBcaOneKlikInterceptDataConfig() {
        AppMsgReceiver.AnonymousClass2 createData = this.setMax.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "createConfigSplitData()");
        TitleBarRightButtonView.AnonymousClass1<BcaOneKlikInterceptData> bcaOneKlikInterceptConfig = createData.getBcaOneKlikInterceptConfig();
        Intrinsics.checkNotNullExpressionValue(bcaOneKlikInterceptConfig, "createConfigSplitData().bcaOneKlikInterceptConfig");
        return bcaOneKlikInterceptConfig;
    }
}
