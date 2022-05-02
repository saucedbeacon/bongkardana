package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.data.nearbyme.model.MerchantConfigEntity;
import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.getRequestMainPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lid/dana/data/nearbyme/repository/source/split/SplitMerchantConfigEntity;", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "getMerchantDetailConfig", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "keys", "", "", "default", "", "([Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCallMode implements getRenderById {
    /* access modifiers changed from: private */
    public final UpdateAppCallback splitFacade;

    @Inject
    public getCallMode(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.splitFacade = updateAppCallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/data/nearbyme/model/MerchantConfigEntity;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.source.split.SplitMerchantConfigEntity$getMerchantDetailConfig$2", f = "SplitMerchantConfigEntity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class setMin extends SuspendLambda implements Function2<initToken, Continuation<? super List<? extends MerchantConfigEntity>>, Object> {
        final /* synthetic */ String[] $keys;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ getCallMode this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getCallMode getcallmode, String[] strArr, Continuation continuation) {
            super(2, continuation);
            this.this$0 = getcallmode;
            this.$keys = strArr;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            setMin setmin = new setMin(this.this$0, this.$keys, continuation);
            setmin.L$0 = obj;
            return setmin;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return CollectionsKt.toList(((Map) getMinimumFontSize.timeoutForFirstEmit(this.this$0.splitFacade.setMin.length(), 10000).flatMap(new RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Map<String, ? extends MerchantConfigEntity>>>(this) {
                    final /* synthetic */ setMin length;

                    {
                        this.length = r1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                        Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                        TitleBarRightButtonView.AnonymousClass1 create = TitleBarRightButtonView.AnonymousClass1.create(new setMax(getrequestmainpackage, BaseAppContext.DEFAULT_NEARBY_MERCHANT_CONFIG, ArraysKt.asList((T[]) this.length.$keys), false, true));
                        Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…\n            })\n        }");
                        return create;
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012,\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002 \u0007*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/ObservableEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getConfigsOnceReady$1"}, k = 3, mv = {1, 4, 2})
                    /* renamed from: o.getCallMode$setMin$1$setMax */
                    public static final class setMax<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<Map<String, ? extends T>> {
                        final /* synthetic */ boolean $isNeedToDeserialized;
                        final /* synthetic */ String $pathDefaultJsonValue;
                        final /* synthetic */ List $splitNames;
                        final /* synthetic */ boolean $throwExceptionIfControl;
                        final /* synthetic */ getRequestMainPackage this$0;

                        public setMax(getRequestMainPackage getrequestmainpackage, String str, List list, boolean z, boolean z2) {
                            this.this$0 = getrequestmainpackage;
                            this.$pathDefaultJsonValue = str;
                            this.$splitNames = list;
                            this.$throwExceptionIfControl = z;
                            this.$isNeedToDeserialized = z2;
                        }

                        public final void subscribe(@NotNull TitleBarRightButtonView.AnonymousClass2<Map<String, T>> r11) {
                            Map map;
                            final Object obj;
                            Object obj2;
                            Intrinsics.checkNotNullParameter(r11, "emitter");
                            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.this$0.length, this.$pathDefaultJsonValue);
                            if (loadJSONFromAsset == null) {
                                try {
                                    map = MapsKt.emptyMap();
                                } catch (Exception unused) {
                                    map = MapsKt.emptyMap();
                                }
                            } else {
                                Object parseObject = JSON.parseObject(new JSONObject(loadJSONFromAsset).toString(), new TypeReference<Map<String, ? extends T>>() {
                                }, new Feature[0]);
                                Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
                                map = (Map) parseObject;
                            }
                            final Map map2 = map;
                            String loadJSONFromAsset2 = getPositiveString.loadJSONFromAsset(this.this$0.length, this.$pathDefaultJsonValue);
                            if (loadJSONFromAsset2 == null) {
                                obj = null;
                            } else {
                                try {
                                    obj2 = new Gson().fromJson(new JSONObject(loadJSONFromAsset2).toString(), MerchantConfigEntity.class);
                                } catch (Exception unused2) {
                                    obj2 = null;
                                }
                                obj = obj2;
                            }
                            Iterable<String> iterable = this.$splitNames;
                            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                            for (String str : iterable) {
                                arrayList.add(TuplesKt.to(str, null));
                            }
                            final Map mutableMap = MapsKt.toMutableMap(MapsKt.toMap((List) arrayList));
                            final TitleBarRightButtonView.AnonymousClass2<Map<String, T>> r6 = r11;
                            isUesCacheLocation.getMax().length(this.$splitNames, this.this$0.setMin(), new sendEndMsg(this) {
                                final /* synthetic */ setMax this$0;

                                {
                                    this.this$0 = r1;
                                }

                                public final void onComplete(@Nullable Map<String, ? extends getSystemLocation> map) {
                                    if (map != null) {
                                        this.this$0.this$0.setMin(map);
                                        for (Map.Entry next : map.entrySet()) {
                                            final String str = (String) next.getKey();
                                            getSystemLocation getsystemlocation = (getSystemLocation) next.getValue();
                                            final getRequestMainPackage getrequestmainpackage = this.this$0.this$0;
                                            boolean z = this.this$0.$throwExceptionIfControl;
                                            Map map2 = mutableMap;
                                            final Map map3 = map2;
                                            final Object obj = obj;
                                            boolean z2 = this.this$0.$isNeedToDeserialized;
                                            if (Intrinsics.areEqual((Object) getsystemlocation.getMax, (Object) "control")) {
                                                if (!z) {
                                                    Intrinsics.checkNotNullParameter(map3, "defaultMapValue");
                                                    Object invoke = new getRequestMainPackage.setMin(getrequestmainpackage, map3, obj).invoke(str);
                                                    if (invoke != null) {
                                                        map2.put(str, invoke);
                                                    }
                                                } else {
                                                    isSync issync = isSync.INSTANCE;
                                                    Object invoke2 = new Function1<String, T>() {
                                                        public final T invoke(@NotNull String str) {
                                                            String jSONObject;
                                                            Intrinsics.checkNotNullParameter(str, "key");
                                                            JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig(str);
                                                            if (!(jSONConfig == null || (jSONObject = jSONConfig.toString()) == null)) {
                                                                T t = null;
                                                                if (jSONObject != null) {
                                                                    try {
                                                                        t = new Gson().fromJson(new JSONObject(jSONObject).toString(), MerchantConfigEntity.class);
                                                                    } catch (Exception unused) {
                                                                    }
                                                                }
                                                                if (t != null) {
                                                                    return t;
                                                                }
                                                            }
                                                            isSync issync = isSync.INSTANCE;
                                                            getRequestMainPackage getrequestmainpackage = getrequestmainpackage;
                                                            Map map = map3;
                                                            Object obj = obj;
                                                            Intrinsics.checkNotNullParameter(map, "defaultMapValue");
                                                            return new getRequestMainPackage.setMin(getrequestmainpackage, map, obj).invoke(str);
                                                        }
                                                    }.invoke(str);
                                                    if (invoke2 != null) {
                                                        map2.put(str, invoke2);
                                                    }
                                                }
                                            } else if (z2) {
                                                String str2 = getsystemlocation.getMin;
                                                if (str2 != null) {
                                                    Object obj2 = null;
                                                    if (str2 != null) {
                                                        try {
                                                            obj2 = new Gson().fromJson(new JSONObject(str2).toString(), MerchantConfigEntity.class);
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                    if (obj2 != null) {
                                                        map2.put(str, obj2);
                                                        if (obj2 != null) {
                                                        }
                                                    }
                                                }
                                                Intrinsics.checkNotNullParameter(map3, "defaultMapValue");
                                                Object invoke3 = new getRequestMainPackage.setMin(getrequestmainpackage, map3, obj).invoke(str);
                                                if (invoke3 != null) {
                                                    map2.put(str, invoke3);
                                                    Unit unit = Unit.INSTANCE;
                                                }
                                            } else {
                                                String str3 = getsystemlocation.getMin;
                                                if (str3 != null) {
                                                    if (str3 != null) {
                                                        map2.put(str, (MerchantConfigEntity) str3);
                                                        if (str3 != null) {
                                                        }
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type id.dana.data.nearbyme.model.MerchantConfigEntity");
                                                    }
                                                }
                                                Intrinsics.checkNotNullParameter(map3, "defaultMapValue");
                                                Object invoke4 = new getRequestMainPackage.setMin(getrequestmainpackage, map3, obj).invoke(str);
                                                if (invoke4 != null) {
                                                    map2.put(str, invoke4);
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                            }
                                        }
                                        TitleBarRightButtonView.AnonymousClass2 r12 = r6;
                                        Map map4 = mutableMap;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry entry : map4.entrySet()) {
                                            if (entry.getValue() != null) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        Map map5 = linkedHashMap;
                                        Map linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(map5.size()));
                                        for (Map.Entry entry2 : map5.entrySet()) {
                                            Object key = entry2.getKey();
                                            Object value = entry2.getValue();
                                            if (value != null) {
                                                linkedHashMap2.put(key, (MerchantConfigEntity) value);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type id.dana.data.nearbyme.model.MerchantConfigEntity");
                                            }
                                        }
                                        r12.onNext(linkedHashMap2);
                                        r6.onComplete();
                                        return;
                                    }
                                    r6.onError(new SplitNull(this.this$0.$splitNames.toString()));
                                }

                                public final void onError() {
                                    r6.onError(new SplitException("Error when get configs once ready"));
                                }
                            });
                        }
                    }
                }).observeOn(setCursiveFontFamily.asScheduler((initToken) this.L$0)).blockingFirst()).values());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public final Object getMerchantDetailConfig(@NotNull String[] strArr, boolean z, @NotNull Continuation<? super List<MerchantConfigEntity>> continuation) {
        return xp4.length(DeviceTokenClient.setMax(), new setMin(this, strArr, (Continuation) null), continuation);
    }
}
