package o;

import android.content.Context;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.ap.zoloz.hummer.biz.HummerConstants;
import io.split.android.client.SplitFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.util.concurrent.TimeoutException;

public final class SecurityGuardParamContext {
    public static SplitFactory build(String str, String str2, Context context) throws IOException, InterruptedException, TimeoutException, URISyntaxException {
        return build(str, new IDataCollectionComponent(str2, (String) null), context);
    }

    public static SplitFactory build(String str, IDataCollectionComponent iDataCollectionComponent, Context context) throws IOException, InterruptedException, TimeoutException, URISyntaxException {
        return build(str, iDataCollectionComponent, getPackageValidityCheckComp.builder().build(), context);
    }

    public static synchronized SplitFactory build(String str, IDataCollectionComponent iDataCollectionComponent, getPackageValidityCheckComp getpackagevaliditycheckcomp, Context context) throws IOException, InterruptedException, TimeoutException, URISyntaxException {
        synchronized (SecurityGuardParamContext.class) {
            if ("localhost".equals(str)) {
                getOpenSDKComp createLocalhostSplitFactory = getOpenSDKComp.createLocalhostSplitFactory(iDataCollectionComponent.matchingKey(), context);
                return createLocalhostSplitFactory;
            }
            getGlobalUserData getglobaluserdata = new getGlobalUserData(str, iDataCollectionComponent, getpackagevaliditycheckcomp, context);
            return getglobaluserdata;
        }
    }

    public static SplitFactory local(String str, Context context) throws IOException {
        return getOpenSDKComp.createLocalhostSplitFactory(str, context);
    }

    public static void main(String... strArr) throws IOException, InterruptedException, TimeoutException, URISyntaxException {
        PrintStream printStream;
        if (strArr.length != 1) {
            System.out.println("Usage: <api_token>");
            System.exit(1);
            return;
        }
        getPackageValidityCheckComp build = getPackageValidityCheckComp.builder().build();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (HummerConstants.EXIT_H5_PAGE.equals(readLine)) {
                        System.exit(0);
                    }
                    String[] split = readLine.split(" ");
                    int length = split.length;
                    String str = CameraParams.FLASH_MODE_ON;
                    if (length != 2) {
                        printStream = System.out;
                        str = "Could not understand command";
                    } else {
                        boolean equals = build("API_KEY", new IDataCollectionComponent(split[0], (String) null), build, (Context) null).client().getTreatment(split[1]).equals(str);
                        PrintStream printStream2 = System.out;
                        if (!equals) {
                            str = CameraParams.FLASH_MODE_OFF;
                        }
                        printStream = printStream2;
                    }
                    printStream.println(str);
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            createLoadingDialog.e((Throwable) e);
        }
    }
}
