package o;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import o.removeItemAtInt;

public final class getMediaType extends removeItemAtInt.length<Integer, RecipientViewModel> {
    private final ContentResolver IsOverlapping;
    public int equals;
    public boolean getMax;
    public boolean getMin;
    public boolean length;
    public String setMax;
    public boolean setMin;
    private boolean toFloatRange;
    public List<RecentBankModel> toIntRange;

    public getMediaType(Context context) {
        this.IsOverlapping = context.getContentResolver();
    }

    public final removeItemAtInt<Integer, RecipientViewModel> setMin() {
        if (this.length && 2 == this.equals) {
            ContactProvider contactProvider = new ContactProvider(this.IsOverlapping, this.setMax);
            this.toFloatRange = contactProvider.setMax();
            if (!contactProvider.setMax()) {
                return new requireVideoPermission(contactProvider, setMax(), (List<String>) null, 0);
            }
            if (isOriginHasAppInfo.isValidShowPhoneNumber(this.setMax)) {
                return getMax(this.setMax);
            }
            List<RecipientViewModel> max = setMax();
            max.add(new RecipientViewModel(4));
            return new acquirePermissions(max);
        } else if (1 == this.equals) {
            if (!isOriginHasAppInfo.isValidShowAccountNumber(this.setMax)) {
                return new acquirePermissions(setMax());
            }
            String str = this.setMax;
            List<RecipientViewModel> max2 = setMax();
            RecipientViewModel recipientViewModel = new RecipientViewModel(12);
            recipientViewModel.isInside = str;
            max2.add(recipientViewModel);
            return new acquirePermissions(max2);
        } else if (isOriginHasAppInfo.isValidShowPhoneNumber(this.setMax)) {
            return getMax(this.setMax);
        } else {
            List<RecipientViewModel> max3 = setMax();
            max3.add(new RecipientViewModel(5));
            return new acquirePermissions(max3);
        }
    }

    private acquirePermissions getMax(String str) {
        List<RecipientViewModel> max = setMax();
        RecipientViewModel recipientViewModel = new RecipientViewModel(8);
        recipientViewModel.isInside = str;
        max.add(recipientViewModel);
        return new acquirePermissions(max);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [o.setMediaSubType] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<id.dana.sendmoney.model.RecipientViewModel> setMax() {
        /*
            r7 = this;
            o.getMediaSubType r0 = new o.getMediaSubType
            r0.<init>()
            o.getMediaId r2 = new o.getMediaId
            boolean r1 = r7.getMax()
            r2.<init>(r0, r1)
            int r0 = r7.equals
            r1 = 2
            if (r1 != r0) goto L_0x001f
            o.setMediaSubType r0 = new o.setMediaSubType
            boolean r1 = r7.toFloatRange
            r1 = r1 ^ 1
            java.lang.String r3 = r7.setMax
            r0.<init>(r2, r1, r3)
            goto L_0x002d
        L_0x001f:
            o.isVideo r0 = new o.isVideo
            boolean r3 = r7.getMin
            java.util.List<id.dana.sendmoney.model.RecentBankModel> r4 = r7.toIntRange
            java.lang.String r5 = r7.setMax
            boolean r6 = r7.setMin
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x002d:
            java.util.List r0 = r0.getMin()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMediaType.setMax():java.util.List");
    }

    private boolean getMax() {
        return !TextUtils.isEmpty(this.setMax);
    }
}
