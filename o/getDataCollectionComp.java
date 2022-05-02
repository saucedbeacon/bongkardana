package o;

import io.split.android.client.Evaluator;
import io.split.android.client.dtos.ConditionType;
import io.split.android.client.dtos.Partition;
import io.split.android.client.exceptions.ChangeNumberExceptionWrapper;
import io.split.android.client.storage.splits.SplitsStorage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.f;

public final class getDataCollectionComp implements Evaluator {
    private final setTransparentForImageViewInFragment mSplitParser;
    private final SplitsStorage mSplitsStorage;

    public getDataCollectionComp(SplitsStorage splitsStorage, setTransparentForImageViewInFragment settransparentforimageviewinfragment) {
        this.mSplitsStorage = splitsStorage;
        this.mSplitParser = settransparentforimageviewinfragment;
    }

    public final getDynamicDataStoreComp getTreatment(String str, String str2, String str3, Map<String, Object> map) {
        try {
            setLightMode max = this.mSplitParser.setMax(this.mSplitsStorage.get(str3));
            if (max == null) {
                return new getDynamicDataStoreComp("control", "definition not found");
            }
            return getTreatment(str, str2, max, map);
        } catch (ChangeNumberExceptionWrapper e) {
            createLoadingDialog.e(e, "Catch Change Number Exception", new Object[0]);
            return new getDynamicDataStoreComp("control", "exception");
        } catch (Exception e2) {
            createLoadingDialog.e(e2, "Catch All Exception", new Object[0]);
            return new getDynamicDataStoreComp("control", "exception");
        }
    }

    private getDynamicDataStoreComp getTreatment(String str, String str2, setLightMode setlightmode, Map<String, Object> map) throws ChangeNumberExceptionWrapper {
        String str3;
        try {
            if (setlightmode.length()) {
                return new getDynamicDataStoreComp(setlightmode.setMin, "killed", Long.valueOf(setlightmode.toFloatRange), configForTreatment(setlightmode, setlightmode.setMin));
            }
            String str4 = str2 == null ? str : str2;
            int i = 0;
            boolean z = false;
            for (setTransparent next : setlightmode.length) {
                if (!z && next.getMin == ConditionType.ROLLOUT) {
                    if (setlightmode.toIntRange < 100 && ((int) (Math.abs(f.a.setMin(str4, setlightmode.IsOverlapping, setlightmode.isInside) % 100) + 1)) > setlightmode.toIntRange) {
                        return new getDynamicDataStoreComp(setlightmode.setMin, "not in split", Long.valueOf(setlightmode.toFloatRange), configForTreatment(setlightmode, setlightmode.setMin));
                    }
                    z = true;
                }
                if (next.getMax.getMax(str, str2, map, this)) {
                    int i2 = setlightmode.getMin;
                    List<Partition> list = next.length;
                    int i3 = setlightmode.isInside;
                    if (!list.isEmpty()) {
                        if (!f.a.length(list)) {
                            int abs = (int) (Math.abs(f.a.setMin(str4, i2, i3) % 100) + 1);
                            Iterator<Partition> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Partition next2 = it.next();
                                i += next2.size;
                                if (i >= abs) {
                                    str3 = next2.treatment;
                                    break;
                                }
                            }
                        } else {
                            str3 = list.get(0).treatment;
                        }
                        return new getDynamicDataStoreComp(str3, next.setMax, Long.valueOf(setlightmode.toFloatRange), configForTreatment(setlightmode, str3));
                    }
                    str3 = "control";
                    return new getDynamicDataStoreComp(str3, next.setMax, Long.valueOf(setlightmode.toFloatRange), configForTreatment(setlightmode, str3));
                }
            }
            return new getDynamicDataStoreComp(setlightmode.setMin, "default rule", Long.valueOf(setlightmode.toFloatRange), configForTreatment(setlightmode, setlightmode.setMin));
        } catch (Exception e) {
            throw new ChangeNumberExceptionWrapper(e, setlightmode.toFloatRange);
        }
    }

    private String configForTreatment(setLightMode setlightmode, String str) {
        if (setlightmode.equals != null) {
            return setlightmode.equals.get(str);
        }
        return null;
    }
}
