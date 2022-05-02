package com.zoloz.rpccommon;

import java.util.HashMap;

public class NetRequest {
    public int ID;
    public String api;
    public HashMap<String, String> headers;
    public byte[] requestBody;
    public String url;

    public static NetRequest build(int i, String str, String str2, HashMap<String, String> hashMap, byte[] bArr) {
        NetRequest netRequest = new NetRequest();
        netRequest.ID = i;
        netRequest.url = str;
        netRequest.api = str2;
        netRequest.headers = hashMap;
        netRequest.requestBody = bArr;
        return netRequest;
    }
}
