package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.annotation.FontRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import id.dana.R;
import id.dana.utils.deeplink.DeepLinkConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lid/dana/social/utils/RegexUtils;", "", "()V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class initContentView {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00152&\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0018j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J.\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0006\u0010*\u001a\u00020$H\u0002J)\u0010+\u001a\u00020,2\u0006\u0010*\u001a\u00020$2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010-\u001a\u00020.H\u0002¢\u0006\u0002\u0010/J&\u00100\u001a\u00020\u00042\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u0004H\u0002J0\u00102\u001a\u00020\u00042&\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0018j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0019H\u0002J\u0018\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002J$\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000409J)\u0010:\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010-\u001a\u00020.¢\u0006\u0002\u0010/J\b\u0010;\u001a\u00020.H\u0002J\u0012\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u0002J\u001e\u0010>\u001a\u00020.2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0018H\u0002J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010*\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/social/utils/RegexUtils$Companion;", "", "()V", "CONTENT_ACTOR", "", "CONTENT_ACTOR_REDIRECT_KEY", "CONTENT_LUCKY_MONEY", "CONTENT_REDIRECT_KEY", "DISPLAY_NAME", "DISPLAY_NAME_EN", "DISPLAY_NAME_ID", "GENERIC_PATTERN", "LUCKY_MONEY_DEFAULT", "LUCKY_MONEY_REPLACE_URL", "NICKNAME_NAME", "REGEX_ACTOR_MERCHANT", "REGEX_JSON", "REGEX_START_INDEX", "", "REGEX_STRING_ONLY", "appendPatternWithDisplayName", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "changeFontType", "Landroid/text/style/MetricAffectingSpan;", "fontType", "context", "Landroid/content/Context;", "createClickableSpan", "Landroid/text/style/ClickableSpan;", "content", "Lid/dana/social/utils/Content;", "feedRegexData", "Lid/dana/social/utils/FeedRegexData;", "doRegex", "fullText", "result", "contents", "", "feedModel", "findMatch", "Landroid/text/Spannable;", "actorTextBold", "", "(Lid/dana/social/utils/FeedRegexData;Ljava/lang/Integer;Z)Landroid/text/Spannable;", "getActorContentForReplace", "getDisplayNameLocaleAdjusted", "getDisplayNameWithLuckyMoneyBugSpecialCase", "getMaxRange", "firstIndex", "valueLen", "getRedirectValue", "type", "map", "", "getReplacedFeedText", "isCurrentLocaleIndo", "isJson", "text", "isLuckyMoneyInMyFeed", "processText", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<MatchResult, String> {
            final /* synthetic */ HashMap $extendInfo;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(HashMap hashMap) {
                super(1);
                this.$extendInfo = hashMap;
            }

            @NotNull
            public final String invoke(@NotNull MatchResult matchResult) {
                String str;
                Intrinsics.checkNotNullParameter(matchResult, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(StringsKt.removeSuffix(matchResult.getValue(), (CharSequence) "%"));
                sb.append('.');
                setMin setmin = initContentView.getMin;
                String str2 = (String) this.$extendInfo.get("luckyMoneyDisplay");
                if (str2 == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) "\"displayName\"", false, 2, (Object) null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(setMin.length() ? "displayNameID" : "displayNameEN");
                    sb2.append('%');
                    str = sb2.toString();
                } else {
                    str = "displayName%";
                }
                sb.append(str);
                return sb.toString();
            }
        }

        private static boolean length(HashMap<String, String> hashMap) {
            return hashMap.get(setBuildNumber.ACTOR_KEY) == null;
        }

        static boolean length() {
            String obj = Locale.getDefault().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "Locale.getDefault().toString()");
            return StringsKt.endsWith$default(obj, "ID", false, 2, (Object) null);
        }

        private static Spannable getMin(AUMaskImage aUMaskImage, @FontRes Integer num, boolean z) {
            String max = setMax(aUMaskImage);
            CharSequence charSequence = max;
            Sequence<MatchResult> findAll = new Regex("\\%{1}\\w{1,}\\.\\w{1,}\\%{1}").findAll(charSequence, 0);
            if (SequencesKt.count(findAll) > 0) {
                List<AUHorizontalListView.SavedState.AnonymousClass1> arrayList = new ArrayList<>();
                for (MatchResult value : findAll) {
                    MatchResult find = new Regex(value.getValue()).find(max, 0);
                    if (find != null) {
                        setMin setmin = initContentView.getMin;
                        max = setMin(max, find, arrayList, aUMaskImage);
                    }
                }
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(max);
                for (AUHorizontalListView.SavedState.AnonymousClass1 r2 : arrayList) {
                    if (!z || !Intrinsics.areEqual((Object) r2.length, (Object) setBuildNumber.ACTOR_KEY)) {
                        setMin setmin2 = initContentView.getMin;
                        Intrinsics.checkNotNullParameter(r2, "content");
                        Intrinsics.checkNotNullParameter(aUMaskImage, "feedRegexData");
                        newSpannable.setSpan(new setMax(r2, aUMaskImage), r2.getMax.getFirst(), r2.getMax.getLast(), 33);
                        if (num != null) {
                            int intValue = num.intValue();
                            setMin setmin3 = initContentView.getMin;
                            Context context = aUMaskImage.length;
                            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                            newSpannable.setSpan(new C0061setMin(context, intValue), r2.getMax.getFirst(), r2.getMax.getLast(), 33);
                        }
                    } else {
                        newSpannable.setSpan(new StyleSpan(1), r2.getMax.getFirst(), r2.getMax.getLast(), 33);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(newSpannable, "Spannable.Factory.getIns…      }\n                }");
                return newSpannable;
            }
            Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(charSequence);
            Intrinsics.checkNotNullExpressionValue(newSpannable2, "Spannable.Factory.getIns…().newSpannable(fullText)");
            return newSpannable2;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/social/utils/RegexUtils$Companion$createClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends ClickableSpan {
            final /* synthetic */ AUMaskImage getMin;
            final /* synthetic */ AUHorizontalListView.SavedState.AnonymousClass1 setMax;

            setMax(AUHorizontalListView.SavedState.AnonymousClass1 r1, AUMaskImage aUMaskImage) {
                this.setMax = r1;
                this.getMin = aUMaskImage;
            }

            public final void onClick(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (!Intrinsics.areEqual((Object) setBuildNumber.ACTOR_KEY, (Object) this.setMax.length)) {
                    this.getMin.getMax.invoke(this.setMax);
                }
            }

            public final void updateDrawState(@NotNull TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "ds");
                textPaint.setUnderlineText(false);
                if (!Intrinsics.areEqual((Object) setBuildNumber.ACTOR_KEY, (Object) this.setMax.length)) {
                    textPaint.setColor(IntRange.setMax(this.getMin.length, R.color.f21792131100096));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"id/dana/social/utils/RegexUtils$Companion$changeFontType$1", "Landroid/text/style/MetricAffectingSpan;", "updateDrawState", "", "p0", "Landroid/text/TextPaint;", "updateMeasureState", "updateTypeFace", "textPaint", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.initContentView$setMin$setMin  reason: collision with other inner class name */
        public static final class C0061setMin extends MetricAffectingSpan {
            final /* synthetic */ int getMin;
            final /* synthetic */ Context length;

            public C0061setMin(Context context, int i) {
                this.length = context;
                this.getMin = i;
            }

            public final void updateDrawState(@NotNull TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "p0");
                setMax(textPaint);
            }

            public final void updateMeasureState(@NotNull TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "p0");
                setMax(textPaint);
            }

            private final void setMax(TextPaint textPaint) {
                Typeface length2 = OptIn.length(this.length, this.getMin);
                int style = length2 != null ? length2.getStyle() : 0;
                if (style != 0) {
                    textPaint.setTypeface(Typeface.create(length2, style));
                }
            }
        }

        private static boolean setMin(Object obj) {
            if (obj != null && (obj instanceof String)) {
                CharSequence charSequence = (CharSequence) obj;
                if (TextUtils.isEmpty(charSequence) || SequencesKt.count(new Regex("(?:\"\\w{1,}\":)((\"(.*?)(?:\"))|\\d{1,})").findAll(charSequence, 0)) <= 0) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @NotNull
        public static Spannable getMax(@NotNull AUMaskImage aUMaskImage, @FontRes @Nullable Integer num, boolean z) {
            Intrinsics.checkNotNullParameter(aUMaskImage, "feedRegexData");
            if (!(aUMaskImage.setMax.length() > 0)) {
                return new SpannableString("");
            }
            setMin setmin = initContentView.getMin;
            return getMin(aUMaskImage, num, z);
        }

        private static String setMax(AUMaskImage aUMaskImage) {
            String str;
            Regex regex = new Regex("%\\S.*?%.*?(%\\S.*?%)");
            setMin setmin = initContentView.getMin;
            String replace = regex.replace((CharSequence) aUMaskImage.setMax, (Function1<? super MatchResult, ? extends CharSequence>) new getMax(aUMaskImage.getMin));
            setMin setmin2 = initContentView.getMin;
            HashMap<String, String> hashMap = aUMaskImage.getMin;
            Context context = aUMaskImage.length;
            if (length(hashMap)) {
                str = context.getString(R.string.you);
                Intrinsics.checkNotNullExpressionValue(str, "context.getString(R.string.you)");
            } else {
                str = setBuildNumber.getDisplayName(hashMap).length() > 0 ? "%actor.displayName%" : "%actor.nickname%";
            }
            return StringsKt.replace$default(replace, "%actor%", str, false, 4, (Object) null);
        }

        private static String setMin(String str, MatchResult matchResult, List<AUHorizontalListView.SavedState.AnonymousClass1> list, AUMaskImage aUMaskImage) {
            String str2;
            String str3;
            String str4;
            AUMaskImage aUMaskImage2 = aUMaskImage;
            HashMap<String, String> hashMap = aUMaskImage2.getMin;
            String value = matchResult.getValue();
            int first = matchResult.getRange().getFirst();
            int i = 0;
            HashMap<String, String> hashMap2 = hashMap;
            String str5 = setBuildNumber.ACTOR_KEY;
            String str6 = str;
            for (MatchResult next : new Regex("\\w{1,}").findAll(value, 0)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                MatchResult matchResult2 = next;
                if (i == 0) {
                    str5 = matchResult2.getValue();
                }
                String str7 = hashMap2.get(matchResult2.getValue());
                if (str7 == null) {
                    str7 = "";
                }
                setMin setmin = initContentView.getMin;
                if (setMin(str7)) {
                    Object fromJson = new Gson().fromJson(str7, HashMap.class);
                    if (fromJson != null) {
                        hashMap2 = (HashMap) fromJson;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String?> /* = java.util.HashMap<kotlin.String, kotlin.String?> */");
                    }
                } else {
                    str6 = new Regex(value).replace((CharSequence) str6, str7);
                    String str8 = aUMaskImage2.setMin;
                    setMin setmin2 = initContentView.getMin;
                    Map map = hashMap2;
                    Intrinsics.checkNotNullParameter(str5, "type");
                    Intrinsics.checkNotNullParameter(map, "map");
                    if (Intrinsics.areEqual((Object) setBuildNumber.ACTOR_KEY, (Object) str5)) {
                        str2 = (String) map.get("id");
                    } else {
                        str2 = (String) map.get("redirectValue");
                        if (str2 == null) {
                            str4 = null;
                        } else if (str2 != null) {
                            str4 = str2.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(str4, "(this as java.lang.String).toLowerCase()");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        if (Intrinsics.areEqual((Object) str4, (Object) DeepLinkConstant.DeepLinkPath.LUCKY_MONEY)) {
                            str2 = "/m/luckymoney?numberOfMember=201&minWinnerSize=2";
                        }
                    }
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    setMin setmin3 = initContentView.getMin;
                    IntRange intRange = new IntRange(first, str7.length() + first);
                    String str9 = aUMaskImage2.toIntRange;
                    AUHorizontalListView.SavedState.AnonymousClass1 r0 = r11;
                    AUHorizontalListView.SavedState.AnonymousClass1 r11 = new Object(str8, str5, str3, intRange, str9) {
                        final IntRange getMax;
                        public final String getMin;
                        public final String length;
                        public final String setMax;
                        public final String setMin;
                    };
                    list.add(r0);
                    aUMaskImage2 = aUMaskImage;
                }
                i = i2;
            }
            return str6;
        }
    }
}
