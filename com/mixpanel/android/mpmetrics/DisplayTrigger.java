package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import o.assertNotInLayoutOrScroll;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.setInitialPrefetchItemCount;
import org.json.JSONException;
import org.json.JSONObject;

class DisplayTrigger implements Parcelable {
    public static final Parcelable.Creator<DisplayTrigger> CREATOR = new Parcelable.Creator<DisplayTrigger>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DisplayTrigger[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DisplayTrigger(parcel);
        }
    };
    private final String getMin;
    private final JSONObject length;
    private final SelectorEvaluator setMin;

    public int describeContents() {
        return 0;
    }

    public DisplayTrigger(JSONObject jSONObject) throws assertNotInLayoutOrScroll {
        try {
            this.getMin = jSONObject.getString("event");
            JSONObject optJSONObject = jSONObject.optJSONObject("selector");
            this.length = optJSONObject;
            this.setMin = optJSONObject != null ? new SelectorEvaluator(optJSONObject) : null;
        } catch (JSONException e) {
            throw new assertNotInLayoutOrScroll("Event triggered notification JSON was unexpected or bad", e);
        }
    }

    public DisplayTrigger(Parcel parcel) {
        JSONObject jSONObject;
        this.getMin = parcel.readString();
        SelectorEvaluator selectorEvaluator = null;
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
            jSONObject = null;
        }
        this.length = jSONObject;
        this.setMin = jSONObject != null ? new SelectorEvaluator(jSONObject) : selectorEvaluator;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.length.toString());
    }

    public final boolean setMax(setInitialPrefetchItemCount.getMax getmax) {
        if (getmax == null || (!this.getMin.equals("$any_event") && !getmax.getMax.equals(this.getMin))) {
            return false;
        }
        SelectorEvaluator selectorEvaluator = this.setMin;
        if (selectorEvaluator == null) {
            return true;
        }
        try {
            return selectorEvaluator.length(getmax.length);
        } catch (Exception unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
            return false;
        }
    }
}
