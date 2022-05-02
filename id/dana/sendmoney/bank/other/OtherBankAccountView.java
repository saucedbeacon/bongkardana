package id.dana.sendmoney.bank.other;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import butterknife.OnTextChanged;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import id.dana.R;
import id.dana.bank.BankSelectorActivity;
import id.dana.base.BaseRichView;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.OtherBankAccountModule;
import id.dana.richview.ForceImeEditText;
import id.dana.richview.bank.AutoCompleteBankView;
import id.dana.sendmoney.model.BankModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.APCenterCropMode;
import o.ImageFileType;
import o.PrepareException;
import o.TitleBarRightButtonView;
import o.detectImageDataType;
import o.detectImageFileType;
import o.getExtraDataParsers;
import o.getPackages;
import o.isGif;
import o.isInMainThread;
import o.isJPEG;
import o.isProgressive;
import o.isSuperSize;
import o.onLoadChildren;
import o.onReceivedIcon;
import o.setEnableSaliency;
import o.setH5MenuList;
import o.setOnWheelViewListener;
import o.setPriority;
import o.stopIgnoring;

public class OtherBankAccountView extends BaseRichView {
    @BindView(2131365839)
    AutoCompleteBankView autoCompleteBankView;
    @BindView(2131362816)
    TextInputEditText bankNumber;
    @BindView(2131362062)
    Button btnConfirm;
    @BindView(2131362811)
    ForceImeEditText etAlias;
    @BindView(2131362832)
    ForceImeEditText etSenderNameInput;
    /* access modifiers changed from: private */
    public List<getExtraDataParsers> getMax;
    private int getMin = 20;
    @BindView(2131363219)
    TextInputLayout inputLayoutBankNumber;
    @BindView(2131363220)
    TextInputLayout inputLayoutSenderName;
    private boolean isInside;
    @BindView(2131363348)
    ImageView ivClearAlias;
    @BindView(2131363387)
    ImageView ivClearBankNumber;
    @BindView(2131363388)
    ImageView ivClearSenderName;
    private setMax length;
    @BindView(2131363986)
    View mainLayout;
    @Inject
    public setEnableSaliency presenter;
    private View.OnClickListener setMax;
    private String setMin;

    public interface setMax {
        void setMin(List<BankModel> list);
    }

    public int getLayout() {
        return R.layout.view_other_bank_account;
    }

    public OtherBankAccountView(@NonNull Context context) {
        super(context);
        getResources();
    }

