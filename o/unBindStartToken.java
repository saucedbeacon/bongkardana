package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.getRequestMainPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/sendmoney/repository/source/split/SplitAddPayMethodConfig;", "Lid/dana/data/sendmoney/AddPayMethodConfigEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "getAddPayMethodConfig", "Lio/reactivex/Observable;", "", "", "Lid/dana/domain/sendmoney/model/AddPayMethod;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class unBindStartToken implements RVAccountService {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String EMPTY_JSON_ARRAY = "[]";
    private final UpdateAppCallback splitFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "Lid/dana/domain/sendmoney/model/AddPayMethod;", "kotlin.jvm.PlatformType", "baseTrafficType", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Map<String, addExtraDataParser>>> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r0;
            final getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "baseTrafficType");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "sendmoney_add_paymethod_section", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SEND_MONEY_PAYMETHOD_SECTION), List.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r0 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r0 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r0.switchMap(new RedDotDrawable<List<? extends String>, TitleBarRightButtonView.AnonymousClass4<? extends Map<String, addExtraDataParser>>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    Intrinsics.checkNotNullParameter(list, "it");
                    TitleBarRightButtonView.AnonymousClass1 create = TitleBarRightButtonView.AnonymousClass1.create(new C0068getMin(getrequestmainpackage, BaseAppContext.DEFAULT_PAYMENT_METHODS, list, true, true));
                    Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…\n            })\n        }");
                    return create.switchMap(AnonymousClass4.setMin);
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012,\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002 \u0007*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/ObservableEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getConfigsOnceReady$1"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.unBindStartToken$getMin$5$getMin  reason: collision with other inner class name */
                public static final class C0068getMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<Map<String, ? extends T>> {
                    final /* synthetic */ boolean $isNeedToDeserialized;
                    final /* synthetic */ String $pathDefaultJsonValue;
                    final /* synthetic */ List $splitNames;
                    final /* synthetic */ boolean $throwExceptionIfControl;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public C0068getMin(getRequestMainPackage getrequestmainpackage, String str, List list, boolean z, boolean z2) {
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
                                obj2 = new Gson().fromJson(new JSONObject(loadJSONFromAsset2).toString(), addExtraDataParser.class);
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
                            final /* synthetic */ C0068getMin this$0;

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
                                                                    t = new Gson().fromJson(new JSONObject(jSONObject).toString(), addExtraDataParser.class);
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
                                                        obj2 = new Gson().fromJson(new JSONObject(str2).toString(), addExtraDataParser.class);
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
                                                    map2.put(str, (addExtraDataParser) str3);
                                                    if (str3 != null) {
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type id.dana.domain.sendmoney.model.AddPayMethod");
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
                                            linkedHashMap2.put(key, (addExtraDataParser) value);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type id.dana.domain.sendmoney.model.AddPayMethod");
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
            });
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/sendmoney/repository/source/split/SplitAddPayMethodConfig$getAddPayMethodConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMax<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Inject
    public unBindStartToken(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.splitFacade = updateAppCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, addExtraDataParser>> getAddPayMethodConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> switchMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).switchMap(getMin.setMin);
        Intrinsics.checkNotNullExpressionValue(switchMap, "splitFacade.trafficTypeU…          }\n            }");
        return switchMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/sendmoney/repository/source/split/SplitAddPayMethodConfig$Companion;", "", "()V", "EMPTY_JSON_ARRAY", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
