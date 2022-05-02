package o;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import o.ITrustedWebActivityCallback;

public final class removeQueueItem extends AppCompatDelegateImpl$PanelFeatureState$SavedState implements View.OnClickListener {
    private final WeakHashMap<String, Drawable.ConstantState> FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm = -1;
    private int ICustomTabsCallback = -1;
    private boolean Mean$Arithmetic = false;
    private int b = -1;
    private final SearchView hashCode;
    private int invoke = -1;
    private int invokeSuspend = -1;
    private int onNavigationEvent = -1;
    public int setMax = 1;
    private final int toDoubleRange;
    private final Context toString;
    private ColorStateList valueOf;
    private final SearchableInfo values;

    public final boolean hasStableIds() {
        return false;
    }

    public removeQueueItem(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.hashCode = searchView;
        this.values = searchableInfo;
        this.toDoubleRange = searchView.getSuggestionCommitIconResId();
        this.toString = context;
        this.FastBitmap$CoordinateSystem = weakHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[Catch:{ RuntimeException -> 0x007d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor length(java.lang.CharSequence r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x0006
            r11 = r0
            goto L_0x000a
        L_0x0006:
            java.lang.String r11 = r11.toString()
        L_0x000a:
            androidx.appcompat.widget.SearchView r1 = r10.hashCode
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x007d
            androidx.appcompat.widget.SearchView r1 = r10.hashCode
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x001c
            goto L_0x007d
        L_0x001c:
            android.app.SearchableInfo r1 = r10.values     // Catch:{ RuntimeException -> 0x007d }
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            r11 = r2
            goto L_0x0077
        L_0x0022:
            java.lang.String r3 = r1.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x007d }
            if (r3 != 0) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x007d }
            r4.<init>()     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r5 = "content"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r3 = r4.authority(r3)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r3 = r3.query(r0)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r0 = r3.fragment(r0)     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r3 = r1.getSuggestPath()     // Catch:{ RuntimeException -> 0x007d }
            if (r3 == 0) goto L_0x0049
            r0.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x007d }
        L_0x0049:
            java.lang.String r3 = "search_suggest_query"
            r0.appendPath(r3)     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r7 = r1.getSuggestSelection()     // Catch:{ RuntimeException -> 0x007d }
            if (r7 == 0) goto L_0x005c
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ RuntimeException -> 0x007d }
            r3 = 0
            r1[r3] = r11     // Catch:{ RuntimeException -> 0x007d }
            r8 = r1
            goto L_0x0060
        L_0x005c:
            r0.appendPath(r11)     // Catch:{ RuntimeException -> 0x007d }
            r8 = r2
        L_0x0060:
            java.lang.String r11 = "limit"
            java.lang.String r1 = "50"
            r0.appendQueryParameter(r11, r1)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri r5 = r0.build()     // Catch:{ RuntimeException -> 0x007d }
            android.content.Context r11 = r10.toString     // Catch:{ RuntimeException -> 0x007d }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ RuntimeException -> 0x007d }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x007d }
        L_0x0077:
            if (r11 == 0) goto L_0x007d
            r11.getCount()     // Catch:{ RuntimeException -> 0x007d }
            return r11
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeQueueItem.length(java.lang.CharSequence):android.database.Cursor");
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor length = length();
        Bundle extras = length != null ? length.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor length = length();
        Bundle extras = length != null ? length.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void setMin(Cursor cursor) {
        if (!this.Mean$Arithmetic) {
            try {
                super.setMin(cursor);
                if (cursor != null) {
                    this.invoke = cursor.getColumnIndex("suggest_text_1");
                    this.Grayscale$Algorithm = cursor.getColumnIndex("suggest_text_2");
                    this.invokeSuspend = cursor.getColumnIndex("suggest_text_2_url");
                    this.ICustomTabsCallback = cursor.getColumnIndex("suggest_icon_1");
                    this.b = cursor.getColumnIndex("suggest_icon_2");
                    this.onNavigationEvent = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public final View setMax(Context context, Cursor cursor, ViewGroup viewGroup) {
        View max = super.setMax(context, cursor, viewGroup);
        max.setTag(new getMax(max));
        ((ImageView) max.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.valueOf)).setImageResource(this.toDoubleRange);
        return max;
    }

    static final class getMax {
        public final TextView getMax;
        public final TextView getMin;
        public final ImageView length;
        public final ImageView setMax;
        public final ImageView setMin;

        public getMax(View view) {
            this.getMin = (TextView) view.findViewById(16908308);
            this.getMax = (TextView) view.findViewById(16908309);
            this.length = (ImageView) view.findViewById(16908295);
            this.setMax = (ImageView) view.findViewById(16908296);
            this.setMin = (ImageView) view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.valueOf);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r19.getTag()
            o.removeQueueItem$getMax r2 = (o.removeQueueItem.getMax) r2
            int r3 = r0.onNavigationEvent
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L_0x0015
            int r3 = r1.getInt(r3)
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.widget.TextView r6 = r2.getMin
            r7 = 8
            if (r6 == 0) goto L_0x0034
            int r6 = r0.invoke
            java.lang.String r6 = getMax((android.database.Cursor) r1, (int) r6)
            android.widget.TextView r8 = r2.getMin
            r8.setText(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0031
            r8.setVisibility(r7)
            goto L_0x0034
        L_0x0031:
            r8.setVisibility(r5)
        L_0x0034:
            android.widget.TextView r6 = r2.getMax
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00c0
            int r6 = r0.invokeSuspend
            java.lang.String r6 = getMax((android.database.Cursor) r1, (int) r6)
            if (r6 == 0) goto L_0x0085
            android.content.res.ColorStateList r10 = r0.valueOf
            if (r10 != 0) goto L_0x0064
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r0.toString
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r12 = o.ITrustedWebActivityCallback.Stub.getMin.extraCommand
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r0.toString
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r0.valueOf = r10
        L_0x0064:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r6)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r0.valueOf
            r16 = 0
            r17 = r11
            r11 = r15
            r4 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r6 = r6.length()
            r11 = 33
            r10.setSpan(r4, r5, r6, r11)
            goto L_0x008b
        L_0x0085:
            int r4 = r0.Grayscale$Algorithm
            java.lang.String r10 = getMax((android.database.Cursor) r1, (int) r4)
        L_0x008b:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x00a0
            android.widget.TextView r4 = r2.getMin
            if (r4 == 0) goto L_0x00ae
            android.widget.TextView r4 = r2.getMin
            r4.setSingleLine(r5)
            android.widget.TextView r4 = r2.getMin
            r4.setMaxLines(r8)
            goto L_0x00ae
        L_0x00a0:
            android.widget.TextView r4 = r2.getMin
            if (r4 == 0) goto L_0x00ae
            android.widget.TextView r4 = r2.getMin
            r4.setSingleLine(r9)
            android.widget.TextView r4 = r2.getMin
            r4.setMaxLines(r9)
        L_0x00ae:
            android.widget.TextView r4 = r2.getMax
            r4.setText(r10)
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 == 0) goto L_0x00bd
            r4.setVisibility(r7)
            goto L_0x00c0
        L_0x00bd:
            r4.setVisibility(r5)
        L_0x00c0:
            android.widget.ImageView r4 = r2.length
            r6 = 0
            if (r4 == 0) goto L_0x0124
            android.widget.ImageView r4 = r2.length
            int r10 = r0.ICustomTabsCallback
            r11 = -1
            if (r10 != r11) goto L_0x00ce
            r10 = r6
            goto L_0x0120
        L_0x00ce:
            java.lang.String r10 = r1.getString(r10)
            android.graphics.drawable.Drawable r10 = r0.getMax(r10)
            if (r10 == 0) goto L_0x00d9
            goto L_0x0120
        L_0x00d9:
            android.app.SearchableInfo r10 = r0.values
            android.content.ComponentName r10 = r10.getSearchActivity()
            java.lang.String r11 = r10.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r0.FastBitmap$CoordinateSystem
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x0102
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r0.FastBitmap$CoordinateSystem
            java.lang.Object r10 = r10.get(r11)
            android.graphics.drawable.Drawable$ConstantState r10 = (android.graphics.drawable.Drawable.ConstantState) r10
            if (r10 != 0) goto L_0x00f7
            r10 = r6
            goto L_0x0113
        L_0x00f7:
            android.content.Context r11 = r0.toString
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r10 = r10.newDrawable(r11)
            goto L_0x0113
        L_0x0102:
            android.graphics.drawable.Drawable r10 = r0.setMin((android.content.ComponentName) r10)
            if (r10 != 0) goto L_0x010a
            r12 = r6
            goto L_0x010e
        L_0x010a:
            android.graphics.drawable.Drawable$ConstantState r12 = r10.getConstantState()
        L_0x010e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r0.FastBitmap$CoordinateSystem
            r13.put(r11, r12)
        L_0x0113:
            if (r10 == 0) goto L_0x0116
            goto L_0x0120
        L_0x0116:
            android.content.Context r10 = r0.toString
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.graphics.drawable.Drawable r10 = r10.getDefaultActivityIcon()
        L_0x0120:
            r11 = 4
            setMax((android.widget.ImageView) r4, (android.graphics.drawable.Drawable) r10, (int) r11)
        L_0x0124:
            android.widget.ImageView r4 = r2.setMax
            if (r4 == 0) goto L_0x013b
            android.widget.ImageView r4 = r2.setMax
            int r10 = r0.b
            r11 = -1
            if (r10 != r11) goto L_0x0130
            goto L_0x0138
        L_0x0130:
            java.lang.String r1 = r1.getString(r10)
            android.graphics.drawable.Drawable r6 = r0.getMax(r1)
        L_0x0138:
            setMax((android.widget.ImageView) r4, (android.graphics.drawable.Drawable) r6, (int) r7)
        L_0x013b:
            int r1 = r0.setMax
            if (r1 == r8) goto L_0x014c
            if (r1 != r9) goto L_0x0146
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0146
            goto L_0x014c
        L_0x0146:
            android.widget.ImageView r1 = r2.setMin
            r1.setVisibility(r7)
            return
        L_0x014c:
            android.widget.ImageView r1 = r2.setMin
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r2.setMin
            android.widget.TextView r3 = r2.getMin
            java.lang.CharSequence r3 = r3.getText()
            r1.setTag(r3)
            android.widget.ImageView r1 = r2.setMin
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeQueueItem.getMax(android.view.View, android.database.Cursor):void");
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.hashCode.onQueryRefine((CharSequence) tag);
        }
    }

    private static void setMax(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View max = setMax(this.toString, length(), viewGroup);
            if (max != null) {
                ((getMax) max.getTag()).getMin.setText(e.toString());
            }
            return max;
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View min = getMin(this.toString, length(), viewGroup);
            if (min != null) {
                ((getMax) min.getTag()).getMin.setText(e.toString());
            }
            return min;
        }
    }

