package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.branch.referral.Defines;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContentMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ContentMetadata[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ContentMetadata(parcel, (byte) 0);
        }
    };
    public Integer FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    public String IsOverlapping;
    public Double Mean$Arithmetic;
    private final ArrayList<String> create;
    public ProductCategory equals;
    private final HashMap<String, String> getCause;
    public String getMax;
    public CurrencyType getMin;
    public Double hashCode;
    public String invoke;
    public String invokeSuspend;
    public CONDITION isInside;
    public Double length;
    public Double onNavigationEvent;
    BranchContentSchema setMax;
    public Double setMin;
    public String toDoubleRange;
    public String toFloatRange;
    public String toIntRange;
    public Double toString;
    public String valueOf;
    public Double values;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ ContentMetadata(Parcel parcel, byte b) {
        this(parcel);
    }

    public enum CONDITION {
        OTHER,
        NEW,
        GOOD,
        FAIR,
        POOR,
        USED,
        REFURBISHED,
        EXCELLENT;

        public static CONDITION getValue(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (CONDITION condition : values()) {
                    if (condition.name().equalsIgnoreCase(str)) {
                        return condition;
                    }
                }
            }
            return null;
        }
    }

    public ContentMetadata() {
        this.create = new ArrayList<>();
        this.getCause = new HashMap<>();
    }

    public final JSONObject length() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.setMax != null) {
                jSONObject.put(Defines.Jsonkey.ContentSchema.getKey(), this.setMax.name());
            }
            if (this.setMin != null) {
                jSONObject.put(Defines.Jsonkey.Quantity.getKey(), this.setMin);
            }
            if (this.length != null) {
                jSONObject.put(Defines.Jsonkey.Price.getKey(), this.length);
            }
            if (this.getMin != null) {
                jSONObject.put(Defines.Jsonkey.PriceCurrency.getKey(), this.getMin.toString());
            }
            if (!TextUtils.isEmpty(this.getMax)) {
                jSONObject.put(Defines.Jsonkey.SKU.getKey(), this.getMax);
            }
            if (!TextUtils.isEmpty(this.toFloatRange)) {
                jSONObject.put(Defines.Jsonkey.ProductName.getKey(), this.toFloatRange);
            }
            if (!TextUtils.isEmpty(this.IsOverlapping)) {
                jSONObject.put(Defines.Jsonkey.ProductBrand.getKey(), this.IsOverlapping);
            }
            if (this.equals != null) {
                jSONObject.put(Defines.Jsonkey.ProductCategory.getKey(), this.equals.getName());
            }
            if (this.isInside != null) {
                jSONObject.put(Defines.Jsonkey.Condition.getKey(), this.isInside.name());
            }
            if (!TextUtils.isEmpty(this.toIntRange)) {
                jSONObject.put(Defines.Jsonkey.ProductVariant.getKey(), this.toIntRange);
            }
            if (this.toString != null) {
                jSONObject.put(Defines.Jsonkey.Rating.getKey(), this.toString);
            }
            if (this.values != null) {
                jSONObject.put(Defines.Jsonkey.RatingAverage.getKey(), this.values);
            }
            if (this.FastBitmap$CoordinateSystem != null) {
                jSONObject.put(Defines.Jsonkey.RatingCount.getKey(), this.FastBitmap$CoordinateSystem);
            }
            if (this.hashCode != null) {
                jSONObject.put(Defines.Jsonkey.RatingMax.getKey(), this.hashCode);
            }
            if (!TextUtils.isEmpty(this.toDoubleRange)) {
                jSONObject.put(Defines.Jsonkey.AddressStreet.getKey(), this.toDoubleRange);
            }
            if (!TextUtils.isEmpty(this.valueOf)) {
                jSONObject.put(Defines.Jsonkey.AddressCity.getKey(), this.valueOf);
            }
            if (!TextUtils.isEmpty(this.Grayscale$Algorithm)) {
                jSONObject.put(Defines.Jsonkey.AddressRegion.getKey(), this.Grayscale$Algorithm);
            }
            if (!TextUtils.isEmpty(this.invoke)) {
                jSONObject.put(Defines.Jsonkey.AddressCountry.getKey(), this.invoke);
            }
            if (!TextUtils.isEmpty(this.invokeSuspend)) {
                jSONObject.put(Defines.Jsonkey.AddressPostalCode.getKey(), this.invokeSuspend);
            }
            if (this.Mean$Arithmetic != null) {
                jSONObject.put(Defines.Jsonkey.Latitude.getKey(), this.Mean$Arithmetic);
            }
            if (this.onNavigationEvent != null) {
                jSONObject.put(Defines.Jsonkey.Longitude.getKey(), this.onNavigationEvent);
            }
            if (this.create.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(Defines.Jsonkey.ImageCaptions.getKey(), jSONArray);
                Iterator<String> it = this.create.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            if (this.getCause.size() > 0) {
                for (String next : this.getCause.keySet()) {
                    jSONObject.put(next, this.getCause.get(next));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        BranchContentSchema branchContentSchema = this.setMax;
        String str = "";
        parcel.writeString(branchContentSchema != null ? branchContentSchema.name() : str);
        parcel.writeSerializable(this.setMin);
        parcel.writeSerializable(this.length);
        CurrencyType currencyType = this.getMin;
        parcel.writeString(currencyType != null ? currencyType.name() : str);
        parcel.writeString(this.getMax);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        ProductCategory productCategory = this.equals;
        parcel.writeString(productCategory != null ? productCategory.getName() : str);
        CONDITION condition = this.isInside;
        if (condition != null) {
            str = condition.name();
        }
        parcel.writeString(str);
        parcel.writeString(this.toIntRange);
        parcel.writeSerializable(this.toString);
        parcel.writeSerializable(this.values);
        parcel.writeSerializable(this.FastBitmap$CoordinateSystem);
        parcel.writeSerializable(this.hashCode);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.invoke);
        parcel.writeString(this.invokeSuspend);
        parcel.writeSerializable(this.Mean$Arithmetic);
        parcel.writeSerializable(this.onNavigationEvent);
        parcel.writeSerializable(this.create);
        parcel.writeSerializable(this.getCause);
    }

    private ContentMetadata(Parcel parcel) {
        this();
        this.setMax = BranchContentSchema.getValue(parcel.readString());
        this.setMin = (Double) parcel.readSerializable();
        this.length = (Double) parcel.readSerializable();
        this.getMin = CurrencyType.getValue(parcel.readString());
        this.getMax = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.equals = ProductCategory.getValue(parcel.readString());
        this.isInside = CONDITION.getValue(parcel.readString());
        this.toIntRange = parcel.readString();
        this.toString = (Double) parcel.readSerializable();
        this.values = (Double) parcel.readSerializable();
        this.FastBitmap$CoordinateSystem = (Integer) parcel.readSerializable();
        this.hashCode = (Double) parcel.readSerializable();
        this.toDoubleRange = parcel.readString();
        this.valueOf = parcel.readString();
        this.Grayscale$Algorithm = parcel.readString();
        this.invoke = parcel.readString();
        this.invokeSuspend = parcel.readString();
        this.Mean$Arithmetic = (Double) parcel.readSerializable();
        this.onNavigationEvent = (Double) parcel.readSerializable();
        this.create.addAll((ArrayList) parcel.readSerializable());
        this.getCause.putAll((HashMap) parcel.readSerializable());
    }
}
