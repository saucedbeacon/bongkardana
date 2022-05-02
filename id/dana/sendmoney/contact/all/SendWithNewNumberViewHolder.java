package id.dana.sendmoney.contact.all;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import o.Ignore;
import o.isEmptyOrNullStr;
import o.setPhotoIndex;

public class SendWithNewNumberViewHolder extends Ignore<RecipientViewModel> {
    private final setPhotoIndex setMax;
    @BindView(2131365442)
    TextView tvPhoneNumber;

    public final /* synthetic */ void setMax(Object obj) {
        this.tvPhoneNumber.setText(((RecipientViewModel) obj).isInside);
    }

    public SendWithNewNumberViewHolder(ViewGroup viewGroup, setPhotoIndex setphotoindex) {
        super(viewGroup.getContext(), R.layout.item_send_new_number, viewGroup);
        this.setMax = setphotoindex;
    }

    public final void setMin(Ignore.setMin setmin) {
        super.setMin(setmin);
        this.itemView.setOnClickListener(new isEmptyOrNullStr(this));
    }

    public static /* synthetic */ void setMax(SendWithNewNumberViewHolder sendWithNewNumberViewHolder) {
        RecipientModel.length length = new RecipientModel.length("contact");
        length.FastBitmap$CoordinateSystem = "phonenumber";
        length.toFloatRange = sendWithNewNumberViewHolder.tvPhoneNumber.getText().toString();
        length.toIntRange = sendWithNewNumberViewHolder.tvPhoneNumber.getText().toString();
        length.setMax = RecipientSource.MANUAL_INPUT;
        sendWithNewNumberViewHolder.setMax.onRecipientSelected(length.length());
    }
}
