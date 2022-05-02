package o;

import java.util.LinkedHashMap;
import java.util.Map;

final class getBindingAdapterPosition {
    private final Map<Class<? extends getAbsoluteAdapterPosition>, Map<String, getViewAdapterPosition<?, ?>>> extensionsByName = new LinkedHashMap();
    private final Map<Class<? extends getAbsoluteAdapterPosition>, Map<Integer, getViewAdapterPosition<?, ?>>> extensionsByTag = new LinkedHashMap();

    getBindingAdapterPosition() {
    }

    public final <T extends getAbsoluteAdapterPosition<?>, E> void add(getViewAdapterPosition<T, E> getviewadapterposition) {
        Class<T> extendedType = getviewadapterposition.getExtendedType();
        Map map = this.extensionsByTag.get(extendedType);
        Map map2 = this.extensionsByName.get(extendedType);
        if (map == null) {
            map = new LinkedHashMap();
            map2 = new LinkedHashMap();
            this.extensionsByTag.put(extendedType, map);
            this.extensionsByName.put(extendedType, map2);
        }
        map.put(Integer.valueOf(getviewadapterposition.getTag()), getviewadapterposition);
        map2.put(getviewadapterposition.getName(), getviewadapterposition);
    }

    public final <T extends getAbsoluteAdapterPosition<?>, E> getViewAdapterPosition<T, E> getExtension(Class<T> cls, int i) {
        Map map = this.extensionsByTag.get(cls);
        if (map == null) {
            return null;
        }
        return (getViewAdapterPosition) map.get(Integer.valueOf(i));
    }

    public final <T extends getAbsoluteAdapterPosition<?>, E> getViewAdapterPosition<T, E> getExtension(Class<T> cls, String str) {
        Map map = this.extensionsByName.get(cls);
        if (map == null) {
            return null;
        }
        return (getViewAdapterPosition) map.get(str);
    }
}
