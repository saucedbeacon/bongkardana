package id.dana.sendmoney.bank.savedcard;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.SavedBankModule;
import id.dana.sendmoney.model.BankModel;
import id.dana.sendmoney.model.RecentBankModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import o.APMode;
import o.APSpecificCropMode;
import o.GriverImageLoadRequest;
import o.Ignore;
import o.PrepareException;
import o.onSuccess;
import o.stopIgnoring;
import o.verifyPackage;

public class SavedBankCardView extends BaseRichView {
    /* access modifiers changed from: private */
    public boolean length;
    setMin onItemSelectedListener;
    @Inject
    public onSuccess.length presenter;
    @BindView(2131364399)
    RelativeLayout rlAdd;
    @BindView(2131364563)
    RecyclerView rvSavedBank;
    @Inject
    public APMode savedBankCardAdapter;
    @BindView(2131365600)
    TextView tvTitle;

    public interface setMin {
    }

    public int getLayout() {
        return R.layout.view_saved_bank_card;
    }

    public SavedBankCardView(@NonNull Context context) {
        super(context);
    }

    public SavedBankCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SavedBankCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        verifyPackage.setMax setmax = new verifyPackage.setMax((byte) 0);
        if (r4 != null) {
            setmax.getMin = r4;
            setmax.setMin = new SavedBankModule(new onSuccess.getMax() {
                public final void getMin() {
                }

                public final void length(int i) {
                }

                public final void setMax(List<RecentBankModel> list) {
                }

                public final void getMax(List<RecentBankModel> list) {
                    APMode aPMode = SavedBankCardView.this.savedBankCardAdapter;
                    SavedBankCardView savedBankCardView = SavedBankCardView.this;
                    aPMode.getMin(savedBankCardView.configureList(list, savedBankCardView.length));
                }

                public final void length(List<RecentBankModel> list) {
                    SavedBankCardView.this.savedBankCardAdapter.getMin();
                    SavedBankCardView.this.savedBankCardAdapter.getMin(list);
                }

                public final void getMax() {
                    SavedBankCardView.this.savedBankCardAdapter.getMin(Collections.emptyList());
                }

                public final void setMax() {
                    SavedBankCardView.this.savedBankCardAdapter.getMin(Collections.emptyList());
                }
            });
            stopIgnoring.setMin(setmax.setMin, SavedBankModule.class);
            stopIgnoring.setMin(setmax.getMin, PrepareException.AnonymousClass1.class);
            new verifyPackage(setmax.setMin, setmax.getMin, (byte) 0).getMax(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        this.presenter.length();
        this.rvSavedBank.setLayoutManager(new LinearLayoutManager(getContext()));
        ViewCompat.setMax((View) this.rvSavedBank, false);
        this.rvSavedBank.setAdapter(this.savedBankCardAdapter);
        this.savedBankCardAdapter.getMax((Ignore.setMin) new APSpecificCropMode(this));
    }

    public List<RecentBankModel> configureList(List<RecentBankModel> list, boolean z) {
        return (z || list.size() <= 3) ? list : list.subList(0, 3);
    }

    public void setSeeAll(boolean z) {
        this.length = z;
    }

    public void setOnItemSelectedListener(setMin setmin) {
        this.onItemSelectedListener = setmin;
    }

    public void setAddNewBankProperty(String str, List<BankModel> list) {
        this.rlAdd.setOnClickListener(new GriverImageLoadRequest(this, str, list));
    }

    public static /* synthetic */ void setMax(SavedBankCardView savedBankCardView, String str, List list) {
        Bundle bundle = new Bundle();
        bundle.putString("bank_number", str);
        bundle.putParcelableArrayList("bundle_withdraw_banks", new ArrayList(list));
        AddOtherCardDialogFragment addOtherCardDialogFragment = new AddOtherCardDialogFragment();
        addOtherCardDialogFragment.getMin = savedBankCardView.onItemSelectedListener;
        addOtherCardDialogFragment.setArguments(bundle);
        addOtherCardDialogFragment.show(savedBankCardView.getBaseActivity().getSupportFragmentManager(), "Custom Bottom Sheet");
    }
}
