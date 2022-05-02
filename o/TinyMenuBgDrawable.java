package o;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import io.branch.referral.Defines;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

public final class TinyMenuBgDrawable extends JSONObject {
    int IsOverlapping;
    String equals;
    int getMax;
    Collection<String> getMin;
    JSONObject isInside;
    String length;
    String setMax;
    String setMin;
    String toFloatRange;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TinyMenuBgDrawable tinyMenuBgDrawable = (TinyMenuBgDrawable) obj;
        String str = this.setMin;
        if (str == null) {
            if (tinyMenuBgDrawable.setMin != null) {
                return false;
            }
        } else if (!str.equals(tinyMenuBgDrawable.setMin)) {
            return false;
        }
        String str2 = this.setMax;
        if (str2 == null) {
            if (tinyMenuBgDrawable.setMax != null) {
                return false;
            }
        } else if (!str2.equals(tinyMenuBgDrawable.setMax)) {
            return false;
        }
        String str3 = this.length;
        if (str3 == null) {
            if (tinyMenuBgDrawable.length != null) {
                return false;
            }
        } else if (!str3.equals(tinyMenuBgDrawable.length)) {
            return false;
        }
        JSONObject jSONObject = this.isInside;
        if (jSONObject == null) {
            if (tinyMenuBgDrawable.isInside != null) {
                return false;
            }
        } else if (!jSONObject.equals(tinyMenuBgDrawable.isInside)) {
            return false;
        }
        String str4 = this.equals;
        if (str4 == null) {
            if (tinyMenuBgDrawable.equals != null) {
                return false;
            }
        } else if (!str4.equals(tinyMenuBgDrawable.equals)) {
            return false;
        }
        String str5 = this.toFloatRange;
        if (str5 == null) {
            if (tinyMenuBgDrawable.toFloatRange != null) {
                return false;
            }
        } else if (!str5.equals(tinyMenuBgDrawable.toFloatRange)) {
            return false;
        }
        if (this.getMax != tinyMenuBgDrawable.getMax || this.IsOverlapping != tinyMenuBgDrawable.IsOverlapping) {
            return false;
        }
        Collection<String> collection = this.getMin;
        if (collection == null) {
            if (tinyMenuBgDrawable.getMin != null) {
                return false;
            }
        } else if (!collection.toString().equals(tinyMenuBgDrawable.getMin.toString())) {
            return false;
        }
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = (this.getMax + 19) * 19;
        String str = this.setMin;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.toLowerCase().hashCode();
        }
        int i8 = (i6 + i) * 19;
        String str2 = this.setMax;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.toLowerCase().hashCode();
        }
        int i9 = (i8 + i2) * 19;
        String str3 = this.length;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.toLowerCase().hashCode();
        }
        int i10 = (i9 + i3) * 19;
        String str4 = this.equals;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.toLowerCase().hashCode();
        }
        int i11 = (i10 + i4) * 19;
        String str5 = this.toFloatRange;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.toLowerCase().hashCode();
        }
        int i12 = (i11 + i5) * 19;
        JSONObject jSONObject = this.isInside;
        if (jSONObject != null) {
            i7 = jSONObject.toString().toLowerCase().hashCode();
        }
        int i13 = ((i12 + i7) * 19) + this.IsOverlapping;
        Collection<String> collection = this.getMin;
        if (collection != null) {
            for (String lowerCase : collection) {
                i13 = (i13 * 19) + lowerCase.toLowerCase().hashCode();
            }
        }
        return i13;
    }

    public final JSONObject getMax() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.setMax)) {
                StringBuilder sb = new StringBuilder("~");
                sb.append(Defines.LinkParam.Channel.getKey());
                jSONObject.put(sb.toString(), this.setMax);
            }
            if (!TextUtils.isEmpty(this.setMin)) {
                StringBuilder sb2 = new StringBuilder("~");
                sb2.append(Defines.LinkParam.Alias.getKey());
                jSONObject.put(sb2.toString(), this.setMin);
            }
            if (!TextUtils.isEmpty(this.length)) {
                StringBuilder sb3 = new StringBuilder("~");
                sb3.append(Defines.LinkParam.Feature.getKey());
                jSONObject.put(sb3.toString(), this.length);
            }
            if (!TextUtils.isEmpty(this.equals)) {
                StringBuilder sb4 = new StringBuilder("~");
                sb4.append(Defines.LinkParam.Stage.getKey());
                jSONObject.put(sb4.toString(), this.equals);
            }
            if (!TextUtils.isEmpty(this.toFloatRange)) {
                StringBuilder sb5 = new StringBuilder("~");
                sb5.append(Defines.LinkParam.Campaign.getKey());
                jSONObject.put(sb5.toString(), this.toFloatRange);
            }
            if (has(Defines.LinkParam.Tags.getKey())) {
                jSONObject.put(Defines.LinkParam.Tags.getKey(), getJSONArray(Defines.LinkParam.Tags.getKey()));
            }
            StringBuilder sb6 = new StringBuilder("~");
            sb6.append(Defines.LinkParam.Type.getKey());
            jSONObject.put(sb6.toString(), this.getMax);
            StringBuilder sb7 = new StringBuilder("~");
            sb7.append(Defines.LinkParam.Duration.getKey());
            jSONObject.put(sb7.toString(), this.IsOverlapping);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
