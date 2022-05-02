package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.mobile.security.bio.workspace.Env;
import com.google.firebase.messaging.Constants;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.common.BuildConfig;
import id.dana.lib.drawbitmap.invoice.InvoiceConstant;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.EncryptAppender;
import o.LogFileLogAppender;
import o.getBundle;
import o.getLogEventType;
import o.setLogEventType;
import ru.noties.markwon.html.impl.jsoup.parser.Token;

public final class setLogCategory extends EncryptAppender {
    @VisibleForTesting
    static final Set<String> getMin = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"a", "abbr", "acronym", "b", "bdo", "big", TtmlNode.TAG_BR, ApiDowngradeConstant.JsonKeys.BUTTON, "cite", "code", "dfn", "em", "i", "img", "input", "kbd", Constants.ScionAnalytics.PARAM_LABEL, "map", "object", "q", "samp", "script", "select", "small", TtmlNode.TAG_SPAN, "strong", "sub", "sup", "textarea", TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, "tt", "var"})));
    private static final Set<String> setMax = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"address", "article", "aside", "blockquote", "canvas", "dd", TtmlNode.TAG_DIV, "dl", RVParams.DEFAULT_TITLE, "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", InvoiceConstant.HEADER, "hgroup", "hr", "li", "main", "nav", "noscript", "ol", TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "p", Env.NAME_PRE, "section", "table", "tfoot", "ul", "video"})));
    private static final Set<String> setMin = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"area", BuildConfig.FLAVOR, TtmlNode.TAG_BR, "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr"})));
    private boolean IsOverlapping;
    private boolean equals;
    private final LogEvent getMax;
    private final List<setLogEventType.setMax> isInside = new ArrayList(0);
    private final getBundle length;
    private setLogEventType.getMin toFloatRange = new setLogEventType.getMin("", 0, Collections.emptyMap(), (setLogEventType.getMin) null);

    private setLogCategory(@NonNull LogEvent logEvent, @NonNull getBundle getbundle) {
        this.getMax = logEvent;
        this.length = getbundle;
    }

    public final <T extends Appendable & CharSequence> void setMin(@NonNull T t, @NonNull String str) {
        Token.getMax getmax;
        String min;
        String min2;
        MasExceptionLogPB masExceptionLogPB = new MasExceptionLogPB(new LogFileLogAppender.AnonymousClass2(str), appendDataToFile.noTracking());
        while (true) {
            if (!masExceptionLogPB.setMax) {
                masExceptionLogPB.length.read(masExceptionLogPB, masExceptionLogPB.getMax);
            } else {
                boolean z = false;
                if (masExceptionLogPB.toIntRange.length() > 0) {
                    String obj = masExceptionLogPB.toIntRange.toString();
                    masExceptionLogPB.toIntRange.delete(0, masExceptionLogPB.toIntRange.length());
                    masExceptionLogPB.IsOverlapping = null;
                    Token.getMax getmax2 = masExceptionLogPB.values;
                    getmax2.length = obj;
                    getmax = getmax2;
                } else if (masExceptionLogPB.IsOverlapping != null) {
                    Token.getMax getmax3 = masExceptionLogPB.values;
                    getmax3.length = masExceptionLogPB.IsOverlapping;
                    masExceptionLogPB.IsOverlapping = null;
                    getmax = getmax3;
                } else {
                    masExceptionLogPB.setMax = false;
                    getmax = masExceptionLogPB.getMin;
                }
                Token.TokenType tokenType = getmax.getMin;
                if (Token.TokenType.EOF != tokenType) {
                    int i = AnonymousClass2.length[tokenType.ordinal()];
                    if (i == 1) {
                        Token.toIntRange tointrange = getmax;
                        if (getMin(tointrange.getMax)) {
                            String str2 = tointrange.getMax;
                            CharSequence charSequence = (CharSequence) t;
                            setLogEventType.setMax setmax = new setLogEventType.setMax(str2, charSequence.length(), length(tointrange));
                            if (this.equals) {
                                setMin(t);
                                this.equals = false;
                            }
                            if (getMax(str2) || tointrange.toIntRange) {
                                String min3 = LogEvent.getMin(setmax);
                                if (min3 != null && min3.length() > 0) {
                                    try {
                                        t.append(min3);
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                setmax.getMax(charSequence.length());
                            }
                            this.isInside.add(setmax);
                        } else {
                            String str3 = tointrange.getMax;
                            if ("p".equals(this.toFloatRange.setMax)) {
                                this.toFloatRange.getMax(((CharSequence) t).length());
                                try {
                                    t.append(10);
                                    this.toFloatRange = this.toFloatRange.getMin;
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else if ("li".equals(str3) && "li".equals(this.toFloatRange.setMax)) {
                                this.toFloatRange.getMax(((CharSequence) t).length());
                                this.toFloatRange = this.toFloatRange.getMin;
                            }
                            if (setMax(str3)) {
                                this.IsOverlapping = Env.NAME_PRE.equals(str3);
                                setMin(t);
                            } else if (this.equals) {
                                setMin(t);
                                this.equals = false;
                            }
                            CharSequence charSequence2 = (CharSequence) t;
                            setLogEventType.getMin getmin = new setLogEventType.getMin(str3, charSequence2.length(), length(tointrange), this.toFloatRange);
                            if (getMax(str3) || tointrange.toIntRange) {
                                z = true;
                            }
                            if (z) {
                                String min4 = LogEvent.getMin(getmin);
                                if (min4 != null && min4.length() > 0) {
                                    try {
                                        t.append(min4);
                                    } catch (IOException e3) {
                                        throw new RuntimeException(e3);
                                    }
                                }
                                getmin.getMax(charSequence2.length());
                            }
                            setLogEventType.getMin getmin2 = getmin.getMin;
                            List list = getmin2.equals;
                            if (list == null) {
                                list = new ArrayList(2);
                                getmin2.equals = list;
                            }
                            list.add(getmin);
                            if (!z) {
                                this.toFloatRange = getmin;
                            }
                        }
                    } else if (i == 2) {
                        Token.IsOverlapping isOverlapping = (Token.IsOverlapping) getmax;
                        if (getMin(isOverlapping.getMax)) {
                            setLogEventType.setMax length2 = length(isOverlapping.getMax);
                            if (length2 != null) {
                                if (setMin(t, (setLogEventType) length2) && (min2 = LogEvent.getMin(length2)) != null) {
                                    try {
                                        t.append(min2);
                                    } catch (IOException e4) {
                                        throw new RuntimeException(e4);
                                    }
                                }
                                length2.getMax(((CharSequence) t).length());
                            }
                        } else {
                            String str4 = isOverlapping.getMax;
                            setLogEventType.getMin min5 = setMin(isOverlapping.getMax);
                            if (min5 != null) {
                                if (Env.NAME_PRE.equals(str4)) {
                                    this.IsOverlapping = false;
                                }
                                if (setMin(t, (setLogEventType) min5) && (min = LogEvent.getMin(min5)) != null) {
                                    try {
                                        t.append(min);
                                    } catch (IOException e5) {
                                        throw new RuntimeException(e5);
                                    }
                                }
                                min5.getMax(((CharSequence) t).length());
                                if (!min5.toFloatRange()) {
                                    this.equals = setMax(min5.setMax);
                                }
                                if ("p".equals(str4)) {
                                    try {
                                        t.append(10);
                                    } catch (IOException e6) {
                                        throw new RuntimeException(e6);
                                    }
                                }
                                this.toFloatRange = min5.getMin;
                            }
                        }
                    } else if (i == 3) {
                        Token.getMax getmax4 = getmax;
                        if (this.IsOverlapping) {
                            try {
                                t.append(getmax4.length);
                            } catch (IOException e7) {
                                throw new RuntimeException(e7);
                            }
                        } else {
                            if (this.equals) {
                                setMin(t);
                                this.equals = false;
                            }
                            this.length.length(t, getmax4.length);
                        }
                    }
                    getmax.length();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o.setLogCategory$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ru.noties.markwon.html.impl.jsoup.parser.Token$TokenType[] r0 = ru.noties.markwon.html.impl.jsoup.parser.Token.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                ru.noties.markwon.html.impl.jsoup.parser.Token$TokenType r1 = ru.noties.markwon.html.impl.jsoup.parser.Token.TokenType.StartTag     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                ru.noties.markwon.html.impl.jsoup.parser.Token$TokenType r1 = ru.noties.markwon.html.impl.jsoup.parser.Token.TokenType.EndTag     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                ru.noties.markwon.html.impl.jsoup.parser.Token$TokenType r1 = ru.noties.markwon.html.impl.jsoup.parser.Token.TokenType.Character     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setLogCategory.AnonymousClass2.<clinit>():void");
        }
    }

    public final void length(int i, @NonNull EncryptAppender.getMax<getLogEventType.setMin> getmax) {
        if (this.isInside.size() > 0) {
            if (i >= 0) {
                for (setLogEventType.setMax next : this.isInside) {
                    if (!next.length()) {
                        next.getMax = i;
                    }
                }
            }
            getmax.getMax(Collections.unmodifiableList(this.isInside));
            this.isInside.clear();
            return;
        }
        getmax.getMax(Collections.emptyList());
    }

    public final void getMax(int i, @NonNull EncryptAppender.getMax<getLogEventType.setMax> getmax) {
        List<T> list;
        setLogEventType.getMin getmin = this.toFloatRange;
        while (getmin.getMin != null) {
            getmin = getmin.getMin;
        }
        if (i >= 0) {
            getmin.getMax(i);
        }
        if (getmin.equals == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(getmin.equals);
        }
        if (list.size() > 0) {
            getmax.getMax(list);
        } else {
            getmax.getMax(Collections.emptyList());
        }
        this.toFloatRange = new setLogEventType.getMin("", 0, Collections.emptyMap(), (setLogEventType.getMin) null);
    }

    public final void setMin() {
        this.isInside.clear();
        this.toFloatRange = new setLogEventType.getMin("", 0, Collections.emptyMap(), (setLogEventType.getMin) null);
    }

    @Nullable
    private setLogEventType.setMax length(@NonNull String str) {
        for (int size = this.isInside.size() - 1; size >= 0; size--) {
            setLogEventType.setMax setmax = this.isInside.get(size);
            if (str.equals(setmax.setMax) && setmax.getMax < 0) {
                return setmax;
            }
        }
        return null;
    }

    @Nullable
    private setLogEventType.getMin setMin(@NonNull String str) {
        setLogEventType.getMin getmin = this.toFloatRange;
        while (getmin != null && !str.equals(getmin.setMax) && !getmin.length()) {
            getmin = getmin.getMin;
        }
        return getmin;
    }

    private static boolean getMin(@NonNull String str) {
        return getMin.contains(str);
    }

    private static boolean getMax(@NonNull String str) {
        return setMin.contains(str);
    }

    private static boolean setMax(@NonNull String str) {
        return setMax.contains(str);
    }

    private static <T extends Appendable & CharSequence> void setMin(@NonNull T t) {
        CharSequence charSequence = (CharSequence) t;
        int length2 = charSequence.length();
        if (length2 > 0 && 10 != charSequence.charAt(length2 - 1)) {
            try {
                t.append(10);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @NonNull
    private static Map<String, String> length(@NonNull Token.toIntRange tointrange) {
        LogFileLogAppender logFileLogAppender = tointrange.isInside;
        int i = logFileLogAppender.setMin;
        if (i <= 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(i);
        Iterator<handleExtrasOnGetNewFile> it = logFileLogAppender.iterator();
        while (it.hasNext()) {
            handleExtrasOnGetNewFile next = it.next();
            hashMap.put(next.length.toLowerCase(Locale.US), next.setMax);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static <T extends Appendable & CharSequence> boolean setMin(@NonNull T t, @NonNull setLogEventType setlogeventtype) {
        return setlogeventtype.setMin == ((CharSequence) t).length();
    }

    @NonNull
    public static setLogCategory getMax() {
        return new setLogCategory(new LogEvent(), new getBundle.setMin());
    }
}