    public OtherBankAccountView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        getResources();
    }

    public OtherBankAccountView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getResources();
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        getPackages.getMax getmax = new getPackages.getMax((byte) 0);
        if (r4 != null) {
            getmax.getMax = r4;
            getmax.setMax = new OtherBankAccountModule(new setPriority.length() {
                public final void setMax(List<getExtraDataParsers> list) {
                    List unused = OtherBankAccountView.this.getMax = list;
                    OtherBankAccountView.access$100(OtherBankAccountView.this);
                }
            });
            stopIgnoring.setMin(getmax.setMax, OtherBankAccountModule.class);
            stopIgnoring.setMin(getmax.getMax, PrepareException.AnonymousClass1.class);
            new getPackages(getmax.setMax, getmax.getMax, (byte) 0).getMin(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    public void getMax(Boolean bool) {
        String str;
        Button button = this.btnConfirm;
        if (bool.equals(Boolean.TRUE)) {
            str = getResources().getString(R.string.send_money_to_biller_button);
        } else {
            str = getResources().getString(R.string.sendmoney_bank_add_new_bank);
        }
        button.setText(str);
    }

    /* access modifiers changed from: private */
    public static boolean setMax(CharSequence charSequence) {
        return Pattern.compile(BankSelectorActivity.BANK_NUMBER_REGEX).matcher(charSequence.toString().replaceAll("\\s+", "")).matches();
    }

    /* access modifiers changed from: private */
    public boolean length(CharSequence charSequence) {
        this.isInside = false;
        if (this.getMax == null || TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return setMax(charSequence.toString().replaceAll("\\s+", ""));
    }

    private boolean setMax(String str) {
        for (getExtraDataParsers prefix : this.getMax) {
            if (str.contains(prefix.getPrefix())) {
                this.isInside = true;
                return true;
            }
        }
        return false;
    }

    public String getAlias() {
        return this.etAlias.getText().toString();
    }

    public void setOnConfirmClickListener(View.OnClickListener onClickListener) {
        this.setMax = onClickListener;
    }

    /* access modifiers changed from: protected */
    @OnFocusChange({2131362816})
    public void inputBankNumberFocusChange(View view, boolean z) {
        this.ivClearBankNumber.setVisibility(setMax(view, z) ? 0 : 8);
    }

    private boolean setMax(View view, boolean z) {
        return view == this.bankNumber && z;
    }

    /* access modifiers changed from: protected */
    @OnFocusChange({2131362832})
    public void inputSenderNameFocusChange(View view, boolean z) {
        this.ivClearSenderName.setVisibility(length(view, z) ? 0 : 8);
    }

    private boolean length(View view, boolean z) {
        return view == this.etSenderNameInput && z;
    }

    /* access modifiers changed from: protected */
    @OnFocusChange({2131362811})
    public void inputAliasFocusChange(View view, boolean z) {
        this.ivClearAlias.setVisibility(getMin(view, z) ? 0 : 8);
    }

    private boolean getMin(View view, boolean z) {
        return view == this.etAlias && z;
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363986})
    public void onMainLayoutClicked() {
        this.autoCompleteBankView.clearFocus();
        this.bankNumber.clearFocus();
        setOnWheelViewListener.length(this.mainLayout);
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362062})
    public void onConfirmClicked(View view) {
        String obj = this.bankNumber.getText().toString();
        if (!TextUtils.isEmpty(getBankName())) {
            if (!setMax((CharSequence) obj)) {
                this.inputLayoutBankNumber.setError(getResources().getString(R.string.error_bank_number));
                return;
            }
            View.OnClickListener onClickListener = this.setMax;
            if (onClickListener == null || !this.isInside) {
                View.OnClickListener onClickListener2 = this.setMax;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                    return;
                }
                return;
            }
            onClickListener.onClick(view);
        }
    }

    public String getBankName() {
        BankModel selectedBankModel = this.autoCompleteBankView.getSelectedBankModel();
        if (selectedBankModel != null) {
            return selectedBankModel.toIntRange;
        }
        return null;
    }

    public BankModel getBankModel() {
        BankModel selectedBankModel = this.autoCompleteBankView.getSelectedBankModel();
        if (selectedBankModel != null) {
            selectedBankModel.getMax = getBankNumber();
            selectedBankModel.setMax = getBankName();
            selectedBankModel.isInside = getSenderName();
        }
        return selectedBankModel;
    }

    public String getBankNumber() {
        String obj = this.bankNumber.getText().toString();
        return !TextUtils.isEmpty(obj) ? obj.replace(" ", "") : obj;
    }

    public void setBankNumber(String str) {
        this.bankNumber.setText(str);
    }

    public String getSenderName() {
        return this.etSenderNameInput.getText().toString();
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363387})
    public void clearBankNumber() {
        this.bankNumber.setText("");
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363388})
    public void clearSenderName() {
        this.etSenderNameInput.setText("");
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363348})
    public void clearAlias() {
        this.etAlias.setText("");
    }

    /* access modifiers changed from: protected */
    @OnTextChanged(callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED, value = {2131362816})
    public void afterBankNumberChange(Editable editable) {
        int i = this.getMin + 4;
        if (!setH5MenuList.length(editable, i)) {
            String replaceAll = editable.toString().replaceAll("[^\\d.]", "");
            String min = setH5MenuList.getMin(replaceAll, replaceAll.length());
            int length2 = editable.length();
            if (min.length() > i) {
                min = min.substring(0, i);
            }
            editable.replace(0, length2, min);
        }
    }

    public void resetView() {
        AutoCompleteBankView autoCompleteBankView2 = this.autoCompleteBankView;
        if (autoCompleteBankView2 != null) {
            autoCompleteBankView2.clearData();
        }
        if (this.etAlias.getText() != null) {
            this.etAlias.getText().clear();
        }
        if (this.bankNumber.getText() != null) {
            this.bankNumber.getText().clear();
        }
        if (this.etSenderNameInput.getText() != null) {
            this.etSenderNameInput.getText().clear();
        }
    }

    public void setOnOtherBankAccountViewListener(setMax setmax) {
        this.length = setmax;
    }

    public void setBankModels(List<BankModel> list) {
        this.autoCompleteBankView.setBankModels(list);
    }

    public void setBankById(String str) {
        this.setMin = str;
    }

    public void setup() {
        this.etSenderNameInput.setDefaultIme(5);
        this.etAlias.setDefaultIme(6);
        addDisposable(this.autoCompleteBankView.getNeedSenderNameSubject().subscribe(new isSuperSize(this)));
        addDisposable(TitleBarRightButtonView.AnonymousClass1.combineLatest(this.autoCompleteBankView.getBankNameVerifiedSubject().map(new isGif(this)), onLoadChildren.textChanges(this.bankNumber).map(new isJPEG(this)), onLoadChildren.textChanges(this.etSenderNameInput).map(new APCenterCropMode(this)), new isInMainThread(this)).subscribe(new isProgressive(this)));
        addDisposable(onLoadChildren.textChanges(this.bankNumber).debounce(500, TimeUnit.MILLISECONDS).map(new detectImageDataType(this)).subscribe(new ImageFileType(this)));
        this.autoCompleteBankView.setOnAutoCompleteBankViewListener(new detectImageFileType(this));
    }

    static /* synthetic */ void access$100(OtherBankAccountView otherBankAccountView) {
        if (otherBankAccountView.bankNumber.getText() != null) {
            otherBankAccountView.length((CharSequence) otherBankAccountView.bankNumber.getText().toString());
        }
    }

    public static /* synthetic */ void getMax(OtherBankAccountView otherBankAccountView, boolean z) {
        otherBankAccountView.inputLayoutSenderName.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setMin(OtherBankAccountView otherBankAccountView, List list) {
        otherBankAccountView.autoCompleteBankView.setBankById(otherBankAccountView.setMin);
        setMax setmax = otherBankAccountView.length;
        if (setmax != null) {
            setmax.setMin(list);
        }
    }

    public static /* synthetic */ Boolean getMax(OtherBankAccountView otherBankAccountView, Boolean bool) {
        if (!bool.equals(Boolean.TRUE) || otherBankAccountView.autoCompleteBankView.getSelectedBankModel() == null) {
            otherBankAccountView.isInside = false;
        } else {
            setEnableSaliency setenablesaliency = otherBankAccountView.presenter;
            String str = otherBankAccountView.autoCompleteBankView.getSelectedBankModel().getMin;
            Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
            setenablesaliency.length.execute(onReceivedIcon.INSTANCE, new setEnableSaliency.setMax(setenablesaliency, str), new setEnableSaliency.length(setenablesaliency));
        }
        otherBankAccountView.getMax(Boolean.valueOf(otherBankAccountView.isInside));
        return bool;
    }

    public static /* synthetic */ Boolean setMin(OtherBankAccountView otherBankAccountView, Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && (otherBankAccountView.inputLayoutSenderName.getVisibility() == 8 || bool3.booleanValue()));
    }
}
