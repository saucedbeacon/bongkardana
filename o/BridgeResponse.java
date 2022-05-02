package o;

import android.content.Context;
import com.alibaba.fastjson.TypeReference;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.nearbyme.model.MerchantConfigEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lid/dana/data/nearbyme/repository/source/amcs/AmcsMerchantConfigEntityData;", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;Lid/dana/data/storage/Serializer;)V", "getMerchantDetailConfig", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "keys", "", "", "default", "", "([Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BridgeResponse implements getRenderById {
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final PluginInstallCallback serializer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lid/dana/data/nearbyme/repository/source/local/PreferenceMerchantReviewFormEntityData;", "Lid/dana/data/nearbyme/repository/MerchantReviewFormEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "merchantReviewPreference", "", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "clearAll", "", "getDismissedMerchantReview", "", "shopId", "phoneNumber", "getLastTimeMerchantReviewShown", "", "saveLastTimeMerchantReviewShown", "lastTimeMerchantReviewShown", "setDismissedMerchantReview", "isDismissed", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class NamedValue {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        private static final String LAST_TIME_MERCHANT_REVIEW_KEY = "LAST_TIME_MERCHANT_REVIEW_KEY";
        private static final String SHOP_ID_DISMISSED_FORM = "SHOP_ID_DISMISSED_FORM";
        @NotNull
        private final Context context;
        private final String merchantReviewPreference;
        private final onSingleFailed preferenceFacade;
        @NotNull
        private final PluginInstallCallback serializer;

        @Inject
        public NamedValue(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
            this.context = context2;
            this.serializer = pluginInstallCallback;
            StringBuilder sb = new StringBuilder();
            sb.append(NamedValue.class.getSimpleName());
            sb.append("production");
            this.merchantReviewPreference = sb.toString();
            onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(this.context).setPreferenceGroup(this.merchantReviewPreference).setUseDrutherPreference(true).setSerializerFacade(this.serializer)).createData("local");
            Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(it).createData(Source.LOCAL)");
            this.preferenceFacade = createData;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final PluginInstallCallback getSerializer() {
            return this.serializer;
        }

        public final long getLastTimeMerchantReviewShown(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            onSingleFailed onsinglefailed = this.preferenceFacade;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(LAST_TIME_MERCHANT_REVIEW_KEY);
            Long l = onsinglefailed.getLong(sb.toString());
            if (l.longValue() < 0) {
                return 0;
            }
            Intrinsics.checkNotNullExpressionValue(l, "preferenceFacade.getLong…eturn 0 else it\n        }");
            return l.longValue();
        }

        public final void saveLastTimeMerchantReviewShown(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            onSingleFailed onsinglefailed = this.preferenceFacade;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(LAST_TIME_MERCHANT_REVIEW_KEY);
            onsinglefailed.saveData(sb.toString(), Long.valueOf(j));
        }

        public final void setDismissedMerchantReview(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            onSingleFailed onsinglefailed = this.preferenceFacade;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(SHOP_ID_DISMISSED_FORM);
            onsinglefailed.saveData(sb.toString(), Boolean.valueOf(z));
        }

        public final boolean getDismissedMerchantReview(@NotNull String str, @NotNull String str2) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(1591011450, oncanceled);
                onCancelLoad.getMin(1591011450, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            onSingleFailed onsinglefailed = this.preferenceFacade;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(SHOP_ID_DISMISSED_FORM);
            Boolean bool = onsinglefailed.getBoolean(sb.toString());
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final void clearAll() {
            this.preferenceFacade.clearAllData();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/nearbyme/repository/source/local/PreferenceMerchantReviewFormEntityData$Companion;", "", "()V", "LAST_TIME_MERCHANT_REVIEW_KEY", "", "SHOP_ID_DISMISSED_FORM", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Singleton
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lid/dana/data/nearbyme/repository/source/local/DefaultMerchantConfigEntityData;", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getMerchantDetailConfig", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "keys", "", "", "default", "", "([Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Error implements getRenderById {
        /* access modifiers changed from: private */
        public final Context context;
        /* access modifiers changed from: private */
        public final PluginInstallCallback serializer;

        @Inject
        public Error(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
            this.context = context2;
            this.serializer = pluginInstallCallback;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.data.nearbyme.repository.source.local.DefaultMerchantConfigEntityData$getMerchantDetailConfig$2", f = "DefaultMerchantConfigEntityData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class setMin extends SuspendLambda implements Function2<initToken, Continuation<? super List<? extends MerchantConfigEntity>>, Object> {
            final /* synthetic */ boolean $default;
            final /* synthetic */ String[] $keys;
            int label;
            final /* synthetic */ Error this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(Error error, String[] strArr, boolean z, Continuation continuation) {
                super(2, continuation);
                this.this$0 = error;
                this.$keys = strArr;
                this.$default = z;
            }

            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "completion");
                return new setMin(this.this$0, this.$keys, this.$default, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((setMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MerchantConfigEntity merchantConfigEntity;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.this$0.context, BaseAppContext.DEFAULT_NEARBY_MERCHANT_CONFIG);
                    if (loadJSONFromAsset == null) {
                        return CollectionsKt.emptyList();
                    }
                    Map<String, String> deserializeMap = this.this$0.serializer.deserializeMap(loadJSONFromAsset);
                    Intrinsics.checkNotNullExpressionValue(deserializeMap, "serializer.deserializeMap(config)");
                    Map<String, String> map = MapsKt.toMap(deserializeMap);
                    String[] strArr = this.$keys;
                    Collection arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        String str2 = map.get(str);
                        if (str2 == null || (merchantConfigEntity = (MerchantConfigEntity) this.this$0.serializer.deserialize(str2, MerchantConfigEntity.class)) == null) {
                            merchantConfigEntity = new MerchantConfigEntity(this.$default);
                        }
                        arrayList.add(merchantConfigEntity);
                    }
                    return (List) arrayList;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Nullable
        public final Object getMerchantDetailConfig(@NotNull String[] strArr, boolean z, @NotNull Continuation<? super List<MerchantConfigEntity>> continuation) {
            return xp4.length(DeviceTokenClient.setMax(), new setMin(this, strArr, z, (Continuation) null), continuation);
        }
    }

    @Inject
    public BridgeResponse(@NotNull Context context2, @NotNull AppPausePoint appPausePoint, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.context = context2;
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(this.context, "prod");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.source.amcs.AmcsMerchantConfigEntityData$getMerchantDetailConfig$2", f = "AmcsMerchantConfigEntityData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getMin extends SuspendLambda implements Function2<initToken, Continuation<? super List<? extends MerchantConfigEntity>>, Object> {
        final /* synthetic */ String[] $keys;
        int label;
        final /* synthetic */ BridgeResponse this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin extends TypeReference<Map<String, ? extends MerchantConfigEntity>> {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(BridgeResponse bridgeResponse, String[] strArr, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bridgeResponse;
            this.$keys = strArr;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new getMin(this.this$0, this.$keys, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
            r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6.getEnable());
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r10.label
                if (r0 != 0) goto L_0x00a1
                kotlin.ResultKt.throwOnFailure(r11)
                o.BridgeResponse r11 = r10.this$0
                android.content.Context r11 = r11.context
                java.lang.String r0 = "split/default-nearby-merchant-detail.json"
                java.lang.String r11 = o.getPositiveString.loadJSONFromAsset(r11, r0)
                r0 = 0
                if (r11 != 0) goto L_0x001e
                java.util.Map r11 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x003c }
                goto L_0x0040
            L_0x001e:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x003c }
                r1.<init>(r11)     // Catch:{ Exception -> 0x003c }
                java.lang.String r11 = r1.toString()     // Catch:{ Exception -> 0x003c }
                o.BridgeResponse$getMin$setMin r1 = new o.BridgeResponse$getMin$setMin     // Catch:{ Exception -> 0x003c }
                r1.<init>()     // Catch:{ Exception -> 0x003c }
                com.alibaba.fastjson.TypeReference r1 = (com.alibaba.fastjson.TypeReference) r1     // Catch:{ Exception -> 0x003c }
                com.alibaba.fastjson.parser.Feature[] r2 = new com.alibaba.fastjson.parser.Feature[r0]     // Catch:{ Exception -> 0x003c }
                java.lang.Object r11 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r11, r1, (com.alibaba.fastjson.parser.Feature[]) r2)     // Catch:{ Exception -> 0x003c }
                java.lang.String r1 = "JSON.parseObject(json.to…nce<Map<String, V>>() {})"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)     // Catch:{ Exception -> 0x003c }
                java.util.Map r11 = (java.util.Map) r11     // Catch:{ Exception -> 0x003c }
                goto L_0x0040
            L_0x003c:
                java.util.Map r11 = kotlin.collections.MapsKt.emptyMap()
            L_0x0040:
                com.iap.ac.config.lite.ConfigCenter r1 = com.iap.ac.config.lite.ConfigCenter.getInstance()
                java.lang.String r2 = "NearbyMeDetail"
                org.json.JSONObject r1 = r1.getSectionConfig(r2)
                if (r1 == 0) goto L_0x009c
                java.lang.String[] r2 = r10.$keys
                java.util.ArrayList r3 = new java.util.ArrayList
                int r4 = r2.length
                r3.<init>(r4)
                java.util.Collection r3 = (java.util.Collection) r3
                int r4 = r2.length
                r5 = 0
            L_0x0058:
                if (r5 >= r4) goto L_0x0099
                r6 = r2[r5]
                java.lang.Object r7 = r1.get(r6)
                if (r7 == 0) goto L_0x0076
                o.BridgeResponse r8 = r10.this$0
                o.PluginInstallCallback r8 = r8.serializer
                java.lang.String r7 = r7.toString()
                java.lang.Class<id.dana.data.nearbyme.model.MerchantConfigEntity> r9 = id.dana.data.nearbyme.model.MerchantConfigEntity.class
                java.lang.Object r7 = r8.deserialize(r7, r9)
                id.dana.data.nearbyme.model.MerchantConfigEntity r7 = (id.dana.data.nearbyme.model.MerchantConfigEntity) r7
                if (r7 != 0) goto L_0x0093
            L_0x0076:
                id.dana.data.nearbyme.model.MerchantConfigEntity r7 = new id.dana.data.nearbyme.model.MerchantConfigEntity
                java.lang.Object r6 = r11.get(r6)
                id.dana.data.nearbyme.model.MerchantConfigEntity r6 = (id.dana.data.nearbyme.model.MerchantConfigEntity) r6
                if (r6 == 0) goto L_0x008f
                boolean r6 = r6.getEnable()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                if (r6 == 0) goto L_0x008f
                boolean r6 = r6.booleanValue()
                goto L_0x0090
            L_0x008f:
                r6 = 0
            L_0x0090:
                r7.<init>(r6)
            L_0x0093:
                r3.add(r7)
                int r5 = r5 + 1
                goto L_0x0058
            L_0x0099:
                java.util.List r3 = (java.util.List) r3
                return r3
            L_0x009c:
                java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
                return r11
            L_0x00a1:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                goto L_0x00aa
            L_0x00a9:
                throw r11
            L_0x00aa:
                goto L_0x00a9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BridgeResponse.getMin.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Nullable
    public final Object getMerchantDetailConfig(@NotNull String[] strArr, boolean z, @NotNull Continuation<? super List<MerchantConfigEntity>> continuation) {
        return xp4.length(DeviceTokenClient.setMax(), new getMin(this, strArr, (Continuation) null), continuation);
    }
}
