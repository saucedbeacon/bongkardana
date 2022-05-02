package id.dana.splitbill.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import id.dana.splitbill.adapter.PayerViewHolder;
import id.dana.splitbill.model.SplitBillPayerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.AURelativeLayout;
import o.GriverCommonResourceProxy;
import o.Ignore;
import o.NebulaLoadingView;
import o.WheelView;
import o.dispatchOnCancelled;
import o.getImageView;
import o.onCancelLoad;
import o.onCanceled;
import o.setIconTextMinHeight;
import o.setOnWheelViewListener;

public class SplitBillPayersView extends BaseRichView {
    private SplitBillPayerModel equals;
    private long getMax;
    private long getMin;
    private List<SplitBillPayerModel> isInside = new ArrayList();
    /* access modifiers changed from: private */
    public getMax length;
    @BindView(2131364571)
    RecyclerView rvPayers;
    private AURelativeLayout setMax;
    private int setMin;
    private List<SplitBillPayerModel> toFloatRange;

    public interface getMax {
        void onClickAddNewPayer();

        void onModifyingAmount(boolean z);

        void onRemainingUpdated(boolean z, String str);

        void onRemovePayer(SplitBillPayerModel splitBillPayerModel);

        void onSplitBillButtonEnabled(boolean z);
    }

    public int getLayout() {
        return R.layout.view_split_bill_payers;
    }

    public SplitBillPayersView(@NonNull Context context) {
        super(context);
    }

    public SplitBillPayersView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplitBillPayersView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setMaxSplitBillAmount(long j) {
        this.getMax = j;
    }

    public void setListener(getMax getmax) {
        this.length = getmax;
    }

    public void setAmount(long j) {
        this.getMin = j;
    }

    public void saveLockedPayer() {
        this.isInside.clear();
        for (SplitBillPayerModel next : this.toFloatRange) {
            if (next.getMax()) {
                this.isInside.add(next);
            }
        }
    }

    public void updateAmount(long j) {
        setAmount(j);
        calculateAmount();
    }

    public void setup() {
        this.toFloatRange = new ArrayList();
        setOnWheelViewListener.getMax(this, new setOnWheelViewListener.length() {
            public final void length() {
                SplitBillPayersView.this.length.onModifyingAmount(true);
            }

            public final void setMax() {
                SplitBillPayersView.this.length.onModifyingAmount(false);
                SplitBillPayersView.this.clearCurrentFocus();
            }
        });
    }

    public void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        AURelativeLayout aURelativeLayout = new AURelativeLayout(this.getMax);
        this.setMax = aURelativeLayout;
        aURelativeLayout.getMax((Ignore.setMin) new setIconTextMinHeight(this));
        this.setMax.getMax = new PayerViewHolder.length() {
            public final void length(int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(1250754153, oncanceled);
                    onCancelLoad.getMin(1250754153, oncanceled);
                }
                if (i == 0) {
                    SplitBillPayersView.this.clearCurrentFocus();
                    SplitBillPayersView.access$000(SplitBillPayersView.this);
                    SplitBillPayersView.this.calculateAmount();
                    return;
                }
                SplitBillPayersView.access$100(SplitBillPayersView.this, i);
            }

            public final void setMin(long j, int i) {
                if (i != -1) {
                    SplitBillPayersView.access$200(SplitBillPayersView.this, j, i);
                }
            }

