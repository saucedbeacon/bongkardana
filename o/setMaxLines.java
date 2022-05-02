package o;

import id.dana.social.di.module.RelationshipBottomSheetModule;
import o.b;
import o.getTitleText;

public final class setMaxLines implements getAdapterPosition<getTitleText.getMin> {
    private final RelationshipBottomSheetModule getMax;
    private final b.C0007b<markChildrenDirty> length;

    public static getTitleText.getMin setMin(RelationshipBottomSheetModule relationshipBottomSheetModule, markChildrenDirty markchildrendirty) {
        getTitleText.getMin length2 = relationshipBottomSheetModule.length(markchildrendirty);
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getTitleText.getMin length2 = this.getMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
