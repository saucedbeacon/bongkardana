package o;

import id.dana.data.network.ResultResponse;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/senddigitalmoney/repository/source/network/NetworkDigitalMoneyEntityData;", "Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "cardQueryNoPrefixApi", "Lid/dana/data/senddigitalmoney/repository/source/network/CardQueryNoPrefixApi;", "(Lid/dana/data/senddigitalmoney/repository/source/network/CardQueryNoPrefixApi;)V", "isCardNoPrefixEnabled", "Lio/reactivex/Observable;", "", "queryCardNoPrefix", "Lid/dana/data/senddigitalmoney/repository/model/result/CardPrefixQueryResult;", "request", "Lid/dana/data/senddigitalmoney/repository/model/request/CardPrefixQueryRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GlobalInfoRecorder implements OneShotRunnablePool {
    private final addInfo setMin;

    public final class Utils implements getAdapterPosition<RVConfigService> {
        private final b.C0007b<UpdateAppCallback> length;

        private Utils(b.C0007b<UpdateAppCallback> bVar) {
            this.length = bVar;
        }

        public static Utils setMax(b.C0007b<UpdateAppCallback> bVar) {
            return new Utils(bVar);
        }

        public final /* synthetic */ Object get() {
            return new RVConfigService(this.length.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/senddigitalmoney/repository/model/result/CardPrefixQueryResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/network/ResultResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<ResultResponse<getUserId>, getUserId> {
        public static final setMax getMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ResultResponse resultResponse = (ResultResponse) obj;
            Intrinsics.checkNotNullParameter(resultResponse, "it");
            return (getUserId) resultResponse.getResult();
        }
    }

    @Inject
    public GlobalInfoRecorder(@NotNull addInfo addinfo) {
        Intrinsics.checkNotNullParameter(addinfo, "cardQueryNoPrefixApi");
        this.setMin = addinfo;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getUserId> getMax(@NotNull SecurityUtils securityUtils) {
        Intrinsics.checkNotNullParameter(securityUtils, RequestPermissionsEvent.REQUEST);
        TitleBarRightButtonView.AnonymousClass1<R> map = this.setMin.length(securityUtils).map(setMax.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "cardQueryNoPrefixApi.que…       .map { it.result }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getMax() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }
}
