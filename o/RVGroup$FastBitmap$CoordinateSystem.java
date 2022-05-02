package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/SocialFeed;", "socialFeed", "invoke"}, k = 3, mv = {1, 4, 2})
final class RVGroup$FastBitmap$CoordinateSystem extends Lambda implements Function1<getScanCallbackIntent, getScanCallbackIntent> {
    final /* synthetic */ RVGroup this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RVGroup$FastBitmap$CoordinateSystem(RVGroup rVGroup) {
        super(1);
        this.this$0 = rVGroup;
    }

    @NotNull
    public final getScanCallbackIntent invoke(@NotNull getScanCallbackIntent getscancallbackintent) {
        Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
        this.this$0.contactDeviceNameMapper.mapPhoneNumberToDeviceContactName(getscancallbackintent);
        return getscancallbackintent;
    }
}
