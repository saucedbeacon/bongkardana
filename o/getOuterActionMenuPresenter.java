package o;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import o.getChildVerticalGravity;

public final class getOuterActionMenuPresenter extends Dialog {
    private Context length;
    private LayoutInflater setMax;
    private setPaddingRight setMin = new setPaddingRight();

    public getOuterActionMenuPresenter(Context context) {
        super(context);
        this.setMax = LayoutInflater.from(context);
        this.length = context;
        requestWindowFeature(1);
        setContentView(getChildVerticalGravity.setMin.xco_dialog_info);
        setCanceledOnTouchOutside(false);
        Button button = (Button) findViewById(getChildVerticalGravity.setMax.setMin);
        TextView textView = (TextView) findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm);
        button.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                getOuterActionMenuPresenter.this.dismiss();
            }
        });
        textView.setTypeface(setPaddingRight.setMin(textView.getContext()));
        button.setTypeface(setPaddingRight.setMin(button.getContext()));
    }
}
