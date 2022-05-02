package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class CustomUiImpl {
    private static int getMax = 0;
    private static int length = 1;

    public final String loadFileContent(String str, Context context) throws IOException {
        try {
            AssetManager assets = context.getAssets();
            Object[] objArr = new Object[2];
            boolean z = true;
            objArr[1] = str;
            objArr[0] = assets;
            InputStream inputStream = (InputStream) ((Class) upFrom.setMax(20 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), -1 - ImageFormat.getBitsPerPixel(0), (char) (56349 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
            String convertStreamToString = convertStreamToString(inputStream);
            inputStream.close();
            int i = length + 7;
            getMax = i % 128;
            int i2 = i % 2;
            int i3 = getMax + 77;
            length = i3 % 128;
            if (i3 % 2 == 0) {
                z = false;
            }
            if (!z) {
                int i4 = 10 / 0;
            }
            return convertStreamToString;
        } catch (FileNotFoundException e) {
            createLoadingDialog.e("An error has ocurred: Could not find file ".concat(String.valueOf(str)));
            throw e;
        } catch (IOException e2) {
            createLoadingDialog.e("An error has ocurred: Could not open file ".concat(String.valueOf(str)));
            throw e2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private String convertStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public final boolean fileExists(String str, Context context) {
        String str2;
        try {
            str2 = loadFileContent(str, context);
        } catch (IOException unused) {
            str2 = null;
        }
        return str2 != null;
    }
}
