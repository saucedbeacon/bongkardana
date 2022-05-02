package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import javax.inject.Inject;
import o.BeaconParser;
import o.DiagnosticsReceiver;
import o.GriverOpenAuthExtension;
import o.getErrorUrl;
import o.getMonitoringNotifier;
import o.updateScanPeriods;

@PerActivity
public final class cancelAllWorkByTag implements DiagnosticsReceiver.getMin {
    /* access modifiers changed from: package-private */
    public onPageLongClicked IsOverlapping;
    /* access modifiers changed from: private */
    public final DiagnosticsReceiver.length equals;
    getErrorUrl getMax;
    protected RecipientModel getMin;
    /* access modifiers changed from: private */
    public final Context hashCode;
    /* access modifiers changed from: private */
    public final browsePhoto isInside;
    /* access modifiers changed from: package-private */
    public setGridListener length;
    getMonitoringNotifier setMax;
    /* access modifiers changed from: package-private */
    public PhotoService setMin;
    /* access modifiers changed from: private */
    public onLoadProgress toDoubleRange;
    private final updateScanPeriods toFloatRange;
    private final checkIfMainProcess toIntRange;
    private final GriverOpenAuthExtension.RevokeCallback toString;

    @Inject
    cancelAllWorkByTag(updateScanPeriods updatescanperiods, browsePhoto browsephoto, DiagnosticsReceiver.length length2, checkIfMainProcess checkifmainprocess, GriverOpenAuthExtension.RevokeCallback revokeCallback, Context context) {
        this.toFloatRange = updatescanperiods;
        this.isInside = browsephoto;
        this.equals = length2;
        this.toIntRange = checkifmainprocess;
        this.toString = revokeCallback;
        this.hashCode = context;
    }

    public final void setMax() {
        this.toFloatRange.dispose();
        this.setMax.dispose();
        this.getMax.dispose();
        this.toIntRange.dispose();
        this.toString.dispose();
    }

