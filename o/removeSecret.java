package o;

import io.split.android.client.storage.legacy.IStorage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class removeSecret implements IStorage {
    protected final File _dataFolder;

    public removeSecret(@NotNull File file, @NotNull String str) {
        File file2 = new File(file, str);
        this._dataFolder = file2;
        if (!file2.exists() && !this._dataFolder.mkdir()) {
            createLoadingDialog.e("There was a problem creating Split cache folder");
        }
    }

    public String read(String str) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this._dataFolder, str));
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        return sb.toString();
                    }
                    sb.append(new String(bArr, 0, read));
                } catch (IOException e) {
                    createLoadingDialog.e(e, "Can't read file", new Object[0]);
                    throw e;
                }
            }
        } catch (FileNotFoundException e2) {
            createLoadingDialog.d(e2.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean write(java.lang.String r6, java.lang.String r7) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to stop file"
            java.lang.String r1 = "Failed to write content"
            java.io.File r2 = new java.io.File
            java.io.File r3 = r5._dataFolder
            r2.<init>(r3, r6)
            r6 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0030 }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0030 }
            byte[] r7 = r7.getBytes()     // Catch:{ FileNotFoundException -> 0x002b, IOException -> 0x0028, all -> 0x0025 }
            r4.write(r7)     // Catch:{ FileNotFoundException -> 0x002b, IOException -> 0x0028, all -> 0x0025 }
            r4.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0023
        L_0x001d:
            r7 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            o.createLoadingDialog.e(r7, r0, r6)
        L_0x0023:
            r6 = 1
            return r6
        L_0x0025:
            r7 = move-exception
            r3 = r4
            goto L_0x003e
        L_0x0028:
            r7 = move-exception
            r3 = r4
            goto L_0x0031
        L_0x002b:
            r7 = move-exception
            r3 = r4
            goto L_0x0038
        L_0x002e:
            r7 = move-exception
            goto L_0x003e
        L_0x0030:
            r7 = move-exception
        L_0x0031:
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x002e }
            o.createLoadingDialog.e(r7, r1, r2)     // Catch:{ all -> 0x002e }
            throw r7     // Catch:{ all -> 0x002e }
        L_0x0037:
            r7 = move-exception
        L_0x0038:
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x002e }
            o.createLoadingDialog.e(r7, r1, r2)     // Catch:{ all -> 0x002e }
            throw r7     // Catch:{ all -> 0x002e }
        L_0x003e:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r1 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            o.createLoadingDialog.e(r1, r0, r6)
        L_0x004a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeSecret.write(java.lang.String, java.lang.String):boolean");
    }

    public void delete(String str) {
        if (!new File(this._dataFolder, str).delete()) {
            createLoadingDialog.e("There was a problem removing Split cache file");
        }
    }

    public void delete(List<String> list) {
        for (String delete : list) {
            delete(delete);
        }
    }

    public String[] getAllIds() {
        File[] listFiles = new File(this._dataFolder, ".").listFiles();
        if (listFiles == null) {
            return new String[0];
        }
        String[] strArr = new String[listFiles.length];
        int i = 0;
        for (File name : listFiles) {
            strArr[i] = name.getName();
            i++;
        }
        return strArr;
    }

    public List<String> getAllIds(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : getAllIds()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public boolean rename(String str, String str2) {
        return new File(this._dataFolder, str).renameTo(new File(this._dataFolder, str2));
    }

    public boolean exists(String str) {
        return new File(this._dataFolder, str).exists();
    }

    public long lastModified(String str) {
        File file = new File(this._dataFolder, str);
        if (!file.exists()) {
            return 0;
        }
        return file.lastModified();
    }

    public long fileSize(String str) {
        return new File(this._dataFolder, str).length();
    }
}
