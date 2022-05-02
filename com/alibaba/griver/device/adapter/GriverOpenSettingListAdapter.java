package com.alibaba.griver.device.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.model.OpenSettingItem;
import java.util.List;

public class GriverOpenSettingListAdapter extends RecyclerView.Adapter<OpenSettingViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private Context f10420a;
    /* access modifiers changed from: private */
    public List<OpenSettingItem> b;
    /* access modifiers changed from: private */
    public OnSettingChangeListener c;

    public interface OnSettingChangeListener {
        void onChange(int i, boolean z);
    }

    public GriverOpenSettingListAdapter(Context context, List<OpenSettingItem> list) {
        this.f10420a = context;
        this.b = list;
    }

    public OpenSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OpenSettingViewHolder(LayoutInflater.from(this.f10420a).inflate(R.layout.griver_device_item_open_setting, viewGroup, false));
    }

    public void onBindViewHolder(OpenSettingViewHolder openSettingViewHolder, int i) {
        openSettingViewHolder.bindData(i);
    }

    public int getItemCount() {
        return this.b.size();
    }

    public void setOnSettingChangeListener(OnSettingChangeListener onSettingChangeListener) {
        this.c = onSettingChangeListener;
    }

    class OpenSettingViewHolder extends RecyclerView.valueOf {

        /* renamed from: a  reason: collision with root package name */
        private TextView f10421a;
        private Switch b;

        public OpenSettingViewHolder(View view) {
            super(view);
            this.f10421a = (TextView) view.findViewById(R.id.tv_griver_setting_title);
            this.b = (Switch) view.findViewById(R.id.switch_griver_setting);
        }

        public void bindData(final int i) {
            final OpenSettingItem openSettingItem = (OpenSettingItem) GriverOpenSettingListAdapter.this.b.get(i);
            this.f10421a.setText(openSettingItem.displayName);
            this.b.setChecked(openSettingItem.enabled);
            this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    openSettingItem.enabled = z;
                    if (GriverOpenSettingListAdapter.this.c != null) {
                        GriverOpenSettingListAdapter.this.c.onChange(i, z);
                    }
                }
            });
        }
    }
}
