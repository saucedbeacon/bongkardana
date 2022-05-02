package o;

import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;

final class setFilter {
    Map<String, String> getMax;
    DumperOptions.Version setMax;

    public setFilter(DumperOptions.Version version, Map<String, String> map) {
        this.setMax = version;
        this.getMax = map;
    }

    public final String toString() {
        return String.format("VersionTagsTuple<%s, %s>", new Object[]{this.setMax, this.getMax});
    }
}
