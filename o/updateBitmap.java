package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/data/bokuverification/source/network/VerifyRiskEntityData;", "", "verifyBokuToRisk", "Lio/reactivex/Observable;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "phoneNumber", "", "securityId", "correlationId", "source", "verifyOtpToRisk", "otpValue", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface updateBitmap {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> getMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> getMin(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);
}
