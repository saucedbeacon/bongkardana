package id.dana.sendmoney.summary;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.ShareActivityModel;
import id.dana.sendmoney_v2.landing.view.NewShareToFeedsView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.APImageDownloadRsp;
import o.resetInternal;
import o.setProxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016¨\u0006\u0019"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$sendMoneySummaryModule$1", "Lid/dana/sendmoney/namecheck/SendMoneySummaryContract$View;", "dismissProgress", "", "goToConfirmation", "confirmationModel", "Lid/dana/sendmoney/model/ConfirmationModel;", "onAmountValid", "onAmountValidAndActionConfirmed", "onError", "errorMessage", "", "onGetSendMoneyFeedConfigSuccess", "state", "onGetStateSendMoneyShareFeedFromLocal", "onGetUserAvatar", "url", "onGetX2XVoucherSuccess", "voucherEnabled", "", "onMaximumAmountReached", "limitMaxAmount", "onMinimumAmountReached", "limitMinAmount", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SummaryActivity$FastBitmap$CoordinateSystem implements setProxy.setMax {
    final /* synthetic */ SummaryActivity getMax;

    public final void onAmountValidAndActionConfirmed() {
    }

    SummaryActivity$FastBitmap$CoordinateSystem(SummaryActivity summaryActivity) {
        this.getMax = summaryActivity;
    }

    public final void onAmountValid() {
        CurrencyAmountModel currencyAmountModel;
        LinearLayout linearLayout = (LinearLayout) this.getMax._$_findCachedViewById(resetInternal.setMax.getItem);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llStickySummaryError");
        linearLayout.setVisibility(8);
        PayMethodModel payMethodModel = this.getMax.getPayMethodModel();
        String str = null;
        Long valueOf = payMethodModel != null ? Long.valueOf(payMethodModel.isInside) : null;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.longValue() > 0) {
            SummaryActivity.access$showChargeFeeAmount(this.getMax, "0");
            SummaryActivity summaryActivity = this.getMax;
            String max = summaryActivity.amountToSend().setMax();
            Intrinsics.checkNotNullExpressionValue(max, "amountToSend().currencyAndAmountValue");
            summaryActivity.setEnableButtonWithAmount(max);
        } else {
            SummaryActivity summaryActivity2 = this.getMax;
            PayMethodModel payMethodModel2 = summaryActivity2.getPayMethodModel();
            if (!(payMethodModel2 == null || (currencyAmountModel = payMethodModel2.setMin) == null)) {
                str = currencyAmountModel.getMax;
            }
            SummaryActivity.access$showChargeFeeAmount(summaryActivity2, str);
            SummaryActivity summaryActivity3 = this.getMax;
            summaryActivity3.setEnableButtonWithAmount(SummaryActivity.access$getCaluclatedAmountWithFeeAndVoucher(summaryActivity3));
        }
        Button button = (Button) this.getMax._$_findCachedViewById(resetInternal.setMax.MediaBrowserCompat$ItemReceiver);
        if (button != null) {
            button.setVisibility(8);
        }
        this.getMax.getMin();
        RecyclerView recyclerView = (RecyclerView) this.getMax._$_findCachedViewById(resetInternal.setMax.getText);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMax._$_findCachedViewById(resetInternal.setMax.pause);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
            recyclerView.setPadding(0, 0, 0, constraintLayout.getMeasuredHeight());
        }
    }

    public final void onGetSendMoneyFeedConfigSuccess(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "state");
        SummaryActivity.access$setStateCheckboxShareFeed(this.getMax, str);
    }

    public final void onMaximumAmountReached(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "limitMaxAmount");
        SummaryActivity summaryActivity = this.getMax;
        String string = summaryActivity.getString(R.string.sendmoney_summary_max_amount_warning);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendm…mmary_max_amount_warning)");
        SummaryActivity.access$showPaymentStickyAmountWarningMessage(summaryActivity, str, string);
        Long l = null;
        SummaryActivity.access$showChargeFeeAmount(this.getMax, (String) null);
        PayMethodModel payMethodModel = this.getMax.getPayMethodModel();
        if (payMethodModel != null) {
            l = Long.valueOf(payMethodModel.isInside);
        }
        Intrinsics.checkNotNull(l);
        if (l.longValue() > 0) {
            SummaryActivity summaryActivity2 = this.getMax;
            String max = summaryActivity2.amountToSend().setMax();
            Intrinsics.checkNotNullExpressionValue(max, "amountToSend().currencyAndAmountValue");
            summaryActivity2.setDisabledWithAmount(max);
        } else {
            SummaryActivity summaryActivity3 = this.getMax;
            summaryActivity3.setDisabledWithAmount(SummaryActivity.access$getCaluclatedAmountWithFeeAndVoucher(summaryActivity3));
        }
        Button button = (Button) this.getMax._$_findCachedViewById(resetInternal.setMax.MediaBrowserCompat$ItemReceiver);
        if (button != null) {
            button.setVisibility(0);
        }
        this.getMax.getMin();
        RecyclerView recyclerView = (RecyclerView) this.getMax._$_findCachedViewById(resetInternal.setMax.getText);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMax._$_findCachedViewById(resetInternal.setMax.pause);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
            recyclerView.setPadding(0, 0, 0, constraintLayout.getMeasuredHeight());
        }
    }

    public final void onMinimumAmountReached(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "limitMinAmount");
        SummaryActivity summaryActivity = this.getMax;
        String string = summaryActivity.getString(R.string.sendmoney_summary_min_amount_warning);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendm…mmary_min_amount_warning)");
        SummaryActivity.access$showPaymentStickyAmountWarningMessage(summaryActivity, str, string);
        SummaryActivity.access$showChargeFeeAmount(this.getMax, (String) null);
        SummaryActivity summaryActivity2 = this.getMax;
        String max = summaryActivity2.amountToSend().setMax();
        Intrinsics.checkNotNullExpressionValue(max, "amountToSend().currencyAndAmountValue");
        summaryActivity2.setDisabledWithAmount(max);
        Button button = (Button) this.getMax._$_findCachedViewById(resetInternal.setMax.MediaBrowserCompat$ItemReceiver);
        if (button != null) {
            button.setVisibility(8);
        }
        this.getMax.getMin();
        RecyclerView recyclerView = (RecyclerView) this.getMax._$_findCachedViewById(resetInternal.setMax.getText);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMax._$_findCachedViewById(resetInternal.setMax.pause);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
            recyclerView.setPadding(0, 0, 0, constraintLayout.getMeasuredHeight());
        }
    }

    public final void onGetStateSendMoneyShareFeedFromLocal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "state");
        if (Intrinsics.areEqual((Object) str, (Object) SummaryActivity.FIRST_STATE_SHARE_FEED)) {
            this.getMax.getSendMoneySummaryPresenter().length();
        } else {
            SummaryActivity.access$setStateCheckboxShareFeed(this.getMax, str);
        }
    }

    public final void onGetX2XVoucherSuccess(boolean z) {
        this.getMax.ICustomTabsService$Stub$Proxy = z;
    }

    public final void dismissProgress() {
        this.getMax.dismissDanaLoadingDialog();
    }

    public final void goToConfirmation(@Nullable ConfirmationModel confirmationModel) {
        if (confirmationModel != null) {
            confirmationModel.mayLaunchUrl = this.getMax.extraCallback;
            confirmationModel.receiveFile = new ShareActivityModel(((NewShareToFeedsView) this.getMax._$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset)).isChecked(), ((NewShareToFeedsView) this.getMax._$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset)).isNeedToActivateFeedsSharing());
            this.getMax.IsOverlapping = confirmationModel;
            this.getMax.valueOf = confirmationModel.FastBitmap$CoordinateSystem;
            this.getMax.toDoubleRange = confirmationModel.IsOverlapping;
            this.getMax.values = confirmationModel.equals;
            this.getMax.FastBitmap$CoordinateSystem = confirmationModel.getMax();
            this.getMax.ICustomTabsCallback = confirmationModel.invoke;
            this.getMax.Mean$Arithmetic = new APImageDownloadRsp(confirmationModel.hashCode);
            this.getMax.invokeSuspend = confirmationModel.valueOf;
            this.getMax.create = confirmationModel.Grayscale$Algorithm;
            this.getMax.Grayscale$Algorithm = new APImageDownloadRsp(confirmationModel.values);
            this.getMax.getDefaultImpl = confirmationModel.asInterface;
            this.getMax.ICustomTabsCallback$Stub = new APImageDownloadRsp(confirmationModel.onRelationshipValidationResult);
            this.getMax.getInterfaceDescriptor = confirmationModel.onTransact;
            this.getMax.getCause = confirmationModel.ICustomTabsCallback$Stub$Proxy;
            this.getMax.extraCallbackWithResult = confirmationModel.ICustomTabsCallback;
            this.getMax.asInterface = confirmationModel.create;
            this.getMax.extraCommand = confirmationModel.ICustomTabsService;
            this.getMax.ICustomTabsService = confirmationModel.ICustomTabsCallback$Stub;
            this.getMax.b = confirmationModel.invokeSuspend;
            this.getMax.onRelationshipValidationResult = confirmationModel.Mean$Arithmetic;
            this.getMax.setDefaultImpl = confirmationModel.extraCallbackWithResult;
            this.getMax.mayLaunchUrl = confirmationModel.getInterfaceDescriptor;
            this.getMax.onMessageChannelReady = confirmationModel.getCause;
            SummaryActivity summaryActivity = this.getMax;
            String str = confirmationModel.toIntRange;
            String str2 = "";
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            summaryActivity.toString = str;
            SummaryActivity summaryActivity2 = this.getMax;
            String str3 = confirmationModel.toFloatRange;
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3;
            }
            summaryActivity2.isInside = str2;
            SummaryActivity summaryActivity3 = this.getMax;
            String min = confirmationModel.getMin();
            Intrinsics.checkNotNullExpressionValue(min, "confirmationModel.expiryTime");
            CharSequence charSequence = min;
            int length = charSequence.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            summaryActivity3.onNavigationEvent = charSequence.subSequence(i, length + 1).toString();
            this.getMax.ICustomTabsCallback$Stub$Proxy = confirmationModel.asBinder;
            this.getMax.ICustomTabsCallback$Default = confirmationModel.onPostMessage;
            this.getMax.newSession = confirmationModel.getDefaultImpl;
            this.getMax.invoke = confirmationModel.toString;
            this.getMax.asBinder = confirmationModel.onMessageChannelReady;
            this.getMax.newSessionWithExtras = confirmationModel.ICustomTabsCallback$Default;
            this.getMax.hashCode = confirmationModel.warmup;
            this.getMax.onPostMessage = confirmationModel.extraCommand;
            this.getMax.extraCallback = confirmationModel.mayLaunchUrl;
            this.getMax.warmup = confirmationModel.newSessionWithExtras;
            this.getMax.postMessage = new APImageDownloadRsp(confirmationModel.newSession);
            this.getMax.updateVisuals = confirmationModel.validateRelationship;
            this.getMax.validateRelationship = confirmationModel.updateVisuals;
            this.getMax.requestPostMessageChannel = confirmationModel.IPostMessageService;
            this.getMax.IPostMessageService = confirmationModel.ICustomTabsService$Stub$Proxy;
            this.getMax.receiveFile = confirmationModel.length();
        }
        SummaryActivity summaryActivity4 = this.getMax;
        SummaryActivity.access$confirmSendMoney(summaryActivity4, summaryActivity4.ICustomTabsCallback);
        SummaryActivity.access$trackSendMoneyConfirm(this.getMax);
    }

    public final void onGetUserAvatar(@Nullable String str) {
        NewShareToFeedsView newShareToFeedsView = (NewShareToFeedsView) this.getMax._$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset);
        if (newShareToFeedsView != null) {
            newShareToFeedsView.displayUserAvatar(str);
        }
    }

    public final void onError(@Nullable String str) {
        this.getMax.showWarningDialog(str);
    }

    public final void showProgress() {
        this.getMax.showDanaLoadingDialog();
    }
}
