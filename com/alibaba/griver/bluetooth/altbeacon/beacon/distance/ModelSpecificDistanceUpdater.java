package com.alibaba.griver.bluetooth.altbeacon.beacon.distance;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;

public class ModelSpecificDistanceUpdater extends AsyncTask<Void, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private Exception f10251a = null;
    private String b = null;
    private String c = null;
    private Context d;
    private DistanceConfigFetcher e;
    private CompletionHandler f;

    interface CompletionHandler {
        void onComplete(String str, Exception exc, int i);
    }

    private String e() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public void onPostExecute() {
    }

    public ModelSpecificDistanceUpdater(Context context, String str, CompletionHandler completionHandler) {
        this.d = context;
        this.e = new DistanceConfigFetcher(str, a());
        this.f = completionHandler;
    }

    /* access modifiers changed from: protected */
    public Void doInBackground(Void... voidArr) {
        this.e.request();
        CompletionHandler completionHandler = this.f;
        if (completionHandler == null) {
            return null;
        }
        completionHandler.onComplete(this.e.getResponseString(), this.e.getException(), this.e.getResponseCode());
        return null;
    }

    private String a() {
        StringBuilder sb = new StringBuilder("Android Beacon Library;");
        sb.append(e());
        sb.append(";");
        sb.append(b());
        sb.append(";");
        sb.append(d());
        sb.append(";");
        sb.append(c());
        return sb.toString();
    }

    private String b() {
        return this.d.getPackageName();
    }

    private String c() {
        return AndroidModel.forThisDevice().toString();
    }

    private String d() {
        return Settings.Secure.getString(this.d.getContentResolver(), "android_id");
    }
}
