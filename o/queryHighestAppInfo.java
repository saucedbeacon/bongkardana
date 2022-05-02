package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAMCSAppUpdater;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u0003H\u0002J&\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/promoquest/model/Mission;", "Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus$Params;", "promoQuestRepository", "Lid/dana/domain/promoquest/respository/PromoQuestRepository;", "(Lid/dana/domain/promoquest/respository/PromoQuestRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "getMissionDetail", "Lid/dana/domain/promoquest/model/Quest;", "missionId", "", "addQuest", "withQuest", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class queryHighestAppInfo extends APWebChromeClient<List<? extends queryAppAppInfos>, getMax> {
    private final GriverAMCSAppUpdater.AnonymousClass1 promoQuestRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/promoquest/model/Quest;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/promoquest/model/Mission;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<queryAppAppInfos, List<? extends GriverAppInfoStorage>> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            queryAppAppInfos queryappappinfos = (queryAppAppInfos) obj;
            Intrinsics.checkNotNullParameter(queryappappinfos, "it");
            return queryappappinfos.getQuestList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lid/dana/domain/promoquest/model/Mission;", "kotlin.jvm.PlatformType", "quest", "", "Lid/dana/domain/promoquest/model/Quest;", "apply", "id/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus$addQuest$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<? extends GriverAppInfoStorage>, queryAppAppInfos> {
        final /* synthetic */ queryHighestAppInfo getMin;
        final /* synthetic */ queryAppAppInfos length;

        setMax(queryHighestAppInfo queryhighestappinfo, queryAppAppInfos queryappappinfos) {
            this.getMin = queryhighestappinfo;
            this.length = queryappappinfos;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "quest");
            this.length.setQuestList(list);
            return this.length;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001aJ\u0012\u001e\b\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0002 \u0004*$\u0012\u001e\b\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/domain/promoquest/model/Mission;", "kotlin.jvm.PlatformType", "missions", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<? extends queryAppAppInfos>, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends queryAppAppInfos>>> {
        final /* synthetic */ queryHighestAppInfo setMin;

        setMin(queryHighestAppInfo queryhighestappinfo) {
            this.setMin = queryhighestappinfo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "missions");
            Iterable<queryAppAppInfos> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (queryAppAppInfos access$addQuest : iterable) {
                arrayList.add(this.setMin.addQuest(access$addQuest));
            }
            return TitleBarRightButtonView.AnonymousClass1.zip((List) arrayList, new RedDotDrawable<Object[], List<? extends queryAppAppInfos>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Intrinsics.checkNotNullParameter((Object[]) obj, "it");
                    return list;
                }
            }).startWith(TitleBarRightButtonView.AnonymousClass1.just(list));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public queryHighestAppInfo(@NotNull GriverAMCSAppUpdater.AnonymousClass1 r3) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(r3, "promoQuestRepository");
        this.promoQuestRepository = r3;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> missionsByStatus = this.promoQuestRepository.getMissionsByStatus(getmax.getPageSize$domain_release(), getmax.getPageNumber$domain_release(), getmax.getListOfStatus$domain_release());
        Intrinsics.checkNotNullExpressionValue(missionsByStatus, "promoQuestRepository.get…ber, params.listOfStatus)");
        return withQuest(missionsByStatus);
    }

    private final TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> withQuest(TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> r2) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = r2.flatMap(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "flatMap { missions ->\n  …just(missions))\n        }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<queryAppAppInfos> addQuest(queryAppAppInfos queryappappinfos) {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext;
        String missionId = queryappappinfos.getMissionId();
        if (missionId != null && (onErrorResumeNext = getMissionDetail(missionId).map(new setMax(this, queryappappinfos)).onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(queryappappinfos))) != null) {
            return onErrorResumeNext;
        }
        TitleBarRightButtonView.AnonymousClass1<queryAppAppInfos> just = TitleBarRightButtonView.AnonymousClass1.just(queryappappinfos);
        Intrinsics.checkNotNullExpressionValue(just, "run {\n            Observable.just(this)\n        }");
        return just;
    }

    private final TitleBarRightButtonView.AnonymousClass1<List<GriverAppInfoStorage>> getMissionDetail(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> map = this.promoQuestRepository.getMissionDetail(str, false).map(getMin.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "promoQuestRepository\n   …    .map { it.questList }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus$Params;", "", "pageSize", "", "pageNumber", "listOfStatus", "", "", "(IILjava/util/List;)V", "getListOfStatus$domain_release", "()Ljava/util/List;", "getPageNumber$domain_release", "()I", "getPageSize$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        private final List<String> listOfStatus;
        private final int pageNumber;
        private final int pageSize;

        private getMax(int i, int i2, List<String> list) {
            this.pageSize = i;
            this.pageNumber = i2;
            this.listOfStatus = list;
        }

        public /* synthetic */ getMax(int i, int i2, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, list);
        }

        public final int getPageSize$domain_release() {
            return this.pageSize;
        }

        public final int getPageNumber$domain_release() {
            return this.pageNumber;
        }

        @NotNull
        public final List<String> getListOfStatus$domain_release() {
            return this.listOfStatus;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus$Params$Companion;", "", "()V", "activeMissions", "Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus$Params;", "pageSize", "", "pageNumber", "pastMissions", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final getMax activeMissions(int i, int i2) {
                return new getMax(i, i2, CollectionsKt.listOf("ACTIVE", "COMPLETE"), (DefaultConstructorMarker) null);
            }

            @NotNull
            public final getMax pastMissions(int i, int i2) {
                return new getMax(i, i2, CollectionsKt.listOf("FINISH", "CLOSE"), (DefaultConstructorMarker) null);
            }
        }
    }
}
