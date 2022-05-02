package o;

import com.alibaba.griver.core.model.applist.FetchAppInfo;
import com.alibaba.griver.core.model.applist.FetchAppsResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/miniprogram/source/network/NetworkMiniPrograms;", "Lid/dana/data/miniprogram/source/MiniProgramEntityData;", "()V", "mpPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "Lid/dana/data/miniprogram/provider/model/DeeplinkServiceModel;", "kotlin.jvm.PlatformType", "getMiniProgramScenario", "getMiniPrograms", "Lio/reactivex/Observable;", "", "Lid/dana/data/miniprogram/model/MiniProgramEntity;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getEngine {
    @NotNull
    public static final length setMin = new length((byte) 0);
    public final IComponent<getBackPerform> length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/data/miniprogram/model/MiniProgramEntity;", "kotlin.jvm.PlatformType", "it", "Lcom/alibaba/griver/core/model/applist/FetchAppsResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<FetchAppsResult, List<? extends createEngineRouter>> {
        public static final setMin getMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            FetchAppsResult fetchAppsResult = (FetchAppsResult) obj;
            Intrinsics.checkNotNullParameter(fetchAppsResult, "it");
            List<FetchAppInfo> list = fetchAppsResult.appInfoList;
            Intrinsics.checkNotNullExpressionValue(list, "it.appInfoList");
            Iterable<FetchAppInfo> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (FetchAppInfo fetchAppInfo : iterable) {
                Intrinsics.checkNotNullExpressionValue(fetchAppInfo, "app");
                Intrinsics.checkNotNullParameter(fetchAppInfo, "$this$toMiniProgramEntity");
                String appId = fetchAppInfo.getAppId();
                Intrinsics.checkNotNullExpressionValue(appId, "appId");
                String appName = fetchAppInfo.getAppName();
                Intrinsics.checkNotNullExpressionValue(appName, "appName");
                String appSlogan = fetchAppInfo.getAppSlogan();
                Intrinsics.checkNotNullExpressionValue(appSlogan, "appSlogan");
                String iconUrl = fetchAppInfo.getIconUrl();
                Intrinsics.checkNotNullExpressionValue(iconUrl, "iconUrl");
                arrayList.add(new createEngineRouter(appId, appName, appSlogan, iconUrl));
            }
            return (List) arrayList;
        }
    }

    @Inject
    public getEngine() {
        IComponent<getBackPerform> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<DeeplinkServiceModel>()");
        this.length = max;
    }

    @NotNull
    public static TitleBarRightButtonView.AnonymousClass1<List<createEngineRouter>> length() {
        TitleBarRightButtonView.AnonymousClass1<List<createEngineRouter>> map = TitleBarRightButtonView.AnonymousClass1.create(getMin.length).map(setMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "Observable.create<FetchA…toMiniProgramEntity() } }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "Lcom/alibaba/griver/core/model/applist/FetchAppsResult;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<FetchAppsResult> {
        public static final getMin length = new getMin();

        getMin() {
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.AnonymousClass2<FetchAppsResult> r3) {
            Intrinsics.checkNotNullParameter(r3, "it");
            WindowBridgeExtension.AnonymousClass1.setMax((Function1) new Function1<FetchAppsResult, Unit>() {
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FetchAppsResult) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FetchAppsResult fetchAppsResult) {
                    Intrinsics.checkNotNullParameter(fetchAppsResult, "result");
                    r3.onNext(fetchAppsResult);
                }
            }, (Function2) new Function2<Integer, String, Unit>() {
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).intValue(), (String) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i, @Nullable String str) {
                    r3.onError(new Exception(str));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/miniprogram/source/network/NetworkMiniPrograms$Companion;", "", "()V", "MAX_ITEMS", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
