package o;

import id.dana.data.Source;
import id.dana.data.nearbyme.model.MerchantConfigEntity;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lid/dana/data/nearbyme/repository/MerchantConfigEntityRepository;", "Lid/dana/domain/nearbyme/MerchantConfigRepository;", "nearbyMeConfigDataFactory", "Lid/dana/data/nearbyme/repository/source/NearbyMeConfigDataFactory;", "(Lid/dana/data/nearbyme/repository/source/NearbyMeConfigDataFactory;)V", "amcsMerchantConfigEntityData", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "getAmcsMerchantConfigEntityData", "()Lid/dana/data/nearbyme/MerchantConfigEntityData;", "amcsMerchantConfigEntityData$delegate", "Lkotlin/Lazy;", "defaultMerchantConfigEntityData", "getDefaultMerchantConfigEntityData", "defaultMerchantConfigEntityData$delegate", "splitMerchantConfigEntityData", "getSplitMerchantConfigEntityData", "splitMerchantConfigEntityData$delegate", "getMerchantDetailActionConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "fromNearbyRevamp", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantDetailConfig", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "configEntityData", "(Lid/dana/data/nearbyme/MerchantConfigEntityData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMerchantDetailConfig", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isWorkerReady implements GriverSecurityManager {
    /* access modifiers changed from: private */
    @NotNull
    public static final List<String> ACTION_KEYS = CollectionsKt.listOf("nearby_detail_reserve", "nearby_detail_pickup", "nearby_detail_call", "nearby_detail_direction", "nearby_detail_topup", "nearby_detail_home_shopping", "nearby_detail_share");
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private final Lazy amcsMerchantConfigEntityData$delegate = LazyKt.lazy(new getMax(this));
    private final Lazy defaultMerchantConfigEntityData$delegate = LazyKt.lazy(new getMin(this));
    /* access modifiers changed from: private */
    public final BridgeCallback nearbyMeConfigDataFactory;
    private final Lazy splitMerchantConfigEntityData$delegate = LazyKt.lazy(new setMax(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"getMerchantDetailActionConfig", "", "fromNearbyRevamp", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantConfigEntityRepository", f = "MerchantConfigEntityRepository.kt", i = {0, 0, 1, 1, 2}, l = {43, 47, 50}, m = "getMerchantDetailActionConfig", n = {"this", "fromNearbyRevamp", "this", "fromNearbyRevamp", "fromNearbyRevamp"}, s = {"L$0", "Z$0", "L$0", "Z$0", "Z$0"})
    static final class setMin extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ isWorkerReady this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isWorkerReady isworkerready, Continuation continuation) {
            super(continuation);
            this.this$0 = isworkerready;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getMerchantDetailActionConfig(false, this);
        }
    }

    private final getRenderById getAmcsMerchantConfigEntityData() {
        return (getRenderById) this.amcsMerchantConfigEntityData$delegate.getValue();
    }

    private final getRenderById getDefaultMerchantConfigEntityData() {
        return (getRenderById) this.defaultMerchantConfigEntityData$delegate.getValue();
    }

    private final getRenderById getSplitMerchantConfigEntityData() {
        return (getRenderById) this.splitMerchantConfigEntityData$delegate.getValue();
    }

    @Inject
    public isWorkerReady(@NotNull BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "nearbyMeConfigDataFactory");
        this.nearbyMeConfigDataFactory = bridgeCallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<getRenderById> {
        final /* synthetic */ isWorkerReady this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(isWorkerReady isworkerready) {
            super(0);
            this.this$0 = isworkerready;
        }

        @NotNull
        public final getRenderById invoke() {
            return this.this$0.nearbyMeConfigDataFactory.createData("amcs");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<getRenderById> {
        final /* synthetic */ isWorkerReady this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(isWorkerReady isworkerready) {
            super(0);
            this.this$0 = isworkerready;
        }

        @NotNull
        public final getRenderById invoke() {
            return this.this$0.nearbyMeConfigDataFactory.createData(Source.SPLIT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<getRenderById> {
        final /* synthetic */ isWorkerReady this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(isWorkerReady isworkerready) {
            super(0);
            this.this$0 = isworkerready;
        }

        @NotNull
        public final getRenderById invoke() {
            return this.this$0.nearbyMeConfigDataFactory.createData("local");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMerchantDetailActionConfig(boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.getSerialNumberEncrypt> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o.isWorkerReady.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r10
            o.isWorkerReady$setMin r0 = (o.isWorkerReady.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L_0x0019
        L_0x0014:
            o.isWorkerReady$setMin r0 = new o.isWorkerReady$setMin
            r0.<init>(r8, r10)
        L_0x0019:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "NearbyMeMerchantDetail"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x006c
            if (r2 == r6) goto L_0x0056
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            boolean r9 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            o.isWorkerReady r0 = (o.isWorkerReady) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00d4
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0041:
            boolean r9 = r0.Z$0
            java.lang.Object r2 = r0.L$2
            o.isWorkerReady r2 = (o.isWorkerReady) r2
            java.lang.Object r5 = r0.L$1
            o.isWorkerReady r5 = (o.isWorkerReady) r5
            java.lang.Object r6 = r0.L$0
            o.isWorkerReady r6 = (o.isWorkerReady) r6
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0053 }
            goto L_0x00ae
        L_0x0053:
            r10 = move-exception
            r2 = r5
            goto L_0x00b2
        L_0x0056:
            boolean r9 = r0.Z$0
            java.lang.Object r2 = r0.L$2
            o.isWorkerReady r2 = (o.isWorkerReady) r2
            java.lang.Object r6 = r0.L$1
            o.isWorkerReady r6 = (o.isWorkerReady) r6
            java.lang.Object r7 = r0.L$0
            o.isWorkerReady r7 = (o.isWorkerReady) r7
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0087
        L_0x0068:
            r10 = move-exception
            r2 = r6
            r6 = r7
            goto L_0x008d
        L_0x006c:
            kotlin.ResultKt.throwOnFailure(r10)
            o.getRenderById r10 = r8.getSplitMerchantConfigEntityData()     // Catch:{ all -> 0x008a }
            r0.L$0 = r8     // Catch:{ all -> 0x008a }
            r0.L$1 = r8     // Catch:{ all -> 0x008a }
            r0.L$2 = r8     // Catch:{ all -> 0x008a }
            r0.Z$0 = r9     // Catch:{ all -> 0x008a }
            r0.label = r6     // Catch:{ all -> 0x008a }
            java.lang.Object r10 = r8.getMerchantDetailConfig(r10, r0)     // Catch:{ all -> 0x008a }
            if (r10 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r2 = r8
            r6 = r2
            r7 = r6
        L_0x0087:
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0068 }
            goto L_0x00d7
        L_0x008a:
            r10 = move-exception
            r2 = r8
            r6 = r2
        L_0x008d:
            java.lang.Class r7 = r6.getClass()
            java.lang.String r7 = r7.getName()
            o.updateActionSheetContent.e(r3, r7, r10)
            o.getRenderById r10 = r6.getAmcsMerchantConfigEntityData()     // Catch:{ all -> 0x00b1 }
            r0.L$0 = r6     // Catch:{ all -> 0x00b1 }
            r0.L$1 = r2     // Catch:{ all -> 0x00b1 }
            r0.L$2 = r2     // Catch:{ all -> 0x00b1 }
            r0.Z$0 = r9     // Catch:{ all -> 0x00b1 }
            r0.label = r5     // Catch:{ all -> 0x00b1 }
            java.lang.Object r10 = r6.getMerchantDetailConfig(r10, r0)     // Catch:{ all -> 0x00b1 }
            if (r10 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r5 = r2
        L_0x00ae:
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0053 }
            goto L_0x00d7
        L_0x00b1:
            r10 = move-exception
        L_0x00b2:
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            o.updateActionSheetContent.e(r3, r5, r10)
            o.getRenderById r10 = r6.getDefaultMerchantConfigEntityData()
            r0.L$0 = r2
            r3 = 0
            r0.L$1 = r3
            r0.L$2 = r3
            r0.Z$0 = r9
            r0.label = r4
            java.lang.Object r10 = r6.getMerchantDetailConfig(r10, r0)
            if (r10 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r0 = r2
        L_0x00d4:
            java.util.List r10 = (java.util.List) r10
            r2 = r0
        L_0x00d7:
            o.getSerialNumberEncrypt r9 = r2.toMerchantDetailConfig(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isWorkerReady.getMerchantDetailActionConfig(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object getMerchantDetailConfig(getRenderById getrenderbyid, Continuation<? super List<MerchantConfigEntity>> continuation) {
        Object[] array = ACTION_KEYS.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            return getrenderbyid.getMerchantDetailConfig((String[]) Arrays.copyOf(strArr, strArr.length), false, continuation);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final getSerialNumberEncrypt toMerchantDetailConfig(List<MerchantConfigEntity> list, boolean z) {
        if (list.isEmpty()) {
            return getSerialNumberEncrypt.Companion.getDefaultValue(z);
        }
        return new getSerialNumberEncrypt(list.get(0).getEnable(), list.get(1).getEnable(), list.get(4).getEnable(), list.get(2).getEnable(), list.get(3).getEnable(), list.get(5).getEnable(), list.get(6).getEnable());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/data/nearbyme/repository/MerchantConfigEntityRepository$Companion;", "", "()V", "ACTION_KEYS", "", "", "getACTION_KEYS", "()Ljava/util/List;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> getACTION_KEYS() {
            return isWorkerReady.ACTION_KEYS;
        }
    }
}
