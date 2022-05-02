package com.alibaba.griver.device.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.device.R;
import java.util.List;

public class SimpleListAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private Context f10422a;
    /* access modifiers changed from: private */
    public List<String> b;
    /* access modifiers changed from: private */
    public OnItemClickListener c;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    public SimpleListAdapter(Context context, List<String> list) {
        this.f10422a = context;
        this.b = list;
    }

    public SimpleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SimpleViewHolder(LayoutInflater.from(this.f10422a).inflate(R.layout.griver_device_item_simple_text, viewGroup, false));
    }

    public void onBindViewHolder(SimpleViewHolder simpleViewHolder, int i) {
        simpleViewHolder.a(i);
    }

    public int getItemCount() {
        return this.b.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }

    class SimpleViewHolder extends RecyclerView.valueOf {

        /* renamed from: a  reason: collision with root package name */
        private TextView f10423a;

        public SimpleViewHolder(View view) {
            super(view);
            this.f10423a = (TextView) view.findViewById(R.id.tv_content);
        }

        /* access modifiers changed from: private */
        public void a(final int i) {
            this.f10423a.setText((CharSequence) SimpleListAdapter.this.b.get(i));
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (SimpleListAdapter.this.c != null) {
                        SimpleListAdapter.this.c.onItemClick(i);
                    }
                }
            });
        }
    }
}
