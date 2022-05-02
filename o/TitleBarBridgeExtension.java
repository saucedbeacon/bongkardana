package o;

import android.content.Context;
import android.graphics.Typeface;
import o.ActionSheetRecyclerAdapter;

public class TitleBarBridgeExtension {
    private Context context;

    public TitleBarBridgeExtension(Context context2) {
        this.context = context2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface getFont(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -738822430(0xffffffffd3f676e2, float:-2.11711295E12)
            if (r0 == r1) goto L_0x0019
            r1 = 199069218(0xbdd8e22, float:8.533996E-32)
            if (r0 == r1) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "openSansBold"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "sfProRegular"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = -1
        L_0x0024:
            if (r3 == 0) goto L_0x002d
            android.content.Context r3 = r2.context
            android.graphics.Typeface r3 = r2.toSFProRegular(r3)
            return r3
        L_0x002d:
            android.content.Context r3 = r2.context
            android.graphics.Typeface r3 = r2.toOpenSansSemiBold(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TitleBarBridgeExtension.getFont(java.lang.String):android.graphics.Typeface");
    }

    private Typeface toOpenSansSemiBold(Context context2) {
        return OptIn.length(context2, ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.getMin.open_sans_bold);
    }

    private Typeface toSFProRegular(Context context2) {
        return OptIn.length(context2, ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.getMin.sf_pro_regular);
    }
}