    public final void length(final String str, final RecipientModel recipientModel) {
        if (str.equals("BALANCE")) {
            this.toIntRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    cancelAllWorkByTag.this.toString.execute(new GriverAppVirtualHostProxy<String>(recipientModel, ((Boolean) obj).booleanValue(), str) {
                        public final /* synthetic */ void onNext(@NonNull Object obj) {
                            if (cancelAllWorkByTag.length((String) obj, r5.getMin())) {
                                cancelAllWorkByTag.this.equals.onError(cancelAllWorkByTag.this.hashCode.getString(R.string.send_to_self_number_error));
                            } else {
                                cancelAllWorkByTag.getMax(cancelAllWorkByTag.this, r3, r4, r5);
                            }
                        }

                        public final void onError(Throwable th) {
                            cancelAllWorkByTag.getMax(cancelAllWorkByTag.this, r3, r4, r5);
                            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
                        }
                    });
                }
            });
        } else {
            setMin(str, recipientModel);
        }
    }

    public final void setMin(String str, String str2) {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }
        }, getErrorUrl.length.forSaveDanaUserContact(str, str2));
    }

    public final void setMax(String str) {
        if (this.toDoubleRange != null && !TextUtils.isEmpty(str)) {
            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(str);
            if (currencyAmountModel.getMin(this.toDoubleRange.setMax)) {
                this.equals.onMinimumAmountReached(this.toDoubleRange.setMax.getMax);
            } else if (currencyAmountModel.length(this.toDoubleRange.getMin)) {
                this.equals.onMaximumAmountReached(this.toDoubleRange.getMin.getMax);
            } else if (this.toDoubleRange.length == null || !currencyAmountModel.getMin(this.toDoubleRange.length)) {
                this.equals.showSummaryPage(this.getMin);
            } else {
                this.equals.onLimitBelowFreeMinAmount(this.getMin, this.toDoubleRange.length.getMax);
            }
        }
    }

    private void setMin(final String str, final RecipientModel recipientModel) {
        this.getMin = recipientModel;
        this.equals.showProgress();
        this.toFloatRange.execute(new GriverAppVirtualHostProxy<getDataFieldCount>() {
            public final /* synthetic */ void onNext(Object obj) {
                getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
                cancelAllWorkByTag.this.equals.dismissProgress();
                if (getdatafieldcount.getTransferMethod() != null && !getdatafieldcount.getTransferMethod().isEmpty()) {
                    cancelAllWorkByTag.this.getMin.Mean$Arithmetic = (int) getdatafieldcount.getTransferMethod().get(0).getFreeRemainedTimes();
                }
                cancelAllWorkByTag.this.isInside.setMin = str;
                cancelAllWorkByTag cancelallworkbytag = cancelAllWorkByTag.this;
                onLoadProgress unused = cancelallworkbytag.toDoubleRange = (onLoadProgress) cancelallworkbytag.isInside.apply(getdatafieldcount);
                if ("OTC".equals(str)) {
                    cancelAllWorkByTag.this.equals.onInitTransferOTCSuccess((WithdrawOTCModel) cancelAllWorkByTag.this.IsOverlapping.apply(getdatafieldcount));
                }
                if ("BALANCE".equals(str)) {
                    cancelAllWorkByTag.this.getMin(getdatafieldcount, recipientModel.getMin());
                }
                if (cancelAllWorkByTag.this.toDoubleRange == null) {
                    cancelAllWorkByTag.this.equals.onTransferMethodEmpty();
                    return;
                }
                cancelAllWorkByTag.this.equals.onInitTransferSuccess();
                cancelAllWorkByTag.this.equals.onInitCallback(getdatafieldcount);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                cancelAllWorkByTag.this.equals.onInitError(th);
                cancelAllWorkByTag.this.equals.dismissProgress();
            }
        }, updateScanPeriods.setMax.forSendMoneyInit(getMax(this.getMin, str)));
    }

    /* access modifiers changed from: private */
    public static boolean length(String str, String str2) {
        if (!str.isEmpty()) {
            return AuthenticationProxy.replaceIndoPhonePrefixWithRegionDash(str).equals(AuthenticationProxy.replaceIndoPhonePrefixWithRegionDash(str2));
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void getMin(getDataFieldCount getdatafieldcount, String str) {
        if (getdatafieldcount.isDanaUser()) {
            if (!TextUtils.isEmpty(str)) {
                this.equals.onRecipientIsDanaUser(getdatafieldcount.getPayeeUserId(), str, getdatafieldcount.getPayeeMaskedNickname(), getdatafieldcount.getPayeeMaskedPhoneNumber(), getdatafieldcount.getPayeeAvatar());
            }
            RecipientModel.length length2 = new RecipientModel.length(this.getMin.onNavigationEvent);
            length2.toFloatRange = getdatafieldcount.getPayeeUserId();
            length2.FastBitmap$CoordinateSystem = "userid";
            String str2 = this.getMin.isInside;
            String payeeMaskedPhoneNumber = getdatafieldcount.getPayeeMaskedPhoneNumber();
            if (!isOriginHasAppInfo.isValidIndoPhoneNumberPrefix(str2)) {
                str2 = payeeMaskedPhoneNumber;
            }
            length2.toIntRange = str2;
            length2.IsOverlapping = getdatafieldcount.getPayeeAvatar();
            String length3 = this.getMin.length();
            String payeeMaskedNickname = getdatafieldcount.getPayeeMaskedNickname();
            if ((!TextUtils.isEmpty(payeeMaskedNickname) && this.getMin.FastBitmap$CoordinateSystem()) || length3.contains("*")) {
                length3 = payeeMaskedNickname;
            }
            length2.isInside = length3;
            length2.toString = this.getMin.ICustomTabsCallback;
            length2.b = this.getMin.FastBitmap$CoordinateSystem;
            length2.onNavigationEvent = this.getMin.toFloatRange();
            this.getMin = length2.length();
            return;
        }
        RecipientModel.length length4 = new RecipientModel.length(this.getMin.onNavigationEvent);
        length4.toFloatRange = this.getMin.getMin();
        length4.FastBitmap$CoordinateSystem = "phonenumber";
        length4.toIntRange = this.getMin.isInside;
        length4.IsOverlapping = getdatafieldcount.getPayeeAvatar();
        length4.isInside = this.getMin.length();
        length4.toString = this.getMin.ICustomTabsCallback;
        length4.b = this.getMin.FastBitmap$CoordinateSystem;
        length4.onNavigationEvent = this.getMin.toFloatRange();
        this.getMin = length4.length();
    }

    private static getIdentifierCount getMax(RecipientModel recipientModel, String str) {
        getIdentifierCount getidentifiercount = new getIdentifierCount();
        getidentifiercount.setTransferMethod(str);
        getidentifiercount.setNeedTransferMethod(true);
        getidentifiercount.setNeedPayMethod(true);
        if ("BALANCE".equals(str)) {
            BeaconParser.BeaconLayoutException beaconLayoutException = new BeaconParser.BeaconLayoutException();
            if ("phonenumber".equals(recipientModel.b)) {
                beaconLayoutException.setLoginId(recipientModel.getMin());
            } else if ("userid".equals(recipientModel.b)) {
                beaconLayoutException.setUserId(recipientModel.getMin());
            }
            getidentifiercount.setPayeeInfo(beaconLayoutException);
        } else if ("OTC".equals(str)) {
            getidentifiercount.setNeedWithdrawMethod(true);
        }
        return getidentifiercount;
    }

    static /* synthetic */ String length(cancelAllWorkByTag cancelallworkbytag, String str, String str2) {
        return ((TextUtils.isEmpty(str2) || !cancelallworkbytag.getMin.FastBitmap$CoordinateSystem()) && !str.contains("*")) ? str : str2;
    }

    static /* synthetic */ void getMax(cancelAllWorkByTag cancelallworkbytag, boolean z, String str, RecipientModel recipientModel) {
        if (z) {
            cancelallworkbytag.setMin(str, recipientModel);
            return;
        }
        cancelallworkbytag.getMin = recipientModel;
        if ("phonenumber".equals(recipientModel.b)) {
            final String min = recipientModel.getMin();
            cancelallworkbytag.equals.showProgress();
            cancelallworkbytag.setMax.execute(new GriverAppVirtualHostProxy<getPowerCorrection>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getPowerCorrection getpowercorrection = (getPowerCorrection) obj;
                    cancelAllWorkByTag.this.equals.dismissProgress();
                    cancelAllWorkByTag.this.equals.onInitTransferSuccess();
                    CloudConfig cloudConfig = (CloudConfig) cancelAllWorkByTag.this.setMin.apply(getpowercorrection);
                    if (cloudConfig.setMax()) {
                        if (!TextUtils.isEmpty("")) {
                            cancelAllWorkByTag.this.equals.onRecipientIsDanaUser(getpowercorrection.getPayeeUserId(), "", getpowercorrection.getPayeeMaskedNickname(), getpowercorrection.getPayeeMaskedPhoneNumber(), getpowercorrection.getAvatarUrl());
                        }
                        cancelAllWorkByTag cancelallworkbytag = cancelAllWorkByTag.this;
                        RecipientModel.length length2 = new RecipientModel.length(cancelAllWorkByTag.this.getMin.onNavigationEvent);
                        length2.toFloatRange = TextUtils.isEmpty(cloudConfig.IsOverlapping) ? "" : cloudConfig.IsOverlapping;
                        length2.FastBitmap$CoordinateSystem = "userid";
                        length2.toIntRange = cancelAllWorkByTag.this.getMin.isInside;
                        length2.IsOverlapping = cloudConfig.setMin;
                        cancelAllWorkByTag cancelallworkbytag2 = cancelAllWorkByTag.this;
                        length2.isInside = cancelAllWorkByTag.length(cancelallworkbytag2, cancelallworkbytag2.getMin.length(), getpowercorrection.getPayeeMaskedNickname());
                        length2.b = cancelAllWorkByTag.this.getMin.FastBitmap$CoordinateSystem;
                        length2.onNavigationEvent = cancelAllWorkByTag.this.getMin.toFloatRange();
                        length2.toString = cancelAllWorkByTag.this.getMin.ICustomTabsCallback;
                        cancelallworkbytag.getMin = length2.length();
                    } else {
                        cancelAllWorkByTag cancelallworkbytag3 = cancelAllWorkByTag.this;
                        RecipientModel.length length3 = new RecipientModel.length(cancelAllWorkByTag.this.getMin.onNavigationEvent);
                        length3.toFloatRange = "";
                        length3.FastBitmap$CoordinateSystem = "phonenumber";
                        length3.toIntRange = cancelAllWorkByTag.this.getMin.isInside;
                        length3.IsOverlapping = cloudConfig.setMin;
                        length3.isInside = cancelAllWorkByTag.this.getMin.length();
                        length3.b = cancelAllWorkByTag.this.getMin.FastBitmap$CoordinateSystem;
                        length3.onNavigationEvent = cancelAllWorkByTag.this.getMin.toFloatRange();
                        length3.toString = cancelAllWorkByTag.this.getMin.ICustomTabsCallback;
                        cancelallworkbytag3.getMin = length3.length();
                    }
                    cancelAllWorkByTag cancelallworkbytag4 = cancelAllWorkByTag.this;
                    onLoadProgress unused = cancelallworkbytag4.toDoubleRange = (onLoadProgress) cancelallworkbytag4.length.apply(cloudConfig);
                }

                public final void onError(Throwable th) {
                    cancelAllWorkByTag.this.equals.dismissProgress();
                    cancelAllWorkByTag.this.equals.onInitError(th);
                    super.onError(th);
                }
            }, getMonitoringNotifier.setMin.forSendMoneyInit(min, ""));
        } else if ("userid".equals(recipientModel.b)) {
            String min2 = recipientModel.getMin();
            cancelallworkbytag.equals.showProgress();
            cancelallworkbytag.setMax.execute(new GriverAppVirtualHostProxy<getPowerCorrection>("") {
                public final /* synthetic */ void onNext(Object obj) {
                    getPowerCorrection getpowercorrection = (getPowerCorrection) obj;
                    cancelAllWorkByTag.this.equals.dismissProgress();
                    cancelAllWorkByTag.this.equals.onInitTransferSuccess();
                    CloudConfig cloudConfig = (CloudConfig) cancelAllWorkByTag.this.setMin.apply(getpowercorrection);
                    if (cloudConfig.setMax()) {
                        if (!TextUtils.isEmpty("")) {
                            cancelAllWorkByTag.this.equals.onRecipientIsDanaUser(getpowercorrection.getPayeeUserId(), "", getpowercorrection.getPayeeMaskedNickname(), getpowercorrection.getPayeeMaskedPhoneNumber(), getpowercorrection.getAvatarUrl());
                        }
                        cancelAllWorkByTag cancelallworkbytag = cancelAllWorkByTag.this;
                        RecipientModel.length length2 = new RecipientModel.length(cancelAllWorkByTag.this.getMin.onNavigationEvent);
                        length2.toFloatRange = TextUtils.isEmpty(cloudConfig.IsOverlapping) ? "" : cloudConfig.IsOverlapping;
                        length2.FastBitmap$CoordinateSystem = "userid";
                        length2.toIntRange = cancelAllWorkByTag.this.getMin.isInside;
                        length2.IsOverlapping = cloudConfig.setMin;
                        cancelAllWorkByTag cancelallworkbytag2 = cancelAllWorkByTag.this;
                        length2.isInside = cancelAllWorkByTag.length(cancelallworkbytag2, cancelallworkbytag2.getMin.length(), getpowercorrection.getPayeeMaskedNickname());
                        length2.b = cancelAllWorkByTag.this.getMin.FastBitmap$CoordinateSystem;
                        length2.onNavigationEvent = cancelAllWorkByTag.this.getMin.toFloatRange();
                        length2.toString = cancelAllWorkByTag.this.getMin.ICustomTabsCallback;
                        cancelallworkbytag.getMin = length2.length();
                    } else {
                        cancelAllWorkByTag cancelallworkbytag3 = cancelAllWorkByTag.this;
                        RecipientModel.length length3 = new RecipientModel.length(cancelAllWorkByTag.this.getMin.onNavigationEvent);
                        length3.toFloatRange = "";
                        length3.FastBitmap$CoordinateSystem = "phonenumber";
                        length3.toIntRange = cancelAllWorkByTag.this.getMin.isInside;
                        length3.IsOverlapping = cloudConfig.setMin;
                        length3.isInside = cancelAllWorkByTag.this.getMin.length();
                        length3.b = cancelAllWorkByTag.this.getMin.FastBitmap$CoordinateSystem;
                        length3.onNavigationEvent = cancelAllWorkByTag.this.getMin.toFloatRange();
                        length3.toString = cancelAllWorkByTag.this.getMin.ICustomTabsCallback;
                        cancelallworkbytag3.getMin = length3.length();
                    }
                    cancelAllWorkByTag cancelallworkbytag4 = cancelAllWorkByTag.this;
                    onLoadProgress unused = cancelallworkbytag4.toDoubleRange = (onLoadProgress) cancelallworkbytag4.length.apply(cloudConfig);
                }

                public final void onError(Throwable th) {
                    cancelAllWorkByTag.this.equals.dismissProgress();
                    cancelAllWorkByTag.this.equals.onInitError(th);
                    super.onError(th);
                }
            }, getMonitoringNotifier.setMin.forSendMoneyInit("", min2));
        }
    }
}
