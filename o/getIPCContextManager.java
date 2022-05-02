package o;

import id.dana.data.Source;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lid/dana/data/sendmoney/x2l/repository/SendMoneyConfigEntityRepository;", "Lid/dana/domain/sendmoney/x2l/repository/SendMoneyConfigRepository;", "configDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "splitConfigEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "getSplitConfigEntityData", "()Lid/dana/data/config/source/ConfigEntityData;", "splitConfigEntityData$delegate", "Lkotlin/Lazy;", "getSendToLinkBannerConfig", "Lio/reactivex/Observable;", "Lid/dana/domain/sendmoney/x2l/model/BannerConfig;", "getSocialLinks", "", "Lid/dana/domain/sendmoney/x2l/model/SocialLink;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getIPCContextManager implements getByteCount {
    /* access modifiers changed from: private */
    public final onCallBack configDataFactory;
    private final Lazy splitConfigEntityData$delegate = LazyKt.lazy(new getMin(this));

    private final AppMsgReceiver.AnonymousClass2 getSplitConfigEntityData() {
        return (AppMsgReceiver.AnonymousClass2) this.splitConfigEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/domain/sendmoney/x2l/model/SocialLink;", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/data/sendmoney/x2l/model/SocialLinkEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<IPCContextManager>, List<? extends fromBytes>> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return getSingletonServiceBeanManager.toSocialLinks(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/sendmoney/x2l/model/BannerConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/sendmoney/x2l/model/BannerConfigEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<IPCCallManager, fromUuid> {
        public static final setMin getMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            IPCCallManager iPCCallManager = (IPCCallManager) obj;
            Intrinsics.checkNotNullParameter(iPCCallManager, "it");
            return getSingletonIPCContextManager.toBannerConfig(iPCCallManager);
        }
    }

    @Inject
    public getIPCContextManager(@NotNull onCallBack oncallback) {
        Intrinsics.checkNotNullParameter(oncallback, "configDataFactory");
        this.configDataFactory = oncallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<AppMsgReceiver.AnonymousClass2> {
        final /* synthetic */ getIPCContextManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getIPCContextManager getipccontextmanager) {
            super(0);
            this.this$0 = getipccontextmanager;
        }

        public final AppMsgReceiver.AnonymousClass2 invoke() {
            return this.this$0.configDataFactory.createData(Source.SPLIT);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<fromUuid> getSendToLinkBannerConfig() {
        AppMsgReceiver.AnonymousClass2 splitConfigEntityData = getSplitConfigEntityData();
        Intrinsics.checkNotNullExpressionValue(splitConfigEntityData, "splitConfigEntityData");
        TitleBarRightButtonView.AnonymousClass1<R> map = splitConfigEntityData.getX2LBannerConfig().map(setMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitConfigEntityData.x2…p { it.toBannerConfig() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<fromBytes>> getSocialLinks() {
        AppMsgReceiver.AnonymousClass2 splitConfigEntityData = getSplitConfigEntityData();
        Intrinsics.checkNotNullExpressionValue(splitConfigEntityData, "splitConfigEntityData");
        TitleBarRightButtonView.AnonymousClass1<R> map = splitConfigEntityData.getX2LSocialLinks().map(setMax.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitConfigEntityData.x2…ap { it.toSocialLinks() }");
        return map;
    }
}
