package o;

import java.util.List;

public final class AutoCallback {
    private String categoryId;
    private boolean hasMore;
    private List<DefaultImpl> listOfPromo;

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1404490010, oncanceled);
            onCancelLoad.getMin(1404490010, oncanceled);
        }
        this.categoryId = str;
    }

    public final List<DefaultImpl> getListOfPromo() {
        return this.listOfPromo;
    }

    public final void setListOfPromo(List<DefaultImpl> list) {
        this.listOfPromo = list;
    }

    public final boolean isHasMore() {
        return this.hasMore;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }
}
