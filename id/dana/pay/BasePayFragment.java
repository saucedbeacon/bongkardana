package id.dana.pay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.google.android.exoplayer2.C;
import id.dana.R;
import id.dana.home.view.QrRefreshNotification;
import id.dana.home.view.ZoomDialog;
import id.dana.pay.view.BasePayView;
import io.reactivex.annotations.Nullable;
import java.util.concurrent.TimeUnit;
import o.ChooseFileBridgeExtension;
import o.FileBridgeExtension;
import o.FtsOptions$Order;
import o.GriverProgressBar;
import o.IntRange;
import o.TitleBarRightButtonView;
import o.beginFakeDrag;
import o.chooseFileFromDisk;
import o.deleteFile;
import o.getPageSize;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.isInAccessExternalPathWhiteList;
import o.isUserInputEnabled;
import o.setH5MenuList;

public abstract class BasePayFragment extends FtsOptions$Order implements ChooseFileBridgeExtension.AnonymousClass4, isInAccessExternalPathWhiteList {
    private FileBridgeExtension IsOverlapping;
    @BindView(2131362204)
    @Nullable
    ImageView cardBackground;
    @BindView(2131363374)
    @Nullable
    ImageView cardSchemeLogo;
    private PayCardInfo equals;
    private getPageSize.setMin getMin;
    @BindView(2131363436)
    @Nullable
    ImageView ivExpressPay;
    @BindView(2131364219)
    @Nullable
    TextView payContent;
    @BindView(2131364220)
    @Nullable
    TextView payContentIdentifier;
    @BindView(2131364221)
    @Nullable
    TextView payId;
    @BindView(2131364222)
    @Nullable
    ImageView payLogo;
    @BindView(2131364229)
    @Nullable
    TextView payTitle;
    @BindView(2131365448)
    @Nullable
    TextView preferredText;
    @BindView(2131364227)
    @Nullable
    BasePayView qrBarcodePayView;
    @BindView(2131365534)
    @Nullable
    TextView scanInfoText;
    protected isUserInputEnabled.getMax setMax;
    private beginFakeDrag.setMax setMin;
    private GriverProgressBar.UpdateRunnable toFloatRange;

    public void setMax() {
        BasePayView basePayView = this.qrBarcodePayView;
        if (basePayView != null) {
            basePayView.setOnClickListener(new BasePayView.setMax() {
                public final void setMin() {
                    if (BasePayFragment.this.values()) {
                        BasePayFragment.this.setMax.getMin();
                    } else {
                        BasePayFragment.this.setMax.setMin();
                    }
                }

                public final void length() {
                    BasePayFragment.setMin(BasePayFragment.this, false);
                }

                public final void setMax() {
                    BasePayFragment.setMin(BasePayFragment.this, true);
                }
            });
        }
    }

