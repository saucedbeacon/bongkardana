package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverOpenSettingActivity;
import o.onPageScrolled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\b\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lid/dana/contract/openbankaccount/OpenBankAccountPresenter;", "Lid/dana/contract/openbankaccount/OpenBankAccountContract$Presenter;", "view", "Lid/dana/contract/openbankaccount/OpenBankAccountContract$View;", "bankAccountsModelMapper", "Lid/dana/openbankaccount/mapper/BankAccountsModelMapper;", "getBankAccountList", "Lid/dana/domain/openbankaccount/interactor/GetBankAccountList;", "getConfigBankAccount", "Lid/dana/domain/openbankaccount/interactor/GetConfigBankAccount;", "configBankAccountModelMapper", "Lid/dana/openbankaccount/mapper/ConfigBankAccountModelMapper;", "(Lid/dana/contract/openbankaccount/OpenBankAccountContract$View;Lid/dana/openbankaccount/mapper/BankAccountsModelMapper;Lid/dana/domain/openbankaccount/interactor/GetBankAccountList;Lid/dana/domain/openbankaccount/interactor/GetConfigBankAccount;Lid/dana/openbankaccount/mapper/ConfigBankAccountModelMapper;)V", "getBankAccountsModelMapper", "()Lid/dana/openbankaccount/mapper/BankAccountsModelMapper;", "getConfigBankAccountModelMapper", "()Lid/dana/openbankaccount/mapper/ConfigBankAccountModelMapper;", "getView", "()Lid/dana/contract/openbankaccount/OpenBankAccountContract$View;", "getBankAccountObserver", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/openbankaccount/model/BankAccountList;", "getBankInfoList", "", "getConfigBankAccountObserver", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class pageScrolled implements onPageScrolled.setMax {
    private final OfficeFileType getMax;
    @NotNull
    final GriverOpenSettingActivity.AnonymousClass2 getMin;
    private final getNetworkError length;
    @NotNull
    final FileManifest setMax;
    @NotNull
    final onPageScrolled.setMin setMin;

    @Inject
    public pageScrolled(@NotNull onPageScrolled.setMin setmin, @NotNull GriverOpenSettingActivity.AnonymousClass2 r3, @NotNull OfficeFileType officeFileType, @NotNull getNetworkError getnetworkerror, @NotNull FileManifest fileManifest) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(r3, "bankAccountsModelMapper");
        Intrinsics.checkNotNullParameter(officeFileType, "getBankAccountList");
        Intrinsics.checkNotNullParameter(getnetworkerror, "getConfigBankAccount");
        Intrinsics.checkNotNullParameter(fileManifest, "configBankAccountModelMapper");
        this.setMin = setmin;
        this.getMin = r3;
        this.getMax = officeFileType;
        this.length = getnetworkerror;
        this.setMax = fileManifest;
    }

    public final void setMin() {
        this.length.execute(new setMin(this));
    }

    public final void getMax() {
        this.getMax.execute(new length(this));
    }

    public final void setMax() {
        this.getMax.dispose();
        this.length.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/openbankaccount/OpenBankAccountPresenter$getBankAccountObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/openbankaccount/model/BankAccountList;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<OuterFileUtils> {
        final /* synthetic */ pageScrolled getMin;

        length(pageScrolled pagescrolled) {
            this.getMin = pagescrolled;
        }

        public final /* synthetic */ void onNext(Object obj) {
            OuterFileUtils outerFileUtils = (OuterFileUtils) obj;
            Intrinsics.checkNotNullParameter(outerFileUtils, SecurityConstants.KEY_TEXT);
            onPageScrolled.setMin setmin = this.getMin.setMin;
            Object apply = this.getMin.getMin.apply(outerFileUtils);
            Intrinsics.checkNotNullExpressionValue(apply, "bankAccountsModelMapper.apply(t)");
            setmin.setMax((ChooseFileBridgeExtension) apply);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.logNetworkException(DanaLogConstants.BizType.OPEN_BANK, String.valueOf(th.getMessage()), th);
            onPageScrolled.setMin setmin = this.getMin.setMin;
            String message = th.getMessage();
            if (message == null) {
                message = String.valueOf(th.getMessage());
            }
            setmin.onError(message);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/openbankaccount/OpenBankAccountPresenter$getConfigBankAccountObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<fileType> {
        final /* synthetic */ pageScrolled length;

        setMin(pageScrolled pagescrolled) {
            this.length = pagescrolled;
        }

        public final /* synthetic */ void onNext(Object obj) {
            fileType filetype = (fileType) obj;
            Intrinsics.checkNotNullParameter(filetype, SecurityConstants.KEY_TEXT);
            onPageScrolled.setMin setmin = this.length.setMin;
            Object apply = this.length.setMax.apply(filetype);
            Intrinsics.checkNotNullExpressionValue(apply, "configBankAccountModelMapper.apply(t)");
            setmin.getMax((sendUserDenyCallback) apply);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.logNetworkException(DanaLogConstants.BizType.OPEN_BANK, String.valueOf(th.getMessage()), th);
            onPageScrolled.setMin setmin = this.length.setMin;
            String message = th.getMessage();
            if (message == null) {
                message = String.valueOf(th.getMessage());
            }
            setmin.onError(message);
        }
    }
}
