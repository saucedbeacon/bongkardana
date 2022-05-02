package o;

import com.alibaba.fastjson.JSONObject;
import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.getonlineconfig.GetOnlineConfigBridge;
import kotlin.Metadata;
import o.GriverAmcsConfig;
import o.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementResultFactory;", "", "()V", "getError", "Lcom/alibaba/fastjson/JSONObject;", "errorCode", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class neutralButton {
    @NotNull
    public static final neutralButton INSTANCE = new neutralButton();

    /* renamed from: o.neutralButton$default  reason: invalid class name */
    public final class Cdefault implements getBindingAdapter<GetOnlineConfigBridge> {
        private final b.C0007b<GriverAmcsConfig.AnonymousClass2> getH5OnlineConfigProvider;

        public Cdefault(b.C0007b<GriverAmcsConfig.AnonymousClass2> bVar) {
            this.getH5OnlineConfigProvider = bVar;
        }

        public static getBindingAdapter<GetOnlineConfigBridge> create(b.C0007b<GriverAmcsConfig.AnonymousClass2> bVar) {
            return new Cdefault(bVar);
        }

        public final void injectMembers(GetOnlineConfigBridge getOnlineConfigBridge) {
            injectGetH5OnlineConfig(getOnlineConfigBridge, this.getH5OnlineConfigProvider.get());
        }

        @InjectedFieldSignature("id.dana.danah5.getonlineconfig.GetOnlineConfigBridge.getH5OnlineConfig")
        public static void injectGetH5OnlineConfig(GetOnlineConfigBridge getOnlineConfigBridge, GriverAmcsConfig.AnonymousClass2 r1) {
            getOnlineConfigBridge.getH5OnlineConfig = r1;
        }
    }

    private neutralButton() {
    }

    @NotNull
    public final JSONObject getError(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) Integer.valueOf(i));
        return jSONObject;
    }
}
