package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SinglePicker<T> extends WheelPicker {
    private static final int ITEM_WIDTH_UNKNOWN = -99;
    private List<String> itemStrings;
    private int itemWidth;
    /* access modifiers changed from: private */
    public List<T> items;
    private String label;
    private OnItemPickListener<T> onItemPickListener;
    /* access modifiers changed from: private */
    public OnWheelListener<T> onWheelListener;
    /* access modifiers changed from: private */
    public int selectedItemIndex;
    private WheelView wheelView;

    public interface OnItemPickListener<T> {
        void onItemPicked(int i, T t);
    }

    public interface OnWheelListener<T> {
        void onWheeled(int i, T t);
    }

    public SinglePicker(Activity activity, T[] tArr) {
        this(activity, Arrays.asList(tArr));
    }

    public SinglePicker(Activity activity, List<T> list) {
        super(activity);
        this.items = new ArrayList();
        this.itemStrings = new ArrayList();
        this.selectedItemIndex = 0;
        this.label = "";
        this.itemWidth = -99;
        setItems(list);
    }

    public List<T> getItems() {
        return this.items;
    }

    public void addItem(T t) {
        this.items.add(t);
        this.itemStrings.add(formatToString(t));
    }

    public void removeItem(T t) {
        this.items.remove(t);
        this.itemStrings.remove(formatToString(t));
    }

    public void setItems(T[] tArr) {
        setItems(Arrays.asList(tArr));
    }

    public void setItems(List<T> list) {
        if (list != null && list.size() != 0) {
            this.items.clear();
            this.items.addAll(list);
            this.itemStrings.clear();
            for (T formatToString : list) {
                this.itemStrings.add(formatToString(formatToString));
            }
            WheelView wheelView2 = this.wheelView;
            if (wheelView2 != null) {
                wheelView2.setItems((List<?>) this.itemStrings, this.selectedItemIndex);
            }
        }
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setSelectedIndex(int i) {
        if (i >= 0 && i < this.items.size()) {
            this.selectedItemIndex = i;
        }
    }

    public void setSelectedItem(@NonNull T t) {
        setSelectedIndex(this.itemStrings.indexOf(formatToString(t)));
    }

    public void setItemWidth(int i) {
        WheelView wheelView2 = this.wheelView;
        if (wheelView2 != null) {
            ViewGroup.LayoutParams layoutParams = wheelView2.getLayoutParams();
            layoutParams.width = ConvertUtils.toPx(this.activity, (float) i);
            this.wheelView.setLayoutParams(layoutParams);
            return;
        }
        this.itemWidth = i;
    }

    public void setOnWheelListener(OnWheelListener<T> onWheelListener2) {
        this.onWheelListener = onWheelListener2;
    }

    public void setOnItemPickListener(OnItemPickListener<T> onItemPickListener2) {
        this.onItemPickListener = onItemPickListener2;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public View makeCenterView() {
        if (this.items.size() != 0) {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            WheelView createWheelView = createWheelView();
            this.wheelView = createWheelView;
            linearLayout.addView(createWheelView);
            if (TextUtils.isEmpty(this.label)) {
                this.wheelView.setLayoutParams(new LinearLayout.LayoutParams(this.screenWidthPixels, -2));
            } else {
                this.wheelView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                TextView createLabelView = createLabelView();
                createLabelView.setText(this.label);
                linearLayout.addView(createLabelView);
            }
            this.wheelView.setItems((List<?>) this.itemStrings, this.selectedItemIndex);
            this.wheelView.setOnItemSelectListener(new WheelView.OnItemSelectListener() {
                public void onSelected(int i) {
                    int unused = SinglePicker.this.selectedItemIndex = i;
                    if (SinglePicker.this.onWheelListener != null) {
                        SinglePicker.this.onWheelListener.onWheeled(SinglePicker.this.selectedItemIndex, SinglePicker.this.items.get(i));
                    }
                }
            });
            if (this.itemWidth != -99) {
                ViewGroup.LayoutParams layoutParams = this.wheelView.getLayoutParams();
                layoutParams.width = ConvertUtils.toPx(this.activity, (float) this.itemWidth);
                this.wheelView.setLayoutParams(layoutParams);
            }
            return linearLayout;
        }
        throw new IllegalArgumentException("Items can't be empty");
    }

    private String formatToString(T t) {
        if ((t instanceof Float) || (t instanceof Double)) {
            return new DecimalFormat("0.00").format(t);
        }
        return t.toString();
    }

    public void onSubmit() {
        OnItemPickListener<T> onItemPickListener2 = this.onItemPickListener;
        if (onItemPickListener2 != null) {
            onItemPickListener2.onItemPicked(this.selectedItemIndex, getSelectedItem());
        }
    }

    public T getSelectedItem() {
        return this.items.get(this.selectedItemIndex);
    }

    public int getSelectedIndex() {
        return this.selectedItemIndex;
    }

    public WheelView getWheelView() {
        return this.wheelView;
    }
}