            public final void getMax() {
                setOnWheelViewListener.length(SplitBillPayersView.this.getRootView());
            }
        };
        this.rvPayers.setLayoutManager(linearLayoutManager);
        this.rvPayers.setNestedScrollingEnabled(false);
        this.rvPayers.setItemAnimator((RecyclerView.ItemAnimator) null);
        this.rvPayers.setAdapter(this.setMax);
        this.rvPayers.clearFocus();
    }

    private void getMax(int i) {
        if (getMin(i) && getPayerModels().get(i).getMax()) {
            this.setMin--;
        }
        getPayerModels().get(i).toFloatRange = false;
    }

    private boolean getMin(int i) {
        return getPayerModels().get(i) != null;
    }

    public void setInitialData(GriverCommonResourceProxy griverCommonResourceProxy) {
        SplitBillPayerModel.length length2 = new SplitBillPayerModel.length();
        length2.setMin = griverCommonResourceProxy.getNickname();
        length2.getMin = griverCommonResourceProxy.getUserId();
        length2.setMax = griverCommonResourceProxy.getPhoneNumber();
        length2.length = new CurrencyAmountModel("0", "Rp");
        length2.getMax = griverCommonResourceProxy.getAvatarUrl();
        length2.toIntRange = true;
        SplitBillPayerModel splitBillPayerModel = new SplitBillPayerModel();
        splitBillPayerModel.setMin = length2.setMin;
        splitBillPayerModel.setMax = length2.getMax;
        splitBillPayerModel.length = length2.getMin;
        splitBillPayerModel.getMax = length2.setMax;
        splitBillPayerModel.equals = length2.length;
        splitBillPayerModel.IsOverlapping = length2.toFloatRange;
        splitBillPayerModel.toFloatRange = length2.IsOverlapping;
        splitBillPayerModel.toIntRange = length2.toIntRange;
        splitBillPayerModel.getMin = length2.isInside;
        splitBillPayerModel.isInside = length2.equals;
        splitBillPayerModel.hashCode = length2.hashCode;
        this.equals = splitBillPayerModel;
        this.toFloatRange.add(splitBillPayerModel);
        AURelativeLayout aURelativeLayout = this.setMax;
        SplitBillPayerModel splitBillPayerModel2 = this.equals;
        ArrayList arrayList = new ArrayList();
        arrayList.add(splitBillPayerModel2);
        arrayList.add(aURelativeLayout.length);
        aURelativeLayout.getMin(arrayList);
    }

    public void calculateAmount() {
        String str;
        long lockedAmountTotal = this.getMin - getLockedAmountTotal();
        if (setMax() > 0) {
            long max = lockedAmountTotal / ((long) setMax());
            boolean z = false;
            long j = 0;
            for (int i = 0; i <= getTotalPayersCount() - 1; i++) {
                if (setMin(i) && !getPayerModels().get(i).getMin()) {
                    SplitBillPayerModel splitBillPayerModel = getPayerModels().get(i);
                    if (j == this.getMin || lockedAmountTotal <= 0) {
                        getMax(splitBillPayerModel, 0);
                    } else {
                        j += max;
                        getMax(splitBillPayerModel, max);
                    }
                }
            }
            long j2 = lockedAmountTotal - j;
            if (j2 > 0) {
                int totalPayersCount = getTotalPayersCount() - 1;
                while (true) {
                    if (totalPayersCount < 0) {
                        break;
                    } else if (setMin(totalPayersCount)) {
                        SplitBillPayerModel splitBillPayerModel2 = getPayerModels().get(totalPayersCount);
                        if (SplitBillPayerModel.setMax(splitBillPayerModel2.equals)) {
                            str = splitBillPayerModel2.equals.getMax;
                        } else {
                            str = "0";
                        }
                        getMax(splitBillPayerModel2, Long.valueOf(str).longValue() + j2);
                        length();
                        z = true;
                    } else {
                        totalPayersCount--;
                    }
                }
                if (!z) {
                    getMax();
                }
            } else if (j2 == 0) {
                length();
            } else {
                getMax();
            }
        } else {
            getMax();
        }
        getMax getmax = this.length;
        if (getmax != null) {
            getmax.onSplitBillButtonEnabled(getMin());
        }
    }

    private int setMax() {
        int totalPayersCount = getTotalPayersCount() - this.setMin;
        return this.toFloatRange.get(0).getMin() ? totalPayersCount - 1 : totalPayersCount;
    }

    private boolean setMin(int i) {
        return getMin(i) && !getPayerModels().get(i).getMax();
    }

    private void getMax() {
        if (getLockedAmountTotal() - this.getMin == 0) {
            length();
        } else if (getLockedAmountTotal() < this.getMin) {
            String string = getContext().getString(R.string.split_bill_remaining_message);
            Object[] objArr = new Object[1];
            long lockedAmountTotal = this.getMin - getLockedAmountTotal();
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            objArr[0] = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, lockedAmountTotal, "Rp");
            getMin(String.format(string, objArr));
        } else if (getLockedAmountTotal() > this.getMin) {
            String string2 = getContext().getString(R.string.split_bill_exceed_limit_message);
            Object[] objArr2 = new Object[1];
            long lockedAmountTotal2 = getLockedAmountTotal() - this.getMin;
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            objArr2[0] = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, lockedAmountTotal2, "Rp");
            getMin(String.format(string2, objArr2));
        }
    }

    public long getLockedAmountTotal() {
        String str;
        long j = 0;
        for (SplitBillPayerModel next : getPayerModels()) {
            if (next.getMax()) {
                if (SplitBillPayerModel.setMax(next.equals)) {
                    str = next.equals.getMax;
                } else {
                    str = "0";
                }
                j += Long.valueOf(str).longValue();
            }
        }
        return j;
    }

    public List<SplitBillPayerModel> getPayerModels() {
        return this.toFloatRange;
    }

    public int getTotalPayersCount() {
        return this.toFloatRange.size();
    }

    private void getMax(SplitBillPayerModel splitBillPayerModel, long j) {
        splitBillPayerModel.equals = new CurrencyAmountModel(String.valueOf(j), "Rp");
        this.rvPayers.post(new getImageView(this, splitBillPayerModel));
    }

    private boolean setMin() {
        for (SplitBillPayerModel min : getPayerModels()) {
            if (getMin(min)) {
                return true;
            }
        }
        return false;
    }

    private boolean getMin() {
        return !setMin() && this.setMax.getItemCount() - 1 > 1 && !IsOverlapping();
    }

    private static boolean getMin(SplitBillPayerModel splitBillPayerModel) {
        return splitBillPayerModel != null && !splitBillPayerModel.setMin() && splitBillPayerModel.equals != null && "0".equals(splitBillPayerModel.equals.getMax);
    }

    private void length() {
        String string = setMin() ? getContext().getString(R.string.split_bill_zero_amount_message) : "";
        getMax getmax = this.length;
        if (getmax != null) {
            getmax.onRemainingUpdated(!TextUtils.isEmpty(string), string);
        }
    }

    private void getMin(String str) {
        if (setMin()) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(". ");
            sb.append(getContext().getString(R.string.split_bill_zero_amount_message));
            str = sb.toString();
        } else if (IsOverlapping()) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(". ");
            String string = getContext().getString(R.string.split_bill_max_amount_message);
            Object[] objArr = new Object[1];
            long j = this.getMax;
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            objArr[0] = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, j, "Rp");
            sb2.append(String.format(string, objArr));
            str = sb2.toString();
        }
        getMax getmax = this.length;
        if (getmax != null) {
            getmax.onRemainingUpdated(true, str);
        }
    }

    private boolean IsOverlapping() {
        return getTotalPayersAmount() > this.getMax;
    }

    public long getTotalPayersAmount() {
        String str;
        long j = 0;
        for (SplitBillPayerModel next : getPayerModels()) {
            if (SplitBillPayerModel.setMax(next.equals)) {
                str = next.equals.getMax;
            } else {
                str = "0";
            }
            j += Long.valueOf(str).longValue();
        }
        return j;
    }

    public boolean isSameWithTotal() {
        return this.getMin == getTotalPayersAmount() || this.getMin == getLockedAmountTotal();
    }

    public void clearCurrentFocus() {
        if (this.rvPayers.findFocus() != null) {
            this.rvPayers.findFocus().clearFocus();
        }
    }

    public void addPayers(List<SplitBillPayerModel> list) {
        if (!this.isInside.isEmpty() && !list.isEmpty()) {
            Iterator<SplitBillPayerModel> it = this.isInside.iterator();
            while (it.hasNext()) {
                SplitBillPayerModel next = it.next();
                Iterator<SplitBillPayerModel> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SplitBillPayerModel next2 = it2.next();
                    if (next2.equals(next)) {
                        next2.toFloatRange = next.getMax();
                        next2.equals = next.equals;
                        it.remove();
                        break;
                    }
                }
            }
        }
        this.isInside.clear();
        this.setMin = 0;
        for (SplitBillPayerModel max : this.toFloatRange) {
            if (max.getMax()) {
                this.setMin++;
            }
        }
        this.setMax.setMax(list);
        this.toFloatRange.clear();
        this.toFloatRange.addAll(this.setMax.getMax());
        this.toFloatRange.remove(this.setMax.getItemCount() - 1);
        calculateAmount();
    }

    static /* synthetic */ void access$000(SplitBillPayersView splitBillPayersView) {
        splitBillPayersView.equals.isInside = !splitBillPayersView.equals.getMin();
        splitBillPayersView.getMax(0);
        if (splitBillPayersView.equals.getMin()) {
            splitBillPayersView.getMax(splitBillPayersView.equals, 0);
        }
    }

    static /* synthetic */ void access$100(SplitBillPayersView splitBillPayersView, int i) {
        splitBillPayersView.getMax(i);
        getMax getmax = splitBillPayersView.length;
        if (getmax != null) {
            getmax.onRemovePayer((SplitBillPayerModel) splitBillPayersView.setMax.setMin(i));
        }
        splitBillPayersView.setMax.getMax(i);
        splitBillPayersView.toFloatRange.remove(i);
        splitBillPayersView.calculateAmount();
    }

    static /* synthetic */ void access$200(SplitBillPayersView splitBillPayersView, long j, int i) {
        SplitBillPayerModel splitBillPayerModel = splitBillPayersView.getPayerModels().get(i);
        if (!splitBillPayerModel.getMax()) {
            splitBillPayerModel.toFloatRange = true;
            splitBillPayersView.setMin++;
        }
        splitBillPayersView.getMax(splitBillPayerModel, j);
        splitBillPayersView.calculateAmount();
    }

    public static /* synthetic */ void getMin(SplitBillPayersView splitBillPayersView, int i) {
        if (splitBillPayersView.setMax.getItemViewType(i) == 1) {
            splitBillPayersView.clearCurrentFocus();
            setOnWheelViewListener.length((View) splitBillPayersView);
            getMax getmax = splitBillPayersView.length;
            if (getmax != null) {
                getmax.onClickAddNewPayer();
            }
        }
    }
}
