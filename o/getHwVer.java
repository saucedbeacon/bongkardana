package o;

import org.yaml.snakeyaml.error.YAMLException;

public abstract class getHwVer implements DeviceIdProvider {
    public final void setMax(getLanguage getlanguage, Object obj) {
        if (getlanguage.setMax()) {
            StringBuilder sb = new StringBuilder("Not Implemented in ");
            sb.append(getClass().getName());
            throw new IllegalStateException(sb.toString());
        }
        throw new YAMLException("Unexpected recursive structure for Node: ".concat(String.valueOf(getlanguage)));
    }
}
