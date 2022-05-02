package o;

public final class setH5ShowOptionMenuFlag {
    public int getMax = 0;
    public String getMin = "";
    private boolean length = false;
    public String setMax = "";

    public final setH5ShowOptionMenuFlag getMax() {
        boolean equalsIgnoreCase;
        int length2 = this.getMin.length();
        int length3 = this.setMax.length();
        if (length2 >= length3) {
            do {
                int i = this.getMax;
                if (i + length3 >= length2) {
                    break;
                }
                equalsIgnoreCase = this.setMax.equalsIgnoreCase(this.getMin.substring(i, i + length3));
                this.length = equalsIgnoreCase;
                this.getMax += equalsIgnoreCase ^ true ? 1 : 0;
            } while (!equalsIgnoreCase);
        }
        return this;
    }
}
