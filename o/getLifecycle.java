package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class getLifecycle {
    static HashMap<String, Constructor<? extends onRetainNonConfigurationInstance>> getMax;
    private HashMap<Integer, ArrayList<onRetainNonConfigurationInstance>> setMax = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends onRetainNonConfigurationInstance>> hashMap = new HashMap<>();
        getMax = hashMap;
        try {
            hashMap.put("KeyAttribute", onRetainCustomNonConfigurationInstance.class.getConstructor(new Class[0]));
            getMax.put("KeyPosition", peekAvailableContext.class.getConstructor(new Class[0]));
            getMax.put("KeyCycle", addOnContextAvailableListener.class.getConstructor(new Class[0]));
            getMax.put("KeyTimeCycle", ensureViewModelStore.class.getConstructor(new Class[0]));
            getMax.put("KeyTrigger", getViewModelStore.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ExcHandler: IOException | XmlPullParserException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getLifecycle(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6) {
        /*
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.setMax = r0
            r0 = 0
            int r1 = r6.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
        L_0x000f:
            r2 = 1
            if (r1 == r2) goto L_0x0095
            r2 = 2
            if (r1 == r2) goto L_0x0027
            r2 = 3
            if (r1 == r2) goto L_0x001a
            goto L_0x008f
        L_0x001a:
            java.lang.String r1 = "KeyFrameSet"
            java.lang.String r2 = r6.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            boolean r1 = r1.equals(r2)     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            if (r1 == 0) goto L_0x008f
            return
        L_0x0027:
            java.lang.String r1 = r6.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends o.onRetainNonConfigurationInstance>> r2 = getMax     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            boolean r2 = r2.containsKey(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            if (r2 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends o.onRetainNonConfigurationInstance>> r2 = getMax     // Catch:{ Exception -> 0x008f, IOException | XmlPullParserException -> 0x0095 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x008f, IOException | XmlPullParserException -> 0x0095 }
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch:{ Exception -> 0x008f, IOException | XmlPullParserException -> 0x0095 }
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x008f, IOException | XmlPullParserException -> 0x0095 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ Exception -> 0x008f, IOException | XmlPullParserException -> 0x0095 }
            o.onRetainNonConfigurationInstance r1 = (o.onRetainNonConfigurationInstance) r1     // Catch:{ Exception -> 0x008f, IOException | XmlPullParserException -> 0x0095 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r6)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            r1.getMin(r5, r0)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<o.onRetainNonConfigurationInstance>> r0 = r4.setMax     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            int r2 = r1.getMax     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            if (r0 != 0) goto L_0x0069
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<o.onRetainNonConfigurationInstance>> r0 = r4.setMax     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            int r2 = r1.getMax     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            r3.<init>()     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
        L_0x0069:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<o.onRetainNonConfigurationInstance>> r0 = r4.setMax     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            int r2 = r1.getMax     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
            r0.add(r1)     // Catch:{ Exception -> 0x007a, IOException | XmlPullParserException -> 0x0095 }
        L_0x007a:
            r0 = r1
            goto L_0x008f
        L_0x007c:
            java.lang.String r2 = "CustomAttribute"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            if (r1 == 0) goto L_0x008f
            if (r0 == 0) goto L_0x008f
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r0.toIntRange     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            if (r1 == 0) goto L_0x008f
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r0.toIntRange     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            androidx.constraintlayout.widget.ConstraintAttribute.length(r5, r6, r1)     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
        L_0x008f:
            int r1 = r6.next()     // Catch:{ IOException | XmlPullParserException -> 0x0095 }
            goto L_0x000f
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLifecycle.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void setMax(onBackPressed onbackpressed) {
        ArrayList arrayList = this.setMax.get(Integer.valueOf(onbackpressed.getMax));
        if (arrayList != null) {
            onbackpressed.invoke.addAll(arrayList);
        }
        ArrayList arrayList2 = this.setMax.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                onRetainNonConfigurationInstance onretainnonconfigurationinstance = (onRetainNonConfigurationInstance) it.next();
                if (onretainnonconfigurationinstance.length(((ConstraintLayout.LayoutParams) onbackpressed.setMax.getLayoutParams()).requestPostMessageChannel)) {
                    onbackpressed.invoke.add(onretainnonconfigurationinstance);
                }
            }
        }
    }
}
