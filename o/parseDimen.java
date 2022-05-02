package o;

import android.content.Context;
import id.dana.toggle.locationpermission.LocationPermissionObserver;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import o.ShareRecyclerAdapter;
import o.b;

public final class parseDimen implements getAdapterPosition<EmojiImageSpan> {
    private final b.C0007b<sendData> equals;
    private final b.C0007b<onEmbedViewParamChanged> getMax;
    private final b.C0007b<UpdateAppCallback> getMin;
    private final b.C0007b<LoginLogoutObserver> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<LocationPermissionObserver> setMin;
    private final b.C0007b<getOpenAuthStatus> toFloatRange;
    private final b.C0007b<ShareRecyclerAdapter.ShareViewHolder> toIntRange;

    private parseDimen(b.C0007b<Context> bVar, b.C0007b<LocationPermissionObserver> bVar2, b.C0007b<LoginLogoutObserver> bVar3, b.C0007b<UpdateAppCallback> bVar4, b.C0007b<onEmbedViewParamChanged> bVar5, b.C0007b<getOpenAuthStatus> bVar6, b.C0007b<sendData> bVar7, b.C0007b<ShareRecyclerAdapter.ShareViewHolder> bVar8) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
        this.getMin = bVar4;
        this.getMax = bVar5;
        this.toFloatRange = bVar6;
        this.equals = bVar7;
        this.toIntRange = bVar8;
    }

    public static parseDimen length(b.C0007b<Context> bVar, b.C0007b<LocationPermissionObserver> bVar2, b.C0007b<LoginLogoutObserver> bVar3, b.C0007b<UpdateAppCallback> bVar4, b.C0007b<onEmbedViewParamChanged> bVar5, b.C0007b<getOpenAuthStatus> bVar6, b.C0007b<sendData> bVar7, b.C0007b<ShareRecyclerAdapter.ShareViewHolder> bVar8) {
        return new parseDimen(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public final /* synthetic */ Object get() {
        return new EmojiImageSpan(this.setMax.get(), this.setMin.get(), this.length.get(), this.getMin.get(), this.getMax.get(), this.toFloatRange.get(), this.equals.get(), this.toIntRange.get());
    }
}
