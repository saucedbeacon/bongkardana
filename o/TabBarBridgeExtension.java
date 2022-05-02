package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import id.dana.lib.drawbitmap.invoice.BaseInvoiceView;
import id.dana.lib.drawbitmap.style.font.FontTypeVariant;
import id.dana.lib.drawbitmap.style.typeface.TypeFaceVariant;
import id.dana.lib.electronicmoney.bri.model.ReversalResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

public class TabBarBridgeExtension implements BaseInvoiceView {
    private float bgHeight;
    private applyUpdate brush;
    private Canvas canvas;
    private Context context;
    private int firstY;
    private int lastY;
    private Paint paint = new Paint();
    private List<registerUpdateManager> priceDetailEntity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lid/dana/lib/electronicmoney/bri/BrizziCallback;", "", "needReversal", "", "reversalResult", "Lid/dana/lib/electronicmoney/bri/model/ReversalResult;", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: o.TabBarBridgeExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void needReversal(@NotNull ReversalResult reversalResult);
    }

    /* renamed from: o.TabBarBridgeExtension$1  reason: invalid class name */
    public class AnonymousClass1 {
        private TitleBarBridgeExtension fontTypeFactory;
        private int multiplier;
        private Paint paint;

        public AnonymousClass1(@NonNull Context context) {
            this.paint = new Paint();
            this.multiplier = 1;
            this.fontTypeFactory = new TitleBarBridgeExtension(context);
        }

        public AnonymousClass1(@NonNull Context context, int i) {
            this.paint = new Paint();
            this.multiplier = i;
            this.fontTypeFactory = new TitleBarBridgeExtension(context);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Paint getTypeface(java.lang.String r2) {
            /*
                r1 = this;
                int r0 = r2.hashCode()
                switch(r0) {
                    case -2106237344: goto L_0x0064;
                    case -1815860549: goto L_0x005a;
                    case -1405172766: goto L_0x0050;
                    case -1229340018: goto L_0x0046;
                    case -1104338708: goto L_0x003c;
                    case -995050629: goto L_0x0032;
                    case -846135185: goto L_0x0028;
                    case -704108188: goto L_0x001d;
                    case 417519022: goto L_0x0013;
                    case 1669760121: goto L_0x0009;
                    default: goto L_0x0007;
                }
            L_0x0007:
                goto L_0x006f
            L_0x0009:
                java.lang.String r0 = "title14-normal"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 7
                goto L_0x0070
            L_0x0013:
                java.lang.String r0 = "caption12-secondary"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 4
                goto L_0x0070
            L_0x001d:
                java.lang.String r0 = "title16-highlight"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 8
                goto L_0x0070
            L_0x0028:
                java.lang.String r0 = "body14-normal"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 1
                goto L_0x0070
            L_0x0032:
                java.lang.String r0 = "caption12-inverted"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 3
                goto L_0x0070
            L_0x003c:
                java.lang.String r0 = "body14-secondary"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 2
                goto L_0x0070
            L_0x0046:
                java.lang.String r0 = "body14-active"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 0
                goto L_0x0070
            L_0x0050:
                java.lang.String r0 = "title14-highlight"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 6
                goto L_0x0070
            L_0x005a:
                java.lang.String r0 = "title12-normal"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 5
                goto L_0x0070
            L_0x0064:
                java.lang.String r0 = "title12-highlight"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x006f
                r2 = 9
                goto L_0x0070
            L_0x006f:
                r2 = -1
            L_0x0070:
                switch(r2) {
                    case 0: goto L_0x00a2;
                    case 1: goto L_0x009d;
                    case 2: goto L_0x0098;
                    case 3: goto L_0x0093;
                    case 4: goto L_0x008e;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0084;
                    case 7: goto L_0x007f;
                    case 8: goto L_0x007a;
                    case 9: goto L_0x0075;
                    default: goto L_0x0073;
                }
            L_0x0073:
                r2 = 0
                return r2
            L_0x0075:
                android.graphics.Paint r2 = r1.toTitle22Highlight()
                return r2
            L_0x007a:
                android.graphics.Paint r2 = r1.toTitle16Highlight()
                return r2
            L_0x007f:
                android.graphics.Paint r2 = r1.toTitle14Normal()
                return r2
            L_0x0084:
                android.graphics.Paint r2 = r1.toTitle14Highlight()
                return r2
            L_0x0089:
                android.graphics.Paint r2 = r1.toTitle12Normal()
                return r2
            L_0x008e:
                android.graphics.Paint r2 = r1.toCaption12Secondary()
                return r2
            L_0x0093:
                android.graphics.Paint r2 = r1.toCaption12Inverted()
                return r2
            L_0x0098:
                android.graphics.Paint r2 = r1.toBody14Secondary()
                return r2
            L_0x009d:
                android.graphics.Paint r2 = r1.toBody14Normal()
                return r2
            L_0x00a2:
                android.graphics.Paint r2 = r1.toBody14Active()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.TabBarBridgeExtension.AnonymousClass1.getTypeface(java.lang.String):android.graphics.Paint");
        }

        private Paint toBody14Active() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#108ee9"));
            this.paint.setTextSize((float) (this.multiplier * 14));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.SF_PRO_REGULAR));
            return this.paint;
        }

        private Paint toBody14Normal() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#313131"));
            this.paint.setTextSize((float) (this.multiplier * 14));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.SF_PRO_REGULAR));
            return this.paint;
        }

        private Paint toBody14Secondary() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#727272"));
            this.paint.setTextSize((float) (this.multiplier * 14));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.SF_PRO_REGULAR));
            return this.paint;
        }

        private Paint toCaption12Inverted() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#ffffff"));
            this.paint.setTextSize((float) (this.multiplier * 12));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.SF_PRO_REGULAR));
            return this.paint;
        }

        private Paint toCaption12Secondary() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#727272"));
            this.paint.setTextSize((float) (this.multiplier * 12));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.SF_PRO_REGULAR));
            return this.paint;
        }

        private Paint toTitle12Normal() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#000000"));
            this.paint.setTextSize((float) (this.multiplier * 12));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.OPEN_SANS_SEMIBOLD));
            return this.paint;
        }

        private Paint toTitle14Highlight() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#fb8b01"));
            this.paint.setTextSize((float) (this.multiplier * 14));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.OPEN_SANS_SEMIBOLD));
            return this.paint;
        }

        private Paint toTitle14Normal() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#000000"));
            this.paint.setTextSize((float) (this.multiplier * 14));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.OPEN_SANS_SEMIBOLD));
            return this.paint;
        }

        private Paint toTitle16Highlight() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#fb8b01"));
            this.paint.setTextSize((float) (this.multiplier * 16));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.OPEN_SANS_SEMIBOLD));
            return this.paint;
        }

        private Paint toTitle22Highlight() {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor("#fb8b01"));
            this.paint.setTextSize((float) (this.multiplier * 22));
            this.paint.setTypeface(this.fontTypeFactory.getFont(FontTypeVariant.OPEN_SANS_SEMIBOLD));
            return this.paint;
        }

        public Paint getCustomTypeface(int i, String str, String str2) {
            return toCustom(i, str, str2);
        }

        private Paint toCustom(int i, String str, String str2) {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(Color.parseColor(str));
            this.paint.setTextSize((float) (i * this.multiplier));
            this.paint.setTypeface(this.fontTypeFactory.getFont(str2));
            return this.paint;
        }
    }

    public TabBarBridgeExtension(Context context2, List<registerUpdateManager> list) {
        this.priceDetailEntity = list;
        this.context = context2;
    }

    public void constructPriceDetail() {
        List<registerUpdateManager> list = this.priceDetailEntity;
        if (list != null && list.size() > 0) {
            drawBackground();
            drawDashedBgBorder();
            drawData();
        }
    }

    private void drawBackground() {
        this.bgHeight = (float) this.firstY;
        Iterator<registerUpdateManager> it = this.priceDetailEntity.iterator();
        while (it.hasNext()) {
            it.next();
            this.bgHeight += 66.0f;
        }
        this.brush.fill(this.paint, "#f5f5f5");
        this.canvas.drawRect(32.0f, (float) this.firstY, 718.0f, this.bgHeight, this.paint);
    }

    private void drawDashedBgBorder() {
        this.brush.strokeDash(this.paint, "#e3e3e3", 2.0f);
        Path path = new Path();
        path.moveTo(32.0f, (float) this.firstY);
        path.lineTo(718.0f, (float) this.firstY);
        this.canvas.drawPath(path, this.paint);
    }

    private void drawData() {
        float f = (float) (this.firstY + 52);
        for (registerUpdateManager next : this.priceDetailEntity) {
            float f2 = f;
            this.brush.text(next.getTitle(), 66.0f, f2, TypeFaceVariant.BODY_14_NORMAL, Paint.Align.LEFT);
            this.brush.text(amountOperator(next), 688.0f, f2, amountTypeVariant(next), Paint.Align.RIGHT);
            f += 52.0f;
        }
    }

    private String amountOperator(registerUpdateManager registerupdatemanager) {
        if (!"deduction".equals(registerupdatemanager.getType())) {
            return registerupdatemanager.getAmount();
        }
        StringBuilder sb = new StringBuilder("-");
        sb.append(registerupdatemanager.getAmount());
        return sb.toString();
    }

    private String amountTypeVariant(registerUpdateManager registerupdatemanager) {
        return "addition".equals(registerupdatemanager.getType()) ? TypeFaceVariant.TITLE_14_NORMAL : TypeFaceVariant.TITLE_14_HIGHLIGHT;
    }

    public int getLastY() {
        return this.lastY;
    }

    public void setFirstY(int i) {
        int i2 = i + 24;
        this.firstY = i2;
        calculateHeight(i2);
    }

    public void calculateHeight(int i) {
        this.lastY = i;
        List<registerUpdateManager> list = this.priceDetailEntity;
        if (list != null) {
            Iterator<registerUpdateManager> it = list.iterator();
            while (it.hasNext()) {
                it.next();
                this.lastY = (int) (((float) this.lastY) + 66.0f);
            }
        }
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.brush = new applyUpdate(this.context, canvas2);
    }
}
