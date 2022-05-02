package id.dana.splitbill.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.SplitBillHistoryModule;
import id.dana.splitbill.adapter.SplitBillHistoryAdapter;
import java.util.List;
import javax.inject.Inject;
import o.AUNoticeDialog;
import o.GriverCommonResourceProxy;
import o.IconfontInfo;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.getScrimColor;
import o.interceptOnError;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.projection;
import o.readObject;
import o.resetInternal;
import o.setLastScanStartTimeMillis;
import o.stopIgnoring;

public class SplitBillHistoryView extends BaseRichView implements AUNoticeDialog.AnonymousClass1.getMax {
    private length getMax;
    private boolean getMin;
    private GriverCommonResourceProxy length;
    @BindView(2131363873)
    LinearLayout llBillHistoryEmptyState;
    @BindView(2131363937)
    ConstraintLayout llSplitBillHistoryContainer;
    @Inject
    public AUNoticeDialog.AnonymousClass1.setMax presenter;
    @BindView(2131364570)
    RecyclerView rvSplitBillHistory;
    private onDetachedFromLayoutParams setMax;
    SplitBillHistoryAdapter splitBillHistoryAdapter;
    readObject splitBillHistoryComponent;
    @Inject
    public IconfontInfo splitBillPayerToPayerModelMapper;

    public interface length {
        void setMax(boolean z);
    }

    public int getLayout() {
        return R.layout.view_split_bill_history;
    }

    public void onError(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-917129272, oncanceled);
            onCancelLoad.getMin(-917129272, oncanceled);
        }
    }

    public SplitBillHistoryView(@NonNull Context context) {
        super(context);
    }

    public SplitBillHistoryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplitBillHistoryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.splitBillHistoryComponent == null) {
            interceptOnError.setMax min = interceptOnError.setMin();
            if (r4 != null) {
                min.setMin = r4;
                min.setMax = new SplitBillHistoryModule(this);
                stopIgnoring.setMin(min.setMax, SplitBillHistoryModule.class);
                stopIgnoring.setMin(min.setMin, PrepareException.AnonymousClass1.class);
                this.splitBillHistoryComponent = new interceptOnError(min.setMax, min.setMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.splitBillHistoryComponent.getMin(this);
        registerPresenter(this.presenter);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.registerForActivityResult);
        try {
            this.getMin = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.setMin();
        }
    }

    public void getSplitBillHistories() {
        this.presenter.length();
    }

    public void setListener(length length2) {
        this.getMax = length2;
    }

    public void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax(this.rvSplitBillHistory);
            getmax.length = this.splitBillHistoryAdapter;
            getmax.getMax = R.layout.view_split_bill_history_skeleton;
            getmax.IsOverlapping = 1500;
            getmax.setMin = 5;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 0;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            this.setMax = getscrimcolor;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.setMax = null;
        }
    }

    private void getMax() {
        if (this.getMin) {
            showHistoriesSection(true);
            this.llSplitBillHistoryContainer.setVisibility(0);
            this.rvSplitBillHistory.setVisibility(8);
            this.llBillHistoryEmptyState.setVisibility(0);
            return;
        }
        showHistoriesSection(false);
        this.llSplitBillHistoryContainer.setVisibility(8);
    }

    public void onSuccessGetAccount(GriverCommonResourceProxy griverCommonResourceProxy) {
        this.length = griverCommonResourceProxy;
    }

    public void showHistoriesSection(boolean z) {
        length length2 = this.getMax;
        if (length2 != null) {
            length2.setMax(z);
        }
    }

    public void hideSplitBillHistories() {
        dismissProgress();
        getMax();
    }

    public void setup() {
        if (this.splitBillHistoryAdapter == null) {
            SplitBillHistoryAdapter splitBillHistoryAdapter2 = new SplitBillHistoryAdapter();
            this.splitBillHistoryAdapter = splitBillHistoryAdapter2;
            splitBillHistoryAdapter2.getMax((Ignore.setMin) new projection(getBaseActivity()) {
                public final void getMax(int i) {
                    SplitBillHistoryView splitBillHistoryView = SplitBillHistoryView.this;
                    splitBillHistoryView.getBaseActivity().startActivity(SplitBillSummaryActivity.createIntent(splitBillHistoryView.getBaseActivity(), ((setLastScanStartTimeMillis) splitBillHistoryView.splitBillHistoryAdapter.setMin(i)).getSplitBillId()));
                }
            });
        }
        this.rvSplitBillHistory.setNestedScrollingEnabled(false);
        this.rvSplitBillHistory.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.rvSplitBillHistory.setAdapter(this.splitBillHistoryAdapter);
    }

    public void onSuccessGetSplitBillHistory(List<setLastScanStartTimeMillis> list) {
        if (!list.isEmpty()) {
            showHistoriesSection(true);
            this.llSplitBillHistoryContainer.setVisibility(0);
            this.splitBillHistoryAdapter.getMin(list);
            return;
        }
        getMax();
    }
}
