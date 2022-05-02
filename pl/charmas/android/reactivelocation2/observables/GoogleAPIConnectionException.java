package pl.charmas.android.reactivelocation2.observables;

import com.google.android.gms.common.ConnectionResult;

public class GoogleAPIConnectionException extends RuntimeException {
    private final ConnectionResult connectionResult;

    public GoogleAPIConnectionException(String str, ConnectionResult connectionResult2) {
        super(str);
        this.connectionResult = connectionResult2;
    }

    public ConnectionResult getConnectionResult() {
        return this.connectionResult;
    }
}
