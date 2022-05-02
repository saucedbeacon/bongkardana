package com.alibaba.griver.ui.ant;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.AntUI;
import com.alibaba.griver.ui.ant.helper.ItemCategory;
import com.alibaba.griver.ui.ant.layout.AURelativeLayout;
import com.alibaba.griver.ui.ant.layout.AUScrollLayout;
import com.alibaba.griver.ui.ant.layout.MenuItemLayout;
import com.alibaba.griver.ui.ant.text.AUIconView;
import com.alibaba.griver.ui.ant.theme.AUAbsTheme;
import com.alibaba.griver.ui.ant.theme.AUThemeKey;
import com.alibaba.griver.ui.ant.theme.AUThemeManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

public class AUSegment extends AURelativeLayout implements AntUI {
    public static final String TAG = "AUSegment";
    private int A;
    private int B;
    private AUScrollLayout C;
    private ImageView D;
    private float E;
    private HorizontalScrollView F;
    /* access modifiers changed from: private */
    public MenuItemLayout G;
    private List<ItemCategory> H = new ArrayList();
    private Map<Integer, View> I = new HashMap();
    private int J = 0;
    /* access modifiers changed from: private */
    public String K;

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f10531a = new Matrix();
    private int b = 100;
    private String[] c = new String[4];
    private TextView[] d = new TextView[4];
    private int e;
    private float f = 0.0f;
    private ColorStateList g = null;
    private GradientDrawable h;
    private int i = 0;
    private Scroller j;
    /* access modifiers changed from: private */
    public TabSwitchListener k;
    private View l;
    private String m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private int f10532o;
    private int p;
    private boolean q;
    private int[] r = new int[4];
    private int[] s = new int[4];
    private boolean t;
    public ImageView tabButtomLine;
    protected int tabCount = 3;
    protected RelativeLayout[] tabRl = new RelativeLayout[4];
    public LinearLayout tabsContainer;
    /* access modifiers changed from: private */
    public boolean u;
    private int v;
    private int w;
    private int[] x = new int[4];
    private AUIconView y;
    private boolean z;

    public interface TabSwitchListener {
        void onTabClick(int i, View view);
    }

    public void initContent(Context context, AttributeSet attributeSet, TypedArray typedArray) {
    }

    public void upDateTheme(Context context, AUAbsTheme aUAbsTheme) {
    }

