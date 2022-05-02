package o;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.bank.all.BankActivity;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.contact.all.ContactActivity;
import id.dana.sendmoney.external.SendMoneyExternalActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney_v2.x2l.model.SocialLinkModel;

public class getCacheId {
    protected final BaseActivity getMax;
    protected String setMin;

    public getCacheId(BaseActivity baseActivity) {
        this.getMax = baseActivity;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r0.equals(id.dana.data.constant.BranchLinkConstant.ActionTarget.SEND_MONEY_PHONE) != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMax(android.os.Bundle r9) {
        /*
            r8 = this;
            boolean r0 = getMax(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "recipientType"
            java.lang.String r0 = r9.getString(r0)
            r2 = -1
            int r3 = r0.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1420060106: goto L_0x0043;
                case -1088666555: goto L_0x0039;
                case 757209410: goto L_0x002f;
                case 785051764: goto L_0x0025;
                case 785087888: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x004c
        L_0x001b:
            java.lang.String r1 = "sendmoneychat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r1 = 2
            goto L_0x004d
        L_0x0025:
            java.lang.String r1 = "sendmoneybank"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x002f:
            java.lang.String r1 = "sendmoneywithdraw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r1 = 4
            goto L_0x004d
        L_0x0039:
            java.lang.String r1 = "sendmoneyoutlet"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r1 = 3
            goto L_0x004d
        L_0x0043:
            java.lang.String r3 = "sendmoneyphone"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            if (r1 == 0) goto L_0x0136
            if (r1 == r7) goto L_0x0132
            if (r1 == r6) goto L_0x0117
            if (r1 == r5) goto L_0x0113
            if (r1 == r4) goto L_0x0105
            java.lang.String r0 = "scanner_data"
            android.os.Parcelable r0 = r9.getParcelable(r0)
            id.dana.sendmoney.model.QrTransferModel r0 = (id.dana.sendmoney.model.QrTransferModel) r0
            if (r0 == 0) goto L_0x0139
            boolean r1 = r0.isInside()
            if (r1 == 0) goto L_0x006f
            java.lang.String r9 = r0.getMin()
            r8.setMin = r9
            goto L_0x0139
        L_0x006f:
            java.lang.String r1 = r0.IsOverlapping()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = r0.setMin()
            java.lang.String r2 = "phonenumber"
            goto L_0x0086
        L_0x0080:
            java.lang.String r1 = r0.IsOverlapping()
            java.lang.String r2 = "userid"
        L_0x0086:
            id.dana.sendmoney.model.RecipientModel$length r3 = new id.dana.sendmoney.model.RecipientModel$length
            java.lang.String r4 = "contact"
            r3.<init>(r4)
            r3.toFloatRange = r1
            r3.FastBitmap$CoordinateSystem = r2
            java.lang.String r1 = r0.toFloatRange()
            r3.isInside = r1
            java.lang.String r1 = r0.setMin()
            r3.toIntRange = r1
            java.lang.String r1 = r0.getMax()
            r3.IsOverlapping = r1
            java.lang.String r1 = r0.getMin()
            r3.length = r1
            r3.getMax = r7
            id.dana.sendmoney.model.RecipientModel r1 = r3.length()
            java.lang.String r2 = "transactionType"
            java.lang.String r2 = r9.getString(r2)
            r1.ICustomTabsCallback = r2
            java.lang.String r2 = r1.ICustomTabsCallback
            java.lang.String r3 = "split_bill"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c6
            java.lang.String r2 = "splitBill"
            r1.getCause = r2
            goto L_0x00cc
        L_0x00c6:
            java.lang.String r2 = id.dana.sendmoney.model.RecipientModel.getMax((id.dana.sendmoney.model.QrTransferModel) r0)
            r1.getCause = r2
        L_0x00cc:
            id.dana.base.BaseActivity r2 = r8.getMax
            java.lang.Class<id.dana.sendmoney.calculator.CalculatorActivity> r4 = id.dana.sendmoney.calculator.CalculatorActivity.class
            android.content.Intent r2 = r2.getIntentClassWithTracking(r4)
            java.lang.String r4 = "data"
            r2.putExtra(r4, r1)
            java.lang.String r0 = r0.length()
            java.lang.String r4 = "remarks"
            r2.putExtra(r4, r0)
            java.lang.String r0 = r1.getCause
            java.lang.String r4 = "transferScenario"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "splitBillId"
            java.lang.String r9 = r9.getString(r0)
            r2.putExtra(r0, r9)
            id.dana.base.BaseActivity r9 = r8.getMax
            r9.startActivity(r2)
            java.lang.String r9 = r1.ICustomTabsCallback
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0139
            id.dana.base.BaseActivity r9 = r8.getMax
            r9.finish()
            goto L_0x0139
        L_0x0105:
            id.dana.base.BaseActivity r9 = r8.getMax
            java.lang.Class<id.dana.sendmoney.external.SendMoneyExternalActivity> r0 = id.dana.sendmoney.external.SendMoneyExternalActivity.class
            android.content.Intent r9 = r9.getIntentClassWithTracking(r0)
            id.dana.base.BaseActivity r0 = r8.getMax
            r0.startActivity(r9)
            goto L_0x0139
        L_0x0113:
            r8.getMin()
            goto L_0x0139
        L_0x0117:
            java.lang.String r0 = ""
            if (r9 != 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            java.lang.String r1 = "iconUrl"
            java.lang.String r0 = r9.getString(r1, r0)
        L_0x0122:
            if (r9 != 0) goto L_0x0126
            r9 = 0
            goto L_0x012e
        L_0x0126:
            java.lang.String r1 = "socilaLink"
            android.os.Parcelable r9 = r9.getParcelable(r1)
            id.dana.sendmoney_v2.x2l.model.SocialLinkModel r9 = (id.dana.sendmoney_v2.x2l.model.SocialLinkModel) r9
        L_0x012e:
            r8.getMax(r0, r9)
            goto L_0x0139
        L_0x0132:
            r8.getMin(r9)
            goto L_0x0139
        L_0x0136:
            r8.setMin((android.os.Bundle) r9)
        L_0x0139:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCacheId.setMax(android.os.Bundle):boolean");
    }

    private static boolean getMax(Bundle bundle) {
        if (bundle != null) {
            return TextUtils.isEmpty(bundle.getString("recipientType")) && bundle.getParcelable("scanner_data") == null;
        }
        return true;
    }

    private void setMin(Bundle bundle) {
        Intent intent = new Intent(this.getMax, length());
        QrTransferModel qrTransferModel = (QrTransferModel) bundle.getParcelable("scanner_data");
        if (qrTransferModel != null) {
            intent.putExtra("scanner_data", qrTransferModel);
        } else if (!TextUtils.isEmpty(this.setMin)) {
            QrTransferModel qrTransferModel2 = new QrTransferModel();
            qrTransferModel2.setMin(this.setMin);
            intent.putExtra("scanner_data", qrTransferModel2);
        }
        intent.putExtras(bundle);
        this.getMax.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public Class<?> length() {
        return ContactActivity.class;
    }

    /* access modifiers changed from: protected */
    public Class<?> setMax() {
        return BankActivity.class;
    }

    private void getMin(Bundle bundle) {
        Intent intent = new Intent(this.getMax, setMax());
        if (!TextUtils.isEmpty(this.setMin)) {
            QrTransferModel qrTransferModel = new QrTransferModel();
            qrTransferModel.setMin(this.setMin);
            intent.putExtra("scanner_data", qrTransferModel);
        }
        intent.putExtras(bundle);
        this.getMax.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void getMax(String str, SocialLinkModel socialLinkModel) {
        RecipientModel.length length = new RecipientModel.length("link");
        length.isInside = this.getMax.getString(R.string.send_as_link);
        length.toIntRange = this.getMax.getString(R.string.share_send_money_link);
        length.IsOverlapping = str;
        length.setMin = this.getMax.getSource();
        RecipientModel length2 = length.length();
        if (!TextUtils.isEmpty(this.setMin)) {
            length2.valueOf = this.setMin;
        }
        setMin(length2);
    }

    private void getMin() {
        AddReceiverDialogFragment addReceiverDialogFragment = new AddReceiverDialogFragment();
        addReceiverDialogFragment.getMin = new getRetmsg(this);
        addReceiverDialogFragment.show(this.getMax.getSupportFragmentManager(), "Add Receiver Info Dialog");
    }

    private void setMin(RecipientModel recipientModel) {
        Intent intentClassWithTracking = this.getMax.getIntentClassWithTracking(CalculatorActivity.class);
        intentClassWithTracking.putExtra("data", recipientModel);
        intentClassWithTracking.putExtra("transferScenario", "send_money");
        this.getMax.startActivity(intentClassWithTracking);
    }

    public final boolean length(Bundle bundle) {
        SocialLinkModel socialLinkModel;
        if (getMax(bundle)) {
            return false;
        }
        String string = bundle.getString("recipientType");
        char c = 65535;
        switch (string.hashCode()) {
            case -1820761141:
                if (string.equals("external")) {
                    c = 4;
                    break;
                }
                break;
            case -1005516787:
                if (string.equals("outlet")) {
                    c = 3;
                    break;
                }
                break;
            case -276836809:
                if (string.equals("phonenumber")) {
                    c = 0;
                    break;
                }
                break;
            case 3016252:
                if (string.equals("bank")) {
                    c = 1;
                    break;
                }
                break;
            case 3052376:
                if (string.equals("chat")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            setMin(bundle);
            return true;
        } else if (c == 1) {
            getMin(bundle);
            return true;
        } else if (c == 2) {
            String str = "";
            if (bundle != null) {
                str = bundle.getString("iconUrl", str);
            }
            if (bundle == null) {
                socialLinkModel = null;
            } else {
                socialLinkModel = (SocialLinkModel) bundle.getParcelable("socilaLink");
            }
            getMax(str, socialLinkModel);
            return true;
        } else if (c == 3) {
            getMin();
            return true;
        } else if (c != 4) {
            return false;
        } else {
            this.getMax.startActivity(this.getMax.getIntentClassWithTracking(SendMoneyExternalActivity.class));
            return true;
        }
    }

    static /* synthetic */ void setMin(getCacheId getcacheid, RecipientModel recipientModel) {
        if (!TextUtils.isEmpty(getcacheid.setMin)) {
            recipientModel.valueOf = getcacheid.setMin;
        }
        recipientModel.ICustomTabsCallback = "send_money";
        getcacheid.setMin(recipientModel);
    }
}
