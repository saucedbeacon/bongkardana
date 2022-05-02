package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.dialog.DialogPermission;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import in.srain.cube.views.ptr.PtrFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.TinyBlurMenu;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lid/dana/utils/permission/PermissionHelper;", "", "()V", "redirectToSystemSettings", "", "context", "Landroid/content/Context;", "showLocationPermissionConsentDialog", "request", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "showPermissionRationaleDialog", "", "activity", "Landroid/app/Activity;", "permission", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TinyAppActionStateManager {
    @NotNull
    public static final TinyAppActionStateManager getMin = new TinyAppActionStateManager();

    public interface Holder {
        void onUIPositionChange(PtrFrameLayout ptrFrameLayout, boolean z, byte b, TinyBlurMenu.AnonymousClass1 r4);

        void onUIRefreshBegin(PtrFrameLayout ptrFrameLayout);

        void onUIRefreshComplete(PtrFrameLayout ptrFrameLayout);

        void onUIRefreshPrepare(PtrFrameLayout ptrFrameLayout);

        void onUIReset(PtrFrameLayout ptrFrameLayout);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<isBaselineAligned, Unit> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(Context context) {
            super(1);
            this.$context = context;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((isBaselineAligned) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull isBaselineAligned isbaselinealigned) {
            Intrinsics.checkNotNullParameter(isbaselinealigned, "it");
            StringBuilder sb = new StringBuilder("package:");
            sb.append(this.$context.getPackageName());
            Intent flags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString())).addCategory("android.intent.category.DEFAULT").setFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(flags, "Intent(Settings.ACTION_A…t.FLAG_ACTIVITY_NEW_TASK)");
            this.$context.startActivity(flags);
        }
    }

    private TinyAppActionStateManager() {
    }

    @JvmStatic
    public static final boolean getMax(@NotNull Activity activity, @NotNull String str) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(str, "permission");
        boolean z = !FontRes.getMax(activity, str) && IntRange.length((Context) activity, str) == -1;
        if (z) {
            setMax(activity);
        }
        return z;
    }

    @JvmStatic
    public static final void setMax(@NotNull Context context) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        isBaselineAligned.positiveButton$default(isBaselineAligned.negativeButton$default(isBaselineAligned.icon$default(isBaselineAligned.message$default(isBaselineAligned.title$default(new isBaselineAligned(context2, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.permission_title), (String) null, 2, (Object) null), Integer.valueOf(R.string.permission_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.drawable.dana_logo_blue), (Drawable) null, 2, (Object) null), (Integer) null, (CharSequence) null, (Function1) null, 7, (Object) null), Integer.valueOf(R.string.permission_setting), (CharSequence) null, new setMin(context2), 2, (Object) null).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements DialogInterface.OnDismissListener {
        final /* synthetic */ Ref.ObjectRef setMax;

        setMax(Ref.ObjectRef objectRef) {
            this.setMax = objectRef;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.setMax.element = null;
        }
    }

    @JvmStatic
    public static final void getMax(@NotNull Context context, @NotNull layoutChildLeft layoutchildleft) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(layoutchildleft, RequestPermissionsEvent.REQUEST);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        DialogPermission.setMin setmin = new DialogPermission.setMin(context, new setMax(objectRef));
        setmin.setMin = R.drawable.ic_request_location;
        setmin.length = context.getString(R.string.request_permission_title);
        setmin.getMax = context.getString(R.string.request_permission_desc);
        setmin.IsOverlapping = context.getString(R.string.allow_permission_services);
        setmin.FastBitmap$CoordinateSystem = new length(objectRef, layoutchildleft);
        objectRef.element = new DialogPermission(setmin.getMin, setmin.setMax, setmin, (byte) 0);
        DialogPermission dialogPermission = (DialogPermission) objectRef.element;
        if (dialogPermission != null) {
            dialogPermission.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/utils/permission/PermissionHelper$showLocationPermissionConsentDialog$2", "Lid/dana/dialog/DialogPermission$DialogListener;", "onDialogDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements DialogPermission.length {
        final /* synthetic */ layoutChildLeft getMax;
        final /* synthetic */ Ref.ObjectRef setMax;

        public final void onDialogDismissed() {
        }

        length(Ref.ObjectRef objectRef, layoutChildLeft layoutchildleft) {
            this.setMax = objectRef;
            this.getMax = layoutchildleft;
        }

        public final void onPositiveButtonClicked() {
            DialogPermission dialogPermission = (DialogPermission) this.setMax.element;
            if (dialogPermission != null) {
                dialogPermission.setMax();
            }
            this.getMax.length();
        }

        public final void onNegativeButtonClicked() {
            DialogPermission dialogPermission = (DialogPermission) this.setMax.element;
            if (dialogPermission != null) {
                dialogPermission.setMax();
            }
        }
    }
}
