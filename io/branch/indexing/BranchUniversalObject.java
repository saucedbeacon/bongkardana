package io.branch.indexing;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.branch.referral.Defines;
import io.branch.referral.util.ContentMetadata;
import io.branch.referral.util.LinkProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.setRightButtonView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BranchUniversalObject implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BranchUniversalObject[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BranchUniversalObject(parcel, (byte) 0);
        }
    };
    public CONTENT_INDEX_MODE IsOverlapping;
    private long equals;
    public String getMax;
    public String getMin;
    private long hashCode;
    private String isInside;
    public String length;
    public CONTENT_INDEX_MODE setMax;
    public String setMin;
    private ContentMetadata toFloatRange;
    private final ArrayList<String> toIntRange;

    public enum CONTENT_INDEX_MODE {
        PUBLIC,
        PRIVATE
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ BranchUniversalObject(Parcel parcel, byte b) {
        this(parcel);
    }

    public BranchUniversalObject() {
        this.toFloatRange = new ContentMetadata();
        this.toIntRange = new ArrayList<>();
        this.getMin = "";
        this.isInside = "";
        this.length = "";
        this.getMax = "";
        this.setMax = CONTENT_INDEX_MODE.PUBLIC;
        this.IsOverlapping = CONTENT_INDEX_MODE.PUBLIC;
        this.equals = 0;
        this.hashCode = System.currentTimeMillis();
    }

    private boolean setMax() {
        return this.setMax == CONTENT_INDEX_MODE.PUBLIC;
    }

    private boolean getMax() {
        return this.IsOverlapping == CONTENT_INDEX_MODE.PUBLIC;
    }

    public final JSONObject setMin() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject length2 = this.toFloatRange.length();
            Iterator<String> keys = length2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, length2.get(next));
            }
            if (!TextUtils.isEmpty(this.length)) {
                jSONObject.put(Defines.Jsonkey.ContentTitle.getKey(), this.length);
            }
            if (!TextUtils.isEmpty(this.getMin)) {
                jSONObject.put(Defines.Jsonkey.CanonicalIdentifier.getKey(), this.getMin);
            }
            if (!TextUtils.isEmpty(this.isInside)) {
                jSONObject.put(Defines.Jsonkey.CanonicalUrl.getKey(), this.isInside);
            }
            if (this.toIntRange.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = this.toIntRange.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(Defines.Jsonkey.ContentKeyWords.getKey(), jSONArray);
            }
            if (!TextUtils.isEmpty(this.getMax)) {
                jSONObject.put(Defines.Jsonkey.ContentDesc.getKey(), this.getMax);
            }
            if (!TextUtils.isEmpty(this.setMin)) {
                jSONObject.put(Defines.Jsonkey.ContentImgUrl.getKey(), this.setMin);
            }
            if (this.equals > 0) {
                jSONObject.put(Defines.Jsonkey.ContentExpiryTime.getKey(), this.equals);
            }
            jSONObject.put(Defines.Jsonkey.PublicallyIndexable.getKey(), setMax());
            jSONObject.put(Defines.Jsonkey.LocallyIndexable.getKey(), getMax());
            jSONObject.put(Defines.Jsonkey.CreationTimestamp.getKey(), this.hashCode);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.hashCode);
        parcel.writeString(this.getMin);
        parcel.writeString(this.isInside);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeLong(this.equals);
        parcel.writeInt(this.setMax.ordinal());
        parcel.writeSerializable(this.toIntRange);
        parcel.writeParcelable(this.toFloatRange, i);
        parcel.writeInt(this.IsOverlapping.ordinal());
    }

    private BranchUniversalObject(Parcel parcel) {
        this();
        this.hashCode = parcel.readLong();
        this.getMin = parcel.readString();
        this.isInside = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.readString();
        this.equals = parcel.readLong();
        this.setMax = CONTENT_INDEX_MODE.values()[parcel.readInt()];
        ArrayList arrayList = (ArrayList) parcel.readSerializable();
        if (arrayList != null) {
            this.toIntRange.addAll(arrayList);
        }
        this.toFloatRange = (ContentMetadata) parcel.readParcelable(ContentMetadata.class.getClassLoader());
        this.IsOverlapping = CONTENT_INDEX_MODE.values()[parcel.readInt()];
    }

    public final setRightButtonView length(@NonNull setRightButtonView setrightbuttonview, @NonNull LinkProperties linkProperties) {
        if (linkProperties.getMin != null) {
            setrightbuttonview.setMax(linkProperties.getMin);
        }
        if (linkProperties.setMax != null) {
            setrightbuttonview.setMax(linkProperties.setMax);
        }
        if (linkProperties.length != null) {
            setrightbuttonview.setMin(linkProperties.length);
        }
        if (linkProperties.IsOverlapping != null) {
            setrightbuttonview.length(linkProperties.IsOverlapping);
        }
        if (linkProperties.setMin != null) {
            setrightbuttonview.getMax(linkProperties.setMin);
        }
        if (linkProperties.equals != null) {
            setrightbuttonview.getMin(linkProperties.equals);
        }
        if (linkProperties.getMax > 0) {
            setrightbuttonview.setMin(linkProperties.getMax);
        }
        if (!TextUtils.isEmpty(this.length)) {
            setrightbuttonview.length(Defines.Jsonkey.ContentTitle.getKey(), this.length);
        }
        if (!TextUtils.isEmpty(this.getMin)) {
            setrightbuttonview.length(Defines.Jsonkey.CanonicalIdentifier.getKey(), this.getMin);
        }
        if (!TextUtils.isEmpty(this.isInside)) {
            setrightbuttonview.length(Defines.Jsonkey.CanonicalUrl.getKey(), this.isInside);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.toIntRange.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        if (jSONArray.length() > 0) {
            setrightbuttonview.length(Defines.Jsonkey.ContentKeyWords.getKey(), jSONArray);
        }
        if (!TextUtils.isEmpty(this.getMax)) {
            setrightbuttonview.length(Defines.Jsonkey.ContentDesc.getKey(), this.getMax);
        }
        if (!TextUtils.isEmpty(this.setMin)) {
            setrightbuttonview.length(Defines.Jsonkey.ContentImgUrl.getKey(), this.setMin);
        }
        if (this.equals > 0) {
            String key = Defines.Jsonkey.ContentExpiryTime.getKey();
            StringBuilder sb = new StringBuilder("");
            sb.append(this.equals);
            setrightbuttonview.length(key, sb.toString());
        }
        String key2 = Defines.Jsonkey.PublicallyIndexable.getKey();
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(setMax());
        setrightbuttonview.length(key2, sb2.toString());
        JSONObject length2 = this.toFloatRange.length();
        try {
            Iterator<String> keys = length2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                setrightbuttonview.length(next, length2.get(next));
            }
        } catch (JSONException unused) {
        }
        HashMap<String, String> hashMap = linkProperties.toIntRange;
        for (String next2 : hashMap.keySet()) {
            setrightbuttonview.length(next2, hashMap.get(next2));
        }
        return setrightbuttonview;
    }
}
