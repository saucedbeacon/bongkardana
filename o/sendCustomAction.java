package o;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

final class sendCustomAction {

    interface length {
        boolean getMin(String str, PackageManager packageManager, setRepeatMode setrepeatmode) throws IOException, PackageManager.NameNotFoundException;
    }

    @RequiresApi(28)
    static class getMin implements length {
        getMin() {
        }

        @Nullable
        public List<byte[]> getMax(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature min : signingInfo.getApkContentsSigners()) {
                    arrayList.add(sendCustomAction.setMin(min));
                }
            } else {
                arrayList.add(sendCustomAction.setMin(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        public boolean getMin(String str, PackageManager packageManager, setRepeatMode setrepeatmode) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> max;
            setrepeatmode.getMin();
            if (setrepeatmode.getMin == null) {
                throw new IllegalStateException();
            } else if (!setrepeatmode.getMin.equals(str) || (max = getMax(str, packageManager)) == null) {
                return false;
            } else {
                if (max.size() == 1) {
                    return packageManager.hasSigningCertificate(str, setrepeatmode.setMin(), 1);
                }
                return setrepeatmode.equals(new setRepeatMode(setRepeatMode.getMin(str, max), str, max));
            }
        }
    }

    static class setMax implements length {
        setMax() {
        }

        public final boolean getMin(String str, PackageManager packageManager, setRepeatMode setrepeatmode) throws IOException, PackageManager.NameNotFoundException {
            setrepeatmode.getMin();
            if (setrepeatmode.getMin == null) {
                throw new IllegalStateException();
            } else if (!str.equals(setrepeatmode.getMin)) {
                return false;
            } else {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
                Signature[] signatureArr = packageInfo.signatures;
                int length = signatureArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    byte[] min = sendCustomAction.setMin(signatureArr[i]);
                    if (min == null) {
                        arrayList = null;
                        break;
                    }
                    arrayList.add(min);
                    i++;
                }
                if (arrayList == null) {
                    return false;
                }
                return setrepeatmode.equals(new setRepeatMode(setRepeatMode.getMin(str, arrayList), str, arrayList));
            }
        }
    }

    @Nullable
    static byte[] setMin(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static boolean getMax(String str, PackageManager packageManager, setRepeatMode setrepeatmode) {
        length length2;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                length2 = new getMin();
            } else {
                length2 = new setMax();
            }
            return length2.getMin(str, packageManager, setrepeatmode);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}
