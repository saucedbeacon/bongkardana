package id.dana.richview.boundcard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.SavingModule;
import id.dana.domain.payasset.model.CardScheme;
import id.dana.richview.boundcard.model.BoundCard;
import java.util.Currency;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.DownloadStep;
import o.FileBridgeExtension;
import o.IntRange;
import o.PrepareException;
import o.Workflow;
import o.cancelAll;
import o.deleteFile;
import o.initUC7zSo;
import o.onNext;
import o.updateScreenRotation;
import org.jetbrains.annotations.NotNull;

public class DebitCardView extends BaseRichView {
    @BindView(2131362415)
    ConstraintLayout clDebitCard;
    @BindView(2131362416)
    ConstraintLayout clGnDebitCard;
    @BindView(2131362417)
    ConstraintLayout clGnDebitCardBackground;
    private BoundCard getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @BindView(2131363372)
    ImageView ivCardLogo;
    @BindView(2131363373)
    ImageView ivCardLogoGn;
    @BindView(2131363379)
    ImageView ivChannel;
    @BindView(2131363380)
    ImageView ivChannelGn;
    @BindView(2131363436)
    ImageView ivExpressPay;
    @BindView(2131363860)
    LinearLayout llDebitCardBackground;
    private FileBridgeExtension setMax;
    @BindView(2131365605)
    TextView tvDebit;
    @BindView(2131365266)
    TextView tvFromCurrencyGn;
    @BindView(2131365267)
    TextView tvFromCurrencyGnSymbol;
    @BindView(2131365338)
    TextView tvMaskNumber;
    @BindView(2131365339)
    TextView tvMaskNumberGn;
    @BindView(2131365448)
    TextView tvPreferred;
    @BindView(2131365497)
    TextView tvReferenceGn;
    @BindView(2131363617)
    ImageView tvRightArrowGn;
    @BindView(2131365628)
    TextView tvRpCurrencyGn;
    @BindView(2131365606)
    TextView tvTitleCardGn;
    @BindView(2131365636)
    TextView tvToCurrencyGn;
    @BindView(2131365655)
    TextView tvUpdateCard;
    @BindView(2131365659)
    TextView tvValidThru;
    @BindView(2131365660)
    TextView tvValidThruLabel;

    public int getLayout() {
        return R.layout.view_base_debit_card;
    }

    public DebitCardView(@NonNull Context context) {
        super(context);
    }

