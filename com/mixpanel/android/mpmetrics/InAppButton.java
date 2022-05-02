package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppButton implements Parcelable {
    public static final Parcelable.Creator<InAppButton> CREATOR = new Parcelable.Creator<InAppButton>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new InAppButton[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new InAppButton(parcel);
        }
    };
    private JSONObject equals;
    public int getMax;
    public String getMin;
    public String length;
    public int setMax;
    public int setMin;

    public int describeContents() {
        return 0;
    }

    public InAppButton(Parcel parcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
        this.equals = jSONObject;
        this.length = parcel.readString();
        this.setMax = parcel.readInt();
        this.getMax = parcel.readInt();
        this.setMin = parcel.readInt();
        this.getMin = parcel.readString();
    }

    InAppButton(JSONObject jSONObject) throws JSONException {
        this.equals = jSONObject;
        this.length = jSONObject.getString("text");
        this.setMax = jSONObject.getInt("text_color");
        this.getMax = jSONObject.getInt("bg_color");
        this.setMin = jSONObject.getInt("border_color");
        this.getMin = jSONObject.getString("cta_url");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.equals.toString());
        parcel.writeString(this.length);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.getMax);
        parcel.writeInt(this.setMin);
        parcel.writeString(this.getMin);
    }

    public String toString() {
        return this.equals.toString();
    }
}
