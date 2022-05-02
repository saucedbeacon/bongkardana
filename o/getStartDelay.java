package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\r\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u000eJ\u0010\u0010\u001e\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010!\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006("}, d2 = {"Lid/dana/contract/deeplink/DeeplinkSaveDataManager;", "", "()V", "cashierUrl", "", "codeValue", "isNeedOpenCashierAcAfterReLogin", "", "Ljava/lang/Boolean;", "isNeedOpenCashierAfterReLogin", "isNeedResetSavedData", "ott", "ottListener", "Lkotlin/Function0;", "", "phoneNumber", "requestUrlId", "", "Ljava/lang/Integer;", "getCashierUrlData", "getCodeValue", "getOttData", "getPhoneNumberData", "getRequestUrlId", "()Ljava/lang/Integer;", "invoke", "activity", "Landroid/app/Activity;", "resetCodeValue", "resetSavedData", "saveCashierUrlData", "saveCodeValue", "saveOttData", "savePhoneNumberData", "setNeedOpenCashierAcAfterReLogin", "setNeedOpenCashierAfterReLogin", "isNeedVerifyPhoneNumberAfterReLogin", "setNeedResetSavedData", "isNeedResetData", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getStartDelay {
    @NotNull
    public static final getMax IsOverlapping = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public static getStartDelay toDoubleRange;
    private Function0<Unit> equals;
    public Boolean getMax;
    public String getMin;
    public Integer isInside;
    public String length;
    public String setMax;
    public String setMin;
    public Boolean toFloatRange;
    public Boolean toIntRange;

    @JvmStatic
    @NotNull
    public static final getStartDelay IsOverlapping() {
        return IsOverlapping.setMin();
    }

    public final boolean getMax() {
        Boolean bool = this.getMax;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getMin() {
        Boolean bool = this.toIntRange;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean setMin() {
        Boolean bool = this.toFloatRange;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void setMax() {
        this.setMax = null;
        this.setMin = null;
        this.getMin = null;
        this.equals = null;
        this.getMax = null;
        this.toFloatRange = null;
        this.isInside = null;
        toDoubleRange = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/contract/deeplink/DeeplinkSaveDataManager$Companion;", "", "()V", "instance", "Lid/dana/contract/deeplink/DeeplinkSaveDataManager;", "getInstance", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public final getStartDelay setMin() {
            getStartDelay length;
            getStartDelay length2 = getStartDelay.toDoubleRange;
            if (length2 != null) {
                return length2;
            }
            synchronized (this) {
                length = getStartDelay.toDoubleRange;
                if (length == null) {
                    getStartDelay.toDoubleRange = new getStartDelay();
                    length = getStartDelay.toDoubleRange;
                    Intrinsics.checkNotNull(length);
                }
            }
            return length;
        }
    }
}
