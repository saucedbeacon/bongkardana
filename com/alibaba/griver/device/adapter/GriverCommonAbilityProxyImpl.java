package com.alibaba.griver.device.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.ui.dialog.GriverCreateDialogParam;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.adapter.SimpleListAdapter;
import com.alibaba.griver.device.jsapi.contact.AddPhoneContactView;
import com.alibaba.griver.device.proxy.RVCommonAbilityProxy;
import java.util.ArrayList;
import o.dispatchMenuItemSelected;

public class GriverCommonAbilityProxyImpl implements RVCommonAbilityProxy {
    public String getAppAlias() {
        return null;
    }

    public String getDevicePerformance() {
        return RVCommonAbilityProxy.HIGH;
    }

    public float getFontSizeSetting() {
        return 16.0f;
    }

    public String getLocalLanguage() {
        return null;
    }

    public boolean hasRootStatusPermission(String str) {
        return true;
    }

    public AddPhoneContactView getAddPhoneContactDialog() {
        return new AddPhoneContactView() {
            DialogInterface.OnCancelListener cancelListener;
            Dialog dialog;
            AdapterView.OnItemClickListener onItemClickListener;
            SimpleListAdapter simpleListAdapter;

            public void initView(Context context, ArrayList<String> arrayList) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.griver_device_dialog_simple_list, (ViewGroup) null);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_simple_list);
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                recyclerView.setItemAnimator(new dispatchMenuItemSelected());
                GriverCreateDialogParam griverCreateDialogParam = new GriverCreateDialogParam(context.getString(R.string.griver_add_contact), (String) null, (String) null, context.getString(R.string.griver_base_cancel), (String) null);
                griverCreateDialogParam.customView = inflate;
                griverCreateDialogParam.negativeListener = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        if (AnonymousClass1.this.cancelListener != null) {
                            AnonymousClass1.this.cancelListener.onCancel(dialogInterface);
                        }
                    }
                };
                this.dialog = ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).createDialog(GriverEnv.getTopActivity().get(), griverCreateDialogParam);
                SimpleListAdapter simpleListAdapter2 = new SimpleListAdapter(context, arrayList);
                this.simpleListAdapter = simpleListAdapter2;
                recyclerView.setAdapter(simpleListAdapter2);
                this.simpleListAdapter.setOnItemClickListener(new SimpleListAdapter.OnItemClickListener() {
                    public void onItemClick(int i) {
                        if (AnonymousClass1.this.onItemClickListener != null) {
                            AnonymousClass1.this.onItemClickListener.onItemClick((AdapterView) null, (View) null, i, 0);
                            AnonymousClass1.this.dialog.dismiss();
                        }
                    }
                });
            }

            public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
                this.cancelListener = onCancelListener;
            }

            public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener2) {
                this.onItemClickListener = onItemClickListener2;
            }

            public void show() {
                this.dialog.show();
            }
        };
    }
}
