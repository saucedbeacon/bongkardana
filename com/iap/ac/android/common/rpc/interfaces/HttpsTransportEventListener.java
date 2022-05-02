package com.iap.ac.android.common.rpc.interfaces;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

public interface HttpsTransportEventListener {
    void onConnect(HttpsURLConnection httpsURLConnection) throws SSLException;
}
