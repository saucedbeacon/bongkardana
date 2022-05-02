package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.reader.ReaderException;

public final class addAutoLogActivity {
    private boolean IsOverlapping;
    private int equals;
    public int[] getMax;
    public String getMin;
    private final Reader isInside;
    public int length;
    public int setMax;
    public int setMin;
    private char[] toFloatRange;
    public int toIntRange;

    private static boolean length(int i) {
        if ((i >= 32 && i <= 126) || i == 9 || i == 10 || i == 13 || i == 133) {
            return true;
        }
        if (i >= 160 && i <= 55295) {
            return true;
        }
        if (i < 57344 || i > 65533) {
            return i >= 65536 && i <= 1114111;
        }
        return true;
    }

    public addAutoLogActivity(String str) {
        this((Reader) new StringReader(str));
        this.getMin = "'string'";
    }

    private addAutoLogActivity(Reader reader) {
        this.length = 0;
        this.setMax = 0;
        this.setMin = 0;
        this.toIntRange = 0;
        this.getMin = "'reader'";
        this.getMax = new int[0];
        this.equals = 0;
        this.isInside = reader;
        this.IsOverlapping = false;
        this.toFloatRange = new char[1025];
    }

    public final void getMax() {
        setMin(1);
    }

    public final void setMin(int i) {
        for (int i2 = 0; i2 < i && setMin(); i2++) {
            int[] iArr = this.getMax;
            int i3 = this.length;
            this.length = i3 + 1;
            int i4 = iArr[i3];
            this.setMax++;
            if (setSpmMonitor.length.length(i4) || (i4 == 13 && setMin() && this.getMax[this.length] != 10)) {
                this.setMin++;
                this.toIntRange = 0;
            } else if (i4 != 65279) {
                this.toIntRange++;
            }
        }
    }

    public final String getMin(int i) {
        if (i == 0) {
            return "";
        }
        if (getMax(i)) {
            return new String(this.getMax, this.length, i);
        }
        int[] iArr = this.getMax;
        int i2 = this.length;
        return new String(iArr, i2, Math.min(i, this.equals - i2));
    }

    public final String setMax(int i) {
        String min = getMin(i);
        this.length += i;
        this.setMax += i;
        this.toIntRange += i;
        return min;
    }

    public final boolean setMin() {
        return getMax(0);
    }

    public final boolean getMax(int i) {
        if (!this.IsOverlapping && this.length + i >= this.equals) {
            try {
                int read = this.isInside.read(this.toFloatRange, 0, 1024);
                if (read > 0) {
                    int i2 = this.equals - this.length;
                    this.getMax = Arrays.copyOfRange(this.getMax, this.length, this.equals + read);
                    if (Character.isHighSurrogate(this.toFloatRange[read - 1])) {
                        if (this.isInside.read(this.toFloatRange, read, 1) == -1) {
                            this.IsOverlapping = true;
                        } else {
                            read++;
                        }
                    }
                    int i3 = 0;
                    int i4 = 32;
                    while (i3 < read) {
                        int codePointAt = Character.codePointAt(this.toFloatRange, i3);
                        this.getMax[i2] = codePointAt;
                        if (length(codePointAt)) {
                            i3 += Character.charCount(codePointAt);
                        } else {
                            i3 = read;
                            i4 = codePointAt;
                        }
                        i2++;
                    }
                    this.equals = i2;
                    this.length = 0;
                    if (i4 != 32) {
                        throw new ReaderException(this.getMin, i2 - 1, i4, "special characters are not allowed");
                    }
                } else {
                    this.IsOverlapping = true;
                }
            } catch (IOException e) {
                throw new YAMLException((Throwable) e);
            }
        }
        return this.length + i < this.equals;
    }
}
