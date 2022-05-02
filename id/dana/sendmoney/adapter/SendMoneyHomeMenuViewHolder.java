package id.dana.sendmoney.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.richview.RibbonView;
import o.APImageInfo;
import o.CornerMarkingDataProvider;
import o.Ignore;
import o.doDismissWithAnimation;
import o.isLineVisible;
import o.setOnMenuWindowDismissListener;

public class SendMoneyHomeMenuViewHolder extends Ignore<SendMoneyHomeMenuModel> {
    @BindView(2131362516)
    public ConstraintLayout clSendMoneyHomeMenu;
    private final setMin getMax;
    private final doDismissWithAnimation getMin = new doDismissWithAnimation();
    @BindView(2131363634)
    ImageView ivSendMoney;
    @BindView(2131364379)
    RibbonView ribbonView;
    @BindView(2131365554)
    TextView tvSendToSubtitle;
    @BindView(2131365555)
    TextView tvSendToTitle;

    public interface setMin {
        void length(SendMoneyHomeMenuModel sendMoneyHomeMenuModel);
    }

    public final /* synthetic */ void setMax(Object obj) {
        SendMoneyHomeMenuModel sendMoneyHomeMenuModel = (SendMoneyHomeMenuModel) obj;
        if (sendMoneyHomeMenuModel != null) {
            setMax(sendMoneyHomeMenuModel);
            length(sendMoneyHomeMenuModel);
            setMin(sendMoneyHomeMenuModel.length, sendMoneyHomeMenuModel.equals);
            this.clSendMoneyHomeMenu.setOnClickListener(new APImageInfo(this, sendMoneyHomeMenuModel));
            setMin(sendMoneyHomeMenuModel);
        }
    }

    public SendMoneyHomeMenuViewHolder(Context context, ViewGroup viewGroup, setMin setmin) {
        super(context, R.layout.view_send_money_home_menu, viewGroup);
        this.getMax = setmin;
    }

    public final void length(SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        this.tvSendToTitle.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(this.length, sendMoneyHomeMenuModel.setMin, sendMoneyHomeMenuModel.setMin));
        this.tvSendToSubtitle.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(this.length, sendMoneyHomeMenuModel.getMax, sendMoneyHomeMenuModel.getMax));
    }

    public final void setMax(SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        if (sendMoneyHomeMenuModel.setMin()) {
            this.ribbonView.setVisibility(0);
            this.ribbonView.setRibbonLineTopText(CornerMarkingDataProvider.AnonymousClass3.setMin(this.length, sendMoneyHomeMenuModel.toIntRange, sendMoneyHomeMenuModel.toIntRange));
            String min = CornerMarkingDataProvider.AnonymousClass3.setMin(this.length, sendMoneyHomeMenuModel.IsOverlapping, sendMoneyHomeMenuModel.IsOverlapping);
            if (!min.isEmpty()) {
                this.ribbonView.setSingleLineRibbon(false);
                this.ribbonView.setRibbonLineBottomText(min);
                return;
            }
            this.ribbonView.setSingleLineRibbon(true);
            return;
        }
        this.ribbonView.setVisibility(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.DrawableRes
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getMax(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1820761141: goto L_0x0034;
                case -1005516787: goto L_0x002a;
                case -276836809: goto L_0x0020;
                case 3016252: goto L_0x0016;
                case 3052376: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "chat"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "bank"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "phonenumber"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "outlet"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 3
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "external"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 4
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == 0) goto L_0x005d
            if (r5 == r4) goto L_0x0059
            if (r5 == r3) goto L_0x0055
            if (r5 == r2) goto L_0x0051
            if (r5 == r1) goto L_0x004d
            r5 = 2131232794(0x7f08081a, float:1.8081707E38)
            return r5
        L_0x004d:
            r5 = 2131232281(0x7f080619, float:1.8080667E38)
            return r5
        L_0x0051:
            r5 = 2131232282(0x7f08061a, float:1.8080669E38)
            return r5
        L_0x0055:
            r5 = 2131232280(0x7f080618, float:1.8080665E38)
            return r5
        L_0x0059:
            r5 = 2131232279(0x7f080617, float:1.8080663E38)
            return r5
        L_0x005d:
            r5 = 2131232283(0x7f08061b, float:1.808067E38)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.adapter.SendMoneyHomeMenuViewHolder.getMax(java.lang.String):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(id.dana.model.SendMoneyHomeMenuModel r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.length
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1820761141: goto L_0x0036;
                case -1005516787: goto L_0x002c;
                case -276836809: goto L_0x0022;
                case 3016252: goto L_0x0018;
                case 3052376: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r0 = "chat"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 2
            goto L_0x0041
        L_0x0018:
            java.lang.String r0 = "bank"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0022:
            java.lang.String r0 = "phonenumber"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 0
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "outlet"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "external"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0040
            r6 = 4
            goto L_0x0041
        L_0x0040:
            r6 = -1
        L_0x0041:
            if (r6 == 0) goto L_0x00a8
            if (r6 == r4) goto L_0x0091
            if (r6 == r3) goto L_0x007a
            if (r6 == r2) goto L_0x0063
            if (r6 == r1) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.clSendMoneyHomeMenu
            android.view.View r0 = r5.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131886511(0x7f1201af, float:1.9407603E38)
            java.lang.CharSequence r0 = r0.getText(r1)
            r6.setContentDescription(r0)
        L_0x0062:
            return
        L_0x0063:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.clSendMoneyHomeMenu
            android.view.View r0 = r5.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131886490(0x7f12019a, float:1.940756E38)
            java.lang.CharSequence r0 = r0.getText(r1)
            r6.setContentDescription(r0)
            return
        L_0x007a:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.clSendMoneyHomeMenu
            android.view.View r0 = r5.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131886488(0x7f120198, float:1.9407556E38)
            java.lang.CharSequence r0 = r0.getText(r1)
            r6.setContentDescription(r0)
            return
        L_0x0091:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.clSendMoneyHomeMenu
            android.view.View r0 = r5.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131886487(0x7f120197, float:1.9407554E38)
            java.lang.CharSequence r0 = r0.getText(r1)
            r6.setContentDescription(r0)
            return
        L_0x00a8:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.clSendMoneyHomeMenu
            android.view.View r0 = r5.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131886489(0x7f120199, float:1.9407558E38)
            java.lang.CharSequence r0 = r0.getText(r1)
            r6.setContentDescription(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.adapter.SendMoneyHomeMenuViewHolder.setMin(id.dana.model.SendMoneyHomeMenuModel):void");
    }

    public final void setMin(String str, String str2) {
        int length = CornerMarkingDataProvider.AnonymousClass3.length(this.length, str2);
        doDismissWithAnimation dodismisswithanimation = this.getMin;
        Context context = this.length;
        ImageView imageView = this.ivSendMoney;
        setOnMenuWindowDismissListener.length length2 = new setOnMenuWindowDismissListener.length();
        length2.length = isLineVisible.getMax();
        length2.getMin = getMax(str);
        dodismisswithanimation.getMax(context, imageView, str2, length, length2);
    }

    public static /* synthetic */ void getMax(SendMoneyHomeMenuViewHolder sendMoneyHomeMenuViewHolder, SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        setMin setmin = sendMoneyHomeMenuViewHolder.getMax;
        if (setmin != null) {
            setmin.length(sendMoneyHomeMenuModel);
        }
    }
}
