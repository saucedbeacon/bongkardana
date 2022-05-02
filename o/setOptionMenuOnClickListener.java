package o;

import io.michaelrocks.libphonenumber.android.Phonenumber;
import java.util.Arrays;

public final class setOptionMenuOnClickListener {
    private final Phonenumber.PhoneNumber number;
    private final String rawString;
    private final int start;

    public setOptionMenuOnClickListener(int i, String str, Phonenumber.PhoneNumber phoneNumber) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str == null || phoneNumber == null) {
            throw null;
        } else {
            this.start = i;
            this.rawString = str;
            this.number = phoneNumber;
        }
    }

    public final Phonenumber.PhoneNumber number() {
        return this.number;
    }

    public final int start() {
        return this.start;
    }

    public final int end() {
        return this.start + this.rawString.length();
    }

    public final String rawString() {
        return this.rawString;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.start), this.rawString, this.number});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOptionMenuOnClickListener)) {
            return false;
        }
        setOptionMenuOnClickListener setoptionmenuonclicklistener = (setOptionMenuOnClickListener) obj;
        return this.rawString.equals(setoptionmenuonclicklistener.rawString) && this.start == setoptionmenuonclicklistener.start && this.number.equals(setoptionmenuonclicklistener.number);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberMatch [");
        sb.append(start());
        sb.append(",");
        sb.append(end());
        sb.append(") ");
        sb.append(this.rawString);
        return sb.toString();
    }
}
