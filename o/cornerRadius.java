package o;

import id.dana.data.h5event.sendmoney.CheckoutFinishEntity;
import id.dana.data.h5event.sendmoney.PayQueryResponse;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/danah5/globalnetwork/manager/CheckoutFinishGnEventPluginManager;", "", "remoteGnPaymentEntityData", "Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;", "(Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;)V", "getPayStatus", "", "status", "getPayStatus$app_productionRelease", "isAcCashierGnScenario", "", "checkoutFinishEntity", "Lid/dana/data/h5event/sendmoney/CheckoutFinishEntity;", "isGnScenario", "sendCallbackResult", "", "sendCallbackResultWithoutCallback", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class cornerRadius {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    @NotNull
    public static final String GN_NETWORK_CASHIER_SCENARIO = "CASHIER_ISSUER";
    @NotNull
    public static final String GN_NETWORK_INFO_NAME = "GN";
    @NotNull
    public static final String GN_NETWORK_INFO_NAME_LOCAL_MP = "ALIPAY";
    @NotNull
    public static final String GN_NETWORK_INFO_SCENE = "ACIS";
    @NotNull
    public static final String GN_NETWORK_INFO_SCENE_LOCAL_MP = "GLOCAL";
    private final DefaultEmbedViewManager remoteGnPaymentEntityData;

    public cornerRadius(@NotNull DefaultEmbedViewManager defaultEmbedViewManager) {
        Intrinsics.checkNotNullParameter(defaultEmbedViewManager, "remoteGnPaymentEntityData");
        this.remoteGnPaymentEntityData = defaultEmbedViewManager;
    }

    /* renamed from: o.cornerRadius$default  reason: invalid class name */
    public class Cdefault {
        private String amount;
        private String country;
        private String symbol;

        public String getAmount() {
            return this.amount;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public String getSymbol() {
            return this.symbol;
        }

        public void setSymbol(String str) {
            this.symbol = str;
        }

        public String getCountry() {
            return this.country;
        }

        public void setCountry(String str) {
            this.country = str;
        }
    }

    public final boolean isGnScenario(@NotNull CheckoutFinishEntity checkoutFinishEntity) {
        isEnableTabClick attributes;
        Intrinsics.checkNotNullParameter(checkoutFinishEntity, "checkoutFinishEntity");
        PayQueryResponse payQueryResponse = checkoutFinishEntity.getPayQueryResponse();
        if (!(payQueryResponse == null || (attributes = payQueryResponse.getAttributes()) == null)) {
            if (Intrinsics.areEqual((Object) attributes.getNetworkInfoName(), (Object) GN_NETWORK_INFO_NAME) && Intrinsics.areEqual((Object) attributes.getNetworkInfoScene(), (Object) GN_NETWORK_INFO_SCENE)) {
                return true;
            }
            if (!Intrinsics.areEqual((Object) attributes.getNetworkInfoName(), (Object) GN_NETWORK_INFO_NAME_LOCAL_MP) || !Intrinsics.areEqual((Object) attributes.getNetworkInfoScene(), (Object) GN_NETWORK_INFO_SCENE_LOCAL_MP)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isAcCashierGnScenario(@NotNull CheckoutFinishEntity checkoutFinishEntity) {
        isEnableTabClick attributes;
        String networkScenario;
        Intrinsics.checkNotNullParameter(checkoutFinishEntity, "checkoutFinishEntity");
        PayQueryResponse payQueryResponse = checkoutFinishEntity.getPayQueryResponse();
        if (payQueryResponse == null || (attributes = payQueryResponse.getAttributes()) == null || (networkScenario = attributes.getNetworkScenario()) == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) networkScenario, (Object) GN_NETWORK_CASHIER_SCENARIO);
    }

    public final void sendCallbackResult(@NotNull CheckoutFinishEntity checkoutFinishEntity) {
        Intrinsics.checkNotNullParameter(checkoutFinishEntity, "checkoutFinishEntity");
        this.remoteGnPaymentEntityData.setResultPayment(getPayStatus$app_productionRelease(checkoutFinishEntity.getProcessingStatus()), String.valueOf(checkoutFinishEntity.getApiSuccess()));
    }

    public final void sendCallbackResultWithoutCallback(@NotNull CheckoutFinishEntity checkoutFinishEntity) {
        Intrinsics.checkNotNullParameter(checkoutFinishEntity, "checkoutFinishEntity");
        this.remoteGnPaymentEntityData.setResultPaymentWithoutCallback(getPayStatus$app_productionRelease(checkoutFinishEntity.getProcessingStatus()), String.valueOf(checkoutFinishEntity.getApiSuccess()));
    }

    @NotNull
    public final String getPayStatus$app_productionRelease(@Nullable String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (str != null) {
                str2 = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).toUpperCase(locale)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "4000";
        }
        int hashCode = str2.hashCode();
        if (hashCode == -1149187101) {
            return str2.equals("SUCCESS") ? "9000" : "4000";
        }
        if (hashCode != -137465490) {
            if (hashCode == 35394935 && str2.equals("PENDING")) {
                return "8000";
            }
            return "4000";
        } else if (str2.equals("USER_CANCEL")) {
            return "6001";
        } else {
            return "4000";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/danah5/globalnetwork/manager/CheckoutFinishGnEventPluginManager$Companion;", "", "()V", "GN_NETWORK_CASHIER_SCENARIO", "", "GN_NETWORK_INFO_NAME", "GN_NETWORK_INFO_NAME_LOCAL_MP", "GN_NETWORK_INFO_SCENE", "GN_NETWORK_INFO_SCENE_LOCAL_MP", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
