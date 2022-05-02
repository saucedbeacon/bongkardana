package o;

import id.dana.data.Source;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.usereducation.constant.BottomSheetType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/data/saving/repository/source/network/NetworkSavingWithdrawEntityData;", "Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "serializer", "Lid/dana/data/storage/Serializer;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/storage/Serializer;Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "createSplitConfigData", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "getFromAmcs", "", "", "getSavingSection", "Lorg/json/JSONObject;", "getWithdrawOption", "Lio/reactivex/Observable;", "getWithdrawOptionString", "config", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class gwUrl implements isUrgent {
    private final onCallBack configEntityDataFactory;
    private final PluginInstallCallback serializer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Throwable, List<String>> {
        final /* synthetic */ gwUrl getMin;

        setMax(gwUrl gwurl) {
            this.getMin = gwurl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return this.getMin.getFromAmcs();
        }
    }

    @Inject
    public gwUrl(@NotNull PluginInstallCallback pluginInstallCallback, @NotNull onCallBack oncallback) {
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        this.serializer = pluginInstallCallback;
        this.configEntityDataFactory = oncallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWithdrawOption() {
        AppMsgReceiver.AnonymousClass2 createSplitConfigData = createSplitConfigData();
        Intrinsics.checkNotNullExpressionValue(createSplitConfigData, "createSplitConfigData()");
        TitleBarRightButtonView.AnonymousClass1<List<String>> onErrorReturn = createSplitConfigData.getSavingWithdrawOptionsConfig().onErrorReturn(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "createSplitConfigData().…rReturn { getFromAmcs() }");
        return onErrorReturn;
    }

    /* access modifiers changed from: private */
    public final List<String> getFromAmcs() {
        ArrayList arrayList = new ArrayList();
        JSONObject savingSection = getSavingSection();
        if (savingSection != null) {
            String jSONObject = savingSection.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "it.toString()");
            List<String> deserializeList = this.serializer.deserializeList(getWithdrawOptionString(jSONObject));
            Intrinsics.checkNotNullExpressionValue(deserializeList, BottomSheetType.LIST);
            for (String add : deserializeList) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    private final String getWithdrawOptionString(String str) {
        Map<String, String> deserializeMap = this.serializer.deserializeMap(str);
        Intrinsics.checkNotNullExpressionValue(deserializeMap, "serializer.deserializeMap(config)");
        for (Map.Entry next : deserializeMap.entrySet()) {
            if (Intrinsics.areEqual((Object) (String) next.getKey(), (Object) "saving_withdraw_option")) {
                Object value = next.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "it.value");
                return (String) value;
            }
        }
        return "[]";
    }

    private final JSONObject getSavingSection() {
        return fromString.getSection(DanaLogConstants.TAG.SAVING);
    }

    private final AppMsgReceiver.AnonymousClass2 createSplitConfigData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }
}
