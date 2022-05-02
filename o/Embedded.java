package o;

import android.app.Activity;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.SecVIVerify;
import com.alipay.mobile.verifyidentity.business.activity.SecVIVerifyInterface;
import com.alipay.mobile.verifyidentity.framework.engine.QueryStateInterface;
import com.alipay.mobile.verifyidentity.framework.engine.SecVIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIAction;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIResult;
import id.dana.auth.face.FaceAuthenticationKybException;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fJ\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/auth/face/FaceAuthenticationProxy;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "tag", "", "kotlin.jvm.PlatformType", "doFaceAuth", "", "result", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIResult;", "callback", "Lid/dana/auth/face/StartFaceAuthCallback;", "doFaceEnrol", "Lid/dana/auth/face/StartFaceEnrolmentCallback;", "getFaceAuthErrorCode", "", "", "queryEnrolment", "queryStateInterface", "Lcom/alipay/mobile/verifyidentity/framework/engine/QueryStateInterface;", "setUserId", "userId", "startFaceAuth", "verifyId", "startFaceEnrolment", "startFaceQuery", "Lid/dana/auth/face/StartFaceQueryCallback;", "startVerify", "viListener", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIEngine$VIListener;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class Embedded {
    @NotNull
    public static final length getMax = new length((byte) 0);
    private final Activity getMin;
    private final String length = Embedded.class.getSimpleName();

    @Inject
    public Embedded(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        this.getMin = activity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/auth/face/FaceAuthenticationProxy$startFaceAuth$1", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIEngine$VIListener;", "onVerifyAction", "", "viAction", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIAction;", "onVerifyResult", "result", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements VIEngine.VIListener {
        final /* synthetic */ entity getMax;
        final /* synthetic */ Embedded length;

        public final void onVerifyAction(@NotNull VIAction vIAction) {
            Intrinsics.checkNotNullParameter(vIAction, "viAction");
        }

        public getMax(Embedded embedded, entity entity) {
            this.length = embedded;
            this.getMax = entity;
        }

        public final void onVerifyResult(@Nullable VIResult vIResult) {
            if (vIResult != null) {
                Embedded.setMax(this.length, vIResult, this.getMax);
            } else {
                this.getMax.onFailVerifyAuth(1001);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/auth/face/FaceAuthenticationProxy$startFaceQuery$1", "Lcom/alipay/mobile/verifyidentity/framework/engine/QueryStateInterface;", "getFaceState", "", "result", "", "getFingerState", "s", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements QueryStateInterface {
        final /* synthetic */ inheritSuperIndices setMin;

        public final void getFingerState(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "s");
        }

        getMin(inheritSuperIndices inheritsuperindices) {
            this.setMin = inheritsuperindices;
        }

        public final void getFaceState(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "result");
            prefix prefix = new prefix(str);
            if (prefix.length()) {
                this.setMin.onSuccessFaceQuery(prefix.setMin);
            } else {
                this.setMin.onFailFaceQuery(1001);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/auth/face/FaceAuthenticationProxy$startFaceEnrolment$1", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIEngine$VIListener;", "onVerifyAction", "", "viAction", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIAction;", "onVerifyResult", "result", "Lcom/alipay/mobile/verifyidentity/framework/engine/VIResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements VIEngine.VIListener {
        final /* synthetic */ Embedded setMax;
        final /* synthetic */ viewName setMin;

        public final void onVerifyAction(@NotNull VIAction vIAction) {
            Intrinsics.checkNotNullParameter(vIAction, "viAction");
        }

        public setMax(Embedded embedded, viewName viewname) {
            this.setMax = embedded;
            this.setMin = viewname;
        }

        public final void onVerifyResult(@Nullable VIResult vIResult) {
            if (vIResult != null) {
                Embedded.getMin(vIResult, this.setMin);
            } else {
                this.setMin.onFailVerifyEnrolment(1001);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/auth/face/FaceAuthenticationProxy$setUserId$1", "Lcom/alipay/mobile/verifyidentity/business/activity/SecVIVerifyInterface;", "tntInstId", "", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements SecVIVerifyInterface {
        final /* synthetic */ String length;

        @Nullable
        public final String tntInstId() {
            return null;
        }

        setMin(String str) {
            this.length = str;
        }

        @NotNull
        public final String userId() {
            return this.length;
        }
    }

    public final void length(String str, VIEngine.VIListener vIListener) {
        HashMap hashMap = new HashMap();
        hashMap.put("verifyId", str);
        hashMap.put("verifyType", "1");
        VIEngine.startVerify(this.getMin, RequestConstants.VerifyProductVerify, hashMap, (Map<String, String>) null, vIListener, (VIEngine.OnQueryResult) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/auth/face/FaceAuthenticationProxy$Companion;", "", "()V", "SEC_VI_KEY_PRODUCT_CODE", "", "SEC_VI_KEY_SCENE_ID", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void getMin(@NotNull String str, @NotNull inheritSuperIndices inheritsuperindices) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(inheritsuperindices, "callback");
        SecVIVerify.setSecVIVerifyInterface(new setMin(str));
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", "dana_app_securitysetting");
        hashMap.put("productCode", "FACE_ENROLL");
        SecVIEngine.queryAuthenticationStatusWithOption(this.getMin, 3, hashMap, new getMin(inheritsuperindices));
    }

    public static final /* synthetic */ void setMax(Embedded embedded, VIResult vIResult, entity entity) {
        if (vIResult.getResult() == 1000) {
            entity.onSuccessVerifyAuth(vIResult.getVerifyId());
            return;
        }
        if (!CollectionsKt.arrayListOf(1003, 1001, 1006, 1005).contains(Integer.valueOf(vIResult.getResult()))) {
            StringBuilder sb = new StringBuilder("Error Code : ");
            sb.append(vIResult.getResult());
            sb.append("\nError Message : ");
            sb.append(vIResult.getMessage());
            String obj = sb.toString();
            setStateOff.length(embedded.length, obj, new FaceAuthenticationKybException(obj));
        }
        entity.onFailVerifyAuth(vIResult.getResult());
    }

    public static final /* synthetic */ void getMin(VIResult vIResult, viewName viewname) {
        if (vIResult.getResult() == 1000) {
            viewname.onSuccessVerifyEnrolment();
        } else {
            viewname.onFailVerifyEnrolment(vIResult.getResult());
        }
    }
}
