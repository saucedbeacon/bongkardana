package id.dana.splitbill.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.splitbill.model.PayerModel;
import java.util.List;
import o.AUIconView;
import o.TextButtonListAdapter;

public class PayerListView extends BaseRichView {
    private TextButtonListAdapter getMax;
    private RecyclerView setMax;
    private getMin setMin;
    @BindView(2131365145)
    TextView tvClosePayer;

    public interface getMin {
        void length();
    }

    public int getLayout() {
        return R.layout.view_split_bill_payer;
    }

    public PayerListView(@NonNull Context context) {
        super(context);
    }

    public PayerListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PayerListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnClickListener(getMin getmin) {
        this.setMin = getmin;
    }

    public void setClosePayerEnabled(boolean z) {
        this.tvClosePayer.setVisibility(z ? 0 : 8);
    }

    public void setup() {
        this.getMax = new TextButtonListAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.f59542131364539);
        this.setMax = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.setMax.setFocusable(false);
        this.setMax.setAdapter(this.getMax);
        this.tvClosePayer.setOnClickListener(new AUIconView(this));
    }

    public void setItems(List<PayerModel> list, boolean z) {
        this.getMax.getMin(list);
        this.getMax.setMax = z;
    }
}
