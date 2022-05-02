package id.dana.myprofile;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import o.WindowBridgeExtension;
import o.updateActionSheetContent;

public class EasterEggActivity extends BaseActivity {
    public static final String EGG_MESSAGE = "egg_message";
    public static final String INFO_COPY = "info_copy";
    @BindView(2131361875)
    TextView contentDisplay;

    public int getLayout() {
        return R.layout.activity_easter_egg;
    }

    public void configToolbar() {
        setToolbarImage(R.drawable.logo_dana_white);
    }

    public void init() {
        try {
            this.contentDisplay.setText(getIntent().getStringExtra("egg_message"));
            String str = "";
            if (setMax()) {
                str = getIntent().getStringExtra(INFO_COPY);
            } else {
                ConfigCenter instance = ConfigCenter.getInstance();
                String md5 = MiscUtils.md5(instance.isInitialized() ? instance.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax()) : str);
                if (md5.length() >= 16) {
                    str = md5.substring(0, 16).toUpperCase();
                }
            }
            setMax("reference", str, 0);
        } catch (Exception unused) {
        }
    }

    @OnClick({2131361872})
    public void onConfirmButtonClick() {
        finish();
    }

    private boolean setMax() {
        return getIntent() != null && getIntent().hasExtra(INFO_COPY) && !TextUtils.isEmpty(getIntent().getStringExtra(INFO_COPY));
    }

    @OnClick({2131361875})
    public void onTextLongClick() {
        setMax("dana_app_info", this.contentDisplay.getText().toString(), R.string.easter_egg_copyclipboard);
    }

    private void setMax(String str, String str2, int i) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
                if (i != 0) {
                    Toast.makeText(this, i, 0).show();
                }
            }
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.UTDID_UTIL_TAG, DanaLogConstants.Prefix.COPY_CLIPBOARD, e);
        }
    }

    @OnClick({2131361873})
    public void onCopyButtonClick() {
        String str = "";
        if (setMax()) {
            str = getIntent().getStringExtra(INFO_COPY);
        } else {
            ConfigCenter instance = ConfigCenter.getInstance();
            String md5 = MiscUtils.md5(instance.isInitialized() ? instance.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax()) : str);
            if (md5.length() >= 16) {
                str = md5.substring(0, 16).toUpperCase();
            }
        }
        setMax("reference", str, R.string.easter_egg_reference_copy);
    }
}
