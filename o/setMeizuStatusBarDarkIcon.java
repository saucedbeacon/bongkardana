package o;

import io.split.android.client.Evaluator;
import java.util.List;
import java.util.Map;

public final class setMeizuStatusBarDarkIcon implements transparentStatusBar {
    private String length;
    private List<String> setMin;

    public setMeizuStatusBarDarkIcon(String str, List<String> list) {
        this.length = str;
        this.setMin = list;
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj == null || !(obj instanceof String)) {
            return false;
        }
        return this.setMin.contains(evaluator.getTreatment((String) obj, str, this.length, map).getTreatment());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("in split \"");
        sb.append(this.length);
        sb.append("\" treatment ");
        sb.append(this.setMin);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            setMeizuStatusBarDarkIcon setmeizustatusbardarkicon = (setMeizuStatusBarDarkIcon) obj;
            String str = this.length;
            if (str == null ? setmeizustatusbardarkicon.length != null : !str.equals(setmeizustatusbardarkicon.length)) {
                return false;
            }
            List<String> list = this.setMin;
            List<String> list2 = setmeizustatusbardarkicon.setMin;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.setMin;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
