package ru.noties.markwon.html.impl.jsoup.parser;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Locale;
import kotlin.text.Typography;
import o.LogFileLogAppender;
import o.MasExceptionLogPB;
import ru.noties.markwon.html.impl.jsoup.parser.Token;

public enum TokeniserState {
    Data {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char max = r4.getMax();
            if (max == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.getMax(String.valueOf(r4.setMin()));
            } else if (max == '&') {
                TokeniserState tokeniserState = CharacterReferenceInData;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (max == '<') {
                TokeniserState tokeniserState2 = TagOpen;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            } else if (max != 65535) {
                masExceptionLogPB.getMax(r4.length());
            } else {
                masExceptionLogPB.length((Token) new Token.setMin());
            }
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r2) {
            TokeniserState.readCharRef(masExceptionLogPB, Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char max = r4.getMax();
            if (max == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                r4.setMax++;
                masExceptionLogPB.getMax("�");
            } else if (max == '&') {
                TokeniserState tokeniserState = CharacterReferenceInRcdata;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (max == '<') {
                TokeniserState tokeniserState2 = RcdataLessthanSign;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            } else if (max != 65535) {
                masExceptionLogPB.getMax(r4.getMin(Typography.amp, Typography.less, 0));
            } else {
                masExceptionLogPB.length((Token) new Token.setMin());
            }
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r2) {
            TokeniserState.readCharRef(masExceptionLogPB, Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            TokeniserState.readData(masExceptionLogPB, r3, this, RawtextLessthanSign);
        }
    },
    ScriptData {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            TokeniserState.readData(masExceptionLogPB, r3, this, ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char max = r4.getMax();
            if (max == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                r4.setMax++;
                masExceptionLogPB.getMax("�");
            } else if (max != 65535) {
                masExceptionLogPB.getMax(r4.length(0));
            } else {
                masExceptionLogPB.length((Token) new Token.setMin());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char max = r4.getMax();
            if (max == '!') {
                TokeniserState tokeniserState = MarkupDeclarationOpen;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (max == '/') {
                TokeniserState tokeniserState2 = EndTagOpen;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            } else if (max == '?') {
                TokeniserState tokeniserState3 = BogusComment;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState3;
            } else if (r4.FastBitmap$CoordinateSystem()) {
                masExceptionLogPB.toFloatRange = masExceptionLogPB.equals.length();
                masExceptionLogPB.length = TagName;
            } else {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.getMax(SimpleComparison.LESS_THAN_OPERATION);
                masExceptionLogPB.length = Data;
            }
        }
    },
    EndTagOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.setMax()) {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.getMax("</");
                masExceptionLogPB.length = Data;
            } else if (r4.FastBitmap$CoordinateSystem()) {
                masExceptionLogPB.toFloatRange = masExceptionLogPB.hashCode.length();
                masExceptionLogPB.length = TagName;
            } else if (r4.getMin((char) Typography.greater)) {
                masExceptionLogPB.length((TokeniserState) this);
                TokeniserState tokeniserState = Data;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else {
                masExceptionLogPB.length((TokeniserState) this);
                TokeniserState tokeniserState2 = BogusComment;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            }
        }
    },
    TagName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            masExceptionLogPB.toFloatRange.setMax(r4.getMin());
            char min = r4.setMin();
            if (min != 0) {
                if (min != ' ') {
                    if (min == '/') {
                        masExceptionLogPB.length = SelfClosingStartTag;
                        return;
                    } else if (min == '>') {
                        Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                        if (tofloatrange.length != null) {
                            tofloatrange.setMax();
                        }
                        masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                        masExceptionLogPB.length = Data;
                        return;
                    } else if (min == 65535) {
                        masExceptionLogPB.setMin(this);
                        masExceptionLogPB.length = Data;
                        return;
                    } else if (!(min == 9 || min == 10 || min == 12 || min == 13)) {
                        masExceptionLogPB.toFloatRange.setMax(String.valueOf(min));
                        return;
                    }
                }
                masExceptionLogPB.length = BeforeAttributeName;
                return;
            }
            masExceptionLogPB.toFloatRange.setMax(TokeniserState.replacementStr);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r5) {
            if (r5.getMin('/')) {
                StringBuilder sb = masExceptionLogPB.isInside;
                if (sb != null) {
                    sb.delete(0, sb.length());
                }
                TokeniserState tokeniserState = RCDATAEndTagOpen;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            if (r5.FastBitmap$CoordinateSystem() && masExceptionLogPB.FastBitmap$CoordinateSystem != null) {
                StringBuilder sb2 = new StringBuilder("</");
                sb2.append(masExceptionLogPB.FastBitmap$CoordinateSystem);
                if (!r5.length(sb2.toString())) {
                    masExceptionLogPB.toFloatRange = masExceptionLogPB.hashCode.length();
                    Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                    String str = masExceptionLogPB.FastBitmap$CoordinateSystem;
                    tofloatrange.setMax = str;
                    tofloatrange.getMax = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
                    masExceptionLogPB.toFloatRange = tofloatrange;
                    masExceptionLogPB.setMax();
                    r5.setMax--;
                    masExceptionLogPB.length = Data;
                    return;
                }
            }
            masExceptionLogPB.getMax(SimpleComparison.LESS_THAN_OPERATION);
            masExceptionLogPB.length = Rcdata;
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.FastBitmap$CoordinateSystem()) {
                masExceptionLogPB.toFloatRange = masExceptionLogPB.hashCode.length();
                masExceptionLogPB.toFloatRange.setMax(String.valueOf(r4.getMax()));
                masExceptionLogPB.isInside.append(r4.getMax());
                TokeniserState tokeniserState = RCDATAEndTagName;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            masExceptionLogPB.getMax("</");
            masExceptionLogPB.length = Rcdata;
        }
    },
    RCDATAEndTagName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.FastBitmap$CoordinateSystem()) {
                String intRange = r4.toIntRange();
                masExceptionLogPB.toFloatRange.setMax(intRange);
                masExceptionLogPB.isInside.append(intRange);
                return;
            }
            char min = r4.setMin();
            if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ') {
                if (masExceptionLogPB.getMin()) {
                    masExceptionLogPB.length = BeforeAttributeName;
                } else {
                    anythingElse(masExceptionLogPB, r4);
                }
            } else if (min != '/') {
                if (min != '>') {
                    anythingElse(masExceptionLogPB, r4);
                } else if (masExceptionLogPB.getMin()) {
                    Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                    if (tofloatrange.length != null) {
                        tofloatrange.setMax();
                    }
                    masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                    masExceptionLogPB.length = Data;
                } else {
                    anythingElse(masExceptionLogPB, r4);
                }
            } else if (masExceptionLogPB.getMin()) {
                masExceptionLogPB.length = SelfClosingStartTag;
            } else {
                anythingElse(masExceptionLogPB, r4);
            }
        }

        private void anythingElse(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            StringBuilder sb = new StringBuilder("</");
            sb.append(masExceptionLogPB.isInside.toString());
            masExceptionLogPB.getMax(sb.toString());
            r4.setMax--;
            masExceptionLogPB.length = Rcdata;
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.getMin('/')) {
                StringBuilder sb = masExceptionLogPB.isInside;
                if (sb != null) {
                    sb.delete(0, sb.length());
                }
                TokeniserState tokeniserState = RawtextEndTagOpen;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            masExceptionLogPB.getMax(SimpleComparison.LESS_THAN_OPERATION);
            masExceptionLogPB.length = Rawtext;
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            TokeniserState.readEndTag(masExceptionLogPB, r4, RawtextEndTagName, Rawtext);
        }
    },
    RawtextEndTagName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            TokeniserState.handleDataEndTag(masExceptionLogPB, r3, Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == '!') {
                masExceptionLogPB.getMax("<!");
                masExceptionLogPB.length = ScriptDataEscapeStart;
            } else if (min != '/') {
                masExceptionLogPB.getMax(SimpleComparison.LESS_THAN_OPERATION);
                r4.setMax--;
                masExceptionLogPB.length = ScriptData;
            } else {
                StringBuilder sb = masExceptionLogPB.isInside;
                if (sb != null) {
                    sb.delete(0, sb.length());
                }
                masExceptionLogPB.length = ScriptDataEndTagOpen;
            }
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            TokeniserState.readEndTag(masExceptionLogPB, r4, ScriptDataEndTagName, ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            TokeniserState.handleDataEndTag(masExceptionLogPB, r3, ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.getMin('-')) {
                masExceptionLogPB.getMax("-");
                TokeniserState tokeniserState = ScriptDataEscapeStartDash;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            masExceptionLogPB.length = ScriptData;
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.getMin('-')) {
                masExceptionLogPB.getMax("-");
                TokeniserState tokeniserState = ScriptDataEscapedDashDash;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            masExceptionLogPB.length = ScriptData;
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.setMax()) {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
                return;
            }
            char max = r4.getMax();
            if (max == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                r4.setMax++;
                masExceptionLogPB.getMax("�");
            } else if (max == '-') {
                masExceptionLogPB.getMax("-");
                TokeniserState tokeniserState = ScriptDataEscapedDash;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (max != '<') {
                masExceptionLogPB.getMax(r4.getMin('-', Typography.less, 0));
            } else {
                TokeniserState tokeniserState2 = ScriptDataEscapedLessthanSign;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            }
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            if (r3.setMax()) {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
                return;
            }
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.getMax("�");
                masExceptionLogPB.length = ScriptDataEscaped;
            } else if (min == '-') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataEscapedDashDash;
            } else if (min != '<') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataEscaped;
            } else {
                masExceptionLogPB.length = ScriptDataEscapedLessthanSign;
            }
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            if (r3.setMax()) {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
                return;
            }
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.getMax("�");
                masExceptionLogPB.length = ScriptDataEscaped;
            } else if (min == '-') {
                masExceptionLogPB.getMax(String.valueOf(min));
            } else if (min == '<') {
                masExceptionLogPB.length = ScriptDataEscapedLessthanSign;
            } else if (min != '>') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataEscaped;
            } else {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptData;
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r6) {
            if (r6.FastBitmap$CoordinateSystem()) {
                StringBuilder sb = masExceptionLogPB.isInside;
                if (sb != null) {
                    sb.delete(0, sb.length());
                }
                masExceptionLogPB.isInside.append(r6.getMax());
                StringBuilder sb2 = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
                sb2.append(r6.getMax());
                masExceptionLogPB.getMax(sb2.toString());
                TokeniserState tokeniserState = ScriptDataDoubleEscapeStart;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (r6.getMin('/')) {
                StringBuilder sb3 = masExceptionLogPB.isInside;
                if (sb3 != null) {
                    sb3.delete(0, sb3.length());
                }
                TokeniserState tokeniserState2 = ScriptDataEscapedEndTagOpen;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            } else {
                masExceptionLogPB.getMax(SimpleComparison.LESS_THAN_OPERATION);
                masExceptionLogPB.length = ScriptDataEscaped;
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.FastBitmap$CoordinateSystem()) {
                masExceptionLogPB.toFloatRange = masExceptionLogPB.hashCode.length();
                masExceptionLogPB.toFloatRange.setMax(String.valueOf(r4.getMax()));
                masExceptionLogPB.isInside.append(r4.getMax());
                TokeniserState tokeniserState = ScriptDataEscapedEndTagName;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            masExceptionLogPB.getMax("</");
            masExceptionLogPB.length = ScriptDataEscaped;
        }
    },
    ScriptDataEscapedEndTagName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            TokeniserState.handleDataEndTag(masExceptionLogPB, r3, ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            TokeniserState.handleDataDoubleEscapeTag(masExceptionLogPB, r4, ScriptDataDoubleEscaped, ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char max = r4.getMax();
            if (max == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                r4.setMax++;
                masExceptionLogPB.getMax("�");
            } else if (max == '-') {
                masExceptionLogPB.getMax(String.valueOf(max));
                TokeniserState tokeniserState = ScriptDataDoubleEscapedDash;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (max == '<') {
                masExceptionLogPB.getMax(String.valueOf(max));
                TokeniserState tokeniserState2 = ScriptDataDoubleEscapedLessthanSign;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            } else if (max != 65535) {
                masExceptionLogPB.getMax(r4.getMin('-', Typography.less, 0));
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.getMax("�");
                masExceptionLogPB.length = ScriptDataDoubleEscaped;
            } else if (min == '-') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataDoubleEscapedDashDash;
            } else if (min == '<') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataDoubleEscapedLessthanSign;
            } else if (min != 65535) {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataDoubleEscaped;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.getMax("�");
                masExceptionLogPB.length = ScriptDataDoubleEscaped;
            } else if (min == '-') {
                masExceptionLogPB.getMax(String.valueOf(min));
            } else if (min == '<') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataDoubleEscapedLessthanSign;
            } else if (min == '>') {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptData;
            } else if (min != 65535) {
                masExceptionLogPB.getMax(String.valueOf(min));
                masExceptionLogPB.length = ScriptDataDoubleEscaped;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.getMin('/')) {
                masExceptionLogPB.getMax("/");
                StringBuilder sb = masExceptionLogPB.isInside;
                if (sb != null) {
                    sb.delete(0, sb.length());
                }
                TokeniserState tokeniserState = ScriptDataDoubleEscapeEnd;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
                return;
            }
            masExceptionLogPB.length = ScriptDataDoubleEscaped;
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            TokeniserState.handleDataDoubleEscapeTag(masExceptionLogPB, r4, ScriptDataEscaped, ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
            } else if (min != ' ') {
                if (!(min == '\"' || min == '\'')) {
                    if (min == '/') {
                        masExceptionLogPB.length = SelfClosingStartTag;
                        return;
                    } else if (min == 65535) {
                        masExceptionLogPB.setMin(this);
                        masExceptionLogPB.length = Data;
                        return;
                    } else if (min != 9 && min != 10 && min != 12 && min != 13) {
                        switch (min) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                                if (tofloatrange.length != null) {
                                    tofloatrange.setMax();
                                }
                                masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                                masExceptionLogPB.length = Data;
                                return;
                        }
                    } else {
                        return;
                    }
                }
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toFloatRange.setMax();
                Token.toFloatRange tofloatrange2 = masExceptionLogPB.toFloatRange;
                String valueOf = String.valueOf(min);
                if (tofloatrange2.length != null) {
                    valueOf = tofloatrange2.length.concat(valueOf);
                }
                tofloatrange2.length = valueOf;
                masExceptionLogPB.length = AttributeName;
                return;
            } else {
                return;
            }
            masExceptionLogPB.toFloatRange.setMax();
            r4.setMax--;
            masExceptionLogPB.length = AttributeName;
        }
    },
    AttributeName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r5) {
            String length = r5.length(attributeNameCharsSorted);
            Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
            if (tofloatrange.length != null) {
                length = tofloatrange.length.concat(length);
            }
            tofloatrange.length = length;
            char min = r5.setMin();
            if (min != 0) {
                if (min != ' ') {
                    if (!(min == '\"' || min == '\'')) {
                        if (min == '/') {
                            masExceptionLogPB.length = SelfClosingStartTag;
                            return;
                        } else if (min == 65535) {
                            masExceptionLogPB.setMin(this);
                            masExceptionLogPB.length = Data;
                            return;
                        } else if (!(min == 9 || min == 10 || min == 12 || min == 13)) {
                            switch (min) {
                                case '<':
                                    break;
                                case '=':
                                    masExceptionLogPB.length = BeforeAttributeValue;
                                    return;
                                case '>':
                                    Token.toFloatRange tofloatrange2 = masExceptionLogPB.toFloatRange;
                                    if (tofloatrange2.length != null) {
                                        tofloatrange2.setMax();
                                    }
                                    masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                                    masExceptionLogPB.length = Data;
                                    return;
                                default:
                                    Token.toFloatRange tofloatrange3 = masExceptionLogPB.toFloatRange;
                                    String valueOf = String.valueOf(min);
                                    if (tofloatrange3.length != null) {
                                        valueOf = tofloatrange3.length.concat(valueOf);
                                    }
                                    tofloatrange3.length = valueOf;
                                    return;
                            }
                        }
                    }
                    masExceptionLogPB.length((TokeniserState) this);
                    Token.toFloatRange tofloatrange4 = masExceptionLogPB.toFloatRange;
                    String valueOf2 = String.valueOf(min);
                    if (tofloatrange4.length != null) {
                        valueOf2 = tofloatrange4.length.concat(valueOf2);
                    }
                    tofloatrange4.length = valueOf2;
                    return;
                }
                masExceptionLogPB.length = AfterAttributeName;
                return;
            }
            masExceptionLogPB.length((TokeniserState) this);
            Token.toFloatRange tofloatrange5 = masExceptionLogPB.toFloatRange;
            String str = "�";
            if (tofloatrange5.length != null) {
                str = tofloatrange5.length.concat(str);
            }
            tofloatrange5.length = str;
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                String str = "�";
                if (tofloatrange.length != null) {
                    str = tofloatrange.length.concat(str);
                }
                tofloatrange.length = str;
                masExceptionLogPB.length = AttributeName;
            } else if (min != ' ') {
                if (!(min == '\"' || min == '\'')) {
                    if (min == '/') {
                        masExceptionLogPB.length = SelfClosingStartTag;
                        return;
                    } else if (min == 65535) {
                        masExceptionLogPB.setMin(this);
                        masExceptionLogPB.length = Data;
                        return;
                    } else if (min != 9 && min != 10 && min != 12 && min != 13) {
                        switch (min) {
                            case '<':
                                break;
                            case '=':
                                masExceptionLogPB.length = BeforeAttributeValue;
                                return;
                            case '>':
                                Token.toFloatRange tofloatrange2 = masExceptionLogPB.toFloatRange;
                                if (tofloatrange2.length != null) {
                                    tofloatrange2.setMax();
                                }
                                masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                                masExceptionLogPB.length = Data;
                                return;
                            default:
                                masExceptionLogPB.toFloatRange.setMax();
                                r4.setMax--;
                                masExceptionLogPB.length = AttributeName;
                                return;
                        }
                    } else {
                        return;
                    }
                }
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toFloatRange.setMax();
                Token.toFloatRange tofloatrange3 = masExceptionLogPB.toFloatRange;
                String valueOf = String.valueOf(min);
                if (tofloatrange3.length != null) {
                    valueOf = tofloatrange3.length.concat(valueOf);
                }
                tofloatrange3.length = valueOf;
                masExceptionLogPB.length = AttributeName;
            }
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toFloatRange.setMax((char) TokeniserState.replacementChar);
                masExceptionLogPB.length = AttributeValue_unquoted;
            } else if (min == ' ') {
            } else {
                if (min != '\"') {
                    if (min != '`') {
                        if (min == 65535) {
                            masExceptionLogPB.setMin(this);
                            Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                            if (tofloatrange.length != null) {
                                tofloatrange.setMax();
                            }
                            masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                            masExceptionLogPB.length = Data;
                            return;
                        } else if (min != 9 && min != 10 && min != 12 && min != 13) {
                            if (min == '&') {
                                r4.setMax--;
                                masExceptionLogPB.length = AttributeValue_unquoted;
                                return;
                            } else if (min != '\'') {
                                switch (min) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        masExceptionLogPB.length((TokeniserState) this);
                                        Token.toFloatRange tofloatrange2 = masExceptionLogPB.toFloatRange;
                                        if (tofloatrange2.length != null) {
                                            tofloatrange2.setMax();
                                        }
                                        masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                                        masExceptionLogPB.length = Data;
                                        return;
                                    default:
                                        r4.setMax--;
                                        masExceptionLogPB.length = AttributeValue_unquoted;
                                        return;
                                }
                            } else {
                                masExceptionLogPB.length = AttributeValue_singleQuoted;
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toFloatRange.setMax(min);
                    masExceptionLogPB.length = AttributeValue_unquoted;
                    return;
                }
                masExceptionLogPB.length = AttributeValue_doubleQuoted;
            }
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r5) {
            String min = r5.getMin(attributeDoubleValueCharsSorted);
            if (min.length() > 0) {
                masExceptionLogPB.toFloatRange.length(min);
            } else {
                masExceptionLogPB.toFloatRange.setMin = true;
            }
            char min2 = r5.setMin();
            if (min2 == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toFloatRange.setMax((char) TokeniserState.replacementChar);
            } else if (min2 == '\"') {
                masExceptionLogPB.length = AfterAttributeValue_quoted;
            } else if (min2 == '&') {
                int[] length = masExceptionLogPB.length(Character.valueOf(Typography.quote), true);
                if (length != null) {
                    masExceptionLogPB.toFloatRange.getMin(length);
                } else {
                    masExceptionLogPB.toFloatRange.setMax((char) Typography.amp);
                }
            } else if (min2 != 65535) {
                masExceptionLogPB.toFloatRange.setMax(min2);
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            }
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r5) {
            String min = r5.getMin(attributeSingleValueCharsSorted);
            if (min.length() > 0) {
                masExceptionLogPB.toFloatRange.length(min);
            } else {
                masExceptionLogPB.toFloatRange.setMin = true;
            }
            char min2 = r5.setMin();
            if (min2 == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toFloatRange.setMax((char) TokeniserState.replacementChar);
            } else if (min2 == 65535) {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            } else if (min2 == '&') {
                int[] length = masExceptionLogPB.length('\'', true);
                if (length != null) {
                    masExceptionLogPB.toFloatRange.getMin(length);
                } else {
                    masExceptionLogPB.toFloatRange.setMax((char) Typography.amp);
                }
            } else if (min2 != '\'') {
                masExceptionLogPB.toFloatRange.setMax(min2);
            } else {
                masExceptionLogPB.length = AfterAttributeValue_quoted;
            }
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            String length = r4.length(attributeValueUnquoted);
            if (length.length() > 0) {
                masExceptionLogPB.toFloatRange.length(length);
            }
            char min = r4.setMin();
            if (min != 0) {
                if (min != ' ') {
                    if (!(min == '\"' || min == '`')) {
                        if (min == 65535) {
                            masExceptionLogPB.setMin(this);
                            masExceptionLogPB.length = Data;
                            return;
                        } else if (!(min == 9 || min == 10 || min == 12 || min == 13)) {
                            if (min == '&') {
                                int[] length2 = masExceptionLogPB.length(Character.valueOf(Typography.greater), true);
                                if (length2 != null) {
                                    masExceptionLogPB.toFloatRange.getMin(length2);
                                    return;
                                } else {
                                    masExceptionLogPB.toFloatRange.setMax((char) Typography.amp);
                                    return;
                                }
                            } else if (min != '\'') {
                                switch (min) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                                        if (tofloatrange.length != null) {
                                            tofloatrange.setMax();
                                        }
                                        masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                                        masExceptionLogPB.length = Data;
                                        return;
                                }
                            }
                        }
                    }
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toFloatRange.setMax(min);
                    return;
                }
                masExceptionLogPB.length = BeforeAttributeName;
                return;
            }
            masExceptionLogPB.length((TokeniserState) this);
            masExceptionLogPB.toFloatRange.setMax((char) TokeniserState.replacementChar);
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ') {
                masExceptionLogPB.length = BeforeAttributeName;
            } else if (min == '/') {
                masExceptionLogPB.length = SelfClosingStartTag;
            } else if (min == '>') {
                Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                if (tofloatrange.length != null) {
                    tofloatrange.setMax();
                }
                masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.length((TokeniserState) this);
                r4.setMax--;
                masExceptionLogPB.length = BeforeAttributeName;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            }
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r5) {
            char min = r5.setMin();
            if (min == '>') {
                masExceptionLogPB.toFloatRange.toIntRange = true;
                Token.toFloatRange tofloatrange = masExceptionLogPB.toFloatRange;
                if (tofloatrange.length != null) {
                    tofloatrange.setMax();
                }
                masExceptionLogPB.length((Token) masExceptionLogPB.toFloatRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.length((TokeniserState) this);
                r5.setMax--;
                masExceptionLogPB.length = BeforeAttributeName;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length = Data;
            }
        }
    },
    BogusComment {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r6) {
            r6.setMax--;
            Token.setMax setmax = new Token.setMax();
            setmax.setMax = true;
            setmax.getMax.append(r6.length((char) Typography.greater));
            masExceptionLogPB.length((Token) setmax);
            TokeniserState tokeniserState = Data;
            masExceptionLogPB.getMax.setMax++;
            masExceptionLogPB.length = tokeniserState;
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            if (r4.getMax("--")) {
                masExceptionLogPB.toString.length();
                masExceptionLogPB.length = CommentStart;
            } else if (r4.setMin("DOCTYPE")) {
                masExceptionLogPB.length = Doctype;
            } else if (r4.getMax("[CDATA[")) {
                StringBuilder sb = masExceptionLogPB.isInside;
                if (sb != null) {
                    sb.delete(0, sb.length());
                }
                masExceptionLogPB.length = CdataSection;
            } else {
                masExceptionLogPB.length((TokeniserState) this);
                TokeniserState tokeniserState = BogusComment;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            }
        }
    },
    CommentStart {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toString.getMax.append(TokeniserState.replacementChar);
                masExceptionLogPB.length = Comment;
            } else if (min == '-') {
                masExceptionLogPB.length = CommentStartDash;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.toString.getMax.append(min);
                masExceptionLogPB.length = Comment;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            }
        }
    },
    CommentStartDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toString.getMax.append(TokeniserState.replacementChar);
                masExceptionLogPB.length = Comment;
            } else if (min == '-') {
                masExceptionLogPB.length = CommentStartDash;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.toString.getMax.append(min);
                masExceptionLogPB.length = Comment;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            }
        }
    },
    Comment {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char max = r4.getMax();
            if (max == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                r4.setMax++;
                masExceptionLogPB.toString.getMax.append(TokeniserState.replacementChar);
            } else if (max == '-') {
                TokeniserState tokeniserState = CommentEndDash;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (max != 65535) {
                masExceptionLogPB.toString.getMax.append(r4.getMin('-', 0));
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                StringBuilder sb = masExceptionLogPB.toString.getMax;
                sb.append('-');
                sb.append(TokeniserState.replacementChar);
                masExceptionLogPB.length = Comment;
            } else if (min == '-') {
                masExceptionLogPB.length = CommentEnd;
            } else if (min != 65535) {
                StringBuilder sb2 = masExceptionLogPB.toString.getMax;
                sb2.append('-');
                sb2.append(min);
                masExceptionLogPB.length = Comment;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            }
        }
    },
    CommentEnd {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toString.getMax.append("--�");
                masExceptionLogPB.length = Comment;
            } else if (min == '!') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = CommentEndBang;
            } else if (min == '-') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toString.getMax.append('-');
            } else if (min == '>') {
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.length((TokeniserState) this);
                StringBuilder sb = masExceptionLogPB.toString.getMax;
                sb.append("--");
                sb.append(min);
                masExceptionLogPB.length = Comment;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            }
        }
    },
    CommentEndBang {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toString.getMax.append("--!�");
                masExceptionLogPB.length = Comment;
            } else if (min == '-') {
                masExceptionLogPB.toString.getMax.append("--!");
                masExceptionLogPB.length = CommentEndDash;
            } else if (min == '>') {
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                StringBuilder sb = masExceptionLogPB.toString.getMax;
                sb.append("--!");
                sb.append(min);
                masExceptionLogPB.length = Comment;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.length((Token) masExceptionLogPB.toString);
                masExceptionLogPB.length = Data;
            }
        }
    },
    Doctype {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ') {
                masExceptionLogPB.length = BeforeDoctypeName;
                return;
            }
            if (min != '>') {
                if (min != 65535) {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.length = BeforeDoctypeName;
                    return;
                }
                masExceptionLogPB.setMin(this);
            }
            masExceptionLogPB.length((TokeniserState) this);
            masExceptionLogPB.toDoubleRange.length();
            masExceptionLogPB.toDoubleRange.IsOverlapping = true;
            masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
            masExceptionLogPB.length = Data;
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            if (r3.FastBitmap$CoordinateSystem()) {
                masExceptionLogPB.toDoubleRange.length();
                masExceptionLogPB.length = DoctypeName;
                return;
            }
            char min = r3.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.length();
                masExceptionLogPB.toDoubleRange.getMax.append(TokeniserState.replacementChar);
                masExceptionLogPB.length = DoctypeName;
            } else if (min == ' ') {
            } else {
                if (min == 65535) {
                    masExceptionLogPB.setMin(this);
                    masExceptionLogPB.toDoubleRange.length();
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                } else if (min != 9 && min != 10 && min != 12 && min != 13) {
                    masExceptionLogPB.toDoubleRange.length();
                    masExceptionLogPB.toDoubleRange.getMax.append(min);
                    masExceptionLogPB.length = DoctypeName;
                }
            }
        }
    },
    DoctypeName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            if (r3.FastBitmap$CoordinateSystem()) {
                masExceptionLogPB.toDoubleRange.getMax.append(r3.toIntRange());
                return;
            }
            char min = r3.setMin();
            if (min != 0) {
                if (min != ' ') {
                    if (min == '>') {
                        masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                        masExceptionLogPB.length = Data;
                        return;
                    } else if (min == 65535) {
                        masExceptionLogPB.setMin(this);
                        masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                        masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                        masExceptionLogPB.length = Data;
                        return;
                    } else if (!(min == 9 || min == 10 || min == 12 || min == 13)) {
                        masExceptionLogPB.toDoubleRange.getMax.append(min);
                        return;
                    }
                }
                masExceptionLogPB.length = AfterDoctypeName;
                return;
            }
            masExceptionLogPB.length((TokeniserState) this);
            masExceptionLogPB.toDoubleRange.getMax.append(TokeniserState.replacementChar);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r5) {
            if (r5.setMax()) {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (r5.getMax(9, 10, 13, 12, ' ')) {
                r5.setMax++;
            } else if (r5.getMin((char) Typography.greater)) {
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                TokeniserState tokeniserState = Data;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState;
            } else if (r5.setMin("PUBLIC")) {
                masExceptionLogPB.toDoubleRange.setMax = "PUBLIC";
                masExceptionLogPB.length = AfterDoctypePublicKeyword;
            } else if (r5.setMin("SYSTEM")) {
                masExceptionLogPB.toDoubleRange.setMax = "SYSTEM";
                masExceptionLogPB.length = AfterDoctypeSystemKeyword;
            } else {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                TokeniserState tokeniserState2 = BogusDoctype;
                masExceptionLogPB.getMax.setMax++;
                masExceptionLogPB.length = tokeniserState2;
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ') {
                masExceptionLogPB.length = BeforeDoctypePublicIdentifier;
            } else if (min == '\"') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = DoctypePublicIdentifier_doubleQuoted;
            } else if (min == '\'') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = DoctypePublicIdentifier_singleQuoted;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length = BogusDoctype;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min != 9 && min != 10 && min != 12 && min != 13 && min != ' ') {
                if (min == '\"') {
                    masExceptionLogPB.length = DoctypePublicIdentifier_doubleQuoted;
                } else if (min == '\'') {
                    masExceptionLogPB.length = DoctypePublicIdentifier_singleQuoted;
                } else if (min == '>') {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                } else if (min != 65535) {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length = BogusDoctype;
                } else {
                    masExceptionLogPB.setMin(this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                }
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.length.append(TokeniserState.replacementChar);
            } else if (min == '\"') {
                masExceptionLogPB.length = AfterDoctypePublicIdentifier;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.toDoubleRange.length.append(min);
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.length.append(TokeniserState.replacementChar);
            } else if (min == '\'') {
                masExceptionLogPB.length = AfterDoctypePublicIdentifier;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.toDoubleRange.length.append(min);
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ') {
                masExceptionLogPB.length = BetweenDoctypePublicAndSystemIdentifiers;
            } else if (min == '\"') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = DoctypeSystemIdentifier_doubleQuoted;
            } else if (min == '\'') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = DoctypeSystemIdentifier_singleQuoted;
            } else if (min == '>') {
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length = BogusDoctype;
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min != 9 && min != 10 && min != 12 && min != 13 && min != ' ') {
                if (min == '\"') {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.length = DoctypeSystemIdentifier_doubleQuoted;
                } else if (min == '\'') {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.length = DoctypeSystemIdentifier_singleQuoted;
                } else if (min == '>') {
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                } else if (min != 65535) {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length = BogusDoctype;
                } else {
                    masExceptionLogPB.setMin(this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                }
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ') {
                masExceptionLogPB.length = BeforeDoctypeSystemIdentifier;
            } else if (min == '\"') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = DoctypeSystemIdentifier_doubleQuoted;
            } else if (min == '\'') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.length = DoctypeSystemIdentifier_singleQuoted;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min != 9 && min != 10 && min != 12 && min != 13 && min != ' ') {
                if (min == '\"') {
                    masExceptionLogPB.length = DoctypeSystemIdentifier_doubleQuoted;
                } else if (min == '\'') {
                    masExceptionLogPB.length = DoctypeSystemIdentifier_singleQuoted;
                } else if (min == '>') {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                } else if (min != 65535) {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length = BogusDoctype;
                } else {
                    masExceptionLogPB.setMin(this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                }
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.setMin.append(TokeniserState.replacementChar);
            } else if (min == '\"') {
                masExceptionLogPB.length = AfterDoctypeSystemIdentifier;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.toDoubleRange.setMin.append(min);
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r4) {
            char min = r4.setMin();
            if (min == 0) {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.setMin.append(TokeniserState.replacementChar);
            } else if (min == '\'') {
                masExceptionLogPB.length = AfterDoctypeSystemIdentifier;
            } else if (min == '>') {
                masExceptionLogPB.length((TokeniserState) this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min != 65535) {
                masExceptionLogPB.toDoubleRange.setMin.append(min);
            } else {
                masExceptionLogPB.setMin(this);
                masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min != 9 && min != 10 && min != 12 && min != 13 && min != ' ') {
                if (min == '>') {
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                } else if (min != 65535) {
                    masExceptionLogPB.length((TokeniserState) this);
                    masExceptionLogPB.length = BogusDoctype;
                } else {
                    masExceptionLogPB.setMin(this);
                    masExceptionLogPB.toDoubleRange.IsOverlapping = true;
                    masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                    masExceptionLogPB.length = Data;
                }
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3) {
            char min = r3.setMin();
            if (min == '>') {
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            } else if (min == 65535) {
                masExceptionLogPB.length((Token) masExceptionLogPB.toDoubleRange);
                masExceptionLogPB.length = Data;
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: package-private */
        public final void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r7) {
            String str;
            int max = r7.setMax((CharSequence) "]]>");
            if (max != -1) {
                str = LogFileLogAppender.AnonymousClass2.setMax(r7.getMin, r7.getMax, r7.setMax, max);
                r7.setMax += max;
            } else {
                str = r7.toFloatRange();
            }
            masExceptionLogPB.isInside.append(str);
            if (r7.getMax("]]>") || r7.setMax()) {
                masExceptionLogPB.length((Token) new Token.length(masExceptionLogPB.isInside.toString()));
                masExceptionLogPB.length = Data;
            }
        }
    };
    
    static final char[] attributeDoubleValueCharsSorted = null;
    static final char[] attributeNameCharsSorted = null;
    static final char[] attributeSingleValueCharsSorted = null;
    static final char[] attributeValueUnquoted = null;
    private static final char eof = '￿';
    static final char nullChar = '\u0000';
    private static final char replacementChar = '�';
    /* access modifiers changed from: private */
    public static final String replacementStr = null;

    public abstract void read(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r2);

    static {
        attributeSingleValueCharsSorted = new char[]{0, Typography.amp, '\''};
        attributeDoubleValueCharsSorted = new char[]{0, Typography.quote, Typography.amp};
        attributeNameCharsSorted = new char[]{0, 9, 10, 12, 13, ' ', Typography.quote, '\'', '/', Typography.less, '=', Typography.greater};
        attributeValueUnquoted = new char[]{0, 9, 10, 12, 13, ' ', Typography.quote, Typography.amp, '\'', Typography.less, '=', Typography.greater, '`'};
        replacementStr = "�";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void handleDataEndTag(o.MasExceptionLogPB r2, o.LogFileLogAppender.AnonymousClass2 r3, ru.noties.markwon.html.impl.jsoup.parser.TokeniserState r4) {
        /*
            boolean r0 = r3.FastBitmap$CoordinateSystem()
            if (r0 == 0) goto L_0x0015
            java.lang.String r3 = r3.toIntRange()
            ru.noties.markwon.html.impl.jsoup.parser.Token$toFloatRange r4 = r2.toFloatRange
            r4.setMax((java.lang.String) r3)
            java.lang.StringBuilder r2 = r2.isInside
            r2.append(r3)
            return
        L_0x0015:
            r0 = 0
            boolean r1 = r2.getMin()
            if (r1 == 0) goto L_0x0065
            boolean r1 = r3.setMax()
            if (r1 != 0) goto L_0x0065
            char r3 = r3.setMin()
            r1 = 9
            if (r3 == r1) goto L_0x0060
            r1 = 10
            if (r3 == r1) goto L_0x0060
            r1 = 12
            if (r3 == r1) goto L_0x0060
            r1 = 13
            if (r3 == r1) goto L_0x0060
            r1 = 32
            if (r3 == r1) goto L_0x0060
            r1 = 47
            if (r3 == r1) goto L_0x005b
            r1 = 62
            if (r3 == r1) goto L_0x0048
            java.lang.StringBuilder r0 = r2.isInside
            r0.append(r3)
            goto L_0x0065
        L_0x0048:
            ru.noties.markwon.html.impl.jsoup.parser.Token$toFloatRange r3 = r2.toFloatRange
            java.lang.String r1 = r3.length
            if (r1 == 0) goto L_0x0051
            r3.setMax()
        L_0x0051:
            ru.noties.markwon.html.impl.jsoup.parser.Token$toFloatRange r3 = r2.toFloatRange
            r2.length((ru.noties.markwon.html.impl.jsoup.parser.Token) r3)
            ru.noties.markwon.html.impl.jsoup.parser.TokeniserState r3 = Data
            r2.length = r3
            goto L_0x0066
        L_0x005b:
            ru.noties.markwon.html.impl.jsoup.parser.TokeniserState r3 = SelfClosingStartTag
            r2.length = r3
            goto L_0x0066
        L_0x0060:
            ru.noties.markwon.html.impl.jsoup.parser.TokeniserState r3 = BeforeAttributeName
            r2.length = r3
            goto L_0x0066
        L_0x0065:
            r0 = 1
        L_0x0066:
            if (r0 == 0) goto L_0x0081
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "</"
            r3.<init>(r0)
            java.lang.StringBuilder r0 = r2.isInside
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.getMax(r3)
            r2.length = r4
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.noties.markwon.html.impl.jsoup.parser.TokeniserState.handleDataEndTag(o.MasExceptionLogPB, o.LogFileLogAppender$2, ru.noties.markwon.html.impl.jsoup.parser.TokeniserState):void");
    }

    /* access modifiers changed from: private */
    public static void readData(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r2, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char max = r2.getMax();
        if (max == 0) {
            masExceptionLogPB.length(tokeniserState);
            r2.setMax++;
            masExceptionLogPB.getMax("�");
        } else if (max == '<') {
            masExceptionLogPB.getMax.setMax++;
            masExceptionLogPB.length = tokeniserState2;
        } else if (max != 65535) {
            masExceptionLogPB.getMax(r2.getMin(Typography.less, 0));
        } else {
            masExceptionLogPB.length((Token) new Token.setMin());
        }
    }

    /* access modifiers changed from: private */
    public static void readCharRef(MasExceptionLogPB masExceptionLogPB, TokeniserState tokeniserState) {
        int[] length = masExceptionLogPB.length((Character) null, false);
        if (length == null) {
            masExceptionLogPB.getMax("&");
        } else {
            masExceptionLogPB.getMax(new String(length, 0, length.length));
        }
        masExceptionLogPB.length = tokeniserState;
    }

    /* access modifiers changed from: private */
    public static void readEndTag(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r1, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (r1.FastBitmap$CoordinateSystem()) {
            masExceptionLogPB.toFloatRange = masExceptionLogPB.hashCode.length();
            masExceptionLogPB.length = tokeniserState;
            return;
        }
        masExceptionLogPB.getMax("</");
        masExceptionLogPB.length = tokeniserState2;
    }

    /* access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(MasExceptionLogPB masExceptionLogPB, LogFileLogAppender.AnonymousClass2 r3, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (r3.FastBitmap$CoordinateSystem()) {
            String intRange = r3.toIntRange();
            masExceptionLogPB.isInside.append(intRange);
            masExceptionLogPB.getMax(intRange);
            return;
        }
        char min = r3.setMin();
        if (min == 9 || min == 10 || min == 12 || min == 13 || min == ' ' || min == '/' || min == '>') {
            if (masExceptionLogPB.isInside.toString().equals("script")) {
                masExceptionLogPB.length = tokeniserState;
            } else {
                masExceptionLogPB.length = tokeniserState2;
            }
            masExceptionLogPB.getMax(String.valueOf(min));
            return;
        }
        r3.setMax--;
        masExceptionLogPB.length = tokeniserState2;
    }
}
