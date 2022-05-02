package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.RVConfigService;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r*\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/data/sendmoney/repository/source/amcs/AmcsDigitalMoneyEntityData;", "Lid/dana/data/sendmoney/DigitalMoneyEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;Lid/dana/data/storage/Serializer;)V", "getEWalletInnovConfig", "Lio/reactivex/Observable;", "Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "getEWalletPrefix", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "getEWalletSection", "Lorg/json/JSONObject;", "getPrefixes", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class startPhase implements RVConfigService.OnConfigChangeListener {
    /* access modifiers changed from: private */
    public final PluginInstallCallback serializer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "kotlin.jvm.PlatformType", "eWalletSection", "Lorg/json/JSONObject;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<JSONObject, List<? extends isInDomain>> {
        final /* synthetic */ startPhase length;

        setMin(startPhase startphase) {
            this.length = startphase;
        }

        public final /* synthetic */ Object apply(Object obj) {
            isInDomain isindomain;
            JSONObject jSONObject = (JSONObject) obj;
            Intrinsics.checkNotNullParameter(jSONObject, "eWalletSection");
            List<String> access$getPrefixes = this.length.getPrefixes(jSONObject);
            if (access$getPrefixes == null) {
                return null;
            }
            Collection arrayList = new ArrayList();
            for (String str : access$getPrefixes) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ewallet_".concat(String.valueOf(str)));
                if (jSONObject2 != null) {
                    Object deserialize = this.length.serializer.deserialize(jSONObject2.toString(), calculateSize.class);
                    Intrinsics.checkNotNullExpressionValue(deserialize, "serializer.deserialize(j…lMoneyResult::class.java)");
                    isindomain = removeOnMain.toDigitalMoneyEntity((calculateSize) deserialize, str);
                } else {
                    isindomain = null;
                }
                if (isindomain != null) {
                    arrayList.add(isindomain);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "kotlin.jvm.PlatformType", "item", "Lorg/json/JSONObject;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<JSONObject, currentThreadInArray> {
        final /* synthetic */ startPhase getMax;

        getMin(startPhase startphase) {
            this.getMax = startphase;
        }

        public final /* synthetic */ Object apply(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            Intrinsics.checkNotNullParameter(jSONObject, "item");
            Object obj2 = jSONObject.get("ewallet_innov_config");
            return (currentThreadInArray) this.getMax.serializer.deserialize(obj2 != null ? obj2.toString() : null, currentThreadInArray.class);
        }
    }

    @Inject
    public startPhase(@NotNull Context context, @NotNull AppPausePoint appPausePoint, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function0<JSONObject> {
        getMax(startPhase startphase) {
            super(0, startphase, startPhase.class, "getEWalletSection", "getEWalletSection()Lorg/json/JSONObject;", 0);
        }

        @Nullable
        public final JSONObject invoke() {
            return ((startPhase) this.receiver).getEWalletSection();
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<isInDomain>> getEWalletPrefix() {
        TitleBarRightButtonView.AnonymousClass1<List<isInDomain>> map = TitleBarRightButtonView.AnonymousClass1.fromCallable(new stopPhase(new getMax(this))).map(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(map, "Observable.fromCallable(…}\n            }\n        }");
        return map;
    }

    /* access modifiers changed from: private */
    public final List<String> getPrefixes(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("ewallet_prefix_list");
        if (jSONArray == null) {
            return null;
        }
        Object fromJson = new Gson().fromJson(jSONArray.toString(), String[].class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(it.toStr…rray<String>::class.java)");
        return ArraysKt.toList((T[]) (Object[]) fromJson);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function0<JSONObject> {
        length(startPhase startphase) {
            super(0, startphase, startPhase.class, "getEWalletSection", "getEWalletSection()Lorg/json/JSONObject;", 0);
        }

        @Nullable
        public final JSONObject invoke() {
            return ((startPhase) this.receiver).getEWalletSection();
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<currentThreadInArray> getEWalletInnovConfig() {
        TitleBarRightButtonView.AnonymousClass1<currentThreadInArray> map = TitleBarRightButtonView.AnonymousClass1.fromCallable(new stopPhase(new length(this))).map(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(map, "Observable.fromCallable(…          }\n            }");
        return map;
    }

    /* access modifiers changed from: private */
    public final JSONObject getEWalletSection() {
        return ConfigCenter.getInstance().getSectionConfig("EWallet");
    }
}
