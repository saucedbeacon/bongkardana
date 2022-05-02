package com.alibaba.griver.ui.ant.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.badge.AUBadgeView;
import com.alibaba.griver.ui.ant.listview.AUMaxItemCornerListView;
import com.alibaba.griver.ui.ant.model.IconInfo;
import com.alibaba.griver.ui.ant.model.MessagePopItem;
import com.alibaba.griver.ui.ant.model.PopMenuItem;
import com.alibaba.griver.ui.ant.text.AUIconView;
import com.alibaba.griver.ui.ant.text.AUTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AUListDialog extends AUDialog implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private float f9105a;
    private float b;
    private Boolean c;
    private final Context d;
    private AUMaxItemCornerListView e;
    private TextView f;
    private ScrollView g;
    private AUTextView h;
    private View i;
    private View j;
    private View k;
    private View l;
    /* access modifiers changed from: private */
    public Button m;
    /* access modifiers changed from: private */
    public Button n;

    /* renamed from: o  reason: collision with root package name */
    private OnItemClickListener f9106o;
    private AdapterView.OnItemClickListener p;
    /* access modifiers changed from: private */
    public List<MessagePopItem> q;
    /* access modifiers changed from: private */
    public final LayoutInflater r;
    private String s;
    private String t;
    private ListAdapter u;
    private String v;
    private String w;
    /* access modifiers changed from: private */
    public View.OnClickListener x;
    /* access modifiers changed from: private */
    public View.OnClickListener y;

    @Deprecated
    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    public AUListDialog(Context context, ArrayList<String> arrayList) {
        super(context, R.style.griver_noTitleTransBgDialogStyle);
        this.c = null;
        this.q = new ArrayList();
        this.s = "";
        this.t = "";
        this.d = context;
        this.r = LayoutInflater.from(context);
        if (arrayList != null) {
            this.q.clear();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.q.add(new MessagePopItem(it.next()));
            }
        }
    }

    public AUListDialog(Context context, List<MessagePopItem> list) {
        this(context, "", "", list);
    }

    public AUListDialog(Context context, String str, String str2, List<MessagePopItem> list) {
        this(context, str, str2, list, "", (View.OnClickListener) null, "", (View.OnClickListener) null);
    }

    public AUListDialog(Context context, String str, String str2, List<MessagePopItem> list, String str3, View.OnClickListener onClickListener, String str4, View.OnClickListener onClickListener2) {
        super(context, R.style.griver_noTitleTransBgDialogStyle);
        this.c = null;
        this.q = new ArrayList();
        this.s = "";
        this.t = "";
        this.s = str;
        this.t = str2;
        this.d = context;
        this.r = LayoutInflater.from(context);
        this.v = str3;
        this.x = onClickListener;
        this.w = str4;
        this.y = onClickListener2;
        if (list != null && list.size() != 0) {
            this.q.clear();
            this.q.addAll(list);
        }
    }

    @Deprecated
    public AUListDialog(ArrayList<PopMenuItem> arrayList, Context context) {
        this((String) null, arrayList, context);
    }

    @Deprecated
    public AUListDialog(String str, ArrayList<PopMenuItem> arrayList, Context context) {
        this(str, (String) null, arrayList, context);
    }

    @Deprecated
    public AUListDialog(String str, String str2, ArrayList<PopMenuItem> arrayList, Context context) {
        this(str, str2, arrayList, false, (String) null, (View.OnClickListener) null, (String) null, (View.OnClickListener) null, context);
    }

    @Deprecated
    public AUListDialog(String str, ArrayList<PopMenuItem> arrayList, boolean z, String str2, View.OnClickListener onClickListener, String str3, View.OnClickListener onClickListener2, Context context) {
        this(str, (String) null, arrayList, z, str2, onClickListener, str3, onClickListener2, context);
    }

    @Deprecated
    public AUListDialog(String str, String str2, ArrayList<PopMenuItem> arrayList, boolean z, String str3, View.OnClickListener onClickListener, String str4, View.OnClickListener onClickListener2, Context context) {
        super(context, R.style.griver_noTitleTransBgDialogStyle);
        this.c = null;
        this.q = new ArrayList();
        this.s = "";
        this.t = "";
        this.s = str;
        this.t = str2;
        this.d = context;
        this.r = LayoutInflater.from(context);
        this.v = str3;
        this.x = onClickListener;
        this.w = str4;
        this.y = onClickListener2;
        this.q = a(arrayList);
    }

    private List<MessagePopItem> a(List<PopMenuItem> list) {
        if (list == null || list.size() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PopMenuItem next : list) {
            if (next != null) {
                MessagePopItem messagePopItem = new MessagePopItem();
                messagePopItem.title = (String) next.getName();
                if (next.getResId() != 0) {
                    messagePopItem.icon = new IconInfo(next.getResId());
                } else {
                    messagePopItem.icon = new IconInfo(next.getDrawable());
                }
                messagePopItem.externParam = next.getExternParam();
                arrayList.add(messagePopItem);
            }
        }
        return arrayList;
    }

    @Deprecated
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.f9106o = onItemClickListener;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.p = onItemClickListener;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = this.r.inflate(R.layout.griver_ui_list_dialog, (ViewGroup) null);
        AUMaxItemCornerListView aUMaxItemCornerListView = (AUMaxItemCornerListView) inflate.findViewById(R.id.dialog_listView);
        this.e = aUMaxItemCornerListView;
        float f2 = this.b;
        if (f2 > 0.0f) {
            aUMaxItemCornerListView.setSingleItemHeight(f2);
        }
        float f3 = this.f9105a;
        if (f3 > 0.0f) {
            this.e.setMaxItems(f3);
        }
        Boolean bool = this.c;
        if (bool != null) {
            this.e.setScrollbarFadingEnabled(bool.booleanValue());
        }
        this.e.setDivider(new ColorDrawable(this.d.getResources().getColor(R.color.griver_AU_COLOR_DIALOG_DIVIDER_COLOR)));
        this.e.setDividerHeight(this.d.getResources().getDimensionPixelSize(R.dimen.griver_AU_DIVIDER_SPACE1));
        this.e.setHeaderDividersEnabled(false);
        this.e.setFooterDividersEnabled(false);
        this.e.setBackgroundResource(R.drawable.griver_ui_dialog_bg);
        View findViewById = inflate.findViewById(R.id.title_container);
        this.i = findViewById;
        this.f = (TextView) findViewById.findViewById(R.id.title);
        this.g = (ScrollView) this.i.findViewById(R.id.message_content);
        AUTextView aUTextView = (AUTextView) this.i.findViewById(R.id.message);
        this.h = aUTextView;
        aUTextView.setMinLines(0);
        this.l = inflate.findViewById(R.id.head_divider);
        View findViewById2 = inflate.findViewById(R.id.bottom_container);
        this.j = findViewById2;
        this.n = (Button) findViewById2.findViewById(R.id.ensure);
        this.m = (Button) this.j.findViewById(R.id.cancel);
        this.k = inflate.findViewById(R.id.bottom_divider);
        setContentView(inflate);
        a();
    }

    private void a() {
        ListAdapter listAdapter = new ListAdapter();
        this.u = listAdapter;
        this.e.setAdapter(listAdapter);
        this.e.setOnItemClickListener(this);
        if (!TextUtils.isEmpty(this.w) || !TextUtils.isEmpty(this.v)) {
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            this.e.updateFootState(true);
        } else {
            this.j.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.w)) {
            this.m.setText(this.w);
            this.m.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AUListDialog.this.cancel();
                    if (AUListDialog.this.y != null) {
                        AUListDialog.this.y.onClick(AUListDialog.this.m);
                    }
                }
            });
        } else {
            this.m.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.n.setText(this.v);
            this.n.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AUListDialog.this.dismiss();
                    if (AUListDialog.this.x != null) {
                        AUListDialog.this.x.onClick(AUListDialog.this.n);
                    }
                }
            });
        } else {
            this.n.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.t) || !TextUtils.isEmpty(this.s)) {
            this.i.setVisibility(0);
            this.l.setVisibility(0);
            this.e.updateHeadState(true);
        } else {
            this.i.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.s)) {
            this.f.setText(this.s);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
            ((LinearLayout.LayoutParams) this.g.getLayoutParams()).topMargin = 0;
        }
        if (!TextUtils.isEmpty(this.t)) {
            this.h.setText(this.t);
            this.h.setVisibility(0);
            return;
        }
        this.h.setVisibility(8);
    }

    public void show() {
        super.show();
        if (isShowing()) {
            setWindowMaxWidth(this.d.getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE10));
        }
    }

    @Deprecated
    public void updateData(ArrayList<PopMenuItem> arrayList) {
        if (this.u != null) {
            this.q.clear();
            this.q.addAll(a(arrayList));
            this.u.notifyDataSetChanged();
        }
    }

    final class ListAdapter extends BaseAdapter {
        public final long getItemId(int i) {
            return (long) i;
        }

        private ListAdapter() {
        }

        public final int getCount() {
            return AUListDialog.this.q.size();
        }

        public final MessagePopItem getItem(int i) {
            return (MessagePopItem) AUListDialog.this.q.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-85542283, oncanceled);
                onCancelLoad.getMin(-85542283, oncanceled);
            }
            if (view == null) {
                AUListDialog aUListDialog = AUListDialog.this;
                view = new ListDialogItem(aUListDialog.getContext());
            }
            ((ListDialogItem) view).setPopItem(getItem(i));
            return view;
        }
    }

    class ListDialogItem extends BaseMessagePopItemView {
        public ListDialogItem(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void initView(Context context) {
            AUListDialog.this.r.inflate(R.layout.griver_ui_list_item_dialog, this, true);
            this.mIconView = (AUIconView) findViewById(R.id.item_icon);
            this.mTitleView = (AUTextView) findViewById(R.id.item_name);
            this.mBadgeView = (AUBadgeView) findViewById(R.id.item_badge);
            setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE12));
            setGravity(19);
            setMakeTitleMax(true);
        }

        /* access modifiers changed from: protected */
        public int getHorizonPadding(Context context) {
            return getResources().getDimensionPixelOffset(R.dimen.griver_AU_SPACE6);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        OnItemClickListener onItemClickListener = this.f9106o;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(i2);
        }
        AdapterView.OnItemClickListener onItemClickListener2 = this.p;
        if (onItemClickListener2 != null) {
            onItemClickListener2.onItemClick(adapterView, view, i2, j2);
        }
        dismiss();
    }
}
