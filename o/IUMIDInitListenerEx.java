package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class IUMIDInitListenerEx {
    private static final Gson _json = new GsonBuilder().serializeNulls().create();

    public static String toJson(Object obj) {
        return _json.toJson(obj);
    }

    public static <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        return _json.fromJson(str, type);
    }

    public static <T> List<T> fromJsonList(String str, Class<T> cls) throws JsonSyntaxException {
        return (List) new Gson().fromJson(str, new TypeToken<ArrayList<T>>() {
        }.getType());
    }

    public static <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return _json.fromJson(str, cls);
    }
}
