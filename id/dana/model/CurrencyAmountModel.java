package id.dana.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import id.dana.richview.CurrencyTextView;
import java.util.Locale;
import o.NebulaLoadingView;
import o.WheelView;
import o.isOriginHasAppInfo;
import o.stopBleScan;

public class CurrencyAmountModel implements Parcelable {
    public static final Parcelable.Creator<CurrencyAmountModel> CREATOR = new Parcelable.Creator<CurrencyAmountModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CurrencyAmountModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CurrencyAmountModel(parcel);
        }
    };
    public String getMax;
    public String length;
    private boolean setMax;

    public int describeContents() {
        return 0;
    }

    protected CurrencyAmountModel(Parcel parcel) {
        this.getMax = parcel.readString();
        this.length = parcel.readString();
    }

    public CurrencyAmountModel(String str, String str2) {
        this.getMax = str;
        this.length = str2;
    }

    public CurrencyAmountModel(String str, String str2, boolean z) {
        this.getMax = str;
        this.length = str2;
        this.setMax = z;
    }

    public CurrencyAmountModel(stopBleScan stopblescan) {
        this.getMax = stopblescan.getAmount();
        this.length = stopblescan.getCurrency();
    }

    public CurrencyAmountModel(String str) {
        this.getMax = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
    }

    public final boolean getMax() {
        return Long.parseLong(this.getMax) < 1;
    }

    public final String setMax() {
        if (TextUtils.isEmpty(this.getMax) || TextUtils.isEmpty(this.length)) {
            return null;
        }
        if (!this.getMax.contains(".")) {
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            return NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, Integer.parseInt(this.getMax), this.length);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.length);
        sb.append(this.getMax);
        return sb.toString();
    }

    public final boolean length(CurrencyAmountModel currencyAmountModel) {
        if (currencyAmountModel == null) {
            return false;
        }
        if (Long.parseLong(isOriginHasAppInfo.getCleanAll(this.getMax)) > Long.parseLong(isOriginHasAppInfo.getCleanAll(currencyAmountModel.getMax))) {
            return true;
        }
        return false;
    }

    public final boolean getMin(CurrencyAmountModel currencyAmountModel) {
        if (currencyAmountModel == null) {
            return false;
        }
        if (Long.parseLong(isOriginHasAppInfo.getCleanAll(this.getMax)) < Long.parseLong(isOriginHasAppInfo.getCleanAll(currencyAmountModel.getMax))) {
            return true;
        }
        return false;
    }
}
