package ru.noties.markwon.html.impl.jsoup.parser;

import androidx.annotation.NonNull;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Locale;
import o.LogFileLogAppender;

public abstract class Token {
    public final TokenType getMin;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public abstract Token length();

    protected Token(@NonNull TokenType tokenType) {
        this.getMin = tokenType;
    }

    public static final class getMin extends Token {
        boolean IsOverlapping = false;
        final StringBuilder getMax = new StringBuilder();
        final StringBuilder length = new StringBuilder();
        String setMax = null;
        final StringBuilder setMin = new StringBuilder();

        public getMin() {
            super(TokenType.Doctype);
        }

        public final Token length() {
            StringBuilder sb = this.getMax;
            if (sb != null) {
                sb.delete(0, sb.length());
            }
            this.setMax = null;
            StringBuilder sb2 = this.length;
            if (sb2 != null) {
                sb2.delete(0, sb2.length());
            }
            StringBuilder sb3 = this.setMin;
            if (sb3 != null) {
                sb3.delete(0, sb3.length());
            }
            this.IsOverlapping = false;
            return this;
        }
    }

    public static abstract class toFloatRange extends Token {
        private StringBuilder IsOverlapping = new StringBuilder();
        private boolean equals = false;
        public String getMax;
        public LogFileLogAppender isInside;
        public String length;
        public String setMax;
        boolean setMin = false;
        private String toFloatRange;
        public boolean toIntRange = false;

        protected toFloatRange(@NonNull TokenType tokenType) {
            super(tokenType);
        }

        /* renamed from: getMin */
        public toFloatRange length() {
            this.setMax = null;
            this.getMax = null;
            this.length = null;
            StringBuilder sb = this.IsOverlapping;
            if (sb != null) {
                sb.delete(0, sb.length());
            }
            this.toFloatRange = null;
            this.setMin = false;
            this.equals = false;
            this.toIntRange = false;
            this.isInside = null;
            return this;
        }

        public final void setMax() {
            String str;
            if (this.isInside == null) {
                this.isInside = new LogFileLogAppender();
            }
            String str2 = this.length;
            if (str2 != null) {
                String trim = str2.trim();
                this.length = trim;
                if (trim.length() > 0) {
                    if (this.equals) {
                        str = this.IsOverlapping.length() > 0 ? this.IsOverlapping.toString() : this.toFloatRange;
                    } else {
                        str = this.setMin ? "" : null;
                    }
                    LogFileLogAppender logFileLogAppender = this.isInside;
                    String str3 = this.length;
                    int min = logFileLogAppender.setMin(str3);
                    if (min != -1) {
                        logFileLogAppender.getMin[min] = str;
                    } else {
                        int i = logFileLogAppender.setMin + 1;
                        if (i >= logFileLogAppender.setMin) {
                            int length2 = logFileLogAppender.length.length;
                            if (length2 < i) {
                                int i2 = 4;
                                if (length2 >= 4) {
                                    i2 = logFileLogAppender.setMin * 2;
                                }
                                if (i <= i2) {
                                    i = i2;
                                }
                                logFileLogAppender.length = LogFileLogAppender.getMax(logFileLogAppender.length, i);
                                logFileLogAppender.getMin = LogFileLogAppender.getMax(logFileLogAppender.getMin, i);
                            }
                            logFileLogAppender.length[logFileLogAppender.setMin] = str3;
                            logFileLogAppender.getMin[logFileLogAppender.setMin] = str;
                            logFileLogAppender.setMin++;
                        } else {
                            throw new IllegalArgumentException("Must be true");
                        }
                    }
                }
            }
            this.length = null;
            this.setMin = false;
            this.equals = false;
            StringBuilder sb = this.IsOverlapping;
            if (sb != null) {
                sb.delete(0, sb.length());
            }
            this.toFloatRange = null;
        }

        /* access modifiers changed from: package-private */
        public final void setMax(String str) {
            String str2 = this.setMax;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.setMax = str;
            this.getMax = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
        }

        /* access modifiers changed from: package-private */
        public final void length(String str) {
            this.equals = true;
            String str2 = this.toFloatRange;
            if (str2 != null) {
                this.IsOverlapping.append(str2);
                this.toFloatRange = null;
            }
            if (this.IsOverlapping.length() == 0) {
                this.toFloatRange = str;
            } else {
                this.IsOverlapping.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setMax(char c) {
            this.equals = true;
            String str = this.toFloatRange;
            if (str != null) {
                this.IsOverlapping.append(str);
                this.toFloatRange = null;
            }
            this.IsOverlapping.append(c);
        }

        /* access modifiers changed from: package-private */
        public final void getMin(int[] iArr) {
            this.equals = true;
            String str = this.toFloatRange;
            if (str != null) {
                this.IsOverlapping.append(str);
                this.toFloatRange = null;
            }
            for (int appendCodePoint : iArr) {
                this.IsOverlapping.appendCodePoint(appendCodePoint);
            }
        }
    }

    public static final class toIntRange extends toFloatRange {
        public toIntRange() {
            super(TokenType.StartTag);
            this.isInside = new LogFileLogAppender();
        }

        public final toFloatRange getMin() {
            super.length();
            this.isInside = new LogFileLogAppender();
            return this;
        }

        public final String toString() {
            boolean z = false;
            if (this.isInside == null || this.isInside.setMin <= 0) {
                StringBuilder sb = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
                if (this.setMax == null || this.setMax.length() == 0) {
                    z = true;
                }
                if (!z) {
                    sb.append(this.setMax);
                    sb.append(SimpleComparison.GREATER_THAN_OPERATION);
                    return sb.toString();
                }
                throw new IllegalArgumentException("Must be false");
            }
            StringBuilder sb2 = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
            if (this.setMax == null || this.setMax.length() == 0) {
                z = true;
            }
            if (!z) {
                sb2.append(this.setMax);
                sb2.append(" ");
                sb2.append(this.isInside.toString());
                sb2.append(SimpleComparison.GREATER_THAN_OPERATION);
                return sb2.toString();
            }
            throw new IllegalArgumentException("Must be false");
        }

        public final /* synthetic */ Token length() {
            super.length();
            this.isInside = new LogFileLogAppender();
            return this;
        }
    }

    public static final class IsOverlapping extends toFloatRange {
        public IsOverlapping() {
            super(TokenType.EndTag);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("</");
            if (!(this.setMax == null || this.setMax.length() == 0)) {
                sb.append(this.setMax);
                sb.append(SimpleComparison.GREATER_THAN_OPERATION);
                return sb.toString();
            }
            throw new IllegalArgumentException("Must be false");
        }
    }

    public static final class setMax extends Token {
        final StringBuilder getMax = new StringBuilder();
        boolean setMax = false;

        public final Token length() {
            StringBuilder sb = this.getMax;
            if (sb != null) {
                sb.delete(0, sb.length());
            }
            this.setMax = false;
            return this;
        }

        public setMax() {
            super(TokenType.Comment);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<!--");
            sb.append(this.getMax.toString());
            sb.append("-->");
            return sb.toString();
        }
    }

    public static class getMax extends Token {
        public String length;

        public getMax() {
            super(TokenType.Character);
        }

        public final Token length() {
            this.length = null;
            return this;
        }

        public String toString() {
            return this.length;
        }
    }

    public static final class length extends getMax {
        length(String str) {
            this.length = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<![CDATA[");
            sb.append(this.length);
            sb.append("]]>");
            return sb.toString();
        }
    }

    public static final class setMin extends Token {
        public final Token length() {
            return this;
        }

        setMin() {
            super(TokenType.EOF);
        }
    }
}
