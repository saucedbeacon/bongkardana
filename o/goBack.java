package o;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J*\u0010\t\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b`\f0\u0006H\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b`\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/data/miniprogram/source/local/PreferenceStoreMiniProgramsEntityData;", "Lid/dana/data/miniprogram/source/StoreMiniProgramData;", "preference", "Lid/dana/data/miniprogram/source/local/StoreMiniProgramPreference;", "(Lid/dana/data/miniprogram/source/local/StoreMiniProgramPreference;)V", "getFavoriteMiniPrograms", "Lio/reactivex/Observable;", "", "", "getRecentMiniPrograms", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "setFavoriteMiniPrograms", "", "appIds", "setRecentMiniPrograms", "hashMap", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class goBack {
    final hasTriggeredLoad getMax;

    @Inject
    public goBack(@NotNull hasTriggeredLoad hastriggeredload) {
        Intrinsics.checkNotNullParameter(hastriggeredload, "preference");
        this.getMax = hastriggeredload;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<V> implements Callable<List<? extends String>> {
        final /* synthetic */ goBack getMax;

        public setMax(goBack goback) {
            this.getMax = goback;
        }

        public final /* synthetic */ Object call() {
            List list = (List) this.getMax.getMax.getMin.getObject("FavoriteMiniProgram", List.class);
            return list == null ? CollectionsKt.emptyList() : list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 4, 2})
    public static final class length<V> implements Callable<Unit> {
        final /* synthetic */ List getMin;
        final /* synthetic */ goBack setMin;

        public length(goBack goback, List list) {
            this.setMin = goback;
            this.getMin = list;
        }

        public final /* synthetic */ Object call() {
            hasTriggeredLoad hastriggeredload = this.setMin.getMax;
            List list = this.getMin;
            Intrinsics.checkNotNullParameter(list, "appIds");
            hastriggeredload.getMin.saveData("FavoriteMiniProgram", list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001aD\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0005*\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    public static final class getMax<V> implements Callable<HashMap<String, Long>> {
        final /* synthetic */ goBack getMax;

        public getMax(goBack goback) {
            this.getMax = goback;
        }

        public final /* synthetic */ Object call() {
            HashMap hashMap = (HashMap) this.getMax.getMax.getMin.getObject("RecentMiniProgram", HashMap.class);
            return hashMap == null ? new HashMap() : hashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<V> implements Callable<Unit> {
        final /* synthetic */ goBack getMin;
        final /* synthetic */ HashMap setMax;

        public setMin(goBack goback, HashMap hashMap) {
            this.getMin = goback;
            this.setMax = hashMap;
        }

        public final /* synthetic */ Object call() {
            hasTriggeredLoad hastriggeredload = this.getMin.getMax;
            HashMap hashMap = this.setMax;
            Intrinsics.checkNotNullParameter(hashMap, "hashMap");
            hastriggeredload.getMin.saveData("RecentMiniProgram", hashMap);
            return Unit.INSTANCE;
        }
    }
}
