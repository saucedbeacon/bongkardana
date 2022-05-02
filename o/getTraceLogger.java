package o;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Collections;
import javax.annotation.Nullable;
import o.Draft_10;
import o.Draft_75;
import o.Draft_76;
import o.InvalidDataException;
import o.createChallenge;

final class getTraceLogger {
    private static final char[] setMin = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String IsOverlapping;
    @Nullable
    private Draft_76.getMin equals;
    @Nullable
    createChallenge.setMax getMax;
    @Nullable
    getPart getMin;
    private final Draft_76 isInside;
    @Nullable
    String length;
    @Nullable
    Draft_10.IncompleteException.getMin setMax;
    @Nullable
    private translateRegularFrame toFloatRange;
    private final InvalidDataException.getMin toIntRange;
    private final boolean values;

    getTraceLogger(String str, Draft_76 draft_76, @Nullable String str2, @Nullable Draft_75 draft_75, @Nullable translateRegularFrame translateregularframe, boolean z, boolean z2, boolean z3) {
        this.IsOverlapping = str;
        this.isInside = draft_76;
        this.length = str2;
        InvalidDataException.getMin getmin = new InvalidDataException.getMin();
        this.toIntRange = getmin;
        this.toFloatRange = translateregularframe;
        this.values = z;
        if (draft_75 != null) {
            Draft_75.length length2 = new Draft_75.length();
            Collections.addAll(length2.setMin, draft_75.length);
            getmin.setMin = length2;
        }
        if (z2) {
            this.setMax = new Draft_10.IncompleteException.getMin();
        } else if (z3) {
            createChallenge.setMax setmax = new createChallenge.setMax();
            this.getMax = setmax;
            translateRegularFrame translateregularframe2 = createChallenge.length;
            if (translateregularframe2 == null) {
                throw new NullPointerException("type == null");
            } else if (translateregularframe2.length.equals("multipart")) {
                setmax.length = translateregularframe2;
            } else {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(translateregularframe2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin(String str, String str2) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1108866234, oncanceled);
            onCancelLoad.getMin(-1108866234, oncanceled);
        }
        if ("Content-Type".equalsIgnoreCase(str)) {
            translateRegularFrame length3 = translateRegularFrame.length(str2);
            if (length3 != null) {
                this.toFloatRange = length3;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)));
        }
        this.toIntRange.length(str, str2);
    }

    static String length(String str, boolean z) {
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                submitLazy submitlazy = new submitLazy();
                submitlazy.setMin(str, 0, i);
                submitLazy submitlazy2 = null;
                while (i < length2) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (submitlazy2 == null) {
                                submitlazy2 = new submitLazy();
                            }
                            submitlazy2.getMin(codePointAt2);
                            while (!submitlazy2.setMax()) {
                                byte IsOverlapping2 = submitlazy2.IsOverlapping() & 255;
                                submitlazy.equals(37);
                                submitlazy.equals((int) setMin[(IsOverlapping2 >> 4) & 15]);
                                submitlazy.equals((int) setMin[IsOverlapping2 & Ascii.SI]);
                            }
                        } else {
                            submitlazy.getMin(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return submitlazy.invokeSuspend();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(String str, @Nullable String str2, boolean z) {
        String str3 = this.length;
        if (str3 != null) {
            Draft_76.getMin length2 = this.isInside.length(str3);
            this.equals = length2;
            if (length2 != null) {
                this.length = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.isInside);
                sb.append(", Relative: ");
                sb.append(this.length);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.equals.setMin(str, str2);
        } else {
            this.equals.length(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final InvalidDataException setMax() {
        Draft_76 draft_76;
        Draft_76.getMin getmin = this.equals;
        if (getmin != null) {
            draft_76 = getmin.setMin();
        } else {
            Draft_76.getMin length2 = this.isInside.length(this.length);
            if (length2 != null) {
                draft_76 = length2.setMin();
            } else {
                draft_76 = null;
            }
            if (draft_76 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.isInside);
                sb.append(", Relative: ");
                sb.append(this.length);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        setMin setmin = this.getMin;
        if (setmin == null) {
            Draft_10.IncompleteException.getMin getmin2 = this.setMax;
            if (getmin2 != null) {
                setmin = new Draft_10.IncompleteException(getmin2.setMin, getmin2.getMin);
            } else {
                createChallenge.setMax setmax = this.getMax;
                if (setmax != null) {
                    if (!setmax.getMin.isEmpty()) {
                        setmin = new createChallenge(setmax.setMax, setmax.length, setmax.getMin);
                    } else {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                } else if (this.values) {
                    setmin = getPart.length(new byte[0]);
                }
            }
        }
        translateRegularFrame translateregularframe = this.toFloatRange;
        if (translateregularframe != null) {
            if (setmin != null) {
                setmin = new setMin(setmin, translateregularframe);
            } else {
                this.toIntRange.length("Content-Type", translateregularframe.toString());
            }
        }
        InvalidDataException.getMin getmin3 = this.toIntRange;
        getmin3.getMin = draft_76;
        InvalidDataException.getMin length3 = getmin3.length(this.IsOverlapping, setmin);
        if (length3.getMin != null) {
            return new InvalidDataException(length3);
        }
        throw new IllegalStateException("url == null");
    }

    static class setMin extends getPart {
        private final getPart getMax;
        private final translateRegularFrame length;

        setMin(getPart getpart, translateRegularFrame translateregularframe) {
            this.getMax = getpart;
            this.length = translateregularframe;
        }

        public final translateRegularFrame setMax() {
            return this.length;
        }

        public final long setMin() throws IOException {
            return this.getMax.setMin();
        }

        public final void getMin(executeSerial executeserial) throws IOException {
            this.getMax.getMin(executeserial);
        }
    }
}
