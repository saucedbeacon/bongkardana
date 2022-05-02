package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public class toJavaScript extends ClickableSpan {
    private Context setMax;
    private Intent setMin;

    public toJavaScript(Context context, Intent intent) {
        this.setMax = context;
        this.setMin = intent;
    }

    public void onClick(View view) {
        this.setMax.startActivity(this.setMin);
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
