package o;

import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import o.onQueueTitleChanged;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface getTag {
    boolean canShowOverflowMenu();

    void dismissPopups();

    boolean hideOverflowMenu();

    void initFeature(int i);

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    void setMenu(Menu menu, onQueueTitleChanged.setMax setmax);

    void setMenuPrepared();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean showOverflowMenu();
}
