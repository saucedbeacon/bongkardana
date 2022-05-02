package o;

import o.AppNode;

final class onAppStart implements RedDotDrawable {
    public static final onAppStart length = new onAppStart();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((AppNode.AnonymousClass7) obj).isEnable());
    }
}
