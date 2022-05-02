package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LinkProperties implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LinkProperties[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LinkProperties(parcel, (byte) 0);
        }
    };
    public String IsOverlapping;
    public String equals;
    public int getMax;
    public final ArrayList<String> getMin;
    public String length;
    public String setMax;
    public String setMin;
    public final HashMap<String, String> toIntRange;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ LinkProperties(Parcel parcel, byte b) {
        this(parcel);
    }

    public LinkProperties() {
        this.getMin = new ArrayList<>();
        this.setMax = "Share";
        this.toIntRange = new HashMap<>();
        this.length = "";
        this.setMin = "";
        this.getMax = 0;
        this.IsOverlapping = "";
        this.equals = "";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.setMin);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
        parcel.writeInt(this.getMax);
        parcel.writeSerializable(this.getMin);
        parcel.writeInt(this.toIntRange.size());
        for (Map.Entry next : this.toIntRange.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    private LinkProperties(Parcel parcel) {
        this();
        this.setMax = parcel.readString();
        this.length = parcel.readString();
        this.setMin = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.equals = parcel.readString();
        this.getMax = parcel.readInt();
        this.getMin.addAll((ArrayList) parcel.readSerializable());
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.toIntRange.put(parcel.readString(), parcel.readString());
        }
    }
}
