package o;

public final class DefaultEmbedViewProvider implements getAdapterPosition<BaseEmbedView> {

    static final class length {
        /* access modifiers changed from: private */
        public static final DefaultEmbedViewProvider setMax = new DefaultEmbedViewProvider();
    }

    public final BaseEmbedView get() {
        return newInstance();
    }

    public static DefaultEmbedViewProvider create() {
        return length.setMax;
    }

    public static BaseEmbedView newInstance() {
        return new BaseEmbedView();
    }
}
