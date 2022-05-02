package o;

import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;
import o.setGroupVisible;

public final class requireVideoPermission extends setGroupVisible<Integer, RecipientViewModel> {
    private final int IsOverlapping;
    private final List<RecipientViewModel> getMin;
    private final ContactProvider setMin;
    private sendDeletedPhoto toFloatRange = new sendDeletedPhoto();
    private final List<String> toIntRange;

    public requireVideoPermission(ContactProvider contactProvider, List<RecipientViewModel> list, @Nullable List<String> list2, int i) {
        this.setMin = contactProvider;
        this.getMin = list;
        this.toIntRange = list2;
        this.IsOverlapping = i;
    }

    public final void getMax(@NonNull setGroupVisible.getMin<Integer> getmin, @NonNull setGroupVisible.length<Integer, RecipientViewModel> length) {
        List list = (List) this.toFloatRange.apply(ContactProvider.getMax(this.setMin.getMax(getmin.setMin, 0)));
        getMax(this.IsOverlapping, (List<RecipientViewModel>) list);
        list.addAll(0, this.getMin);
        length.setMin(list, 1, 4);
    }

    public final void setMax(@NonNull setGroupVisible.toIntRange<Integer> tointrange, @NonNull setGroupVisible.setMax<Integer, RecipientViewModel> setmax) {
        int i = 0;
        int intValue = (tointrange.setMax * (((Integer) tointrange.getMin).intValue() - 1)) + 0 + 1;
        List list = (List) this.toFloatRange.apply(ContactProvider.getMax(this.setMin.getMax(tointrange.setMax, intValue)));
        getMax(this.IsOverlapping, (List<RecipientViewModel>) list);
        while (list.isEmpty() && getMax(intValue, tointrange.setMax)) {
            i++;
            intValue = (tointrange.setMax * ((((Integer) tointrange.getMin).intValue() - 1) + i)) + 1;
            list.clear();
            list = (List) this.toFloatRange.apply(ContactProvider.getMax(this.setMin.getMax(tointrange.setMax, intValue)));
            getMax(this.IsOverlapping, (List<RecipientViewModel>) list);
        }
        if (!list.isEmpty()) {
            setmax.setMax(list, Integer.valueOf(((Integer) tointrange.getMin).intValue() + 1 + i));
        } else {
            setmax.setMax(list, null);
        }
    }

    private List<RecipientViewModel> setMax(List<RecipientViewModel> list) {
        ArrayList arrayList = new ArrayList();
        for (RecipientViewModel next : list) {
            if (setMin(next, this.toIntRange)) {
                arrayList.add(next);
            }
            if (!isOriginHasAppInfo.isValidIndoPhoneNumber(next.isInside)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private List<RecipientViewModel> length(List<RecipientViewModel> list) {
        ArrayList arrayList = new ArrayList();
        for (RecipientViewModel next : list) {
            if (!setMin(next, this.toIntRange)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean setMin(id.dana.sendmoney.model.RecipientViewModel r2, java.util.List<java.lang.String> r3) {
        /*
            java.util.Iterator r3 = r3.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r2.isInside
            java.lang.String r1 = o.isOriginHasAppInfo.getClearPhoneNumber(r1)
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = r2.isInside
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0004
        L_0x0024:
            r2 = 1
            return r2
        L_0x0026:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requireVideoPermission.setMin(id.dana.sendmoney.model.RecipientViewModel, java.util.List):boolean");
    }

    private void getMax(int i, List<RecipientViewModel> list) {
        if (i != 1) {
            if (i == 2 && length()) {
                list.removeAll(setMax(list));
            }
        } else if (length()) {
            list.removeAll(length(list));
        }
    }

    private boolean getMax(int i, int i2) {
        return i + i2 < this.setMin.length.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null).getCount();
    }

    private boolean length() {
        List<String> list = this.toIntRange;
        return list != null && !list.isEmpty();
    }
}
