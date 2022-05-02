package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import o.GriverAMCSAppUpdater;
import o.Pool;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public class writeShort extends setMinProgress implements GriverAMCSAppUpdater.AnonymousClass1 {
    private final DialogLayout accountEntityDataFactory;
    private final readBoolean2 missionDetailEntityMapper;
    private final writeString2 promoQuestEntityDataFactory;
    private final readShort promoQuestEntityMapper;
    private final readInt promoQuestMapper;
    private final readBytes redeemQuestEntityMapper;

    /* access modifiers changed from: private */
    public static /* synthetic */ List lambda$getMissionsWithQuest$1(List list, Object[] objArr) throws Exception {
        return list;
    }

    @Inject
    public writeShort(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, writeString2 writestring2, readShort readshort, readBoolean2 readboolean2, readInt readint, readBytes readbytes, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.accountEntityDataFactory = dialogLayout;
        this.promoQuestEntityDataFactory = writestring2;
        this.promoQuestEntityMapper = readshort;
        this.missionDetailEntityMapper = readboolean2;
        this.promoQuestMapper = readint;
        this.redeemQuestEntityMapper = readbytes;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> getMissionsWithQuest(int i, int i2) {
        TitleBarRightButtonView.AnonymousClass1<freeAll> queryActiveMissions = createPromoQuestEntityData().queryActiveMissions(i, i2);
        readShort readshort = this.promoQuestEntityMapper;
        Objects.requireNonNull(readshort);
        return authenticatedRequest(queryActiveMissions.map(new readDouble(readshort)).flatMap(new writeLong(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMissionsWithQuest$2(List list) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            queryAppAppInfos queryappappinfos = (queryAppAppInfos) it.next();
            arrayList.add(getMissionDetail(queryappappinfos.getMissionId(), false).map(new readStringList(queryappappinfos)).onErrorResumeNext(getOriginalMission(queryappappinfos)));
        }
        return TitleBarRightButtonView.AnonymousClass1.zip(arrayList, new writeFloat(list)).startWith(TitleBarRightButtonView.AnonymousClass1.just(list));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> getMissions(int i, int i2) {
        TitleBarRightButtonView.AnonymousClass1<freeAll> authenticatedRequest = authenticatedRequest(createPromoQuestEntityData().queryActiveMissions(i, i2));
        readShort readshort = this.promoQuestEntityMapper;
        Objects.requireNonNull(readshort);
        return authenticatedRequest.map(new readDouble(readshort));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> getMissionsByStatus(int i, int i2, List<String> list) {
        TitleBarRightButtonView.AnonymousClass1<freeAll> authenticatedRequest = authenticatedRequest(createPromoQuestEntityData().queryMissionListByStatus(i, i2, list));
        readShort readshort = this.promoQuestEntityMapper;
        Objects.requireNonNull(readshort);
        return authenticatedRequest.map(new readDouble(readshort));
    }

    public TitleBarRightButtonView.AnonymousClass1<queryAppAppInfos> getMissionDetail(String str, boolean z) {
        return authenticatedRequest(createPromoQuestEntityData().getMissionDetail(str, z).map(new readFloat(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ queryAppAppInfos lambda$getMissionDetail$3(getLong getlong) throws Exception {
        if (getlong.success) {
            return this.missionDetailEntityMapper.transform(getlong);
        }
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<GriverAppPreDownloadSQLiteStorage>> getMissionSummary() {
        return createAccountEntityData().getUserId().flatMap(getMissionSummaries());
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverAppInfoDBHelper> trackQuestUser(String str, String str2, boolean z) {
        return authenticatedRequest(createPromoQuestEntityData().trackUserQuest(str, str2, z).map(new readLong(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ GriverAppInfoDBHelper lambda$trackQuestUser$4(Pool.Poolable poolable) throws Exception {
        if (poolable.success) {
            return this.promoQuestMapper.transform(poolable);
        }
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverAppSQLiteStorage> redeemQuest(String str, String str2) {
        return authenticatedRequest(createPromoQuestEntityData().redeemQuest(str, str2).map(new writeDouble(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ GriverAppSQLiteStorage lambda$redeemQuest$5(RVClassLoaderFactory rVClassLoaderFactory) throws Exception {
        if (rVClassLoaderFactory.success) {
            return this.redeemQuestEntityMapper.transform(rVClassLoaderFactory);
        }
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverAppInfoPreDownloadStorage> redeemMission(String str) {
        TitleBarRightButtonView.AnonymousClass1<onInterrupt> redeemMission = createPromoQuestEntityData().redeemMission(str);
        readBytes readbytes = this.redeemQuestEntityMapper;
        Objects.requireNonNull(readbytes);
        return authenticatedRequest(redeemMission.map(new writeStringArray(readbytes)));
    }

    private RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<List<GriverAppPreDownloadSQLiteStorage>>> getMissionSummaries() {
        return new readString(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMissionSummaries$7(String str) throws Exception {
        return authenticatedRequest(createPromoQuestEntityData().getMissionSummaryResult(str).map(new readStringArray(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getMissionSummaries$6(putDouble putdouble) throws Exception {
        return this.promoQuestMapper.transform(putdouble.missionSummaries);
    }

    private setDrawDivider createAccountEntityData() {
        return this.accountEntityDataFactory.createData("local");
    }

    @NotNull
    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<queryAppAppInfos>> getOriginalMission(queryAppAppInfos queryappappinfos) {
        return new writeString(queryappappinfos);
    }

    private readStringArray2 createPromoQuestEntityData() {
        return this.promoQuestEntityDataFactory.createData("network");
    }
}
