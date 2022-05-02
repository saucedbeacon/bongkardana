package com.squareup.wire;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.squareup.wire.ExtendableMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class ExtensionMap<T extends ExtendableMessage<?>> {
    private static final int INITIAL_SIZE = 1;
    private Object[] data;
    private int size;

    public <E> ExtensionMap(Extension<T, E> extension, E e) {
        Object[] objArr = new Object[2];
        this.data = objArr;
        objArr[0] = extension;
        objArr[1] = e;
        this.size = 1;
    }

    public ExtensionMap(ExtensionMap<T> extensionMap) {
        this.data = (Object[]) extensionMap.data.clone();
        this.size = extensionMap.size;
    }

    public final int size() {
        return this.size;
    }

    public final Extension<T, ?> getExtension(int i) {
        if (i >= 0 && i < this.size) {
            return (Extension) this.data[i];
        }
        throw new IndexOutOfBoundsException("".concat(String.valueOf(i)));
    }

    public final Object getExtensionValue(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.size)) {
            return this.data[i2 + i];
        }
        throw new IndexOutOfBoundsException("".concat(String.valueOf(i)));
    }

    public final List<Extension<T, ?>> getExtensions() {
        ArrayList arrayList = new ArrayList(this.size);
        for (int i = 0; i < this.size; i++) {
            arrayList.add((Extension) this.data[i]);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final <E> E get(Extension<T, E> extension) {
        int binarySearch = Arrays.binarySearch(this.data, 0, this.size, extension);
        if (binarySearch < 0) {
            return null;
        }
        return this.data[this.size + binarySearch];
    }

    public final <E> void put(Extension<T, E> extension, E e) {
        int binarySearch = Arrays.binarySearch(this.data, 0, this.size, extension);
        if (binarySearch >= 0) {
            this.data[this.size + binarySearch] = e;
        } else {
            insert(extension, e, -(binarySearch + 1));
        }
    }

    private <E> void insert(Extension<T, E> extension, E e, int i) {
        Object[] objArr = this.data;
        if (objArr.length < (this.size + 1) * 2) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        int i2 = this.size;
        if (i < i2) {
            System.arraycopy(this.data, i2 + i, objArr, i2 + i + 2, i2 - i);
            System.arraycopy(this.data, i, objArr, i + 1, this.size);
        } else {
            System.arraycopy(this.data, i2, objArr, i2 + 1, i2);
        }
        int i3 = this.size + 1;
        this.size = i3;
        this.data = objArr;
        objArr[i] = extension;
        objArr[i3 + i] = e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExtensionMap)) {
            return false;
        }
        ExtensionMap extensionMap = (ExtensionMap) obj;
        if (this.size != extensionMap.size) {
            return false;
        }
        for (int i = 0; i < this.size * 2; i++) {
            if (!this.data[i].equals(extensionMap.data[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.size * 2; i2++) {
            i = (i * 37) + this.data[i2].hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        String str = "";
        int i = 0;
        while (i < this.size) {
            sb.append(str);
            sb.append(((Extension) this.data[i]).getTag());
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(this.data[this.size + i]);
            i++;
            str = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
