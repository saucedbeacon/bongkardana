package id.dana.splitbill.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.SplitBillSectionModule;
import javax.inject.Inject;
import o.DefaultStepCreator;
import o.PopManager;
import o.PrepareException;
import o.onTooManyRedirects;
import o.readInteger;
import o.setIconfontColorStates;
import o.stopIgnoring;

public class SplitBillSectionView extends BaseRichView implements PopManager.PopBean.setMin {
    private int getMax;
    private readInteger getMin;
    @Inject
    public PopManager.PopBean.getMax presenter;
    @BindView(2131364602)
    SplitBillHistoryView sbhvBillHistories;
    private setMax setMax;

    public interface setMax {
    }

    public int getLayout() {
        return R.layout.view_split_bill_section;
    }

    @OnClick({2131362087})
    public void onSplitBillButtonClick() {
    }

    public SplitBillSectionView(@NonNull Context context) {
        super(context);
    }

    public SplitBillSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplitBillSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.getMin == null) {
            DefaultStepCreator.AnonymousClass1.getMin getmin = new DefaultStepCreator.AnonymousClass1.getMin((byte) 0);
            if (r4 != null) {
                getmin.length = r4;
                getmin.setMin = new SplitBillSectionModule(this);
                stopIgnoring.setMin(getmin.setMin, SplitBillSectionModule.class);
                stopIgnoring.setMin(getmin.length, PrepareException.AnonymousClass1.class);
                this.getMin = new DefaultStepCreator.AnonymousClass1(getmin.setMin, getmin.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMin.getMax(this);
        registerPresenter(this.presenter);
    }

    public void setup() {
        this.sbhvBillHistories.setListener(new setIconfontColorStates(this));
        this.presenter.getMax();
    }

    public int getMaxRecipient() {
        return this.getMax;
    }

    public void setOnSplitBillButtonClickListener(setMax setmax) {
        this.setMax = setmax;
    }

    public void onFinishGetSplitBillConfig(onTooManyRedirects ontoomanyredirects) {
        setVisibility(ontoomanyredirects.isFeatureEnable() ? 0 : 8);
        this.getMax = ontoomanyredirects.getMaxRecipient();
    }

    public static /* synthetic */ void getMin(SplitBillSectionView splitBillSectionView, boolean z) {
        splitBillSectionView.sbhvBillHistories.setVisibility(z ? 0 : 8);
    }
}
