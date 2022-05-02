package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class switchOff implements Serializable {
    private static final int A = -1640531527;
    private static final int DELETED = -2;
    private static final int EMPTY = -1;
    private static final boolean check = false;
    static final long serialVersionUID = 4242698212885848444L;
    private transient int ivaluesShift;
    private int keyCount;
    private transient int[] keys;
    private transient int occupiedCount;
    private int power;
    private transient Object[] values;

    private static int tableLookupStep(int i, int i2, int i3) {
        int i4 = 32 - (i3 * 2);
        if (i4 >= 0) {
            i >>>= i4;
        } else {
            i2 >>>= -i4;
        }
        return (i & i2) | 1;
    }

    public switchOff() {
        this(4);
    }

    public switchOff(int i) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int i2 = 2;
        while ((1 << i2) < (i * 4) / 3) {
            i2++;
        }
        this.power = i2;
    }

    public boolean isEmpty() {
        return this.keyCount == 0;
    }

    public int size() {
        return this.keyCount;
    }

    public boolean has(int i) {
        if (i < 0) {
            getStyleId.setMin();
        }
        return findIndex(i) >= 0;
    }

    public Object getObject(int i) {
        int findIndex;
        if (i < 0) {
            getStyleId.setMin();
        }
        if (this.values == null || (findIndex = findIndex(i)) < 0) {
            return null;
        }
        return this.values[findIndex];
    }

    public int getInt(int i, int i2) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int findIndex = findIndex(i);
        if (findIndex < 0) {
            return i2;
        }
        int i3 = this.ivaluesShift;
        if (i3 != 0) {
            return this.keys[i3 + findIndex];
        }
        return 0;
    }

    public int getExistingInt(int i) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int findIndex = findIndex(i);
        if (findIndex >= 0) {
            int i2 = this.ivaluesShift;
            if (i2 != 0) {
                return this.keys[i2 + findIndex];
            }
            return 0;
        }
        getStyleId.setMin();
        return 0;
    }

    public void put(int i, Object obj) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int ensureIndex = ensureIndex(i, false);
        if (this.values == null) {
            this.values = new Object[(1 << this.power)];
        }
        this.values[ensureIndex] = obj;
    }

    public void put(int i, int i2) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int ensureIndex = ensureIndex(i, true);
        if (this.ivaluesShift == 0) {
            int i3 = 1 << this.power;
            int[] iArr = this.keys;
            int i4 = i3 * 2;
            if (iArr.length != i4) {
                int[] iArr2 = new int[i4];
                System.arraycopy(iArr, 0, iArr2, 0, i3);
                this.keys = iArr2;
            }
            this.ivaluesShift = i3;
        }
        this.keys[this.ivaluesShift + ensureIndex] = i2;
    }

    public void remove(int i) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int findIndex = findIndex(i);
        if (findIndex >= 0) {
            this.keys[findIndex] = -2;
            this.keyCount--;
            Object[] objArr = this.values;
            if (objArr != null) {
                objArr[findIndex] = null;
            }
            int i2 = this.ivaluesShift;
            if (i2 != 0) {
                this.keys[i2 + findIndex] = 0;
            }
        }
    }

    public void clear() {
        int i = 1 << this.power;
        if (this.keys != null) {
            for (int i2 = 0; i2 != i; i2++) {
                this.keys[i2] = -1;
            }
            if (this.values != null) {
                for (int i3 = 0; i3 != i; i3++) {
                    this.values[i3] = null;
                }
            }
        }
        this.ivaluesShift = 0;
        this.keyCount = 0;
        this.occupiedCount = 0;
    }

    public int[] getKeys() {
        int[] iArr = this.keys;
        int i = this.keyCount;
        int[] iArr2 = new int[i];
        int i2 = 0;
        while (i != 0) {
            int i3 = iArr[i2];
            if (!(i3 == -1 || i3 == -2)) {
                i--;
                iArr2[i] = i3;
            }
            i2++;
        }
        return iArr2;
    }

    private int findIndex(int i) {
        int i2;
        int[] iArr = this.keys;
        if (iArr != null) {
            int i3 = A * i;
            int i4 = this.power;
            int i5 = i3 >>> (32 - i4);
            int i6 = iArr[i5];
            if (i6 == i) {
                return i5;
            }
            if (i6 != -1) {
                int i7 = (1 << i4) - 1;
                int tableLookupStep = tableLookupStep(i3, i7, i4);
                do {
                    i5 = (i5 + tableLookupStep) & i7;
                    i2 = iArr[i5];
                    if (i2 == i) {
                        return i5;
                    }
                } while (i2 != -1);
            }
        }
        return -1;
    }

    private int insertNewKey(int i) {
        int[] iArr = this.keys;
        int i2 = A * i;
        int i3 = this.power;
        int i4 = i2 >>> (32 - i3);
        if (iArr[i4] != -1) {
            int i5 = (1 << i3) - 1;
            int tableLookupStep = tableLookupStep(i2, i5, i3);
            do {
                i4 = (i4 + tableLookupStep) & i5;
            } while (iArr[i4] != -1);
        }
        iArr[i4] = i;
        this.occupiedCount++;
        this.keyCount++;
        return i4;
    }

    private void rehashTable(boolean z) {
        if (this.keys != null && this.keyCount * 2 >= this.occupiedCount) {
            this.power++;
        }
        int i = 1 << this.power;
        int[] iArr = this.keys;
        int i2 = this.ivaluesShift;
        if (i2 != 0 || z) {
            this.ivaluesShift = i;
            this.keys = new int[(i * 2)];
        } else {
            this.keys = new int[i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 != i; i4++) {
            this.keys[i4] = -1;
        }
        Object[] objArr = this.values;
        if (objArr != null) {
            this.values = new Object[i];
        }
        int i5 = this.keyCount;
        this.occupiedCount = 0;
        if (i5 != 0) {
            this.keyCount = 0;
            while (i5 != 0) {
                int i6 = iArr[i3];
                if (!(i6 == -1 || i6 == -2)) {
                    int insertNewKey = insertNewKey(i6);
                    if (objArr != null) {
                        this.values[insertNewKey] = objArr[i3];
                    }
                    if (i2 != 0) {
                        this.keys[this.ivaluesShift + insertNewKey] = iArr[i2 + i3];
                    }
                    i5--;
                }
                i3++;
            }
        }
    }

    private int ensureIndex(int i, boolean z) {
        int i2;
        int i3;
        int[] iArr = this.keys;
        int i4 = -1;
        if (iArr != null) {
            int i5 = A * i;
            i2 = i5 >>> (32 - this.power);
            int i6 = iArr[i2];
            if (i6 == i) {
                return i2;
            }
            if (i6 != -1) {
                int i7 = i6 == -2 ? i2 : -1;
                int i8 = this.power;
                int i9 = (1 << i8) - 1;
                int tableLookupStep = tableLookupStep(i5, i9, i8);
                do {
                    i2 = (i2 + tableLookupStep) & i9;
                    i3 = iArr[i2];
                    if (i3 == i) {
                        return i2;
                    }
                    if (i3 == -2 && i7 < 0) {
                        i7 = i2;
                        continue;
                    }
                } while (i3 != -1);
                i4 = i7;
            }
        } else {
            i2 = -1;
        }
        if (i4 < 0) {
            if (iArr != null) {
                int i10 = this.occupiedCount;
                if (i10 * 4 < (1 << this.power) * 3) {
                    this.occupiedCount = i10 + 1;
                    i4 = i2;
                }
            }
            rehashTable(z);
            return insertNewKey(i);
        }
        iArr[i4] = i;
        this.keyCount++;
        return i4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int i = this.keyCount;
        if (i != 0) {
            boolean z = true;
            int i2 = 0;
            boolean z2 = this.ivaluesShift != 0;
            if (this.values == null) {
                z = false;
            }
            objectOutputStream.writeBoolean(z2);
            objectOutputStream.writeBoolean(z);
            while (i != 0) {
                int i3 = this.keys[i2];
                if (!(i3 == -1 || i3 == -2)) {
                    i--;
                    objectOutputStream.writeInt(i3);
                    if (z2) {
                        objectOutputStream.writeInt(this.keys[this.ivaluesShift + i2]);
                    }
                    if (z) {
                        objectOutputStream.writeObject(this.values[i2]);
                    }
                }
                i2++;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i = this.keyCount;
        if (i != 0) {
            this.keyCount = 0;
            boolean readBoolean = objectInputStream.readBoolean();
            boolean readBoolean2 = objectInputStream.readBoolean();
            int i2 = 1 << this.power;
            if (readBoolean) {
                this.keys = new int[(i2 * 2)];
                this.ivaluesShift = i2;
            } else {
                this.keys = new int[i2];
            }
            for (int i3 = 0; i3 != i2; i3++) {
                this.keys[i3] = -1;
            }
            if (readBoolean2) {
                this.values = new Object[i2];
            }
            for (int i4 = 0; i4 != i; i4++) {
                int insertNewKey = insertNewKey(objectInputStream.readInt());
                if (readBoolean) {
                    this.keys[this.ivaluesShift + insertNewKey] = objectInputStream.readInt();
                }
                if (readBoolean2) {
                    this.values[insertNewKey] = objectInputStream.readObject();
                }
            }
        }
    }
}
