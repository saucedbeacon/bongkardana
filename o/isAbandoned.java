package o;

import android.content.Context;
import android.content.SharedPreferences;

final class isAbandoned {
    final SharedPreferences length;

    isAbandoned(Context context) {
        this.length = context.getSharedPreferences("com.guardsquare.dexguard.runtime.threatcast.ThreatCast", 0);
    }
}
