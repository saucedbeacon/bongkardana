package id.dana.richview.bank;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney.model.BankModel;
import java.util.ArrayList;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.drawDividersHorizontal;
import o.updateCornerMarking;

public final class AutoCompleteBankAdapter extends IMultiInstanceInvalidationCallback.Stub<ViewHolder, BankModel> implements Filterable {
    /* access modifiers changed from: private */
    public String getMax;
    /* access modifiers changed from: private */
    public List<BankModel> getMin;
    /* access modifiers changed from: package-private */
    public List<BankModel> length;

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder getMin;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.getMin = viewHolder;
            viewHolder.ivBankLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48092131363362, "field 'ivBankLogo'", ImageView.class);
            viewHolder.tvBankName = (TextView) drawDividersHorizontal.setMin(view, R.id.f64962131365121, "field 'tvBankName'", TextView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolder viewHolder = this.getMin;
            if (viewHolder != null) {
                this.getMin = null;
                viewHolder.ivBankLogo = null;
                viewHolder.tvBankName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public final Filter.FilterResults performFiltering(CharSequence charSequence) {
                String unused = AutoCompleteBankAdapter.this.getMax = charSequence.toString();
                ArrayList arrayList = new ArrayList();
                for (BankModel bankModel : AutoCompleteBankAdapter.this.length) {
                    if (bankModel.toIntRange.toLowerCase().contains(AutoCompleteBankAdapter.this.getMax.toLowerCase())) {
                        arrayList.add(bankModel);
                    }
                    if (arrayList.size() == 3) {
                        break;
                    }
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = arrayList;
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                List unused = AutoCompleteBankAdapter.this.getMin = (ArrayList) filterResults.values;
                AutoCompleteBankAdapter autoCompleteBankAdapter = AutoCompleteBankAdapter.this;
                autoCompleteBankAdapter.getMin(autoCompleteBankAdapter.getMin);
            }
        };
    }

    public final List<BankModel> getMax() {
        return this.length;
    }

    protected class ViewHolder extends Ignore<BankModel> {
        boolean getMax;
        @BindView(2131363362)
        ImageView ivBankLogo;
        @BindView(2131365121)
        TextView tvBankName;

        public final /* synthetic */ void setMax(Object obj) {
            BankModel bankModel = (BankModel) obj;
            boolean max = bankModel.setMax();
            this.getMax = max;
            if (!max) {
                this.tvBankName.setTextColor(IntRange.setMax(this.length, R.color.f20402131099954));
            }
            this.tvBankName.setText(bankModel.toIntRange);
            ((updateCornerMarking) Glide.getMax(this.length)).setMax(bankModel.getMax()).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).onRelationshipValidationResult().length(this.ivBankLogo);
        }

        public ViewHolder(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_bank, viewGroup);
        }

        public final void setMin(Ignore.setMin setmin) {
            if (this.getMax) {
                super.setMin(setmin);
            }
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(viewGroup.getContext(), viewGroup);
    }
}
