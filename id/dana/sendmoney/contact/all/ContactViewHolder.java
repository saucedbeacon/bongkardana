package id.dana.sendmoney.contact.all;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.view.ContactRichView;
import java.util.List;
import o.IComponent;
import o.Ignore;
import o.RedDotManager;
import o.extractFile;
import o.isHttp;
import o.setPhotoIndex;

public class ContactViewHolder extends Ignore<RecipientViewModel> {
    @BindView(2131362607)
    public ContactRichView contactRichView;
    private final setPhotoIndex getMax;
    private List<String> getMin;
    private List<String> setMax;
    private IComponent<List<String>> setMin;
    private String toIntRange;

    public ContactViewHolder(ViewGroup viewGroup, setPhotoIndex setphotoindex, List<String> list) {
        this(viewGroup, setphotoindex, list, (IComponent<List<String>>) null, (List<String>) null);
    }

    public ContactViewHolder(ViewGroup viewGroup, setPhotoIndex setphotoindex, List<String> list, IComponent<List<String>> iComponent, List<String> list2) {
        super(viewGroup.getContext(), R.layout.item_contact, viewGroup);
        this.getMax = setphotoindex;
        this.setMax = list;
        this.setMin = iComponent;
        this.getMin = list2;
    }

    public final List<String> setMin() {
        return this.setMax;
    }

    public final setPhotoIndex getMax() {
        return this.getMax;
    }

    @SuppressLint({"CheckResult"})
    public void setMax(RecipientViewModel recipientViewModel) {
        this.contactRichView.enableArrow();
        this.contactRichView.init(recipientViewModel, this.setMax);
        this.contactRichView.setOnClickListener(new isHttp(this));
        this.contactRichView.setSelectedState(this.getMin);
        IComponent<List<String>> iComponent = this.setMin;
        if (iComponent != null) {
            getMin(iComponent.subscribe((RedDotManager<? super List<String>>) new extractFile(this)));
        }
    }

    public ContactViewHolder setMin(String str) {
        this.toIntRange = str;
        return this;
    }

    public static /* synthetic */ void setMin(ContactViewHolder contactViewHolder, List list) {
        contactViewHolder.contactRichView.setSelectedState(list);
        contactViewHolder.getMin = list;
    }
}
