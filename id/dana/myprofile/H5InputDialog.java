package id.dana.myprofile;

import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;
import id.dana.danah5.DanaH5;
import o.RawQuery;
import o.isBaselineAligned;

class H5InputDialog {
    @BindView(2131362825)
    EditText etInputUrl;
    private isBaselineAligned getMin;
    private Unbinder setMin;
    @BindView(2131365134)
    TextView tvCancel;
    @BindView(2131365271)
    TextView tvGo;
    @BindView(2131365600)
    TextView tvTitle;

    /* access modifiers changed from: package-private */
    @OnClick({2131365271})
    public void onGoClick() {
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        sb.append(this.etInputUrl.getText().toString());
        DanaH5.startContainerFullUrl(sb.toString());
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131365134})
    public void onCancelClick() {
        if (this.getMin.isShowing()) {
            this.getMin.dismiss();
            RawQuery.getMax(this.setMin, RawQuery.length.getMin);
        }
    }
}
