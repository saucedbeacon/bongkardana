package com.iap.ac.android.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;

public class ACSecurityData {
    private static final String TAG = "ACSecurityData";
    private IDataEncrypt dataEncrypt;
    private IDataStorage dataStorage;

    private ACSecurityData(IDataStorage iDataStorage, IDataEncrypt iDataEncrypt) {
        this.dataStorage = iDataStorage;
        this.dataEncrypt = iDataEncrypt;
    }

    public static ACSecurityData newInstance(@NonNull IDataStorage iDataStorage, @Nullable IDataEncrypt iDataEncrypt) {
        return new ACSecurityData(iDataStorage, iDataEncrypt);
    }

    public boolean save(String str, String str2) {
        if (this.dataStorage == null) {
            noStorageImplError();
            return false;
        }
        IDataEncrypt iDataEncrypt = this.dataEncrypt;
        if (iDataEncrypt != null) {
            str2 = iDataEncrypt.encrypt(str2);
        } else {
            ACLog.w(TAG, "No implementation of data encryption found. Will not encrypt the data. Please setDataEncrypt if you want to encrypt the data.");
        }
        return this.dataStorage.save(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = r1.dataEncrypt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String get(java.lang.String r2) {
        /*
            r1 = this;
            com.iap.ac.android.common.data.IDataStorage r0 = r1.dataStorage
            if (r0 != 0) goto L_0x0009
            r1.noStorageImplError()
            r2 = 0
            return r2
        L_0x0009:
            java.lang.String r2 = r0.get(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            com.iap.ac.android.common.data.IDataEncrypt r0 = r1.dataEncrypt
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = r0.decrypt(r2)
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.data.ACSecurityData.get(java.lang.String):java.lang.String");
    }

    public boolean delete(String str) {
        IDataStorage iDataStorage = this.dataStorage;
        if (iDataStorage != null) {
            return iDataStorage.delete(str);
        }
        noStorageImplError();
        return false;
    }

    public boolean clear() {
        IDataStorage iDataStorage = this.dataStorage;
        if (iDataStorage != null) {
            return iDataStorage.clear();
        }
        noStorageImplError();
        return false;
    }

    public void setDataEncrypt(IDataEncrypt iDataEncrypt) {
        this.dataEncrypt = iDataEncrypt;
    }

    public void setDataStorage(IDataStorage iDataStorage) {
        this.dataStorage = iDataStorage;
    }

    private void noStorageImplError() {
        ACLog.e(TAG, "No storage implementation found. Please setDataStorage first.");
    }
}
