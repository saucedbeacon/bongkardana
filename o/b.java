package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Url;

public final class b extends Mean$Arithmetic {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/data/login/source/BokuEntityData;", "", "getBokuSilentOTP", "Lio/reactivex/Observable;", "", "url", "", "dataTrackerSource", "getBokuSilentOTPWithMobileNetwork", "getBokuUrl", "Lid/dana/data/login/source/network/result/NetworkUrlRpcResult;", "phoneNumber", "source", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.b$10  reason: invalid class name */
    public interface AnonymousClass10 {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> getBokuSilentOTP(@NotNull String str, @NotNull String str2);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> getBokuSilentOTPWithMobileNetwork(@NotNull String str, @NotNull String str2);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$66$1> getBokuUrl(@NotNull String str, @NotNull String str2);
    }

    /* renamed from: o.b$16  reason: invalid class name */
    public interface AnonymousClass16 {
        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> holdLogin(String str, String str2);
    }

    /* renamed from: o.b$6  reason: invalid class name */
    public interface AnonymousClass6 {
        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> holdLogin(String str, String str2);

        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> login(String str, String str2, String str3, String str4, String str5);

        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$68$1> logout();

        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> otpLogin(String str, String str2, String str3, String str4, String str5, String str6);

        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> verifyPushLogin(String str, String str2, String str3, String str4, String str5, String str6);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/data/login/source/network/BokuApi;", "", "getBokuSilentOTP", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Ljava/lang/Void;", "url", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.b$8  reason: invalid class name */
    public interface AnonymousClass8 {
        @NotNull
        @GET
        TitleBarRightButtonView.AnonymousClass1<getAppenderManager<Void>> getBokuSilentOTP(@NotNull @Url String str);
    }

    /* renamed from: o.b$b  reason: collision with other inner class name */
    public interface C0007b<T> {
        T get();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/data/login/source/network/BokuRpcFacade;", "", "getNetworkUrl", "Lid/dana/data/login/source/network/result/NetworkUrlRpcResult;", "request", "Lid/dana/data/login/source/network/request/NetworkUrlRpcRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.b$7  reason: invalid class name */
    public interface AnonymousClass7 {
        @OperationType("alipayplus.mobilewallet.boku.getnetworkurl")
        @NotNull
        @SignCheck
        com_alibaba_ariver_app_api_ExtOpt$66$1 getNetworkUrl(@NotNull com_alibaba_ariver_app_api_ExtOpt$67$1 com_alibaba_ariver_app_api_extopt_67_1);
    }

    /* renamed from: o.b$9  reason: invalid class name */
    public interface AnonymousClass9 {
        @OperationType("alipayplus.mobilewallet.user.login")
        @SignCheck
        com_alibaba_ariver_app_api_ExtOpt$69$1 login(com_alibaba_ariver_app_api_ExtOpt$64$1 com_alibaba_ariver_app_api_extopt_64_1);

        @OperationType("alipayplus.mobilewallet.user.logout")
        @SignCheck
        com_alibaba_ariver_app_api_ExtOpt$68$1 logout(com_alibaba_ariver_app_api_ExtOpt$65$1 com_alibaba_ariver_app_api_extopt_65_1);
    }

    public interface a {
        void count(String str, long j);

        void time(String str, long j);
    }

    public final boolean getMax() {
        return true;
    }

    @NotNull
    public final String getMin() {
        return "";
    }

    public final void getMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onResult");
        function1.invoke(new ICustomTabsCallback(false, "005", (String) null, (String) null, (String) null, (String) null, (String) null, 252));
    }

    public final void setMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onResult");
    }
}
