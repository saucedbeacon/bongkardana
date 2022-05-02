package id.dana.splitbill.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.splitbill.model.PayerModel;
import java.util.ArrayList;
import java.util.List;
import o.AUViewEventHelper;
import o.PopMenuItem;
import o.getDrawable;
import o.isOriginHasAppInfo;
import o.setDrawable;

public class ClosePayerView extends BaseRichView {
    @BindView(2131362222)
    CheckBox cbCloseAllPayer;
    private AUViewEventHelper getMin;
    private boolean length;
    RecyclerView rvClosePayer;
    private setMin setMax;
    /* access modifiers changed from: private */
    public boolean setMin;
    @BindView(2131365512)
    TextView tvRemainingBillValue;
    @BindView(2131365654)
    TextView tvUnpaidBillCount;

    public interface setMin {
        void length(boolean z);
    }

    public int getLayout() {
        return R.layout.view_close_payer;
    }

    public ClosePayerView(@NonNull Context context) {
        super(context);
    }

    public ClosePayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClosePayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnDataChangedListener(setMin setmin) {
        this.setMax = setmin;
    }

    public void setItems(List<PayerModel> list) {
        this.getMin.getMin(list);
    }

    public void setRemainingBill(String str) {
        this.tvRemainingBillValue.setText(str);
    }

    public void setUnpaidBillCount(int i) {
        this.tvUnpaidBillCount.setText(String.format(getContext().getString(R.string.unpaid_bill_count), new Object[]{String.valueOf(i)}));
    }

    public void setup() {
        this.getMin = new AUViewEventHelper(new PopMenuItem(this), new getDrawable(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.f59162131364501);
        this.rvClosePayer = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rvClosePayer.setFocusable(false);
        this.rvClosePayer.setAdapter(this.getMin);
        this.rvClosePayer.setHasFixedSize(true);
        this.cbCloseAllPayer.setOnCheckedChangeListener(new setDrawable(this));
    }

    public List<String> getClosedPayers() {
        ArrayList arrayList = new ArrayList();
        for (PayerModel payerModel : this.getMin.setMin()) {
            arrayList.add(isOriginHasAppInfo.getCleanSpaceAndDash(payerModel.setMin));
        }
        return arrayList;
    }

    private boolean setMax() {
        return this.getMin.setMin().size() == this.getMin.getMax().size();
    }

    private boolean getMin() {
        return this.getMin.setMin().size() == 0;
    }

    public static /* synthetic */ void getMin(ClosePayerView closePayerView) {
        if (!closePayerView.setMin) {
            closePayerView.length = true;
            closePayerView.cbCloseAllPayer.setChecked(closePayerView.setMax());
            closePayerView.setMax.length(closePayerView.getMin());
            closePayerView.length = false;
        }
    }

    public static /* synthetic */ void setMax(ClosePayerView closePayerView, boolean z) {
        closePayerView.setMin = true;
        if (!closePayerView.length) {
            AUViewEventHelper aUViewEventHelper = closePayerView.getMin;
            for (PayerModel payerModel : aUViewEventHelper.getMax()) {
                payerModel.equals = z;
            }
            aUViewEventHelper.notifyDataSetChanged();
        } else {
            closePayerView.cbCloseAllPayer.setChecked(closePayerView.setMax());
            closePayerView.setMin = false;
        }
        closePayerView.setMax.length(closePayerView.getMin());
    }
}
