package o;

import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

final class findPartiallyOrCompletelyInvisibleChildClosestToStart {
    private long getMax;
    private Random getMin = new Random();
    private long length;
    private String setMax;
    private long setMin;

    findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        setMin();
    }

    /* access modifiers changed from: protected */
    public final void setMin() {
        this.getMax = 0;
        this.length = 0;
        this.setMax = Long.toHexString(new Random().nextLong());
        this.setMin = System.currentTimeMillis() / 1000;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject getMax(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.getMin.nextLong()));
            jSONObject.put("$mp_session_id", this.setMax);
            jSONObject.put("$mp_session_seq_id", z ? this.getMax : this.length);
            jSONObject.put("$mp_session_start_sec", this.setMin);
            if (z) {
                this.getMax++;
            } else {
                this.length++;
            }
        } catch (JSONException unused) {
            String str = recycleByLayoutState.length;
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
        return jSONObject;
    }
}
