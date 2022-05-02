package o;

import o.b;

public final class getCornerRadii implements getAdapterPosition<DialogLayout> {
    private final b.C0007b<getFrameMarginVertical$core> preferenceAccountEntityDataProvider;

    public getCornerRadii(b.C0007b<getFrameMarginVertical$core> bVar) {
        this.preferenceAccountEntityDataProvider = bVar;
    }

    public final DialogLayout get() {
        return newInstance(this.preferenceAccountEntityDataProvider.get());
    }

    public static getCornerRadii create(b.C0007b<getFrameMarginVertical$core> bVar) {
        return new getCornerRadii(bVar);
    }

    public static DialogLayout newInstance(getFrameMarginVertical$core getframemarginvertical_core) {
        return new DialogLayout(getframemarginvertical_core);
    }
}
