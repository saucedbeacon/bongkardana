package o;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import io.reactivex.annotations.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RVConfigService;
import o.RVLogger;
import o.TitleBarRightButtonView;
import o.getRequestMainPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\rH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\rH\u0002J,\u0010\u0011\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\r0\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/data/sendmoney/repository/source/split/SplitDigitalMoneyEntityData;", "Lid/dana/data/sendmoney/DigitalMoneyEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "getDigitalMoneyEntities", "Lkotlin/Function1;", "", "", "Lid/dana/data/sendmoney/model/DigitalMoneyResult;", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "getEWalletInnovConfig", "Lio/reactivex/Observable;", "Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "getEWalletPrefix", "getEwalletAffixList", "getEwalletList", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IIPCManager implements RVConfigService.OnConfigChangeListener {
    /* access modifiers changed from: private */
    public final UpdateAppCallback splitFacade;

    @Singleton
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bH\u0016J&\u0010\r\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b0\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/data/sendmoney/repository/source/split/SplitSendMoneyHomeMenuEntityData;", "Lid/dana/data/sendmoney/repository/source/SendMoneyHomeMenuEntityData;", "context", "Landroid/content/Context;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Landroid/content/Context;Lid/dana/data/toggle/SplitFacade;)V", "getSendMoneyCategories", "Lio/reactivex/Observable;", "", "", "getSendMoneyHomeMenus", "Lid/dana/data/sendmoney/model/SendMoneyHomeMenuEntity;", "getSendMoneyScenario", "Lkotlin/Function1;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Stub implements RVLogger.AnonymousClass1 {
        private final Context context;
        /* access modifiers changed from: private */
        public final UpdateAppCallback splitFacade;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        final class Proxy implements RedDotDrawable {
            private final /* synthetic */ Function1 getMax;

            Proxy(Function1 function1) {
                this.getMax = function1;
            }

            public final /* synthetic */ Object apply(@NonNull Object obj) {
                return this.getMax.invoke(obj);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class getMax<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
            public static final getMax getMin = new getMax();

            getMax() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1 r5;
                getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "send_money_scenarios", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_SENDMONEY_HOME_CATEGORY), List.class), true));
                Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
                if (min instanceof getSecondFloorView) {
                    r5 = ((getSecondFloorView) min).setMax();
                } else {
                    setTitleLoading settitleloading = new setTitleLoading(min);
                    RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                    r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
                }
                return r5;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/sendmoney/repository/source/split/SplitSendMoneyHomeMenuEntityData$getSendMoneyCategories$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
            public static final class setMin<T> implements updateProgress<T> {
                final /* synthetic */ Object $defaultValue;
                final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
                final /* synthetic */ String $splitName;
                final /* synthetic */ getRequestMainPackage this$0;

                public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                    this.this$0 = getrequestmainpackage;
                    this.$splitName = str;
                    this.$defaultValue = obj;
                    this.$isNeedToThrowWhenGotControl = z;
                }

                public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                    Intrinsics.checkNotNullParameter(r8, "emitter");
                    isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                        final /* synthetic */ setMin this$0;

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
        public Stub(@NotNull Context context2, @NotNull UpdateAppCallback updateAppCallback) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
            this.context = context2;
            this.splitFacade = updateAppCallback;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [o.IIPCManager$Stub$Proxy] */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.TitleBarRightButtonView.AnonymousClass1<java.util.List<o.getExtension>> getSendMoneyHomeMenus() {
            /*
                r3 = this;
                o.TitleBarRightButtonView$1 r0 = r3.getSendMoneyCategories()
                kotlin.jvm.functions.Function1 r1 = r3.getSendMoneyScenario()
                if (r1 == 0) goto L_0x0010
                o.IIPCManager$Stub$Proxy r2 = new o.IIPCManager$Stub$Proxy
                r2.<init>(r1)
                r1 = r2
            L_0x0010:
                o.RedDotDrawable r1 = (o.RedDotDrawable) r1
                o.TitleBarRightButtonView$1 r0 = r0.flatMap(r1)
                java.lang.String r1 = "getSendMoneyCategories()…p(getSendMoneyScenario())"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IIPCManager.Stub.getSendMoneyHomeMenus():o.TitleBarRightButtonView$1");
        }

        private final TitleBarRightButtonView.AnonymousClass1<List<String>> getSendMoneyCategories() {
            TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(getMax.getMin);
            Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
            return flatMap;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lid/dana/data/sendmoney/model/SendMoneyHomeMenuEntity;", "kotlin.jvm.PlatformType", "categories", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<List<? extends String>, TitleBarRightButtonView.AnonymousClass1<List<? extends getExtension>>> {
            final /* synthetic */ Stub this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(Stub stub) {
                super(1);
                this.this$0 = stub;
            }

            public final TitleBarRightButtonView.AnonymousClass1<List<getExtension>> invoke(@NotNull final List<String> list) {
                Intrinsics.checkNotNullParameter(list, "categories");
                TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.this$0.splitFacade.setMin.length(), 10000).flatMap(new RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends getExtension>>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                        Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                        TitleBarRightButtonView.AnonymousClass1 create = TitleBarRightButtonView.AnonymousClass1.create(new setMax(getrequestmainpackage, BaseAppContext.DEFAULT_SENDMONEY_HOME_MENU_SCENARIO, list, true, true));
                        Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…\n            })\n        }");
                        return create.map(AnonymousClass4.getMin);
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012,\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002 \u0007*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/ObservableEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getConfigsOnceReady$1"}, k = 3, mv = {1, 4, 2})
                    /* renamed from: o.IIPCManager$Stub$getMin$2$setMax */
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
                                    obj2 = new Gson().fromJson(new JSONObject(loadJSONFromAsset2).toString(), getExtension.class);
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
                                                                        t = new Gson().fromJson(new JSONObject(jSONObject).toString(), getExtension.class);
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
                                                            obj2 = new Gson().fromJson(new JSONObject(str2).toString(), getExtension.class);
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
                                                        map2.put(str, (getExtension) str3);
                                                        if (str3 != null) {
                                                        }
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type id.dana.data.sendmoney.model.SendMoneyHomeMenuEntity");
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
                                                linkedHashMap2.put(key, (getExtension) value);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type id.dana.data.sendmoney.model.SendMoneyHomeMenuEntity");
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
                Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…          }\n            }");
                return flatMap;
            }
        }

        private final Function1<List<String>, TitleBarRightButtonView.AnonymousClass1<List<getExtension>>> getSendMoneyScenario() {
            return new getMin(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMin(getrequestmainpackage, "ewallet_prefix_list", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_EWALLET_AFFIXES), List.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/sendmoney/repository/source/split/SplitDigitalMoneyEntityData$getEwalletAffixList$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public setMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), List.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ setMin this$0;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "result", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<? extends String>, List<? extends String>> {
        public static final setMin setMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "result");
            Iterable<String> mutableList = CollectionsKt.toMutableList(list);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
            for (String valueOf : mutableList) {
                arrayList.add("ewallet_".concat(String.valueOf(valueOf)));
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends currentThreadInArray>> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new C0103length(getrequestmainpackage, "ewallet_innov_config", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_EWALLET_INNOV_CONFIG), currentThreadInArray.class), true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/sendmoney/repository/source/split/SplitDigitalMoneyEntityData$getEWalletInnovConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.IIPCManager$length$length  reason: collision with other inner class name */
        public static final class C0103length<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public C0103length(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), currentThreadInArray.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ C0103length this$0;

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
    public IIPCManager(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.splitFacade = updateAppCallback;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o.IPCApiFactory] */
    /* JADX WARNING: type inference failed for: r2v1, types: [o.IPCApiFactory] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.TitleBarRightButtonView.AnonymousClass1<java.util.List<o.isInDomain>> getEWalletPrefix() {
        /*
            r3 = this;
            o.TitleBarRightButtonView$1 r0 = r3.getEwalletAffixList()
            o.IIPCManager$setMin r1 = o.IIPCManager.setMin.setMax
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            o.TitleBarRightButtonView$1 r0 = r0.map(r1)
            kotlin.jvm.functions.Function1 r1 = r3.getEwalletList()
            if (r1 == 0) goto L_0x0018
            o.IPCApiFactory r2 = new o.IPCApiFactory
            r2.<init>(r1)
            r1 = r2
        L_0x0018:
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r1)
            kotlin.jvm.functions.Function1 r1 = r3.getDigitalMoneyEntities()
            if (r1 == 0) goto L_0x002a
            o.IPCApiFactory r2 = new o.IPCApiFactory
            r2.<init>(r1)
            r1 = r2
        L_0x002a:
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            o.TitleBarRightButtonView$1 r0 = r0.map(r1)
            java.lang.String r1 = "getEwalletAffixList()\n  …etDigitalMoneyEntities())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IIPCManager.getEWalletPrefix():o.TitleBarRightButtonView$1");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "", "Lid/dana/data/sendmoney/model/DigitalMoneyResult;", "suffixKeys", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<List<? extends String>, TitleBarRightButtonView.AnonymousClass1<Map<String, ? extends calculateSize>>> {
        final /* synthetic */ IIPCManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(IIPCManager iIPCManager) {
            super(1);
            this.this$0 = iIPCManager;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Map<String, calculateSize>> invoke(@NotNull final List<String> list) {
            Intrinsics.checkNotNullParameter(list, "suffixKeys");
            if (list.isEmpty()) {
                TitleBarRightButtonView.AnonymousClass1<Map<String, calculateSize>> just = TitleBarRightButtonView.AnonymousClass1.just(new LinkedHashMap());
                Intrinsics.checkNotNullExpressionValue(just, "Observable.just(mutableMapOf())");
                return just;
            }
            TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.this$0.splitFacade.setMin.length(), 10000).flatMap(new RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Map<String, ? extends calculateSize>>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
                    Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
                    TitleBarRightButtonView.AnonymousClass1 create = TitleBarRightButtonView.AnonymousClass1.create(new getMin(getrequestmainpackage, BaseAppContext.DEFAULT_EWALLET_CATEGORY_LIST, list, false, true));
                    Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…\n            })\n        }");
                    return create;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012,\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002 \u0007*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/ObservableEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getConfigsOnceReady$1"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.IIPCManager$getMax$2$getMin */
                public static final class getMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<Map<String, ? extends T>> {
                    final /* synthetic */ boolean $isNeedToDeserialized;
                    final /* synthetic */ String $pathDefaultJsonValue;
                    final /* synthetic */ List $splitNames;
                    final /* synthetic */ boolean $throwExceptionIfControl;
                    final /* synthetic */ getRequestMainPackage this$0;

                    public getMin(getRequestMainPackage getrequestmainpackage, String str, List list, boolean z, boolean z2) {
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
                                obj2 = new Gson().fromJson(new JSONObject(loadJSONFromAsset2).toString(), calculateSize.class);
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
                            final /* synthetic */ getMin this$0;

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
                                                                    t = new Gson().fromJson(new JSONObject(jSONObject).toString(), calculateSize.class);
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
                                                        obj2 = new Gson().fromJson(new JSONObject(str2).toString(), calculateSize.class);
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
                                                    map2.put(str, (calculateSize) str3);
                                                    if (str3 != null) {
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type id.dana.data.sendmoney.model.DigitalMoneyResult");
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
                                            linkedHashMap2.put(key, (calculateSize) value);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type id.dana.data.sendmoney.model.DigitalMoneyResult");
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
            Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…  )\n                    }");
            return flatMap;
        }
    }

    private final Function1<List<String>, TitleBarRightButtonView.AnonymousClass1<Map<String, calculateSize>>> getEwalletList() {
        return new getMax(this);
    }

    private final Function1<Map<String, calculateSize>, List<isInDomain>> getDigitalMoneyEntities() {
        return setMax.INSTANCE;
    }

    private final TitleBarRightButtonView.AnonymousClass1<List<String>> getEwalletAffixList() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(getMin.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<currentThreadInArray> getEWalletInnovConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(length.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "resultMap", "", "", "Lid/dana/data/sendmoney/model/DigitalMoneyResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Map<String, ? extends calculateSize>, List<isInDomain>> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        @NotNull
        public final List<isInDomain> invoke(@NotNull Map<String, calculateSize> map) {
            Intrinsics.checkNotNullParameter(map, HummerConstants.RESULT_MAP);
            Collection arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(new isInDomain(((calculateSize) next.getValue()).getInstId(), (String) next.getKey(), ((calculateSize) next.getValue()).getBankName(), ((calculateSize) next.getValue()).getEWalletName(), ((calculateSize) next.getValue()).getIdentifier()));
            }
            return CollectionsKt.toMutableList((List) arrayList);
        }
    }
}
