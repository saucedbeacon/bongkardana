package o;

final class queryTabBarInfo implements RedDotDrawable {
    private final unRegiseterFontSizeChangeListener setMax;

    public queryTabBarInfo(unRegiseterFontSizeChangeListener unregiseterfontsizechangelistener) {
        this.setMax = unregiseterfontsizechangelistener;
    }

    public final Object apply(Object obj) {
        return this.setMax.transform((attachPage) obj);
    }
}
