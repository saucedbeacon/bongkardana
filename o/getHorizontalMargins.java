package o;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.xco.widget.BCAXCOModule;
import com.bca.xco.widget.comp.XEditText;
import o.getChildVerticalGravity;

public class getHorizontalMargins extends Fragment {
    public XEditText getMax;
    private TextView getMin;
    public XEditText length;
    public Context setMax;
    public BCAXCOModule setMin;
    /* access modifiers changed from: private */
    public setPaddingRight toIntRange;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        getActivity().getWindow().setSoftInputMode(48);
        getActivity().getWindow().setSoftInputMode(48);
        View inflate = layoutInflater.inflate(getChildVerticalGravity.setMin.xco_fragment_screen_registrasi, viewGroup, false);
        this.setMax = inflate.getContext();
        this.toIntRange = new setPaddingRight();
        XEditText xEditText = (XEditText) inflate.findViewById(getChildVerticalGravity.setMax.hashCode);
        this.getMax = xEditText;
        xEditText.addTextChangedListener(new removeChildrenForExpandedActionView(xEditText));
        XEditText xEditText2 = (XEditText) inflate.findViewById(getChildVerticalGravity.setMax.toString);
        this.length = xEditText2;
        xEditText2.addTextChangedListener(new getVerticalMargins(xEditText2));
        Resources resources = getResources();
        Context context = this.setMax;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, setPaddingRight.getMin(context, (float) context.getResources().getDimensionPixelSize(getChildVerticalGravity.getMax.getMax)));
        this.setMax.getResources().getDrawable(getChildVerticalGravity.length.xco_ic_cancel);
        this.length.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        int compoundPaddingRight = this.length.getCompoundPaddingRight();
        ImageView imageView = (ImageView) inflate.findViewById(getChildVerticalGravity.setMax.IsOverlapping);
        imageView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                getHorizontalMargins.this.setMin.h();
            }
        });
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.setMargins(0, 0, compoundPaddingRight + 2, 0);
        imageView.setLayoutParams(layoutParams);
        this.getMin = (TextView) inflate.findViewById(getChildVerticalGravity.setMax.valueOf);
        Spanned fromHtml = Html.fromHtml(inflate.getContext().getString(getChildVerticalGravity.IsOverlapping.xco_help));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    setPaddingRight unused = getHorizontalMargins.this.toIntRange;
                    setPaddingRight.setMax(getHorizontalMargins.this.setMax);
                    getHorizontalMargins.this.setMin.b(5);
                    getHorizontalMargins.this.setMin.i();
                }
            }, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        this.getMin.setText(spannableStringBuilder);
        this.getMin.setMovementMethod(LinkMovementMethod.getInstance());
        this.getMin.setLinkTextColor(this.setMax.getResources().getColor(getChildVerticalGravity.getMin.setMax));
        XEditText xEditText3 = this.getMax;
        xEditText3.setTypeface(setPaddingRight.setMin(xEditText3.getContext()));
        XEditText xEditText4 = this.length;
        xEditText4.setTypeface(setPaddingRight.setMin(xEditText4.getContext()));
        TextView textView = this.getMin;
        textView.setTypeface(setPaddingRight.setMin(textView.getContext()));
        setPaddingRight setpaddingright = this.toIntRange;
        XEditText xEditText5 = this.getMax;
        xEditText5.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        xEditText5.setLongClickable(false);
        setPaddingRight setpaddingright2 = this.toIntRange;
        XEditText xEditText6 = this.length;
        xEditText6.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        xEditText6.setLongClickable(false);
        return inflate;
    }

    public final boolean getMax() {
        this.getMax.getText();
        String replace = this.length.getText().toString().replace(".", "");
        if (setPaddingRight.setMax((EditText) this.getMax)) {
            this.setMin.c(this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_err_card_01));
            return false;
        } else if (this.getMax.getText().length() < 19) {
            this.setMin.c(this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_err_card_01));
            return false;
        } else if (setPaddingRight.setMax((EditText) this.length)) {
            this.setMin.c(this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_err_limit_01));
            return false;
        } else if (setPaddingRight.setMax(replace)) {
            this.setMin.c(this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_must_number));
            return false;
        } else if (Double.parseDouble(replace) > 0.0d) {
            return true;
        } else {
            this.setMin.c(this.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_err_limit_02));
            return false;
        }
    }
}
