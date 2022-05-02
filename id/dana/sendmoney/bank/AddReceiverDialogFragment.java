package id.dana.sendmoney.bank;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.CustomEditText;
import id.dana.richview.LogoListView;
import id.dana.sendmoney.TransactionType;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.recipient.RecipientType;
import java.util.List;
import java.util.Locale;
import o.APImageLoadRequest;
import o.APImageRetMsg;
import o.ConfirmPopup;
import o.IRedDotManager;
import o.ITrustedWebActivityCallback;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.getDefaultProxy;
import o.getFormat;
import o.getImageInfo;
import o.getImageRotation;
import o.getStoreFilePath;
import o.getThumbnailInfo;
import o.isOriginHasAppInfo;
import o.matchFormat;
import o.onLoadChildren;
import o.order;
import o.saveActionViewStates;
import o.setCacheId;
import o.setMsg;
import o.setOnWheelViewListener;
import o.setStoreFilePath;

public class AddReceiverDialogFragment extends order {
    @BindView(2131362047)
    Button btnAddReceiverInfo;
    @BindView(2131362272)
    CustomEditText cetReceivePhoneNumber;
    @BindView(2131362270)
    CustomEditText cetReceiverDateOfBirth;
    @BindView(2131362271)
    CustomEditText cetReceiverName;
    @BindView(2131362501)
    ConstraintLayout clReceiverInputField;
    @BindView(2131363736)
    CoordinatorLayout coordinatorLayout;
    public List<getDefaultProxy> getMax;
    public setMax getMin;
    private final ITrustedWebActivityCallback<Void> isInside = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.length(), new setCacheId(this));
    @BindView(2131363947)
    LogoListView llvTransferAgents;
    @BindView(2131364174)
    NestedScrollView nsContent;
    private final IRedDotManager toIntRange = new IRedDotManager();

    public interface setMax {
        void getMin(RecipientModel recipientModel);
    }

    public final int getMin() {
        return R.layout.view_coordinator_transfer_agent_receiver_information;
    }

    public final float length() {
        return 0.48f;
    }

    public final int u_() {
        return 80;
    }

    public void onDestroyView() {
        this.toIntRange.getMax();
        super.onDestroyView();
    }

    public final setOnWheelViewListener.length s_() {
        return new setOnWheelViewListener.length() {
            public final void length() {
                if (AddReceiverDialogFragment.this.getView() != null) {
                    AddReceiverDialogFragment addReceiverDialogFragment = AddReceiverDialogFragment.this;
                    AddReceiverDialogFragment.setMax(addReceiverDialogFragment, setOnWheelViewListener.getMin(addReceiverDialogFragment.getView()));
                }
            }

            public final void setMax() {
                AddReceiverDialogFragment.setMax(AddReceiverDialogFragment.this, 0);
            }
        };
    }

    public final void setMax() {
        super.setMax();
        this.toIntRange.getMin(TitleBarRightButtonView.AnonymousClass1.combineLatest(onLoadChildren.textChanges(this.cetReceivePhoneNumber.getEtCustomEditText()).map(APImageRetMsg.RETCODE.getMax), onLoadChildren.textChanges(this.cetReceiverName.getEtCustomEditText()).map(setStoreFilePath.setMax), onLoadChildren.textChanges(this.cetReceiverDateOfBirth.getEtCustomEditText()).map(getImageInfo.getMax), APImageRetMsg.length).subscribe(new setMsg(this)));
        this.cetReceiverDateOfBirth.setOnEtCustomEditTextClicked(new APImageLoadRequest(this, ConfirmPopup.AnonymousClass1.length(getContext(), new getStoreFilePath(this))));
        this.cetReceivePhoneNumber.setOnIconClickListener(new getThumbnailInfo(this));
        List<getDefaultProxy> list = this.getMax;
        if (list != null) {
            this.llvTransferAgents.setLogo(list);
        }
        setOnWheelViewListener.getMax((Activity) this.setMax);
        List<getDefaultProxy> list2 = this.getMax;
        if (list2 != null) {
            this.llvTransferAgents.setLogo(list2);
        }
        this.toIntRange.getMin(TitleBarRightButtonView.AnonymousClass1.combineLatest(onLoadChildren.textChanges(this.cetReceivePhoneNumber.getEtCustomEditText()).map(APImageRetMsg.RETCODE.getMax), onLoadChildren.textChanges(this.cetReceiverName.getEtCustomEditText()).map(setStoreFilePath.setMax), onLoadChildren.textChanges(this.cetReceiverDateOfBirth.getEtCustomEditText()).map(getImageInfo.getMax), APImageRetMsg.length).subscribe(new setMsg(this)));
        this.cetReceiverName.post(new getFormat(this));
        this.cetReceivePhoneNumber.post(new getImageRotation(this));
        this.cetReceiverDateOfBirth.post(new matchFormat(this));
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
    }

    public final FrameLayout getMax() {
        return (FrameLayout) this.coordinatorLayout.findViewById(R.id.f35322131361978);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        getMax(dialog);
        length(dialog);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362047})
    public void onAddreceiverInfoClicked() {
        setMax setmax = this.getMin;
        if (setmax != null) {
            RecipientModel.length length = new RecipientModel.length(RecipientType.OTC);
            length.toString = TransactionType.SEND_MONEY_TO_CASHIER;
            length.isInside = this.cetReceiverName.getText();
            length.toIntRange = this.cetReceivePhoneNumber.getText();
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            length.valueOf = ConfirmPopup.AnonymousClass1.getMax("dd-MM-yyyy", "yyyy-MM-dd", WheelView.OnWheelViewListener.getMax, this.cetReceiverDateOfBirth.getText());
            length.setMin = this.setMax.getSource();
            length.setMax = this.cetReceivePhoneNumber.isManualInput() ? RecipientSource.MANUAL_INPUT : RecipientSource.ALL_CONTACTS;
            setmax.getMin(length.length());
        }
    }

    static /* synthetic */ void setMax(AddReceiverDialogFragment addReceiverDialogFragment, int i) {
        NestedScrollView nestedScrollView = addReceiverDialogFragment.nsContent;
        nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), addReceiverDialogFragment.nsContent.getPaddingTop(), addReceiverDialogFragment.nsContent.getPaddingRight(), i);
    }

    public static /* synthetic */ void setMax(AddReceiverDialogFragment addReceiverDialogFragment, int i, int i2, int i3) {
        CustomEditText customEditText = addReceiverDialogFragment.cetReceiverDateOfBirth;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append("-");
        sb.append(i2 + 1);
        sb.append("-");
        sb.append(i);
        customEditText.setText(sb.toString());
    }

    public static /* synthetic */ void getMin(AddReceiverDialogFragment addReceiverDialogFragment, Uri uri) {
        Cursor max;
        if (uri != null && (max = new saveActionViewStates(addReceiverDialogFragment.requireContext(), uri).loadInBackground()) != null && max.moveToFirst()) {
            addReceiverDialogFragment.cetReceivePhoneNumber.setText(isOriginHasAppInfo.getIndoPhoneNumber(max.getString(max.getColumnIndex("data1"))));
            max.close();
        }
    }

    public static /* synthetic */ void setMax(AddReceiverDialogFragment addReceiverDialogFragment, DatePickerDialog datePickerDialog) {
        setOnWheelViewListener.length((View) addReceiverDialogFragment.cetReceiverDateOfBirth);
        datePickerDialog.show();
    }

    public static /* synthetic */ Boolean setMin(Boolean bool, Boolean bool2, Boolean bool3) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue());
    }
}
