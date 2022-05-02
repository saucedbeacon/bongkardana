package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getTitleIcon_White;
import o.updateScanPeriods;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/sendmoney_v2/landing/contract/RecipientSelectorPresenter;", "Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$Presenter;", "initTransferMoney", "Lid/dana/domain/sendmoney/interactor/InitTransferMoney;", "view", "Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$View;", "(Lid/dana/domain/sendmoney/interactor/InitTransferMoney;Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$View;)V", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "checkKycAndDebitPayOptions", "", "param", "", "getPayMethodTransfer", "getTransferInitParam", "Lid/dana/domain/sendmoney/model/TransferInitParam;", "init", "onDestroy", "validateKycAndDebitPayOption", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class loadThumbPhoto implements getTitleIcon_White.getMax {
    /* access modifiers changed from: private */
    public final getTitleIcon_White.getMin length;
    /* access modifiers changed from: private */
    public getDataFieldCount setMax;
    private final updateScanPeriods setMin;

    @Inject
    public loadThumbPhoto(@NotNull updateScanPeriods updatescanperiods, @NotNull getTitleIcon_White.getMin getmin) {
        Intrinsics.checkNotNullParameter(updatescanperiods, "initTransferMoney");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMin = updatescanperiods;
        this.length = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney_v2/landing/contract/RecipientSelectorPresenter$getPayMethodTransfer$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/sendmoney/model/TransferInit;", "onError", "", "e", "", "onNext", "transferInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<getDataFieldCount> {
        final /* synthetic */ Object setMax;
        final /* synthetic */ loadThumbPhoto setMin;

        getMax(loadThumbPhoto loadthumbphoto, Object obj) {
            this.setMin = loadthumbphoto;
            this.setMax = obj;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
            Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
            this.setMin.setMax = getdatafieldcount;
            Object obj2 = this.setMax;
            if (obj2 != null) {
                this.setMin.getMax(obj2);
            }
            this.setMin.length.setMin(getdatafieldcount);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            if (this.setMax != null) {
                this.setMin.length.onError(th.getMessage());
            }
        }
    }

    public final void setMax(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "param");
        if (this.setMax != null) {
            getMax(obj);
            return;
        }
        getIdentifierCount getidentifiercount = new getIdentifierCount();
        getidentifiercount.setTransferMethod("BANK_TRANSFER");
        getidentifiercount.setNeedTransferMethod(true);
        getidentifiercount.setNeedPayMethod(true);
        this.setMin.execute(new getMax(this, obj), updateScanPeriods.setMax.forSendMoneyInit(getidentifiercount));
    }

    /* access modifiers changed from: private */
    public final void getMax(Object obj) {
        getDataFieldCount getdatafieldcount = this.setMax;
        if (getdatafieldcount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transferInit");
        }
        if (!updateBusinessId.getMin(getdatafieldcount)) {
            getDataFieldCount getdatafieldcount2 = this.setMax;
            if (getdatafieldcount2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("transferInit");
            }
            if (!updateBusinessId.setMin(getdatafieldcount2)) {
                this.length.getMax();
                return;
            }
        }
        this.length.setMax(obj);
    }

    public final void setMax() {
        this.setMin.dispose();
    }

    public final void getMax() {
        getIdentifierCount getidentifiercount = new getIdentifierCount();
        getidentifiercount.setTransferMethod("BANK_TRANSFER");
        getidentifiercount.setNeedTransferMethod(true);
        getidentifiercount.setNeedPayMethod(true);
        this.setMin.execute(new getMax(this, (Object) null), updateScanPeriods.setMax.forSendMoneyInit(getidentifiercount));
    }
}
