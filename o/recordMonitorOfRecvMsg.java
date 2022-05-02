package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class recordMonitorOfRecvMsg extends AbstractList<printConnMonitorLog> implements RandomAccess {
    final int[] setMax;
    final printConnMonitorLog[] setMin;

    private recordMonitorOfRecvMsg(printConnMonitorLog[] printconnmonitorlogArr, int[] iArr) {
        this.setMin = printconnmonitorlogArr;
        this.setMax = iArr;
    }

    public static recordMonitorOfRecvMsg length(printConnMonitorLog... printconnmonitorlogArr) {
        if (printconnmonitorlogArr.length == 0) {
            return new recordMonitorOfRecvMsg(new printConnMonitorLog[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(printconnmonitorlogArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, printconnmonitorlogArr[i2]), Integer.valueOf(i2));
        }
        if (((printConnMonitorLog) arrayList.get(0)).size() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                printConnMonitorLog printconnmonitorlog = (printConnMonitorLog) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    printConnMonitorLog printconnmonitorlog2 = (printConnMonitorLog) arrayList.get(i5);
                    if (!printconnmonitorlog2.startsWith(printconnmonitorlog)) {
                        continue;
                        break;
                    } else if (printconnmonitorlog2.size() == printconnmonitorlog.size()) {
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(printconnmonitorlog2)));
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            submitLazy submitlazy = new submitLazy();
            setMax(0, submitlazy, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i6 = (int) (submitlazy.setMax / 4);
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = submitlazy.toIntRange();
            }
            if (submitlazy.setMax()) {
                return new recordMonitorOfRecvMsg((printConnMonitorLog[]) printconnmonitorlogArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    private static void setMax(long j, submitLazy submitlazy, int i, List<printConnMonitorLog> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        submitLazy submitlazy2;
        submitLazy submitlazy3 = submitlazy;
        int i7 = i;
        List<printConnMonitorLog> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (list3.get(i10).size() >= i7) {
                    i10++;
                } else {
                    throw new AssertionError();
                }
            }
            printConnMonitorLog printconnmonitorlog = list.get(i2);
            printConnMonitorLog printconnmonitorlog2 = list3.get(i9 - 1);
            int i11 = -1;
            if (i7 == printconnmonitorlog.size()) {
                i11 = list4.get(i8).intValue();
                i8++;
                printconnmonitorlog = list3.get(i8);
            }
            int i12 = i8;
            long j2 = 4;
            if (printconnmonitorlog.getByte(i7) != printconnmonitorlog2.getByte(i7)) {
                int i13 = 1;
                for (int i14 = i12 + 1; i14 < i9; i14++) {
                    if (list3.get(i14 - 1).getByte(i7) != list3.get(i14).getByte(i7)) {
                        i13++;
                    }
                }
                long j3 = j + ((long) ((int) (submitlazy3.setMax / 4))) + 2 + ((long) (i13 * 2));
                submitlazy3.toIntRange(i13);
                submitlazy3.toIntRange(i11);
                for (int i15 = i12; i15 < i9; i15++) {
                    byte b = list3.get(i15).getByte(i7);
                    if (i15 == i12 || b != list3.get(i15 - 1).getByte(i7)) {
                        submitlazy3.toIntRange((int) b & 255);
                    }
                }
                submitLazy submitlazy4 = new submitLazy();
                int i16 = i12;
                while (i16 < i9) {
                    byte b2 = list3.get(i16).getByte(i7);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i9) {
                            i5 = i9;
                            break;
                        } else if (b2 != list3.get(i18).getByte(i7)) {
                            i5 = i18;
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i17 == i5 && i7 + 1 == list3.get(i16).size()) {
                        submitlazy3.toIntRange(list4.get(i16).intValue());
                        i6 = i5;
                        submitlazy2 = submitlazy4;
                    } else {
                        submitlazy3.toIntRange((int) ((((long) ((int) (submitlazy4.setMax / j2))) + j3) * -1));
                        i6 = i5;
                        submitlazy2 = submitlazy4;
                        setMax(j3, submitlazy4, i7 + 1, list, i16, i5, list2);
                    }
                    submitlazy4 = submitlazy2;
                    i16 = i6;
                    j2 = 4;
                }
                submitLazy submitlazy5 = submitlazy4;
                submitlazy3.setMin(submitlazy5, submitlazy5.setMax);
                return;
            }
            int i19 = 0;
            int min = Math.min(printconnmonitorlog.size(), printconnmonitorlog2.size());
            int i20 = i7;
            while (i20 < min && printconnmonitorlog.getByte(i20) == printconnmonitorlog2.getByte(i20)) {
                i19++;
                i20++;
            }
            long j4 = 1 + j + ((long) ((int) (submitlazy3.setMax / 4))) + 2 + ((long) i19);
            submitlazy3.toIntRange(-i19);
            submitlazy3.toIntRange(i11);
            int i21 = i7;
            while (true) {
                i4 = i7 + i19;
                if (i21 >= i4) {
                    break;
                }
                submitlazy3.toIntRange((int) printconnmonitorlog.getByte(i21) & 255);
                i21++;
            }
            if (i12 + 1 != i9) {
                submitLazy submitlazy6 = new submitLazy();
                submitlazy3.toIntRange((int) ((((long) ((int) (submitlazy6.setMax / 4))) + j4) * -1));
                setMax(j4, submitlazy6, i4, list, i12, i3, list2);
                submitlazy3.setMin(submitlazy6, submitlazy6.setMax);
            } else if (i4 == list3.get(i12).size()) {
                submitlazy3.toIntRange(list4.get(i12).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public final int size() {
        return this.setMin.length;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.setMin[i];
    }
}
