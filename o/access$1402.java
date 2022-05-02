package o;

import id.dana.R;

public class access$1402 {
    int getMax;
    public String length;
    public String setMax;

    public access$1402() {
        this.setMax = "";
        this.length = "";
        this.getMax = R.drawable.dana_logo_blue;
    }

    public access$1402(String str, String str2) {
        this.setMax = "";
        this.length = "";
        this.getMax = R.drawable.dana_logo_blue;
        this.setMax = str;
        this.length = str2;
    }

    public access$1402(String str, String str2, int i) {
        this(str, str2);
        this.getMax = i;
    }
}
