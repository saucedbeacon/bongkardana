package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import id.dana.data.Source;
import id.dana.data.cache.CacheKey;
import id.dana.domain.feeds.model.FeedsSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class SendMtopResponse extends setMinProgress implements doUpdateVisitedHistory {
    private final onAppExit cacheFactory;
    private final onCallBack configEntityDataFactory;
    private int defaultPageSize = 5;
    private final addParameterMap deleteFeedResultMapper;
    private final onAppCreate factory;
    private final RVNativePermissionRequestManager feedsResultMapper;

    private boolean isFirstPageForGlobalFeeds(String str) {
        return str == null;
    }

    @Inject
    public SendMtopResponse(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, addParameterMap addparametermap, onAppCreate onappcreate, onAppExit onappexit, onCallBack oncallback, RVNativePermissionRequestManager rVNativePermissionRequestManager, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.deleteFeedResultMapper = addparametermap;
        this.factory = onappcreate;
        this.cacheFactory = onappexit;
        this.feedsResultMapper = rVNativePermissionRequestManager;
        this.configEntityDataFactory = oncallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<onEmbedViewDestory> getGlobalFeeds(int i, String str) {
        this.defaultPageSize = i;
        if (isFirstPageForGlobalFeeds(str)) {
            TitleBarRightButtonView.AnonymousClass1<loadApp> authenticatedRequest = authenticatedRequest(getIgrowthFeeds(i, str, new ArrayList()));
            RVNativePermissionRequestManager rVNativePermissionRequestManager = this.feedsResultMapper;
            Objects.requireNonNull(rVNativePermissionRequestManager);
            return authenticatedRequest.map(new RVNativePermissionRequestProxy(rVNativePermissionRequestManager)).doOnNext(new getRequestCode(this)).startWith(createFeedsCacheEntityData().getObject(CacheKey.HOME.FEEDS_GLOBAL, onEmbedViewDestory.class).map(ActivityHelperOnCreateFinishedPoint.setMax));
        }
        TitleBarRightButtonView.AnonymousClass1<loadApp> authenticatedRequest2 = authenticatedRequest(createFeedsEntityData().getFeeds(FeedsSource.GLOBAL, i, str));
        RVNativePermissionRequestManager rVNativePermissionRequestManager2 = this.feedsResultMapper;
        Objects.requireNonNull(rVNativePermissionRequestManager2);
        return authenticatedRequest2.map(new RVNativePermissionRequestProxy(rVNativePermissionRequestManager2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getGlobalFeeds$0(onEmbedViewDestory onembedviewdestory) throws Exception {
        onembedviewdestory.setFirstPage(true);
        createFeedsCacheEntityData().saveData(CacheKey.HOME.FEEDS_GLOBAL, onembedviewdestory);
    }

    public TitleBarRightButtonView.AnonymousClass1<onEmbedViewDestory> getUserFeeds(int i, String str) {
        TitleBarRightButtonView.AnonymousClass1<loadApp> authenticatedRequest = authenticatedRequest(createFeedsEntityData().getFeeds(FeedsSource.USER, i, str));
        RVNativePermissionRequestManager rVNativePermissionRequestManager = this.feedsResultMapper;
        Objects.requireNonNull(rVNativePermissionRequestManager);
        return authenticatedRequest.map(new RVNativePermissionRequestProxy(rVNativePermissionRequestManager));
    }

    public TitleBarRightButtonView.AnonymousClass1<getEmbedView> deleteFeeds(String str) {
        TitleBarRightButtonView.AnonymousClass1<intercept> authenticatedRequest = authenticatedRequest(createFeedsEntityData().deleteFeeds(str));
        addParameterMap addparametermap = this.deleteFeedResultMapper;
        Objects.requireNonNull(addparametermap);
        return authenticatedRequest.map(new addPermRequstCallback(addparametermap));
    }

    public TitleBarRightButtonView.AnonymousClass1<onEmbedViewDestory> getDefaultFeedFromConfig() {
        return createSplitConfigEntityData().getDefaultFeedFromConfig().map(new onActivityHelperOnCreateFinished(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ onEmbedViewDestory lambda$getDefaultFeedFromConfig$2(List list) throws Exception {
        return this.feedsResultMapper.apply(createDefaultFeedResult(convertJsonStringToListOfActivityEntity(list)));
    }

    private List<setHeaders> convertJsonStringToListOfActivityEntity(List<String> list) {
        return (List) new Gson().fromJson(list.toString(), new TypeToken<List<setHeaders>>() {
        }.getType());
    }

    private loadApp createDefaultFeedResult(List<setHeaders> list) {
        loadApp loadapp = new loadApp();
        loadapp.setHasMore(false);
        loadapp.setActivities(list);
        return loadapp;
    }

    private TitleBarRightButtonView.AnonymousClass1<loadApp> getIgrowthFeeds(int i, String str, List<setHeaders> list) {
        return createFeedsEntityData().getFeeds(FeedsSource.GLOBAL, i, str).flatMap(new onAppDestroy(this, list, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getIgrowthFeeds$3(List list, int i, loadApp loadapp) throws Exception {
        List<setHeaders> combineActivities = combineActivities(loadapp, list);
        if (needToFetchAnotherFeeds(loadapp.isHasMore(), combineActivities)) {
            return getIgrowthFeeds(i, loadapp.getMaxId(), combineActivities);
        }
        loadapp.setActivities(combineActivities);
        return TitleBarRightButtonView.AnonymousClass1.just(loadapp);
    }

    private List<setHeaders> combineActivities(loadApp loadapp, List<setHeaders> list) {
        List<setHeaders> activities = loadapp.getActivities();
        if (list != null) {
            list.addAll(activities);
        }
        return list;
    }

    private boolean needToFetchAnotherFeeds(boolean z, List list) {
        return z && isLessThanPageSize(list);
    }

    private boolean isLessThanPageSize(List<setHeaders> list) {
        return list.size() < this.defaultPageSize;
    }

    private AppDestroyPoint createFeedsEntityData() {
        return this.factory.createData("network");
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    private resolveKeyPath<onEmbedViewDestory> createFeedsCacheEntityData() {
        return this.cacheFactory.createData("local");
    }
}
