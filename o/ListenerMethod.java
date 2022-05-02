package o;

import o.ListenerClass;
import o.b;
import o.remover;

public final class ListenerMethod implements getAdapterPosition<ListenerClass.NONE> {
    private final b.C0007b<GriverShareMenuExtension> equals;
    private final b.C0007b<remover.setMax> getMax;
    private final b.C0007b<getToolbarMenus> getMin;
    private final b.C0007b<startShare> isInside;
    private final b.C0007b<BaseShareItem> length;
    private final b.C0007b<setToolbarMenus> setMax;
    private final b.C0007b<ShareParam> setMin;

    private ListenerMethod(b.C0007b<remover.setMax> bVar, b.C0007b<getToolbarMenus> bVar2, b.C0007b<BaseShareItem> bVar3, b.C0007b<ShareParam> bVar4, b.C0007b<setToolbarMenus> bVar5, b.C0007b<GriverShareMenuExtension> bVar6, b.C0007b<startShare> bVar7) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
        this.setMax = bVar5;
        this.equals = bVar6;
        this.isInside = bVar7;
    }

    public static ListenerMethod length(b.C0007b<remover.setMax> bVar, b.C0007b<getToolbarMenus> bVar2, b.C0007b<BaseShareItem> bVar3, b.C0007b<ShareParam> bVar4, b.C0007b<setToolbarMenus> bVar5, b.C0007b<GriverShareMenuExtension> bVar6, b.C0007b<startShare> bVar7) {
        return new ListenerMethod(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new ListenerClass.NONE(this.getMax.get(), this.getMin.get(), this.length.get(), this.setMin.get(), this.setMax.get(), this.equals.get(), this.isInside.get());
    }
}
