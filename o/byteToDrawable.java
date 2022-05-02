package o;

import id.dana.data.content.mapper.ContentMapper;

final class byteToDrawable implements RedDotDrawable {
    private final ContentMapper length;

    public byteToDrawable(ContentMapper contentMapper) {
        this.length = contentMapper;
    }

    public final Object apply(Object obj) {
        return this.length.apply(obj);
    }
}
