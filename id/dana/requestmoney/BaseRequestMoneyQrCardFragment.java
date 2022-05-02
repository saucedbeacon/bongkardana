package id.dana.requestmoney;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.requestmoney.NoteAmountCalculatorActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.QRView;
import id.dana.richview.socialshare.SocialShareView;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.APImageDownloadRsp;
import o.BottomPopup;
import o.FtsOptions$Order;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.RedDotManager;
import o.WheelView;
import o.access$2900;
import o.getTransitionProperties;
import o.loadOriginalImage;
import o.name;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001aH\u0004J\u0010\u00105\u001a\u0002032\u0006\u00106\u001a\u00020\u001aH\u0004J\u0010\u00107\u001a\u0002032\u0006\u00108\u001a\u00020\u001aH\u0004J\b\u00109\u001a\u00020:H\u0014J\b\u0010;\u001a\u000203H\u0004J\u0006\u0010<\u001a\u00020\nJ\b\u0010=\u001a\u000203H\u0004J\b\u0010>\u001a\u000203H\u0014J\b\u0010?\u001a\u000203H$J\b\u0010@\u001a\u000203H&J\b\u0010A\u001a\u000203H\u0002J\u0006\u0010B\u001a\u00020\nJ\b\u0010C\u001a\u000203H&J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u000203H\u0002J\u0010\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020\nH\u0002J\u0010\u0010H\u001a\u0002032\u0006\u0010G\u001a\u00020\nH\u0002J\u0010\u0010I\u001a\u0002032\u0006\u0010G\u001a\u00020\nH\u0004J\b\u0010J\u001a\u000203H\u0002J\b\u0010K\u001a\u000203H\u0004J\b\u0010L\u001a\u000203H\u0004J\u0012\u0010M\u001a\u0002032\b\b\u0002\u0010N\u001a\u00020\nH\u0004J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020\nH\u0004J\u0016\u0010Q\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aJ\f\u0010R\u001a\u000203*\u00020\u0012H\u0002J\f\u0010\b\u001a\u000203*\u00020\u001aH\u0002J\u0016\u0010S\u001a\u000203*\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\f\u0010W\u001a\u000203*\u00020\u001aH\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0003\u001a\u0004\u0018\u00010 @TX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006X"}, d2 = {"Lid/dana/requestmoney/BaseRequestMoneyQrCardFragment;", "Lid/dana/base/BaseFragment;", "()V", "value", "Lid/dana/sendmoney/Amount;", "amount", "getAmount", "()Lid/dana/sendmoney/Amount;", "setAmount", "(Lid/dana/sendmoney/Amount;)V", "", "deepLinkActive", "getDeepLinkActive", "()Z", "setDeepLinkActive", "(Z)V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "profileDeeplinkPresenter", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfilePresenter;", "getProfileDeeplinkPresenter", "()Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfilePresenter;", "setProfileDeeplinkPresenter", "(Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfilePresenter;)V", "", "remarks", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "Lid/dana/requestmoney/model/RequestMoneyInfoModel;", "requestMoneyInfoModel", "getRequestMoneyInfoModel", "()Lid/dana/requestmoney/model/RequestMoneyInfoModel;", "setRequestMoneyInfoModel", "(Lid/dana/requestmoney/model/RequestMoneyInfoModel;)V", "requestMoneyQrPresenter", "Lid/dana/requestmoney/RequestMoneyQrContract$Presenter;", "getRequestMoneyQrPresenter", "()Lid/dana/requestmoney/RequestMoneyQrContract$Presenter;", "setRequestMoneyQrPresenter", "(Lid/dana/requestmoney/RequestMoneyQrContract$Presenter;)V", "transferDeepLinkPresenter", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$TransferPresenter;", "getTransferDeepLinkPresenter", "()Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$TransferPresenter;", "setTransferDeepLinkPresenter", "(Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$TransferPresenter;)V", "displayQrImageView", "", "qrString", "generateProfileQrDeepLink", "profileQrUrl", "generateTransferQrDeepLink", "qrCode", "getLayout", "", "getLimitRequestMoney", "hasAmount", "hideSkeleton", "init", "initComponent", "initData", "initSocialShareView", "isAmountAndRemarksSet", "reloadQr", "reset", "setAmountClickListener", "setEnableButtonAmount", "enable", "setEnableQr", "setEnableShareButton", "setResetAmountListener", "showQrSkeleton", "showRefreshQRView", "toggleBtnVisibility", "qrExpired", "toggleShareButtons", "visible", "updateAmount", "onAmountAndRemarksOk", "setQrBitmap", "Lid/dana/richview/QRView;", "bitmap", "Landroid/graphics/Bitmap;", "updateRemarks", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseRequestMoneyQrCardFragment extends FtsOptions$Order {
    @NotNull
    private String equals = "";
    @Nullable
    public access$2900 getMin;
    @Inject
    public getTransitionProperties.setMin profileDeeplinkPresenter;
    @Inject
    public loadOriginalImage.setMax requestMoneyQrPresenter;
    private boolean setMax;
    @NotNull
    private APImageDownloadRsp setMin = new APImageDownloadRsp(0);
    private HashMap toFloatRange;
    /* access modifiers changed from: private */
    public final ITrustedWebActivityCallback<Intent> toIntRange;
    @Inject
    public getTransitionProperties.getMax transferDeepLinkPresenter;

    public abstract void FastBitmap$CoordinateSystem();

    public void invoke() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        invoke();
    }

    public final int setMin() {
        return R.layout.card_qr_request_money;
    }

    public View setMin(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public abstract void toDoubleRange();

    public abstract void values();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements RedDotManager<Bitmap> {
        final /* synthetic */ BaseRequestMoneyQrCardFragment getMax;

        getMin(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
            this.getMax = baseRequestMoneyQrCardFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            QRView qRView = (QRView) this.getMax.setMin(resetInternal.setMax.setShowingForActionMode);
            if (qRView != null) {
                BaseRequestMoneyQrCardFragment.getMin(qRView, bitmap);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 4, 2})
    static final class setMax<O> implements IPostMessageService.Default<ActivityResult> {
        final /* synthetic */ BaseRequestMoneyQrCardFragment getMin;

        setMax(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
            this.getMin = baseRequestMoneyQrCardFragment;
        }

        public final /* synthetic */ void onActivityResult(Object obj) {
            Intent intent;
            ActivityResult activityResult = (ActivityResult) obj;
            Intrinsics.checkNotNullExpressionValue(activityResult, "it");
            if (activityResult.getMax == -1 && (intent = activityResult.length) != null) {
                BaseRequestMoneyQrCardFragment.getMax(this.getMin, intent);
            }
        }
    }

    public BaseRequestMoneyQrCardFragment() {
        ITrustedWebActivityCallback<Intent> registerForActivityResult = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new setMax(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…marksOk()\n        }\n    }");
        this.toIntRange = registerForActivityResult;
    }

    public final void length(boolean z) {
        this.setMax = z;
        setMax(z);
    }

    public final void getMax(@Nullable access$2900 access_2900) {
        this.getMin = access_2900;
        boolean z = access_2900 != null;
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMin(resetInternal.setMax.warmup);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setEnabled(z);
        }
    }

    public final void setMax(boolean z) {
        SocialShareView socialShareView = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        int i = 0;
        if (socialShareView != null) {
            View view = socialShareView;
            Intrinsics.checkNotNullParameter(view, "$this$toggleVisibilityInvisible");
            view.setVisibility(z ? 0 : 4);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) setMin(resetInternal.setMax.onCloseClicked);
        if (appCompatTextView != null) {
            View view2 = appCompatTextView;
            Intrinsics.checkNotNullParameter(view2, "$this$toggleVisibilityInvisible");
            if (!z) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    @NotNull
    public final APImageDownloadRsp getMax() {
        return this.setMin;
    }

    /* access modifiers changed from: package-private */
    public final void getMax(@NotNull APImageDownloadRsp aPImageDownloadRsp) {
        String str;
        Intrinsics.checkNotNullParameter(aPImageDownloadRsp, "value");
        this.setMin = aPImageDownloadRsp;
        TextView textView = (TextView) setMin(resetInternal.setMax.tvAmount);
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            BaseActivity baseActivity = this.getMax;
            if (baseActivity != null) {
                str = baseActivity.getString(R.string.rupiah_short);
            } else {
                str = null;
            }
            sb.append(str);
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            Locale locale = WheelView.OnWheelViewListener.getMax;
            sb.append(NumberFormat.getNumberInstance(locale).format(this.setMin.setMin));
            textView.setText(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String equals() {
        return this.equals;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.equals = str;
        TextView textView = (TextView) setMin(resetInternal.setMax.isSubmitButtonEnabled);
        if (textView != null) {
            textView.setText(this.equals);
            textView.setVisibility(StringsKt.isBlank(this.equals) ^ true ? 0 : 8);
        }
    }

    public void setMax() {
        toDoubleRange();
        FastBitmap$CoordinateSystem();
        QRView qRView = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView != null) {
            qRView.setEnabled(false);
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMin(resetInternal.setMax.warmup);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setEnabled(false);
        }
        SocialShareView socialShareView = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setEnableShareButton(false);
        }
        SocialShareView socialShareView2 = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView2 != null) {
            socialShareView2.setSocialShareViewTitle("");
            socialShareView2.setSocialButtonText("");
            BaseActivity baseActivity = socialShareView2.getBaseActivity();
            socialShareView2.setOthersButtonText(baseActivity != null ? baseActivity.getString(R.string.social_share_others_button_text) : null);
        }
        if (this.getMin == null) {
            loadOriginalImage.setMax setmax = this.requestMoneyQrPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            setmax.getMax();
        }
        getMax(new APImageDownloadRsp(0));
        setMin("");
        getMax(false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) setMin(resetInternal.setMax.ivClear);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new length(this));
        }
        QRView qRView2 = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView2 != null) {
            qRView2.setOnClickListener(new equals(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) setMin(resetInternal.setMax.warmup);
        if (danaButtonSecondaryView2 != null) {
            danaButtonSecondaryView2.setOnClickListener(new getMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ BaseRequestMoneyQrCardFragment setMin;

        getMax(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
            this.setMin = baseRequestMoneyQrCardFragment;
        }

        public final void onClick(View view) {
            access$2900 access_2900 = this.setMin.getMin;
            if (access_2900 != null) {
                NoteAmountCalculatorActivity.getMin getmin = NoteAmountCalculatorActivity.Companion;
                BaseActivity baseActivity = this.setMin.getMax;
                Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
                String valueOf = String.valueOf(access_2900.length);
                String valueOf2 = String.valueOf(access_2900.getMin);
                String string = this.setMin.getString(R.string.request_money_amount_calculator_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…_amount_calculator_title)");
                this.setMin.toIntRange.getMin(NoteAmountCalculatorActivity.getMin.setMax(baseActivity, valueOf, valueOf2, string), (name) null);
                return;
            }
            BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment = this.setMin;
            if (baseRequestMoneyQrCardFragment.getMin == null) {
                loadOriginalImage.setMax setmax = baseRequestMoneyQrCardFragment.requestMoneyQrPresenter;
                if (setmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
                }
                setmax.getMax();
            }
        }
    }

    public final void Mean$Arithmetic() {
        QRView qRView = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView != null) {
            qRView.showEmptyQr();
        }
        QRView qRView2 = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView2 != null) {
            qRView2.setEnabled(true);
        }
        QRView qRView3 = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView3 != null) {
            qRView3.hideSkeleton();
        }
        SocialShareView socialShareView = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setEnableShareButton(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void Grayscale$Algorithm() {
        QRView qRView = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView != null) {
            qRView.showSkeleton();
        }
        SocialShareView socialShareView = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setEnableShareButton(false);
        }
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "qrString");
        length(BottomPopup.getMin(str).subscribe(new getMin(this), new setMin(this)));
        QRView qRView = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView != null) {
            qRView.setEnabled(false);
        }
        boolean z = this.setMax;
        SocialShareView socialShareView = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setEnableShareButton(z);
        }
    }

    public final void getMax(boolean z) {
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMin(resetInternal.setMax.warmup);
        int i = 8;
        boolean z2 = true;
        if (danaButtonSecondaryView != null) {
            View view = danaButtonSecondaryView;
            boolean z3 = !valueOf() && !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z3 ? 0 : 8);
        }
        Group group = (Group) setMin(resetInternal.setMax.multiple);
        if (group != null) {
            View view2 = group;
            boolean z4 = valueOf() && !z;
            Intrinsics.checkNotNullParameter(view2, "$this$toggleVisibilityInvisible");
            view2.setVisibility(z4 ? 0 : 4);
        }
        TextView textView = (TextView) setMin(resetInternal.setMax.isSubmitButtonEnabled);
        if (textView != null) {
            View view3 = textView;
            if (!(!StringsKt.isBlank(this.equals)) || z) {
                z2 = false;
            }
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(z2 ? 0 : 8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMin(resetInternal.setMax.ICustomTabsCallback$Default);
        if (danaButtonPrimaryView != null) {
            View view4 = danaButtonPrimaryView;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            if (z) {
                i = 0;
            }
            view4.setVisibility(i);
        }
    }

    private boolean valueOf() {
        return invokeSuspend() || (StringsKt.isBlank(this.equals) ^ true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ BaseRequestMoneyQrCardFragment length;

        length(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
            this.length = baseRequestMoneyQrCardFragment;
        }

        public final void onClick(View view) {
            BaseRequestMoneyQrCardFragment.setMin(this.length);
            this.length.values();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ BaseRequestMoneyQrCardFragment setMax;

        equals(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
            this.setMax = baseRequestMoneyQrCardFragment;
        }

        public final void onClick(View view) {
            this.setMax.values();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<Throwable> {
        final /* synthetic */ BaseRequestMoneyQrCardFragment getMin;

        setMin(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
            this.getMin = baseRequestMoneyQrCardFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            QRView qRView = (QRView) this.getMin.setMin(resetInternal.setMax.setShowingForActionMode);
            if (qRView != null) {
                BaseRequestMoneyQrCardFragment.getMin(qRView, (Bitmap) null);
            }
        }
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "profileQrUrl");
        this.setMax = false;
        setMax(false);
        loadOriginalImage.setMax setmax = this.requestMoneyQrPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
        }
        setmax.length();
        getTransitionProperties.setMin setmin = this.profileDeeplinkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileDeeplinkPresenter");
        }
        setmin.getMin(str, getString(R.string.deeplink_title_request_money), getString(R.string.deeplink_description_request_money), false);
    }

    public final void setMax(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "qrCode");
        this.setMax = false;
        setMax(false);
        loadOriginalImage.setMax setmax = this.requestMoneyQrPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
        }
        setmax.length();
        getTransitionProperties.getMax getmax = this.transferDeepLinkPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transferDeepLinkPresenter");
        }
        BaseActivity baseActivity = this.getMax;
        String str3 = null;
        if (baseActivity != null) {
            str2 = baseActivity.getString(R.string.deeplink_title_request_money);
        } else {
            str2 = null;
        }
        BaseActivity baseActivity2 = this.getMax;
        if (baseActivity2 != null) {
            str3 = baseActivity2.getString(R.string.deeplink_description_request_money);
        }
        getmax.setMin(str, str2, str3);
    }

    private boolean invokeSuspend() {
        return this.setMin.setMin > 0;
    }

    public static final /* synthetic */ void getMin(QRView qRView, Bitmap bitmap) {
        qRView.hideSkeleton();
        qRView.getQrImageView().setImageBitmap(bitmap);
    }

    public static final /* synthetic */ void setMin(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment) {
        baseRequestMoneyQrCardFragment.getMax(new APImageDownloadRsp(0));
        baseRequestMoneyQrCardFragment.setMin("");
        baseRequestMoneyQrCardFragment.getMax(false);
    }

    public static final /* synthetic */ void getMax(BaseRequestMoneyQrCardFragment baseRequestMoneyQrCardFragment, Intent intent) {
        String stringExtra = intent.getStringExtra("amount");
        if (stringExtra != null) {
            baseRequestMoneyQrCardFragment.getMax(new APImageDownloadRsp(stringExtra));
        }
        String stringExtra2 = intent.getStringExtra("remarks");
        if (stringExtra2 != null) {
            baseRequestMoneyQrCardFragment.setMin(stringExtra2);
        }
        baseRequestMoneyQrCardFragment.getMax(false);
        baseRequestMoneyQrCardFragment.values();
    }
}
