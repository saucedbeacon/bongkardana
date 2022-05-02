package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

public final class ArgumentList extends ArrayList<TypeArgumentMarker> implements TypeArgumentListMarker {
    public ArgumentList(int i) {
        super(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof TypeArgumentMarker)) {
            return false;
        }
        return contains((TypeArgumentMarker) obj);
    }

    public final /* bridge */ boolean contains(TypeArgumentMarker typeArgumentMarker) {
        return super.contains(typeArgumentMarker);
    }

    public final int getSize() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof TypeArgumentMarker)) {
            return -1;
        }
        return indexOf((TypeArgumentMarker) obj);
    }

    public final /* bridge */ int indexOf(TypeArgumentMarker typeArgumentMarker) {
        return super.indexOf(typeArgumentMarker);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof TypeArgumentMarker)) {
            return -1;
        }
        return lastIndexOf((TypeArgumentMarker) obj);
    }

    public final /* bridge */ int lastIndexOf(TypeArgumentMarker typeArgumentMarker) {
        return super.lastIndexOf(typeArgumentMarker);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof TypeArgumentMarker)) {
            return false;
        }
        return remove((TypeArgumentMarker) obj);
    }

    public final /* bridge */ boolean remove(TypeArgumentMarker typeArgumentMarker) {
        return super.remove(typeArgumentMarker);
    }

    public final int size() {
        return getSize();
    }
}
