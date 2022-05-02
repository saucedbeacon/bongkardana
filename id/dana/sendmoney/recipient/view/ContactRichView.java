package id.dana.sendmoney.recipient.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.CircleImageSelectionView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import o.isOriginHasAppInfo;

public class ContactRichView extends BaseRichView {
    private RecipientViewModel IsOverlapping;
    private boolean getMax;
    private ImageView getMin;
    private TextView isInside;
    private ImageView length;
    private CardView setMax;
    private CircleImageSelectionView setMin;
    private TextView toIntRange;

    public int getLayout() {
        return R.layout.view_contact;
    }

    public ContactRichView(@NonNull Context context) {
        super(context);
    }

    public ContactRichView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContactRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        this.toIntRange = (TextView) findViewById(R.id.f68152131365442);
        this.isInside = (TextView) findViewById(R.id.f65842131365210);
        this.length = (ImageView) findViewById(R.id.f48582131363412);
        this.setMin = (CircleImageSelectionView) findViewById(R.id.f38122131362290);
        this.setMax = (CardView) findViewById(R.id.f41642131362651);
        this.getMin = (ImageView) findViewById(R.id.f47972131363350);
    }

    public void init(RecipientViewModel recipientViewModel, List<String> list) {
        String str;
        String str2;
        this.IsOverlapping = recipientViewModel;
        String length2 = recipientViewModel.length();
        String str3 = recipientViewModel.isInside;
        int i = 0;
        if (!(length2 == null || str3 == null)) {
            TextView textView = this.isInside;
            if (isOriginHasAppInfo.isValidIndoPhoneNumberPrefix(length2) || length2.equals("-")) {
                str = isOriginHasAppInfo.replaceIndoPhoneNumberPrefixWithZero(str3).replace("*", "•");
            } else {
                str = length2.replace("*", "•");
            }
            textView.setText(str);
            TextView textView2 = this.toIntRange;
            if (isOriginHasAppInfo.isValidIndoPhoneNumberPrefix(length2) || length2.equals("-")) {
                str2 = "";
            } else {
                str2 = str3.replace("*", "•");
            }
            textView2.setText(str2);
            this.toIntRange.setVisibility(length() ? 8 : 0);
        }
        this.setMin.loadImage(recipientViewModel.getMax());
        if (list != null) {
            this.length.setVisibility(setMin(list) ? 0 : 8);
            CardView cardView = this.setMax;
            if (setMin(list) || !this.getMax) {
                i = 8;
            }
            cardView.setVisibility(i);
        }
    }

    private boolean length() {
        String length2 = this.IsOverlapping.length();
        return ((isOriginHasAppInfo.isValidIndoPhoneNumberPrefix(length2) || length2.equals("-")) ? "" : this.IsOverlapping.isInside.replace("*", "•")).equals("");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setMin(java.util.List<java.lang.String> r4) {
        /*
            r3 = this;
            id.dana.sendmoney.model.RecipientViewModel r0 = r3.IsOverlapping
            java.lang.String r0 = r0.isInside
            java.lang.String r1 = "*"
            boolean r0 = r0.contains(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            id.dana.sendmoney.model.RecipientViewModel r4 = r3.IsOverlapping
            r4.toDoubleRange = r1
            return r1
        L_0x0012:
            java.util.Iterator r4 = r4.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            id.dana.sendmoney.model.RecipientViewModel r2 = r3.IsOverlapping
            java.lang.String r2 = r2.isInside
            java.lang.String r2 = o.isOriginHasAppInfo.getClearPhoneNumber(r2)
            boolean r2 = getMin(r2, r0)
            if (r2 != 0) goto L_0x003a
            id.dana.sendmoney.model.RecipientViewModel r2 = r3.IsOverlapping
            java.lang.String r2 = r2.isInside
            boolean r0 = getMin(r2, r0)
            if (r0 == 0) goto L_0x0016
        L_0x003a:
            id.dana.sendmoney.model.RecipientViewModel r4 = r3.IsOverlapping
            r4.toDoubleRange = r1
            return r1
        L_0x003f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.recipient.view.ContactRichView.setMin(java.util.List):boolean");
    }

    private static boolean getMin(String str, String str2) {
        return str != null && str.equals(str2);
    }

    public void enableInvite() {
        this.getMax = true;
    }

    public void enableArrow() {
        this.getMin.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.length.getLayoutParams();
        layoutParams.setMargins(0, 0, 4, 0);
        this.length.setLayoutParams(layoutParams);
    }

    public void setSelectedState(List<String> list) {
        String indoPhoneNumber = isOriginHasAppInfo.getIndoPhoneNumber(this.IsOverlapping.isInside);
        if (list == null || list.isEmpty() || !list.contains(indoPhoneNumber)) {
            this.setMin.setUnselectedState();
        } else {
            this.setMin.setSelectedState();
        }
    }

    public RecipientModel getSelectedRecipient() {
        String str;
        RecipientModel.length length2 = new RecipientModel.length("contact");
        if (this.IsOverlapping.isInside.contains("*")) {
            str = this.IsOverlapping.getMin();
        } else {
            str = this.IsOverlapping.isInside;
        }
        length2.toFloatRange = str;
        length2.FastBitmap$CoordinateSystem = this.IsOverlapping.isInside.contains("*") ? "userid" : "phonenumber";
        length2.isInside = this.IsOverlapping.length();
        length2.toIntRange = this.IsOverlapping.isInside;
        length2.IsOverlapping = this.IsOverlapping.getMax();
        length2.create = this.IsOverlapping.isInside();
        return length2.length();
    }
}
