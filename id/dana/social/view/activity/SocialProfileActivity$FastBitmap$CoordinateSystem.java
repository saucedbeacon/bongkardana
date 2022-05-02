package id.dana.social.view.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.getMsgText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
final class SocialProfileActivity$FastBitmap$CoordinateSystem extends Lambda implements Function0<getMsgText> {
    final /* synthetic */ SocialProfileActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SocialProfileActivity$FastBitmap$CoordinateSystem(SocialProfileActivity socialProfileActivity) {
        super(0);
        this.this$0 = socialProfileActivity;
    }

    @NotNull
    public final getMsgText invoke() {
        return new getMsgText(new Function0<Unit>(this) {
            final /* synthetic */ SocialProfileActivity$FastBitmap$CoordinateSystem this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                String str = SocialProfileActivity.access$getRelationshipItemModel$p(this.this$0.this$0).getMax;
                int hashCode = str.hashCode();
                if (hashCode != 2378265) {
                    if (hashCode == 1925346054 && str.equals("ACTIVE")) {
                        SocialProfileActivity.access$muteFriend(this.this$0.this$0);
                    }
                } else if (str.equals("MUTE")) {
                    SocialProfileActivity.access$unMuteFriend(this.this$0.this$0);
                }
            }
        }, new Function0<Unit>(this) {
            final /* synthetic */ SocialProfileActivity$FastBitmap$CoordinateSystem this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                SocialProfileActivity.access$blockFriend(this.this$0.this$0);
            }
        });
    }
}
