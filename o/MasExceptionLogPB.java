package o;

import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import o.LogFileLogAppender;
import ru.noties.markwon.html.impl.jsoup.parser.Token;
import ru.noties.markwon.html.impl.jsoup.parser.TokeniserState;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public final class MasExceptionLogPB {
    private static final char[] invoke;
    static final int[] setMin = {8364, TsExtractor.TS_STREAM_TYPE_AC3, 8218, SecExceptionCode.SEC_ERROR_DYN_ENC_NO_MEMORY, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public String FastBitmap$CoordinateSystem;
    private final int[] Grayscale$Algorithm = new int[2];
    public String IsOverlapping = null;
    private final appendDataToFile Mean$Arithmetic;
    public Token.toIntRange equals = new Token.toIntRange();
    public final LogFileLogAppender.AnonymousClass2 getMax;
    public Token getMin;
    public Token.IsOverlapping hashCode = new Token.IsOverlapping();
    public StringBuilder isInside = new StringBuilder(1024);
    public TokeniserState length = TokeniserState.Data;
    public boolean setMax = false;
    public Token.getMin toDoubleRange = new Token.getMin();
    public Token.toFloatRange toFloatRange;
    public StringBuilder toIntRange = new StringBuilder(1024);
    public Token.setMax toString = new Token.setMax();
    private final int[] valueOf = new int[1];
    public Token.getMax values = new Token.getMax();

    public final class MasExceptionLogOrBuilder implements ScrollingPagerIndicator.getMax<ViewPager> {
        private ViewPager getMax;
        private DataSetObserver getMin;
        private ViewPager.setMax length;
        /* access modifiers changed from: private */
        public setExpandActivityOverflowButtonDrawable setMax;

        public final /* synthetic */ void length(@NonNull final ScrollingPagerIndicator scrollingPagerIndicator, @NonNull Object obj) {
            final ViewPager viewPager = (ViewPager) obj;
            setExpandActivityOverflowButtonDrawable adapter = viewPager.getAdapter();
            this.setMax = adapter;
            if (adapter != null) {
                this.getMax = viewPager;
                scrollingPagerIndicator.setDotCount(adapter.getCount());
                scrollingPagerIndicator.setCurrentPosition(viewPager.getCurrentItem());
                AnonymousClass3 r0 = new DataSetObserver() {
                    public final void onChanged() {
                        scrollingPagerIndicator.reattach();
                    }

                    public final void onInvalidated() {
                        onChanged();
                    }
                };
                this.getMin = r0;
                this.setMax.registerDataSetObserver(r0);
                AnonymousClass2 r02 = new ViewPager.setMax() {
                    boolean length = true;

                    public final void onPageScrolled(int i, float f, int i2) {
                        if (f < 0.0f) {
                            f = 0.0f;
                        } else if (f > 1.0f) {
                            f = 1.0f;
                        }
                        scrollingPagerIndicator.onPageScrolled(i, f);
                    }

                    public final void onPageSelected(int i) {
                        if (this.length) {
                            scrollingPagerIndicator.setDotCount(MasExceptionLogOrBuilder.this.setMax.getCount());
                            scrollingPagerIndicator.setCurrentPosition(viewPager.getCurrentItem());
                        }
                    }

                    public final void onPageScrollStateChanged(int i) {
                        this.length = i == 0;
                    }
                };
                this.length = r02;
                viewPager.addOnPageChangeListener(r02);
                return;
            }
            throw new IllegalStateException("Set adapter before call attachToPager() method");
        }

        public final void length() {
            this.setMax.unregisterDataSetObserver(this.getMin);
            this.getMax.removeOnPageChangeListener(this.length);
        }
    }

    static {
        char[] cArr = {9, 10, 13, 12, ' ', Typography.less, Typography.amp};
        invoke = cArr;
        Arrays.sort(cArr);
    }

    public abstract class MasExceptionLog {

        public static class setMin {
            public final Map<String, hasMessages> length = new HashMap(2);
        }

        public abstract void getMax(@NonNull appendFlushLog appendflushlog, @NonNull DiagnoseLogAppender diagnoseLogAppender, @NonNull EncryptAppender encryptAppender);

        @Nullable
        public abstract hasMessages length(@NonNull String str);

        /* renamed from: o.MasExceptionLogPB$MasExceptionLog$1  reason: invalid class name */
        public abstract class AnonymousClass1 {
            private static final Rect getMax = new Rect();
            private static final RectF length = new RectF();
            private static final Paint setMax = new Paint(1);

            public static Rect setMin() {
                return getMax;
            }

            static RectF getMin() {
                return length;
            }

            public static Paint setMax() {
                return setMax;
            }
        }

        public final class Builder implements LeadingMarginSpan {
            private final Paint getMax = AnonymousClass1.setMax();
            private final String getMin;
            private int length;
            private final maybeForceBuilderInitialization setMin;

            public Builder(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull String str) {
                this.setMin = maybeforcebuilderinitialization;
                this.getMin = str;
            }

            public final int getLeadingMargin(boolean z) {
                int i = this.length;
                return i > 0 ? i : this.setMin.length();
            }

            public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
                if (z && parsePartialFrom.setMax(i6, charSequence, this)) {
                    this.getMax.set(paint);
                    this.setMin.getMax(this.getMax);
                    int measureText = (int) (paint.measureText(this.getMin) + 0.5f);
                    int length2 = this.setMin.length();
                    if (measureText > length2) {
                        this.length = measureText;
                        length2 = measureText;
                    } else {
                        this.length = 0;
                    }
                    canvas.drawText(this.getMin, (float) (i2 > 0 ? (i + (length2 * i2)) - measureText : i + (i2 * length2) + (length2 - measureText)), (float) i4, this.getMax);
                }
            }
        }
    }

    public MasExceptionLogPB(LogFileLogAppender.AnonymousClass2 r3, appendDataToFile appenddatatofile) {
        this.getMax = r3;
        this.Mean$Arithmetic = appenddatatofile;
    }

    public final void length(Token token) {
        if (!this.setMax) {
            this.getMin = token;
            this.setMax = true;
            if (token.getMin == Token.TokenType.StartTag) {
                this.FastBitmap$CoordinateSystem = ((Token.toIntRange) token).setMax;
            } else if (token.getMin == Token.TokenType.EndTag && ((Token.IsOverlapping) token).isInside != null && this.Mean$Arithmetic.canAddError()) {
                appendDataToFile appenddatatofile = this.Mean$Arithmetic;
                LogFileLogAppender.AnonymousClass2 r1 = this.getMax;
                appenddatatofile.add(new MdapFileLogAppender(r1.length + r1.setMax, "Attributes incorrectly present on end tag"));
            }
        } else {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
    }

    public final void getMax(String str) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = str;
            return;
        }
        if (this.toIntRange.length() == 0) {
            this.toIntRange.append(this.IsOverlapping);
        }
        this.toIntRange.append(str);
    }

    public final int[] length(Character ch, boolean z) {
        int i;
        if (this.getMax.setMax()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.getMax.getMax()) || this.getMax.setMax(invoke)) {
            return null;
        }
        int[] iArr = this.valueOf;
        LogFileLogAppender.AnonymousClass2 r0 = this.getMax;
        r0.setMin = r0.setMax;
        if (this.getMax.getMax("#")) {
            boolean min = this.getMax.setMin("X");
            LogFileLogAppender.AnonymousClass2 r02 = this.getMax;
            String isInside2 = min ? r02.isInside() : r02.equals();
            if (isInside2.length() == 0) {
                length("numeric reference with no numerals");
                LogFileLogAppender.AnonymousClass2 r9 = this.getMax;
                r9.setMax = r9.setMin;
                return null;
            }
            if (!this.getMax.getMax(";")) {
                length("missing semicolon");
            }
            try {
                i = Integer.valueOf(isInside2, min ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                length("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (i >= 128 && i < setMin.length + 128) {
                length("character is not a valid unicode code point");
                i = setMin[i - 128];
            }
            iArr[0] = i;
            return iArr;
        }
        String IsOverlapping2 = this.getMax.IsOverlapping();
        boolean min2 = this.getMax.getMin(';');
        if (!(moveFileByBundle.length(IsOverlapping2) && min2)) {
            LogFileLogAppender.AnonymousClass2 r92 = this.getMax;
            r92.setMax = r92.setMin;
            if (min2) {
                length(String.format("invalid named referenece '%s'", new Object[]{IsOverlapping2}));
            }
            return null;
        } else if (!z || (!this.getMax.FastBitmap$CoordinateSystem() && !this.getMax.values() && !this.getMax.getMax('=', '-', '_'))) {
            if (!this.getMax.getMax(";")) {
                length("missing semicolon");
            }
            int length2 = moveFileByBundle.length(IsOverlapping2, this.Grayscale$Algorithm);
            if (length2 == 1) {
                iArr[0] = this.Grayscale$Algorithm[0];
                return iArr;
            } else if (length2 == 2) {
                return this.Grayscale$Algorithm;
            } else {
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(String.valueOf(IsOverlapping2)));
            }
        } else {
            LogFileLogAppender.AnonymousClass2 r93 = this.getMax;
            r93.setMax = r93.setMin;
            return null;
        }
    }

    public final void setMax() {
        Token.toFloatRange tofloatrange = this.toFloatRange;
        if (tofloatrange.length != null) {
            tofloatrange.setMax();
        }
        length((Token) this.toFloatRange);
    }

    public final boolean getMin() {
        if (this.FastBitmap$CoordinateSystem != null) {
            Token.toFloatRange tofloatrange = this.toFloatRange;
            if (tofloatrange.setMax == null || tofloatrange.setMax.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            } else if (tofloatrange.setMax.equalsIgnoreCase(this.FastBitmap$CoordinateSystem)) {
                return true;
            }
        }
        return false;
    }

    public final void length(TokeniserState tokeniserState) {
        if (this.Mean$Arithmetic.canAddError()) {
            appendDataToFile appenddatatofile = this.Mean$Arithmetic;
            LogFileLogAppender.AnonymousClass2 r2 = this.getMax;
            appenddatatofile.add(new MdapFileLogAppender(r2.length + r2.setMax, "Unexpected character '%s' in input state [%s]", Character.valueOf(this.getMax.getMax()), tokeniserState));
        }
    }

    public final void setMin(TokeniserState tokeniserState) {
        if (this.Mean$Arithmetic.canAddError()) {
            appendDataToFile appenddatatofile = this.Mean$Arithmetic;
            LogFileLogAppender.AnonymousClass2 r2 = this.getMax;
            appenddatatofile.add(new MdapFileLogAppender(r2.length + r2.setMax, "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    private void length(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-899136960, oncanceled);
            onCancelLoad.getMin(-899136960, oncanceled);
        }
        if (this.Mean$Arithmetic.canAddError()) {
            appendDataToFile appenddatatofile = this.Mean$Arithmetic;
            LogFileLogAppender.AnonymousClass2 r4 = this.getMax;
            appenddatatofile.add(new MdapFileLogAppender(r4.length + r4.setMax, "Invalid character reference: %s", str));
        }
    }
}
