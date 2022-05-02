package o;

import androidx.annotation.NonNull;
import id.dana.oauth.model.OauthParamsModel;
import java.util.Map;
import java.util.Objects;

public final class showSoftInput {
    public String IsOverlapping;
    public boolean equals;
    public String getMax;
    public String getMin;
    public Map<String, String> isInside;
    public String length;
    public String setMax;
    public String setMin;
    public String toDoubleRange;
    public String toFloatRange;
    public String toIntRange;
    public OauthParamsModel toString;

    public final boolean setMin() {
        return this.equals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            showSoftInput showsoftinput = (showSoftInput) obj;
            return this.equals == showsoftinput.equals && Objects.equals(this.getMin, showsoftinput.getMin) && Objects.equals(this.length, showsoftinput.length) && Objects.equals(this.setMin, showsoftinput.setMin) && Objects.equals(this.getMax, showsoftinput.getMax) && Objects.equals(this.setMax, showsoftinput.setMax) && Objects.equals(this.IsOverlapping, showsoftinput.IsOverlapping) && Objects.equals(this.isInside, showsoftinput.isInside) && Objects.equals(this.toString, showsoftinput.toString) && Objects.equals(this.toDoubleRange, showsoftinput.toDoubleRange);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.getMin, this.length, this.setMin, this.getMax, this.setMax, this.IsOverlapping, Boolean.valueOf(this.equals), this.isInside, this.toString, this.toDoubleRange});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkPayloadModel{fullUrl='");
        sb.append(this.getMin);
        sb.append('\'');
        sb.append(", innerUrl='");
        sb.append(this.length);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.setMin);
        sb.append('\'');
        sb.append(", referralCode='");
        sb.append(this.getMax);
        sb.append('\'');
        sb.append(", shortCode='");
        sb.append(this.setMax);
        sb.append('\'');
        sb.append(", action='");
        sb.append(this.IsOverlapping);
        sb.append('\'');
        sb.append(", skipHomePage=");
        sb.append(this.equals);
        sb.append(", params=");
        sb.append(this.isInside);
        sb.append(", oauthParams=");
        sb.append(this.toString);
        sb.append(", codeValue=");
        sb.append(this.toDoubleRange);
        sb.append('}');
        return sb.toString();
    }
}
