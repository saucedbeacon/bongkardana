package id.dana.richview.splitbill;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.richview.SearchView;
import id.dana.richview.contactselector.ContactSelectorView;
import id.dana.richview.splitbill.BillPayerView;
import id.dana.richview.splitbill.SelectedPayerView;
import id.dana.sendmoney.model.RecipientModel;
import java.util.ArrayList;
import java.util.List;
import o.CameraFrontSightView;
import o.IComponent;
import o.isOriginHasAppInfo;
import o.mapScreenDegree;
import o.setOnWheelViewListener;
import o.setPhotoIndex;
import o.startDraw;

public class BillPayerView extends BaseRichView {
    private String IsOverlapping;
    @BindView(2131365854)
    ContactSelectorView contactSelectorView;
    @BindView(2131362652)
    CardView cvPayerSelection;
    private int equals;
    private List<String> getMax;
    private List<RecipientModel> getMin;
    private IComponent<List<String>> isInside;
    private List<RecipientModel> length;
    @BindView(2131363842)
    LinearLayout llBtnContainer;
    @BindView(2131365942)
    SearchView searchView;
    @BindView(2131365947)
    SelectedPayerView selectedPayerView;
    private BottomSheetBehavior setMax;
    /* access modifiers changed from: private */
    public setMax setMin;
    /* access modifiers changed from: private */
    public boolean toFloatRange;

    public interface setMax {
        void onUpdatedSelectedPayers(List<RecipientModel> list);

        void onViewHidden();
    }

    public int getLayout() {
        return R.layout.view_bill_payer;
    }

    public BillPayerView(@NonNull Context context) {
        super(context);
    }

