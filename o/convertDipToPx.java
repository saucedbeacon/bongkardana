package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.DanaApplication;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class convertDipToPx {
    public length length;

    public /* synthetic */ convertDipToPx(length length2, byte b) {
        this(length2);
    }

    private convertDipToPx(length length2) {
        this.length = length2;
    }

    public static class length {
        public String getMax;
        /* access modifiers changed from: private */
        public List<convertSpToPx> length;
        private Context setMax;
        private UIPropUtil setMin;

        public static length setMin(Context context) {
            return new length(context);
        }

        public length(Context context) {
            this.setMax = context;
            UIPropUtil uIPropUtil = new UIPropUtil();
            this.setMin = uIPropUtil;
            if (context != null) {
                uIPropUtil.setMin = context;
            }
        }

        public final length length(Map<String, String> map) {
            this.setMin.getMax(map);
            return this;
        }

        public final length setMax(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.setMin.getMax.put(str, str2);
                } catch (JSONException e) {
                    updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
                }
            }
            return this;
        }

        public final length getMax(String str, int i) {
            UIPropUtil uIPropUtil = this.setMin;
            try {
                uIPropUtil.getMax.put(str, Integer.valueOf(i));
            } catch (JSONException e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
            }
            return this;
        }

        public final length setMin(String str, boolean z) {
            UIPropUtil uIPropUtil = this.setMin;
            try {
                uIPropUtil.getMax.put(str, Boolean.valueOf(z));
            } catch (JSONException e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
            }
            return this;
        }

        public final length setMax() {
            Context context = this.setMax;
            if (context instanceof DanaApplication) {
                try {
                    this.setMin.getMax.put(TrackerKey.Property.NETWORK_TYPE, onBluetoothCharacteristicValueChange.formatConnectionType(((DanaApplication) context).getNetworkType()));
                } catch (JSONException e) {
                    updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
                }
            }
            return this;
        }

        public final void setMin() {
            ArrayList arrayList = new ArrayList();
            this.length = arrayList;
            arrayList.addAll(putTypeface.setMin(this.setMax, this.getMax, this.setMin));
        }
    }
}
