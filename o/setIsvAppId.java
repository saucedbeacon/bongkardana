package o;

import id.dana.data.Source;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/repository/SocialWidgetEntityRepository;", "Lid/dana/domain/social/SocialWidgetRepository;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "amcsSocialConfigData", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "getAmcsSocialConfigData", "()Lid/dana/data/config/source/ConfigEntityData;", "amcsSocialConfigData$delegate", "Lkotlin/Lazy;", "splitSocialConfigData", "getSplitSocialConfigData", "splitSocialConfigData$delegate", "getFeedHomeConfig", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/FeedHomeConfig;", "getFriendshipSyncProgressInterval", "", "isSocialFeatureEnable", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIsvAppId implements getException {
    private final Lazy amcsSocialConfigData$delegate = LazyKt.lazy(new getMax(this));
    /* access modifiers changed from: private */
    public onCallBack configEntityDataFactory;
    private final Lazy splitSocialConfigData$delegate = LazyKt.lazy(new getMin(this));

    private final AppMsgReceiver.AnonymousClass2 getAmcsSocialConfigData() {
        return (AppMsgReceiver.AnonymousClass2) this.amcsSocialConfigData$delegate.getValue();
    }

    private final AppMsgReceiver.AnonymousClass2 getSplitSocialConfigData() {
        return (AppMsgReceiver.AnonymousClass2) this.splitSocialConfigData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/FeedHomeConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<access$002, getMonitoringStatus> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            access$002 access_002 = (access$002) obj;
            Intrinsics.checkNotNullParameter(access_002, "it");
            return access_002.toFeedHomeConfig();
        }
    }

    @Inject
    public setIsvAppId(@NotNull onCallBack oncallback) {
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        this.configEntityDataFactory = oncallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<AppMsgReceiver.AnonymousClass2> {
        final /* synthetic */ setIsvAppId this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setIsvAppId setisvappid) {
            super(0);
            this.this$0 = setisvappid;
        }

        public final AppMsgReceiver.AnonymousClass2 invoke() {
            return this.this$0.configEntityDataFactory.createData("amcs");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<AppMsgReceiver.AnonymousClass2> {
        final /* synthetic */ setIsvAppId this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(setIsvAppId setisvappid) {
            super(0);
            this.this$0 = setisvappid;
        }

        public final AppMsgReceiver.AnonymousClass2 invoke() {
            return this.this$0.configEntityDataFactory.createData(Source.SPLIT);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getMonitoringStatus> getFeedHomeConfig() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.SPLIT)");
        TitleBarRightButtonView.AnonymousClass1<R> map = createData.getFeedConfig().map(setMax.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "configEntityDataFactory.…eedHomeConfig()\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialFeatureEnable() {
        AppMsgReceiver.AnonymousClass2 splitSocialConfigData = getSplitSocialConfigData();
        Intrinsics.checkNotNullExpressionValue(splitSocialConfigData, "splitSocialConfigData");
        TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialFeatureEnable = splitSocialConfigData.isSocialFeatureEnable();
        AppMsgReceiver.AnonymousClass2 amcsSocialConfigData = getAmcsSocialConfigData();
        Intrinsics.checkNotNullExpressionValue(amcsSocialConfigData, "amcsSocialConfigData");
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = isSocialFeatureEnable.onErrorResumeNext((TitleBarRightButtonView.AnonymousClass4<? extends Boolean>) amcsSocialConfigData.isSocialFeatureEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "splitSocialConfigData.is…ta.isSocialFeatureEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getFriendshipSyncProgressInterval() {
        AppMsgReceiver.AnonymousClass2 amcsSocialConfigData = getAmcsSocialConfigData();
        Intrinsics.checkNotNullExpressionValue(amcsSocialConfigData, "amcsSocialConfigData");
        TitleBarRightButtonView.AnonymousClass1<Integer> friendshipSyncProgressInterval = amcsSocialConfigData.getFriendshipSyncProgressInterval();
        Intrinsics.checkNotNullExpressionValue(friendshipSyncProgressInterval, "amcsSocialConfigData.fri…dshipSyncProgressInterval");
        return friendshipSyncProgressInterval;
    }
}
