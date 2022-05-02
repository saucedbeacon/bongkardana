package id.dana.richview.calculator.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import id.dana.R;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.drawDividersHorizontal;
import o.notifyProcessPictureError;
import o.takePicture;

public class CalculatorAdapter extends IMultiInstanceInvalidationCallback.Stub<CalculatorViewHolder, notifyProcessPictureError> {
    @DimenRes
    private int getMin;
    private takePicture length;

    public class CalculatorViewHolder_ViewBinding implements Unbinder {
        private CalculatorViewHolder getMax;

        @UiThread
        public CalculatorViewHolder_ViewBinding(CalculatorViewHolder calculatorViewHolder, View view) {
            this.getMax = calculatorViewHolder;
            calculatorViewHolder.ivOperand = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49992131363554, "field 'ivOperand'", ImageView.class);
            calculatorViewHolder.ivOperandNumber = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49982131363553, "field 'ivOperandNumber'", ImageView.class);
            calculatorViewHolder.rlNumberOperand = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58392131364421, "field 'rlNumberOperand'", RelativeLayout.class);
            calculatorViewHolder.rlOperand = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58402131364422, "field 'rlOperand'", RelativeLayout.class);
            calculatorViewHolder.tvNumberLeft = (TextView) drawDividersHorizontal.setMin(view, R.id.f67742131365401, "field 'tvNumberLeft'", TextView.class);
            calculatorViewHolder.tvNumberMiddle = (TextView) drawDividersHorizontal.setMin(view, R.id.f67752131365402, "field 'tvNumberMiddle'", TextView.class);
            calculatorViewHolder.tvNumberRight = (TextView) drawDividersHorizontal.setMin(view, R.id.f67772131365404, "field 'tvNumberRight'", TextView.class);
            calculatorViewHolder.llItemCalculator = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53262131363882, "field 'llItemCalculator'", LinearLayout.class);
        }

        @CallSuper
        public final void setMax() {
            CalculatorViewHolder calculatorViewHolder = this.getMax;
            if (calculatorViewHolder != null) {
                this.getMax = null;
                calculatorViewHolder.ivOperand = null;
                calculatorViewHolder.ivOperandNumber = null;
                calculatorViewHolder.rlNumberOperand = null;
                calculatorViewHolder.rlOperand = null;
                calculatorViewHolder.tvNumberLeft = null;
                calculatorViewHolder.tvNumberMiddle = null;
                calculatorViewHolder.tvNumberRight = null;
                calculatorViewHolder.llItemCalculator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CalculatorAdapter(takePicture takepicture, @DimenRes int i) {
        this.length = takepicture;
        this.getMin = i;
    }

    public static class CalculatorViewHolder extends Ignore<notifyProcessPictureError> {
        private takePicture getMax;
        private Context getMin;
        @BindView(2131363554)
        ImageView ivOperand;
        @BindView(2131363553)
        ImageView ivOperandNumber;
        @BindView(2131363882)
        LinearLayout llItemCalculator;
        @BindView(2131364421)
        RelativeLayout rlNumberOperand;
        @BindView(2131364422)
        RelativeLayout rlOperand;
        private notifyProcessPictureError setMin;
        @BindView(2131365401)
        TextView tvNumberLeft;
        @BindView(2131365402)
        TextView tvNumberMiddle;
        @BindView(2131365404)
        TextView tvNumberRight;

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ce, code lost:
            if (r7.equals(id.dana.richview.calculator.OperandType.PLUS) != false) goto L_0x00dc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void setMax(java.lang.Object r7) {
            /*
                r6 = this;
                o.notifyProcessPictureError r7 = (o.notifyProcessPictureError) r7
                r6.setMin = r7
                android.widget.TextView r0 = r6.tvNumberLeft
                o.notifyTakenPictureError r1 = new o.notifyTakenPictureError
                r2 = 0
                r1.<init>(r6, r2)
                r0.setOnClickListener(r1)
                android.widget.TextView r0 = r6.tvNumberMiddle
                o.notifyTakenPictureError r1 = new o.notifyTakenPictureError
                r3 = 1
                r1.<init>(r6, r3)
                r0.setOnClickListener(r1)
                android.widget.TextView r0 = r6.tvNumberRight
                o.notifyTakenPictureError r1 = new o.notifyTakenPictureError
                r4 = 2
                r1.<init>(r6, r4)
                r0.setOnClickListener(r1)
                android.widget.RelativeLayout r0 = r6.rlOperand
                o.getSaveFile r1 = new o.getSaveFile
                r1.<init>(r6)
                r0.setOnClickListener(r1)
                android.widget.TextView r0 = r6.tvNumberLeft
                java.util.List<java.lang.String> r1 = r7.getMin
                java.lang.Object r1 = r1.get(r2)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.widget.TextView r0 = r6.tvNumberMiddle
                java.util.List<java.lang.String> r1 = r7.getMin
                java.lang.Object r1 = r1.get(r3)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                boolean r0 = r6.setMax()
                r1 = 8
                if (r0 == 0) goto L_0x0091
                android.widget.RelativeLayout r0 = r6.rlOperand
                r0.setVisibility(r2)
                android.widget.RelativeLayout r0 = r6.rlNumberOperand
                r0.setVisibility(r2)
                android.widget.TextView r0 = r6.tvNumberRight
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r6.ivOperandNumber
                android.content.Context r1 = r6.getMin
                r5 = 2131231948(0x7f0804cc, float:1.8079991E38)
                android.graphics.drawable.Drawable r1 = o.IntRange.length((android.content.Context) r1, (int) r5)
                r0.setImageDrawable(r1)
                android.widget.RelativeLayout r0 = r6.rlNumberOperand
                android.content.Context r1 = r6.length
                r5 = 2131886433(0x7f120161, float:1.9407445E38)
                java.lang.String r1 = r1.getString(r5)
                r0.setContentDescription(r1)
                android.widget.RelativeLayout r0 = r6.rlNumberOperand
                o.TakePictureProcessor r1 = new o.TakePictureProcessor
                r1.<init>(r6)
                r0.setOnClickListener(r1)
                android.widget.RelativeLayout r0 = r6.rlNumberOperand
                o.doPictureProcess r1 = new o.doPictureProcess
                r1.<init>(r6)
                r0.setOnLongClickListener(r1)
                goto L_0x00a8
            L_0x0091:
                android.widget.RelativeLayout r0 = r6.rlNumberOperand
                r0.setVisibility(r1)
                android.widget.TextView r0 = r6.tvNumberRight
                r0.setVisibility(r2)
                android.widget.TextView r0 = r6.tvNumberRight
                java.util.List<java.lang.String> r1 = r7.getMin
                java.lang.Object r1 = r1.get(r4)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
            L_0x00a8:
                java.lang.String r7 = r7.length
                r0 = -1
                int r1 = r7.hashCode()
                r5 = 3
                switch(r1) {
                    case -1902665991: goto L_0x00d1;
                    case 2459034: goto L_0x00c8;
                    case 73363536: goto L_0x00be;
                    case 1750165953: goto L_0x00b4;
                    default: goto L_0x00b3;
                }
            L_0x00b3:
                goto L_0x00db
            L_0x00b4:
                java.lang.String r1 = "MULTIPLIER"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L_0x00db
                r2 = 2
                goto L_0x00dc
            L_0x00be:
                java.lang.String r1 = "MINUS"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L_0x00db
                r2 = 3
                goto L_0x00dc
            L_0x00c8:
                java.lang.String r1 = "PLUS"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L_0x00db
                goto L_0x00dc
            L_0x00d1:
                java.lang.String r1 = "DIVIDER"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L_0x00db
                r2 = 1
                goto L_0x00dc
            L_0x00db:
                r2 = -1
            L_0x00dc:
                if (r2 == 0) goto L_0x018a
                if (r2 == r3) goto L_0x015c
                if (r2 == r4) goto L_0x0126
                r7 = 2131231945(0x7f0804c9, float:1.8079985E38)
                if (r2 == r5) goto L_0x00f3
                android.widget.ImageView r0 = r6.ivOperand
                android.content.Context r1 = r6.getMin
                android.graphics.drawable.Drawable r7 = o.IntRange.length((android.content.Context) r1, (int) r7)
                r0.setImageDrawable(r7)
                return
            L_0x00f3:
                android.widget.ImageView r0 = r6.ivOperand
                android.content.Context r1 = r6.getMin
                android.graphics.drawable.Drawable r7 = o.IntRange.length((android.content.Context) r1, (int) r7)
                r0.setImageDrawable(r7)
                android.content.Context r7 = r6.length
                r0 = 2131886420(0x7f120154, float:1.9407418E38)
                java.lang.String r7 = r7.getString(r0)
                android.content.Context r0 = r6.length
                r1 = 2131886421(0x7f120155, float:1.940742E38)
                java.lang.String r0 = r0.getString(r1)
                android.content.Context r1 = r6.length
                r2 = 2131886422(0x7f120156, float:1.9407422E38)
                java.lang.String r1 = r1.getString(r2)
                android.content.Context r2 = r6.length
                r3 = 2131886462(0x7f12017e, float:1.9407504E38)
                java.lang.String r2 = r2.getString(r3)
                r6.length(r7, r0, r1, r2)
                return
            L_0x0126:
                android.widget.ImageView r7 = r6.ivOperand
                android.content.Context r0 = r6.getMin
                r1 = 2131231946(0x7f0804ca, float:1.8079987E38)
                android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
                r7.setImageDrawable(r0)
                android.content.Context r7 = r6.length
                r0 = 2131886417(0x7f120151, float:1.9407412E38)
                java.lang.String r7 = r7.getString(r0)
                android.content.Context r0 = r6.length
                r1 = 2131886418(0x7f120152, float:1.9407414E38)
                java.lang.String r0 = r0.getString(r1)
                android.content.Context r1 = r6.length
                r2 = 2131886419(0x7f120153, float:1.9407416E38)
                java.lang.String r1 = r1.getString(r2)
                android.content.Context r2 = r6.length
                r3 = 2131886464(0x7f120180, float:1.9407508E38)
                java.lang.String r2 = r2.getString(r3)
                r6.length(r7, r0, r1, r2)
                return
            L_0x015c:
                android.widget.ImageView r7 = r6.ivOperand
                android.content.Context r0 = r6.getMin
                r1 = 2131231944(0x7f0804c8, float:1.8079983E38)
                android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
                r7.setImageDrawable(r0)
                android.content.Context r7 = r6.length
                r0 = 2131886415(0x7f12014f, float:1.9407408E38)
                java.lang.String r7 = r7.getString(r0)
                android.content.Context r0 = r6.length
                r1 = 2131886416(0x7f120150, float:1.940741E38)
                java.lang.String r0 = r0.getString(r1)
                r1 = 0
                android.content.Context r2 = r6.length
                r3 = 2131886449(0x7f120171, float:1.9407477E38)
                java.lang.String r2 = r2.getString(r3)
                r6.length(r7, r0, r1, r2)
                return
            L_0x018a:
                android.widget.ImageView r7 = r6.ivOperand
                android.content.Context r0 = r6.getMin
                r1 = 2131231947(0x7f0804cb, float:1.807999E38)
                android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
                r7.setImageDrawable(r0)
                android.content.Context r7 = r6.length
                r0 = 2131886423(0x7f120157, float:1.9407424E38)
                java.lang.String r7 = r7.getString(r0)
                android.content.Context r0 = r6.length
                r1 = 2131886424(0x7f120158, float:1.9407426E38)
                java.lang.String r0 = r0.getString(r1)
                android.content.Context r1 = r6.length
                r2 = 2131886425(0x7f120159, float:1.9407428E38)
                java.lang.String r1 = r1.getString(r2)
                android.content.Context r2 = r6.length
                r3 = 2131886472(0x7f120188, float:1.9407524E38)
                java.lang.String r2 = r2.getString(r3)
                r6.length(r7, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.calculator.adapter.CalculatorAdapter.CalculatorViewHolder.setMax(java.lang.Object):void");
        }

        CalculatorViewHolder(Context context, ViewGroup viewGroup, takePicture takepicture, @DimenRes int i) {
            super(context, R.layout.view_item_calculator, viewGroup);
            this.getMin = context;
            this.getMax = takepicture;
            this.llItemCalculator.setPadding(0, 0, 0, (int) this.length.getResources().getDimension(i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ boolean setMin() {
            this.getMax.onClearAll();
            return true;
        }

        private boolean setMax() {
            return this.setMin.getMin.get(2).equals("99");
        }

        private void length(String str, String str2, String str3, String str4) {
            this.tvNumberLeft.setContentDescription(str);
            this.tvNumberMiddle.setContentDescription(str2);
            this.tvNumberRight.setContentDescription(str3);
            this.rlOperand.setContentDescription(str4);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CalculatorViewHolder(viewGroup.getContext(), viewGroup, this.length, this.getMin);
    }
}
