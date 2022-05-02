package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.mpmetrics.InAppNotification;
import java.util.ArrayList;
import o.assertNotInLayoutOrScroll;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TakeoverInAppNotification extends InAppNotification {
    public static final Parcelable.Creator<TakeoverInAppNotification> CREATOR = new Parcelable.Creator<TakeoverInAppNotification>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TakeoverInAppNotification[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TakeoverInAppNotification(parcel);
        }
    };
    private final boolean FastBitmap$CoordinateSystem;
    public final ArrayList<InAppButton> equals;
    public final String hashCode;
    public final int toDoubleRange;
    public final int values;

    public TakeoverInAppNotification(Parcel parcel) {
        super(parcel);
        this.equals = parcel.createTypedArrayList(InAppButton.CREATOR);
        this.toDoubleRange = parcel.readInt();
        this.hashCode = parcel.readString();
        this.values = parcel.readInt();
        this.FastBitmap$CoordinateSystem = parcel.readByte() != 0;
    }

    public TakeoverInAppNotification(JSONObject jSONObject) throws assertNotInLayoutOrScroll {
        super(jSONObject);
        String str;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("buttons");
            this.equals = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.equals.add(new InAppButton((JSONObject) jSONArray.get(i)));
            }
            this.toDoubleRange = jSONObject.getInt("close_color");
            if (!jSONObject.has("title") || jSONObject.isNull("title")) {
                str = null;
            } else {
                str = jSONObject.getString("title");
            }
            this.hashCode = str;
            this.values = jSONObject.optInt("title_color");
            this.FastBitmap$CoordinateSystem = equals().getBoolean("image_fade");
        } catch (JSONException e) {
            throw new assertNotInLayoutOrScroll("Notification JSON was unexpected or bad", e);
        }
    }

    public final boolean IsOverlapping() {
        return this.hashCode != null;
    }

    public final boolean toFloatRange() {
        return this.FastBitmap$CoordinateSystem;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.equals);
        parcel.writeInt(this.toDoubleRange);
        parcel.writeString(this.hashCode);
        parcel.writeInt(this.values);
        parcel.writeByte(this.FastBitmap$CoordinateSystem ? (byte) 1 : 0);
    }

    public final InAppNotification.Type getMax() {
        return InAppNotification.Type.TAKEOVER;
    }
}
