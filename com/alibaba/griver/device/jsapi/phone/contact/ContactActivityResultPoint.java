package com.alibaba.griver.device.jsapi.phone.contact;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class ContactActivityResultPoint implements ActivityResultPoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10721) {
            return;
        }
        if (i2 == -1) {
            try {
                a(intent.getData());
            } catch (SecurityException unused) {
                ContactUtils.setResultAccount(new ContactAccount());
            } catch (Exception unused2) {
                ContactUtils.setResultAccount(new ContactAccount());
            }
        } else {
            ContactUtils.setResultAccount((ContactAccount) null);
        }
    }

    private void a(Uri uri) {
        Activity activity;
        Cursor query;
        ContactAccount contactAccount = new ContactAccount();
        if (!(uri == null || (activity = ContactUtils.getActivity()) == null || (query = activity.getContentResolver().query(uri, new String[]{"data1", "display_name"}, (String) null, (String[]) null, (String) null)) == null)) {
            try {
                if (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("data1"));
                    String string2 = query.getString(query.getColumnIndex("display_name"));
                    if (string != null) {
                        contactAccount.name = string2;
                        contactAccount.phoneNumber = string;
                    }
                }
            } catch (Throwable th) {
                RVLogger.e("ContactActivityResultPoint", "processSystemContactCallback ".concat(String.valueOf(uri)), th);
                if (query != null) {
                    query.close();
                }
            }
        }
        ContactUtils.setResultAccount(contactAccount);
    }
}
