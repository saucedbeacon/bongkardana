package com.facebook.flipper.core;

import com.facebook.flipper.core.FlipperArray;
import java.util.Arrays;
import o.onStopJob;
import org.json.JSONException;
import org.json.JSONObject;

public class FlipperObject {
    public final JSONObject setMax;

    public FlipperObject(JSONObject jSONObject) {
        this.setMax = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public FlipperObject(String str) {
        try {
            this.setMax = new JSONObject(str);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.setMax.toString();
    }

    public boolean equals(Object obj) {
        return this.setMax.toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.setMax.hashCode();
    }

    public static class setMax {
        public final JSONObject getMax = new JSONObject();

        public final setMax setMax(String str, Object obj) {
            if (obj == null) {
                return getMax(str, (String) null);
            }
            if (obj instanceof Integer) {
                return getMin(str, (Integer) obj);
            }
            if (obj instanceof Long) {
                return length(str, (Long) obj);
            }
            if (obj instanceof Float) {
                return setMax(str, (Float) obj);
            }
            if (obj instanceof Double) {
                return length(str, (Double) obj);
            }
            if (obj instanceof String) {
                return getMax(str, (String) obj);
            }
            if (obj instanceof Boolean) {
                return getMin(str, (Boolean) obj);
            }
            if (obj instanceof Object[]) {
                return getMax(str, Arrays.deepToString((Object[]) obj));
            }
            if (obj instanceof FlipperObject) {
                return setMax(str, (FlipperObject) obj);
            }
            if (obj instanceof setMax) {
                return setMax(str, new FlipperObject(((setMax) obj).getMax));
            }
            if (obj instanceof FlipperArray) {
                return getMin(str, (FlipperArray) obj);
            }
            if (obj instanceof FlipperArray.getMax) {
                return getMin(str, new FlipperArray(((FlipperArray.getMax) obj).getMax));
            }
            if (obj instanceof onStopJob) {
                return setMax(str, ((onStopJob) obj).setMax());
            }
            return getMax(str, obj.toString());
        }

        public final setMax getMax(String str, String str2) {
            try {
                this.getMax.put(str, str2);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public final setMax getMin(String str, Integer num) {
            try {
                this.getMax.put(str, num);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public final setMax length(String str, Long l) {
            try {
                this.getMax.put(str, l);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        private setMax setMax(String str, Float f) {
            try {
                JSONObject jSONObject = this.getMax;
                if (Float.isNaN(f.floatValue())) {
                    f = null;
                }
                jSONObject.put(str, f);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        private setMax length(String str, Double d) {
            try {
                JSONObject jSONObject = this.getMax;
                if (Double.isNaN(d.doubleValue())) {
                    d = null;
                }
                jSONObject.put(str, d);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public final setMax getMin(String str, Boolean bool) {
            try {
                this.getMax.put(str, bool);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public final setMax getMin(String str, FlipperArray flipperArray) {
            try {
                this.getMax.put(str, flipperArray == null ? null : flipperArray.setMax);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public final setMax setMax(String str, FlipperObject flipperObject) {
            try {
                this.getMax.put(str, flipperObject == null ? null : flipperObject.setMax);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
