package id.dana.sendmoney.recipient.recent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import o.IComponent;
import o.Ignore;
import o.PrepareException;
import o.RedDotManager;
import o.detach;
import o.getThumbPath;
import o.increaseCount;
import o.resetInternal;
import o.setIsAlbumMedia;
import o.setLeftText;
import o.setMediaId;
import o.stopIgnoring;

public class RecentRecipientView extends BaseRichView {
    private int getMax;
    private getMax getMin;
    /* access modifiers changed from: private */
    public boolean length;
    @Inject
    public setMediaId.setMax presenter;
    @Inject
    public setIsAlbumMedia recentRecipientAdapter;
    @BindView(2131364555)
    RecyclerView rvRecentRecipient;
    /* access modifiers changed from: private */
    public IComponent<List<String>> setMax;
    /* access modifiers changed from: private */
    public int setMin;
    @BindView(2131365493)
    TextView tvRecentTransaction;

    public interface getMax {
        void onItemSelected(increaseCount increasecount);
    }

    public int getLayout() {
        return R.layout.view_recent_recipient;
    }

    public RecentRecipientView(@NonNull Context context) {
        super(context);
    }

    public RecentRecipientView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecentRecipientView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RecentRecipientView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setRecipientContactType(int i) {
        this.setMin = i;
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        detach.getMin getmin = new detach.getMin((byte) 0);
        if (r4 != null) {
            getmin.getMax = r4;
            getmin.getMin = new RecentRecipientModule(new setMediaId.getMin() {
                public final void getMax(List<increaseCount> list) {
                }

                public final void getMin(List<increaseCount> list) {
                    if (!RecentRecipientView.this.length || list.isEmpty()) {
                        RecentRecipientView.this.tvRecentTransaction.setVisibility(8);
                    } else {
                        RecentRecipientView.this.tvRecentTransaction.setVisibility(0);
                    }
                    RecentRecipientView.this.recentRecipientAdapter.length = RecentRecipientView.this.setMax;
                    RecentRecipientView.this.recentRecipientAdapter.setMax = RecentRecipientView.this.setMin;
                    RecentRecipientView.this.recentRecipientAdapter.getMin(list);
                }

                public final void getMax() {
                    RecentRecipientView.this.recentRecipientAdapter.setMax = RecentRecipientView.this.setMin;
                    RecentRecipientView.this.recentRecipientAdapter.getMin(Collections.emptyList());
                }

                public final void setMin() {
                    RecentRecipientView.this.presenter.setMin(RecentRecipientView.this.setMin, RecentRecipientView.this.getMax);
                }

                public final void setMin(boolean z) {
                    RecentRecipientView.this.recentRecipientAdapter.getMin = z;
                }
            });
            stopIgnoring.setMin(getmin.getMin, RecentRecipientModule.class);
            stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
            new detach(getmin.getMin, getmin.getMax, (byte) 0).length(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.onRetainNonConfigurationInstance);
            try {
                TypedValue typedValue = new TypedValue();
                obtainStyledAttributes.getValue(0, typedValue);
                this.getMax = typedValue.data;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        this.rvRecentRecipient.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recentRecipientAdapter.getMax((Ignore.setMin) new getThumbPath(this));
        this.recentRecipientAdapter.getMin = false;
        this.rvRecentRecipient.setAdapter(this.recentRecipientAdapter);
        this.rvRecentRecipient.setNestedScrollingEnabled(false);
        RecyclerView$FastBitmap$CoordinateSystem.getMin max = this.rvRecentRecipient.getRecycledViewPool().setMax(2);
        max.setMax = 0;
        ArrayList<RecyclerView.valueOf> arrayList = max.getMax;
        while (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() - 1);
        }
        loadData();
    }

    public void loadData() {
        int i = this.setMin;
        if (i == 2) {
            this.presenter.setMin(i, this.getMax);
            return;
        }
        this.presenter.getMax();
        this.presenter.getMin();
    }

    public void setSelectedNumbers(List<String> list) {
        this.recentRecipientAdapter.getMax = list;
    }

    public void setSelectedContactsPublisher(IComponent<List<String>> iComponent) {
        this.setMax = iComponent;
        this.recentRecipientAdapter.length = iComponent;
        if (iComponent != null) {
            addDisposable(iComponent.subscribe((RedDotManager<? super List<String>>) new setLeftText(this)));
        }
    }

    public void setItemSelectedListener(getMax getmax) {
        this.getMin = getmax;
    }

    public void setRecentTransactionVisible(boolean z) {
        this.length = z;
    }
}
