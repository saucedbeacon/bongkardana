package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.RelationshipBottomSheetDialog;
import o.getTitleText;

public final class AmcsLiteManager implements getBindingAdapter<RelationshipBottomSheetDialog> {
    @InjectedFieldSignature("id.dana.social.RelationshipBottomSheetDialog.presenter")
    public static void setMin(RelationshipBottomSheetDialog relationshipBottomSheetDialog, getTitleText.getMin getmin) {
        relationshipBottomSheetDialog.presenter = getmin;
    }
}
