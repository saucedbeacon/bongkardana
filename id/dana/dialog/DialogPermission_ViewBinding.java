package id.dana.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DialogPermission_ViewBinding implements Unbinder {
    private DialogPermission getMax;

    @UiThread
    public DialogPermission_ViewBinding(DialogPermission dialogPermission, View view) {
        this.getMax = dialogPermission;
        dialogPermission.btnCheckPermission = (Button) drawDividersHorizontal.setMin(view, R.id.btn_check_permission, "field 'btnCheckPermission'", Button.class);
        dialogPermission.btnCheckPermissionHorizontal = (Button) drawDividersHorizontal.setMin(view, R.id.btn_check_permission_horizontal, "field 'btnCheckPermissionHorizontal'", Button.class);
        dialogPermission.btnNotNowHorizontal = (Button) drawDividersHorizontal.setMin(view, R.id.btn_not_now_horizontal, "field 'btnNotNowHorizontal'", Button.class);
        dialogPermission.ivPermission = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50102131363565, "field 'ivPermission'", ImageView.class);
        dialogPermission.tvAdditionalText = (TextView) drawDividersHorizontal.setMin(view, R.id.f64662131365091, "field 'tvAdditionalText'", TextView.class);
        dialogPermission.tvPermissionDesc = (TextView) drawDividersHorizontal.setMin(view, R.id.f68132131365440, "field 'tvPermissionDesc'", TextView.class);
        dialogPermission.tvPermissionTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68142131365441, "field 'tvPermissionTitle'", TextView.class);
        dialogPermission.btnNotNow = (Button) drawDividersHorizontal.setMin(view, R.id.btn_not_now, "field 'btnNotNow'", Button.class);
        dialogPermission.btnHorizontalGroup = (Group) drawDividersHorizontal.setMin(view, R.id.f36362131362086, "field 'btnHorizontalGroup'", Group.class);
        dialogPermission.btnVerticalGroup = (Group) drawDividersHorizontal.setMin(view, R.id.f37052131362157, "field 'btnVerticalGroup'", Group.class);
    }

    @CallSuper
    public final void setMax() {
        DialogPermission dialogPermission = this.getMax;
        if (dialogPermission != null) {
            this.getMax = null;
            dialogPermission.btnCheckPermission = null;
            dialogPermission.btnCheckPermissionHorizontal = null;
            dialogPermission.btnNotNowHorizontal = null;
            dialogPermission.ivPermission = null;
            dialogPermission.tvAdditionalText = null;
            dialogPermission.tvPermissionDesc = null;
            dialogPermission.tvPermissionTitle = null;
            dialogPermission.btnNotNow = null;
            dialogPermission.btnHorizontalGroup = null;
            dialogPermission.btnVerticalGroup = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
