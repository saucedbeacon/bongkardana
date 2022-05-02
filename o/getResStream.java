package o;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o.RVHttpRequest;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00180\u000fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/data/saving/repository/SavingCategoryEntityRepository;", "Lid/dana/domain/saving/SavingCategoryRepository;", "savingCategoryEntityDataFactory", "Lid/dana/data/saving/repository/SavingCategoryEntityDataFactory;", "(Lid/dana/data/saving/repository/SavingCategoryEntityDataFactory;)V", "defaultSavingCategory", "Lid/dana/data/saving/repository/SavingCategoryEntityData;", "getDefaultSavingCategory", "()Lid/dana/data/saving/repository/SavingCategoryEntityData;", "defaultSavingCategory$delegate", "Lkotlin/Lazy;", "networkConfigSavingCategory", "getNetworkConfigSavingCategory", "networkConfigSavingCategory$delegate", "getSavingCategories", "Lio/reactivex/Observable;", "", "Lid/dana/domain/saving/model/SavingCategory;", "getSavingCategoriesByKeys", "keys", "", "", "([Ljava/lang/String;)Lio/reactivex/Observable;", "getSavingCategoriesMap", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getResStream implements toStringBuilder {
    private final Lazy defaultSavingCategory$delegate = LazyKt.lazy(new length(this));
    private final Lazy networkConfigSavingCategory$delegate = LazyKt.lazy(new equals(this));
    /* access modifiers changed from: private */
    public final requestData savingCategoryEntityDataFactory;

    private final timeout getDefaultSavingCategory() {
        return (timeout) this.defaultSavingCategory$delegate.getValue();
    }

    private final timeout getNetworkConfigSavingCategory() {
        return (timeout) this.networkConfigSavingCategory$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/saving/model/SavingCategory;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/model/SavingCategoryEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<List<? extends access$702>, List<? extends setDebug>> {
        public static final getMax setMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return RVHttpRequest.Builder.toSavingCategories(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/saving/model/SavingCategory;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/model/SavingCategoryEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<List<? extends access$702>, List<? extends setDebug>> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return RVHttpRequest.Builder.toSavingCategories(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "test"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements getChildren<List<? extends access$702>> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            return getMax((List) obj);
        }

        private static boolean getMax(@NotNull List<access$702> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return !list.isEmpty();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lid/dana/domain/saving/model/SavingCategory;", "kotlin.jvm.PlatformType", "savingCategories", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<? extends setDebug>, Map<String, ? extends setDebug>> {
        public static final setMin length = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "savingCategories");
            Iterable iterable = list;
            Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(((setDebug) next).getCategoryCode(), next);
            }
            return linkedHashMap;
        }
    }

    @Inject
    public getResStream(@NotNull requestData requestdata) {
        Intrinsics.checkNotNullParameter(requestdata, "savingCategoryEntityDataFactory");
        this.savingCategoryEntityDataFactory = requestdata;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingCategoryEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<timeout> {
        final /* synthetic */ getResStream this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(getResStream getresstream) {
            super(0);
            this.this$0 = getresstream;
        }

        @NotNull
        public final timeout invoke() {
            return this.this$0.savingCategoryEntityDataFactory.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingCategoryEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<timeout> {
        final /* synthetic */ getResStream this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getResStream getresstream) {
            super(0);
            this.this$0 = getresstream;
        }

        @NotNull
        public final timeout invoke() {
            return this.this$0.savingCategoryEntityDataFactory.createData("local");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<setDebug>> getSavingCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getNetworkConfigSavingCategory().getSavingCategories().onErrorResumeNext(getDefaultSavingCategory().getSavingCategories()).filter(setMax.setMax).switchIfEmpty(getDefaultSavingCategory().getSavingCategories()).map(getMin.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "networkConfigSavingCateg…it.toSavingCategories() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, setDebug>> getSavingCategoriesMap() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getSavingCategories().map(setMin.length);
        Intrinsics.checkNotNullExpressionValue(map, "getSavingCategories().ma….categoryCode }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<setDebug>> getSavingCategoriesByKeys(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "keys");
        TitleBarRightButtonView.AnonymousClass1<R> map = getNetworkConfigSavingCategory().getSavingCategoriesByKeys((String[]) Arrays.copyOf(strArr, strArr.length)).onErrorResumeNext(getDefaultSavingCategory().getSavingCategoriesByKeys((String[]) Arrays.copyOf(strArr, strArr.length))).map(getMax.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "networkConfigSavingCateg…it.toSavingCategories() }");
        return map;
    }
}
