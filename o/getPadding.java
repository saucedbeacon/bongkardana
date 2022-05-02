package o;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.invalidateDrawable;

public final class getPadding {
    static final setTintList getMin = setMax();
    static final setTintList length = (Build.VERSION.SDK_INT >= 21 ? new setAutoMirrored() : null);
    private static final int[] setMax = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    public interface getMin {
        void getMax(@NonNull Fragment fragment, @NonNull StringRes stringRes);

        void setMin(@NonNull Fragment fragment, @NonNull StringRes stringRes);
    }

    private static setTintList setMax() {
        try {
            return (setTintList) Class.forName("o.checkLayoutParams").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x01bf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getMin(@androidx.annotation.NonNull android.content.Context r34, @androidx.annotation.NonNull o.jumpToCurrentState r35, java.util.ArrayList<o.setColorFilter> r36, java.util.ArrayList<java.lang.Boolean> r37, int r38, int r39, boolean r40, o.getPadding.getMin r41) {
        /*
            r0 = r36
            r1 = r37
            r2 = r39
            r3 = r40
            r4 = r41
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r6 = r38
        L_0x0011:
            if (r6 >= r2) goto L_0x002f
            java.lang.Object r7 = r0.get(r6)
            o.setColorFilter r7 = (o.setColorFilter) r7
            java.lang.Object r8 = r1.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0029
            getMax(r7, r5, r3)
            goto L_0x002c
        L_0x0029:
            getMin((o.setColorFilter) r7, (android.util.SparseArray<o.getPadding.getMax>) r5, (boolean) r3)
        L_0x002c:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x002f:
            int r6 = r5.size()
            if (r6 == 0) goto L_0x03ea
            android.view.View r6 = new android.view.View
            r7 = r34
            r6.<init>(r7)
            int r15 = r5.size()
            r13 = 0
        L_0x0041:
            if (r13 >= r15) goto L_0x03ea
            int r7 = r5.keyAt(r13)
            r12 = r38
            o.PlaybackStateCompat r11 = setMin(r7, r0, r1, r12, r2)
            java.lang.Object r8 = r5.valueAt(r13)
            r10 = r8
            o.getPadding$getMax r10 = (o.getPadding.getMax) r10
            boolean r8 = r35.setMin()
            if (r8 == 0) goto L_0x03d0
            r9 = r35
            android.view.View r7 = r9.getMin(r7)
            r8 = r7
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 == 0) goto L_0x03d0
            r20 = 0
            if (r3 == 0) goto L_0x0221
            androidx.fragment.app.Fragment r7 = r10.setMin
            androidx.fragment.app.Fragment r14 = r10.setMax
            o.setTintList r0 = setMax(r14, r7)
            if (r0 == 0) goto L_0x0217
            boolean r1 = r10.length
            boolean r2 = r10.getMax
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r29 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r7 != 0) goto L_0x0088
            r9 = r20
            goto L_0x0099
        L_0x0088:
            if (r1 == 0) goto L_0x008f
            java.lang.Object r16 = r7.getReenterTransition()
            goto L_0x0093
        L_0x008f:
            java.lang.Object r16 = r7.getEnterTransition()
        L_0x0093:
            r9 = r16
            java.lang.Object r9 = r0.setMin((java.lang.Object) r9)
        L_0x0099:
            if (r14 != 0) goto L_0x009e
            r2 = r20
            goto L_0x00ad
        L_0x009e:
            if (r2 == 0) goto L_0x00a5
            java.lang.Object r2 = r14.getReturnTransition()
            goto L_0x00a9
        L_0x00a5:
            java.lang.Object r2 = r14.getExitTransition()
        L_0x00a9:
            java.lang.Object r2 = r0.setMin((java.lang.Object) r2)
        L_0x00ad:
            androidx.fragment.app.Fragment r12 = r10.setMin
            r30 = r13
            androidx.fragment.app.Fragment r13 = r10.setMax
            r31 = r15
            if (r12 == 0) goto L_0x00bf
            android.view.View r15 = r12.requireView()
            r4 = 0
            r15.setVisibility(r4)
        L_0x00bf:
            if (r12 == 0) goto L_0x0164
            if (r13 != 0) goto L_0x00c5
            goto L_0x0164
        L_0x00c5:
            boolean r4 = r10.length
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x00d2
            r16 = r1
            r15 = r20
            goto L_0x00d8
        L_0x00d2:
            java.lang.Object r15 = getMin((o.setTintList) r0, (androidx.fragment.app.Fragment) r12, (androidx.fragment.app.Fragment) r13, (boolean) r4)
            r16 = r1
        L_0x00d8:
            o.PlaybackStateCompat r1 = getMin((o.setTintList) r0, (o.PlaybackStateCompat<java.lang.String, java.lang.String>) r11, (java.lang.Object) r15, (o.getPadding.getMax) r10)
            r17 = r7
            o.PlaybackStateCompat r7 = setMax((o.setTintList) r0, (o.PlaybackStateCompat<java.lang.String, java.lang.String>) r11, (java.lang.Object) r15, (o.getPadding.getMax) r10)
            boolean r18 = r11.isEmpty()
            if (r18 == 0) goto L_0x00f5
            if (r1 == 0) goto L_0x00ed
            r1.clear()
        L_0x00ed:
            if (r7 == 0) goto L_0x00f2
            r7.clear()
        L_0x00f2:
            r15 = r20
            goto L_0x0107
        L_0x00f5:
            r18 = r15
            java.util.Set r15 = r11.keySet()
            getMin((java.util.ArrayList<android.view.View>) r5, (o.PlaybackStateCompat<java.lang.String, android.view.View>) r1, (java.util.Collection<java.lang.String>) r15)
            java.util.Collection r15 = r11.values()
            getMin((java.util.ArrayList<android.view.View>) r3, (o.PlaybackStateCompat<java.lang.String, android.view.View>) r7, (java.util.Collection<java.lang.String>) r15)
            r15 = r18
        L_0x0107:
            if (r9 != 0) goto L_0x0112
            if (r2 != 0) goto L_0x0112
            if (r15 != 0) goto L_0x0112
            r33 = r3
        L_0x010f:
            r32 = r11
            goto L_0x016b
        L_0x0112:
            getMax(r12, r13, r4, r1)
            if (r15 == 0) goto L_0x0147
            r3.add(r6)
            r0.setMax((java.lang.Object) r15, (android.view.View) r6, (java.util.ArrayList<android.view.View>) r5)
            r32 = r11
            boolean r11 = r10.getMax
            r33 = r3
            o.setColorFilter r3 = r10.toIntRange
            r21 = r0
            r22 = r15
            r23 = r2
            r24 = r1
            r25 = r11
            r26 = r3
            getMin(r21, r22, r23, r24, r25, r26)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r20 = setMax((o.PlaybackStateCompat<java.lang.String, android.view.View>) r7, (o.getPadding.getMax) r10, (java.lang.Object) r9, (boolean) r4)
            if (r20 == 0) goto L_0x0142
            r0.length((java.lang.Object) r9, (android.graphics.Rect) r1)
        L_0x0142:
            r28 = r1
            r26 = r20
            goto L_0x014f
        L_0x0147:
            r33 = r3
            r32 = r11
            r26 = r20
            r28 = r26
        L_0x014f:
            o.getPadding$4 r1 = new o.getPadding$4
            r21 = r1
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r7
            r27 = r0
            r21.<init>(r23, r24, r25, r26, r27, r28)
            o.getMenuInflater.getMin(r8, r1)
            goto L_0x016d
        L_0x0164:
            r16 = r1
            r33 = r3
            r17 = r7
            goto L_0x010f
        L_0x016b:
            r15 = r20
        L_0x016d:
            if (r9 != 0) goto L_0x0178
            if (r15 != 0) goto L_0x0178
            if (r2 == 0) goto L_0x0174
            goto L_0x0178
        L_0x0174:
            r13 = r41
            goto L_0x0214
        L_0x0178:
            java.util.ArrayList r1 = length(r0, r2, r14, r5, r6)
            r3 = r17
            r4 = r33
            java.util.ArrayList r7 = length(r0, r9, r3, r4, r6)
            r10 = 4
            setMin((java.util.ArrayList<android.view.View>) r7, (int) r10)
            r21 = r0
            r22 = r9
            r23 = r2
            r24 = r15
            r25 = r3
            r26 = r16
            java.lang.Object r3 = setMin(r21, r22, r23, r24, r25, r26)
            if (r14 == 0) goto L_0x01bb
            if (r1 == 0) goto L_0x01bb
            int r10 = r1.size()
            if (r10 > 0) goto L_0x01a8
            int r10 = r5.size()
            if (r10 <= 0) goto L_0x01bb
        L_0x01a8:
            o.StringRes r10 = new o.StringRes
            r10.<init>()
            r13 = r41
            r13.getMax(r14, r10)
            o.getPadding$1 r11 = new o.getPadding$1
            r11.<init>(r14, r10)
            r0.getMax(r14, r3, r10, r11)
            goto L_0x01bd
        L_0x01bb:
            r13 = r41
        L_0x01bd:
            if (r3 == 0) goto L_0x0214
            if (r14 == 0) goto L_0x01e4
            if (r2 == 0) goto L_0x01e4
            boolean r10 = r14.mAdded
            if (r10 == 0) goto L_0x01e4
            boolean r10 = r14.mHidden
            if (r10 == 0) goto L_0x01e4
            boolean r10 = r14.mHiddenChanged
            if (r10 == 0) goto L_0x01e4
            r10 = 1
            r14.setHideReplaced(r10)
            android.view.View r10 = r14.getView()
            r0.getMax((java.lang.Object) r2, (android.view.View) r10, (java.util.ArrayList<android.view.View>) r1)
            android.view.ViewGroup r10 = r14.mContainer
            o.getPadding$3 r11 = new o.getPadding$3
            r11.<init>(r1)
            o.getMenuInflater.getMin(r10, r11)
        L_0x01e4:
            java.util.ArrayList r20 = r0.setMin((java.util.ArrayList<android.view.View>) r4)
            r21 = r0
            r22 = r3
            r23 = r9
            r24 = r7
            r25 = r2
            r26 = r1
            r27 = r15
            r28 = r4
            r21.length(r22, r23, r24, r25, r26, r27, r28)
            r0.setMax((android.view.ViewGroup) r8, (java.lang.Object) r3)
            r16 = r0
            r17 = r8
            r18 = r5
            r19 = r4
            r21 = r32
            r16.setMax(r17, r18, r19, r20, r21)
            r1 = 0
            setMin((java.util.ArrayList<android.view.View>) r7, (int) r1)
            r0.length((java.lang.Object) r15, (java.util.ArrayList<android.view.View>) r5, (java.util.ArrayList<android.view.View>) r4)
            goto L_0x03ca
        L_0x0214:
            r1 = 0
            goto L_0x03ca
        L_0x0217:
            r29 = r5
            r30 = r13
            r31 = r15
            r1 = 0
            r13 = r4
            goto L_0x03ca
        L_0x0221:
            r29 = r5
            r32 = r11
            r30 = r13
            r31 = r15
            r1 = 0
            r13 = r4
            androidx.fragment.app.Fragment r0 = r10.setMin
            androidx.fragment.app.Fragment r2 = r10.setMax
            o.setTintList r3 = setMax(r2, r0)
            if (r3 == 0) goto L_0x03ca
            boolean r4 = r10.length
            boolean r5 = r10.getMax
            if (r0 != 0) goto L_0x023e
            r4 = r20
            goto L_0x024d
        L_0x023e:
            if (r4 == 0) goto L_0x0245
            java.lang.Object r4 = r0.getReenterTransition()
            goto L_0x0249
        L_0x0245:
            java.lang.Object r4 = r0.getEnterTransition()
        L_0x0249:
            java.lang.Object r4 = r3.setMin((java.lang.Object) r4)
        L_0x024d:
            if (r2 != 0) goto L_0x0252
            r5 = r20
            goto L_0x0261
        L_0x0252:
            if (r5 == 0) goto L_0x0259
            java.lang.Object r5 = r2.getReturnTransition()
            goto L_0x025d
        L_0x0259:
            java.lang.Object r5 = r2.getExitTransition()
        L_0x025d:
            java.lang.Object r5 = r3.setMin((java.lang.Object) r5)
        L_0x0261:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.fragment.app.Fragment r9 = r10.setMin
            androidx.fragment.app.Fragment r7 = r10.setMax
            if (r9 == 0) goto L_0x032d
            if (r7 != 0) goto L_0x0275
            goto L_0x032d
        L_0x0275:
            boolean r15 = r10.length
            boolean r14 = r32.isEmpty()
            if (r14 == 0) goto L_0x0282
            r21 = r8
            r14 = r20
            goto L_0x0288
        L_0x0282:
            java.lang.Object r14 = getMin((o.setTintList) r3, (androidx.fragment.app.Fragment) r9, (androidx.fragment.app.Fragment) r7, (boolean) r15)
            r21 = r8
        L_0x0288:
            r1 = r32
            o.PlaybackStateCompat r8 = getMin((o.setTintList) r3, (o.PlaybackStateCompat<java.lang.String, java.lang.String>) r1, (java.lang.Object) r14, (o.getPadding.getMax) r10)
            boolean r16 = r1.isEmpty()
            if (r16 == 0) goto L_0x0299
            r22 = r11
            r11 = r20
            goto L_0x02a3
        L_0x0299:
            r22 = r11
            java.util.Collection r11 = r8.values()
            r12.addAll(r11)
            r11 = r14
        L_0x02a3:
            if (r4 != 0) goto L_0x02bd
            if (r5 != 0) goto L_0x02bd
            if (r11 != 0) goto L_0x02bd
            r32 = r1
            r24 = r12
            r17 = r20
            r1 = r21
            r25 = r30
            r28 = r31
            r27 = 0
            r30 = r0
            r21 = r10
            goto L_0x033e
        L_0x02bd:
            getMax(r9, r7, r15, r8)
            if (r11 == 0) goto L_0x02ec
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            r3.setMax((java.lang.Object) r11, (android.view.View) r6, (java.util.ArrayList<android.view.View>) r12)
            r23 = r7
            boolean r7 = r10.getMax
            r24 = r9
            o.setColorFilter r9 = r10.toIntRange
            r25 = r10
            r10 = r14
            r14 = r3
            r26 = r15
            r15 = r11
            r16 = r5
            r17 = r8
            r18 = r7
            r19 = r9
            getMin(r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x02e9
            r3.length((java.lang.Object) r4, (android.graphics.Rect) r10)
        L_0x02e9:
            r19 = r10
            goto L_0x02f6
        L_0x02ec:
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r15
            r19 = r20
        L_0x02f6:
            o.getPadding$6 r15 = new o.getPadding$6
            r16 = r23
            r7 = r15
            r14 = r21
            r8 = r3
            r17 = r24
            r9 = r1
            r21 = r25
            r10 = r11
            r23 = r11
            r11 = r21
            r24 = r12
            r12 = r22
            r32 = r1
            r1 = r13
            r25 = r30
            r13 = r6
            r1 = r14
            r27 = 0
            r14 = r17
            r30 = r0
            r0 = r15
            r28 = r31
            r15 = r16
            r16 = r26
            r17 = r24
            r18 = r4
            r7.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            o.getMenuInflater.getMin(r1, r0)
            r17 = r23
            goto L_0x033e
        L_0x032d:
            r1 = r8
            r21 = r10
            r22 = r11
            r24 = r12
            r25 = r30
            r28 = r31
            r27 = 0
            r30 = r0
            r17 = r20
        L_0x033e:
            if (r4 != 0) goto L_0x0349
            if (r17 != 0) goto L_0x0349
            if (r5 == 0) goto L_0x0345
            goto L_0x0349
        L_0x0345:
            r1 = r41
            goto L_0x03d9
        L_0x0349:
            r0 = r24
            java.util.ArrayList r19 = length(r3, r5, r2, r0, r6)
            if (r19 == 0) goto L_0x035a
            boolean r7 = r19.isEmpty()
            if (r7 == 0) goto L_0x0358
            goto L_0x035a
        L_0x0358:
            r20 = r5
        L_0x035a:
            r3.setMax((java.lang.Object) r4, (android.view.View) r6)
            r8 = r21
            boolean r13 = r8.length
            r8 = r3
            r9 = r4
            r10 = r20
            r11 = r17
            r12 = r30
            java.lang.Object r5 = setMin(r8, r9, r10, r11, r12, r13)
            if (r2 == 0) goto L_0x0391
            if (r19 == 0) goto L_0x0391
            int r7 = r19.size()
            if (r7 > 0) goto L_0x037d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0391
        L_0x037d:
            o.StringRes r0 = new o.StringRes
            r0.<init>()
            r10 = r1
            r1 = r41
            r1.getMax(r2, r0)
            o.getPadding$2 r7 = new o.getPadding$2
            r7.<init>(r2, r0)
            r3.getMax(r2, r5, r0, r7)
            goto L_0x0394
        L_0x0391:
            r10 = r1
            r1 = r41
        L_0x0394:
            if (r5 == 0) goto L_0x03d9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11 = r3
            r12 = r5
            r13 = r4
            r14 = r0
            r15 = r20
            r16 = r19
            r18 = r22
            r11.length(r12, r13, r14, r15, r16, r17, r18)
            o.getPadding$5 r2 = new o.getPadding$5
            r7 = r2
            r8 = r4
            r9 = r3
            r4 = r10
            r10 = r6
            r11 = r30
            r12 = r22
            r13 = r0
            r14 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            o.getMenuInflater.getMin(r4, r2)
            r2 = r22
            r0 = r32
            r3.getMin(r4, r2, r0)
            r3.setMax((android.view.ViewGroup) r4, (java.lang.Object) r5)
            r3.setMin(r4, r2, r0)
            goto L_0x03d9
        L_0x03ca:
            r1 = r13
            r25 = r30
            r28 = r31
            goto L_0x03d7
        L_0x03d0:
            r1 = r4
            r29 = r5
            r25 = r13
            r28 = r15
        L_0x03d7:
            r27 = 0
        L_0x03d9:
            int r13 = r25 + 1
            r0 = r36
            r2 = r39
            r3 = r40
            r4 = r1
            r15 = r28
            r5 = r29
            r1 = r37
            goto L_0x0041
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPadding.getMin(android.content.Context, o.jumpToCurrentState, java.util.ArrayList, java.util.ArrayList, int, int, boolean, o.getPadding$getMin):void");
    }

    private static PlaybackStateCompat<String, String> setMin(int i, ArrayList<setColorFilter> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        PlaybackStateCompat<String, String> playbackStateCompat = new PlaybackStateCompat<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            setColorFilter setcolorfilter = arrayList.get(i4);
            if (setcolorfilter.setMax(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (setcolorfilter.Mean$Arithmetic != null) {
                    int size = setcolorfilter.Mean$Arithmetic.size();
                    if (booleanValue) {
                        arrayList3 = setcolorfilter.Mean$Arithmetic;
                        arrayList4 = setcolorfilter.invokeSuspend;
                    } else {
                        ArrayList arrayList5 = setcolorfilter.Mean$Arithmetic;
                        arrayList3 = setcolorfilter.invokeSuspend;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String remove = playbackStateCompat.remove(str2);
                        if (remove != null) {
                            playbackStateCompat.put(str, remove);
                        } else {
                            playbackStateCompat.put(str, str2);
                        }
                    }
                }
            }
        }
        return playbackStateCompat;
    }

    private static setTintList setMax(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        setTintList settintlist = length;
        if (settintlist != null && setMin(settintlist, (List<Object>) arrayList)) {
            return length;
        }
        setTintList settintlist2 = getMin;
        if (settintlist2 != null && setMin(settintlist2, (List<Object>) arrayList)) {
            return getMin;
        }
        if (length == null && getMin == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean setMin(setTintList settintlist, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!settintlist.setMax(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object getMin(setTintList settintlist, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return settintlist.getMin(settintlist.setMin(obj));
    }

    private static void getMin(ArrayList<View> arrayList, PlaybackStateCompat<String, View> playbackStateCompat, Collection<String> collection) {
        for (int size = playbackStateCompat.size() - 1; size >= 0; size--) {
            View view = (View) playbackStateCompat.isInside[(size << 1) + 1];
            if (collection.contains(ViewCompat.onNavigationEvent(view))) {
                arrayList.add(view);
            }
        }
    }

    private static PlaybackStateCompat<String, View> getMin(setTintList settintlist, PlaybackStateCompat<String, String> playbackStateCompat, Object obj, getMax getmax) {
        mask mask;
        ArrayList arrayList;
        if (playbackStateCompat.isEmpty() || obj == null) {
            playbackStateCompat.clear();
            return null;
        }
        Fragment fragment = getmax.setMax;
        PlaybackStateCompat<String, View> playbackStateCompat2 = new PlaybackStateCompat<>();
        settintlist.getMin((Map<String, View>) playbackStateCompat2, fragment.requireView());
        setColorFilter setcolorfilter = getmax.toIntRange;
        if (getmax.getMax) {
            mask = fragment.getEnterTransitionCallback();
            arrayList = setcolorfilter.invokeSuspend;
        } else {
            mask = fragment.getExitTransitionCallback();
            arrayList = setcolorfilter.Mean$Arithmetic;
        }
        if (arrayList != null) {
            playbackStateCompat2.getMax(arrayList);
        }
        if (mask != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = playbackStateCompat2.get(str);
                if (view == null) {
                    playbackStateCompat.remove(str);
                } else if (!str.equals(ViewCompat.onNavigationEvent(view))) {
                    playbackStateCompat.put(ViewCompat.onNavigationEvent(view), playbackStateCompat.remove(str));
                }
            }
        } else {
            playbackStateCompat.getMax(playbackStateCompat2.keySet());
        }
        return playbackStateCompat2;
    }

    static PlaybackStateCompat<String, View> setMax(setTintList settintlist, PlaybackStateCompat<String, String> playbackStateCompat, Object obj, getMax getmax) {
        mask mask;
        ArrayList arrayList;
        String min;
        Fragment fragment = getmax.setMin;
        View view = fragment.getView();
        if (playbackStateCompat.isEmpty() || obj == null || view == null) {
            playbackStateCompat.clear();
            return null;
        }
        PlaybackStateCompat<String, View> playbackStateCompat2 = new PlaybackStateCompat<>();
        settintlist.getMin((Map<String, View>) playbackStateCompat2, view);
        setColorFilter setcolorfilter = getmax.getMin;
        if (getmax.length) {
            mask = fragment.getExitTransitionCallback();
            arrayList = setcolorfilter.Mean$Arithmetic;
        } else {
            mask = fragment.getEnterTransitionCallback();
            arrayList = setcolorfilter.invokeSuspend;
        }
        if (arrayList != null) {
            playbackStateCompat2.getMax(arrayList);
            playbackStateCompat2.getMax(playbackStateCompat.values());
        }
        if (mask != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = playbackStateCompat2.get(str);
                if (view2 == null) {
                    String min2 = setMin(playbackStateCompat, str);
                    if (min2 != null) {
                        playbackStateCompat.remove(min2);
                    }
                } else if (!str.equals(ViewCompat.onNavigationEvent(view2)) && (min = setMin(playbackStateCompat, str)) != null) {
                    playbackStateCompat.put(min, ViewCompat.onNavigationEvent(view2));
                }
            }
        } else {
            length(playbackStateCompat, playbackStateCompat2);
        }
        return playbackStateCompat2;
    }

    static String setMin(PlaybackStateCompat<String, String> playbackStateCompat, String str) {
        int size = playbackStateCompat.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            if (str.equals(playbackStateCompat.isInside[i2 + 1])) {
                return (String) playbackStateCompat.isInside[i2];
            }
        }
        return null;
    }

    static View setMax(PlaybackStateCompat<String, View> playbackStateCompat, getMax getmax, Object obj, boolean z) {
        String str;
        setColorFilter setcolorfilter = getmax.getMin;
        if (obj == null || playbackStateCompat == null || setcolorfilter.Mean$Arithmetic == null || setcolorfilter.Mean$Arithmetic.isEmpty()) {
            return null;
        }
        if (z) {
            str = (String) setcolorfilter.Mean$Arithmetic.get(0);
        } else {
            str = (String) setcolorfilter.invokeSuspend.get(0);
        }
        return playbackStateCompat.get(str);
    }

    private static void getMin(setTintList settintlist, Object obj, Object obj2, PlaybackStateCompat<String, View> playbackStateCompat, boolean z, setColorFilter setcolorfilter) {
        String str;
        if (setcolorfilter.Mean$Arithmetic != null && !setcolorfilter.Mean$Arithmetic.isEmpty()) {
            if (z) {
                str = (String) setcolorfilter.invokeSuspend.get(0);
            } else {
                str = (String) setcolorfilter.Mean$Arithmetic.get(0);
            }
            View view = playbackStateCompat.get(str);
            settintlist.getMin(obj, view);
            if (obj2 != null) {
                settintlist.getMin(obj2, view);
            }
        }
    }

    static void length(@NonNull PlaybackStateCompat<String, String> playbackStateCompat, @NonNull PlaybackStateCompat<String, View> playbackStateCompat2) {
        for (int size = playbackStateCompat.size() - 1; size >= 0; size--) {
            if (!playbackStateCompat2.containsKey((String) playbackStateCompat.isInside[(size << 1) + 1])) {
                playbackStateCompat.setMin(size);
            }
        }
    }

    static void getMax(Fragment fragment, Fragment fragment2, boolean z, PlaybackStateCompat<String, View> playbackStateCompat) {
        mask mask;
        int i;
        if (z) {
            mask = fragment2.getEnterTransitionCallback();
        } else {
            mask = fragment.getEnterTransitionCallback();
        }
        if (mask != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (playbackStateCompat == null) {
                i = 0;
            } else {
                i = playbackStateCompat.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 << 1;
                arrayList2.add(playbackStateCompat.isInside[i3]);
                arrayList.add(playbackStateCompat.isInside[i3 + 1]);
            }
        }
    }

    static ArrayList<View> length(setTintList settintlist, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            settintlist.getMin(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        settintlist.getMin(obj, arrayList2);
        return arrayList2;
    }

    static void setMin(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    private static Object setMin(setTintList settintlist, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return settintlist.length(obj2, obj, obj3);
        }
        return settintlist.getMax(obj2, obj, obj3);
    }

    private static void getMin(setColorFilter setcolorfilter, SparseArray<getMax> sparseArray, boolean z) {
        int size = setcolorfilter.getMin.size();
        for (int i = 0; i < size; i++) {
            getMax(setcolorfilter, (invalidateDrawable.length) setcolorfilter.getMin.get(i), sparseArray, false, z);
        }
    }

    private static void getMax(setColorFilter setcolorfilter, SparseArray<getMax> sparseArray, boolean z) {
        if (setcolorfilter.getMax.toDoubleRange.setMin()) {
            for (int size = setcolorfilter.getMin.size() - 1; size >= 0; size--) {
                getMax(setcolorfilter, (invalidateDrawable.length) setcolorfilter.getMin.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0070, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008c, code lost:
        if (r0.mHidden == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getMax(o.setColorFilter r8, o.invalidateDrawable.length r9, android.util.SparseArray<o.getPadding.getMax> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.getMin
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = setMax
            int r9 = r9.setMin
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.setMin
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x0081
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x0081
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0094
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0090
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0090
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0090
            goto L_0x008e
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x0091
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0072
        L_0x004d:
            goto L_0x0070
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0072
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0074
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0072
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0072
            android.view.View r9 = r0.mView
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0072
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0072
        L_0x0070:
            r9 = 1
            goto L_0x007d
        L_0x0072:
            r9 = 0
            goto L_0x007d
        L_0x0074:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0072
            goto L_0x0070
        L_0x007d:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0094
        L_0x0081:
            if (r12 == 0) goto L_0x0086
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x0091
        L_0x0086:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0090
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0090
        L_0x008e:
            r9 = 1
            goto L_0x0091
        L_0x0090:
            r9 = 0
        L_0x0091:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0094:
            java.lang.Object r5 = r10.get(r1)
            o.getPadding$getMax r5 = (o.getPadding.getMax) r5
            if (r2 == 0) goto L_0x00ac
            if (r5 != 0) goto L_0x00a6
            o.getPadding$getMax r5 = new o.getPadding$getMax
            r5.<init>()
            r10.put(r1, r5)
        L_0x00a6:
            r5.setMin = r0
            r5.length = r11
            r5.getMin = r8
        L_0x00ac:
            r2 = 0
            if (r12 != 0) goto L_0x00cd
            if (r3 == 0) goto L_0x00cd
            if (r5 == 0) goto L_0x00b9
            androidx.fragment.app.Fragment r3 = r5.setMax
            if (r3 != r0) goto L_0x00b9
            r5.setMax = r2
        L_0x00b9:
            boolean r3 = r8.Grayscale$Algorithm
            if (r3 != 0) goto L_0x00cd
            androidx.fragment.app.FragmentManager r3 = r8.getMax
            o.unscheduleDrawable r6 = r3.toIntRange(r0)
            o.scheduleDrawable r7 = r3.getMin
            r7.getMin((o.unscheduleDrawable) r6)
            int r6 = r3.FastBitmap$CoordinateSystem
            r3.getMax((androidx.fragment.app.Fragment) r0, (int) r6)
        L_0x00cd:
            if (r4 == 0) goto L_0x00e6
            if (r5 == 0) goto L_0x00d5
            androidx.fragment.app.Fragment r3 = r5.setMax
            if (r3 != 0) goto L_0x00e6
        L_0x00d5:
            if (r5 != 0) goto L_0x00e0
            o.getPadding$getMax r3 = new o.getPadding$getMax
            r3.<init>()
            r10.put(r1, r3)
            r5 = r3
        L_0x00e0:
            r5.setMax = r0
            r5.getMax = r11
            r5.toIntRange = r8
        L_0x00e6:
            if (r12 != 0) goto L_0x00f2
            if (r9 == 0) goto L_0x00f2
            if (r5 == 0) goto L_0x00f2
            androidx.fragment.app.Fragment r8 = r5.setMin
            if (r8 != r0) goto L_0x00f2
            r5.setMin = r2
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPadding.getMax(o.setColorFilter, o.invalidateDrawable$length, android.util.SparseArray, boolean, boolean):void");
    }

    static class getMax {
        public boolean getMax;
        public setColorFilter getMin;
        public boolean length;
        public Fragment setMax;
        public Fragment setMin;
        public setColorFilter toIntRange;

        getMax() {
        }
    }
}
