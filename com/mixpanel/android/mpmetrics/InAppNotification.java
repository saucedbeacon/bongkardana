package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.assertNotInLayoutOrScroll;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.setInitialPrefetchItemCount;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class InAppNotification implements Parcelable {
    private static final Pattern equals = Pattern.compile("(\\.[^./]+$)");
    public final int IsOverlapping;
    protected final JSONObject getMax;
    protected final int getMin;
    public Bitmap isInside;
    protected final JSONObject length;
    protected final int setMax;
    public final int setMin;
    public final String toFloatRange;
    public final String toIntRange;
    private final List<DisplayTrigger> toString;

    public enum Type {
        UNKNOWN {
            public final String toString() {
                return "*unknown_type*";
            }
        },
        MINI {
            public final String toString() {
                return "mini";
            }
        },
        TAKEOVER {
            public final String toString() {
                return "takeover";
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public abstract Type getMax();

    public InAppNotification() {
        this.length = null;
        this.getMax = null;
        this.getMin = 0;
        this.setMax = 0;
        this.setMin = 0;
        this.toFloatRange = null;
        this.IsOverlapping = 0;
        this.toIntRange = null;
        this.toString = null;
    }

    public InAppNotification(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
            try {
                jSONObject3 = new JSONObject(parcel.readString());
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                jSONObject = jSONObject2;
                this.length = jSONObject;
                this.getMax = jSONObject3;
                this.getMin = parcel.readInt();
                this.setMax = parcel.readInt();
                this.setMin = parcel.readInt();
                this.toFloatRange = parcel.readString();
                this.IsOverlapping = parcel.readInt();
                this.toIntRange = parcel.readString();
                this.isInside = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
                ArrayList arrayList = new ArrayList();
                this.toString = arrayList;
                parcel.readList(arrayList, (ClassLoader) null);
            }
        } catch (JSONException unused2) {
            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            jSONObject = jSONObject2;
            this.length = jSONObject;
            this.getMax = jSONObject3;
            this.getMin = parcel.readInt();
            this.setMax = parcel.readInt();
            this.setMin = parcel.readInt();
            this.toFloatRange = parcel.readString();
            this.IsOverlapping = parcel.readInt();
            this.toIntRange = parcel.readString();
            this.isInside = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
            ArrayList arrayList2 = new ArrayList();
            this.toString = arrayList2;
            parcel.readList(arrayList2, (ClassLoader) null);
        }
        this.length = jSONObject;
        this.getMax = jSONObject3;
        this.getMin = parcel.readInt();
        this.setMax = parcel.readInt();
        this.setMin = parcel.readInt();
        this.toFloatRange = parcel.readString();
        this.IsOverlapping = parcel.readInt();
        this.toIntRange = parcel.readString();
        this.isInside = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        ArrayList arrayList22 = new ArrayList();
        this.toString = arrayList22;
        parcel.readList(arrayList22, (ClassLoader) null);
    }

    InAppNotification(JSONObject jSONObject) throws assertNotInLayoutOrScroll {
        String str;
        this.toString = new ArrayList();
        try {
            this.length = jSONObject;
            this.getMax = jSONObject.getJSONObject("extras");
            this.getMin = jSONObject.getInt("id");
            this.setMax = jSONObject.getInt(Constants.MessagePayloadKeys.MSGID_SERVER);
            this.setMin = jSONObject.getInt("bg_color");
            if (!jSONObject.has(TtmlNode.TAG_BODY) || jSONObject.isNull(TtmlNode.TAG_BODY)) {
                str = null;
            } else {
                str = jSONObject.getString(TtmlNode.TAG_BODY);
            }
            this.toFloatRange = str;
            this.IsOverlapping = jSONObject.optInt("body_color");
            this.toIntRange = jSONObject.getString("image_url");
            this.isInside = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
            JSONArray optJSONArray = jSONObject.optJSONArray("display_triggers");
            int i = 0;
            while (optJSONArray != null && i < optJSONArray.length()) {
                this.toString.add(new DisplayTrigger(optJSONArray.getJSONObject(i)));
                i++;
            }
        } catch (JSONException e) {
            throw new assertNotInLayoutOrScroll("Notification JSON was unexpected or bad", e);
        }
    }

    public final JSONObject length() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaign_id", this.getMin);
            jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, this.setMax);
            jSONObject.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, "inapp");
            jSONObject.put("message_subtype", getMax().toString());
        } catch (JSONException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
        return jSONObject;
    }

    public final int setMin() {
        return this.getMin;
    }

    public final boolean setMax() {
        return this.toFloatRange != null;
    }

    public final boolean getMin() {
        List<DisplayTrigger> list = this.toString;
        return list != null && !list.isEmpty();
    }

    public final boolean getMax(setInitialPrefetchItemCount.getMax getmax) {
        if (!getMin()) {
            return false;
        }
        for (DisplayTrigger max : this.toString) {
            if (max.setMax(getmax)) {
                return true;
            }
        }
        return false;
    }

    public static String getMin(String str, String str2) {
        Matcher matcher = equals.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("$1");
        return matcher.replaceFirst(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final JSONObject equals() {
        return this.getMax;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.length.toString());
        parcel.writeString(this.getMax.toString());
        parcel.writeInt(this.getMin);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.setMin);
        parcel.writeString(this.toFloatRange);
        parcel.writeInt(this.IsOverlapping);
        parcel.writeString(this.toIntRange);
        parcel.writeParcelable(this.isInside, i);
        parcel.writeList(this.toString);
    }

    public String toString() {
        return this.length.toString();
    }
}
