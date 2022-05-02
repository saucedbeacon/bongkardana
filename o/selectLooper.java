package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.sendmoney.contact.all.ContactViewHolder;
import id.dana.sendmoney.contact.all.NoContactPermissionViewHolder;
import id.dana.sendmoney.contact.all.SendWithNewNumberViewHolder;
import id.dana.sendmoney.contact.all.SendWithPhoneNumberViewHolder;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.SectionViewHolder;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;
import o.PathUtils;
import o.changeMenuMode;

public final class selectLooper extends IMultiInstanceInvalidationCallback.Stub.Proxy<Ignore<RecipientViewModel>, RecipientViewModel> {
    public List<String> IsOverlapping;
    public List<String> getMax;
    public IComponent<List<String>> getMin;
    public setPhotoIndex length;
    public boolean toFloatRange;

    public selectLooper(@NonNull changeMenuMode.setMin<RecipientViewModel> setmin) {
        super(setmin);
    }

    public final int getItemViewType(int i) {
        setExclusiveItemChecked<T> setexclusiveitemchecked;
        if (i < 0) {
            i = 0;
        }
        removeItemAt<T> removeitemat = this.setMin;
        if (removeitemat.IsOverlapping != null) {
            setexclusiveitemchecked = removeitemat.IsOverlapping;
        } else {
            setexclusiveitemchecked = removeitemat.toFloatRange;
        }
        return ((RecipientViewModel) setexclusiveitemchecked.get(i)).values;
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 1) {
            if (i != 3) {
                if (i == 5) {
                    return new NoContactPermissionViewHolder(viewGroup);
                }
                if (i == 11) {
                    return new SendWithPhoneNumberViewHolder(viewGroup, "split_bill");
                }
                if (!(i == 15 || i == 7)) {
                    return i != 8 ? new hasHost(viewGroup) : new SendWithNewNumberViewHolder(viewGroup, this.length);
                }
            } else if (this.toFloatRange) {
                return new ContactViewHolder(viewGroup, this.length, this.getMax, this.getMin, this.IsOverlapping).setMin("split_bill");
            } else {
                return new PathUtils.AnonymousClass1(viewGroup, this.length, this.getMax, this.getMin, this.IsOverlapping).setMin("split_bill");
            }
        }
        return new SectionViewHolder(viewGroup);
    }
}
