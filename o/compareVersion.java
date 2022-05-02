package o;

import java.util.List;
import java.util.Map;

public interface compareVersion {
    <T> T deserialize(String str, Class<T> cls);

    List<String> deserializeList(String str);

    Map<String, String> deserializeMap(String str);

    String serialize(Object obj);

    String serialize(Object obj, Class cls);
}
