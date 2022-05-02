package id.dana.sendmoney;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.CircleImageSelectionView;
import java.util.List;
import o.isOriginHasAppInfo;

public class RecentDetailView extends BaseRichView {
    private TextView getMax;
    private TextView getMin;
    private CircleImageSelectionView length;

    public int getLayout() {
        return R.layout.view_recent_detail;
    }

    public RecentDetailView(@NonNull Context context) {
        super(context);
    }

    public RecentDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecentDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RecentDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        this.length = (CircleImageSelectionView) findViewById(R.id.f38122131362290);
        this.getMax = (TextView) findViewById(R.id.f65732131365199);
        this.getMin = (TextView) findViewById(R.id.f67452131365372);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setView(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            int r0 = r8.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -567451565: goto L_0x0033;
                case 3016252: goto L_0x0029;
                case 3321850: goto L_0x001f;
                case 1910961662: goto L_0x0015;
                case 2017195305: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x003d
        L_0x000b:
            java.lang.String r0 = "cashoutAgents"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003d
            r8 = 2
            goto L_0x003e
        L_0x0015:
            java.lang.String r0 = "scanner"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003d
            r8 = 0
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "link"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003d
            r8 = 1
            goto L_0x003e
        L_0x0029:
            java.lang.String r0 = "bank"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003d
            r8 = 3
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "contacts"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003d
            r8 = 4
            goto L_0x003e
        L_0x003d:
            r8 = -1
        L_0x003e:
            if (r8 == 0) goto L_0x0056
            if (r8 == r3) goto L_0x0052
            if (r8 == r2) goto L_0x004e
            if (r8 == r1) goto L_0x004a
            r8 = 2131231744(0x7f080400, float:1.8079578E38)
            goto L_0x0059
        L_0x004a:
            r8 = 2131231764(0x7f080414, float:1.8079618E38)
            goto L_0x0059
        L_0x004e:
            r8 = 2131232174(0x7f0805ae, float:1.808045E38)
            goto L_0x0059
        L_0x0052:
            r8 = 2131232285(0x7f08061d, float:1.8080675E38)
            goto L_0x0059
        L_0x0056:
            r8 = 2131232286(0x7f08061e, float:1.8080677E38)
        L_0x0059:
            r4.setName(r5)
            r4.setDetail(r6)
            int r5 = o.dispatchOnCancelled.setMax(r8)
            if (r8 == r5) goto L_0x0073
            o.onCanceled r6 = new o.onCanceled
            r6.<init>(r8, r5, r3)
            r5 = 1157025715(0x44f6cfb3, float:1974.4906)
            o.onCancelLoad.setMax(r5, r6)
            o.onCancelLoad.getMin(r5, r6)
        L_0x0073:
            id.dana.richview.CircleImageSelectionView r5 = r4.length
            if (r5 == 0) goto L_0x0087
            if (r7 == 0) goto L_0x0080
            boolean r5 = r7.isEmpty()
            if (r5 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            java.lang.String r7 = ""
        L_0x0082:
            id.dana.richview.CircleImageSelectionView r5 = r4.length
            r5.loadImage(r7, r8)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.RecentDetailView.setView(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void setView(String str, String str2, String str3, boolean z) {
        setView(str, (String) null, str2, str3);
        this.length.useRemoveIcon(z);
    }

    public void setView(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        setView(str, str2, str3, str4);
        this.length.useRemoveIcon(z);
        this.length.setPhotoCircleDisplay(z2);
    }

    public void setName(String str) {
        TextView textView = this.getMin;
        if (textView != null && str != null) {
            textView.setText(str);
        }
    }

    public void setDetail(String str) {
        TextView textView = this.getMax;
        if (textView != null && str != null) {
            textView.setText(str);
            this.getMax.setVisibility(0);
        }
    }

    public void setOnClickCrossIconListener(CircleImageSelectionView.length length2) {
        this.length.setListener(length2);
    }

    public void setSelectedState(List<String> list, String str) {
        if (length(list, str)) {
            this.length.setSelectedState();
        } else {
            this.length.setUnselectedState();
        }
    }

    private static boolean length(List<String> list, String str) {
        String indoPhoneNumber = isOriginHasAppInfo.getIndoPhoneNumber(str);
        return list != null && !list.isEmpty() && indoPhoneNumber != null && list.contains(indoPhoneNumber);
    }
}
