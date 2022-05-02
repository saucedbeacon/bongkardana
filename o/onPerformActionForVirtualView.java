package o;

@Deprecated
public abstract class onPerformActionForVirtualView<L> {
    private final onViewCaptured<L> length;

    protected onPerformActionForVirtualView(onViewCaptured<L> onviewcaptured) {
        this.length = onviewcaptured;
    }

    public static <T> T setMin(onPerformActionForVirtualView<T> onperformactionforvirtualview) {
        return onperformactionforvirtualview.length.length(onperformactionforvirtualview);
    }

    public static boolean setMax(onPerformActionForVirtualView onperformactionforvirtualview, onPerformActionForVirtualView onperformactionforvirtualview2) {
        if (onperformactionforvirtualview != null) {
            return onperformactionforvirtualview.length.getMin(onperformactionforvirtualview, onperformactionforvirtualview2);
        }
        return onperformactionforvirtualview2 != null;
    }
}
