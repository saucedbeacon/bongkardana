package o;

import javax.annotation.Nullable;

public final class insert<E> extends IconCompat<E> {
    private final IconCompat<E> length;
    private final IconCompat<E> setMin;

    protected insert(IconCompat<E> iconCompat, IconCompat<E> iconCompat2) {
        this.setMin = iconCompat;
        this.length = iconCompat2;
    }

    public final void setMax(E e) {
        this.setMin.setMax(e);
        this.length.setMax(e);
    }

    public final boolean setMax(@Nullable IconCompat iconCompat) {
        if (this == iconCompat) {
            return true;
        }
        if (iconCompat == null || iconCompat.getClass() != getClass()) {
            return false;
        }
        insert insert = (insert) iconCompat;
        return this.setMin.setMax((IconCompat) insert.setMin) && this.length.setMax((IconCompat) insert.length);
    }
}
