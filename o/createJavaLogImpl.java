package o;

final class createJavaLogImpl {
    final StringBuilder getMax;
    private int setMax;

    public createJavaLogImpl() {
        this.setMax = 0;
        this.getMax = new StringBuilder();
    }

    public createJavaLogImpl(String str) {
        this.setMax = 0;
        this.getMax = new StringBuilder(str);
    }

    public final void setMin(CharSequence charSequence) {
        if (this.setMax != 0) {
            this.getMax.append(10);
        }
        this.getMax.append(charSequence);
        this.setMax++;
    }
}
