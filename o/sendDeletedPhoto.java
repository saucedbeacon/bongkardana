package o;

import id.dana.sendmoney.contact.provider.ContactModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;

public final class sendDeletedPhoto extends setSpeed<List<ContactModel>, List<RecipientViewModel>> {
    public final /* synthetic */ Object map(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (ContactModel contactModel : (List) obj) {
            RecipientViewModel recipientViewModel = null;
            if (contactModel != null) {
                recipientViewModel = new RecipientViewModel(3);
                recipientViewModel.getMax = contactModel.toFloatRange;
                recipientViewModel.IsOverlapping = contactModel.length;
                recipientViewModel.isInside = contactModel.toFloatRange;
                recipientViewModel.getMin = contactModel.setMax;
            }
            arrayList.add(recipientViewModel);
        }
        return arrayList;
    }
}
