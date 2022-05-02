package o;

import io.split.android.client.dtos.Split;
import io.split.android.client.localhost.LocalhostFileParser;
import io.split.android.client.storage.legacy.IStorage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class dynamicEncryptByteArrayDDp implements LocalhostFileParser {
    private static final String CONFIG_FIELD = "config";
    private static final String KEYS_FIELD = "keys";
    private static final String TREATMENT_FIELD = "treatment";
    private IStorage mFileStorage;
    private dynamicDecryptByteArrayDDp mLocalhostGrammar = new dynamicDecryptByteArrayDDp();

    public dynamicEncryptByteArrayDDp(IStorage iStorage) {
        this.mFileStorage = iStorage;
    }

    public final Map<String, Split> parse(String str) {
        HashMap hashMap = null;
        try {
            try {
                List<Map> list = (List) new setColorNoTranslucent().parse(this.mFileStorage.read(str));
                if (list == null) {
                    createLoadingDialog.e("Split file could not be parser because it is not in the correct format.");
                    return null;
                }
                HashMap hashMap2 = new HashMap();
                try {
                    for (Map map : list) {
                        Object[] array = map.keySet().toArray();
                        if (array != null && array.length > 0) {
                            String str2 = (String) array[0];
                            Map map2 = (Map) map.get(str2);
                            if (map2 != null) {
                                List<String> parseKeys = parseKeys(map2.get(KEYS_FIELD));
                                int size = parseKeys != null ? parseKeys.size() : 1;
                                for (int i = 0; i < size; i++) {
                                    Split split = new Split();
                                    split.name = this.mLocalhostGrammar.buildSplitKeyName(str2, parseKeys != null ? parseKeys.get(i) : null);
                                    split.defaultTreatment = (String) map2.get(TREATMENT_FIELD);
                                    if (split.defaultTreatment == null) {
                                        StringBuilder sb = new StringBuilder("Parsing Localhost Split ");
                                        sb.append(split.name);
                                        sb.append("does not have a treatment value. Using control");
                                        createLoadingDialog.e(sb.toString());
                                        split.defaultTreatment = "control";
                                    }
                                    String str3 = (String) map2.get("config");
                                    if (str3 != null) {
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put(split.defaultTreatment, str3);
                                        split.configurations = hashMap3;
                                    }
                                    hashMap2.put(split.name, split);
                                }
                            }
                        }
                    }
                    return hashMap2;
                } catch (Exception unused) {
                    hashMap = hashMap2;
                    createLoadingDialog.e("An error has ocurred while parsing localhost splits content");
                    return hashMap;
                }
            } catch (Exception unused2) {
                createLoadingDialog.e("An error has ocurred while parsing localhost splits content");
                return hashMap;
            }
        } catch (IOException unused3) {
            createLoadingDialog.e("Error reading localhost yaml file");
            return null;
        }
    }

    private List<String> parseKeys(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof List) {
                return (ArrayList) obj;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                arrayList2.add((String) obj);
                return arrayList2;
            } catch (ClassCastException unused) {
                arrayList = arrayList2;
            }
        } catch (ClassCastException unused2) {
            return arrayList;
        }
    }
}
