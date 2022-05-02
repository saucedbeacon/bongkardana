package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class checkLayoutParams extends setTintList {
    public boolean setMax(Object obj) {
        return obj instanceof Transition;
    }

    public Object setMin(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object getMin(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setMax((Transition) obj);
        return transitionSet;
    }

    public void setMax(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            setMin(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        getMin((Object) transitionSet, arrayList);
    }

    public void getMin(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            getMin(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.length() {
                public final Rect getMax() {
                    return rect;
                }
            });
        }
    }

    public void getMin(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int size = transitionSet.getMax.size();
                while (i < size) {
                    getMin((Object) (i < 0 || i >= transitionSet.getMax.size()) ? null : transitionSet.getMax.get(i), arrayList);
                    i++;
                }
            } else if (!length(transition) && setMin((List) transition.getTargets())) {
                int size2 = arrayList.size();
                while (i < size2) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    private static boolean length(Transition transition) {
        return !setMin((List) transition.getTargetIds()) || !setMin((List) transition.getTargetNames()) || !setMin((List) transition.getTargetTypes());
    }

    public Object length(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.setMax((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.setMax((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.setMax((Transition) obj3);
        }
        return transitionSet;
    }

    public void getMax(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.getMax() {
            public final void onTransitionCancel(@NonNull Transition transition) {
            }

            public final void onTransitionPause(@NonNull Transition transition) {
            }

            public final void onTransitionResume(@NonNull Transition transition) {
            }

            public final void onTransitionStart(@NonNull Transition transition) {
            }

            public final void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    public Object getMax(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().setMax(transition).setMax(transition2).setMin(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.setMax(transition);
        }
        transitionSet.setMax(transition3);
        return transitionSet;
    }

    public void setMax(ViewGroup viewGroup, Object obj) {
        isHideOnContentScrollEnabled.getMin(viewGroup, (Transition) obj);
    }

    public void length(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).addListener(new getActionBarHideOffset() {
            public final void onTransitionStart(@NonNull Transition transition) {
                Object obj = obj5;
                if (obj != null) {
                    checkLayoutParams.this.setMax(obj, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    checkLayoutParams.this.setMax(obj2, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    checkLayoutParams.this.setMax(obj3, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }

            public final void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    public void length(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            setMax((Object) transitionSet, arrayList, arrayList2);
        }
    }

    public void setMax(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.getMax.size();
            while (i2 < size) {
                setMax((Object) (i2 < 0 || i2 >= transitionSet.getMax.size()) ? null : transitionSet.getMax.get(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!length(transition)) {
            List<View> targets = transition.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.addTarget(arrayList2.get(i2));
                    i2++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget(arrayList.get(size2));
                }
            }
        }
    }

    public void setMax(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void length(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public void length(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.length() {
                public final Rect getMax() {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}
