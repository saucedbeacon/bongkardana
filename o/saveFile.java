package o;

import android.view.View;
import id.dana.danah5.DanaH5;
import id.dana.pay.screen.AddNewCardFragment;

public final class saveFile implements View.OnClickListener {
    private final AddNewCardFragment length;

    public saveFile(AddNewCardFragment addNewCardFragment) {
        this.length = addNewCardFragment;
    }

    public final void onClick(View view) {
        DanaH5.startContainerFullUrl("https://a.m.dana.id/resource/htmls/info/secure.html");
    }
}
