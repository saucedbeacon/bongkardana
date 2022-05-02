package id.dana.richview.bank;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.google.android.material.textfield.TextInputEditText;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.AutoCompleteBankModule;
import id.dana.dialog.CommonDialog;
import id.dana.richview.bank.AutoCompleteBankView;
import id.dana.sendmoney.model.BankModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.GriverPhotoSelectActivity;
import o.IComponent;
import o.Ignore;
import o.PrepareException;
import o.RedDotManager;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.isAvailable;
import o.onLoadChildren;
import o.setNeedShowFail;
import o.stopIgnoring;
import o.y;

public class AutoCompleteBankView extends BaseRichView implements y.setMax {
    private BankModel IsOverlapping;
    @BindView(2131362815)
    TextInputEditText bankName;
    private setNeedShowFail getMax;
    private IComponent<Boolean> getMin = IComponent.setMax();
    private getMax isInside;
    @BindView(2131363386)
    ImageView ivClearInput;
    private boolean length = true;
    @Inject
    public y.setMin presenter;
    @BindView(2131364493)
    RecyclerView rvBankList;
    private IComponent<Boolean> setMax = IComponent.setMax();
    private AutoCompleteBankAdapter setMin;

    public interface getMax {
        void setMin(List<BankModel> list);
    }

    public int getLayout() {
        return R.layout.view_auto_complete_bank;
    }

    public AutoCompleteBankView(@NonNull Context context) {
        super(context);
    }

    public AutoCompleteBankView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoCompleteBankView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AutoCompleteBankView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.getMax == null) {
            isAvailable.setMin setmin = new isAvailable.setMin((byte) 0);
            if (r4 != null) {
                setmin.getMax = r4;
                setmin.setMin = new AutoCompleteBankModule(this);
                stopIgnoring.setMin(setmin.setMin, AutoCompleteBankModule.class);
                stopIgnoring.setMin(setmin.getMax, PrepareException.AnonymousClass1.class);
                this.getMax = new isAvailable(setmin.setMin, setmin.getMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.getMax(this);
        registerPresenter(this.presenter);
    }

    public void performQuery(@NonNull String str) {
        if (!this.length) {
            this.length = true;
        } else if (str.length() >= 3) {
            this.setMin.getFilter().filter(str);
            this.rvBankList.setVisibility(0);
        } else {
            this.rvBankList.setVisibility(8);
        }
    }

    public IComponent<Boolean> getNeedSenderNameSubject() {
        return this.setMax;
    }

    public void onGetAvailableBanksSuccess(List<BankModel> list) {
        this.setMin.length = list;
        getMax getmax = this.isInside;
        if (getmax != null) {
            getmax.setMin(list);
        }
    }

    public void onGetSenderNameSuccess(boolean z) {
        this.setMax.onNext(Boolean.valueOf(z));
    }

    public void onGetAvailableBanksFail(String str) {
        CommonDialog.getMax getmax = new CommonDialog.getMax(getContext());
        getmax.toFloatRange = str;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_warning_14;
        new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0).setMin();
    }

    public IComponent<Boolean> getBankNameVerifiedSubject() {
        return this.getMin;
    }

    @Nullable
    public BankModel getSelectedBankModel() {
        return this.IsOverlapping;
    }

    /* access modifiers changed from: private */
    public void getMin(BankModel bankModel) {
        this.IsOverlapping = bankModel;
        this.length = false;
        this.bankName.setText(bankModel.toIntRange);
        this.getMin.onNext(Boolean.TRUE);
        this.rvBankList.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363386})
    public void clearBankNameClick() {
        clearData();
    }

    public void clearData() {
        this.bankName.setText("");
        this.IsOverlapping = null;
        this.getMin.onNext(Boolean.FALSE);
        this.rvBankList.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @OnFocusChange({2131362815})
    public void editTextFocusChange(View view, boolean z) {
        this.ivClearInput.setVisibility(setMin(view, z) ? 0 : 8);
    }

    private boolean setMin(View view, boolean z) {
        return view == this.bankName && z;
    }

    public void setOnAutoCompleteBankViewListener(getMax getmax) {
        this.isInside = getmax;
    }

    public void setBankModels(List<BankModel> list) {
        if (list == null || list.size() <= 0) {
            this.presenter.getMin();
            return;
        }
        this.setMin.length = list;
        this.isInside.setMin(list);
    }

    public void setBankById(String str) {
        List<BankModel> list = this.setMin.length;
        if (list != null && !TextUtils.isEmpty(str)) {
            for (BankModel next : list) {
                if (str.equals(next.getMin)) {
                    getMin(next);
                    return;
                }
            }
        }
    }

    public void setup() {
        AutoCompleteBankAdapter autoCompleteBankAdapter = new AutoCompleteBankAdapter();
        this.setMin = autoCompleteBankAdapter;
        autoCompleteBankAdapter.getMax((Ignore.setMin) new Ignore.setMin(this) {
            private final AutoCompleteBankView getMax;

            {
                this.getMax = r1;
            }

            public final void length(int i) {
                this.getMax.getMin((BankModel) this.getMax.setMin.setMin(i));
            }
        });
        this.rvBankList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rvBankList.setAdapter(this.setMin);
        this.rvBankList.setNestedScrollingEnabled(false);
        addDisposable(onLoadChildren.textChanges(this.bankName).skipInitialValue().debounce(500, TimeUnit.MILLISECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).map(GriverPhotoSelectActivity.AnonymousClass1.getMin).subscribe(new RedDotManager(this) {
            private final AutoCompleteBankView length;

            {
                this.length = r1;
            }

            public final void accept(Object obj) {
                this.length.performQuery((String) obj);
            }
        }));
    }
}
