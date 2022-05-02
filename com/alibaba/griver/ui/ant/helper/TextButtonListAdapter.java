package com.alibaba.griver.ui.ant.helper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import com.alibaba.griver.ui.ant.text.AUTextView;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class TextButtonListAdapter extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f10555a = new ArrayList();
    /* access modifiers changed from: private */
    public OnItemClickListener b;
    private Context c;
    private int d;
    private int e;

    public long getItemId(int i) {
        return 0;
    }

    public TextButtonListAdapter(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public void setData(Context context, List<String> list, OnItemClickListener onItemClickListener) {
        this.f10555a.clear();
        this.f10555a.addAll(list);
        this.b = onItemClickListener;
        this.c = context;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f10555a.size();
    }

    public String getItem(int i) {
        return this.f10555a.get(i);
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a();
        }
        view.setBackgroundResource(a(i));
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TextButtonListAdapter.this.b != null) {
                    TextButtonListAdapter.this.b.onClick(view, i);
                }
            }
        });
        ((AUTextView) view).setText(getItem(i));
        return view;
    }

    private int a(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1269554012, oncanceled);
            onCancelLoad.getMin(1269554012, oncanceled);
        }
        if (i == getCount() - 1) {
            return R.drawable.griver_ui_pop_list_corner_round_bottom;
        }
        return R.drawable.griver_ui_pop_list_corner_shape;
    }

    private AUTextView a() {
        AUTextView aUTextView = new AUTextView(this.c);
        aUTextView.setTextColor(this.e);
        aUTextView.setTextSize(0, (float) this.c.getResources().getDimensionPixelSize(R.dimen.griver_AU_TEXTSIZE4));
        aUTextView.setGravity(this.d | 16);
        if (this.d == 3) {
            aUTextView.setPadding(this.c.getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE6), 0, 0, 0);
        }
        aUTextView.setLayoutParams(new AbsListView.LayoutParams(-1, this.c.getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE12)));
        return aUTextView;
    }
}
