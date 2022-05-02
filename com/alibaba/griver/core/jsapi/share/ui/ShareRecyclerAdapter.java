package com.alibaba.griver.core.jsapi.share.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.api.ui.share.BaseShareItem;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.core.R;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import java.util.List;

public class ShareRecyclerAdapter extends RecyclerView.Adapter<ShareViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f10309a;
    /* access modifiers changed from: private */
    public List<BaseShareItem> b;
    /* access modifiers changed from: private */
    public OnItemClickListener c;

    public ShareRecyclerAdapter(Context context, List<BaseShareItem> list) {
        this.f10309a = context;
        this.b = list;
    }

    @NonNull
    public ShareViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ShareViewHolder(LayoutInflater.from(this.f10309a).inflate(R.layout.griver_core_layout_share_item, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull ShareViewHolder shareViewHolder, int i) {
        shareViewHolder.a(i);
    }

    public int getItemCount() {
        return this.b.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }

    class ShareViewHolder extends RecyclerView.valueOf {

        /* renamed from: a  reason: collision with root package name */
        private TextView f10310a;
        /* access modifiers changed from: private */
        public ImageView b;

        public ShareViewHolder(View view) {
            super(view);
            this.f10310a = (TextView) view.findViewById(R.id.tv_title);
            this.b = (ImageView) view.findViewById(R.id.iv_channel);
        }

        /* access modifiers changed from: private */
        public void a(final int i) {
            BaseShareItem baseShareItem = (BaseShareItem) ShareRecyclerAdapter.this.b.get(i);
            this.f10310a.setText(baseShareItem.channelName);
            if (baseShareItem.iconDrawable != 0) {
                this.b.setImageDrawable(ShareRecyclerAdapter.this.f10309a.getResources().getDrawable(baseShareItem.iconDrawable));
            } else {
                ImageUtils.loadImage(baseShareItem.iconUrl, new ImageListener() {
                    public void onImage(Bitmap bitmap) {
                        ShareViewHolder.this.b.setImageBitmap(bitmap);
                    }
                });
            }
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (ShareRecyclerAdapter.this.c != null) {
                        ShareRecyclerAdapter.this.c.onClick(view, i);
                    }
                }
            });
        }
    }
}
