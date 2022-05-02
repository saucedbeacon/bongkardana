package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class setTintList {
    public abstract Object getMax(Object obj, Object obj2, Object obj3);

    public abstract void getMax(Object obj, View view, ArrayList<View> arrayList);

    public abstract Object getMin(Object obj);

    public abstract void getMin(Object obj, View view);

    public abstract void getMin(Object obj, ArrayList<View> arrayList);

    public abstract Object length(Object obj, Object obj2, Object obj3);

    public abstract void length(Object obj, Rect rect);

    public abstract void length(Object obj, View view);

    public abstract void length(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void length(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void setMax(ViewGroup viewGroup, Object obj);

    public abstract void setMax(Object obj, View view);

    public abstract void setMax(Object obj, View view, ArrayList<View> arrayList);

    public abstract void setMax(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract boolean setMax(Object obj);

    public abstract Object setMin(Object obj);

    /* access modifiers changed from: protected */
    public void getMin(View view, Rect rect) {
        if (ViewCompat.ICustomTabsService(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> setMin(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ViewCompat.onNavigationEvent(view));
            ViewCompat.getMin(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    public void setMax(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String onNavigationEvent = ViewCompat.onNavigationEvent(view2);
            arrayList4.add(onNavigationEvent);
            if (onNavigationEvent != null) {
                ViewCompat.getMin(view2, (String) null);
                String str = map.get(onNavigationEvent);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.getMin(arrayList2.get(i2), onNavigationEvent);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        getMenuInflater.getMin(view, new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    ViewCompat.getMin((View) arrayList5.get(i), (String) arrayList6.get(i));
                    ViewCompat.getMin((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void getMin(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (onPostResume.length(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                getMin(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    public void getMin(Map<String, View> map, @NonNull View view) {
        if (view.getVisibility() == 0) {
            String onNavigationEvent = ViewCompat.onNavigationEvent(view);
            if (onNavigationEvent != null) {
                map.put(onNavigationEvent, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    getMin(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void getMin(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        getMenuInflater.getMin(view, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String onNavigationEvent = ViewCompat.onNavigationEvent(view);
                    if (onNavigationEvent != null) {
                        ViewCompat.getMin(view, setTintList.setMin((Map<String, String>) map, onNavigationEvent));
                    }
                }
            }
        });
    }

    public void getMax(@NonNull Fragment fragment, @NonNull Object obj, @NonNull StringRes stringRes, @NonNull Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void setMin(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        getMenuInflater.getMin(viewGroup, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    ViewCompat.getMin(view, (String) map.get(ViewCompat.onNavigationEvent(view)));
                }
            }
        });
    }

    protected static void setMin(List<View> list, View view) {
        int size = list.size();
        if (!length(list, view, size)) {
            if (ViewCompat.onNavigationEvent(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!length(list, childAt, size) && ViewCompat.onNavigationEvent(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean length(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean setMin(List list) {
        return list == null || list.isEmpty();
    }

    static String setMin(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }
}
