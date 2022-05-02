package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

public class isItemRemoved {
    public static final int BACKWARD = -1;
    public static final int FORWARD = 1;
    public static final int REPLACE = 0;
    onItemsUpdated backstack;
    int direction;
    List<Object> newState;
    List<Object> previousState;

    isItemRemoved(onItemsUpdated onitemsupdated, List<Object> list, List<Object> list2, int i) {
        this.backstack = onitemsupdated;
        this.previousState = list;
        this.newState = list2;
        this.direction = i;
    }

    @NonNull
    public onItemsUpdated backstack() {
        return this.backstack;
    }

    private <T> performAccessibilityActionForItem<T> createParametricCopyList(List<Object> list) {
        LinkedList linkedList = new LinkedList();
        for (Object add : list) {
            linkedList.add(add);
        }
        return performAccessibilityActionForItem.from(linkedList);
    }

    @NonNull
    public <T> performAccessibilityActionForItem<T> getPreviousState() {
        return createParametricCopyList(this.previousState);
    }

    @NonNull
    public <T> performAccessibilityActionForItem<T> getNewState() {
        return createParametricCopyList(this.newState);
    }

    public int getDirection() {
        return this.direction;
    }

    @Nullable
    public <T> T topPreviousState() {
        if (this.previousState.size() <= 0) {
            return null;
        }
        List<Object> list = this.previousState;
        return list.get(list.size() - 1);
    }

    @NonNull
    public <T> T topNewState() {
        List<Object> list = this.newState;
        return list.get(list.size() - 1);
    }

    @NonNull
    public Context createContext(@NonNull Context context, @NonNull Object obj) {
        return new getColumnCountForAccessibility(context, obj);
    }
}
