package o;

import android.widget.LinearLayout;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public class getScreenSize {
    public TextView getMax;
    public TextView length;
    public CircleImageView setMax;
    public LinearLayout setMin;

    public getScreenSize(LinearLayout linearLayout, TextView textView, TextView textView2, CircleImageView circleImageView) {
        this.setMin = linearLayout;
        this.getMax = textView;
        this.length = textView2;
        this.setMax = circleImageView;
    }
}
