package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVMain;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00100\u0010H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/data/paymentsetting/PaymentSettingEntityRepository;", "Lid/dana/domain/paymentsetting/PaymentSettingRepository;", "paymentSettingPreferenceEntityDataFactory", "Lid/dana/data/paymentsetting/repository/source/PaymentSettingPreferenceEntityDataFactory;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "(Lid/dana/data/paymentsetting/repository/source/PaymentSettingPreferenceEntityDataFactory;Lid/dana/data/account/repository/source/AccountEntityDataFactory;)V", "checkPaymentSetting", "Lio/reactivex/Observable;", "", "createAccountData", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "createPreferencePaymentSettingEntityData", "Lid/dana/data/paymentsetting/repository/source/session/PreferencePaymentSettingEntityData;", "getPhoneNumber", "", "savePaymentSettingCheck", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ensureManifestFile implements UCExist {
    private final startPage getMax;
    private final DialogLayout getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/account/AccountEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<attach, String> {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            attach attach = (attach) obj;
            Intrinsics.checkNotNullParameter(attach, "it");
            return attach.getPhoneNumber();
        }
    }

    @Inject
    public ensureManifestFile(@NotNull startPage startpage, @NotNull DialogLayout dialogLayout) {
        Intrinsics.checkNotNullParameter(startpage, "paymentSettingPreferenceEntityDataFactory");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        this.getMax = startpage;
        this.getMin = dialogLayout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkPaymentSetting() {
        RVMain.Callback callback = new RVMain.Callback(this.getMax.length);
        setDrawDivider createData = this.getMin.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        String str = (String) createData.getAccount().map(setMax.getMin).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(str, "getPhoneNumber()");
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(callback.length.setMin(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(paymentS…ettingCheck(phoneNumber))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> savePaymentSettingCheck() {
        RVMain.Callback callback = new RVMain.Callback(this.getMax.length);
        setDrawDivider createData = this.getMin.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        String str = (String) createData.getAccount().map(setMax.getMin).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(str, "getPhoneNumber()");
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(callback.length.getMax(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(paymentS…ettingCheck(phoneNumber))");
        return just;
    }
}
