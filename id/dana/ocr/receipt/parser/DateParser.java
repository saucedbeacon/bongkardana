package id.dana.ocr.receipt.parser;

import android.annotation.SuppressLint;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.ocr.receipt.rule.Rule;
import id.dana.statement.view.StatementDateView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\"\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0004H\u0003J\"\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0003R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/ocr/receipt/parser/DateParser;", "Lid/dana/ocr/receipt/parser/Parser2;", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "Lid/dana/ocr/receipt/rule/Rule;", "", "()V", "LANG_EN", "LANG_ID", "LOCALES", "", "Ljava/util/Locale;", "REGEX_DATE_NUMBER", "REGEX_FULL_YEAR_NUMBER", "REGEX_MMMM_EN", "REGEX_MMMM_ID", "REGEX_MMM_EN", "REGEX_MMM_ID", "REGEX_MONTH_NUMBER", "REGEX_REDACTED_YEAR_NUMBER", "standardDateFormatter", "Ljava/text/SimpleDateFormat;", "isContainAnyCharAfterMatch", "", "match", "source", "isContainAnyCharBeforeMatch", "mapToRegex", "pattern", "language", "parse", "line", "rule", "parseLang", "standardizeDateFormat", "dateStr", "datePattern", "library_release"}, k = 1, mv = {1, 1, 16})
public final class DateParser implements Parser2<FirebaseVisionText.Line, Rule, String> {
    public static final DateParser length = new DateParser();
    private static final Map<String, Locale> setMax = MapsKt.mapOf(TuplesKt.to("ID", new Locale("ID")), TuplesKt.to("EN", new Locale("EN")));
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat setMin = new SimpleDateFormat("dd-MM-yyyy");

    private DateParser() {
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SimpleDateFormat"})
    public static String length(String str, String str2, String str3) {
        try {
            Locale locale = setMax.get(str3);
            if (locale == null) {
                locale = Locale.ENGLISH;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
            }
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            if (parse != null) {
                return setMin.format(parse);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static String getMin(FirebaseVisionText.Line line, Rule rule, String str) {
        String text = line.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "line.text");
        if (text != null) {
            String lowerCase = text.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            return (String) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(SequencesKt.map(CollectionsKt.asSequence(rule.getMax), new length(str)), new getMin(lowerCase, str))));
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "it", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {
        final /* synthetic */ String $language;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(String str) {
            super(1);
            this.$language = str;
        }

        @NotNull
        public final Pair<String, String> invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            DateParser dateParser = DateParser.length;
            return TuplesKt.to(str, DateParser.getMin(str, this.$language));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<Pair<? extends String, ? extends String>, String> {
        final /* synthetic */ String $language;
        final /* synthetic */ String $lineText;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(String str, String str2) {
            super(1);
            this.$lineText = str;
            this.$language = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (id.dana.ocr.receipt.parser.DateParser.setMin(r1, r7.$lineText) != false) goto L_0x0050;
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, java.lang.String> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                java.lang.Object r0 = r8.component1()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r8 = r8.component2()
                java.lang.String r8 = (java.lang.String) r8
                java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
                java.lang.String r1 = r7.$lineText
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.util.regex.Matcher r8 = r8.matcher(r1)
                boolean r1 = r8.find()
                r2 = 0
                if (r1 == 0) goto L_0x0063
                java.lang.String r1 = r8.group()
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.String r4 = "-"
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r5 = 0
                r6 = 2
                boolean r3 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r4, (boolean) r5, (int) r6, (java.lang.Object) r2)
                if (r3 == 0) goto L_0x0051
                id.dana.ocr.receipt.parser.DateParser r3 = id.dana.ocr.receipt.parser.DateParser.length
                java.lang.String r3 = "date"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                java.lang.String r3 = r7.$lineText
                boolean r3 = id.dana.ocr.receipt.parser.DateParser.length(r1, r3)
                if (r3 != 0) goto L_0x0050
                id.dana.ocr.receipt.parser.DateParser r3 = id.dana.ocr.receipt.parser.DateParser.length
                java.lang.String r3 = r7.$lineText
                boolean r1 = id.dana.ocr.receipt.parser.DateParser.getMax(r1, r3)
                if (r1 == 0) goto L_0x0051
            L_0x0050:
                return r2
            L_0x0051:
                id.dana.ocr.receipt.parser.DateParser r1 = id.dana.ocr.receipt.parser.DateParser.length
                java.lang.String r8 = r8.group()
                java.lang.String r1 = "matcher.group()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r1)
                java.lang.String r1 = r7.$language
                java.lang.String r8 = id.dana.ocr.receipt.parser.DateParser.length(r8, r0, r1)
                return r8
            L_0x0063:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.receipt.parser.DateParser.getMin.invoke(kotlin.Pair):java.lang.String");
        }
    }

    /* access modifiers changed from: private */
    public static boolean length(String str, String str2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null) + str.length();
        return indexOf$default != str2.length() && !CharsKt.isWhitespace(str2.charAt(indexOf$default));
    }

    /* access modifiers changed from: private */
    public static boolean getMax(String str, String str2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null) - 1;
        if (indexOf$default < 0 || CharsKt.isWhitespace(str2.charAt(indexOf$default))) {
            return false;
        }
        return true;
    }

    public static final /* synthetic */ String getMin(String str, String str2) {
        String replace$default = StringsKt.replace$default(str, "dd", "\\d{1,2}", false, 4, (Object) null);
        CharSequence charSequence = replace$default;
        if (StringsKt.contains$default(charSequence, (CharSequence) "yyyy", false, 2, (Object) null)) {
            replace$default = StringsKt.replace$default(replace$default, "yyyy", "\\d{4}", false, 4, (Object) null);
        } else if (StringsKt.contains$default(charSequence, (CharSequence) "yy", false, 2, (Object) null)) {
            replace$default = StringsKt.replace$default(replace$default, "yy", "\\d{2}", false, 4, (Object) null);
        }
        String str3 = replace$default;
        if (Intrinsics.areEqual((Object) str2, (Object) "ID")) {
            CharSequence charSequence2 = str3;
            if (StringsKt.contains$default(charSequence2, (CharSequence) StatementDateView.FULL_MONTH, false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str3, StatementDateView.FULL_MONTH, "(januari|februari|maret|april|mei|juni|juli|agustus|september|oktober|november|desember)", false, 4, (Object) null);
            } else if (StringsKt.contains$default(charSequence2, (CharSequence) StatementDateView.SHORT_MONTH, false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str3, StatementDateView.SHORT_MONTH, "(jan|feb|mar|apr|mei|jun|jul|agu|sep|okt|nov|des)", false, 4, (Object) null);
            } else if (StringsKt.contains$default(charSequence2, (CharSequence) "MM", false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str3, "MM", "\\d{1,2}", false, 4, (Object) null);
            }
        } else if (Intrinsics.areEqual((Object) str2, (Object) "EN")) {
            CharSequence charSequence3 = str3;
            if (StringsKt.contains$default(charSequence3, (CharSequence) StatementDateView.FULL_MONTH, false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str3, StatementDateView.FULL_MONTH, "(january|february|march|april|may|june|july|august|september|october|november|december)", false, 4, (Object) null);
            } else if (StringsKt.contains$default(charSequence3, (CharSequence) StatementDateView.SHORT_MONTH, false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str3, StatementDateView.SHORT_MONTH, "(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)", false, 4, (Object) null);
            } else if (StringsKt.contains$default(charSequence3, (CharSequence) "MM", false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str3, "MM", "\\d{1,2}", false, 4, (Object) null);
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str3);
        sb.append(')');
        return sb.toString();
    }
}