    public AUSegment(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    public AUSegment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public AUSegment(Context context, int i2, int i3) {
        super(context);
        a(context, (AttributeSet) null, i2, i3);
    }

    public AUSegment(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a(context, attributeSet, 0, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        if (i2 <= 0) {
            this.v = getResources().getDimensionPixelSize(R.dimen.griver_au_segment_text_padding) * 2;
        } else {
            this.v = i2;
        }
        if (i3 <= 0) {
            this.B = this.v / 2;
        } else {
            this.B = i3;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griverSegment);
        init(context, attributeSet, obtainStyledAttributes);
        initContent(context, attributeSet, obtainStyledAttributes);
        initStyleByTheme(context);
        initAttrStyle(context, attributeSet, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        a(context);
    }

    public void init(Context context, AttributeSet attributeSet, TypedArray typedArray) {
        this.tabCount = typedArray.getInt(R.styleable.griverSegment_tabCount, 4);
        this.m = typedArray.getString(R.styleable.griverSegment_tabTextArray);
        int i2 = 0;
        this.n = typedArray.getBoolean(R.styleable.griverSegment_uniformlySpaced, false);
        this.t = typedArray.getBoolean(R.styleable.griverSegment_scroll, false);
        this.u = typedArray.getBoolean(R.styleable.griverSegment_repeatClick, false);
        this.z = typedArray.getBoolean(R.styleable.griverSegment_add, false);
        this.v = typedArray.getDimensionPixelOffset(R.styleable.griverSegment_tabSpace, this.v);
        this.B = typedArray.getDimensionPixelOffset(R.styleable.griverSegment_edgeSpace, this.B);
        if (!TextUtils.isEmpty(this.m)) {
            String[] split = this.m.split(",");
            this.c = split;
            this.tabCount = split.length;
            this.d = new TextView[split.length];
            this.tabRl = new RelativeLayout[split.length];
            this.r = new int[split.length];
            this.s = new int[split.length];
            this.x = new int[split.length];
        } else {
            this.c[0] = typedArray.getString(R.styleable.griverSegment_tab1Text);
            this.c[1] = typedArray.getString(R.styleable.griverSegment_tab2Text);
            this.c[2] = typedArray.getString(R.styleable.griverSegment_tab3Text);
            this.c[3] = typedArray.getString(R.styleable.griverSegment_tab4Text);
            if (this.tabCount > 4) {
                this.tabCount = 3;
            }
        }
        while (true) {
            String[] strArr = this.c;
            if (i2 < strArr.length) {
                if (strArr[i2] == null) {
                    strArr[i2] = "";
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void initStyleByTheme(Context context) {
        AUAbsTheme currentTheme = AUThemeManager.getCurrentTheme();
        if (currentTheme.containsKey(AUThemeKey.SEGMENT_TEXTCOLOR)) {
            this.g = currentTheme.getColorStateList(context, AUThemeKey.SEGMENT_TEXTCOLOR);
        }
        if (currentTheme.containsKey(AUThemeKey.SEGMENT_BOTTOM_COLOR)) {
            this.e = currentTheme.getColor(context, AUThemeKey.SEGMENT_BOTTOM_COLOR).intValue();
        }
    }

    public void initAttrStyle(Context context, AttributeSet attributeSet, TypedArray typedArray) {
        if (typedArray.getColor(R.styleable.griverSegment_buttomLineColor, 0) != 0) {
            this.e = typedArray.getColor(R.styleable.griverSegment_buttomLineColor, 0);
        }
    }

    private void a(Context context) {
        if (!this.t) {
            LayoutInflater.from(context).inflate(R.layout.griver_ui_switch_tab_layout, this, true);
            setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE10));
            this.j = new Scroller(context);
            this.tabsContainer = (LinearLayout) findViewById(R.id.tabs);
            this.tabButtomLine = (ImageView) findViewById(R.id.tabLine);
            this.y = (AUIconView) findViewById(R.id.addIcon);
            this.l = findViewById(R.id.bottomLine);
            this.p = getResources().getDisplayMetrics().widthPixels;
            a();
            getTabViews(context);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.griver_ui_category_bar_layout, this);
        AUScrollLayout aUScrollLayout = (AUScrollLayout) findViewById(R.id.scroll_layout);
        this.C = aUScrollLayout;
        aUScrollLayout.setPadding((this.B + 1) - (this.v / 2), aUScrollLayout.getPaddingTop(), (this.B + 1) - (this.v / 2), this.C.getPaddingBottom());
        this.F = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
        this.y = (AUIconView) findViewById(R.id.addIcon);
        ImageView imageView = (ImageView) findViewById(R.id.menu_bar);
        this.D = imageView;
        int i2 = this.e;
        if (i2 != 0) {
            imageView.setBackgroundColor(i2);
        }
        this.E = 0.0f;
        this.p = getResources().getDisplayMetrics().widthPixels;
        a();
    }

    private void a() {
        if (this.z) {
            this.y.setVisibility(0);
            this.A = this.p - getResources().getDimensionPixelSize(R.dimen.griver_au_segment_add_width);
            return;
        }
        this.y.setVisibility(8);
        this.A = this.p;
    }

    /* access modifiers changed from: protected */
    public void getTabViews(Context context) {
        LinearLayout.LayoutParams layoutParams;
        if (!this.t) {
            this.tabsContainer.removeAllViews();
            this.f10532o = 0;
            for (int i2 = 0; i2 < this.tabCount; i2++) {
                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.griver_ui_default_tab_view, (ViewGroup) null);
                this.tabRl[i2] = relativeLayout;
                TextView textView = (TextView) relativeLayout.findViewById(R.id.tab_tv);
                textView.setText(this.c[i2]);
                ColorStateList colorStateList = this.g;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                float f2 = this.f;
                if (f2 != 0.0f) {
                    textView.setTextSize(0, f2);
                }
                this.d[i2] = textView;
                TextPaint paint = textView.getPaint();
                a(i2, (Paint) paint);
                if (!this.n || this.f10532o <= 0 || paint == null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1, 1.0f);
                } else {
                    int measureText = (int) (paint.measureText(this.c[i2]) + ((float) this.f10532o));
                    layoutParams = new LinearLayout.LayoutParams(measureText, -1);
                    this.r[i2] = measureText;
                    this.s[i2] = (int) paint.measureText(this.c[i2]);
                }
                layoutParams.gravity = 17;
                this.tabsContainer.addView(relativeLayout, layoutParams);
            }
        }
    }

    private void a(int i2, Paint paint) {
        if (this.n && this.f10532o == 0 && this.p > 0 && paint != null) {
            String str = "";
            for (int i3 = 0; i3 < this.tabCount; i3++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.c[i3]);
                str = sb.toString();
            }
            int measureText = (int) ((((float) this.A) - paint.measureText(str)) / ((float) (this.tabCount + 1)));
            this.f10532o = measureText;
            this.w = measureText / 2;
        }
        if ((!this.n || this.f10532o <= 0 || paint == null) && paint != null) {
            this.s[i2] = (int) paint.measureText(this.c[i2]);
            int[] iArr = this.x;
            int i4 = this.A;
            int i5 = this.tabCount;
            int[] iArr2 = this.s;
            iArr[i2] = ((i4 / i5) - iArr2[i2]) / 2;
            if (!this.n && i4 / i5 < iArr2[i2]) {
                iArr[i2] = 0;
                iArr2[i2] = i4 / i5;
            }
            StringBuilder sb2 = new StringBuilder("paddingDis[");
            sb2.append(i2);
            sb2.append("] = ");
            sb2.append(this.x[i2]);
            GriverLogger.d(TAG, sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (!this.t) {
            int i6 = i4 - i2;
            int i7 = i6 / this.tabCount;
            if (i7 != this.b || this.h == null) {
                if (this.z) {
                    this.b = this.A / this.tabCount;
                } else {
                    this.b = i7;
                }
                b();
            }
            if (i6 != this.p || i6 != this.A) {
                if (this.z) {
                    this.A = i6 - getResources().getDimensionPixelSize(R.dimen.griver_au_segment_add_width);
                } else {
                    this.A = i6;
                }
                if (this.d.length > 0) {
                    int i8 = 0;
                    while (true) {
                        TextView[] textViewArr = this.d;
                        if (i8 >= textViewArr.length) {
                            break;
                        }
                        if (textViewArr[i8] != null) {
                            a(i8, (Paint) textViewArr[i8].getPaint());
                        }
                        i8++;
                    }
                }
            }
            super.onLayout(z2, i2, i3, i4, i5);
            c();
            return;
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    private void b() {
        a(this.i);
    }

    private void a(int i2) {
        if (!this.t) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.h = gradientDrawable;
            gradientDrawable.setShape(0);
            int i3 = this.e;
            if (i3 != 0) {
                this.h.setColor(i3);
            } else {
                this.h.setColor(getResources().getColor(R.color.griver_AU_COLOR9));
            }
            this.h.setSize(this.s[i2], getResources().getDimensionPixelSize(R.dimen.griver_switch_tab_line_height));
            this.tabButtomLine.setImageDrawable(this.h);
        }
    }

    public void resetTabView(String[] strArr) {
        if (!this.t && strArr != null && strArr.length != 0) {
            int length = strArr.length;
            this.tabCount = length;
            this.i = Math.min(length - 1, this.i);
            this.c = strArr;
            int i2 = this.tabCount;
            this.d = new TextView[i2];
            this.tabRl = new RelativeLayout[i2];
            this.r = new int[strArr.length];
            this.s = new int[strArr.length];
            this.x = new int[strArr.length];
            getTabViews(getContext());
            c();
        }
    }

    public void adjustLinePosition(int i2, float f2) {
        if (!this.t) {
            GriverLogger.d(TAG, "adjustLinePosition=".concat(String.valueOf(i2)));
            if (this.n) {
                this.f10531a.setTranslate((float) b(i2), 0.0f);
                this.f10531a.postTranslate(((float) this.r[i2]) * f2, 0.0f);
                this.tabButtomLine.setImageMatrix(this.f10531a);
                a(i2);
                return;
            }
            this.f10531a.setTranslate((float) ((this.b * i2) + this.x[i2]), 0.0f);
            this.f10531a.postTranslate(((float) this.b) * f2, 0.0f);
            this.tabButtomLine.setImageMatrix(this.f10531a);
        }
    }

    private int b(int i2) {
        int i3 = (this.f10532o / 2) + this.w;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += this.r[i4];
        }
        return i3;
    }

    private void c(int i2) {
        if (!this.t) {
            this.f10531a.setTranslate((float) i2, 0.0f);
            this.tabButtomLine.setImageMatrix(this.f10531a);
        }
    }

    public void selectTab(int i2) {
        RelativeLayout relativeLayout;
        if (!this.t) {
            int i3 = 0;
            while (i3 < this.tabCount) {
                boolean z2 = true;
                this.tabRl[i3].setSelected(i2 == i3);
                ((TextView) this.tabRl[i3].findViewById(R.id.tab_tv)).getPaint().setFakeBoldText(i2 == i3);
                if (this.q) {
                    relativeLayout = this.tabRl[i3];
                } else {
                    relativeLayout = this.tabRl[i3];
                    if (i2 == i3) {
                        z2 = false;
                    }
                }
                relativeLayout.setClickable(z2);
                i3++;
            }
            this.i = i2;
        }
    }

    public void selectTabAndAdjustLine(int i2) {
        if (!this.t) {
            selectTabAndAdjustLine(i2, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        }
    }

    public void selectTabAndAdjustLine(int i2, int i3) {
        if (!this.t && i2 != this.i) {
            selectTab(i2);
            if (this.j.computeScrollOffset()) {
                adjustLinePosition(this.i, 0.0f);
                this.j.forceFinished(true);
            }
            a(i2);
            if (this.n) {
                this.j.startScroll(b(this.i), 0, b(i2) - b(this.i), 0, i3 * Math.abs(this.i - i2));
            } else {
                Scroller scroller = this.j;
                int i4 = this.i;
                int i5 = this.b;
                int[] iArr = this.x;
                scroller.startScroll((i4 * i5) + iArr[i4], 0, ((i2 * i5) + iArr[i2]) - ((i5 * i4) + iArr[i4]), 0, i3 * Math.abs(i4 - i2));
            }
            invalidate();
            this.i = i2;
        }
    }

    public void computeScroll() {
        if (!this.t) {
            if (this.j.computeScrollOffset()) {
                c(this.j.getCurrX());
                postInvalidate();
            }
            super.computeScroll();
        }
    }

    public void setTabSwitchListener(TabSwitchListener tabSwitchListener) {
        if (!this.t) {
            this.k = tabSwitchListener;
            for (int i2 = 0; i2 < this.tabCount; i2++) {
                this.tabRl[i2].setOnClickListener(new View.OnClickListener() {
                    int position = 0;

                    public View.OnClickListener setPosition(int i) {
                        this.position = i;
                        return this;
                    }

                    public void onClick(View view) {
                        AUSegment.this.selectTabAndAdjustLine(this.position);
                        AUSegment.this.k.onTabClick(this.position, view);
                    }
                }.setPosition(i2));
            }
            return;
        }
        this.k = tabSwitchListener;
    }

    public TextView[] getTextViews() {
        return this.d;
    }

    public View getBottomLine() {
        return this.l;
    }

    public void addTextRightView(View view, int i2) {
        if (!this.t) {
            RelativeLayout[] relativeLayoutArr = this.tabRl;
            if (relativeLayoutArr != null || (i2 < relativeLayoutArr.length && view != null && relativeLayoutArr[i2] != null)) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = DensityUtil.dip2px(getContext(), -5.0f);
                layoutParams.addRule(1, R.id.tab_tv);
                layoutParams.addRule(6, R.id.tab_tv);
                RelativeLayout relativeLayout = (RelativeLayout) this.tabRl[i2].findViewById(R.id.tab_inner);
                if (relativeLayout != null) {
                    relativeLayout.addView(view, layoutParams);
                }
            }
        } else if (i2 < this.H.size()) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = DensityUtil.dip2px(getContext(), -15.0f);
            layoutParams2.topMargin = DensityUtil.dip2px(getContext(), 6.0f);
            layoutParams2.addRule(1, R.id.tv_menu_name);
            layoutParams2.addRule(6, R.id.tv_menu_name);
            RelativeLayout relativeLayout2 = (RelativeLayout) ((MenuItemLayout) this.C.getChildAt(i2)).findViewById(R.id.item_kernel);
            if (relativeLayout2 != null) {
                relativeLayout2.addView(view, layoutParams2);
            }
            this.I.put(Integer.valueOf(i2), view);
        }
    }

    public boolean isViewAllVisible(View view) {
        int right = view.getRight();
        int i2 = this.p;
        if (right > i2) {
            GriverLogger.d(TAG, String.format("view is not all Visible: screenWidth = %s, viewRight = %s ", new Object[]{Integer.valueOf(i2), Integer.valueOf(view.getRight())}));
            return false;
        }
        GriverLogger.d(TAG, String.format("view is all Visible: screenWidth = %s, viewRight = %s ", new Object[]{Integer.valueOf(i2), Integer.valueOf(view.getRight())}));
        return true;
    }

    public void setCurrentSelTab(int i2) {
        if (!this.t) {
            selectTab(i2);
            this.i = i2;
            c();
            return;
        }
        setCurrentIndex(i2);
    }

    private void c() {
        if (!this.t) {
            this.j.forceFinished(true);
            if (this.n) {
                this.f10531a.setTranslate((float) b(this.i), 0.0f);
                a(this.i);
            } else {
                Matrix matrix = this.f10531a;
                int i2 = this.b;
                int i3 = this.i;
                matrix.setTranslate((float) ((i2 * i3) + this.x[i3]), 0.0f);
            }
            this.tabButtomLine.setImageMatrix(this.f10531a);
        }
    }

    private boolean a(List<ItemCategory> list, List<ItemCategory> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!TextUtils.equals(list.get(i2).categoryId, list2.get(i2).categoryId) || !TextUtils.equals(list.get(i2).categoryname, list2.get(i2).categoryname)) {
                return false;
            }
        }
        return true;
    }

    public void init(List<ItemCategory> list) {
        init(list, false);
    }

    public void init(List<ItemCategory> list, boolean z2) {
        if (list != null) {
            List<ItemCategory> list2 = this.H;
            if (list2 == null || z2 || !a(list2, list)) {
                this.H = list;
                if (list.size() >= 0) {
                    this.F.smoothScrollTo(0, 0);
                    this.C.removeAllViews();
                    this.J = 0;
                    this.E = 0.0f;
                }
                e();
                d();
                this.I.clear();
            }
        }
    }

    public void setDivideAutoSize(boolean z2) {
        this.C.setDivideAutoSize(z2);
        this.C.invalidate();
        this.C.requestLayout();
    }

    private void d() {
        try {
            if (this.J < this.H.size()) {
                MenuItemLayout menuItemLayout = (MenuItemLayout) this.C.getChildAt(this.J);
                this.G = menuItemLayout;
                if (this.g != null) {
                    menuItemLayout.setTextColor(this.g);
                    this.G.setTextBold(true);
                } else {
                    menuItemLayout.setInitTextColor(getResources().getColor(R.color.griver_indicate_color));
                    this.G.setTextBold(true);
                }
                this.K = (String) this.G.getTag();
            }
            if (this.H.size() == 0) {
                this.C.setVisibility(8);
                this.D.setVisibility(4);
            } else {
                this.C.setVisibility(0);
                this.D.setVisibility(0);
            }
            post(new Runnable() {
                public void run() {
                    try {
                        AUSegment.this.a(AUSegment.this.G.getX(), AUSegment.this.G.getTextWidth());
                    } catch (Exception e) {
                        GriverLogger.d(AUSegment.TAG, e.toString());
                    }
                }
            });
        } catch (Exception e2) {
            GriverLogger.e(TAG, "setBarState:".concat(String.valueOf(e2)));
        }
    }

    private void e() {
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            MenuItemLayout menuItemLayout = new MenuItemLayout(getContext(), this.v / 2);
            ItemCategory itemCategory = this.H.get(i2);
            menuItemLayout.setTag(String.valueOf(i2));
            menuItemLayout.setText(itemCategory.categoryname);
            menuItemLayout.setInitTextColor(getResources().getColor(R.color.griver_black));
            float f2 = this.f;
            if (f2 != 0.0f) {
                menuItemLayout.setTextSize(f2);
            }
            a(menuItemLayout, itemCategory);
            this.C.addView(menuItemLayout);
        }
        this.C.invalidate();
        this.C.requestLayout();
    }

