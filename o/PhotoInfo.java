package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.paymethod.viewholder.AddCardViewHolder;
import id.dana.sendmoney.paymethod.viewholder.BalanceViewHolder;
import id.dana.sendmoney.paymethod.viewholder.DebitCardViewHolder;
import id.dana.sendmoney.paymethod.viewholder.DirectDebitViewHolder;
import id.dana.sendmoney.paymethod.viewholder.OneKlikViewHolder;
import id.dana.sendmoney.paymethod.viewholder.SectionViewHolder;
import javax.inject.Inject;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;

public class PhotoInfo extends IMultiInstanceInvalidationCallback.Stub<Ignore<PayMethodModel>, PayMethodModel> {
    public Ignore.setMin getMax;
    public boolean setMax;
    public boolean setMin = false;

    @Inject
    PhotoInfo() {
    }

    public int getItemViewType(int i) {
        return ((PayMethodModel) setMin(i)).equals();
    }

    public final Ignore.setMin length() {
        return this.getMax;
    }

    public final void getMax(Ignore.setMin setmin) {
        this.getMax = setmin;
    }

    public final PayMethodModel setMax() {
        for (PayMethodModel payMethodModel : getMax()) {
            if (6 != payMethodModel.equals() && !"BALANCE".equals(payMethodModel.values)) {
                return payMethodModel;
            }
        }
        return null;
    }

    public final PayMethodModel setMin() {
        for (PayMethodModel payMethodModel : getMax()) {
            if ("BALANCE".equals(payMethodModel.values)) {
                return payMethodModel;
            }
        }
        return null;
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 6) {
                            if (this.setMin) {
                                return new getCurrVelocity(viewGroup);
                            }
                            return new DebitCardViewHolder(viewGroup);
                        } else if (this.setMin) {
                            return new extendDuration(viewGroup);
                        } else {
                            return new SectionViewHolder(viewGroup);
                        }
                    } else if (this.setMin) {
                        return new setFriction(viewGroup);
                    } else {
                        return new OneKlikViewHolder(viewGroup);
                    }
                } else if (this.setMin) {
                    return new NumberProgressBar(viewGroup);
                } else {
                    return new DirectDebitViewHolder(viewGroup);
                }
            } else if (this.setMin) {
                return new OverScrollerCopyed(viewGroup, this.setMax);
            } else {
                return new BalanceViewHolder(viewGroup);
            }
        } else if (this.setMin) {
            return new setSelection(viewGroup);
        } else {
            return new AddCardViewHolder(viewGroup);
        }
    }
}
