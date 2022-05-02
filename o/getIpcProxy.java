package o;

import java.util.Objects;
import javax.inject.Inject;
import kotlin.Pair;
import o.GriverRVResourceManagerImpl;
import o.IPCCallManagerImpl;
import o.RemoteCallClient;
import o.TitleBarRightButtonView;
import o.b;

public class getIpcProxy extends setMinProgress implements GriverResourceManager {
    private getIpcCallManager categorizedPromoEntityMapper;
    private getServiceBeanManager categoryEntityMapper;
    private final exitApp featureConfigEntityRepository;
    private final setLocalCallRetryHandler promoCenterEntityDataFactory;
    private LocalCallManagerImpl promoEntityMapper;

    private static boolean isDistanceExceedMinimum(float f, float f2) {
        return f2 > f;
    }

    @Inject
    getIpcProxy(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, setLocalCallRetryHandler setlocalcallretryhandler, exitApp exitapp) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.promoCenterEntityDataFactory = setlocalcallretryhandler;
        this.featureConfigEntityRepository = exitapp;
    }

    /* access modifiers changed from: package-private */
    @Inject
    public void initMapperDependency(LocalCallManagerImpl localCallManagerImpl, getServiceBeanManager getservicebeanmanager, getIpcCallManager getipccallmanager) {
        this.promoEntityMapper = localCallManagerImpl;
        this.categoryEntityMapper = getservicebeanmanager;
        this.categorizedPromoEntityMapper = getipccallmanager;
    }

    public TitleBarRightButtonView.AnonymousClass1<installPackage> getCategories(int i, int i2, boolean z) {
        TitleBarRightButtonView.AnonymousClass1<transSyncThreadNames> authenticatedRequest = authenticatedRequest(createNetworkPromoCenterEntityData().getCategories(i, i2));
        ServiceBeanManagerImpl createLocalPromoCenterEntityData = createLocalPromoCenterEntityData();
        Objects.requireNonNull(createLocalPromoCenterEntityData);
        TitleBarRightButtonView.AnonymousClass1<transSyncThreadNames> onErrorReturn = authenticatedRequest.doOnNext(new RemoteCallClient.IpcCallConn(createLocalPromoCenterEntityData)).onErrorReturn(new onServiceDisconnected(this, z));
        getServiceBeanManager getservicebeanmanager = this.categoryEntityMapper;
        Objects.requireNonNull(getservicebeanmanager);
        return onErrorReturn.map(new getRemoteCaller(getservicebeanmanager));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ transSyncThreadNames lambda$getCategories$0(boolean z, Throwable th) throws Exception {
        return getCachedCategories(z);
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass3> getPromoList(int i, int i2, String str) {
        TitleBarRightButtonView.AnonymousClass1<ByteArrayPools> authenticatedRequest = authenticatedRequest(createNetworkPromoCenterEntityData().queryAllPromo(i, i2, str));
        LocalCallManagerImpl localCallManagerImpl = this.promoEntityMapper;
        Objects.requireNonNull(localCallManagerImpl);
        return authenticatedRequest.map(new resolveClass(localCallManagerImpl));
    }

    public TitleBarRightButtonView.AnonymousClass1<resourceTypeMonitor> getPromoCategorizedList(saveConfiguration saveconfiguration) {
        TitleBarRightButtonView.AnonymousClass1<UsePermission> authenticatedRequest = authenticatedRequest(createNetworkPromoCenterEntityData().queryCategorizedPromo(saveconfiguration.getCategories(), saveconfiguration.getPageSize(), saveconfiguration.getPageNumber(), saveconfiguration.getSortBy(), saveconfiguration.getFilters(), saveconfiguration.getLat(), saveconfiguration.getLon()));
        getIpcCallManager getipccallmanager = this.categorizedPromoEntityMapper;
        Objects.requireNonNull(getipccallmanager);
        return authenticatedRequest.map(new RedDotDrawable(getipccallmanager) {
            private final getIpcCallManager getMin;

            {
                this.getMin = r1;
            }

            public final Object apply(Object obj) {
                return this.getMin.apply(obj);
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass1> getPromoAds(int i, double d, double d2) {
        return TitleBarRightButtonView.AnonymousClass1.zip(getPhoneNumber(), this.featureConfigEntityRepository.getMinimumRadiusInMeter(), setIPCCallRetryHandler.getMin).switchMap(new IPCCallManagerImpl.IPCCallProxyHandler(this, i, d, d2)).map(IPCCallManagerImpl.getMin);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getPromoAds$1(int i, double d, double d2, Pair pair) throws Exception {
        return getPromoAdsWithComparedCoordinate((String) pair.getFirst(), Integer.valueOf(((Integer) pair.getSecond()).intValue()), i, d, d2);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber() {
        return createAccountData().getPhoneNumber();
    }

    private TitleBarRightButtonView.AnonymousClass1<Local> getPromoAdsWithComparedCoordinate(String str, Integer num, int i, double d, double d2) {
        return TitleBarRightButtonView.AnonymousClass1.zip(getUserLastSavedCoordinate(str), getUserCurrentAdsPageNumber(str), setIIPCManager.getMin).switchMap(new IPCCallable(this, str, d, d2, num, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getPromoAdsWithComparedCoordinate$2(String str, double d, double d2, Integer num, int i, Pair pair) throws Exception {
        return getPromoAdsObservableBasedOnDistanceThreshold(str, (RVParams) pair.getFirst(), ((Integer) pair.getSecond()).intValue(), d, d2, num, Integer.valueOf(i));
    }

    private TitleBarRightButtonView.AnonymousClass1<RVParams> getUserLastSavedCoordinate(String str) {
        return createLocalPromoCenterEntityData().getUserLastCoordinate(str);
    }

    private TitleBarRightButtonView.AnonymousClass1<Integer> getUserCurrentAdsPageNumber(String str) {
        return createLocalPromoCenterEntityData().getCurrentAdsPageNumber(str);
    }

    private TitleBarRightButtonView.AnonymousClass1<Local> getPromoAdsObservableBasedOnDistanceThreshold(String str, RVParams rVParams, int i, double d, double d2, Integer num, Integer num2) {
        String str2 = str;
        if (isDistanceExceedMinimum((float) num.intValue(), stopBluetoothDevicesDiscovery.getDistance(rVParams.getLat(), rVParams.getLon(), d, d2))) {
            return saveUserLastSavedCoordinate(str, d, d2).switchMap(new RemoteCallService(this, str2)).switchMap(new CustomCLObjectInputStream(this, num2, d, d2, num));
        }
        int i2 = i + 1;
        return getPromoAdsWithGivenCoordinate(num2.intValue(), i2, rVParams, num.intValue()).switchMap(new RemoteCallerImpl(this, str2, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getPromoAdsObservableBasedOnDistanceThreshold$3(String str, Boolean bool) throws Exception {
        return saveAdsPageNumber(str, 1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getPromoAdsObservableBasedOnDistanceThreshold$4(Integer num, double d, double d2, Integer num2, Boolean bool) throws Exception {
        return getPromoAdsWithGivenCoordinate(num.intValue(), 1, new RVParams(d, d2), num2.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getPromoAdsObservableBasedOnDistanceThreshold$6(String str, int i, Local local) throws Exception {
        if (local.getHasMore()) {
            return saveAdsPageNumber(str, i).switchMap(new registerServiceBean(local));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(local);
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserLastSavedCoordinate(String str, double d, double d2) {
        return createLocalPromoCenterEntityData().saveUserLastCoordinate(str, new RVParams(d, d2));
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> saveAdsPageNumber(String str, int i) {
        return createLocalPromoCenterEntityData().saveCurrentAdsPageNumber(str, i);
    }

    private TitleBarRightButtonView.AnonymousClass1<Local> getPromoAdsWithGivenCoordinate(int i, int i2, RVParams rVParams, int i3) {
        return authenticatedRequest(createNetworkPromoCenterEntityData().getPromoAds(i, i2, rVParams.getLat(), rVParams.getLon(), i3));
    }

    private ServiceBeanManagerImpl createNetworkPromoCenterEntityData() {
        return this.promoCenterEntityDataFactory.createData("network");
    }

    private transSyncThreadNames getCachedCategories(boolean z) {
        if (!z) {
            return createLocalPromoCenterEntityData().getCachedCategories();
        }
        return new transSyncThreadNames();
    }

    private ServiceBeanManagerImpl createLocalPromoCenterEntityData() {
        return this.promoCenterEntityDataFactory.createData("local");
    }
}