    public DebitCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DebitCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DebitCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMax();
    }

    public void setup() {
        this.globalNetworkPresenter.setMin();
        setMax();
    }

    public BoundCard getData() {
        return this.getMin;
    }

    public void setData(BoundCard boundCard) {
        this.getMin = boundCard;
        setMax();
    }

    private void setMax() {
        if (this.getMin != null && this.llDebitCardBackground != null) {
            if (length()) {
                setMax(this.getMin.setMin, this.ivChannel, this.ivChannelGn);
                this.tvUpdateCard.setVisibility(8);
                this.ivChannel.setVisibility(0);
                this.ivChannelGn.setVisibility(0);
                this.tvValidThru.setText(String.format("%s/%s", new Object[]{this.getMin.equals, this.getMin.getMax()}));
            } else {
                this.tvValidThru.setText(getContext().getString(R.string.expired));
                this.tvUpdateCard.setVisibility(0);
                this.ivChannel.setVisibility(8);
                this.ivChannelGn.setVisibility(8);
            }
            this.ivExpressPay.setVisibility(8);
            this.tvPreferred.setVisibility(8);
            toFloatRange();
            setMin();
        }
    }

    private boolean length() {
        String str = this.getMin.equals;
        String str2 = this.getMin.toFloatRange;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        int parseInt = Integer.parseInt(str2);
        int parseInt2 = Integer.parseInt(str);
        if (ConfirmPopup.AnonymousClass1.length(parseInt)) {
            return true;
        }
        if (!ConfirmPopup.AnonymousClass1.setMax(parseInt) || !ConfirmPopup.AnonymousClass1.getMin(parseInt2)) {
            return false;
        }
        return true;
    }

    private void setMin() {
        String str;
        String str2 = this.getMin.IsOverlapping;
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = str3;
        }
        FileBridgeExtension min = deleteFile.setMin(str2);
        this.setMax = min;
        this.ivCardLogo.setImageResource(min.getMin);
        this.ivCardLogoGn.setImageResource(this.setMax.getMin);
        this.llDebitCardBackground.setBackgroundResource(this.setMax.setMin);
        this.clGnDebitCardBackground.setBackgroundResource(this.setMax.setMin);
        TextView textView = this.tvMaskNumber;
        Object[] objArr = new Object[1];
        BoundCard boundCard = this.getMin;
        if (boundCard.toDoubleRange == null) {
            str = str3;
        } else {
            str = boundCard.toDoubleRange;
        }
        objArr[0] = str;
        textView.setText(String.format("•••• •••• •••• %s", objArr));
        TextView textView2 = this.tvMaskNumberGn;
        Object[] objArr2 = new Object[1];
        BoundCard boundCard2 = this.getMin;
        if (boundCard2.toDoubleRange != null) {
            str3 = boundCard2.toDoubleRange;
        }
        objArr2[0] = str3;
        textView2.setText(String.format("•••• •••• •••• %s", objArr2));
        getMin();
        IsOverlapping();
        getMax();
    }

    private void getMax() {
        int max = IntRange.setMax(getContext(), this.setMax.length);
        TextView[] textViewArr = {this.tvDebit, this.tvMaskNumber, this.tvUpdateCard, this.tvValidThru, this.tvValidThruLabel, this.tvFromCurrencyGn, this.tvReferenceGn, this.tvToCurrencyGn, this.tvTitleCardGn, this.tvFromCurrencyGnSymbol, this.tvRpCurrencyGn};
        for (int i = 0; i < 11; i++) {
            TextView textView = textViewArr[i];
            if (textView != null) {
                textView.setTextColor(max);
            }
        }
        this.tvRightArrowGn.setColorFilter(IntRange.setMax(getContext(), this.setMax.length));
    }

    private void setMax(String str, ImageView... imageViewArr) {
        if (getMax(str) != null) {
            for (int i = 0; i < 2; i++) {
                imageViewArr[i].setImageDrawable(cancelAll.getMin(getContext(), getMax(str).intValue()));
            }
        }
    }

    private void getMin() {
        this.tvPreferred.setTextColor(IntRange.setMax(getContext(), this.setMax.toIntRange));
        this.tvPreferred.setVisibility(this.getMin.equals() ? 0 : 8);
    }

    private void IsOverlapping() {
        if (this.getMin.getMin() || this.getMin.toIntRange()) {
            this.tvPreferred.setVisibility(8);
            this.ivExpressPay.setVisibility(0);
            ImageView imageView = this.ivExpressPay;
            FileBridgeExtension fileBridgeExtension = this.setMax;
            imageView.setImageResource(fileBridgeExtension.getMax == 0 ? fileBridgeExtension.setMax : fileBridgeExtension.getMax);
        }
    }

    @DrawableRes
    private static Integer getMax(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1934979172:
                if (str.equals(CardScheme.VISA)) {
                    c = 0;
                    break;
                }
                break;
            case -1062451836:
                if (str.equals(CardScheme.JCB)) {
                    c = 3;
                    break;
                }
                break;
            case -1003810246:
                if (str.equals(CardScheme.AMERICAN_EXPRESS)) {
                    c = 4;
                    break;
                }
                break;
            case 70789:
                if (str.equals(CardScheme.GPN)) {
                    c = 2;
                    break;
                }
                break;
            case 425933967:
                if (str.equals(CardScheme.BCA)) {
                    c = 5;
                    break;
                }
                break;
            case 1067049040:
                if (str.equals(CardScheme.MASTERCARD)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return Integer.valueOf(R.drawable.visa_with_border);
        }
        if (c == 1) {
            return Integer.valueOf(R.drawable.mastercard_with_border);
        }
        if (c == 2) {
            return Integer.valueOf(R.drawable.gpn_with_border);
        }
        if (c == 3) {
            return Integer.valueOf(R.drawable.jcb_with_border);
        }
        if (c == 4) {
            return Integer.valueOf(R.drawable.american_express_with_border);
        }
        if (c != 5) {
            return null;
        }
        return Integer.valueOf(R.drawable.bca_card_with_border);
    }

    private void toFloatRange() {
        BoundCard boundCard = this.getMin;
        if (boundCard != null && boundCard.setMax != null) {
            String str = this.getMin.setMax;
            if ("DEBIT_CARD".equals(str)) {
                this.tvDebit.setText(R.string.debit);
                this.tvTitleCardGn.setText(R.string.debit);
            } else if ("CREDIT_CARD".equals(str)) {
                this.tvDebit.setText(R.string.credit);
                this.tvTitleCardGn.setText(R.string.credit);
            }
        }
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        DownloadStep.AnonymousClass2.setMax setmax = new DownloadStep.AnonymousClass2.setMax((byte) 0);
        if (r4 != null) {
            setmax.getMin = r4;
            setmax.getMax = new GlobalNetworkModule(new Workflow() {
                public final void setMax(boolean z, String str) {
                    TextView textView = DebitCardView.this.tvFromCurrencyGnSymbol;
                    if (TextUtils.isEmpty(str)) {
                        str = "ID";
                    }
                    String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getSymbol();
                    if (symbol.equals("IDR")) {
                        symbol = "Rp";
                    }
                    textView.setText(symbol);
                    if (z) {
                        DebitCardView.this.clDebitCard.setVisibility(8);
                        DebitCardView.this.clGnDebitCard.setVisibility(8);
                        return;
                    }
                    DebitCardView.this.clDebitCard.setVisibility(0);
                    DebitCardView.this.clGnDebitCard.setVisibility(8);
                }

                public final void getMax(boolean z, String str) {
                    int i = 8;
                    DebitCardView.this.clDebitCard.setVisibility(z ? 8 : 0);
                    ConstraintLayout constraintLayout = DebitCardView.this.clGnDebitCard;
                    if (z) {
                        i = 0;
                    }
                    constraintLayout.setVisibility(i);
                    TextView textView = DebitCardView.this.tvFromCurrencyGnSymbol;
                    if (TextUtils.isEmpty(str)) {
                        str = "ID";
                    }
                    String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getSymbol();
                    if (symbol.equals("IDR")) {
                        symbol = "Rp";
                    }
                    textView.setText(symbol);
                }

                public final void setMax(initUC7zSo inituc7zso) {
                    DebitCardView.this.tvToCurrencyGn.setText(inituc7zso.getRoundedRate());
                }
            });
            setmax.length = new SavingModule(new updateScreenRotation.getMax() {
                @JvmDefault
                public void dismissProgress() {
                }

                public void getMax(@NotNull SightCameraView sightCameraView) {
                    Intrinsics.checkNotNullParameter(sightCameraView, "savingSummaryModel");
                }

                public void getMin() {
                }

                @JvmDefault
                public void onError(@org.jetbrains.annotations.Nullable String str) {
                }

                public void setMax(@NotNull getRegionExitPeriod getregionexitperiod) {
                    Intrinsics.checkNotNullParameter(getregionexitperiod, "savingCreateInit");
                }

                public void setMax(boolean z) {
                }

                public void setMin(@NotNull onSurfaceTextureSizeChanged onsurfacetexturesizechanged) {
                    Intrinsics.checkNotNullParameter(onsurfacetexturesizechanged, "savingEmptyStateModel");
                }

                public void setMin(boolean z) {
                }

                @JvmDefault
                public void showProgress() {
                }
            });
            setmax.length().length(this);
            registerPresenter(this.globalNetworkPresenter);
            return;
        }
        throw null;
    }
}
