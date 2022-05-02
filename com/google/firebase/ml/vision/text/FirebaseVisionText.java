package com.google.firebase.ml.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmb;
import com.google.android.gms.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirebaseVisionText {
    public static final FirebaseVisionText zzbkg = new FirebaseVisionText("", new ArrayList());
    private final String text;
    private final List<TextBlock> zzbkh;

    @NonNull
    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.zzbkh);
    }

    public static class Element extends TextBase {
        Element(@NonNull com.google.android.gms.vision.text.Element element) {
            super(element);
        }

        public Element(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @Nullable Float f) {
            super(str, rect, list, f);
        }

        @NonNull
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @NonNull
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    public FirebaseVisionText(@NonNull SparseArray<com.google.android.gms.vision.text.TextBlock> sparseArray) {
        this.zzbkh = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sparseArray.size(); i++) {
            com.google.android.gms.vision.text.TextBlock textBlock = sparseArray.get(sparseArray.keyAt(i));
            if (textBlock != null) {
                TextBlock textBlock2 = new TextBlock(textBlock);
                this.zzbkh.add(textBlock2);
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                if (textBlock.getValue() != null) {
                    sb.append(textBlock2.getText());
                }
            }
        }
        this.text = sb.toString();
    }

    static class TextBase {
        private final Float confidence;
        private final Point[] cornerPoints;
        private final String text;
        private final Rect zzbhd;
        private final List<RecognizedLanguage> zzbhz;

        TextBase(@NonNull Text text2) {
            Preconditions.checkNotNull(text2, "Text to construct FirebaseVisionText classes can't be null");
            this.confidence = null;
            this.text = text2.getValue();
            this.zzbhd = text2.getBoundingBox();
            this.cornerPoints = text2.getCornerPoints();
            this.zzbhz = zzmb.zziy();
        }

        private TextBase(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @Nullable Float f) {
            Preconditions.checkNotNull(str, "Text string cannot be null");
            Preconditions.checkNotNull(list, "Text languages cannot be null");
            this.confidence = f;
            this.cornerPoints = null;
            this.text = str;
            this.zzbhd = rect;
            this.zzbhz = list;
        }

        @Nullable
        public Rect getBoundingBox() {
            return this.zzbhd;
        }

        @Nullable
        public Point[] getCornerPoints() {
            return this.cornerPoints;
        }

        @NonNull
        public String getText() {
            String str = this.text;
            return str == null ? "" : str;
        }

        @Nullable
        public Float getConfidence() {
            return this.confidence;
        }

        @NonNull
        public List<RecognizedLanguage> getRecognizedLanguages() {
            return this.zzbhz;
        }
    }

    public static class Line extends TextBase {
        @GuardedBy("this")
        private final List<Element> zzbki;

        Line(@NonNull com.google.android.gms.vision.text.Line line) {
            super(line);
            this.zzbki = new ArrayList();
            for (Text text : line.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Element) {
                    this.zzbki.add(new Element((com.google.android.gms.vision.text.Element) text));
                }
            }
        }

        public Line(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @NonNull List<Element> list2, @Nullable Float f) {
            super(str, rect, list, f);
            this.zzbki = list2;
        }

        @NonNull
        public synchronized List<Element> getElements() {
            return this.zzbki;
        }

        @NonNull
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @NonNull
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }
    }

    public static class TextBlock extends TextBase {
        @GuardedBy("this")
        private final List<Line> zzbkj;

        TextBlock(@NonNull com.google.android.gms.vision.text.TextBlock textBlock) {
            super(textBlock);
            this.zzbkj = new ArrayList();
            for (Text text : textBlock.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Line) {
                    this.zzbkj.add(new Line((com.google.android.gms.vision.text.Line) text));
                }
            }
        }

        public TextBlock(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @NonNull List<Line> list2, @Nullable Float f) {
            super(str, rect, list, f);
            this.zzbkj = list2;
        }

        @NonNull
        public synchronized List<Line> getLines() {
            return this.zzbkj;
        }

        @NonNull
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @NonNull
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }
    }

    public FirebaseVisionText(@NonNull String str, @NonNull List<TextBlock> list) {
        ArrayList arrayList = new ArrayList();
        this.zzbkh = arrayList;
        this.text = str;
        arrayList.addAll(list);
    }
}
