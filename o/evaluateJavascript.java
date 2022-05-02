package o;

import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\"\u0010\u000f\u001a\u0004\u0018\u00010\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0002J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\rH\u0002JV\u0010\u0018\u001aP\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00110\u0011 \u001a*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00110\u0011\u0018\u00010\r0\r0\u0019H\u0002J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H\u0002J.\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002H\u0002JV\u0010 \u001aP\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u001a*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\r0\r0\u0019H\u0002J\"\u0010!\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\"H\u0002J/\u0010#\u001a)\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0002J \u0010'\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lid/dana/domain/featureconfig/interactor/GetSkuExplore;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "Lid/dana/domain/core/usecase/NoParams;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "servicesRepository", "Lid/dana/domain/services/ServicesRepository;", "globalSearchRepository", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;Lid/dana/domain/services/ServicesRepository;Lid/dana/domain/globalsearch/GlobalSearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "findMatchingProfileKey", "items", "", "profileKey", "", "getProfileKeys", "services", "getSkuExploreConfig", "Lid/dana/domain/featureconfig/model/SkuExploreConfig;", "getSkuServices", "Lkotlin/Function1;", "kotlin.jvm.PlatformType", "mapBizId", "bizIds", "Lid/dana/domain/globalsearch/model/ProductBizId;", "populateServiceWithSkuIdForGrouping", "configs", "populateSkuWithLastTransactionData", "reduceToLatestTransactionWithSameSkuId", "Lkotlin/Function3;", "removeExcessSku", "Lkotlin/ParameterName;", "name", "t", "takeLatestTransactionFromSameSkuId", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class evaluateJavascript extends APWebChromeClient<List<? extends ThirdPartyServiceResponse>, onReceivedIcon> {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    public static final int MAX_PROFILE_KEY_RESULT = 1;
    private final setDefaultFontSize featureConfigRepository;
    /* access modifiers changed from: private */
    public final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;
    /* access modifiers changed from: private */
    public final toUuidString servicesRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public evaluateJavascript(@NotNull setDefaultFontSize setdefaultfontsize, @NotNull toUuidString touuidstring, @NotNull RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        Intrinsics.checkNotNullParameter(touuidstring, "servicesRepository");
        Intrinsics.checkNotNullParameter(loadingStatusChangeListener, "globalSearchRepository");
        this.featureConfigRepository = setdefaultfontsize;
        this.servicesRepository = touuidstring;
        this.globalSearchRepository = loadingStatusChangeListener;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [o.pageUp] */
    /* JADX WARNING: type inference failed for: r1v1, types: [o.pageUp] */
    /* JADX WARNING: type inference failed for: r1v2, types: [o.pageUp] */
    /* JADX WARNING: type inference failed for: r1v3, types: [o.pageUp] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.TitleBarRightButtonView.AnonymousClass1<java.util.List<id.dana.domain.homeinfo.ThirdPartyServiceResponse>> buildUseCase(@org.jetbrains.annotations.NotNull o.onReceivedIcon r3) {
        /*
            r2 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            o.TitleBarRightButtonView$1 r3 = r2.getSkuExploreConfig()
            kotlin.jvm.functions.Function1 r0 = r2.getSkuServices()
            if (r0 == 0) goto L_0x0015
            o.pageUp r1 = new o.pageUp
            r1.<init>(r0)
            r0 = r1
        L_0x0015:
            o.RedDotDrawable r0 = (o.RedDotDrawable) r0
            o.TitleBarRightButtonView$1 r3 = r3.flatMap(r0)
            kotlin.jvm.functions.Function1 r0 = r2.populateSkuWithLastTransactionData()
            if (r0 == 0) goto L_0x0027
            o.pageUp r1 = new o.pageUp
            r1.<init>(r0)
            r0 = r1
        L_0x0027:
            o.RedDotDrawable r0 = (o.RedDotDrawable) r0
            o.TitleBarRightButtonView$1 r3 = r3.flatMap(r0)
            kotlin.jvm.functions.Function1 r0 = r2.takeLatestTransactionFromSameSkuId()
            if (r0 == 0) goto L_0x0039
            o.pageUp r1 = new o.pageUp
            r1.<init>(r0)
            r0 = r1
        L_0x0039:
            o.RedDotDrawable r0 = (o.RedDotDrawable) r0
            o.TitleBarRightButtonView$1 r3 = r3.map(r0)
            kotlin.jvm.functions.Function1 r0 = r2.removeExcessSku()
            if (r0 == 0) goto L_0x004b
            o.pageUp r1 = new o.pageUp
            r1.<init>(r0)
            r0 = r1
        L_0x004b:
            o.RedDotDrawable r0 = (o.RedDotDrawable) r0
            o.TitleBarRightButtonView$1 r3 = r3.map(r0)
            java.lang.String r0 = "getSkuExploreConfig()\n  …  .map(removeExcessSku())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.evaluateJavascript.buildUseCase(o.onReceivedIcon):o.TitleBarRightButtonView$1");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<List<ThirdPartyServiceResponse>, List<? extends ThirdPartyServiceResponse>> {
        public static final equals INSTANCE = new equals();

        equals() {
            super(1);
        }

        @NotNull
        public final List<ThirdPartyServiceResponse> invoke(@NotNull List<ThirdPartyServiceResponse> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return CollectionsKt.take(list, 6);
        }
    }

    private final Function1<List<ThirdPartyServiceResponse>, List<ThirdPartyServiceResponse>> removeExcessSku() {
        return equals.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "kotlin.jvm.PlatformType", "services", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<List<ThirdPartyServiceResponse>, TitleBarRightButtonView.AnonymousClass1<List<? extends ThirdPartyServiceResponse>>> {
        final /* synthetic */ evaluateJavascript this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(evaluateJavascript evaluatejavascript) {
            super(1);
            this.this$0 = evaluatejavascript;
        }

        public final TitleBarRightButtonView.AnonymousClass1<List<ThirdPartyServiceResponse>> invoke(@NotNull final List<ThirdPartyServiceResponse> list) {
            Intrinsics.checkNotNullParameter(list, "services");
            return this.this$0.globalSearchRepository.getHistoricalSku(this.this$0.getProfileKeys(list), 1).map(new RedDotDrawable<List<? extends performRequest>, List<? extends ThirdPartyServiceResponse>>(this) {
                final /* synthetic */ getMax getMin;

                {
                    this.getMin = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    Intrinsics.checkNotNullParameter(list, "productBizIds");
                    return this.getMin.this$0.mapBizId(list, list);
                }
            });
        }
    }

    private final Function1<List<ThirdPartyServiceResponse>, TitleBarRightButtonView.AnonymousClass1<List<ThirdPartyServiceResponse>>> populateSkuWithLastTransactionData() {
        return new getMax(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "kotlin.jvm.PlatformType", "configs", "", "Lid/dana/domain/featureconfig/model/SkuExploreConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<List<? extends onReceivedHttpError>, TitleBarRightButtonView.AnonymousClass1<List<ThirdPartyServiceResponse>>> {
        final /* synthetic */ evaluateJavascript this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(evaluateJavascript evaluatejavascript) {
            super(1);
            this.this$0 = evaluatejavascript;
        }

        /* JADX WARNING: type inference failed for: r1v4, types: [o.pageUp] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.TitleBarRightButtonView.AnonymousClass1<java.util.List<id.dana.domain.homeinfo.ThirdPartyServiceResponse>> invoke(@org.jetbrains.annotations.NotNull java.util.List<o.onReceivedHttpError> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "configs"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                o.evaluateJavascript r0 = r4.this$0
                o.toUuidString r0 = r0.servicesRepository
                r1 = r5
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r3)
                r2.<init>(r3)
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r1 = r1.iterator()
            L_0x001f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0033
                java.lang.Object r3 = r1.next()
                o.onReceivedHttpError r3 = (o.onReceivedHttpError) r3
                java.lang.String r3 = r3.getServiceName()
                r2.add(r3)
                goto L_0x001f
            L_0x0033:
                java.util.List r2 = (java.util.List) r2
                o.TitleBarRightButtonView$1 r0 = r0.getDefaultSkuExplore(r2)
                o.evaluateJavascript r1 = r4.this$0
                kotlin.jvm.functions.Function1 r5 = r1.populateServiceWithSkuIdForGrouping(r5)
                if (r5 == 0) goto L_0x0047
                o.pageUp r1 = new o.pageUp
                r1.<init>(r5)
                r5 = r1
            L_0x0047:
                o.RedDotDrawable r5 = (o.RedDotDrawable) r5
                o.TitleBarRightButtonView$1 r5 = r0.map(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.evaluateJavascript.getMin.invoke(java.util.List):o.TitleBarRightButtonView$1");
        }
    }

    private final Function1<List<onReceivedHttpError>, TitleBarRightButtonView.AnonymousClass1<List<ThirdPartyServiceResponse>>> getSkuServices() {
        return new getMin(this);
    }

    private final TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> getSkuExploreConfig() {
        TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> skuExplore = this.featureConfigRepository.getSkuExplore();
        Intrinsics.checkNotNullExpressionValue(skuExplore, "featureConfigRepository.skuExplore");
        return skuExplore;
    }

    /* access modifiers changed from: private */
    public final List<String> getProfileKeys(List<ThirdPartyServiceResponse> list) {
        List<String> arrayList = new ArrayList<>();
        for (ThirdPartyServiceResponse skuAttr : list) {
            GriverInnerAmcsLiteConfig skuAttr2 = skuAttr.getSkuAttr();
            if (skuAttr2 != null) {
                List<String> serviceKey = skuAttr2.getServiceKey();
                if (serviceKey != null) {
                    arrayList.addAll(serviceKey);
                }
                List<String> prepaidKey = skuAttr2.getPrepaidKey();
                if (prepaidKey != null) {
                    arrayList.addAll(prepaidKey);
                }
                List<String> postpaidKey = skuAttr2.getPostpaidKey();
                if (postpaidKey != null) {
                    arrayList.addAll(postpaidKey);
                }
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "services", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<List<? extends ThirdPartyServiceResponse>, List<ThirdPartyServiceResponse>> {
        final /* synthetic */ evaluateJavascript this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(evaluateJavascript evaluatejavascript) {
            super(1);
            this.this$0 = evaluatejavascript;
        }

        @NotNull
        public final List<ThirdPartyServiceResponse> invoke(@NotNull List<ThirdPartyServiceResponse> list) {
            Intrinsics.checkNotNullParameter(list, "services");
            Grouping setmin = new setMin(list);
            Map linkedHashMap = new LinkedHashMap();
            Function3 access$reduceToLatestTransactionWithSameSkuId = this.this$0.reduceToLatestTransactionWithSameSkuId();
            Iterator sourceIterator = setmin.sourceIterator();
            while (sourceIterator.hasNext()) {
                Object next = sourceIterator.next();
                Object keyOf = setmin.keyOf(next);
                Object obj = linkedHashMap.get(keyOf);
                if (!(obj == null && !linkedHashMap.containsKey(keyOf))) {
                    next = access$reduceToLatestTransactionWithSameSkuId.invoke(keyOf, obj, next);
                }
                linkedHashMap.put(keyOf, next);
            }
            Collection values = ((LinkedHashMap) linkedHashMap).values();
            Intrinsics.checkNotNullExpressionValue(values, "services.groupingBy { it…Id())\n            .values");
            return CollectionsKt.toMutableList(values);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0002\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "keyOf", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 4, 2})
        public static final class setMin implements Grouping<ThirdPartyServiceResponse, String> {
            final /* synthetic */ Iterable $this_groupingBy;

            public setMin(Iterable iterable) {
                this.$this_groupingBy = iterable;
            }

            @NotNull
            public final Iterator<ThirdPartyServiceResponse> sourceIterator() {
                return this.$this_groupingBy.iterator();
            }

            public final String keyOf(ThirdPartyServiceResponse thirdPartyServiceResponse) {
                return thirdPartyServiceResponse.getSkuConfigId();
            }
        }
    }

    private final Function1<List<ThirdPartyServiceResponse>, List<ThirdPartyServiceResponse>> takeLatestTransactionFromSameSkuId() {
        return new IsOverlapping(this);
    }

    /* access modifiers changed from: private */
    public final Function3<String, ThirdPartyServiceResponse, ThirdPartyServiceResponse, ThirdPartyServiceResponse> reduceToLatestTransactionWithSameSkuId() {
        return toIntRange.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "<anonymous parameter 0>", "", "first", "second", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function3<String, ThirdPartyServiceResponse, ThirdPartyServiceResponse, ThirdPartyServiceResponse> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(3);
        }

        @NotNull
        public final ThirdPartyServiceResponse invoke(@Nullable String str, @NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull ThirdPartyServiceResponse thirdPartyServiceResponse2) {
            Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "first");
            Intrinsics.checkNotNullParameter(thirdPartyServiceResponse2, "second");
            return (ThirdPartyServiceResponse) ComparisonsKt.maxOf(thirdPartyServiceResponse, thirdPartyServiceResponse2, new setMin());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements Comparator<T> {
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                r8 = kotlin.text.StringsKt.replace$default((r1 = (r8 = r8.getProductBizId()).getTransactionDate()), "\"", "", false, 4, (java.lang.Object) null);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int compare(T r8, T r9) {
                /*
                    r7 = this;
                    id.dana.domain.homeinfo.ThirdPartyServiceResponse r8 = (id.dana.domain.homeinfo.ThirdPartyServiceResponse) r8
                    o.GriverInnerAmcsLiteConfig r8 = r8.getSkuAttr()
                    r0 = 0
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    if (r8 == 0) goto L_0x0032
                    o.performRequest r8 = r8.getProductBizId()
                    if (r8 == 0) goto L_0x0032
                    java.lang.String r1 = r8.getTransactionDate()
                    if (r1 == 0) goto L_0x0032
                    r4 = 0
                    r5 = 4
                    r6 = 0
                    java.lang.String r2 = "\""
                    java.lang.String r3 = ""
                    java.lang.String r8 = kotlin.text.StringsKt.replace$default((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
                    if (r8 == 0) goto L_0x0032
                    long r1 = java.lang.Long.parseLong(r8)
                    java.lang.Long r8 = java.lang.Long.valueOf(r1)
                    java.lang.Comparable r8 = (java.lang.Comparable) r8
                    goto L_0x0035
                L_0x0032:
                    r8 = r0
                    java.lang.Comparable r8 = (java.lang.Comparable) r8
                L_0x0035:
                    id.dana.domain.homeinfo.ThirdPartyServiceResponse r9 = (id.dana.domain.homeinfo.ThirdPartyServiceResponse) r9
                    o.GriverInnerAmcsLiteConfig r9 = r9.getSkuAttr()
                    if (r9 == 0) goto L_0x0061
                    o.performRequest r9 = r9.getProductBizId()
                    if (r9 == 0) goto L_0x0061
                    java.lang.String r1 = r9.getTransactionDate()
                    if (r1 == 0) goto L_0x0061
                    r4 = 0
                    r5 = 4
                    r6 = 0
                    java.lang.String r2 = "\""
                    java.lang.String r3 = ""
                    java.lang.String r9 = kotlin.text.StringsKt.replace$default((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
                    if (r9 == 0) goto L_0x0061
                    long r0 = java.lang.Long.parseLong(r9)
                    java.lang.Long r9 = java.lang.Long.valueOf(r0)
                    java.lang.Comparable r9 = (java.lang.Comparable) r9
                    goto L_0x0064
                L_0x0061:
                    r9 = r0
                    java.lang.Comparable r9 = (java.lang.Comparable) r9
                L_0x0064:
                    int r8 = kotlin.comparisons.ComparisonsKt.compareValues(r8, r9)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.evaluateJavascript.toIntRange.setMin.compare(java.lang.Object, java.lang.Object):int");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "services", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<List<? extends ThirdPartyServiceResponse>, List<ThirdPartyServiceResponse>> {
        final /* synthetic */ List $configs;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(List list) {
            super(1);
            this.$configs = list;
        }

        @NotNull
        public final List<ThirdPartyServiceResponse> invoke(@NotNull List<ThirdPartyServiceResponse> list) {
            String str;
            Object obj;
            Intrinsics.checkNotNullParameter(list, "services");
            for (ThirdPartyServiceResponse thirdPartyServiceResponse : list) {
                Iterator it = this.$configs.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((onReceivedHttpError) obj).getServiceName(), (Object) thirdPartyServiceResponse.getKey())) {
                        break;
                    }
                }
                onReceivedHttpError onreceivedhttperror = (onReceivedHttpError) obj;
                if (onreceivedhttperror != null) {
                    str = onreceivedhttperror.getId();
                }
                if (str == null) {
                    str = "";
                }
                thirdPartyServiceResponse.setSkuConfigId(str);
            }
            return CollectionsKt.toMutableList(list);
        }
    }

    /* access modifiers changed from: private */
    public final Function1<List<ThirdPartyServiceResponse>, List<ThirdPartyServiceResponse>> populateServiceWithSkuIdForGrouping(List<onReceivedHttpError> list) {
        return new setMax(list);
    }

    /* access modifiers changed from: private */
    public final List<ThirdPartyServiceResponse> mapBizId(List<ThirdPartyServiceResponse> list, List<performRequest> list2) {
        GriverInnerAmcsLiteConfig skuAttr;
        for (performRequest performrequest : list2) {
            ThirdPartyServiceResponse findMatchingProfileKey = findMatchingProfileKey(list, performrequest.getProfileKey());
            if (!(findMatchingProfileKey == null || (skuAttr = findMatchingProfileKey.getSkuAttr()) == null)) {
                skuAttr.setProductBizId(performrequest);
            }
        }
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new setMin());
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r2 = r2.getServiceKey();
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[EDGE_INSN: B:30:0x005b->B:27:0x005b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final id.dana.domain.homeinfo.ThirdPartyServiceResponse findMatchingProfileKey(java.util.List<id.dana.domain.homeinfo.ThirdPartyServiceResponse> r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0006:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r5.next()
            r1 = r0
            id.dana.domain.homeinfo.ThirdPartyServiceResponse r1 = (id.dana.domain.homeinfo.ThirdPartyServiceResponse) r1
            o.GriverInnerAmcsLiteConfig r2 = r1.getSkuAttr()
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.util.List r2 = r2.getServiceKey()
            if (r2 == 0) goto L_0x0027
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r2 = kotlin.collections.CollectionsKt.contains(r2, r6)
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 != 0) goto L_0x0056
            o.GriverInnerAmcsLiteConfig r2 = r1.getSkuAttr()
            if (r2 == 0) goto L_0x003d
            java.util.List r2 = r2.getPrepaidKey()
            if (r2 == 0) goto L_0x003d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r2 = kotlin.collections.CollectionsKt.contains(r2, r6)
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 != 0) goto L_0x0056
            o.GriverInnerAmcsLiteConfig r1 = r1.getSkuAttr()
            if (r1 == 0) goto L_0x0053
            java.util.List r1 = r1.getPostpaidKey()
            if (r1 == 0) goto L_0x0053
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = kotlin.collections.CollectionsKt.contains(r1, r6)
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x0057
        L_0x0056:
            r3 = 1
        L_0x0057:
            if (r3 == 0) goto L_0x0006
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            id.dana.domain.homeinfo.ThirdPartyServiceResponse r0 = (id.dana.domain.homeinfo.ThirdPartyServiceResponse) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.evaluateJavascript.findMatchingProfileKey(java.util.List, java.lang.String):id.dana.domain.homeinfo.ThirdPartyServiceResponse");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/domain/featureconfig/interactor/GetSkuExplore$Companion;", "", "()V", "MAX_PROFILE_KEY_RESULT", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<T> implements Comparator<T> {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r3 = r3.getProductBizId();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r2, T r3) {
            /*
                r1 = this;
                id.dana.domain.homeinfo.ThirdPartyServiceResponse r3 = (id.dana.domain.homeinfo.ThirdPartyServiceResponse) r3
                o.GriverInnerAmcsLiteConfig r3 = r3.getSkuAttr()
                r0 = 0
                if (r3 == 0) goto L_0x0014
                o.performRequest r3 = r3.getProductBizId()
                if (r3 == 0) goto L_0x0014
                java.lang.String r3 = r3.getTransactionDate()
                goto L_0x0015
            L_0x0014:
                r3 = r0
            L_0x0015:
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                id.dana.domain.homeinfo.ThirdPartyServiceResponse r2 = (id.dana.domain.homeinfo.ThirdPartyServiceResponse) r2
                o.GriverInnerAmcsLiteConfig r2 = r2.getSkuAttr()
                if (r2 == 0) goto L_0x0029
                o.performRequest r2 = r2.getProductBizId()
                if (r2 == 0) goto L_0x0029
                java.lang.String r0 = r2.getTransactionDate()
            L_0x0029:
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                int r2 = kotlin.comparisons.ComparisonsKt.compareValues(r3, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.evaluateJavascript.setMin.compare(java.lang.Object, java.lang.Object):int");
        }
    }
}