    private Drawable getMax(String str) {
        Drawable drawable;
        Drawable drawable2 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(this.toString.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String obj = sb.toString();
                Drawable.ConstantState constantState = this.FastBitmap$CoordinateSystem.get(obj);
                if (constantState == null) {
                    drawable = null;
                } else {
                    drawable = constantState.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                Drawable length = IntRange.length(this.toString, parseInt);
                if (length != null) {
                    this.FastBitmap$CoordinateSystem.put(obj, length.getConstantState());
                }
                return length;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.FastBitmap$CoordinateSystem.get(str);
                if (constantState2 != null) {
                    drawable2 = constantState2.newDrawable();
                }
                if (drawable2 != null) {
                    return drawable2;
                }
                drawable2 = length(Uri.parse(str));
                if (drawable2 != null) {
                    this.FastBitmap$CoordinateSystem.put(str, drawable2.getConstantState());
                }
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return drawable2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x003a=Splitter:B:21:0x003a, B:4:0x000d=Splitter:B:4:0x000d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable length(android.net.Uri r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r4.getScheme()     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x004b }
            if (r1 == 0) goto L_0x0022
            android.graphics.drawable.Drawable r4 = r3.setMin((android.net.Uri) r4)     // Catch:{ NotFoundException -> 0x0012 }
            return r4
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r2 = "Resource does not exist: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r4 = r2.concat(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            throw r1     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x0022:
            android.content.Context r1 = r3.toString     // Catch:{ FileNotFoundException -> 0x004b }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x004b }
            java.io.InputStream r1 = r1.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            if (r1 == 0) goto L_0x003b
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0036 }
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r4
        L_0x0036:
            r4 = move-exception
            r1.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            throw r4     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x003b:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r2 = "Failed to open "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            java.lang.String r4 = r2.concat(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004b }
            throw r1     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x004b:
            r4 = move-exception
            r4.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeQueueItem.length(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable setMin(ComponentName componentName) {
        PackageManager packageManager = this.toString.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String setMax(Cursor cursor, String str) {
        return getMax(cursor, cursor.getColumnIndex(str));
    }

    private static String getMax(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    private Drawable setMin(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.toString.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                }
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
            }
        } else {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
    }

    public final CharSequence getMin(Cursor cursor) {
        String max;
        String max2;
        if (cursor == null) {
            return null;
        }
        String max3 = getMax(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (max3 != null) {
            return max3;
        }
        if (this.values.shouldRewriteQueryFromData() && (max2 = getMax(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return max2;
        }
        if (!this.values.shouldRewriteQueryFromText() || (max = getMax(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return max;
    }
}
