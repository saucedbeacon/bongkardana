package o;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import io.split.android.client.SplitClient;
import io.split.android.client.SplitFactory;
import io.split.android.client.SplitManager;
import io.split.android.client.dtos.Split;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public final class getOpenSDKComp implements SplitFactory {
    static final String DEFAULT_SPLITS_FILENAME = "splits";
    static final String LOCALHOST = "localhost";
    static final String LOCALHOST_FOLDER = "localhost";
    static final String PROPERTIES_EXTENSION = "properties";
    static final String YAML_EXTENSION = "yaml";
    static final String YML_EXTENSION = "yml";
    private final getSimulatorDetectComp mClient;
    private boolean mIsSdkReady;
    private String mLocalhostFileName;
    private final getStaticKeyEncryptComp mManager;

    public static getOpenSDKComp createLocalhostSplitFactory(String str, Context context) throws IOException {
        return new getOpenSDKComp(str, context);
    }

    public getOpenSDKComp(String str, Context context) throws IOException {
        this(str, context, (String) null);
    }

    @VisibleForTesting
    public getOpenSDKComp(String str, Context context, String str2) throws IOException {
        Map<String, Split> map;
        ImmutableMap<String, Split> immutableMap;
        this.mLocalhostFileName = DEFAULT_SPLITS_FILENAME;
        if (str2 != null) {
            this.mLocalhostFileName = str2;
        }
        String yamlFileName = getYamlFileName(context);
        if (yamlFileName != null) {
            removeSecret removesecret = new removeSecret(context.getCacheDir(), "localhost");
            copyYamlFileResourceToDataFolder(yamlFileName, removesecret, context);
            map = new dynamicEncryptByteArrayDDp(removesecret).parse(yamlFileName);
        } else {
            removeInt removeint = new removeInt(context);
            StringBuilder sb = new StringBuilder();
            sb.append(this.mLocalhostFileName);
            sb.append(".properties");
            map = removeint.parse(sb.toString());
            createLoadingDialog.w("Localhost mode: .split mocks will be deprecated soon in favor of YAML files, which provide more targeting power. Take a look in our documentation.");
        }
        if (map != null) {
            this.mIsSdkReady = true;
            immutableMap = ImmutableMap.copyOf(map);
        } else {
            this.mIsSdkReady = false;
            immutableMap = ImmutableMap.of();
            createLoadingDialog.w("Neither yaml file nor properties were found. Localhost feature map is empty.");
        }
        this.mClient = new getSimulatorDetectComp(this, str, immutableMap);
        this.mManager = new getStaticKeyEncryptComp(immutableMap);
        createLoadingDialog.i("Android SDK initialized!");
    }

    public final SplitClient client() {
        return this.mClient;
    }

    public final SplitManager manager() {
        return this.mManager;
    }

    public final void destroy() {
        this.mClient.updateSplitsMap(ImmutableMap.of());
    }

    public final void flush() {
        this.mClient.flush();
    }

    public final boolean isReady() {
        return this.mIsSdkReady;
    }

    @Deprecated
    public final void updateFeatureToTreatmentMap(Map<String, String> map) {
        ImmutableMap<String, Split> convertFeatureNamesMapToSplits = convertFeatureNamesMapToSplits(map);
        this.mClient.updateSplitsMap(convertFeatureNamesMapToSplits);
        this.mManager.updateSplitsMap(convertFeatureNamesMapToSplits);
    }

    public final void updateSplitsMap(Map<String, Split> map) {
        ImmutableMap<String, Split> copyOf = ImmutableMap.copyOf(map);
        this.mClient.updateSplitsMap(copyOf);
        this.mManager.updateSplitsMap(copyOf);
    }

    private ImmutableMap<String, Split> convertFeatureNamesMapToSplits(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append((String) next.getKey());
                sb.append("/");
                sb.append((String) next.getValue());
                printStream.println(sb.toString());
                if (!(next.getKey() == null || next.getValue() == null)) {
                    Split split = new Split();
                    split.name = (String) next.getKey();
                    split.defaultTreatment = (String) next.getValue();
                    hashMap.put((String) next.getKey(), split);
                }
            }
        }
        return ImmutableMap.copyOf(hashMap);
    }

    private void copyYamlFileResourceToDataFolder(String str, removeSecret removesecret, Context context) {
        try {
            String loadFileContent = new CustomUiImpl().loadFileContent(str, context);
            if (loadFileContent != null) {
                removesecret.write(str, loadFileContent);
            }
        } catch (IOException e) {
            createLoadingDialog.e(e.getLocalizedMessage());
        }
    }

    private String getYamlFileName(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mLocalhostFileName);
        sb.append(".yaml");
        String obj = sb.toString();
        CustomUiImpl customUiImpl = new CustomUiImpl();
        if (customUiImpl.fileExists(obj, context)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mLocalhostFileName);
        sb2.append(".yml");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.mLocalhostFileName);
        sb3.append(".yml");
        if (customUiImpl.fileExists(sb3.toString(), context)) {
            return obj2;
        }
        return null;
    }
}