    public final boolean values() {
        getPageSize.setMin setmin = this.getMin;
        if (setmin != null) {
            return setmin.length().booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void getMin(isUserInputEnabled.getMax getmax) {
        this.setMax = getmax;
    }

    /* access modifiers changed from: protected */
    public final void setMax(getPageSize.setMin setmin) {
        this.getMin = setmin;
    }

    /* access modifiers changed from: protected */
    public final void setMax(beginFakeDrag.setMax setmax) {
        this.setMin = setmax;
    }

    /* access modifiers changed from: protected */
    public final void length(String str, String str2) {
        this.setMin.getMin((String) null, str, str2);
    }

    /* access modifiers changed from: protected */
    public void getMax() {
        this.setMax.equals();
    }

    /* access modifiers changed from: protected */
    public void equals() {
        this.setMax.getMax(this.equals.equals);
        this.setMin.getMin(this.equals.setMin, this.equals.FastBitmap$CoordinateSystem, this.equals.toString);
    }

    public void setMax(boolean z) {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getParcelable("CARD_INFO") != null) {
            PayCardInfo payCardInfo = (PayCardInfo) arguments.getParcelable("CARD_INFO");
            this.equals = payCardInfo;
            String str = payCardInfo.IsOverlapping;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            FileBridgeExtension min = deleteFile.setMin(str);
            this.IsOverlapping = min;
            int max = IntRange.setMax(getContext(), min.toIntRange);
            int max2 = IntRange.setMax(getContext(), this.IsOverlapping.length);
            setMax(max, max2);
            this.preferredText.setTextColor(max);
            this.scanInfoText.setTextColor(max);
            this.payContentIdentifier.setTextColor(max);
            this.payContentIdentifier.setText(R.string.valid_thru);
            this.payContent.setTextColor(max2);
            getCause();
        }
    }

    public void toDoubleRange() {
        BasePayView basePayView;
        if (!values() && (basePayView = this.qrBarcodePayView) != null) {
            basePayView.invalidCode();
        }
        isUserInputEnabled.getMax getmax = this.setMax;
        if (getmax != null) {
            getmax.toFloatRange();
        }
        GriverProgressBar.UpdateRunnable updateRunnable = this.toFloatRange;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        beginFakeDrag.setMax setmax = this.setMin;
        if (setmax != null) {
            setmax.length();
        }
    }

    public void FastBitmap$CoordinateSystem() {
        if (!values()) {
            BasePayView basePayView = this.qrBarcodePayView;
            if (basePayView != null) {
                basePayView.fetchCode();
            }
            if (this.setMax != null) {
                getMax();
            }
            if (this.setMin != null) {
                this.toFloatRange = TitleBarRightButtonView.AnonymousClass1.timer(1, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new chooseFileFromDisk(this));
            }
        } else if (this.setMax != null) {
            getMax();
            equals();
        }
    }

    public final void setMax(String str) {
        BasePayView basePayView = this.qrBarcodePayView;
        if (basePayView != null) {
            basePayView.setCode(str);
        }
    }

    public final void Grayscale$Algorithm() {
        isUserInputEnabled.getMax getmax = this.setMax;
        if (getmax != null) {
            getmax.setMin();
        }
    }

    public final void invokeSuspend() {
        isUserInputEnabled.getMax getmax = this.setMax;
        if (getmax != null) {
            getmax.length();
        }
    }

    public final void valueOf() {
        BasePayView basePayView = this.qrBarcodePayView;
        if (basePayView != null) {
            basePayView.startRefresh();
        }
    }

    public final void Mean$Arithmetic() {
        BasePayView basePayView = this.qrBarcodePayView;
        if (basePayView != null) {
            basePayView.stopRefresh();
        }
    }

    public final void invoke() {
        BasePayView basePayView = this.qrBarcodePayView;
        if (basePayView != null) {
            basePayView.invalidCode();
        }
    }

    public final void getMin(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(QrRefreshNotification.ACTION);
            intent.putExtra(QrRefreshNotification.STATE, str);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra(QrRefreshNotification.DATA, str2);
            }
            if (getActivity() != null) {
                getActivity().sendBroadcast(intent);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int setMin(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1934979172: goto L_0x0040;
                case -1062451836: goto L_0x0036;
                case -1003810246: goto L_0x002c;
                case 70789: goto L_0x0022;
                case 425933967: goto L_0x0018;
                case 1067049040: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "MASTW7ID"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "BCAC7ID"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "GPN"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 2
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "AMEXW7ID"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 4
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "JCBW7ID"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "VISAW7ID"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 0
            goto L_0x004b
        L_0x004a:
            r7 = -1
        L_0x004b:
            if (r7 == 0) goto L_0x006c
            if (r7 == r6) goto L_0x0068
            if (r7 == r5) goto L_0x0064
            if (r7 == r4) goto L_0x0060
            if (r7 == r3) goto L_0x005c
            if (r7 == r2) goto L_0x0058
            return r1
        L_0x0058:
            r7 = 2131231053(0x7f08014d, float:1.8078176E38)
            return r7
        L_0x005c:
            r7 = 2131231034(0x7f08013a, float:1.8078138E38)
            return r7
        L_0x0060:
            r7 = 2131232471(0x7f0806d7, float:1.8081052E38)
            return r7
        L_0x0064:
            r7 = 2131231440(0x7f0802d0, float:1.8078961E38)
            return r7
        L_0x0068:
            r7 = 2131232541(0x7f08071d, float:1.8081194E38)
            return r7
        L_0x006c:
            r7 = 2131232786(0x7f080812, float:1.8081691E38)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.pay.BasePayFragment.setMin(java.lang.String):int");
    }

    private void getMax(int i, String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < i) {
            sb.insert(0, "•");
        }
        this.payId.setText(new StringBuilder(setH5MenuList.getMin(sb.toString(), i - 1)).toString());
    }

    private void setMax(String str, String str2) {
        if (str2.length() == 4) {
            str2 = str2.substring(2);
        }
        this.payContent.setText(String.format(getString(R.string.validity), new Object[]{str, str2}));
    }

    /* access modifiers changed from: protected */
    public final void setMax(int i, int i2) {
        this.cardBackground.setImageResource(this.IsOverlapping.IsOverlapping);
        this.payLogo.setImageResource(this.IsOverlapping.getMin);
        this.payTitle.setTextColor(i);
        this.payId.setTextColor(i2);
    }

    /* access modifiers changed from: protected */
    public final void getCause() {
        int i;
        TextView textView = this.payTitle;
        String str = this.equals.getMax;
        int i2 = 0;
        if ("DEBIT_CARD".equals(str)) {
            i = R.string.debit_card;
        } else {
            i = "CREDIT_CARD".equals(str) ? R.string.credit_card : 0;
        }
        textView.setText(i);
        TextView textView2 = this.preferredText;
        if (!this.equals.getMax()) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        create();
        this.cardSchemeLogo.setImageResource(setMin(this.equals.getMin));
        getMax(this.equals.setMax, this.equals.isInside);
        setMax(this.equals.length, this.equals.toIntRange);
    }

    private void create() {
        if (this.equals.setMax()) {
            this.preferredText.setVisibility(8);
            this.ivExpressPay.setVisibility(0);
            this.ivExpressPay.setImageResource(this.IsOverlapping.setMax);
        }
    }

    /* access modifiers changed from: package-private */
    public final PayCardInfo onNavigationEvent() {
        return this.equals;
    }

    public void onDestroyView() {
        isUserInputEnabled.getMax getmax = this.setMax;
        if (getmax != null) {
            getmax.length();
        }
        super.onDestroyView();
    }

    static /* synthetic */ void setMin(BasePayFragment basePayFragment, boolean z) {
        Intent intent = new Intent(basePayFragment.getActivity(), ZoomDialog.class);
        intent.putExtra(ZoomDialog.QR_BAR_CODE, basePayFragment.qrBarcodePayView.getCode());
        intent.putExtra(ZoomDialog.QR_DISPLAYED, z);
        intent.setFlags(C.ENCODING_PCM_A_LAW);
        basePayFragment.startActivity(intent);
    }
}
