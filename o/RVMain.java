package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

public class RVMain extends BaseRpcResult {
    public String countryCode;
    public String defaultOption;
    public boolean focusFirstCard;
    public List<setupOptimize> payMethodViewDTOS;
    public boolean scannerEnable;
    public List<initClassNameFromPkgName> standardCardOptionViews;

    /* renamed from: o.RVMain$5  reason: invalid class name */
    public interface AnonymousClass5 {
        TitleBarRightButtonView.AnonymousClass1<RVManifest> getLastPlayStoreReviewShow();

        TitleBarRightButtonView.AnonymousClass1<Integer> getTransactionSuccessCount();

        TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastPlayStoreReviewShow(String str, long j, long j2);

        TitleBarRightButtonView.AnonymousClass1<Boolean> saveSuccessTransaction(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/paymentsetting/repository/source/session/PreferencePaymentSettingEntityData;", "Lid/dana/data/paymentsetting/repository/source/PaymentSettingPreferenceEntityData;", "paymentSettingPreference", "Lid/dana/data/paymentsetting/repository/source/session/PaymentSettingPreference;", "(Lid/dana/data/paymentsetting/repository/source/session/PaymentSettingPreference;)V", "getPaymentSettingCheck", "Lio/reactivex/Observable;", "", "phoneNumber", "", "savePaymentSettingCheck", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Callback {
        public final getAppRecord length;

        @Inject
        public Callback(@NotNull getAppRecord getapprecord) {
            Intrinsics.checkNotNullParameter(getapprecord, "paymentSettingPreference");
            this.length = getapprecord;
        }
    }
}
