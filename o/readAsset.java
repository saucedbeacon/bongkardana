package o;

import id.dana.data.content.mapper.ContentsMapper;

final class readAsset implements RedDotDrawable {
    private final ContentsMapper setMin;

    public readAsset(ContentsMapper contentsMapper) {
        this.setMin = contentsMapper;
    }

    public final Object apply(Object obj) {
        return this.setMin.apply(obj);
    }
}
