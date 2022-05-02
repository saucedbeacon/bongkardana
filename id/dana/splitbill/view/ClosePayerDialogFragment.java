package id.dana.splitbill.view;

import android.app.Dialog;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.richview.LogoProgressView;
import id.dana.splitbill.model.PayerModel;
import java.util.List;
import o.getResId;
import o.order;
import o.setResId;

public class ClosePayerDialogFragment extends order {
    @BindView(2131362141)
    Button btnSubmitClosePayer;
    @BindView(2131363736)
    CoordinatorLayout coordinatorLayout;
    @BindView(2131362605)
    ClosePayerView cvpClosePayer;
    int getMax;
    String getMin;
    @BindView(2131364288)
    LogoProgressView lpvClosePayer;
    private length toFloatRange;
    List<PayerModel> toIntRange;

    public interface length {
        void getMin(List<String> list);
    }

    public final int getMin() {
        return R.layout.view_coordinator_close_payer;
    }

    public final float length() {
        return 0.0f;
    }

    public final int u_() {
        return 56;
    }

    public ClosePayerDialogFragment(length length2) {
        this.toFloatRange = length2;
    }

    public final void setMin(int i, int i2) {
        this.length.setHideable(true);
        super.setMin(i, i2);
    }

    public final void setMin() {
        super.setMin();
        int min = setMin(getDialog());
        this.length.setHideable(true);
        super.setMin(min, 3);
    }

    public final void setMax() {
        super.setMax();
        this.cvpClosePayer.setRemainingBill(this.getMin);
        this.cvpClosePayer.setUnpaidBillCount(this.getMax);
        this.cvpClosePayer.setItems(this.toIntRange);
        this.cvpClosePayer.setOnDataChangedListener(new getResId(this));
        this.btnSubmitClosePayer.setOnClickListener(new setResId(this));
    }

    public final FrameLayout getMax() {
        return (FrameLayout) this.coordinatorLayout.findViewById(R.id.f35332131361979);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        getMax(dialog);
        length(dialog);
    }

    public void onDestroy() {
        ((SplitBillSummaryActivity) getActivity()).disableDimView();
        super.onDestroy();
    }
}
