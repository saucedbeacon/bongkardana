package o;

import id.dana.base.KeyBaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0003J\r\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u0018\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001fJ\u0010\u0010%\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/base/OnActivityNavigationManager;", "Lid/dana/base/NavigationManager;", "keyBaseActivity", "Lid/dana/base/KeyBaseActivity;", "backstackDelegate", "Lcom/zhuinden/simplestack/BackstackDelegate;", "menuItemFacade", "Lid/dana/base/MenuItemFacade;", "(Lid/dana/base/KeyBaseActivity;Lcom/zhuinden/simplestack/BackstackDelegate;Lid/dana/base/MenuItemFacade;)V", "getKeyBaseActivity", "()Lid/dana/base/KeyBaseActivity;", "leftButtonListener", "Lid/dana/base/MenuItemButtonListener;", "getMenuItemFacade", "()Lid/dana/base/MenuItemFacade;", "rightButtonListener", "clearMenuLeftButtonIcon", "", "finish", "getActivity", "onClickMenuLeftButton", "()Lkotlin/Unit;", "onClickMenuRightButton", "setLeftButtonListener", "setMenuLeftButton", "icon", "", "leftButton", "", "setMenuLeftButtonEnabled", "isEnabled", "", "setMenuRightButton", "rightButton", "setMenuRightButtonEnabled", "setMenuRightProgressBar", "isProgress", "setRightButtonListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class ProvidedTypeConverter extends PrimaryKey {
    @NotNull
    public final KeyBaseActivity<?> getMax;
    @NotNull
    public final parentColumn length;
    public MultiInstanceInvalidationClient$1 setMax;
    public MultiInstanceInvalidationClient$1 setMin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProvidedTypeConverter(@NotNull KeyBaseActivity<?> keyBaseActivity, @NotNull getSelectionModeForAccessibility getselectionmodeforaccessibility, @NotNull parentColumn parentcolumn) {
        super(getselectionmodeforaccessibility);
        Intrinsics.checkNotNullParameter(keyBaseActivity, "keyBaseActivity");
        Intrinsics.checkNotNullParameter(getselectionmodeforaccessibility, "backstackDelegate");
        Intrinsics.checkNotNullParameter(parentcolumn, "menuItemFacade");
        this.getMax = keyBaseActivity;
        this.length = parentcolumn;
    }
}
