package com.alibaba.griver.core.jsapi.actionsheet;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem;
import java.util.List;

public class ActionSheetRecyclerAdapter extends RecyclerView.Adapter<ActionSheetViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private Context f9069a;
    /* access modifiers changed from: private */
    public List<ActionSheetItem> b;
    /* access modifiers changed from: private */
    public OnItemClickListener c;

    interface OnItemClickListener {
        void onClick(int i);
    }

    public ActionSheetRecyclerAdapter(Context context, List<ActionSheetItem> list) {
        this.f9069a = context;
        this.b = list;
    }

    @NonNull
    public ActionSheetViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ActionSheetViewHolder(LayoutInflater.from(this.f9069a).inflate(R.layout.griver_core_layout_actionsheet_item, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull ActionSheetViewHolder actionSheetViewHolder, int i) {
        actionSheetViewHolder.a(i);
    }

    public int getItemCount() {
        return this.b.size();
    }

    class ActionSheetViewHolder extends RecyclerView.valueOf {

        /* renamed from: a  reason: collision with root package name */
        private TextView f10306a;
        private TextView b;
        private TextView c;

        public ActionSheetViewHolder(View view) {
            super(view);
            this.f10306a = (TextView) view.findViewById(R.id.tv_content);
            this.b = (TextView) view.findViewById(R.id.tv_badge);
            this.c = (TextView) view.findViewById(R.id.tv_badge_point);
        }

        /* access modifiers changed from: private */
        public void a(final int i) {
            ActionSheetItem actionSheetItem = (ActionSheetItem) ActionSheetRecyclerAdapter.this.b.get(i);
            this.f10306a.setText(actionSheetItem.content);
            ActionSheetItem.BadgeInfo badgeInfo = actionSheetItem.badgeInfo;
            if (badgeInfo != null) {
                if (TextUtils.equals(ActionSheetItem.BadgeInfo.TYPE_MORE, badgeInfo.type)) {
                    b();
                    this.b.setText("...");
                } else if (TextUtils.equals("none", badgeInfo.type)) {
                    c();
                } else if (TextUtils.equals(ActionSheetItem.BadgeInfo.TYPE_NUM, badgeInfo.type)) {
                    try {
                        int parseInt = Integer.parseInt(badgeInfo.text);
                        if (parseInt <= 0) {
                            c();
                        } else if (parseInt >= 100) {
                            b();
                            this.b.setText("...");
                        } else {
                            b();
                            this.b.setText(badgeInfo.text);
                        }
                    } catch (Exception e) {
                        GriverLogger.e("ActionSheetRecyclerAdapter", "wrong number text", e);
                    }
                } else if (TextUtils.equals("text", badgeInfo.type)) {
                    this.b.setText(badgeInfo.text);
                    b();
                } else if (TextUtils.equals(ActionSheetItem.BadgeInfo.TYPE_POINT, badgeInfo.type)) {
                    a();
                }
                this.itemView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        if (ActionSheetRecyclerAdapter.this.c != null) {
                            ActionSheetRecyclerAdapter.this.c.onClick(i);
                        }
                    }
                });
            }
            c();
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (ActionSheetRecyclerAdapter.this.c != null) {
                        ActionSheetRecyclerAdapter.this.c.onClick(i);
                    }
                }
            });
        }

        private void a() {
            this.c.setVisibility(0);
            this.b.setVisibility(8);
        }

        private void b() {
            this.c.setVisibility(8);
            this.b.setVisibility(0);
        }

        private void c() {
            this.c.setVisibility(8);
            this.b.setVisibility(8);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }
}
