package id.dana.sendmoney.paymethod;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.di.modules.PayMethodModule;
import id.dana.domain.payasset.model.Institution;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.premium.PremiumNoticeActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ForceStopRunnable$BroadcastReceiver;
import o.IntRange;
import o.PhotoInfo;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.evaluate;
import o.getChildrenSkipCount;
import o.getClientCount;
import o.getDataFieldCount;
import o.getInsetDodgeRect;
import o.getTopSortedChildren;
import o.isBaselineAligned;
import o.isLineVisible;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.removeAll;
import o.setGridCheckStatus;
import o.setOffset;
import o.setPhotoInfo;
import o.updateCornerMarking;
import o.updateGrid;

public class ChangePayMethodView extends BaseRichView implements ForceStopRunnable$BroadcastReceiver.length {
    public static final String FUND_SOURCE_TYPE = "FUND_SOURCE_TYPE";
    public static final String OTHER_DEBIT_CARD = "OTHER_DEBIT_CARD";
    @BindView(2131362075)
    Button btnDone;
    @BindView(2131362393)
    ConstraintLayout clChangePayMethod;
    private onDetachedFromLayoutParams getMax;
    private boolean getMin;
    @BindView(2131363519)
    ImageView ivLogo;
    @BindView(2131363577)
    ImageView ivPrefixDescription;
    private PayMethodModel length;
    @BindView(2131363901)
    ConstraintLayout llParentPayMethod;
    @Inject
    public PhotoInfo payMethodAdapter;
    getClientCount payMethodComponent;
    @Inject
    public ForceStopRunnable$BroadcastReceiver.setMin presenter;
    @BindView(2131364540)
    RecyclerView rvPaymentMethod;
    private VoucherModel setMax;
    private setMax setMin;
    private String toFloatRange = "KYC2";
    @BindView(2131365608)
    TextView tvChangePaymethod;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365215)
    TextView tvDivider;
    @BindView(2131365450)
    TextView tvPrefixDescription;
    @BindView(2131365600)
    TextView tvTitle;

    public interface setMax {
        void length(PayMethodModel payMethodModel);

        void setMin();

        void setMin(List<String> list);
    }

    public int getLayout() {
        return R.layout.view_change_pay_method;
    }

    public ChangePayMethodView(@NonNull Context context) {
        super(context);
    }

    public ChangePayMethodView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChangePayMethodView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @OnClick({2131362056})
    public void changePayMethod() {
        showChangeMethod(true);
    }

    public void showDefaultView() {
        showChangeMethod(false);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r3) {
        super.injectComponent(r3);
        if (this.payMethodComponent == null) {
            removeAll.length max = removeAll.getMax();
            if (r3 != null) {
                max.getMin = r3;
                max.length = new PayMethodModule(this);
                this.payMethodComponent = max.getMax();
            } else {
                throw null;
            }
        }
        this.payMethodComponent.setMin(this);
        registerPresenter(this.presenter);
    }

    public void setup() {
        this.rvPaymentMethod.setLayoutManager(new LinearLayoutManager(getContext()));
        this.payMethodAdapter.getMax = new updateGrid(this);
        this.rvPaymentMethod.setAdapter(this.payMethodAdapter);
        this.btnDone.setOnClickListener(new setPhotoInfo(this));
    }

    public void init(String str) {
        this.presenter.getMin(str, (getDataFieldCount) null);
    }

    public void onItemClick(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-592522235, oncanceled);
            onCancelLoad.getMin(-592522235, oncanceled);
        }
        VoucherModel voucherModel = this.setMax;
        if (voucherModel == null || voucherModel.length(((PayMethodModel) this.payMethodAdapter.setMin(i)).values)) {
            getMin(i);
        } else {
            new isBaselineAligned(getBaseActivity(), isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelable(false).title(Integer.valueOf(R.string.dialog_warning_no_voucher_title), (String) null).message(Integer.valueOf(R.string.dialog_warning_no_voucher_applied), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton((Integer) null, (CharSequence) null, new setGridCheckStatus(this, i)).negativeButton((Integer) null, (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
        }
    }

    /* access modifiers changed from: private */
    public void getMin(int i) {
        setMax((PayMethodModel) this.payMethodAdapter.setMin(i));
        setMin((PayMethodModel) this.payMethodAdapter.setMin(i));
        showChangeMethod(false);
    }

    private static void setMin(PayMethodModel payMethodModel) {
        String str;
        HashMap hashMap = new HashMap();
        if (!payMethodModel.setMin() || payMethodModel.IsOverlapping != null) {
            if (payMethodModel.IsOverlapping != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(payMethodModel.values);
                sb.append("-");
                sb.append(payMethodModel.IsOverlapping);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(payMethodModel.values);
                sb2.append("-OTHER_DEBIT_CARD");
                str = sb2.toString();
            }
            hashMap.put(FUND_SOURCE_TYPE, str);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(payMethodModel.values);
        sb3.append("-ADD_CARD");
        hashMap.put(FUND_SOURCE_TYPE, sb3.toString());
    }

    private void setMax(PayMethodModel payMethodModel) {
        int i;
        PayMethodModel payMethodModel2 = this.length;
        if (payMethodModel2 != null) {
            payMethodModel2.invoke = false;
        }
        payMethodModel.invoke = true;
        setSelectedPayMethodModel(payMethodModel);
        this.tvTitle.setText(payMethodModel.length(getContext()));
        this.tvDescription.setText(payMethodModel.getMin(getContext()));
        setMin(!TextUtils.isEmpty(payMethodModel.IsOverlapping) ? String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", new Object[]{payMethodModel.IsOverlapping.toLowerCase()}) : null, payMethodModel.getMax());
        if (Institution.BCA_ONEKLIK.equals(payMethodModel.IsOverlapping)) {
            i = R.drawable.ic_oneklik;
        } else {
            i = payMethodModel.toFloatRange() ? R.drawable.ic_logo_expresspay : R.drawable.ic_visamaster;
        }
        this.ivPrefixDescription.setImageResource(i);
        setMin(payMethodModel.equals());
        this.setMin.length(payMethodModel);
        RecyclerView recyclerView = this.rvPaymentMethod;
        PhotoInfo photoInfo = this.payMethodAdapter;
        Objects.requireNonNull(photoInfo);
        recyclerView.post(new setOffset(photoInfo));
        if (!this.getMin && "BALANCE".equals(payMethodModel.values)) {
            setMax();
        }
    }

    private void setMin(String str, int i) {
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(i).setMin(i).length(this.ivLogo);
    }

    private void setMin(int i) {
        if (i != 0) {
            if (i != 2) {
                if (!(i == 3 || i == 4)) {
                    if (i != 5) {
                        this.tvDivider.setVisibility(8);
                        this.tvPrefixDescription.setVisibility(8);
                        this.ivPrefixDescription.setVisibility(8);
                        return;
                    }
                }
            }
            this.tvDivider.setVisibility(0);
            this.tvPrefixDescription.setVisibility(0);
            this.ivPrefixDescription.setVisibility(8);
            return;
        }
        this.tvDivider.setVisibility(0);
        this.tvPrefixDescription.setVisibility(8);
        this.ivPrefixDescription.setVisibility(0);
    }

    private void setMax() {
        setMax(this.payMethodAdapter.setMax());
        getBaseActivity().startActivityForResult(new Intent(getBaseActivity(), PremiumNoticeActivity.class), PremiumNoticeActivity.PREMIUM_NOTICE_REQUEST_CODE);
    }

    public void onGetPayMethodError() {
        onError(getContext().getString(R.string.general_error_msg));
    }

    public void onGetDefaultCardSuccess(String str) {
        PayMethodModel payMethodModel;
        PayMethodModel payMethodModel2;
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= this.payMethodAdapter.getMax().size()) {
                    break;
                }
                z = getMax(i, str);
                if (z) {
                    setMax((PayMethodModel) this.payMethodAdapter.setMin(i));
                    break;
                }
                i++;
            }
            if (!z) {
                if (this.getMin) {
                    payMethodModel2 = this.payMethodAdapter.setMin();
                } else {
                    payMethodModel2 = this.payMethodAdapter.setMax();
                }
                setMax(payMethodModel2);
                return;
            }
            return;
        }
        if (this.getMin) {
            payMethodModel = this.payMethodAdapter.setMin();
        } else {
            payMethodModel = this.payMethodAdapter.setMax();
        }
        setMax(payMethodModel);
    }

    public void onGetDefaultCardError() {
        onError(getContext().getString(R.string.general_error_msg));
    }

    public String getKycLevel() {
        return this.toFloatRange;
    }

    private boolean getMax(int i, String str) {
        if (this.payMethodAdapter.getMax().isEmpty()) {
            return false;
        }
        String str2 = ((PayMethodModel) this.payMethodAdapter.getMax().get(i)).getMin;
        if (!TextUtils.isEmpty(str2)) {
            return str2.equals(str);
        }
        return false;
    }

    public void onError(String str) {
        showWarningDialog(str);
    }

    public void setVoucherModel(VoucherModel voucherModel) {
        this.setMax = voucherModel;
    }

    public void setSelectedPayMethodModel(PayMethodModel payMethodModel) {
        this.length = payMethodModel;
    }

    public void setChangePayMethodListener(setMax setmax) {
        this.setMin = setmax;
    }

    public void setSelectedPayMethodByPayMethod(String str) {
        if (str != null) {
            for (PayMethodModel payMethodModel : this.payMethodAdapter.getMax()) {
                if (payMethodModel.values != null && payMethodModel.values.equals(str)) {
                    setMax(payMethodModel);
                    return;
                }
            }
        }
    }

    public void showChangeMethod(boolean z) {
        String str;
        int i = 0;
        this.rvPaymentMethod.setVisibility(z ? 0 : 8);
        this.clChangePayMethod.setVisibility(z ^ true ? 0 : 8);
        Button button = this.btnDone;
        if (!z) {
            i = 8;
        }
        button.setVisibility(i);
        TextView textView = this.tvChangePaymethod;
        Context context = getContext();
        if (z) {
            str = context.getString(R.string.change_method);
        } else {
            str = context.getString(R.string.payment_method);
        }
        textView.setText(str);
        if (z) {
            this.setMin.setMin();
        }
    }

    public void onGetPayMethodListSuccess(List<PayMethodModel> list, String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1904410082, oncanceled);
            onCancelLoad.getMin(1904410082, oncanceled);
        }
        if (TransferUserInfoResult.KycLevel.KYC_2.equals(str) || "KYC2".equals(str)) {
            this.getMin = true;
        }
        this.toFloatRange = str;
        this.payMethodAdapter.getMin(list);
        this.presenter.getMin();
        ArrayList arrayList = new ArrayList();
        for (PayMethodModel payMethodModel : this.payMethodAdapter.getMax()) {
            arrayList.add(payMethodModel.values);
        }
        this.setMin.setMin(arrayList);
    }

    public void showProgress() {
        this.clChangePayMethod.setVisibility(8);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.llParentPayMethod);
            setmax.getMax = R.layout.view_skeleton_change_pay_method;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMax = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        this.clChangePayMethod.setVisibility(0);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.getMax = null;
        }
    }

    public static /* synthetic */ void setMax(ChangePayMethodView changePayMethodView) {
        changePayMethodView.showChangeMethod(false);
        changePayMethodView.setMin.length(changePayMethodView.length);
    }
}
