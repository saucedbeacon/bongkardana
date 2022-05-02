package id.dana.splitbill.adapter;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.richview.CircleImageSelectionView;
import id.dana.richview.CurrencyEditText;
import id.dana.richview.CurrencyTextView;
import id.dana.splitbill.model.SplitBillPayerModel;
import java.util.Locale;
import o.AUFrameLayout;
import o.AULinearLayout;
import o.AUScrollLayout;
import o.Ignore;
import o.IntRange;
import o.MenuItemLayout;
import o.NebulaLoadingView;
import o.WheelView;
import o.isOriginHasAppInfo;

public class PayerViewHolder extends Ignore<SplitBillPayerModel> {
    @BindView(2131362289)
    CircleImageSelectionView cisvAvatar;
    @BindView(2131362812)
    CurrencyEditText etAmount;
    private long getMin;
    private length setMax;
    @BindView(2131365439)
    TextView tvPayerName;
    @BindView(2131365442)
    TextView tvPhoneNumber;
    @BindView(2131365517)
    TextView tvRequesterExcludeAmount;

    public interface length {
        void getMax();

        void length(int i);

        void setMin(long j, int i);
    }

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        TextView textView;
        String str2;
        String str3;
        SplitBillPayerModel splitBillPayerModel = (SplitBillPayerModel) obj;
        if (splitBillPayerModel != null) {
            this.cisvAvatar.loadImage(splitBillPayerModel.setMax, R.drawable.ic_avatar_grey_default);
            this.cisvAvatar.setPaddingPhoto(4);
            this.cisvAvatar.useRemoveIcon(true);
            if (splitBillPayerModel.setMin()) {
                this.cisvAvatar.setActionIcon(splitBillPayerModel.getMin() ? R.drawable.ic_add_green : R.drawable.ic_minus_red);
            } else {
                this.cisvAvatar.setActionIcon(R.drawable.cancel);
            }
            this.cisvAvatar.setListener(new AUFrameLayout(this, splitBillPayerModel));
            this.tvPhoneNumber.setText(isOriginHasAppInfo.getNormalizePrefixPhoneNumber(splitBillPayerModel.getMax));
            TextView textView2 = this.tvPhoneNumber;
            boolean min = splitBillPayerModel.getMin();
            Context context = this.length;
            int i = R.color.f24652131100415;
            textView2.setTextColor(IntRange.setMax(context, min ? R.color.f24652131100415 : R.color.f18552131099733));
            if (splitBillPayerModel.setMin()) {
                textView = this.tvPayerName;
                str = this.length.getString(R.string.you);
            } else {
                textView = this.tvPayerName;
                if (splitBillPayerModel.setMin.equals("-")) {
                    str3 = splitBillPayerModel.getMin;
                } else {
                    str3 = splitBillPayerModel.setMin;
                }
                if ("splitBillPayer".equals(str3)) {
                    str = this.length.getString(R.string.payer);
                } else if (splitBillPayerModel.setMin.equals("-")) {
                    str = splitBillPayerModel.getMin;
                } else {
                    str = splitBillPayerModel.setMin;
                }
            }
            textView.setText(str);
            TextView textView3 = this.tvPayerName;
            boolean min2 = splitBillPayerModel.getMin();
            Context context2 = this.length;
            if (!min2) {
                i = R.color.f18552131099733;
            }
            textView3.setTextColor(IntRange.setMax(context2, i));
            if (splitBillPayerModel.setMin()) {
                int i2 = 8;
                this.tvRequesterExcludeAmount.setVisibility(splitBillPayerModel.getMin() ? 0 : 8);
                CurrencyEditText currencyEditText = this.etAmount;
                if (!splitBillPayerModel.getMin()) {
                    i2 = 0;
                }
                currencyEditText.setVisibility(i2);
            } else {
                this.etAmount.setVisibility(0);
            }
            if (this.etAmount.getVisibility() == 0) {
                CurrencyEditText currencyEditText2 = this.etAmount;
                if (splitBillPayerModel.equals == null) {
                    str2 = "Rp0";
                } else {
                    str2 = splitBillPayerModel.equals.setMax();
                }
                currencyEditText2.setText(str2);
                this.etAmount.setLocked(splitBillPayerModel.getMax());
                this.etAmount.setVisibility(0);
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                this.etAmount.setFilters(new InputFilter[]{new InputFilter.LengthFilter(NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, this.getMin, "Rp").length())});
                this.etAmount.setOnEditorActionListener(new AUScrollLayout(this));
                this.etAmount.setListener(new MenuItemLayout(this, splitBillPayerModel));
                this.etAmount.setOnFocusChangeListener(new AULinearLayout(this, splitBillPayerModel));
            }
        }
    }

    public PayerViewHolder(ViewGroup viewGroup, length length2, long j) {
        super(viewGroup.getContext(), R.layout.item_split_bill_payer, viewGroup);
        this.setMax = length2;
        this.getMin = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: setMax */
    public boolean getMax(int i) {
        if (6 != i) {
            return false;
        }
        getMax();
        this.setMax.getMax();
        return true;
    }

    private void getMax() {
        this.etAmount.setLocked(true);
        this.etAmount.clearFocus();
        length length2 = this.setMax;
        if (length2 != null) {
            length2.setMin(Long.valueOf(this.etAmount.getAmount()).longValue(), getAdapterPosition());
        }
    }

    private boolean length(SplitBillPayerModel splitBillPayerModel) {
        return (splitBillPayerModel == null || splitBillPayerModel.equals == null || splitBillPayerModel.equals.getMax.equals(this.etAmount.getAmount())) ? false : true;
    }

    public static /* synthetic */ void setMax(PayerViewHolder payerViewHolder, SplitBillPayerModel splitBillPayerModel) {
        int i;
        length length2 = payerViewHolder.setMax;
        if (length2 != null) {
            if (splitBillPayerModel.setMin()) {
                i = 0;
            } else {
                i = payerViewHolder.getAdapterPosition();
            }
            length2.length(i);
        }
    }

    public static /* synthetic */ void getMin(PayerViewHolder payerViewHolder, SplitBillPayerModel splitBillPayerModel) {
        if (payerViewHolder.length(splitBillPayerModel)) {
            payerViewHolder.getMax();
        }
    }

    public static /* synthetic */ void length(PayerViewHolder payerViewHolder, SplitBillPayerModel splitBillPayerModel, boolean z) {
        if (!z && payerViewHolder.length(splitBillPayerModel)) {
            payerViewHolder.getMax();
        }
    }
}
