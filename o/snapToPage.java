package o;

import android.text.TextUtils;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.model.CurrencyAmountModel;
import id.dana.tracker.mixpanel.RegistrationEvent;
import javax.inject.Inject;
import o.FragmentStateAdapter$5;

public final class snapToPage implements FragmentStateAdapter$5.setMin {
    /* access modifiers changed from: private */
    public final FragmentStateAdapter$5.getMax getMax;
    private final addPendingMessage length;
    private final getAppIds setMax;
    /* access modifiers changed from: private */
    public final notifyConfigurationChanged setMin;

    @Inject
    public snapToPage(FragmentStateAdapter$5.getMax getmax, getAppIds getappids, notifyConfigurationChanged notifyconfigurationchanged, addPendingMessage addpendingmessage) {
        this.getMax = getmax;
        this.setMax = getappids;
        this.setMin = notifyconfigurationchanged;
        this.length = addpendingmessage;
    }

    public final void length() {
        this.setMax.execute(new GriverAppVirtualHostProxy<BaseGriverRpcResult>() {
            public final /* synthetic */ void onNext(Object obj) {
                String str;
                BaseGriverRpcResult baseGriverRpcResult = (BaseGriverRpcResult) obj;
                if (baseGriverRpcResult != null && baseGriverRpcResult.getOrderInfo() != null && baseGriverRpcResult.getStatus() != null) {
                    String cashierUrl = baseGriverRpcResult.getOrderInfo().getCashierUrl();
                    String tradeNo = baseGriverRpcResult.getOrderInfo().getTradeNo();
                    int i = AnonymousClass1.setMax[baseGriverRpcResult.getStatus().ordinal()];
                    if (i == 1) {
                        snapToPage.this.getMax.getMin(snapToPage.length(cashierUrl));
                    } else if (i == 2) {
                        snapToPage.this.getMax.setMin(cashierUrl);
                        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_PAY_RESULT_PREFIX);
                        sb.append(getClass().getName());
                        sb.append("Failure:cashierUrl=");
                        sb.append(cashierUrl);
                        sb.append("tradeNo=");
                        sb.append(tradeNo);
                        updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
                    } else if (i == 3) {
                        String payAmount = baseGriverRpcResult.getOrderInfo().getPayAmount();
                        if (payAmount != null) {
                            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(payAmount);
                            currencyAmountModel.length = "IDR";
                            str = setLineVisible.length(currencyAmountModel);
                        } else {
                            str = RegistrationEvent.ProfilePhotoSource.NO_ANSWER;
                        }
                        snapToPage.this.getMax.setMin(str, tradeNo);
                    }
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                snapToPage.this.getMax.onError(th.getMessage());
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_PAY_RESULT_PREFIX);
                sb.append(getClass().getName());
                sb.append(":onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
            }
        });
    }

    public final void getMax() {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    snapToPage.this.setMin.execute(snapToPage.length(snapToPage.this));
                }
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_PAY_RESULT_PREFIX);
                sb.append(getClass().getName());
                sb.append(":onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
            }
        });
    }

    /* renamed from: o.snapToPage$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                id.dana.domain.model.f2fpay.F2FPaymentResultStatus[] r0 = id.dana.domain.model.f2fpay.F2FPaymentResultStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                id.dana.domain.model.f2fpay.F2FPaymentResultStatus r1 = id.dana.domain.model.f2fpay.F2FPaymentResultStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                id.dana.domain.model.f2fpay.F2FPaymentResultStatus r1 = id.dana.domain.model.f2fpay.F2FPaymentResultStatus.FAILURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                id.dana.domain.model.f2fpay.F2FPaymentResultStatus r1 = id.dana.domain.model.f2fpay.F2FPaymentResultStatus.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.snapToPage.AnonymousClass1.<clinit>():void");
        }
    }

    public final void setMax() {
        this.setMax.dispose();
        this.setMin.dispose();
        this.length.dispose();
    }

    static /* synthetic */ GriverAppVirtualHostProxy length(snapToPage snaptopage) {
        return new GriverAppVirtualHostProxy<BaseGriverRpcResult>() {
            public final /* synthetic */ void onNext(Object obj) {
                String str;
                BaseGriverRpcResult baseGriverRpcResult = (BaseGriverRpcResult) obj;
                if (baseGriverRpcResult != null && baseGriverRpcResult.getOrderInfo() != null && baseGriverRpcResult.getStatus() != null) {
                    String cashierUrl = baseGriverRpcResult.getOrderInfo().getCashierUrl();
                    String tradeNo = baseGriverRpcResult.getOrderInfo().getTradeNo();
                    int i = AnonymousClass1.setMax[baseGriverRpcResult.getStatus().ordinal()];
                    if (i == 1) {
                        snapToPage.this.getMax.getMin(snapToPage.length(cashierUrl));
                    } else if (i == 2) {
                        snapToPage.this.getMax.setMin(cashierUrl);
                        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_PAY_RESULT_PREFIX);
                        sb.append(getClass().getName());
                        sb.append("Failure:cashierUrl=");
                        sb.append(cashierUrl);
                        sb.append("tradeNo=");
                        sb.append(tradeNo);
                        updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
                    } else if (i == 3) {
                        String payAmount = baseGriverRpcResult.getOrderInfo().getPayAmount();
                        if (payAmount != null) {
                            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(payAmount);
                            currencyAmountModel.length = "IDR";
                            str = setLineVisible.length(currencyAmountModel);
                        } else {
                            str = RegistrationEvent.ProfilePhotoSource.NO_ANSWER;
                        }
                        snapToPage.this.getMax.setMin(str, tradeNo);
                    }
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                snapToPage.this.getMax.onError(th.getMessage());
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_PAY_RESULT_PREFIX);
                sb.append(getClass().getName());
                sb.append(":onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
            }
        };
    }

    static /* synthetic */ String length(String str) {
        return !TextUtils.isEmpty(str) ? isShowMenu.getMin(str, "disableChange=true") : str;
    }
}
