package id.dana.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import id.dana.R;
import id.dana.domain.payasset.model.CardScheme;
import id.dana.domain.payasset.model.Institution;
import id.dana.richview.CurrencyTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import o.NebulaLoadingView;
import o.WheelView;
import o.dispatchOnCancelled;
import o.isOriginHasAppInfo;
import o.onCancelLoad;
import o.onCanceled;

public class PayMethodModel implements Parcelable {
    public static final Parcelable.Creator<PayMethodModel> CREATOR = new Parcelable.Creator<PayMethodModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PayMethodModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PayMethodModel(parcel, (byte) 0);
        }
    };
    public CurrencyAmountModel FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    private String ICustomTabsCallback;
    public String IsOverlapping;
    public String Mean$Arithmetic;
    public String equals;
    public CurrencyAmountModel getMax;
    public String getMin;
    public CurrencyAmountModel hashCode;
    public boolean invoke;
    public String invokeSuspend;
    public long isInside;
    public boolean length;
    public String setMax;
    public CurrencyAmountModel setMin;
    public String toDoubleRange;
    public String toFloatRange;
    public long toIntRange;
    public String toString;
    public boolean valueOf;
    public String values;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SectionTitle {
        public static final String ADD_CARD = "ADD CARD";
        public static final String BALANCE = "BALANCE";
        public static final String DEBIT_CARD = "DEBIT CARD";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        public static final int ADD_CARD = 0;
        public static final int ADD_ONEKLIK = 7;
        public static final int DANA_CARD = 1;
        public static final int DEBIT_CARD = 2;
        public static final int DIRECT_DEBIT = 3;
        public static final int ONE_CLICK = 4;
        public static final int OTHER_CARD = 5;
        public static final int SECTION = 6;
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ PayMethodModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public PayMethodModel() {
    }

    private PayMethodModel(Parcel parcel) {
        this.getMax = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.getMin = parcel.readString();
        this.setMax = parcel.readString();
        this.length = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.IsOverlapping = parcel.readString();
        this.toDoubleRange = parcel.readString();
        this.toString = parcel.readString();
        this.ICustomTabsCallback = parcel.readString();
        this.values = parcel.readString();
        this.hashCode = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.FastBitmap$CoordinateSystem = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.setMin = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.toFloatRange = parcel.readString();
        this.invokeSuspend = parcel.readString();
        this.equals = parcel.readString();
        this.isInside = parcel.readLong();
        this.toIntRange = parcel.readLong();
        this.Mean$Arithmetic = parcel.readString();
    }

    public final boolean getMin() {
        return this.invoke;
    }

    public final boolean setMax() {
        return this.length;
    }

    public final String getMin(Context context) {
        String str = "";
        if (length()) {
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            Locale locale = WheelView.OnWheelViewListener.getMax;
            CurrencyAmountModel currencyAmountModel = this.getMax;
            if (currencyAmountModel != null) {
                str = currencyAmountModel.getMax;
            }
            str = NebulaLoadingView.AnonymousClass1.getMin(locale, Integer.parseInt(isOriginHasAppInfo.getCleanDot(str)), "Rp");
        } else if (setMin()) {
            str = context.getString(R.string.add_and_use_this_card);
        } else if (this.valueOf) {
            String str2 = this.ICustomTabsCallback;
            if (str2.length() >= 4) {
                return str2.substring(str2.length() - 4);
            }
            return str2;
        } else if (!TextUtils.isEmpty(this.ICustomTabsCallback)) {
            String str3 = this.ICustomTabsCallback;
            Object[] objArr = new Object[1];
            if (str3.length() >= 4) {
                str3 = str3.substring(str3.length() - 4);
            }
            objArr[0] = str3;
            str = String.format("•••• %s", objArr);
        }
        return str;
    }

    public final String getMax(Context context) {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = setMax(context);
        String str2 = "";
        if (length()) {
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            Locale locale = WheelView.OnWheelViewListener.getMax;
            CurrencyAmountModel currencyAmountModel = this.getMax;
            str = NebulaLoadingView.AnonymousClass1.getMin(locale, Integer.parseInt(isOriginHasAppInfo.getCleanDot(currencyAmountModel == null ? str2 : currencyAmountModel.getMax)), "Rp");
        } else if (!this.valueOf || (str = this.ICustomTabsCallback) == null) {
            str = str2;
        } else if (str.length() >= 4) {
            str = str.substring(str.length() - 4);
        }
        objArr[1] = str;
        if (invoke()) {
            StringBuilder sb = new StringBuilder("(");
            sb.append(context.getString(R.string.debit_card));
            sb.append(")");
            str2 = sb.toString();
        } else if (!setMin()) {
            if (toFloatRange()) {
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(context.getString(R.string.express_pay));
                sb2.append(")");
                str2 = sb2.toString();
            } else if (toIntRange()) {
                StringBuilder sb3 = new StringBuilder("(");
                sb3.append(context.getString(R.string.oneklik));
                sb3.append(")");
                str2 = sb3.toString();
            }
        }
        objArr[2] = str2;
        return String.format("%s %s %s", objArr);
    }

    public final boolean length() {
        return "BALANCE".equals(this.values);
    }

    private String FastBitmap$CoordinateSystem() {
        if (TextUtils.isEmpty(this.ICustomTabsCallback)) {
            return "";
        }
        String str = this.ICustomTabsCallback;
        Object[] objArr = new Object[1];
        if (str.length() >= 4) {
            str = str.substring(str.length() - 4);
        }
        objArr[0] = str;
        return String.format("•••• %s", objArr);
    }

    public final void getMin(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-226354241, oncanceled);
            onCancelLoad.getMin(-226354241, oncanceled);
        }
        this.ICustomTabsCallback = str;
    }

    @DrawableRes
    public final int getMax() {
        if (length()) {
            return R.drawable.ic_dana_balance_border;
        }
        if (setMin()) {
            return this.valueOf ? R.drawable.ic_add_card : R.drawable.ic_add_debit_card;
        }
        String str = this.IsOverlapping;
        if (str == null) {
            return R.drawable.defaultbank_mini;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2106037506:
                if (str.equals(Institution.DBS)) {
                    c = 11;
                    break;
                }
                break;
            case -860090140:
                if (str.equals(Institution.CIMB)) {
                    c = 3;
                    break;
                }
                break;
            case -765273313:
                if (str.equals(Institution.JENIUS)) {
                    c = 12;
                    break;
                }
                break;
            case -653221436:
                if (str.equals(Institution.CITIBANK)) {
                    c = 14;
                    break;
                }
                break;
            case -604796681:
                if (str.equals(Institution.MANDIRI)) {
                    c = 4;
                    break;
                }
                break;
            case 425928201:
                if (str.equals(Institution.BCA)) {
                    c = 0;
                    break;
                }
                break;
            case 748237030:
                if (str.equals(Institution.BNI)) {
                    c = 2;
                    break;
                }
                break;
            case 862753634:
                if (str.equals(Institution.BRI)) {
                    c = 5;
                    break;
                }
                break;
            case 924629541:
                if (str.equals(Institution.BTN)) {
                    c = 6;
                    break;
                }
                break;
            case 1295109578:
                if (str.equals(Institution.BCA_ONEKLIK)) {
                    c = 1;
                    break;
                }
                break;
            case 1529712766:
                if (str.equals(Institution.OCBC)) {
                    c = 13;
                    break;
                }
                break;
            case 1560597964:
                if (str.equals(Institution.DANAMON)) {
                    c = 7;
                    break;
                }
                break;
            case 1812453426:
                if (str.equals(Institution.PERMATA)) {
                    c = 9;
                    break;
                }
                break;
            case 1846606677:
                if (str.equals(Institution.PANIN)) {
                    c = 8;
                    break;
                }
                break;
            case 1872811166:
                if (str.equals(Institution.SINARMAS)) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return R.drawable.ic_bank_bcac1id_mini;
            case 2:
                return R.drawable.ic_bank_bnic1id_mini;
            case 3:
                return R.drawable.ic_bank_cimbc1id_mini;
            case 4:
                return R.drawable.ic_bank_mdric1d_mini;
            case 5:
                return R.drawable.ic_bank_bric1id_mini;
            case 6:
                return R.drawable.ic_bank_btnc1id_mini;
            case 7:
                return R.drawable.ic_bank_bdmnc1id_mini;
            case 8:
                return R.drawable.ic_paninc1id_mini;
            case 9:
                return R.drawable.ic_bank_permatac1id_mini;
            case 10:
                return R.drawable.ic_bank_sinarmasc1id_mini;
            case 11:
                return R.drawable.ic_bank_dbsc1id_mini;
            case 12:
                return R.drawable.ic_bank_jenic1id_mini;
            case 13:
                return R.drawable.ic_bank_ocbcc1id_mini;
            case 14:
                return R.drawable.ic_bank_citic1id_mini;
            default:
                return R.drawable.defaultbank_mini;
        }
    }

    public final int IsOverlapping() {
        String str = this.setMax;
        if (str == null) {
            return R.drawable.defaultbank_mini;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1934979172:
                if (str.equals(CardScheme.VISA)) {
                    c = 0;
                    break;
                }
                break;
            case -1062451836:
                if (str.equals(CardScheme.JCB)) {
                    c = 3;
                    break;
                }
                break;
            case -1003810246:
                if (str.equals(CardScheme.AMERICAN_EXPRESS)) {
                    c = 4;
                    break;
                }
                break;
            case 70789:
                if (str.equals(CardScheme.GPN)) {
                    c = 2;
                    break;
                }
                break;
            case 425933967:
                if (str.equals(CardScheme.BCA)) {
                    c = 5;
                    break;
                }
                break;
            case 1067049040:
                if (str.equals(CardScheme.MASTERCARD)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return R.drawable.visa_with_border;
        }
        if (c == 1) {
            return R.drawable.mastercard_with_border;
        }
        if (c == 2) {
            return R.drawable.gpn_with_border;
        }
        if (c == 3) {
            return R.drawable.jcb_with_border;
        }
        if (c != 4) {
            return c != 5 ? R.drawable.defaultbank_mini : R.drawable.ic_card_payment_bca;
        }
        return R.drawable.american_express_with_border;
    }

    public final int isInside() {
        if (length()) {
            return R.drawable.ic_dana_balance_v2;
        }
        if (setMin()) {
            return R.drawable.ic_add_card;
        }
        String str = this.IsOverlapping;
        if (str == null) {
            return R.drawable.ic_default_card_v2;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2106037506:
                if (str.equals(Institution.DBS)) {
                    c = 11;
                    break;
                }
                break;
            case -860090140:
                if (str.equals(Institution.CIMB)) {
                    c = 3;
                    break;
                }
                break;
            case -765273313:
                if (str.equals(Institution.JENIUS)) {
                    c = 12;
                    break;
                }
                break;
            case -764867979:
                if (str.equals(Institution.HSBC)) {
                    c = 16;
                    break;
                }
                break;
            case -653221436:
                if (str.equals(Institution.CITIBANK)) {
                    c = 14;
                    break;
                }
                break;
            case -604796681:
                if (str.equals(Institution.MANDIRI)) {
                    c = 4;
                    break;
                }
                break;
            case -269820658:
                if (str.equals(Institution.BUKOPIN)) {
                    c = 15;
                    break;
                }
                break;
            case -81592318:
                if (str.equals(Institution.STANDARDCHARTERED)) {
                    c = 21;
                    break;
                }
                break;
            case 425928201:
                if (str.equals(Institution.BCA)) {
                    c = 0;
                    break;
                }
                break;
            case 453102289:
                if (str.equals(Institution.UOB)) {
                    c = 18;
                    break;
                }
                break;
            case 571440198:
                if (str.equals(Institution.MAYBANK)) {
                    c = 19;
                    break;
                }
                break;
            case 717760837:
                if (str.equals(Institution.MEGA)) {
                    c = 17;
                    break;
                }
                break;
            case 748237030:
                if (str.equals(Institution.BNI)) {
                    c = 2;
                    break;
                }
                break;
            case 862753634:
                if (str.equals(Institution.BRI)) {
                    c = 5;
                    break;
                }
                break;
            case 924629541:
                if (str.equals(Institution.BTN)) {
                    c = 6;
                    break;
                }
                break;
            case 976666921:
                if (str.equals(Institution.MNC)) {
                    c = 20;
                    break;
                }
                break;
            case 1295109578:
                if (str.equals(Institution.BCA_ONEKLIK)) {
                    c = 1;
                    break;
                }
                break;
            case 1529712766:
                if (str.equals(Institution.OCBC)) {
                    c = 13;
                    break;
                }
                break;
            case 1560597964:
                if (str.equals(Institution.DANAMON)) {
                    c = 7;
                    break;
                }
                break;
            case 1812453426:
                if (str.equals(Institution.PERMATA)) {
                    c = 9;
                    break;
                }
                break;
            case 1846606677:
                if (str.equals(Institution.PANIN)) {
                    c = 8;
                    break;
                }
                break;
            case 1872811166:
                if (str.equals(Institution.SINARMAS)) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return R.drawable.ic_card_payment_bca;
            case 2:
                return R.drawable.ic_card_payment_bni;
            case 3:
                return R.drawable.ic_card_payment_cimb;
            case 4:
                return R.drawable.ic_card_payment_mandiri;
            case 5:
                return R.drawable.ic_card_payment_bri;
            case 6:
                return R.drawable.ic_card_payment_btn;
            case 7:
                return R.drawable.ic_card_payment_danamon;
            case 8:
                return R.drawable.ic_card_payment_panin_bank;
            case 9:
                return R.drawable.ic_card_payment_permata;
            case 10:
                return R.drawable.ic_card_payment_sinarmas;
            case 11:
                return R.drawable.ic_card_payment_dbs;
            case 12:
                return R.drawable.ic_card_payment_jenius;
            case 13:
                return R.drawable.ic_card_payment_ocbc;
            case 14:
                return R.drawable.ic_card_payment_citibank;
            case 15:
                return R.drawable.ic_card_payment_bukopin;
            case 16:
                return R.drawable.ic_card_payment_hsbc;
            case 17:
                return R.drawable.ic_card_payment_mega;
            case 18:
                return R.drawable.ic_card_payment_uob;
            case 19:
                return R.drawable.ic_card_payment_maybank;
            case 20:
                return R.drawable.ic_card_payment_mnc;
            case 21:
                return R.drawable.ic_card_payment_standard_chartered;
            default:
                return R.drawable.ic_default_card_v2;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.getMax, i);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeValue(Boolean.valueOf(this.length));
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.toString);
        parcel.writeString(this.ICustomTabsCallback);
        parcel.writeString(this.values);
        parcel.writeParcelable(this.hashCode, i);
        parcel.writeParcelable(this.FastBitmap$CoordinateSystem, i);
        parcel.writeParcelable(this.setMin, i);
        parcel.writeString(this.invokeSuspend);
        parcel.writeString(this.equals);
        parcel.writeLong(this.isInside);
        parcel.writeLong(this.toIntRange);
        parcel.writeString(this.Mean$Arithmetic);
    }

    public final String length(Context context) {
        if (setMin()) {
            return equals(context);
        }
        if ((invoke() || toFloatRange() || toIntRange()) && !TextUtils.isEmpty(this.IsOverlapping)) {
            return this.toDoubleRange;
        }
        if (length()) {
            return context.getString(R.string.dana_balance);
        }
        String string = context.getString(R.string.debit_card);
        this.toDoubleRange = string;
        return string;
    }

    public final String setMax(Context context) {
        if (setMin()) {
            return equals(context);
        }
        if ((invoke() || toFloatRange() || toIntRange()) && !TextUtils.isEmpty(this.IsOverlapping)) {
            if (!TextUtils.isEmpty(this.equals)) {
                return this.equals;
            }
            return "";
        } else if (length()) {
            return context.getString(R.string.dana_balance);
        } else {
            String string = context.getString(R.string.debit_card);
            this.toDoubleRange = string;
            return string;
        }
    }

    private String equals(Context context) {
        String str = "";
        if (TextUtils.isEmpty(this.IsOverlapping)) {
            return str;
        }
        String string = context.getString(R.string.add_new_card_format);
        Object[] objArr = new Object[1];
        if (!TextUtils.isEmpty(this.equals)) {
            str = this.equals;
        }
        objArr[0] = str;
        return String.format(string, objArr);
    }

    private boolean invoke() {
        return "DEBIT_CARD".equals(this.values);
    }

    public final boolean toFloatRange() {
        return "DIRECT_DEBIT_DEBIT_CARD".equals(this.values) || "DIRECT_DEBIT_CREDIT_CARD".equals(this.values);
    }

    public final boolean toIntRange() {
        return "NET_BANKING".equals(this.values);
    }

    public final String setMin(Context context) {
        if (setMin()) {
            return context.getString(R.string.add_and_use_this_card);
        }
        if (TextUtils.isEmpty(FastBitmap$CoordinateSystem()) || length()) {
            StringBuilder sb = new StringBuilder();
            CurrencyAmountModel currencyAmountModel = this.getMax;
            String str = "";
            sb.append(currencyAmountModel == null ? str : currencyAmountModel.length);
            CurrencyAmountModel currencyAmountModel2 = this.getMax;
            if (currencyAmountModel2 != null) {
                str = currencyAmountModel2.getMax;
            }
            sb.append(str);
            return sb.toString();
        }
        String FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
        Object[] objArr = new Object[1];
        if (FastBitmap$CoordinateSystem2.length() >= 4) {
            FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem2.substring(FastBitmap$CoordinateSystem2.length() - 4);
        }
        objArr[0] = FastBitmap$CoordinateSystem2;
        return String.format("•••• %s", objArr);
    }

    public final int equals() {
        if (length()) {
            return 1;
        }
        if (setMin()) {
            return 0;
        }
        if (toDoubleRange()) {
            return 7;
        }
        if (invoke()) {
            return 2;
        }
        if (toFloatRange()) {
            return 3;
        }
        if (toIntRange()) {
            return 4;
        }
        return invokeSuspend() ? 6 : 5;
    }

    private boolean invokeSuspend() {
        return this.Grayscale$Algorithm != null;
    }

    public final boolean values() {
        return this.valueOf;
    }

    public final boolean setMin() {
        return "ADD_CARD".equalsIgnoreCase(this.setMax);
    }

    private boolean toDoubleRange() {
        return "ADD_ONEKLIK_CARD".equalsIgnoreCase(this.setMax);
    }
}
