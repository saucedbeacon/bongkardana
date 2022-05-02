package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class getLogs implements Serializable {
    private static final int FIELDS_STORE_SIZE = 5;
    static final long serialVersionUID = 4174889037736658296L;
    private transient Object[] data;
    private transient Object f0;
    private transient Object f1;
    private transient Object f2;
    private transient Object f3;
    private transient Object f4;
    private boolean sealed;
    private int size;

    public final boolean isSealed() {
        return this.sealed;
    }

    public final void seal() {
        this.sealed = true;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final int size() {
        return this.size;
    }

    public final void setSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (!this.sealed) {
            int i2 = this.size;
            if (i < i2) {
                for (int i3 = i; i3 != i2; i3++) {
                    setImpl(i3, (Object) null);
                }
            } else if (i > i2 && i > 5) {
                ensureCapacity(i);
            }
            this.size = i;
        } else {
            throw onSeledMutation();
        }
    }

    public final Object get(int i) {
        if (i >= 0 && i < this.size) {
            return getImpl(i);
        }
        throw onInvalidIndex(i, this.size);
    }

    public final void set(int i, Object obj) {
        if (i < 0 || i >= this.size) {
            throw onInvalidIndex(i, this.size);
        } else if (!this.sealed) {
            setImpl(i, obj);
        } else {
            throw onSeledMutation();
        }
    }

    private Object getImpl(int i) {
        if (i == 0) {
            return this.f0;
        }
        if (i == 1) {
            return this.f1;
        }
        if (i == 2) {
            return this.f2;
        }
        if (i == 3) {
            return this.f3;
        }
        if (i != 4) {
            return this.data[i - 5];
        }
        return this.f4;
    }

    private void setImpl(int i, Object obj) {
        if (i == 0) {
            this.f0 = obj;
        } else if (i == 1) {
            this.f1 = obj;
        } else if (i == 2) {
            this.f2 = obj;
        } else if (i == 3) {
            this.f3 = obj;
        } else if (i != 4) {
            this.data[i - 5] = obj;
        } else {
            this.f4 = obj;
        }
    }

    public int indexOf(Object obj) {
        int i = this.size;
        for (int i2 = 0; i2 != i; i2++) {
            Object impl = getImpl(i2);
            if (impl == obj || (impl != null && impl.equals(obj))) {
                return i2;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        int i = this.size;
        while (i != 0) {
            i--;
            Object impl = getImpl(i);
            if (impl == obj || (impl != null && impl.equals(obj))) {
                return i;
            }
        }
        return -1;
    }

    public final Object peek() {
        int i = this.size;
        if (i != 0) {
            return getImpl(i - 1);
        }
        throw onEmptyStackTopRead();
    }

    public final Object pop() {
        Object obj;
        if (!this.sealed) {
            int i = this.size - 1;
            if (i != -1) {
                if (i == 0) {
                    obj = this.f0;
                    this.f0 = null;
                } else if (i == 1) {
                    obj = this.f1;
                    this.f1 = null;
                } else if (i == 2) {
                    obj = this.f2;
                    this.f2 = null;
                } else if (i == 3) {
                    obj = this.f3;
                    this.f3 = null;
                } else if (i != 4) {
                    Object[] objArr = this.data;
                    int i2 = i - 5;
                    obj = objArr[i2];
                    objArr[i2] = null;
                } else {
                    obj = this.f4;
                    this.f4 = null;
                }
                this.size = i;
                return obj;
            }
            throw onEmptyStackTopRead();
        }
        throw onSeledMutation();
    }

    public final void push(Object obj) {
        add(obj);
    }

    public final void add(Object obj) {
        if (!this.sealed) {
            int i = this.size;
            if (i >= 5) {
                ensureCapacity(i + 1);
            }
            this.size = i + 1;
            setImpl(i, obj);
            return;
        }
        throw onSeledMutation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r8 != 4) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.size
            r1 = 1
            if (r8 < 0) goto L_0x006d
            if (r8 > r0) goto L_0x006d
            boolean r2 = r7.sealed
            if (r2 != 0) goto L_0x0068
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 5
            if (r8 == 0) goto L_0x001a
            if (r8 == r1) goto L_0x0024
            if (r8 == r4) goto L_0x002e
            if (r8 == r3) goto L_0x0038
            if (r8 == r2) goto L_0x0042
            goto L_0x004d
        L_0x001a:
            if (r0 != 0) goto L_0x001f
            r7.f0 = r9
            goto L_0x0064
        L_0x001f:
            java.lang.Object r8 = r7.f0
            r7.f0 = r9
            r9 = r8
        L_0x0024:
            if (r0 != r1) goto L_0x0029
            r7.f1 = r9
            goto L_0x0064
        L_0x0029:
            java.lang.Object r8 = r7.f1
            r7.f1 = r9
            r9 = r8
        L_0x002e:
            if (r0 != r4) goto L_0x0033
            r7.f2 = r9
            goto L_0x0064
        L_0x0033:
            java.lang.Object r8 = r7.f2
            r7.f2 = r9
            r9 = r8
        L_0x0038:
            if (r0 != r3) goto L_0x003d
            r7.f3 = r9
            goto L_0x0064
        L_0x003d:
            java.lang.Object r8 = r7.f3
            r7.f3 = r9
            r9 = r8
        L_0x0042:
            if (r0 != r2) goto L_0x0047
            r7.f4 = r9
            goto L_0x0064
        L_0x0047:
            java.lang.Object r8 = r7.f4
            r7.f4 = r9
            r9 = r8
            r8 = 5
        L_0x004d:
            int r2 = r0 + 1
            r7.ensureCapacity(r2)
            if (r8 == r0) goto L_0x005f
            java.lang.Object[] r2 = r7.data
            int r3 = r8 + -5
            int r4 = r3 + 1
            int r6 = r0 - r8
            java.lang.System.arraycopy(r2, r3, r2, r4, r6)
        L_0x005f:
            java.lang.Object[] r2 = r7.data
            int r8 = r8 - r5
            r2[r8] = r9
        L_0x0064:
            int r0 = r0 + r1
            r7.size = r0
            return
        L_0x0068:
            java.lang.RuntimeException r8 = onSeledMutation()
            throw r8
        L_0x006d:
            int r0 = r0 + r1
            java.lang.RuntimeException r8 = onInvalidIndex(r8, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLogs.add(int, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r7 != 4) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void remove(int r7) {
        /*
            r6 = this;
            int r0 = r6.size
            if (r7 < 0) goto L_0x0068
            if (r7 >= r0) goto L_0x0068
            boolean r1 = r6.sealed
            if (r1 != 0) goto L_0x0063
            int r0 = r0 + -1
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r7 == 0) goto L_0x001c
            if (r7 == r4) goto L_0x0025
            if (r7 == r3) goto L_0x002e
            if (r7 == r2) goto L_0x0037
            if (r7 == r1) goto L_0x0040
            goto L_0x004d
        L_0x001c:
            if (r0 != 0) goto L_0x0021
            r6.f0 = r5
            goto L_0x0060
        L_0x0021:
            java.lang.Object r7 = r6.f1
            r6.f0 = r7
        L_0x0025:
            if (r0 != r4) goto L_0x002a
            r6.f1 = r5
            goto L_0x0060
        L_0x002a:
            java.lang.Object r7 = r6.f2
            r6.f1 = r7
        L_0x002e:
            if (r0 != r3) goto L_0x0033
            r6.f2 = r5
            goto L_0x0060
        L_0x0033:
            java.lang.Object r7 = r6.f3
            r6.f2 = r7
        L_0x0037:
            if (r0 != r2) goto L_0x003c
            r6.f3 = r5
            goto L_0x0060
        L_0x003c:
            java.lang.Object r7 = r6.f4
            r6.f3 = r7
        L_0x0040:
            if (r0 != r1) goto L_0x0045
            r6.f4 = r5
            goto L_0x0060
        L_0x0045:
            java.lang.Object[] r7 = r6.data
            r1 = 0
            r7 = r7[r1]
            r6.f4 = r7
            r7 = 5
        L_0x004d:
            if (r7 == r0) goto L_0x005a
            java.lang.Object[] r1 = r6.data
            int r2 = r7 + -5
            int r3 = r2 + 1
            int r7 = r0 - r7
            java.lang.System.arraycopy(r1, r3, r1, r2, r7)
        L_0x005a:
            java.lang.Object[] r7 = r6.data
            int r1 = r0 + -5
            r7[r1] = r5
        L_0x0060:
            r6.size = r0
            return
        L_0x0063:
            java.lang.RuntimeException r7 = onSeledMutation()
            throw r7
        L_0x0068:
            java.lang.RuntimeException r7 = onInvalidIndex(r7, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLogs.remove(int):void");
    }

    public final void clear() {
        if (!this.sealed) {
            int i = this.size;
            for (int i2 = 0; i2 != i; i2++) {
                setImpl(i2, (Object) null);
            }
            this.size = 0;
            return;
        }
        throw onSeledMutation();
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[this.size];
        toArray(objArr, 0);
        return objArr;
    }

    public final void toArray(Object[] objArr) {
        toArray(objArr, 0);
    }

    public final void toArray(Object[] objArr, int i) {
        int i2 = this.size;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                System.arraycopy(this.data, 0, objArr, i + 5, i2 - 5);
                            }
                            objArr[i + 4] = this.f4;
                        }
                        objArr[i + 3] = this.f3;
                    }
                    objArr[i + 2] = this.f2;
                }
                objArr[i + 1] = this.f1;
            }
            objArr[i + 0] = this.f0;
        }
    }

    private void ensureCapacity(int i) {
        int i2 = i - 5;
        if (i2 > 0) {
            Object[] objArr = this.data;
            int i3 = 10;
            if (objArr == null) {
                if (10 >= i2) {
                    i2 = 10;
                }
                this.data = new Object[i2];
                return;
            }
            int length = objArr.length;
            if (length < i2) {
                if (length > 5) {
                    i3 = length * 2;
                }
                if (i3 >= i2) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                int i4 = this.size;
                if (i4 > 5) {
                    System.arraycopy(this.data, 0, objArr2, 0, i4 - 5);
                }
                this.data = objArr2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private static RuntimeException onInvalidIndex(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" ∉ [0, ");
        sb.append(i2);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static RuntimeException onEmptyStackTopRead() {
        throw new RuntimeException("Empty stack");
    }

    private static RuntimeException onSeledMutation() {
        throw new IllegalStateException("Attempt to modify sealed array");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int i = this.size;
        for (int i2 = 0; i2 != i; i2++) {
            objectOutputStream.writeObject(getImpl(i2));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i = this.size;
        if (i > 5) {
            this.data = new Object[(i - 5)];
        }
        for (int i2 = 0; i2 != i; i2++) {
            setImpl(i2, objectInputStream.readObject());
        }
    }
}
