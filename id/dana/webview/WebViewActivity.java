package id.dana.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseWebViewActivity;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class WebViewActivity extends BaseWebViewActivity {
    public static final String CONTENT = "CONTENT";

    public static Intent ContentBuilder(Context context, String str, String str2) {
        Content content = new Content(str, str2);
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra(CONTENT, content);
        return intent;
    }

    public void configToolbar() {
        setMenuRightButton(getString(R.string.menu_done));
    }

    public void init() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1157473539, oncanceled);
            onCancelLoad.getMin(-1157473539, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1157473539, oncanceled2);
            onCancelLoad.getMin(-1157473539, oncanceled2);
        }
        Content content = (Content) getIntent().getParcelableExtra(CONTENT);
        if (content != null) {
            setTitle(content.getMin);
            load(content.setMax);
        }
    }

    public void onClickRightMenuButton(View view) {
        onBackPressed();
    }

    static class Content implements Parcelable {
        public static final Parcelable.Creator<Content> CREATOR = new Parcelable.Creator<Content>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Content[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Content(parcel);
            }
        };
        String getMin;
        String setMax;

        public int describeContents() {
            return 0;
        }

        Content(String str, String str2) {
            this.getMin = str;
            this.setMax = str2;
        }

        protected Content(Parcel parcel) {
            this.getMin = parcel.readString();
            this.setMax = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.getMin);
            parcel.writeString(this.setMax);
        }
    }
}