    public BillPayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BillPayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BillPayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.toFloatRange || this.searchView.isClearImageViewRect((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        View findFocus = findFocus();
        if (!(findFocus instanceof EditText)) {
            return false;
        }
        Rect rect = new Rect();
        findFocus.getGlobalVisibleRect(rect);
        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        findFocus.clearFocus();
        setOnWheelViewListener.length((View) this);
        return false;
    }

    /* access modifiers changed from: private */
    public void getMin(RecipientModel recipientModel) {
        if (setMax(recipientModel)) {
            if (this.selectedPayerView.isRecentPayer(recipientModel)) {
                this.getMin.remove(recipientModel);
                this.selectedPayerView.setRecentPayerDisplay(recipientModel, true);
                this.selectedPayerView.updatePayerFromSelectedToRecent(recipientModel);
                isInside(recipientModel);
                setMax();
            } else {
                this.getMin.remove(recipientModel);
                this.selectedPayerView.removeSelectedPayer(recipientModel);
                isInside(recipientModel);
                setMax();
            }
        }
        this.selectedPayerView.setPayersCount(this.getMax.size());
    }

    /* access modifiers changed from: private */
    public void length(RecipientModel recipientModel) {
        if (getMax(recipientModel)) {
            showWarningDialog(getContext().getString(R.string.error_select_non_indo_number));
        } else if (length(recipientModel.isInside)) {
            showWarningDialog(getContext().getString(R.string.error_select_own_number));
        } else {
            toIntRange(recipientModel);
        }
    }

    private boolean setMax(RecipientModel recipientModel) {
        for (RecipientModel next : this.getMin) {
            if (setMax(next, recipientModel) && next.equals(recipientModel)) {
                return true;
            }
        }
        return false;
    }

    private boolean length(String str) {
        return !TextUtils.isEmpty(this.IsOverlapping) && TextUtils.equals(isOriginHasAppInfo.getIndoPhoneNumber(this.IsOverlapping), isOriginHasAppInfo.getIndoPhoneNumber(str));
    }

    /* access modifiers changed from: private */
    public void setMax() {
        if (!this.length.equals(this.getMin)) {
            this.llBtnContainer.setVisibility(0);
        } else {
            this.llBtnContainer.setVisibility(8);
        }
    }

    private void setMin(RecipientModel recipientModel) {
        if (this.selectedPayerView.getPayersList().size() >= this.equals) {
            showWarningDialog(getContext().getString(R.string.max_split_bill_payers_error_msg));
            return;
        }
        if (recipientModel.FastBitmap$CoordinateSystem()) {
            recipientModel.create = "splitBillPayer";
        }
        this.getMin.add(recipientModel);
        this.selectedPayerView.addSelectedPayer(0, recipientModel);
        toFloatRange(recipientModel);
        setMax();
    }

    private void IsOverlapping(RecipientModel recipientModel) {
        this.getMin.add(recipientModel);
        this.selectedPayerView.setRecentPayerDisplay(recipientModel, false);
        this.selectedPayerView.updatePayerFromRecentToSelected(0, recipientModel);
        toFloatRange(recipientModel);
        setMax();
    }

    private void equals(RecipientModel recipientModel) {
        this.getMin.remove(recipientModel);
        this.selectedPayerView.setRecentPayerDisplay(recipientModel, true);
        this.selectedPayerView.updatePayerFromSelectedToRecent(recipientModel);
        isInside(recipientModel);
        setMax();
    }

    private void toIntRange(RecipientModel recipientModel) {
        if (this.selectedPayerView.isRecentPayer(recipientModel)) {
            if (setMax(recipientModel)) {
                equals(recipientModel);
            } else {
                IsOverlapping(recipientModel);
            }
        } else if (setMax(recipientModel)) {
            this.getMin.remove(recipientModel);
            this.selectedPayerView.removeSelectedPayer(recipientModel);
            isInside(recipientModel);
            setMax();
        } else {
            setMin(recipientModel);
        }
        this.selectedPayerView.setPayersCount(this.getMax.size());
    }

    private void toFloatRange(RecipientModel recipientModel) {
        this.getMax.add(isOriginHasAppInfo.getIndoPhoneNumber(recipientModel.isInside));
        this.isInside.onNext(this.getMax);
        this.contactSelectorView.setSelectedNumbers(this.getMax);
    }

    private void isInside(RecipientModel recipientModel) {
        this.getMax.remove(isOriginHasAppInfo.getIndoPhoneNumber(recipientModel.isInside));
        this.isInside.onNext(this.getMax);
        this.contactSelectorView.setSelectedNumbers(this.getMax);
    }

    public void show() {
        this.setMax.setState(3);
    }

    public void hide() {
        this.searchView.clearKeyword();
        this.setMax.setState(5);
    }

    public boolean isShow() {
        return 5 != this.setMax.getState();
    }

    public void configPeekHeight(BaseActivity baseActivity) {
        post(new mapScreenDegree(this, baseActivity));
    }

    public void setListener(setMax setmax) {
        this.setMin = setmax;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        ContactSelectorView contactSelectorView2 = this.contactSelectorView;
        if (contactSelectorView2 != null) {
            contactSelectorView2.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @OnClick({2131362054})
    public void onCancel() {
        hide();
        for (RecipientModel next : this.getMin) {
            if (!this.length.contains(next)) {
                if (this.selectedPayerView.isRecentPayer(next)) {
                    this.selectedPayerView.setRecentPayerDisplay(next, true);
                    this.selectedPayerView.updatePayerFromSelectedToRecent(next);
                } else {
                    this.selectedPayerView.removeSelectedPayer(next);
                }
                isInside(next);
            }
        }
        for (int size = this.length.size() - 1; size >= 0; size--) {
            RecipientModel recipientModel = this.length.get(size);
            if (!this.getMin.contains(recipientModel)) {
                if (this.selectedPayerView.isRecentPayer(recipientModel)) {
                    this.selectedPayerView.setRecentPayerDisplay(recipientModel, false);
                    this.selectedPayerView.updatePayerFromRecentToSelected(0, recipientModel);
                } else {
                    this.selectedPayerView.addSelectedPayer(0, recipientModel);
                }
                toFloatRange(recipientModel);
            }
        }
        this.selectedPayerView.setPayersCount(this.getMax.size());
        this.getMin.clear();
        this.getMin.addAll(this.length);
        this.llBtnContainer.setVisibility(8);
    }

    @OnClick({2131362075})
    public void onFinished() {
        setMax setmax;
        hide();
        if (getMax() && (setmax = this.setMin) != null) {
            setmax.onUpdatedSelectedPayers(this.getMin);
        }
        this.length.clear();
        this.length.addAll(this.getMin);
        this.llBtnContainer.setVisibility(8);
    }

    private boolean getMax() {
        return !this.length.equals(this.getMin);
    }

    public void setMaxBillPayer(int i) {
        this.equals = i - 1;
    }

    public void addPayerFromScanner(RecipientModel recipientModel) {
        if (recipientModel != null) {
            if (this.getMin.contains(recipientModel)) {
                Toast.makeText(getBaseActivity(), getContext().getString(R.string.participant_already_added), 0).show();
                return;
            }
            toIntRange(recipientModel);
        }
    }

    public void removeSelectedPayer(RecipientModel recipientModel) {
        this.length.remove(recipientModel);
        getMin(recipientModel);
    }

    public void setOwnPhoneNumber(String str) {
        this.IsOverlapping = str;
    }

    public void setup() {
        BottomSheetBehavior from = BottomSheetBehavior.from(this.cvPayerSelection);
        this.setMax = from;
        from.setHideable(true);
        this.setMax.setState(5);
        this.setMax.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            public final void onSlide(@NonNull View view, float f) {
            }

            public final void onStateChanged(@NonNull View view, int i) {
                if (BillPayerView.this.setMin != null && 5 == i) {
                    BillPayerView.this.onFinished();
                    BillPayerView.this.setMin.onViewHidden();
                }
            }
        });
        ContactSelectorView contactSelectorView2 = this.contactSelectorView;
        getResources();
        contactSelectorView2.setContactHeaderColor(-1);
        this.contactSelectorView.enableArrow();
        this.contactSelectorView.setListener(new ContactSelectorView.getMin() {
            public final void setMax(boolean z) {
            }

            public final void getMax() {
                if (BillPayerView.this.searchView != null) {
                    BillPayerView.this.searchView.focusEtSearchContact();
                }
            }
        });
        this.contactSelectorView.setRecipientListener(new setPhotoIndex(this) {
            private final BillPayerView getMin;

            {
                this.getMin = r1;
            }

            public final void onRecipientSelected(RecipientModel recipientModel) {
                this.getMin.length(recipientModel);
            }
        });
        if (this.isInside == null) {
            this.isInside = IComponent.setMax();
        }
        this.contactSelectorView.initContactList();
        this.contactSelectorView.setSelectedNumbers(this.getMax);
        this.contactSelectorView.setSelectedNumbersPublisher(this.isInside);
        addDisposable(this.searchView.getKeyword().subscribe(new startDraw(this)));
        this.selectedPayerView.setListener(new SelectedPayerView.getMax() {
            public final void getMax(RecipientModel recipientModel) {
                BillPayerView.this.getMin(recipientModel);
            }

            public final void setMax(RecipientModel recipientModel) {
                BillPayerView.this.length(recipientModel);
            }
        });
        this.contactSelectorView.checkPermission();
        addDisposable(this.searchView.getOnSearchClickedEvent().subscribe(new CameraFrontSightView(this)));
        setOnWheelViewListener.getMax(this, new setOnWheelViewListener.length() {
            public final void length() {
                boolean unused = BillPayerView.this.toFloatRange = true;
            }

            public final void setMax() {
                boolean unused = BillPayerView.this.toFloatRange = false;
                BillPayerView.this.setMax();
            }
        });
        this.length = new ArrayList();
        this.getMin = new ArrayList();
        this.getMax = new ArrayList();
    }

    private static boolean getMax(RecipientModel recipientModel) {
        if (TextUtils.isEmpty(recipientModel.onPostMessage) && !isOriginHasAppInfo.isValidIndoPhoneNumber(recipientModel.isInside)) {
            return true;
        }
        return false;
    }

    private static boolean setMax(RecipientModel recipientModel, RecipientModel recipientModel2) {
        return !TextUtils.isEmpty(recipientModel.onNavigationEvent) && !TextUtils.isEmpty(recipientModel2.onNavigationEvent) && recipientModel.onNavigationEvent.equals(recipientModel2.onNavigationEvent);
    }

    public static /* synthetic */ void length(BillPayerView billPayerView, BaseActivity baseActivity) {
        Display defaultDisplay = baseActivity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        BottomSheetBehavior bottomSheetBehavior = billPayerView.setMax;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(point.y);
        }
    }

    public static /* synthetic */ void setMax(BillPayerView billPayerView, Boolean bool) {
        if (bool.booleanValue() && !billPayerView.toFloatRange) {
            billPayerView.llBtnContainer.setVisibility(8);
        }
    }
}
