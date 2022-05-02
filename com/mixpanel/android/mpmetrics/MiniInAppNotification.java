package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.mpmetrics.InAppNotification;
import o.assertNotInLayoutOrScroll;
import org.json.JSONException;
import org.json.JSONObject;

public class MiniInAppNotification extends InAppNotification {
    public static final Parcelable.Creator<MiniInAppNotification> CREATOR = new Parcelable.Creator<MiniInAppNotification>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MiniInAppNotification[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MiniInAppNotification(parcel);
        }
    };
    public final String equals;
    public final int toDoubleRange;
    public final int toString;

    public MiniInAppNotification(Parcel parcel) {
        super(parcel);
        this.equals = parcel.readString();
        this.toString = parcel.readInt();
        this.toDoubleRange = parcel.readInt();
    }

    public MiniInAppNotification(JSONObject jSONObject) throws assertNotInLayoutOrScroll {
        super(jSONObject);
        String str;
        try {
            if (!jSONObject.has("cta_url") || jSONObject.isNull("cta_url")) {
                str = null;
            } else {
                str = jSONObject.getString("cta_url");
            }
            this.equals = str;
            this.toString = jSONObject.getInt("image_tint_color");
            this.toDoubleRange = jSONObject.getInt("border_color");
        } catch (JSONException e) {
            throw new assertNotInLayoutOrScroll("Notification JSON was unexpected or bad", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.equals);
        parcel.writeInt(this.toString);
        parcel.writeInt(this.toDoubleRange);
    }

    public final InAppNotification.Type getMax() {
        return InAppNotification.Type.MINI;
    }
}
