package o;

import android.content.Context;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final class Blur implements convertSpToPx {
    protected getMax length;

    public /* synthetic */ Blur(getMax getmax, byte b) {
        this(getmax);
    }

    private Blur(getMax getmax) {
        this.length = getmax;
    }

    public final void length() {
        BlurProcess.getMax(this);
    }

    public final String setMax() {
        getMax getmax = this.length;
        return getmax != null ? getmax.getMax : "";
    }

    public final Context getMin() {
        getMax getmax = this.length;
        if (getmax != null) {
            return getmax.setMin;
        }
        return null;
    }

    public final String setMin() {
        return this.length.length;
    }

    public final String getMax() {
        return this.length.getMin;
    }

    public final JSONObject isInside() {
        getMax getmax = this.length;
        if (getmax != null) {
            return getmax.setMax;
        }
        return new JSONObject();
    }

    public static class getMax {
        public String getMax;
        String getMin;
        String length;
        public JSONObject setMax = new JSONObject();
        Context setMin;

        public getMax(Context context) {
            this.setMin = context;
        }

        public final getMax getMin(String str, String str2) {
            try {
                this.setMax.put(str, str2);
            } catch (JSONException e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
            }
            return this;
        }
    }
}
