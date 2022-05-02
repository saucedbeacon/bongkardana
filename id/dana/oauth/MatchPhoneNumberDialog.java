package id.dana.oauth;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import id.dana.R;
import id.dana.richview.LogoProgressView;
import o.IMultiInstanceInvalidationService;

public class MatchPhoneNumberDialog extends IMultiInstanceInvalidationService<getMin> {
    @BindView(2131362054)
    Button btnCancel;
    @BindView(2131362094)
    public Button btnLogin;
    @BindView(2131363967)
    public LogoProgressView lpvLoading;

    public /* synthetic */ MatchPhoneNumberDialog(Context context, DialogInterface.OnDismissListener onDismissListener, getMin getmin, byte b) {
        this(context, onDismissListener, getmin);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        getMin getmin = (getMin) obj;
        this.btnCancel.setOnClickListener(getmin.getMin);
        this.btnLogin.setOnClickListener(getmin.setMin);
    }

    private MatchPhoneNumberDialog(Context context, DialogInterface.OnDismissListener onDismissListener, getMin getmin) {
        super(context, onDismissListener, Integer.valueOf(R.layout.dialog_dana_id_different), getmin);
    }

    public static class getMin extends IMultiInstanceInvalidationService.setMin {
        public final Context getMax;
        public View.OnClickListener getMin;
        public final DialogInterface.OnDismissListener setMax;
        public View.OnClickListener setMin;

        public getMin(Context context, DialogInterface.OnDismissListener onDismissListener) {
            this.getMax = context;
            length(true);
            setMin(true);
            this.setMax = onDismissListener;
        }
    }
}
