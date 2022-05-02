package o;

import com.alipay.mobile.verifyidentity.base.message.ProductConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lid/dana/auth/face/FaceAuthResponse;", "", "result", "", "(Ljava/lang/String;)V", "<set-?>", "", "isEnabled", "()Z", "isFaceEnrollEnabled", "isVisible", "verifyId", "getVerifyId", "()Ljava/lang/String;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class prefix {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    private boolean getMin = true;
    private boolean setMax;
    @NotNull
    String setMin = "";

    public prefix(@Nullable String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(ProductConstants.KEY_PRODUCT_ENV_ZOLOZ).getJSONObject(ProductConstants.KEY_PRODUCT_STATE_ZOLOZ);
            if (jSONObject != null) {
                this.setMax = jSONObject.getBoolean(AppNode.AnonymousClass2.KEY_VISIBLE);
                this.getMin = jSONObject.getBoolean("enable");
                String string = jSONObject.getString("verifyId");
                Intrinsics.checkNotNullExpressionValue(string, "getString(ZOLOZ_OBJECT_VERIFY_ID)");
                this.setMin = string;
            }
        } catch (JSONException e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.FACE_LOGIN, DanaLogConstants.ExceptionType.FACE_ENROL_EXCEPTION, e.getMessage());
        }
    }

    public final boolean length() {
        if (this.setMax && !this.getMin) {
            if (this.setMin.length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/auth/face/FaceAuthResponse$Companion;", "", "()V", "SECVIAP_STATUS_ZOLOZ", "", "ZOLOZ_OBJECT_BIO_META_INFO", "ZOLOZ_OBJECT_ENABLE", "ZOLOZ_OBJECT_VERIFY_ID", "ZOLOZ_OBJECT_VISIBLE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
