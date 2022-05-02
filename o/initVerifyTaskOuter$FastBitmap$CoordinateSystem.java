package o;

import java.util.LinkedHashSet;
import java.util.Set;
import org.yaml.snakeyaml.error.YAMLException;

public class initVerifyTaskOuter$FastBitmap$CoordinateSystem implements DeviceIdProvider {
    final /* synthetic */ initVerifyTaskOuter length;

    public initVerifyTaskOuter$FastBitmap$CoordinateSystem(initVerifyTaskOuter initverifytaskouter) {
        this.length = initverifytaskouter;
    }

    public final Object setMax(getLanguage getlanguage) {
        if (!getlanguage.setMax()) {
            return this.length.setMax((getLayoutType) getlanguage);
        }
        if (this.length.setMax.containsKey(getlanguage)) {
            return this.length.setMax.get(getlanguage);
        }
        return new LinkedHashSet(((getLayoutType) getlanguage).getMin.size());
    }

    public final void setMax(getLanguage getlanguage, Object obj) {
        if (getlanguage.setMax()) {
            this.length.getMax((getLayoutType) getlanguage, (Set) obj);
            return;
        }
        throw new YAMLException("Unexpected recursive set structure. Node: ".concat(String.valueOf(getlanguage)));
    }
}
