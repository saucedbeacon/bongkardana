package id.dana.sendmoney.bank.savedcard;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.sendmoney.bank.other.OtherBankAccountView;
import id.dana.sendmoney.bank.savedcard.AddOtherCardDialogFragment;
import id.dana.sendmoney.bank.savedcard.SavedBankCardView;
import id.dana.sendmoney.model.BankModel;
import id.dana.sendmoney.model.RecentBankModel;
import java.util.List;
import o.APMinLenMode;
import o.ImageInfo;
import o.StaticOptions;
import o.order;
import o.setOnWheelViewListener;

public class AddOtherCardDialogFragment extends order {
    @BindView(2131363736)
    CoordinatorLayout coordinatorLayout;
    public getMin getMax;
    SavedBankCardView.setMin getMin;
    @BindView(2131364174)
    public NestedScrollView nsContent;
    @BindView(2131365913)
    OtherBankAccountView otherBankAccountView;

    public interface getMin {
        void onAddedNewBank(RecentBankModel recentBankModel);

        void onGetListWithdrawBank(List<BankModel> list);
    }

    public final int getMin() {
        return R.layout.view_coordinator_add_card;
    }

    public final float length() {
        return 0.0f;
    }

    public final int u_() {
        return 56;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        getMax(dialog);
        length(dialog);
    }

    public final void setMin(int i, int i2) {
        super.setMin(i, i2);
        if (getArguments() != null) {
            String string = getArguments().getString("bank_number");
            this.otherBankAccountView.setBankById(getArguments().getString(FeatureParams.BANK_ID));
            this.otherBankAccountView.setBankModels(getArguments().getParcelableArrayList("bundle_withdraw_banks"));
            if (!TextUtils.isEmpty(string)) {
                this.otherBankAccountView.setBankNumber(string);
            }
        }
    }

    public final setOnWheelViewListener.length s_() {
        return new setOnWheelViewListener.length() {
            public final void length() {
                AddOtherCardDialogFragment.this.setMin.post(new ImageInfo(this));
            }

            public final void setMax() {
                AddOtherCardDialogFragment.this.setMin.post(new APMinLenMode(this));
            }
        };
    }

    public final void setMin() {
        this.otherBankAccountView.resetView();
        super.setMin();
        setMin(this.otherBankAccountView.getHeight(), 4);
        this.otherBankAccountView.setOnConfirmClickListener(new View.OnClickListener(this) {
            private final AddOtherCardDialogFragment length;

            {
                this.length = r1;
            }

            public final void onClick(View view) {
                AddOtherCardDialogFragment.setMax(this.length);
            }
        });
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        this.otherBankAccountView.setOnConfirmClickListener((View.OnClickListener) null);
    }

    public final void setMax() {
        super.setMax();
        this.otherBankAccountView.setOnOtherBankAccountViewListener(new StaticOptions(this));
    }

    public final FrameLayout getMax() {
        return (FrameLayout) this.coordinatorLayout.findViewById(R.id.f35312131361977);
    }

    public static /* synthetic */ void length(AddOtherCardDialogFragment addOtherCardDialogFragment, List list) {
        getMin getmin = addOtherCardDialogFragment.getMax;
        if (getmin != null) {
            getmin.onGetListWithdrawBank(list);
        }
    }

    public static /* synthetic */ void setMax(AddOtherCardDialogFragment addOtherCardDialogFragment) {
        RecentBankModel recentBankModel = new RecentBankModel();
        BankModel bankModel = addOtherCardDialogFragment.otherBankAccountView.getBankModel();
        recentBankModel.getMin = bankModel.getMin;
        recentBankModel.isInside = bankModel.isInside;
        String str = bankModel.equals;
        if (str == null) {
            str = "";
        }
        recentBankModel.equals = str;
        recentBankModel.getMax = bankModel.getMax;
        recentBankModel.Mean$Arithmetic = bankModel.getMax();
        recentBankModel.setMax(bankModel.setMin);
        recentBankModel.toFloatRange = bankModel.toFloatRange;
        recentBankModel.IsOverlapping = bankModel.IsOverlapping;
        recentBankModel.Grayscale$Algorithm = addOtherCardDialogFragment.otherBankAccountView.getAlias();
        getMin getmin = addOtherCardDialogFragment.getMax;
        if (getmin != null) {
            getmin.onAddedNewBank(recentBankModel);
        }
        addOtherCardDialogFragment.dismiss();
    }
}
