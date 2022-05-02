package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.ml.vision.text.RecognizedLanguage;
import java.util.ArrayList;
import java.util.List;

public final class zzrg {
    private static final GmsLogger zzayb = new GmsLogger("TextAnnotationConverter", "");

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.ml.vision.text.FirebaseVisionText zzb(@androidx.annotation.Nullable com.google.android.gms.internal.firebase_ml.zzkq r25, float r26) {
        /*
            r0 = r26
            if (r25 != 0) goto L_0x0007
            com.google.firebase.ml.vision.text.FirebaseVisionText r0 = com.google.firebase.ml.vision.text.FirebaseVisionText.zzbkg
            return r0
        L_0x0007:
            java.util.List r1 = r25.getPages()
            int r1 = r1.size()
            java.lang.String r2 = "TextAnnotationConverter"
            if (r1 > 0) goto L_0x001d
            com.google.android.gms.common.internal.GmsLogger r0 = zzayb
            java.lang.String r1 = "Text Annotation is null, return empty Vision Text"
            r0.d(r2, r1)
            com.google.firebase.ml.vision.text.FirebaseVisionText r0 = com.google.firebase.ml.vision.text.FirebaseVisionText.zzbkg
            return r0
        L_0x001d:
            java.util.List r1 = r25.getPages()
            int r1 = r1.size()
            r3 = 1
            if (r1 <= r3) goto L_0x002f
            com.google.android.gms.common.internal.GmsLogger r1 = zzayb
            java.lang.String r4 = "Text Annotation has more than one page, which should not happen"
            r1.d(r2, r4)
        L_0x002f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r25.getPages()
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02b8
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.firebase_ml.zzkh r4 = (com.google.android.gms.internal.firebase_ml.zzkh) r4
            java.util.List r4 = r4.getBlocks()
            java.util.Iterator r4 = r4.iterator()
        L_0x0050:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003c
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.firebase_ml.zzjs r5 = (com.google.android.gms.internal.firebase_ml.zzjs) r5
            java.lang.String r6 = "Input block can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r6)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r6 = r5.getParagraphs()
            if (r6 != 0) goto L_0x0073
            r22 = r2
            r23 = r4
        L_0x0070:
            r7 = 0
            goto L_0x02ac
        L_0x0073:
            java.util.List r6 = r5.getParagraphs()
            java.util.Iterator r6 = r6.iterator()
        L_0x007b:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x025e
            java.lang.Object r8 = r6.next()
            com.google.android.gms.internal.firebase_ml.zzkk r8 = (com.google.android.gms.internal.firebase_ml.zzkk) r8
            if (r8 == 0) goto L_0x007b
            java.lang.String r10 = "Input Paragraph can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r7 = 0
            r16 = 0
        L_0x00a5:
            java.util.List r17 = r8.getWords()
            int r9 = r17.size()
            if (r7 >= r9) goto L_0x0252
            java.util.List r9 = r8.getWords()
            java.lang.Object r9 = r9.get(r7)
            com.google.android.gms.internal.firebase_ml.zzkt r9 = (com.google.android.gms.internal.firebase_ml.zzkt) r9
            if (r9 == 0) goto L_0x023f
            java.lang.String r15 = "Input Word can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r15)
            com.google.android.gms.internal.firebase_ml.zzjr r3 = r9.zzia()
            android.graphics.Rect r3 = com.google.android.gms.internal.firebase_ml.zzpy.zza(r3, r0)
            com.google.android.gms.internal.firebase_ml.zzkp r17 = r9.zzib()
            r22 = r2
            java.util.List r2 = zze(r17)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r15)
            java.util.List r15 = r9.getSymbols()
            java.lang.String r17 = ""
            if (r15 != 0) goto L_0x00e2
            r23 = r4
            r4 = r17
            goto L_0x010d
        L_0x00e2:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.List r18 = r9.getSymbols()
            java.util.Iterator r18 = r18.iterator()
        L_0x00ef:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L_0x0107
            java.lang.Object r19 = r18.next()
            com.google.android.gms.internal.firebase_ml.zzkn r19 = (com.google.android.gms.internal.firebase_ml.zzkn) r19
            r23 = r4
            java.lang.String r4 = r19.getText()
            r15.append(r4)
            r4 = r23
            goto L_0x00ef
        L_0x0107:
            r23 = r4
            java.lang.String r4 = r15.toString()
        L_0x010d:
            boolean r15 = r4.isEmpty()
            if (r15 == 0) goto L_0x0117
            r24 = r6
            r15 = 0
            goto L_0x0122
        L_0x0117:
            com.google.firebase.ml.vision.text.FirebaseVisionText$Element r15 = new com.google.firebase.ml.vision.text.FirebaseVisionText$Element
            r24 = r6
            java.lang.Float r6 = r9.getConfidence()
            r15.<init>(r4, r3, r2, r6)
        L_0x0122:
            if (r15 == 0) goto L_0x01a0
            r12.add(r15)
            java.lang.Float r2 = r15.getConfidence()
            float r2 = com.google.android.gms.internal.firebase_ml.zzpy.zza(r2)
            float r2 = r16 + r2
            java.util.List r3 = r15.getRecognizedLanguages()
            r13.addAll(r3)
            java.lang.String r3 = r15.getText()
            r14.append(r3)
            java.lang.String r3 = "Input word can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r3)
            java.lang.String r4 = zza(r9)
            java.lang.String r6 = "HYPHEN"
            if (r4 == 0) goto L_0x0168
            java.lang.String r15 = "SPACE"
            boolean r15 = r4.equals(r15)
            if (r15 != 0) goto L_0x0166
            java.lang.String r15 = "SURE_SPACE"
            boolean r15 = r4.equals(r15)
            if (r15 == 0) goto L_0x015d
            goto L_0x0166
        L_0x015d:
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0168
            java.lang.String r17 = "-"
            goto L_0x0168
        L_0x0166:
            java.lang.String r17 = " "
        L_0x0168:
            r4 = r17
            r14.append(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r3)
            java.lang.String r3 = zza(r9)
            if (r3 == 0) goto L_0x018e
            java.lang.String r4 = "EOL_SURE_SPACE"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x018c
            java.lang.String r4 = "LINE_BREAK"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x018c
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x018e
        L_0x018c:
            r3 = 1
            goto L_0x018f
        L_0x018e:
            r3 = 0
        L_0x018f:
            if (r3 != 0) goto L_0x01a3
            java.util.List r3 = r8.getWords()
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            if (r7 != r3) goto L_0x019e
            goto L_0x01a4
        L_0x019e:
            r16 = r2
        L_0x01a0:
            r9 = 0
            goto L_0x0247
        L_0x01a3:
            r4 = 1
        L_0x01a4:
            java.lang.String r3 = "Input elements can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12, r3)
            r3 = r12
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r6 = r3.size()
            r9 = 0
            r18 = 0
        L_0x01b3:
            if (r9 >= r6) goto L_0x01da
            java.lang.Object r15 = r3.get(r9)
            int r9 = r9 + 1
            com.google.firebase.ml.vision.text.FirebaseVisionText$Element r15 = (com.google.firebase.ml.vision.text.FirebaseVisionText.Element) r15
            android.graphics.Rect r16 = r15.getBoundingBox()
            if (r16 == 0) goto L_0x01d8
            if (r18 != 0) goto L_0x01cd
            android.graphics.Rect r16 = new android.graphics.Rect
            r16.<init>()
            r4 = r16
            goto L_0x01cf
        L_0x01cd:
            r4 = r18
        L_0x01cf:
            android.graphics.Rect r15 = r15.getBoundingBox()
            r4.union(r15)
            r18 = r4
        L_0x01d8:
            r4 = 1
            goto L_0x01b3
        L_0x01da:
            com.google.firebase.ml.vision.text.FirebaseVisionText$Line r3 = new com.google.firebase.ml.vision.text.FirebaseVisionText$Line
            java.lang.String r17 = r14.toString()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r13.iterator()
        L_0x01e9:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x020b
            java.lang.Object r9 = r6.next()
            com.google.firebase.ml.vision.text.RecognizedLanguage r9 = (com.google.firebase.ml.vision.text.RecognizedLanguage) r9
            if (r9 == 0) goto L_0x01e9
            java.lang.String r14 = r9.getLanguageCode()
            if (r14 == 0) goto L_0x01e9
            java.lang.String r14 = r9.getLanguageCode()
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x01e9
            r4.add(r9)
            goto L_0x01e9
        L_0x020b:
            r9 = 0
            int r6 = java.lang.Float.compare(r2, r9)
            if (r6 <= 0) goto L_0x021f
            int r6 = r12.size()
            float r6 = (float) r6
            float r2 = r2 / r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r21 = r2
            goto L_0x0221
        L_0x021f:
            r21 = 0
        L_0x0221:
            r16 = r3
            r19 = r4
            r20 = r12
            r16.<init>(r17, r18, r19, r20, r21)
            r10.add(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r13.clear()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r12 = r2
            r14 = r3
            r16 = 0
            goto L_0x0247
        L_0x023f:
            r22 = r2
            r23 = r4
            r24 = r6
            goto L_0x01a0
        L_0x0247:
            int r7 = r7 + 1
            r2 = r22
            r4 = r23
            r6 = r24
            r3 = 1
            goto L_0x00a5
        L_0x0252:
            r22 = r2
            r23 = r4
            r24 = r6
            r11.addAll(r10)
            r3 = 1
            goto L_0x007b
        L_0x025e:
            r22 = r2
            r23 = r4
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x026a
            goto L_0x0070
        L_0x026a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r11
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r9 = 0
        L_0x0277:
            if (r9 >= r4) goto L_0x028e
            java.lang.Object r6 = r3.get(r9)
            int r9 = r9 + 1
            com.google.firebase.ml.vision.text.FirebaseVisionText$Line r6 = (com.google.firebase.ml.vision.text.FirebaseVisionText.Line) r6
            java.lang.String r6 = r6.getText()
            r2.append(r6)
            java.lang.String r6 = "\n"
            r2.append(r6)
            goto L_0x0277
        L_0x028e:
            com.google.android.gms.internal.firebase_ml.zzkp r3 = r5.zzib()
            java.util.List r10 = zze(r3)
            com.google.firebase.ml.vision.text.FirebaseVisionText$TextBlock r3 = new com.google.firebase.ml.vision.text.FirebaseVisionText$TextBlock
            java.lang.String r8 = r2.toString()
            com.google.android.gms.internal.firebase_ml.zzjr r2 = r5.zzia()
            android.graphics.Rect r9 = com.google.android.gms.internal.firebase_ml.zzpy.zza(r2, r0)
            java.lang.Float r12 = r5.getConfidence()
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x02ac:
            if (r7 == 0) goto L_0x02b1
            r1.add(r7)
        L_0x02b1:
            r2 = r22
            r4 = r23
            r3 = 1
            goto L_0x0050
        L_0x02b8:
            com.google.firebase.ml.vision.text.FirebaseVisionText r0 = new com.google.firebase.ml.vision.text.FirebaseVisionText
            java.lang.String r2 = r25.getText()
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzrg.zzb(com.google.android.gms.internal.firebase_ml.zzkq, float):com.google.firebase.ml.vision.text.FirebaseVisionText");
    }

    public static List<RecognizedLanguage> zze(@Nullable zzkp zzkp) {
        ArrayList arrayList = new ArrayList();
        if (!(zzkp == null || zzkp.zzij() == null)) {
            for (zzjv zza : zzkp.zzij()) {
                RecognizedLanguage zza2 = RecognizedLanguage.zza(zza);
                if (zza2 != null) {
                    arrayList.add(zza2);
                }
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    @Nullable
    private static String zza(@NonNull zzkt zzkt) {
        Preconditions.checkNotNull(zzkt, "Input Word can not be null");
        if (zzkt.getSymbols() == null || zzkt.getSymbols().isEmpty()) {
            return null;
        }
        zzkn zzkn = (zzkn) zzmc.zzc(zzkt.getSymbols());
        if (zzkn.zzib() == null || zzkn.zzib().zzii() == null) {
            return null;
        }
        return ((zzkn) zzmc.zzc(zzkt.getSymbols())).zzib().zzii().getType();
    }
}
