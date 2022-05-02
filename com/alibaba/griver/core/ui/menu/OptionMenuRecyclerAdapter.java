package com.alibaba.griver.core.ui.menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.core.R;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import com.alibaba.griver.ui.reddot.OnStateChangeListener;
import com.alibaba.griver.ui.reddot.RedDotDrawable;
import com.alibaba.griver.ui.reddot.RedDotManager;
import java.util.List;

public class OptionMenuRecyclerAdapter extends RecyclerView.Adapter<OptionMenuViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f10369a;
    /* access modifiers changed from: private */
    public List<GriverMenuItem> b;
    /* access modifiers changed from: private */
    public OnItemClickListener c;
    private String d;

    public OptionMenuRecyclerAdapter(Context context, String str, List<GriverMenuItem> list) {
        this.f10369a = context;
        this.b = list;
        this.d = str;
    }

    @NonNull
    public OptionMenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new OptionMenuViewHolder(LayoutInflater.from(this.f10369a).inflate(R.layout.griver_core_item_option_menu, viewGroup, false), this.d);
    }

    public void onBindViewHolder(@NonNull OptionMenuViewHolder optionMenuViewHolder, int i) {
        optionMenuViewHolder.a(i);
    }

    public int getItemCount() {
        return this.b.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }

    class OptionMenuViewHolder extends RecyclerView.valueOf {

        /* renamed from: a  reason: collision with root package name */
        private TextView f10370a;
        /* access modifiers changed from: private */
        public ImageView b;
        private LinearLayout c;
        private String d;

        public OptionMenuViewHolder(View view, @NonNull String str) {
            super(view);
            this.f10370a = (TextView) view.findViewById(R.id.tv_title);
            this.b = (ImageView) view.findViewById(R.id.iv_icon);
            this.c = (LinearLayout) view.findViewById(R.id.content_layout);
            RedDotDrawable.wrap(this.b, view.getContext().getResources().getDimensionPixelOffset(R.dimen.griver_AU_REDDOTSIZE5), view.getContext().getResources().getDimensionPixelOffset(R.dimen.griver_AU_REDDOT_DX), view.getContext().getResources().getDimensionPixelOffset(R.dimen.griver_AU_REDDOT_DY), -65536);
            this.d = str;
        }

        /* access modifiers changed from: private */
        public void a(final int i) {
            GriverMenuItem griverMenuItem = (GriverMenuItem) OptionMenuRecyclerAdapter.this.b.get(i);
            this.f10370a.setText(griverMenuItem.name);
            if (griverMenuItem.iconDrawable != 0) {
                this.b.setImageDrawable(OptionMenuRecyclerAdapter.this.f10369a.getResources().getDrawable(griverMenuItem.iconDrawable));
            } else {
                ImageUtils.loadImage(griverMenuItem.iconUrl, new ImageListener() {
                    public void onImage(Bitmap bitmap) {
                        OptionMenuViewHolder.this.b.setImageBitmap(bitmap);
                    }
                });
            }
            this.c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (OptionMenuRecyclerAdapter.this.c != null) {
                        OptionMenuRecyclerAdapter.this.c.onClick(view, i);
                    }
                }
            });
            if (griverMenuItem instanceof GRVMPMoreMenuItem) {
                GRVMPMoreMenuItem gRVMPMoreMenuItem = (GRVMPMoreMenuItem) griverMenuItem;
                if (gRVMPMoreMenuItem.isShowBadge()) {
                    RedDotManager.getInstance().setStateDidChangeHandler(gRVMPMoreMenuItem.uniqueKey, new OnStateChangeListener() {
                        public void onStateChange(String str, boolean z) {
                            if (OptionMenuViewHolder.this.b != null) {
                                RedDotDrawable.showRedPoint(OptionMenuViewHolder.this.b, z);
                            }
                        }
                    });
                    RedDotDrawable.showRedPoint(this.b, gRVMPMoreMenuItem.showBadge);
                }
            }
        }
    }
}
