package o;

import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;

public class getMediaSubType {
    protected List<RecipientViewModel> getMax = new ArrayList();

    public List<RecipientViewModel> getMin() {
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final void length(RecipientViewModel recipientViewModel) {
        this.getMax.add(recipientViewModel);
    }

    /* access modifiers changed from: protected */
    public final void setMax(List<RecipientViewModel> list) {
        this.getMax.addAll(list);
    }
}
