package com.alipay.imobile.network.quake.transport;

import com.alipay.imobile.network.quake.Request;

public interface Transporter {
    void submitRequest(Request request, TransporterCallBack transporterCallBack);
}
