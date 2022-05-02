package o;

import id.dana.data.Source;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/nearbysearch/repository/NearbySearchEntityRepository;", "Lid/dana/domain/nearbysearch/repository/NearbySearchRepository;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "createConfigSplitEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "getTrendingKeyword", "Lio/reactivex/Observable;", "", "Lid/dana/domain/nearbysearch/model/NearbyTrendingKeyword;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setEventId implements localIdToUrl {
    private final onCallBack length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/nearbysearch/model/NearbyTrendingKeyword;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/NearbyConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<AppNode.AnonymousClass12, List<? extends isFolder>> {
        public static final getMin length = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppNode.AnonymousClass12 r2 = (AppNode.AnonymousClass12) obj;
            Intrinsics.checkNotNullParameter(r2, "it");
            return r2.toNearbyConfig().getTrendingKeyword();
        }
    }

    @Inject
    public setEventId(@NotNull onCallBack oncallback) {
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        this.length = oncallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<isFolder>> getTrendingKeyword() {
        AppMsgReceiver.AnonymousClass2 createData = this.length.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.SPLIT)");
        TitleBarRightButtonView.AnonymousClass1<R> map = createData.getNearbyConfig().map(getMin.length);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…onfig().trendingKeyword }");
        return map;
    }
}
