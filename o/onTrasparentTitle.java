package o;

final class onTrasparentTitle implements RedDotDrawable {
    private final FontSizeSetting length;

    public onTrasparentTitle(FontSizeSetting fontSizeSetting) {
        this.length = fontSizeSetting;
    }

    public final Object apply(Object obj) {
        return this.length.map((ErrorView) obj);
    }
}
