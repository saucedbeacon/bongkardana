package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.ActionBar$NavigationMode;
import o.setBackgroundResource;

public final class TextViewCompat {
    private static boolean getMax;
    private static Field getMin;
    private static Field length;
    private static boolean setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    private static Field getMin(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    private static int setMin(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    public static void setMin(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static int setMin(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!setMin) {
            getMin = getMin("mMaxMode");
            setMin = true;
        }
        Field field = getMin;
        if (field == null || setMin(field, textView) != 1) {
            return -1;
        }
        if (!getMax) {
            length = getMin("mMaximum");
            getMax = true;
        }
        Field field2 = length;
        if (field2 != null) {
            return setMin(field2, textView);
        }
        return -1;
    }

    public static void setMax(@NonNull TextView textView, @StyleRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    @NonNull
    public static Drawable[] setMax(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback length(@NonNull TextView textView, @Nullable ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof getMin) || callback == null) ? callback : new getMin(callback, textView);
    }

    @RequiresApi(26)
    static class getMin implements ActionMode.Callback {
        private boolean getMax;
        private Class<?> getMin;
        private final ActionMode.Callback length;
        private final TextView setMax;
        private Method setMin;
        private boolean toIntRange = false;

        getMin(ActionMode.Callback callback, TextView textView) {
            this.length = callback;
            this.setMax = textView;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.length.onCreateActionMode(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            getMax(menu);
            return this.length.onPrepareActionMode(actionMode, menu);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.length.onActionItemClicked(actionMode, menuItem);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.length.onDestroyActionMode(actionMode);
        }

        private void getMax(Menu menu) {
            Method method;
            Context context = this.setMax.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.toIntRange) {
                this.toIntRange = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.getMin = cls;
                    this.setMin = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.getMax = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.getMin = null;
                    this.setMin = null;
                    this.getMax = false;
                }
            }
            try {
                if (!this.getMax || !this.getMin.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.setMin;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> min = setMin(context, packageManager);
                for (int i = 0; i < min.size(); i++) {
                    ResolveInfo resolveInfo = min.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(setMin(resolveInfo, this.setMax)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private List<ResolveInfo> setMin(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(getMax(), 0)) {
                if (setMax(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        private boolean setMax(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            if (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0) {
                return true;
            }
            return false;
        }

        private Intent setMin(ResolveInfo resolveInfo, TextView textView) {
            return getMax().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !getMax(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        private boolean getMax(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private Intent getMax() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void setMin(@NonNull TextView textView, @Px @IntRange(from = 0) int i) {
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    public static void getMin(@NonNull TextView textView, @Px @IntRange(from = 0) int i) {
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static int getMin(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int length(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void length(@NonNull TextView textView, @Px @IntRange(from = 0) int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static ActionBar$NavigationMode.getMax getMax(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ActionBar$NavigationMode.getMax(textView.getTextMetricsParams());
        }
        ActionBar$NavigationMode.getMax.C0001getMax getmax = new ActionBar$NavigationMode.getMax.C0001getMax(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            getmax.getMin(textView.getBreakStrategy());
            getmax.setMax(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            getmax.length(isInside(textView));
        }
        return getmax.length();
    }

    public static void length(@NonNull TextView textView, @NonNull ActionBar$NavigationMode.getMax getmax) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(setMin(getmax.setMax()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = getmax.getMax().getTextScaleX();
            textView.getPaint().set(getmax.getMax());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(getmax.getMax());
        textView.setBreakStrategy(getmax.setMin());
        textView.setHyphenationFrequency(getmax.length());
    }

    public static void setMax(@NonNull TextView textView, @NonNull ActionBar$NavigationMode actionBar$NavigationMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(actionBar$NavigationMode.setMin());
        } else if (getMax(textView).getMin(actionBar$NavigationMode.setMax())) {
            textView.setText(actionBar$NavigationMode);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    @RequiresApi(18)
    private static TextDirectionHeuristic isInside(@NonNull TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    @RequiresApi(18)
    private static int setMin(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    public static void length(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        if (textView == null) {
            throw null;
        } else if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof setBackgroundResource) {
            ((setBackgroundResource) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void getMin(@NonNull TextView textView, @Nullable PorterDuff.Mode mode) {
        if (textView == null) {
            throw null;
        } else if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof setBackgroundResource) {
            ((setBackgroundResource) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
