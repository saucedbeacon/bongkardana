package o;

import id.dana.data.cache.CacheKey;
import id.dana.data.content.SpaceCode;
import id.dana.data.content.mapper.SpaceResultMapper;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class setIncludeFiles extends setMinProgress implements getSansSerifFontFamily {
    private final getTabBar contentDeliveryCacheEntityDataFactory;
    private final getFontBar contentDeliveryEntityDataFactory;
    private final error exploreDanaPreferencesDataFactory;
    private final SpaceResultMapper spaceResultMapper;

    @Inject
    public setIncludeFiles(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getFontBar getfontbar, error error, getTabBar gettabbar, SpaceResultMapper spaceResultMapper2, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.contentDeliveryEntityDataFactory = getfontbar;
        this.exploreDanaPreferencesDataFactory = error;
        this.contentDeliveryCacheEntityDataFactory = gettabbar;
        this.spaceResultMapper = spaceResultMapper2;
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getExploreDana() {
        TitleBarRightButtonView.AnonymousClass1<setNodeId> startWith = authenticatedRequest(createContentDelivery().get(SpaceCode.EXPLORE_DANA)).doOnNext(new getStartupParams(this)).startWith(createCacheContentDelivery().getObject(CacheKey.HOME.CDP_EXPLORE, setNodeId.class));
        SpaceResultMapper spaceResultMapper2 = this.spaceResultMapper;
        Objects.requireNonNull(spaceResultMapper2);
        return startWith.map(new RVMonitor(spaceResultMapper2)).flatMap(new event(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getExploreDana$0(setNodeId setnodeid) throws Exception {
        createCacheContentDelivery().saveData(CacheKey.HOME.CDP_EXPLORE, setnodeid);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getExploreDana$2(GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) throws Exception {
        return createExploreDanaData().checkExploreDanaPreferences(griverAMCSLiteAppUpdater.getCdpContents()).map(new behavior(griverAMCSLiteAppUpdater));
    }

    private isTaskRoot createContentDelivery() {
        return this.contentDeliveryEntityDataFactory.createData("network");
    }

    private resolveKeyPath<setNodeId> createCacheContentDelivery() {
        return this.contentDeliveryCacheEntityDataFactory.createData("local");
    }

    private flowLog createExploreDanaData() {
        return this.exploreDanaPreferencesDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setReadExploreDanaItem(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(765988272, oncanceled);
            onCancelLoad.getMin(765988272, oncanceled);
        }
        return createExploreDanaData().setReadDanaPreferences(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setDismissAll(List<String> list) {
        return createExploreDanaData().setDismissAll(list);
    }
}
