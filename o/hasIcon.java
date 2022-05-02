package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hasIcon {
    public final ArrayList<Transition> getMin = new ArrayList<>();
    public final Map<String, Object> setMax = new HashMap();
    public View setMin;

    @Deprecated
    public hasIcon() {
    }

    public hasIcon(@NonNull View view) {
        this.setMin = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hasIcon)) {
            return false;
        }
        hasIcon hasicon = (hasIcon) obj;
        return this.setMin == hasicon.setMin && this.setMax.equals(hasicon.setMax);
    }

    public int hashCode() {
        return (this.setMin.hashCode() * 31) + this.setMax.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("    view = ");
        sb2.append(this.setMin);
        sb2.append("\n");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("    values:");
        String obj3 = sb3.toString();
        for (String next : this.setMax.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("    ");
            sb4.append(next);
            sb4.append(": ");
            sb4.append(this.setMax.get(next));
            sb4.append("\n");
            obj3 = sb4.toString();
        }
        return obj3;
    }
}
