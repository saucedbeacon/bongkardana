package com.alibaba.griver.ui.titlebar;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.griver.ui.R;
import java.util.List;

public class NebulaPopMenuItemHolder {

    /* renamed from: a  reason: collision with root package name */
    private List<PopMenuItem> f10633a;

    public void setList(List<PopMenuItem> list) {
        this.f10633a = list;
    }

    public int getListCount() {
        return this.f10633a.size();
    }

    public View getItemView(int i, ViewGroup viewGroup) {
        String str;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.griver_ui_nav_menu_item, viewGroup, false);
        inflate.setTag(Integer.valueOf(i));
        PopMenuItem popMenuItem = this.f10633a.get(i);
        ((TextView) inflate.findViewById(R.id.h5_tv_title)).setText(popMenuItem.name);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.h5_iv_icon);
        if (popMenuItem.icon != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(popMenuItem.icon);
        } else {
            imageView.setVisibility(8);
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.h5_popmenu_dot);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.h5_popmenu_dot_bg);
        TextView textView = (TextView) inflate.findViewById(R.id.h5_popmenu_dot_num);
        String str2 = popMenuItem.redDotNum;
        if (TextUtils.isEmpty(str2)) {
            str2 = "-1";
        }
        if (!TextUtils.isEmpty(str2)) {
            int i2 = -1;
            try {
                i2 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
            }
            relativeLayout.setVisibility(i2 >= 0 ? 0 : 8);
            if (i2 == 0) {
                imageView2.setVisibility(0);
                textView.setVisibility(8);
            } else if (i2 > 0) {
                textView.setVisibility(0);
                imageView2.setVisibility(8);
                if (i2 > 99) {
                    str = "...";
                } else {
                    str = String.valueOf(i2);
                }
                textView.setText(str);
            }
        }
        return inflate;
    }
}
