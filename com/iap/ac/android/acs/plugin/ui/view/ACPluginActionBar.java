package com.iap.ac.android.acs.plugin.ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

public class ACPluginActionBar extends LinearLayout implements View.OnClickListener {
    private ActionBarListener mActionBarListener;
    private TextView mTitleText;

    public interface ActionBarListener {
        void onBack();
    }

    public ACPluginActionBar(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.acplugin_layout_action_bar, this, true);
        initView();
    }

    public ACPluginActionBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.acplugin_layout_action_bar, this, true);
        initView();
    }

    public ACPluginActionBar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.acplugin_layout_action_bar, this, true);
        initView();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.back_view) {
            ActionBarListener actionBarListener = this.mActionBarListener;
            if (actionBarListener != null) {
                actionBarListener.onBack();
            } else if (getContext() instanceof Activity) {
                ACLog.d(Constants.TAG, "ACPluginActionBar#onClick, back icon on click, finish activity");
                ((Activity) getContext()).finish();
            }
        }
    }

    public void setTitle(String str) {
        this.mTitleText.setText(str);
    }

    public void setActionBarListener(@NonNull ActionBarListener actionBarListener) {
        this.mActionBarListener = actionBarListener;
    }

    private void initView() {
        findViewById(R.id.back_view).setOnClickListener(this);
        this.mTitleText = (TextView) findViewById(R.id.title_text);
    }
}
