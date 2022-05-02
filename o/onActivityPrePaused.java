package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class onActivityPrePaused {
    public static TypeAdapter length(Gson gson, TypeToken typeToken, Object obj) {
        Type type;
        Type type2 = typeToken.getType();
        if (obj == null || (type2 != Object.class && !(type2 instanceof TypeVariable) && !(type2 instanceof Class))) {
            type = type2;
        } else {
            type = obj.getClass();
        }
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get(type));
        if (type2 != type && !setMin(adapter)) {
            TypeAdapter adapter2 = gson.getAdapter(typeToken);
            if (setMin(adapter2)) {
                return adapter2;
            }
        }
        return adapter;
    }

    private static boolean setMin(TypeAdapter typeAdapter) {
        return !(typeAdapter instanceof registerIn) && !(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter);
    }

    public static TypeAdapter setMin(Gson gson, Class cls, Object obj) {
        Class cls2;
        if (obj == null || (cls != Object.class && !(cls instanceof Class))) {
            cls2 = cls;
        } else {
            cls2 = obj.getClass();
        }
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get((Type) cls2));
        if (cls != cls2 && !setMin(adapter)) {
            TypeAdapter adapter2 = gson.getAdapter(cls);
            if (setMin(adapter2)) {
                return adapter2;
            }
        }
        return adapter;
    }
}
