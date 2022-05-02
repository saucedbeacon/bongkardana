package o;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.EmojiMetadata;
import java.util.Arrays;
import o.createMultiAutoCompleteTextView;

@RequiresApi(19)
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class createCheckBox {
    private final int[] getMax;
    private final EmojiCompat.toFloatRange getMin;
    private final createMultiAutoCompleteTextView length;
    private getMin setMax = new getMin();
    private final boolean setMin;

    private static boolean getMin(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public createCheckBox(@NonNull createMultiAutoCompleteTextView createmultiautocompletetextview, @NonNull EmojiCompat.toFloatRange tofloatrange, boolean z, @Nullable int[] iArr) {
        this.getMin = tofloatrange;
        this.length = createmultiautocompletetextview;
        this.setMin = z;
        this.getMax = iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r10v6, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015f A[Catch:{ all -> 0x01a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence length(@androidx.annotation.NonNull java.lang.CharSequence r17, @androidx.annotation.IntRange(from = 0) int r18, @androidx.annotation.IntRange(from = 0) int r19, @androidx.annotation.IntRange(from = 0) int r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r3 = r19
            r4 = r20
            boolean r5 = r2 instanceof o.onBoundsChange
            if (r5 == 0) goto L_0x0014
            r6 = r2
            o.onBoundsChange r6 = (o.onBoundsChange) r6
            r6.getMax()
        L_0x0014:
            if (r5 != 0) goto L_0x0036
            boolean r7 = r2 instanceof android.text.Spannable     // Catch:{ all -> 0x01a9 }
            if (r7 == 0) goto L_0x001b
            goto L_0x0036
        L_0x001b:
            boolean r7 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x01a9 }
            if (r7 == 0) goto L_0x0034
            r7 = r2
            android.text.Spanned r7 = (android.text.Spanned) r7     // Catch:{ all -> 0x01a9 }
            int r8 = r0 + -1
            int r9 = r3 + 1
            java.lang.Class<o.createRatingBar> r10 = o.createRatingBar.class
            int r7 = r7.nextSpanTransition(r8, r9, r10)     // Catch:{ all -> 0x01a9 }
            if (r7 > r3) goto L_0x0034
            android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x01a9 }
            r7.<init>(r2)     // Catch:{ all -> 0x01a9 }
            goto L_0x0039
        L_0x0034:
            r7 = 0
            goto L_0x0039
        L_0x0036:
            r7 = r2
            android.text.Spannable r7 = (android.text.Spannable) r7     // Catch:{ all -> 0x01a9 }
        L_0x0039:
            r8 = 0
            if (r7 == 0) goto L_0x0067
            java.lang.Class<o.createRatingBar> r9 = o.createRatingBar.class
            java.lang.Object[] r9 = r7.getSpans(r0, r3, r9)     // Catch:{ all -> 0x01a9 }
            o.createRatingBar[] r9 = (o.createRatingBar[]) r9     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x0067
            int r10 = r9.length     // Catch:{ all -> 0x01a9 }
            if (r10 <= 0) goto L_0x0067
            int r10 = r9.length     // Catch:{ all -> 0x01a9 }
            r11 = 0
        L_0x004b:
            if (r11 >= r10) goto L_0x0067
            r12 = r9[r11]     // Catch:{ all -> 0x01a9 }
            int r13 = r7.getSpanStart(r12)     // Catch:{ all -> 0x01a9 }
            int r14 = r7.getSpanEnd(r12)     // Catch:{ all -> 0x01a9 }
            if (r13 == r3) goto L_0x005c
            r7.removeSpan(r12)     // Catch:{ all -> 0x01a9 }
        L_0x005c:
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x01a9 }
            int r3 = java.lang.Math.max(r14, r3)     // Catch:{ all -> 0x01a9 }
            int r11 = r11 + 1
            goto L_0x004b
        L_0x0067:
            if (r0 == r3) goto L_0x01a0
            int r9 = r17.length()     // Catch:{ all -> 0x01a9 }
            if (r0 < r9) goto L_0x0071
            goto L_0x01a0
        L_0x0071:
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r9) goto L_0x0086
            if (r7 == 0) goto L_0x0086
            int r9 = r7.length()     // Catch:{ all -> 0x01a9 }
            java.lang.Class<o.createRatingBar> r10 = o.createRatingBar.class
            java.lang.Object[] r9 = r7.getSpans(r8, r9, r10)     // Catch:{ all -> 0x01a9 }
            o.createRatingBar[] r9 = (o.createRatingBar[]) r9     // Catch:{ all -> 0x01a9 }
            int r9 = r9.length     // Catch:{ all -> 0x01a9 }
            int r4 = r4 - r9
        L_0x0086:
            o.createCheckBox$setMax r9 = new o.createCheckBox$setMax     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView r10 = r1.length     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r10 = r10.length()     // Catch:{ all -> 0x01a9 }
            boolean r11 = r1.setMin     // Catch:{ all -> 0x01a9 }
            int[] r12 = r1.getMax     // Catch:{ all -> 0x01a9 }
            r9.<init>(r10, r11, r12)     // Catch:{ all -> 0x01a9 }
            int r10 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x01a9 }
            r11 = r10
            r12 = 0
            r10 = r7
        L_0x009c:
            r7 = r0
        L_0x009d:
            if (r0 >= r3) goto L_0x0171
            if (r12 >= r4) goto L_0x0171
            o.createMultiAutoCompleteTextView$getMax r13 = r9.getMax     // Catch:{ all -> 0x01a9 }
            android.util.SparseArray<o.createMultiAutoCompleteTextView$getMax> r14 = r13.getMax     // Catch:{ all -> 0x01a9 }
            if (r14 != 0) goto L_0x00a9
            r13 = 0
            goto L_0x00b1
        L_0x00a9:
            android.util.SparseArray<o.createMultiAutoCompleteTextView$getMax> r13 = r13.getMax     // Catch:{ all -> 0x01a9 }
            java.lang.Object r13 = r13.get(r11)     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = (o.createMultiAutoCompleteTextView.getMax) r13     // Catch:{ all -> 0x01a9 }
        L_0x00b1:
            int r14 = r9.setMin     // Catch:{ all -> 0x01a9 }
            r6 = 2
            r15 = 1
            if (r14 == r6) goto L_0x00ca
            if (r13 != 0) goto L_0x00c3
            r9.setMin = r15     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = r9.setMax     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r8     // Catch:{ all -> 0x01a9 }
        L_0x00c1:
            r13 = 1
            goto L_0x0128
        L_0x00c3:
            r9.setMin = r6     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r15     // Catch:{ all -> 0x01a9 }
            goto L_0x00d3
        L_0x00ca:
            if (r13 == 0) goto L_0x00d5
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            int r13 = r9.toIntRange     // Catch:{ all -> 0x01a9 }
            int r13 = r13 + r15
            r9.toIntRange = r13     // Catch:{ all -> 0x01a9 }
        L_0x00d3:
            r13 = 2
            goto L_0x0128
        L_0x00d5:
            boolean r13 = o.createCheckBox.setMax.length(r11)     // Catch:{ all -> 0x01a9 }
            if (r13 == 0) goto L_0x00e4
            r9.setMin = r15     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = r9.setMax     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r8     // Catch:{ all -> 0x01a9 }
            goto L_0x00c1
        L_0x00e4:
            boolean r13 = o.createCheckBox.setMax.getMax(r11)     // Catch:{ all -> 0x01a9 }
            if (r13 == 0) goto L_0x00eb
            goto L_0x00d3
        L_0x00eb:
            o.createMultiAutoCompleteTextView$getMax r13 = r9.getMax     // Catch:{ all -> 0x01a9 }
            androidx.emoji.text.EmojiMetadata r13 = r13.getMin     // Catch:{ all -> 0x01a9 }
            if (r13 == 0) goto L_0x011f
            int r13 = r9.toIntRange     // Catch:{ all -> 0x01a9 }
            if (r13 != r15) goto L_0x0111
            boolean r13 = r9.setMin()     // Catch:{ all -> 0x01a9 }
            if (r13 == 0) goto L_0x0108
            o.createMultiAutoCompleteTextView$getMax r13 = r9.getMax     // Catch:{ all -> 0x01a9 }
            r9.length = r13     // Catch:{ all -> 0x01a9 }
            r9.setMin = r15     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = r9.setMax     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r8     // Catch:{ all -> 0x01a9 }
            goto L_0x011d
        L_0x0108:
            r9.setMin = r15     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = r9.setMax     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r8     // Catch:{ all -> 0x01a9 }
            goto L_0x00c1
        L_0x0111:
            o.createMultiAutoCompleteTextView$getMax r13 = r9.getMax     // Catch:{ all -> 0x01a9 }
            r9.length = r13     // Catch:{ all -> 0x01a9 }
            r9.setMin = r15     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = r9.setMax     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r8     // Catch:{ all -> 0x01a9 }
        L_0x011d:
            r13 = 3
            goto L_0x0128
        L_0x011f:
            r9.setMin = r15     // Catch:{ all -> 0x01a9 }
            o.createMultiAutoCompleteTextView$getMax r13 = r9.setMax     // Catch:{ all -> 0x01a9 }
            r9.getMax = r13     // Catch:{ all -> 0x01a9 }
            r9.toIntRange = r8     // Catch:{ all -> 0x01a9 }
            goto L_0x00c1
        L_0x0128:
            r9.getMin = r11     // Catch:{ all -> 0x01a9 }
            if (r13 == r15) goto L_0x015f
            if (r13 == r6) goto L_0x0152
            r6 = 3
            if (r13 == r6) goto L_0x0133
            goto L_0x009d
        L_0x0133:
            if (r21 != 0) goto L_0x013f
            o.createMultiAutoCompleteTextView$getMax r6 = r9.length     // Catch:{ all -> 0x01a9 }
            androidx.emoji.text.EmojiMetadata r6 = r6.getMin     // Catch:{ all -> 0x01a9 }
            boolean r6 = r1.length(r2, r7, r0, r6)     // Catch:{ all -> 0x01a9 }
            if (r6 != 0) goto L_0x009c
        L_0x013f:
            if (r10 != 0) goto L_0x0147
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x01a9 }
            r6.<init>(r2)     // Catch:{ all -> 0x01a9 }
            r10 = r6
        L_0x0147:
            o.createMultiAutoCompleteTextView$getMax r6 = r9.length     // Catch:{ all -> 0x01a9 }
            androidx.emoji.text.EmojiMetadata r6 = r6.getMin     // Catch:{ all -> 0x01a9 }
            r1.getMin(r10, r6, r7, r0)     // Catch:{ all -> 0x01a9 }
            int r12 = r12 + 1
            goto L_0x009c
        L_0x0152:
            int r6 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x01a9 }
            int r0 = r0 + r6
            if (r0 >= r3) goto L_0x009d
            int r11 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x01a9 }
            goto L_0x009d
        L_0x015f:
            int r0 = java.lang.Character.codePointAt(r2, r7)     // Catch:{ all -> 0x01a9 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x01a9 }
            int r7 = r7 + r0
            if (r7 >= r3) goto L_0x016e
            int r11 = java.lang.Character.codePointAt(r2, r7)     // Catch:{ all -> 0x01a9 }
        L_0x016e:
            r0 = r7
            goto L_0x009d
        L_0x0171:
            boolean r3 = r9.getMin()     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x0194
            if (r12 >= r4) goto L_0x0194
            if (r21 != 0) goto L_0x0185
            o.createMultiAutoCompleteTextView$getMax r3 = r9.getMax     // Catch:{ all -> 0x01a9 }
            androidx.emoji.text.EmojiMetadata r3 = r3.getMin     // Catch:{ all -> 0x01a9 }
            boolean r3 = r1.length(r2, r7, r0, r3)     // Catch:{ all -> 0x01a9 }
            if (r3 != 0) goto L_0x0194
        L_0x0185:
            if (r10 != 0) goto L_0x018d
            android.text.SpannableString r3 = new android.text.SpannableString     // Catch:{ all -> 0x01a9 }
            r3.<init>(r2)     // Catch:{ all -> 0x01a9 }
            r10 = r3
        L_0x018d:
            o.createMultiAutoCompleteTextView$getMax r3 = r9.getMax     // Catch:{ all -> 0x01a9 }
            androidx.emoji.text.EmojiMetadata r3 = r3.getMin     // Catch:{ all -> 0x01a9 }
            r1.getMin(r10, r3, r7, r0)     // Catch:{ all -> 0x01a9 }
        L_0x0194:
            if (r10 != 0) goto L_0x0197
            r10 = r2
        L_0x0197:
            if (r5 == 0) goto L_0x019f
            r0 = r2
            o.onBoundsChange r0 = (o.onBoundsChange) r0
            r0.getMin()
        L_0x019f:
            return r10
        L_0x01a0:
            if (r5 == 0) goto L_0x01a8
            r0 = r2
            o.onBoundsChange r0 = (o.onBoundsChange) r0
            r0.getMin()
        L_0x01a8:
            return r2
        L_0x01a9:
            r0 = move-exception
            if (r5 == 0) goto L_0x01b1
            o.onBoundsChange r2 = (o.onBoundsChange) r2
            r2.getMin()
        L_0x01b1:
            goto L_0x01b3
        L_0x01b2:
            throw r0
        L_0x01b3:
            goto L_0x01b2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createCheckBox.length(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public static boolean setMin(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 67) {
            z = i != 112 ? false : getMin(editable, keyEvent, true);
        } else {
            z = getMin(editable, keyEvent, false);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private static boolean getMin(Editable editable, KeyEvent keyEvent, boolean z) {
        createRatingBar[] createratingbarArr;
        if (length(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!getMin(selectionStart, selectionEnd) && (createratingbarArr = (createRatingBar[]) editable.getSpans(selectionStart, selectionEnd, createRatingBar.class)) != null && createratingbarArr.length > 0) {
            int length2 = createratingbarArr.length;
            int i = 0;
            while (i < length2) {
                createRatingBar createratingbar = createratingbarArr[i];
                int spanStart = editable.getSpanStart(createratingbar);
                int spanEnd = editable.getSpanEnd(createratingbar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
        if (r11 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean length(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r7, @androidx.annotation.NonNull android.text.Editable r8, @androidx.annotation.IntRange(from = 0) int r9, @androidx.annotation.IntRange(from = 0) int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00f2
            if (r7 != 0) goto L_0x0007
            goto L_0x00f2
        L_0x0007:
            if (r9 < 0) goto L_0x00f2
            if (r10 >= 0) goto L_0x000d
            goto L_0x00f2
        L_0x000d:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            boolean r3 = getMin(r1, r2)
            if (r3 == 0) goto L_0x001c
            return r0
        L_0x001c:
            r3 = 1
            if (r11 == 0) goto L_0x00a8
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            r4 = -1
            if (r1 < 0) goto L_0x005f
            if (r11 >= r1) goto L_0x002d
            goto L_0x005f
        L_0x002d:
            if (r9 >= 0) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            r11 = 0
        L_0x0031:
            if (r9 != 0) goto L_0x0034
            goto L_0x0060
        L_0x0034:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003d
            if (r11 == 0) goto L_0x003b
            goto L_0x005f
        L_0x003b:
            r1 = 0
            goto L_0x0060
        L_0x003d:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004d
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x004a
            goto L_0x005f
        L_0x004a:
            int r9 = r9 + -1
            goto L_0x0030
        L_0x004d:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0056
            int r9 = r9 + -1
            goto L_0x0031
        L_0x0056:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r11 = 1
            goto L_0x0031
        L_0x005f:
            r1 = -1
        L_0x0060:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x00a2
            if (r10 >= r2) goto L_0x006d
            goto L_0x00a2
        L_0x006d:
            if (r9 >= 0) goto L_0x0070
            goto L_0x00a2
        L_0x0070:
            r11 = 0
        L_0x0071:
            if (r9 != 0) goto L_0x0075
            r10 = r2
            goto L_0x00a3
        L_0x0075:
            if (r2 < r10) goto L_0x007a
            if (r11 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x007a:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008c
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0087
            goto L_0x00a2
        L_0x0087:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0070
        L_0x008c:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0097
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0071
        L_0x0097:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            int r2 = r2 + 1
            r11 = 1
            goto L_0x0071
        L_0x00a2:
            r10 = -1
        L_0x00a3:
            if (r1 == r4) goto L_0x00a7
            if (r10 != r4) goto L_0x00b6
        L_0x00a7:
            return r0
        L_0x00a8:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b6:
            java.lang.Class<o.createRatingBar> r9 = o.createRatingBar.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            o.createRatingBar[] r9 = (o.createRatingBar[]) r9
            if (r9 == 0) goto L_0x00f2
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00f2
            int r11 = r9.length
            r2 = 0
        L_0x00c5:
            if (r2 >= r11) goto L_0x00dc
            r4 = r9[r2]
            int r5 = r8.getSpanStart(r4)
            int r4 = r8.getSpanEnd(r4)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r4, r10)
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r3
        L_0x00f2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createCheckBox.length(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    private static boolean length(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void getMin(@NonNull Spannable spannable, EmojiMetadata emojiMetadata, int i, int i2) {
        spannable.setSpan(this.getMin.length(emojiMetadata), i, i2, 33);
    }

    private boolean length(CharSequence charSequence, int i, int i2, EmojiMetadata emojiMetadata) {
        if (Build.VERSION.SDK_INT < 23 && emojiMetadata.length() > Build.VERSION.SDK_INT) {
            return false;
        }
        if (emojiMetadata.getMin() == 0) {
            emojiMetadata.setMin(this.setMax.setMax(charSequence, i, i2));
        }
        if (emojiMetadata.getMin() == 2) {
            return true;
        }
        return false;
    }

    static final class setMax {
        private final boolean IsOverlapping;
        createMultiAutoCompleteTextView.getMax getMax;
        int getMin;
        createMultiAutoCompleteTextView.getMax length;
        final createMultiAutoCompleteTextView.getMax setMax;
        int setMin = 1;
        private final int[] toFloatRange;
        int toIntRange;

        static boolean getMax(int i) {
            return i == 65039;
        }

        static boolean length(int i) {
            return i == 65038;
        }

        setMax(createMultiAutoCompleteTextView.getMax getmax, boolean z, int[] iArr) {
            this.setMax = getmax;
            this.getMax = getmax;
            this.IsOverlapping = z;
            this.toFloatRange = iArr;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMin() {
            if (this.setMin != 2 || this.getMax.getMin == null) {
                return false;
            }
            if (this.toIntRange > 1 || setMin()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin() {
            if (this.getMax.getMin.toFloatRange() || getMax(this.getMin)) {
                return true;
            }
            if (this.IsOverlapping) {
                if (this.toFloatRange == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.toFloatRange, this.getMax.getMin.getMax(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @AnyThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class getMin {
        private static final ThreadLocal<StringBuilder> setMin = new ThreadLocal<>();
        private final TextPaint getMin;

        getMin() {
            TextPaint textPaint = new TextPaint();
            this.getMin = textPaint;
            textPaint.setTextSize(10.0f);
        }

        public final boolean setMax(CharSequence charSequence, int i, int i2) {
            if (setMin.get() == null) {
                setMin.set(new StringBuilder());
            }
            StringBuilder sb = setMin.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            return RawRes.setMax(this.getMin, sb.toString());
        }
    }
}
