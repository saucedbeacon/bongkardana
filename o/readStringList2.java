package o;

import id.dana.data.constant.BranchLinkConstant;
import id.dana.domain.promoquest.model.PrizeType;
import id.dana.promoquest.handler.PromoQuestRedirectType;
import id.dana.promoquest.model.QuestActionType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Action;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u0003\u0018\u0000 M2\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J9\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010&\u001a\u00020'H\u0002¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0002J!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00101\u001a\u00020 H\u0002J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020*052\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u00020 H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\r052\u0006\u00108\u001a\u00020\u0012H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J&\u0010:\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\u00040\u0004052\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0016J,\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0004052\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016J\u0010\u0010A\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010B\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010D\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010F\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010G\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010000052\u0006\u0010#\u001a\u00020\u0012H\u0016J&\u0010H\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010303052\u0006\u0010#\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0016J\"\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00122\u0006\u0010L\u001a\u00020 H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X.¢\u0006\u0004\n\u0002\u0010\u0013R.\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0016`\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006N"}, d2 = {"Lid/dana/data/promoquest/repository/source/mock/MockPromoQuestEntityData;", "Lid/dana/data/promoquest/repository/source/PromoQuestEntityData;", "()V", "activeMissions", "Lid/dana/data/promoquest/repository/source/network/result/ListOfMissionResult;", "getActiveMissions", "()Lid/dana/data/promoquest/repository/source/network/result/ListOfMissionResult;", "listOfSummary", "", "Lid/dana/data/promoquest/repository/source/network/result/MissionSummaryResult;", "getListOfSummary", "()Ljava/util/List;", "listOfSummaryResult", "Lid/dana/data/promoquest/repository/source/network/result/ListOfMissionSummaryResult;", "getListOfSummaryResult", "()Lid/dana/data/promoquest/repository/source/network/result/ListOfMissionSummaryResult;", "missionIds", "", "", "[Ljava/lang/String;", "missionMap", "Ljava/util/HashMap;", "Lid/dana/data/promoquest/repository/source/network/result/MissionEntityResult;", "Lkotlin/collections/HashMap;", "pastMissions", "getPastMissions", "summaryResult", "getSummaryResult", "()Lid/dana/data/promoquest/repository/source/network/result/MissionSummaryResult;", "activeQuest", "Lid/dana/data/promoquest/repository/source/network/result/QuestEntityResult;", "isHasPrize", "", "completedQuest", "createMissionEntityResult", "missionId", "missionState", "missionTypes", "missionExpireTime", "Ljava/util/Date;", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/util/Date;)Lid/dana/data/promoquest/repository/source/network/result/MissionEntityResult;", "generateListOfQuest", "Lid/dana/data/promoquest/repository/source/network/result/MissionDetailResult;", "generateMissionEntities", "([Ljava/lang/String;)Ljava/util/List;", "generateMissionIds", "", "generateRedeemMissionResult", "Lid/dana/data/promoquest/repository/source/network/result/RedeemUserMissionResult;", "isSuccess", "generateRedeemQuestResult", "Lid/dana/data/promoquest/repository/source/network/result/RedeemQuestEntityResult;", "getMissionDetail", "Lio/reactivex/Observable;", "withMissionInfo", "getMissionSummaryResult", "userId", "lockedQuest", "queryActiveMissions", "kotlin.jvm.PlatformType", "pageSize", "", "pageNumber", "queryMissionListByStatus", "listOfStatus", "questActive", "questCompleted", "questFinished", "questOpenChangeEmail", "questOpenMoreSetting", "questOpenSecurityQuestion", "redeemMission", "redeemQuest", "questId", "trackUserQuest", "", "autoRedeem", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class readStringList2 implements readStringArray2 {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    private static final int MOCKED_LIST_SIZE = 20;
    private static int currentMockMissionSummary;
    private String[] missionIds;
    private final HashMap<String, getClassLoader> missionMap = new HashMap<>();

    @Nullable
    public final Void trackUserQuest(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        Intrinsics.checkNotNullParameter(str2, "questId");
        return null;
    }

    public readStringList2() {
        generateMissionIds();
    }

    private final void generateMissionIds() {
        Random random = new Random();
        String[] strArr = new String[20];
        for (int i = 0; i < 20; i++) {
            String obj = new BigInteger(256, random).toString();
            Intrinsics.checkNotNullExpressionValue(obj, "BigInteger(256, random).toString()");
            strArr[i] = obj;
        }
        this.missionIds = strArr;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<freeAll> queryMissionListByStatus(int i, int i2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "listOfStatus");
        if (Intrinsics.areEqual((Object) list.get(0), (Object) "ACTIVE")) {
            TitleBarRightButtonView.AnonymousClass1<freeAll> just = TitleBarRightButtonView.AnonymousClass1.just(getActiveMissions());
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(activeMissions)");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<freeAll> just2 = TitleBarRightButtonView.AnonymousClass1.just(getPastMissions());
        Intrinsics.checkNotNullExpressionValue(just2, "Observable.just(pastMissions)");
        return just2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<freeAll> queryActiveMissions(int i, int i2) {
        TitleBarRightButtonView.AnonymousClass1<freeAll> just = TitleBarRightButtonView.AnonymousClass1.just(getActiveMissions());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n        activeMissions)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getLong> getMissionDetail(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        TitleBarRightButtonView.AnonymousClass1<getLong> just = TitleBarRightButtonView.AnonymousClass1.just(generateListOfQuest());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(generateListOfQuest())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<putDouble> getMissionSummaryResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        TitleBarRightButtonView.AnonymousClass1<putDouble> just = TitleBarRightButtonView.AnonymousClass1.just(getListOfSummaryResult());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(listOfSummaryResult)");
        return just;
    }

    private final freeAll getPastMissions() {
        freeAll freeall = new freeAll();
        freeall.success = true;
        freeall.setMissionInfoList(generateMissionEntities(new String[]{"FINISH", "CLOSE"}));
        return freeall;
    }

    private final freeAll getActiveMissions() {
        freeAll freeall = new freeAll();
        freeall.success = true;
        freeall.setMissionInfoList(generateMissionEntities(new String[]{"ACTIVE", "COMPLETE"}));
        return freeall;
    }

    private final getLong generateListOfQuest() {
        getLong getlong = new getLong();
        getlong.success = true;
        Calendar instance = Calendar.getInstance();
        instance.add(5, setEntryInfo.randomInt());
        String randomString = setEntryInfo.randomString();
        Intrinsics.checkNotNullExpressionValue(randomString, "randomString()");
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        getlong.setMissionInfo(createMissionEntityResult(randomString, new String[]{"FINISH", "CLOSE"}, new String[]{"FLEXIBLE", "NORMAL"}, time));
        boolean randomBoolean = setEntryInfo.randomBoolean();
        getlong.setQuestInfoList(CollectionsKt.mutableListOf(questFinished(randomBoolean), questCompleted(randomBoolean), questActive(randomBoolean), lockedQuest(randomBoolean)));
        return getlong;
    }

    private final getClassLoader createMissionEntityResult(String str, String[] strArr, String[] strArr2, Date date) {
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        getClassLoader getclassloader = r2;
        getClassLoader getclassloader2 = new getClassLoader((String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (String) null, (String) null, false, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
        getclassloader.setMissionId(str);
        getclassloader.setMissionActiveImage("https://a.m.dana.id/danaweb/promo/1577092509-New-Register-480x270pxl.png");
        getclassloader.setMissionFinishImage("https://a.m.dana.id/danaweb/promo/1577092509-New-Register-480x270pxl.png");
        getclassloader.setMissionDescription("Desc - ".concat(String.valueOf(str)));
        getclassloader.setMissionStatus(strArr3[setEntryInfo.randomInt(strArr3.length)]);
        getclassloader.setMissionExpireTime(date);
        getclassloader.setMissionName("Name - ".concat(String.valueOf(str)));
        getclassloader.setMissionThumbnail("https://a.m.dana.id/danaweb/promo/1577092509-New-Register-480x270pxl.png");
        getclassloader.setHasPrize(setEntryInfo.randomBoolean());
        String[] strArr5 = strArr2;
        getclassloader.setMissionType(strArr5[setEntryInfo.randomInt(strArr5.length)]);
        return getclassloader;
    }

    private final List<getClassLoader> generateMissionEntities(String[] strArr) {
        ArrayList arrayList = new ArrayList(20);
        String[] strArr2 = {"FLEXIBLE", "NORMAL"};
        for (int i = 0; i < 20; i++) {
            Calendar instance = Calendar.getInstance();
            instance.add(5, i);
            String valueOf = String.valueOf(i);
            Intrinsics.checkNotNullExpressionValue(instance, "calendar");
            Date time = instance.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
            getClassLoader createMissionEntityResult = createMissionEntityResult(valueOf, strArr, strArr2, time);
            arrayList.add(createMissionEntityResult);
            Map map = this.missionMap;
            String[] strArr3 = this.missionIds;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionIds");
            }
            map.put(strArr3[i], createMissionEntityResult);
        }
        return arrayList;
    }

    private final putDouble getListOfSummaryResult() {
        putDouble putdouble = new putDouble();
        putdouble.success = true;
        putdouble.missionSummaries = getListOfSummary();
        return putdouble;
    }

    private final List<getFree> getListOfSummary() {
        return CollectionsKt.mutableListOf(getSummaryResult());
    }

    private final getFree getSummaryResult() {
        DefaultClassLoaderFactory defaultClassLoaderFactory;
        getFree getfree = new getFree();
        getfree.setMissionId("20190327111511587540011000166390701021100");
        Calendar instance = Calendar.getInstance();
        instance.add(5, 2);
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        getfree.setMissionExpireTime(instance.getTime());
        getfree.setMissionStatus("ACTIVE");
        getfree.setMissionThumbnail("https://a.m.dana.id/resource/imgs/skywalker/promoquest/PromoQuest_MissionImage_Small.png");
        if (currentMockMissionSummary == 3) {
            currentMockMissionSummary = 0;
        }
        currentMockMissionSummary++;
        boolean randomBoolean = setEntryInfo.randomBoolean();
        int i = currentMockMissionSummary;
        if (i == 1) {
            defaultClassLoaderFactory = questFinished(randomBoolean);
        } else if (i != 2) {
            defaultClassLoaderFactory = questActive(randomBoolean);
        } else {
            defaultClassLoaderFactory = questCompleted(randomBoolean);
        }
        getfree.setActiveQuest(defaultClassLoaderFactory);
        return getfree;
    }

    private final DefaultClassLoaderFactory questFinished(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("1 - This is desc");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390701021101");
        defaultClassLoaderFactory.setQuestName("Topup your Balance");
        defaultClassLoaderFactory.setQuestRedirectType("INNER_URL");
        defaultClassLoaderFactory.setQuestRedirectValue("/m/mobilerecharge");
        defaultClassLoaderFactory.setQuestStatus("FINISH");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory questCompleted(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("2 - This is desc");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390701021102");
        defaultClassLoaderFactory.setQuestName("Buy a Pulsa");
        defaultClassLoaderFactory.setQuestRedirectType(PromoQuestRedirectType.SERVICES);
        defaultClassLoaderFactory.setQuestRedirectValue("Water,Installment,Cable TV,Telephone,BPJS,School,Electricity,Insurance,Internet,Mobile Postpaid");
        defaultClassLoaderFactory.setQuestStatus("COMPLETE");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory questActive(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("3 - this is desc");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390701021103");
        defaultClassLoaderFactory.setQuestName("3 - this quest name");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://a.m.dana.id/promo/news/Bayar_pakai_DANA.html");
        defaultClassLoaderFactory.setQuestStatus("ACTIVE");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory questOpenSecurityQuestion(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("4 - this is desc");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390781021103");
        defaultClassLoaderFactory.setQuestName("[test] setting_security_questions");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://bw93.test-app.link/setting-more?params=[setting=setting_security_questions]");
        defaultClassLoaderFactory.setQuestStatus("FINISH");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory questOpenChangeEmail(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("5 - this is desc");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390781021103");
        defaultClassLoaderFactory.setQuestName("[test] setting_change_email");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://bw93.test-app.link/setting-more?params=[setting=setting_change_email]");
        defaultClassLoaderFactory.setQuestStatus("FINISH");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory questOpenMoreSetting(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("6 - this is desc");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390781021103");
        defaultClassLoaderFactory.setQuestName("[test] Setting More");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://bw93.test-app.link/setting-more");
        defaultClassLoaderFactory.setQuestStatus("FINISH");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory lockedQuest(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("This is locked quest");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390701021104");
        defaultClassLoaderFactory.setQuestName("This is locked quest");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://a.m.dana.id/promo/news/Bayar_pakai_DANA.html");
        defaultClassLoaderFactory.setQuestStatus("INIT");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory completedQuest(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("Desc: This is completed quest.");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390701021105");
        defaultClassLoaderFactory.setQuestName("Name: This is completed quest");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://a.m.dana.id/promo/news/Bayar_pakai_DANA.html");
        defaultClassLoaderFactory.setQuestStatus("COMPLETE");
        return defaultClassLoaderFactory;
    }

    private final DefaultClassLoaderFactory activeQuest(boolean z) {
        DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
        defaultClassLoaderFactory.setHasPrize(z);
        defaultClassLoaderFactory.setQuestActionType(QuestActionType.GO);
        defaultClassLoaderFactory.setQuestDescription("Desc: This is active quest.");
        defaultClassLoaderFactory.setQuestId("2019032711151140011000166390701021109");
        defaultClassLoaderFactory.setQuestName("Name: This is active quest");
        defaultClassLoaderFactory.setQuestRedirectType("URL");
        defaultClassLoaderFactory.setQuestRedirectValue("https://a.m.dana.id/promo/news/Bayar_pakai_DANA.html");
        defaultClassLoaderFactory.setQuestStatus("ACTIVE");
        return defaultClassLoaderFactory;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RVClassLoaderFactory> redeemQuest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        Intrinsics.checkNotNullParameter(str2, "questId");
        TitleBarRightButtonView.AnonymousClass1<RVClassLoaderFactory> just = TitleBarRightButtonView.AnonymousClass1.just(generateRedeemQuestResult(setEntryInfo.randomBoolean()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …tResult(randomBoolean()))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onInterrupt> redeemMission(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        TitleBarRightButtonView.AnonymousClass1<onInterrupt> just = TitleBarRightButtonView.AnonymousClass1.just(generateRedeemMissionResult(setEntryInfo.randomBoolean()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(generate…        randomBoolean()))");
        return just;
    }

    private final onInterrupt generateRedeemMissionResult(boolean z) {
        onInterrupt oninterrupt = new onInterrupt();
        oninterrupt.success = z;
        Action.Complete complete = new Action.Complete();
        complete.setPrizeId("2019032711151140011000167790701021199");
        complete.setPrizeMoneyAmount(registerWorker.getDefault());
        complete.setVoucherId("123");
        complete.setPrizeType(PrizeType.CASHBACK);
        complete.setVoucherName("Sample Voucher Name");
        Unit unit = Unit.INSTANCE;
        oninterrupt.setPrizeInfoList(CollectionsKt.mutableListOf(complete));
        return oninterrupt;
    }

    private final RVClassLoaderFactory generateRedeemQuestResult(boolean z) {
        RVClassLoaderFactory rVClassLoaderFactory = new RVClassLoaderFactory();
        rVClassLoaderFactory.success = z;
        Action.Complete complete = new Action.Complete();
        complete.setPrizeId("2019032711151140011000167790701021109");
        complete.setPrizeMoneyAmount(registerWorker.getDefault());
        complete.setVoucherId("123");
        complete.setPrizeType(PrizeType.CASHBACK);
        complete.setVoucherName("Sample Voucher Name");
        Unit unit = Unit.INSTANCE;
        rVClassLoaderFactory.setPrizeInfoList(CollectionsKt.mutableListOf(complete));
        return rVClassLoaderFactory;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/promoquest/repository/source/mock/MockPromoQuestEntityData$Companion;", "", "()V", "MOCKED_LIST_SIZE", "", "currentMockMissionSummary", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
