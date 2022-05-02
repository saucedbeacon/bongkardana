package id.dana.sendmoney.voucher;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.ChangeVoucherModule;
import id.dana.dialog.DialogWithImage;
import id.dana.sendmoney.model.VoucherModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.BindBitmap;
import o.CornerMarkingDataProvider;
import o.IntRange;
import o.PhotoParam;
import o.PrepareException;
import o.getInsetDodgeRect;
import o.installApp;
import o.onDetachedFromLayoutParams;
import o.refreshUpdateTime;

public class ChangeVoucherView extends BaseRichView implements BindBitmap.setMax {
    public static final int CHANGE_VOUCHER_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    public static final int DEFAULT_INDEX = -99;
    @BindView(2131362055)
    Button btnChange;
    refreshUpdateTime changeVoucherComponent;
    private onDetachedFromLayoutParams equals;
    private List<VoucherModel> getMax;
    private boolean getMin;
    private String isInside;
    private List<String> length;
    @Inject
    public BindBitmap.getMin presenter;
    private VoucherModel setMax;
    private boolean setMin;
    private getMin toFloatRange;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365600)
    TextView tvTitle;
    @BindView(2131365996)
    View voucherView;

    public interface getMin {
        void getMin(String str);
    }

    public int getLayout() {
        return R.layout.view_change_voucher;
    }

    public void setup() {
    }

    public ChangeVoucherView(@NonNull Context context) {
        super(context);
    }

    public ChangeVoucherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChangeVoucherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r3) {
        super.injectComponent(r3);
        if (this.changeVoucherComponent == null) {
            installApp.getMin min = installApp.setMin();
            if (r3 != null) {
                min.setMin = r3;
                min.setMax = new ChangeVoucherModule(this);
                this.changeVoucherComponent = min.setMin();
            } else {
                throw null;
            }
        }
        this.changeVoucherComponent.getMax(this);
        registerPresenter(this.presenter);
    }

    public void initPrePay(String str, String str2) {
        this.presenter.getMin(str, str2);
    }

    public void setPayMethod(String str) {
        this.getMin = !str.equals(this.isInside);
        this.isInside = str;
        length(this.getMax, str);
    }

    public void setChooserContent(String str, String str2) {
        this.tvTitle.setText(str);
        this.tvDescription.setText(str2);
    }

    public void setSelectedVoucherThenRefresh(VoucherModel voucherModel) {
        this.setMax = voucherModel;
        if (TextUtils.isEmpty(voucherModel.setMin)) {
            length();
            return;
        }
        setChooserContent(this.setMax.getMax, this.setMax.getMin);
        this.btnChange.setText(R.string.change);
        this.voucherView.setVisibility(0);
    }

    public void showVoucherContent() {
        if (this.getMax != null && this.isInside != null) {
            int i = -99;
            VoucherModel voucherModel = this.setMax;
            if (voucherModel != null) {
                i = voucherModel.hashCode;
            }
            getBaseActivity().startActivityForResult(VoucherDetailActivity.createTransferIntent(getBaseActivity(), this.getMax, i), CHANGE_VOUCHER_REQUEST_CODE);
        }
    }

    public VoucherModel getSelectedVoucher() {
        return this.setMax;
    }

    @OnClick({2131362055})
    public void onChangeClick() {
        showVoucherContent();
    }

    public void dismissProgress() {
        if (this.isInside != null) {
            getMin();
        }
    }

    public void onError(String str) {
        showWarningDialog(str);
        this.voucherView.setVisibility(8);
    }

    private void getMin() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.equals = null;
        }
        if (this.getMax != null) {
            this.voucherView.setVisibility(0);
        }
    }

    public void setVoucherModels(ArrayList<VoucherModel> arrayList) {
        if (!arrayList.isEmpty()) {
            this.voucherView.setVisibility(0);
            this.getMax = arrayList;
            length(arrayList, this.isInside);
            return;
        }
        this.voucherView.setVisibility(8);
        getMin();
    }

    private void length(List<VoucherModel> list, String str) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                VoucherModel voucherModel = list.get(i);
                voucherModel.hashCode = i;
                voucherModel.toDoubleRange = voucherModel.getMax(str);
                if (voucherModel.length() && !z) {
                    getMax();
                    setSelectedVoucherThenRefresh(voucherModel);
                    z = true;
                }
            }
            if (!z) {
                setSelectedVoucherThenRefresh(new VoucherModel());
                if (!this.setMin) {
                    setMin();
                } else {
                    length();
                }
            }
            this.setMin = true;
            getMin();
        }
    }

    private void setMin() {
        getMin getmin;
        List<String> list = this.length;
        if (list != null) {
            for (String next : list) {
                Iterator<VoucherModel> it = this.getMax.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getMax(next) && (getmin = this.toFloatRange) != null) {
                            getmin.getMin(next);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private void length() {
        setChooserContent(getContext().getString(R.string.no_voucher), getContext().getString(R.string.no_voucher_description));
        this.btnChange.setText(R.string.sendmoney_voucher_btn_check);
    }

    private void getMax() {
        if (getBaseActivity() != null && this.getMin) {
            DialogWithImage.getMin max = new DialogWithImage.getMin().getMax(false).setMax(false);
            max.toFloatRange = R.drawable.ic_voucher_dialog;
            max.getMax = getContext().getString(R.string.sendmoney_voucher_dialog_title);
            max.setMin = getContext().getString(R.string.sendmoney_voucher_dialog_desc);
            max.getMin = getContext().getString(R.string.sendmoney_voucher_dialog_action);
            max.length = PhotoParam.setMin;
            new DialogWithImage(getContext(), max.setMax, max, (byte) 0).setMin();
        }
    }

    public void setListener(getMin getmin) {
        this.toFloatRange = getmin;
    }

    public void setAvailablePayMethods(List<String> list) {
        this.length = list;
    }

    public void showProgress() {
        this.voucherView.setVisibility(8);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.voucherView);
            setmax.getMax = R.layout.view_voucher_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.equals = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public static /* synthetic */ void getMax(DialogInterface dialogInterface, int i) {
        if (-1 == i) {
            dialogInterface.dismiss();
        }
    }
}
