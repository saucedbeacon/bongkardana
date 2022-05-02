package o;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import io.split.android.client.SplitManager;
import io.split.android.client.dtos.Split;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class getStaticKeyEncryptComp implements SplitManager {
    private ImmutableMap<String, Split> mFeatureToTreatmentMap;
    private dynamicDecryptByteArrayDDp mLocalhostGrammar = new dynamicDecryptByteArrayDDp();

    public final void destroy() {
    }

    public getStaticKeyEncryptComp(ImmutableMap<String, Split> immutableMap) {
        this.mFeatureToTreatmentMap = immutableMap;
    }

    public final List<IAtlasEncryptComponent> splits() {
        return getSplitViews((String) null);
    }

    public final List<String> splitNames() {
        HashSet hashSet = new HashSet();
        UnmodifiableIterator<String> it = this.mFeatureToTreatmentMap.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(this.mLocalhostGrammar.getSplitName(it.next()));
        }
        return new ArrayList(hashSet);
    }

    public final IAtlasEncryptComponent split(String str) {
        List<IAtlasEncryptComponent> splitViews = getSplitViews(str);
        if (splitViews.size() > 0) {
            return splitViews.get(0);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void updateSplitsMap(ImmutableMap<String, Split> immutableMap) {
        this.mFeatureToTreatmentMap = immutableMap;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final ImmutableMap<String, Split> featureToTreatmentMap() {
        return this.mFeatureToTreatmentMap;
    }

    private IAtlasEncryptComponent toSplitView(Split split, List<String> list) {
        IAtlasEncryptComponent iAtlasEncryptComponent = new IAtlasEncryptComponent();
        iAtlasEncryptComponent.name = split.name;
        iAtlasEncryptComponent.killed = false;
        iAtlasEncryptComponent.trafficType = null;
        iAtlasEncryptComponent.changeNumber = 0;
        iAtlasEncryptComponent.treatments = new ArrayList();
        if (!(split == null || list == null)) {
            iAtlasEncryptComponent.treatments.addAll(list);
        }
        iAtlasEncryptComponent.configs = split.configurations != null ? split.configurations : new HashMap<>();
        return iAtlasEncryptComponent;
    }

    private List<IAtlasEncryptComponent> getSplitViews(String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        UnmodifiableIterator<Map.Entry<String, Split>> it = this.mFeatureToTreatmentMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            String splitName = this.mLocalhostGrammar.getSplitName((String) next.getKey());
            if (splitName != null && (str == null || str.equals(splitName))) {
                List list = (List) hashMap.get(splitName);
                if (list == null) {
                    Split split = new Split();
                    split.name = splitName;
                    split.defaultTreatment = "control";
                    split.configurations = ((Split) next.getValue()).configurations;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(((Split) next.getValue()).defaultTreatment);
                    hashMap.put(splitName, arrayList);
                    hashMap2.put(splitName, split);
                } else {
                    Split split2 = (Split) hashMap2.get(splitName);
                    Split split3 = (Split) next.getValue();
                    if (split3.configurations != null) {
                        if (split2 != null && split2.configurations == null) {
                            split2.configurations = new HashMap();
                        }
                        split2.configurations.putAll(split3.configurations);
                    }
                    list.add(((Split) next.getValue()).defaultTreatment);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Split split4 : hashMap2.values()) {
            arrayList2.add(toSplitView(split4, (List) hashMap.get(split4.name)));
        }
        return arrayList2;
    }
}
