package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
final class getPermissions$FastBitmap$CoordinateSystem extends Lambda implements Function0<Unit> {
    final /* synthetic */ List $phoneNumberToContact;
    final /* synthetic */ getPermissions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getPermissions$FastBitmap$CoordinateSystem(getPermissions getpermissions, List list) {
        super(0);
        this.this$0 = getpermissions;
        this.$phoneNumberToContact = list;
    }

    public final void invoke() {
        this.this$0.maskNicknameDisplayName(this.$phoneNumberToContact);
    }
}