    private void a(MenuItemLayout menuItemLayout, final ItemCategory itemCategory) {
        menuItemLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (AUSegment.this.u || !TextUtils.equals(AUSegment.this.K, (String) view.getTag())) {
                    String unused = AUSegment.this.K = (String) view.getTag();
                    AUSegment.this.a(view, itemCategory);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(View view, ItemCategory itemCategory) {
        if (this.J < this.H.size()) {
            this.G = (MenuItemLayout) this.C.getChildAt(this.J);
        }
        MenuItemLayout menuItemLayout = this.G;
        if (menuItemLayout != null) {
            menuItemLayout.setInitTextColor(getResources().getColor(R.color.griver_black));
            this.G.setTextBold(false);
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            MenuItemLayout menuItemLayout2 = (MenuItemLayout) view;
            menuItemLayout2.setTextColor(colorStateList);
            menuItemLayout2.setTextBold(true);
        } else {
            MenuItemLayout menuItemLayout3 = (MenuItemLayout) view;
            menuItemLayout3.setInitTextColor(getResources().getColor(R.color.griver_indicate_color));
            menuItemLayout3.setTextBold(true);
        }
        if (this.k != null) {
            this.k.onTabClick(this.H.indexOf(itemCategory), view);
        }
        float x2 = view.getX();
        a(x2, ((MenuItemLayout) view).getTextWidth());
        a(view, x2);
        this.J = this.C.indexOfChild(view);
    }

    /* access modifiers changed from: private */
    public void a(View view, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.F.smoothScrollBy(iArr[0] - (this.p / 3), 0);
        this.E = f2;
    }

    /* access modifiers changed from: private */
    public void a(float f2, int i2) {
        if (this.E != f2) {
            try {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((LinearLayout.LayoutParams) this.D.getLayoutParams()).width, i2 - this.v});
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AUSegment.this.updateWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                ofInt.setDuration(200);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(new TranslateAnimation(this.E, f2, 0.0f, 0.0f));
                animationSet.setFillBefore(true);
                animationSet.setFillAfter(true);
                animationSet.setDuration(200);
                ofInt.start();
                this.D.startAnimation(animationSet);
            } catch (Exception e2) {
                GriverLogger.e(TAG, "moveScrollBarTo:".concat(String.valueOf(e2)));
            }
        }
    }

