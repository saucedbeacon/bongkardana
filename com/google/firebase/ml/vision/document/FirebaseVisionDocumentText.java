package com.google.firebase.ml.vision.document;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzjs;
import com.google.android.gms.internal.firebase_ml.zzjv;
import com.google.android.gms.internal.firebase_ml.zzkh;
import com.google.android.gms.internal.firebase_ml.zzkk;
import com.google.android.gms.internal.firebase_ml.zzkn;
import com.google.android.gms.internal.firebase_ml.zzkp;
import com.google.android.gms.internal.firebase_ml.zzkq;
import com.google.android.gms.internal.firebase_ml.zzkt;
import com.google.android.gms.internal.firebase_ml.zzlx;
import com.google.android.gms.internal.firebase_ml.zzmb;
import com.google.android.gms.internal.firebase_ml.zzpy;
import com.google.android.gms.internal.firebase_ml.zzrg;
import com.google.firebase.ml.vision.text.RecognizedLanguage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class FirebaseVisionDocumentText {
    private static final FirebaseVisionDocumentText zzbhy = new FirebaseVisionDocumentText("", new ArrayList());
    private final List<Block> blocks;
    private final String text;

    public static class Block extends DocumentTextBase {
        private final List<Paragraph> paragraphs;

        @NonNull
        public List<Paragraph> getParagraphs() {
            return this.paragraphs;
        }

        private Block(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull List<Paragraph> list2, @NonNull String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.paragraphs = list2;
        }

        /* access modifiers changed from: private */
        public static Block zza(@NonNull zzjs zzjs, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zzrg.zze(zzjs.zzib());
            if (zzjs.getParagraphs() != null) {
                for (zzkk next : zzjs.getParagraphs()) {
                    if (next != null) {
                        Paragraph zzb = Paragraph.zza(next, f);
                        if (sb.length() != 0) {
                            sb.append("\n");
                        }
                        sb.append(zzb.getText());
                        arrayList.add(zzb);
                    }
                }
            }
            return new Block(zze, new RecognizedBreak(), zzpy.zza(zzjs.zzia(), f), arrayList, sb.toString(), zzjs.getConfidence());
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    public static class Paragraph extends DocumentTextBase {
        private final List<Word> words;

        @NonNull
        public List<Word> getWords() {
            return this.words;
        }

        private Paragraph(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull List<Word> list2, @NonNull String str, @Nullable Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.words = list2;
        }

        /* access modifiers changed from: private */
        public static Paragraph zza(@NonNull zzkk zzkk, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zzrg.zze(zzkk.zzib());
            if (zzkk.getWords() != null) {
                for (zzkt next : zzkk.getWords()) {
                    if (next != null) {
                        Word zzb = Word.zza(next, f);
                        sb.append(zzb.getText());
                        sb.append(FirebaseVisionDocumentText.zza(zzb.getRecognizedBreak()));
                        arrayList.add(zzb);
                    }
                }
            }
            return new Paragraph(zze, new RecognizedBreak(), zzpy.zza(zzkk.zzia(), f), arrayList, sb.toString(), zzkk.getConfidence());
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    public static class RecognizedBreak {
        public static final int EOL_SURE_SPACE = 3;
        public static final int HYPHEN = 4;
        public static final int LINE_BREAK = 5;
        public static final int SPACE = 1;
        public static final int SURE_SPACE = 2;
        public static final int UNKNOWN = 0;
        @BreakType
        private final int type;
        private final boolean zzbib;

        @Retention(RetentionPolicy.CLASS)
        public @interface BreakType {
        }

        @BreakType
        public int getDetectedBreakType() {
            return this.type;
        }

        public boolean getIsPrefix() {
            return this.zzbib;
        }

        private RecognizedBreak(@BreakType int i, boolean z) {
            this.type = i;
            this.zzbib = z;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.firebase.ml.vision.document.FirebaseVisionDocumentText.RecognizedBreak zzc(@androidx.annotation.Nullable com.google.android.gms.internal.firebase_ml.zzkp r8) {
            /*
                if (r8 == 0) goto L_0x008b
                com.google.android.gms.internal.firebase_ml.zzjw r0 = r8.zzii()
                if (r0 != 0) goto L_0x000a
                goto L_0x008b
            L_0x000a:
                com.google.android.gms.internal.firebase_ml.zzjw r0 = r8.zzii()
                java.lang.String r0 = r0.getType()
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L_0x006e
                com.google.android.gms.internal.firebase_ml.zzjw r0 = r8.zzii()
                java.lang.String r0 = r0.getType()
                r6 = -1
                int r7 = r0.hashCode()
                switch(r7) {
                    case -1651884996: goto L_0x0052;
                    case -1571028039: goto L_0x0048;
                    case 79100134: goto L_0x003e;
                    case 1541383380: goto L_0x0034;
                    case 2145946930: goto L_0x002a;
                    default: goto L_0x0029;
                }
            L_0x0029:
                goto L_0x005b
            L_0x002a:
                java.lang.String r7 = "HYPHEN"
                boolean r0 = r0.equals(r7)
                if (r0 == 0) goto L_0x005b
                r6 = 3
                goto L_0x005b
            L_0x0034:
                java.lang.String r7 = "LINE_BREAK"
                boolean r0 = r0.equals(r7)
                if (r0 == 0) goto L_0x005b
                r6 = 4
                goto L_0x005b
            L_0x003e:
                java.lang.String r7 = "SPACE"
                boolean r0 = r0.equals(r7)
                if (r0 == 0) goto L_0x005b
                r6 = 0
                goto L_0x005b
            L_0x0048:
                java.lang.String r7 = "EOL_SURE_SPACE"
                boolean r0 = r0.equals(r7)
                if (r0 == 0) goto L_0x005b
                r6 = 2
                goto L_0x005b
            L_0x0052:
                java.lang.String r7 = "SURE_SPACE"
                boolean r0 = r0.equals(r7)
                if (r0 == 0) goto L_0x005b
                r6 = 1
            L_0x005b:
                if (r6 == 0) goto L_0x006c
                if (r6 == r4) goto L_0x006a
                if (r6 == r3) goto L_0x0068
                if (r6 == r2) goto L_0x006f
                if (r6 == r1) goto L_0x0066
                goto L_0x006e
            L_0x0066:
                r1 = 5
                goto L_0x006f
            L_0x0068:
                r1 = 3
                goto L_0x006f
            L_0x006a:
                r1 = 2
                goto L_0x006f
            L_0x006c:
                r1 = 1
                goto L_0x006f
            L_0x006e:
                r1 = 0
            L_0x006f:
                com.google.android.gms.internal.firebase_ml.zzjw r0 = r8.zzii()
                java.lang.Boolean r0 = r0.zzic()
                if (r0 == 0) goto L_0x0085
                com.google.android.gms.internal.firebase_ml.zzjw r8 = r8.zzii()
                java.lang.Boolean r8 = r8.zzic()
                boolean r5 = r8.booleanValue()
            L_0x0085:
                com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak r8 = new com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak
                r8.<init>(r1, r5)
                return r8
            L_0x008b:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText.RecognizedBreak.zzc(com.google.android.gms.internal.firebase_ml.zzkp):com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak");
        }
    }

    public static class Word extends DocumentTextBase {
        private final List<Symbol> symbols;

        @NonNull
        public List<Symbol> getSymbols() {
            return this.symbols;
        }

        private Word(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull List<Symbol> list2, @NonNull String str, @Nullable Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.symbols = list2;
        }

        /* access modifiers changed from: private */
        public static Word zza(@NonNull zzkt zzkt, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zzrg.zze(zzkt.zzib());
            RecognizedBreak recognizedBreak = null;
            if (zzkt.getSymbols() != null) {
                for (zzkn next : zzkt.getSymbols()) {
                    if (next != null) {
                        Symbol zzb = Symbol.zza(next, f);
                        RecognizedBreak recognizedBreak2 = zzb.getRecognizedBreak();
                        sb.append(zzb.getText());
                        arrayList.add(Symbol.zza(next, f));
                        recognizedBreak = recognizedBreak2;
                    }
                }
            }
            return new Word(zze, recognizedBreak, zzpy.zza(zzkt.zzia(), f), arrayList, sb.toString(), zzkt.getConfidence());
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    @NonNull
    public List<Block> getBlocks() {
        return this.blocks;
    }

    public static class Symbol extends DocumentTextBase {
        private Symbol(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
        }

        /* access modifiers changed from: private */
        public static Symbol zza(@NonNull zzkn zzkn, float f) {
            return new Symbol(FirebaseVisionDocumentText.zza(zzkn.zzib()), RecognizedBreak.zzc(zzkn.zzib()), zzpy.zza(zzkn.zzia(), f), zzpy.zzca(zzkn.getText()), zzkn.getConfidence());
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    @NonNull
    public String getText() {
        return zzlx.zzay(this.text);
    }

    private FirebaseVisionDocumentText(@NonNull String str, @NonNull List<Block> list) {
        this.text = str;
        this.blocks = list;
    }

    static class DocumentTextBase {
        private final Float confidence;
        private final String text;
        private final Rect zzbhd;
        private final List<RecognizedLanguage> zzbhz;
        private final RecognizedBreak zzbia;

        DocumentTextBase(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull String str, @Nullable Float f) {
            this.text = str;
            this.zzbhz = list;
            this.zzbia = recognizedBreak;
            this.zzbhd = rect;
            this.confidence = f;
        }

        public String getText() {
            return this.text;
        }

        @Nullable
        public Rect getBoundingBox() {
            return this.zzbhd;
        }

        public List<RecognizedLanguage> getRecognizedLanguages() {
            return this.zzbhz;
        }

        @Nullable
        public RecognizedBreak getRecognizedBreak() {
            return this.zzbia;
        }

        @Nullable
        public Float getConfidence() {
            return this.confidence;
        }
    }

    static FirebaseVisionDocumentText zza(@Nullable zzkq zzkq, float f) {
        if (zzkq == null) {
            return zzbhy;
        }
        String zzca = zzpy.zzca(zzkq.getText());
        ArrayList arrayList = new ArrayList();
        if (zzkq.getPages() != null) {
            for (zzkh next : zzkq.getPages()) {
                if (next != null) {
                    for (zzjs next2 : next.getBlocks()) {
                        if (next2 != null) {
                            arrayList.add(Block.zza(next2, f));
                        }
                    }
                }
            }
        }
        return new FirebaseVisionDocumentText(zzca, arrayList);
    }

    /* access modifiers changed from: private */
    public static List<RecognizedLanguage> zza(@Nullable zzkp zzkp) {
        if (zzkp == null) {
            return zzmb.zziy();
        }
        ArrayList arrayList = new ArrayList();
        if (zzkp.zzij() != null) {
            for (zzjv zza : zzkp.zzij()) {
                RecognizedLanguage zza2 = RecognizedLanguage.zza(zza);
                if (zza2 != null) {
                    arrayList.add(zza2);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static String zza(@Nullable RecognizedBreak recognizedBreak) {
        if (recognizedBreak == null) {
            return "";
        }
        int detectedBreakType = recognizedBreak.getDetectedBreakType();
        if (detectedBreakType == 1 || detectedBreakType == 2) {
            return " ";
        }
        if (detectedBreakType != 3) {
            if (detectedBreakType == 4) {
                return "-\n";
            }
            if (detectedBreakType != 5) {
                return "";
            }
        }
        return "\n";
    }
}
