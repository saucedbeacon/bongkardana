package o;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CreateDialogParam;
import o.TitleBarRightButtonView;
import o.UpdateAppCallback;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/geocode/repository/config/split/SplitGeocodeConfigEntityData;", "Lid/dana/data/geocode/repository/config/GeocodeConfigEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "getGeocodeReverseConfig", "Lio/reactivex/Observable;", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onEngineInitFailed implements CreatePromptParam {
    private final UpdateAppCallback splitFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<getRequestMainPackage, CreateDialogParam.AgreementClickListener> {
        public static final setMin length = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return setMin((getRequestMainPackage) obj);
        }

        private static CreateDialogParam.AgreementClickListener setMin(@NotNull getRequestMainPackage getrequestmainpackage) {
            Object obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax("geocode_reverse_config", false);
            if (CreateDialogParam.AgreementClickListener.class.isAssignableFrom(JSONArray.class)) {
                if (max == null) {
                    max = "";
                }
                obj = (CreateDialogParam.AgreementClickListener) new JSONArray(max);
            } else {
                if (max != null) {
                    Object obj2 = null;
                    if (max != null) {
                        try {
                            obj2 = new Gson().fromJson(new JSONObject(max).toString(), CreateDialogParam.AgreementClickListener.class);
                        } catch (Exception unused) {
                        }
                    }
                    if (obj2 != null) {
                        obj = obj2;
                    }
                }
                obj = JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_GEOCODE_REVERSE_CONFIG), CreateDialogParam.AgreementClickListener.class);
                Intrinsics.checkNotNull(obj);
            }
            return (CreateDialogParam.AgreementClickListener) obj;
        }
    }

    @Inject
    public onEngineInitFailed(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.splitFacade = updateAppCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<CreateDialogParam.AgreementClickListener> getGeocodeReverseConfig() {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new UpdateAppCallback.getMin(this.splitFacade));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …  trafficTypeDevice\n    }");
        TitleBarRightButtonView.AnonymousClass1<CreateDialogParam.AgreementClickListener> map = fromCallable.map(setMin.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeD…e\n            )\n        }");
        return map;
    }
}
