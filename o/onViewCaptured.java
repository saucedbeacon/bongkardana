package o;

@Deprecated
public abstract class onViewCaptured<T> {
    /* access modifiers changed from: protected */
    public abstract T length(onPerformActionForVirtualView<T> onperformactionforvirtualview);

    /* access modifiers changed from: protected */
    public boolean length(onPerformActionForVirtualView<T> onperformactionforvirtualview, onPerformActionForVirtualView<T> onperformactionforvirtualview2) {
        return !onperformactionforvirtualview.equals(onperformactionforvirtualview2);
    }

    public final boolean getMin(onPerformActionForVirtualView<T> onperformactionforvirtualview, onPerformActionForVirtualView<T> onperformactionforvirtualview2) {
        if (onperformactionforvirtualview == null) {
            return onperformactionforvirtualview2 != null;
        }
        if (onperformactionforvirtualview2 != null && onperformactionforvirtualview.getClass() == onperformactionforvirtualview2.getClass()) {
            return length(onperformactionforvirtualview, onperformactionforvirtualview2);
        }
        return true;
    }
}
