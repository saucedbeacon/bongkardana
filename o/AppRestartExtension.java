package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.domain.feeds.model.FeedsSource;
import javax.inject.Inject;
import o.GriverAppXInterceptor;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;

public class AppRestartExtension extends setRepeatCount<registerBizHandler> implements setTransparentTitle {
    private final onAppCreate feedsEntityDataFactory;
    private final needCheckDslError notificationCenterEntityDataFactory;
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;
    private final UpdateAppCallback splitFacade;

    @Inject
    public AppRestartExtension(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, onAppCreate onappcreate, GriverAppXInterceptor.AnonymousClass1 r6, needCheckDslError needcheckdslerror, UpdateAppCallback updateAppCallback) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        this.feedsEntityDataFactory = onappcreate;
        this.promotionRepository = r6;
        this.notificationCenterEntityDataFactory = needcheckdslerror;
        this.splitFacade = updateAppCallback;
    }

    private static void subscribe(GriverProgressBar<? super flushMessages> griverProgressBar) {
        griverProgressBar.onNext(null);
    }

    public Class<registerBizHandler> getFacadeClass() {
        return registerBizHandler.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<flushMessages> getHomeInfo() {
        removeToken removetoken = new removeToken();
        removetoken.envInfo = generateMobileEnvInfo();
        return wrapper(new addAnimatorUpdateListener.getMax(removetoken) {
            private final removeToken getMin;

            {
                this.getMin = r1;
            }

            public final Object processFacade(Object obj) {
                return ((registerBizHandler) obj).getHomeInfo(this.getMin);
            }
        }).doOnNext(new unRegisterBizHandler(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getHomeInfo$1(flushMessages flushmessages) throws Exception {
        String str;
        if (TextUtils.isEmpty(flushmessages.paylaterChannel)) {
            str = "0";
        } else {
            str = flushmessages.paylaterChannel;
        }
        UpdateAppCallback.getMin("paylater_channel", str);
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcServerUtils> getUpdatedHomeData(int i, String str) {
        return TitleBarRightButtonView.AnonymousClass1.zip(getHomeInfoNewThread(), getHomePromotionBannerNewThread(), getHasNewNotificationNewThread(), manualPreCreateApp.setMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IpcServerUtils lambda$getUpdatedHomeData$2(flushMessages flushmessages, GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater, ResourceResponsePoint resourceResponsePoint) throws Exception {
        IpcServerUtils ipcServerUtils = new IpcServerUtils();
        ipcServerUtils.setHomeInfoResult(flushmessages);
        ipcServerUtils.setSpace(griverAMCSLiteAppUpdater);
        ipcServerUtils.setHasNewResult(resourceResponsePoint);
        return ipcServerUtils;
    }

    private TitleBarRightButtonView.AnonymousClass1<flushMessages> getHomeInfoNewThread() {
        return getHomeInfo().onErrorReturnItem(new flushMessages()).subscribeOn(getSecureSignatureComp.length());
    }

    private TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getHomePromotionBannerNewThread() {
        return this.promotionRepository.getHomePromotionBanner().onErrorReturnItem(new GriverAMCSLiteAppUpdater()).subscribeOn(getSecureSignatureComp.length());
    }

    private TitleBarRightButtonView.AnonymousClass1<loadApp> getFeedsNewThread(int i, String str) {
        return createFeedData().getFeeds(FeedsSource.GLOBAL, i, str).onErrorReturnItem(new loadApp()).subscribeOn(getSecureSignatureComp.length());
    }

    private TitleBarRightButtonView.AnonymousClass1<ResourceResponsePoint> getHasNewNotificationNewThread() {
        return createNotificationCenterData().hasNew().flatMap(manualStartApp.length).onErrorReturnItem(new ResourceResponsePoint()).subscribeOn(getSecureSignatureComp.length());
    }

    private AppDestroyPoint createFeedData() {
        return this.feedsEntityDataFactory.createData("network");
    }

    private checkDslErrorAndExit createNotificationCenterData() {
        return this.notificationCenterEntityDataFactory.createData("network");
    }
}
