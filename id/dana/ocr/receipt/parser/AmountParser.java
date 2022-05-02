package id.dana.ocr.receipt.parser;

import android.annotation.SuppressLint;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.data.socialshare.ShareAppKey;
import id.dana.ocr.receipt.rule.Rule;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J(\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/ocr/receipt/parser/AmountParser;", "Lid/dana/ocr/receipt/parser/Parser3;", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "Lid/dana/ocr/receipt/rule/Rule;", "", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$TextBlock;", "", "()V", "EN_NUMBER_FORMAT", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "ID_NUMBER_FORMAT", "PATTERN_AMOUNT_SHOULD_HAVE_NUMBER", "Ljava/util/regex/Pattern;", "PATTERN_NOMINAL", "getAmountWithoutFormat", "amount", "parse", "line", "rule", "blocks", "library_release"}, k = 1, mv = {1, 1, 16})
public final class AmountParser implements Parser3<FirebaseVisionText.Line, Rule, List<? extends FirebaseVisionText.TextBlock>, String> {
    private static final NumberFormat getMax = NumberFormat.getNumberInstance(Locale.ENGLISH);
    /* access modifiers changed from: private */
    public static final Pattern getMin = Pattern.compile("[\\d]+");
    public static final AmountParser length = new AmountParser();
    /* access modifiers changed from: private */
    public static final Pattern setMax = Pattern.compile("(\\d+([,\\s\\\\.]*\\d+)+)");
    private static final NumberFormat setMin = NumberFormat.getNumberInstance(new Locale("ID"));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "totalKeyword", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ Ref.ObjectRef $lineText;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Ref.ObjectRef objectRef) {
            super(1);
            this.$lineText = objectRef;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "totalKeyword");
            if (!StringsKt.contains((CharSequence) (String) this.$lineText.element, (CharSequence) str, true) || StringsKt.contains((CharSequence) (String) this.$lineText.element, (CharSequence) "subtotal", true) || StringsKt.contains((CharSequence) (String) this.$lineText.element, (CharSequence) "sub total", true)) {
                return false;
            }
            return true;
        }
    }

    private AmountParser() {
    }

    @Nullable
    @SuppressLint({"DefaultLocale"})
    public static String length(@NotNull FirebaseVisionText.Line line, @NotNull Rule rule, @NotNull List<? extends FirebaseVisionText.TextBlock> list) {
        Intrinsics.checkParameterIsNotNull(line, ShareAppKey.LINE);
        Intrinsics.checkParameterIsNotNull(rule, "rule");
        Intrinsics.checkParameterIsNotNull(list, "blocks");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String text = line.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "line.text");
        if (text != null) {
            T lowerCase = text.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            objectRef.element = lowerCase;
            return (String) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(rule.setMax), new getMin(objectRef)), new setMax(objectRef, line, list)));
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMax extends Lambda implements Function1<String, String> {
        final /* synthetic */ List $blocks;
        final /* synthetic */ FirebaseVisionText.Line $line;
        final /* synthetic */ Ref.ObjectRef $lineText;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(Ref.ObjectRef objectRef, FirebaseVisionText.Line line, List list) {
            super(1);
            this.$lineText = objectRef;
            this.$line = line;
            this.$blocks = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[RETURN] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(@org.jetbrains.annotations.NotNull java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
                id.dana.ocr.receipt.parser.AmountParser r9 = id.dana.ocr.receipt.parser.AmountParser.length
                java.util.regex.Pattern r9 = id.dana.ocr.receipt.parser.AmountParser.getMin
                kotlin.jvm.internal.Ref$ObjectRef r0 = r8.$lineText
                T r0 = r0.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.util.regex.Matcher r9 = r9.matcher(r0)
                boolean r9 = r9.find()
                if (r9 == 0) goto L_0x0031
                kotlin.jvm.internal.Ref$ObjectRef r9 = r8.$lineText
                T r0 = r9.element
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                r4 = 0
                r5 = 4
                r6 = 0
                java.lang.String r2 = "o"
                java.lang.String r3 = "0"
                java.lang.String r0 = kotlin.text.StringsKt.replace$default((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
                r9.element = r0
            L_0x0031:
                id.dana.ocr.receipt.parser.AmountParser r9 = id.dana.ocr.receipt.parser.AmountParser.length
                java.util.regex.Pattern r9 = id.dana.ocr.receipt.parser.AmountParser.setMax
                kotlin.jvm.internal.Ref$ObjectRef r0 = r8.$lineText
                T r0 = r0.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.util.regex.Matcher r9 = r9.matcher(r0)
                boolean r0 = r9.find()
                r1 = 0
                if (r0 == 0) goto L_0x0050
                java.lang.String r9 = r9.group()
            L_0x004e:
                r2 = r9
                goto L_0x009f
            L_0x0050:
                com.google.firebase.ml.vision.text.FirebaseVisionText$Line r9 = r8.$line
                java.util.List r0 = r8.$blocks
                com.google.firebase.ml.vision.text.FirebaseVisionText$Line r9 = id.dana.ocr.receipt.util.LineUtils.setMax(r9, r0)
                if (r9 == 0) goto L_0x0081
                java.lang.String r9 = r9.getText()
                if (r9 == 0) goto L_0x0081
                if (r9 == 0) goto L_0x0079
                java.lang.String r2 = r9.toLowerCase()
                java.lang.String r9 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r9)
                if (r2 == 0) goto L_0x0081
                r5 = 0
                r6 = 4
                r7 = 0
                java.lang.String r3 = "o"
                java.lang.String r4 = "0"
                java.lang.String r9 = kotlin.text.StringsKt.replace$default((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (boolean) r5, (int) r6, (java.lang.Object) r7)
                goto L_0x0082
            L_0x0079:
                kotlin.TypeCastException r9 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r9.<init>(r0)
                throw r9
            L_0x0081:
                r9 = r1
            L_0x0082:
                id.dana.ocr.receipt.parser.AmountParser r0 = id.dana.ocr.receipt.parser.AmountParser.length
                java.util.regex.Pattern r0 = id.dana.ocr.receipt.parser.AmountParser.setMax
                if (r9 == 0) goto L_0x008b
                goto L_0x008d
            L_0x008b:
                java.lang.String r9 = ""
            L_0x008d:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                java.util.regex.Matcher r9 = r0.matcher(r9)
                boolean r0 = r9.find()
                if (r0 == 0) goto L_0x009e
                java.lang.String r9 = r9.group()
                goto L_0x004e
            L_0x009e:
                r2 = r1
            L_0x009f:
                if (r2 == 0) goto L_0x00b3
                id.dana.ocr.receipt.parser.AmountParser r9 = id.dana.ocr.receipt.parser.AmountParser.length
                r5 = 0
                r6 = 4
                r7 = 0
                java.lang.String r3 = " "
                java.lang.String r4 = ""
                java.lang.String r9 = kotlin.text.StringsKt.replace$default((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (boolean) r5, (int) r6, (java.lang.Object) r7)
                java.lang.String r9 = id.dana.ocr.receipt.parser.AmountParser.getMin(r9)
                return r9
            L_0x00b3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.receipt.parser.AmountParser.setMax.invoke(java.lang.String):java.lang.String");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (0 < r2) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMin(java.lang.String r6) {
        /*
            r0 = 0
            java.text.NumberFormat r2 = setMin     // Catch:{ Exception -> 0x0015 }
            java.lang.Number r2 = r2.parse(r6)     // Catch:{ Exception -> 0x0015 }
            if (r2 == 0) goto L_0x000f
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x0015 }
            goto L_0x0010
        L_0x000f:
            r2 = r0
        L_0x0010:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            java.text.NumberFormat r4 = getMax     // Catch:{ Exception -> 0x002a }
            java.lang.Number r6 = r4.parse(r6)     // Catch:{ Exception -> 0x002a }
            if (r6 == 0) goto L_0x0023
            long r4 = r6.longValue()     // Catch:{ Exception -> 0x002a }
            goto L_0x0024
        L_0x0023:
            r4 = r0
        L_0x0024:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x002b
            r2 = r4
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0031
            r6 = 0
            return r6
        L_0x0031:
            java.lang.String r6 = java.lang.String.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.receipt.parser.AmountParser.getMin(java.lang.String):java.lang.String");
    }
}