    public void updateWidth(int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.leftMargin = this.v / 2;
        layoutParams.rightMargin = this.v / 2;
        this.D.setLayoutParams(layoutParams);
    }

    public int getCurrentIndex() {
        return this.J;
    }

    private void setCurrentIndex(int i2) {
        if (i2 < this.H.size()) {
            if (this.J < this.H.size()) {
                this.G = (MenuItemLayout) this.C.getChildAt(this.J);
            }
            MenuItemLayout menuItemLayout = this.G;
            if (menuItemLayout != null) {
                menuItemLayout.setInitTextColor(getResources().getColor(R.color.griver_black));
                this.G.setTextBold(false);
            }
            this.J = i2;
            if (i2 < this.H.size()) {
                MenuItemLayout menuItemLayout2 = (MenuItemLayout) this.C.getChildAt(this.J);
                this.G = menuItemLayout2;
                if (menuItemLayout2 != null) {
                    ColorStateList colorStateList = this.g;
                    if (colorStateList != null) {
                        menuItemLayout2.setTextColor(colorStateList);
                        this.G.setTextBold(true);
                    } else {
                        menuItemLayout2.setInitTextColor(getResources().getColor(R.color.griver_indicate_color));
                        this.G.setTextBold(true);
                    }
                    post(new Runnable() {
                        public void run() {
                            try {
                                AUSegment.this.a(AUSegment.this.G.getX(), AUSegment.this.G.getTextWidth());
                                AUSegment.this.a((View) AUSegment.this.G, AUSegment.this.G.getX());
                            } catch (Exception e) {
                                GriverLogger.d(AUSegment.TAG, e.toString());
                            }
                        }
                    });
                    this.K = (String) this.G.getTag();
                }
            }
        }
    }

    public AUIconView getAddIcon() {
        return this.y;
    }
}
