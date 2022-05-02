package o;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import id.dana.lib.drawbitmap.invoice.BaseInvoiceView;
import id.dana.lib.drawbitmap.style.typeface.TypeFaceVariant;
import o.ActionSheetRecyclerAdapter;

public class GetAppInfoBridgeExtension implements BaseInvoiceView {
    private applyUpdate brush;
    private Canvas canvas;
    private Context context;
    private int firstY;
    private fetchAppInfoListByKeyword headerEntity;
    private int lastY;
    private Paint paint = new Paint();

    public GetAppInfoBridgeExtension(Context context2, fetchAppInfoListByKeyword fetchappinfolistbykeyword) {
        this.context = context2;
        this.headerEntity = fetchappinfolistbykeyword;
    }

    public void constructHeader() {
        drawIcon();
        drawAmount();
        drawDescription();
        drawTimestamp();
    }

    private void drawIcon() {
        this.canvas.drawBitmap(BitmapFactory.decodeResource(this.context.getResources(), ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.success), (Rect) null, new Rect(331, this.firstY, 419, WheelView.DIVIDER_ALPHA), this.paint);
    }

    private void drawAmount() {
        this.brush.text(this.headerEntity.getAmount(), 375.0f, 274.0f, TypeFaceVariant.TITLE_22_HIGHLIGHT, Paint.Align.CENTER);
    }

    private void drawDescription() {
        this.brush.text(this.headerEntity.getDesc(), 375.0f, 320.0f, TypeFaceVariant.BODY_14_NORMAL, Paint.Align.CENTER);
    }

    private void drawTimestamp() {
        applyUpdate applyupdate = this.brush;
        StringBuilder sb = new StringBuilder();
        sb.append(this.headerEntity.getDate());
        sb.append(" • ");
        sb.append(this.headerEntity.getTime());
        applyupdate.text(sb.toString(), 375.0f, 364.0f, TypeFaceVariant.CAPTION_12_SECONDARY, Paint.Align.CENTER);
    }

    public int getLastY() {
        return this.lastY;
    }

    public void setFirstY(int i) {
        this.firstY = i;
        calculateHeight(i);
    }

    public void calculateHeight(int i) {
        this.lastY = 388;
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.brush = new applyUpdate(this.context, canvas2);
    }
}
