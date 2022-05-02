package id.dana.ocr.receipt.parser;

import android.annotation.SuppressLint;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.data.socialshare.ShareAppKey;
import id.dana.ocr.receipt.rule.Rule;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0017J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0003R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/ocr/receipt/parser/TimeParser;", "Lid/dana/ocr/receipt/parser/Parser2;", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "Lid/dana/ocr/receipt/rule/Rule;", "", "()V", "EXCLUDE_PATTERN", "", "NON_TIME_CHARACTERS", "PATTERN_REGEX_AM_PM", "PATTERN_REGEX_TIME_NUMBER", "standardTimeFormatter", "Ljava/text/SimpleDateFormat;", "isContainAnyCharAfterMatch", "", "match", "source", "mapToRegex", "pattern", "parse", "line", "rule", "standardizeTimeFormat", "timeStr", "timePattern", "library_release"}, k = 1, mv = {1, 1, 16})
public final class TimeParser implements Parser2<FirebaseVisionText.Line, Rule, String> {
    public static final TimeParser getMax = new TimeParser();
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat length = new SimpleDateFormat("HH:mm:ss");
    private static final List<String> setMax = CollectionsKt.listOf("%");
    /* access modifiers changed from: private */
    public static final List<String> setMin = CollectionsKt.listOf("HH-mm-ss", "HH-mm");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function1<String, Boolean> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            TimeParser timeParser = TimeParser.getMax;
            return TimeParser.setMin.contains(str);
        }
    }

    private TimeParser() {
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SimpleDateFormat"})
    public static String length(String str, String str2) {
        try {
            Date parse = new SimpleDateFormat(str2).parse(str);
            if (parse != null) {
                return length.format(parse);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    @SuppressLint({"DefaultLocale"})
    public static String setMin(@NotNull FirebaseVisionText.Line line, @NotNull Rule rule) {
        Intrinsics.checkParameterIsNotNull(line, ShareAppKey.LINE);
        Intrinsics.checkParameterIsNotNull(rule, "rule");
        String text = line.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "line.text");
        if (text != null) {
            String lowerCase = text.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            Iterable iterable = setMax;
            boolean z = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) (String) it.next(), false, 2, (Object) null)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                return null;
            }
            return (String) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(SequencesKt.map(SequencesKt.filterNot(CollectionsKt.asSequence(CollectionsKt.sortedWith(rule.getMin, new TimeParser$parse$$inlined$sortedByDescending$1())), length.INSTANCE), setMin.INSTANCE), new getMin(lowerCase))));
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "it", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        @NotNull
        public final Pair<String, String> invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            TimeParser timeParser = TimeParser.getMax;
            return TuplesKt.to(str, TimeParser.setMax(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<Pair<? extends String, ? extends String>, String> {
        final /* synthetic */ String $lineText;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(String str) {
            super(1);
            this.$lineText = str;
        }

        @Nullable
        public final String invoke(@NotNull Pair<String, String> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            Matcher matcher = Pattern.compile(pair.component2()).matcher(this.$lineText);
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group();
            TimeParser timeParser = TimeParser.getMax;
            Intrinsics.checkExpressionValueIsNotNull(group, TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME);
            if (TimeParser.setMax(group, this.$lineText)) {
                return null;
            }
            TimeParser timeParser2 = TimeParser.getMax;
            return TimeParser.length(group, component1);
        }
    }

    /* access modifiers changed from: private */
    public static boolean setMax(String str, String str2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null) + str.length();
        return indexOf$default != str2.length() && !CharsKt.isWhitespace(str2.charAt(indexOf$default));
    }

    public static final /* synthetic */ String setMax(String str) {
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "HH", "\\s*\\d{1,2}", false, 4, (Object) null), "hh", "\\s*\\d{1,2}", false, 4, (Object) null), "mm", "\\d{1,2}", false, 4, (Object) null), "ss", "\\d{1,2}", false, 4, (Object) null), ".", "\\.", false, 4, (Object) null), "a", "(am|pm)", false, 4, (Object) null), " ", "\\s", false, 4, (Object) null);
        StringBuilder sb = new StringBuilder("(");
        sb.append(replace$default);
        sb.append(')');
        return sb.toString();
    }
}
