package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

public abstract class onRetainNonConfigurationInstance {
    public static int getMin = -1;
    int getMax;
    int length;
    String setMax = null;
    protected int setMin;
    HashMap<String, ConstraintAttribute> toIntRange;

    public void getMax(HashMap<String, Integer> hashMap) {
    }

    /* access modifiers changed from: package-private */
    public abstract void getMax(HashSet<String> hashSet);

    /* access modifiers changed from: package-private */
    public abstract void getMin(Context context, AttributeSet attributeSet);

    public abstract void length(HashMap<String, startIntentSenderForResult> hashMap);

    public onRetainNonConfigurationInstance() {
        int i = getMin;
        this.length = i;
        this.getMax = i;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(String str) {
        String str2 = this.setMax;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }
}
