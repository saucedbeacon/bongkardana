package o;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;
import o.removeItemAtInt;

public final class notifyTakenPictureData extends removeItemAtInt.length<Integer, RecipientViewModel> {
    private boolean IsOverlapping;
    public List<String> getMax;
    public boolean getMin;
    private final ContentResolver isInside;
    public String length;
    public boolean setMax = true;
    public int setMin;

    public notifyTakenPictureData(Context context) {
        this.isInside = context.getContentResolver();
    }

    public final removeItemAtInt<Integer, RecipientViewModel> setMin() {
        if (this.getMin) {
            ContactProvider contactProvider = new ContactProvider(this.isInside, this.length);
            this.IsOverlapping = contactProvider.setMax();
            if (!contactProvider.setMax()) {
                return new requireVideoPermission(contactProvider, setMax(), this.getMax, this.setMin);
            }
            if (isOriginHasAppInfo.isValidIndoPhoneNumber(this.length) && this.setMax) {
                return getMax(this.length);
            }
            List<RecipientViewModel> max = setMax();
            max.add(new RecipientViewModel(4));
            return new acquirePermissions(max);
        } else if (isOriginHasAppInfo.isValidIndoPhoneNumber(this.length)) {
            return getMax(this.length);
        } else {
            List<RecipientViewModel> max2 = setMax();
            max2.add(new RecipientViewModel(5));
            return new acquirePermissions(max2);
        }
    }

    private acquirePermissions getMax(String str) {
        List<RecipientViewModel> max = setMax();
        RecipientViewModel recipientViewModel = new RecipientViewModel(8);
        recipientViewModel.isInside = str;
        max.add(recipientViewModel);
        return new acquirePermissions(max);
    }

    private List<RecipientViewModel> setMax() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RecipientViewModel(15));
        if (getMax()) {
            arrayList.add(new RecipientViewModel(7));
        }
        if (this.setMax) {
            if (!this.IsOverlapping) {
                arrayList.add(new RecipientViewModel(1, this.length));
            }
            if (TextUtils.isEmpty(this.length)) {
                arrayList.add(new RecipientViewModel(11));
            }
        }
        return arrayList;
    }

    private boolean getMax() {
        return !TextUtils.isEmpty(this.length);
    }
}
