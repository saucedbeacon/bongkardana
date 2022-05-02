package o;

import android.content.Context;
import android.nfc.NfcAdapter;

public final class clearTmpDetachFlag {
    public static clearTmpDetachFlag getMax;
    public Context getMin;
    public isBound length;
    private NfcAdapter setMax;
    public String setMin;

    public final boolean setMin(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.setMax = defaultAdapter;
        this.getMin = context;
        return defaultAdapter != null;
    }
}
