package com.alibaba.griver.image.photo.meta;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.framework.meta.Size;
import com.alibaba.griver.image.photo.adapter.GridAdapter;
import com.alibaba.griver.image.photo.utils.ImageHelper;
import com.alibaba.griver.image.photo.utils.PhotoUtil;

public class PhotoGrid extends SquareGrid implements View.OnClickListener {
    public static final String TAG = "PhotoGrid";
    private static Size m;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f10498a;
    private GridAdapter.OnGridListener b;
    private int c;
    private PhotoItem d;
    private boolean e;
    private View f;
    private CheckBox g;
    /* access modifiers changed from: private */
    public TextView h;
    private ImageView i;
    private RelativeLayout j;
    private ImageView k;
    private TextView l;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f10499o;
    private String p;
    private boolean q;

    public PhotoGrid(Context context) {
        this(context, (AttributeSet) null);
        a(context);
    }

    private void a(Context context) {
        this.n = context.getString(R.string.griver_image_checkbox_selected);
        this.f10499o = context.getString(R.string.griver_image_checkbox_unSelected);
        this.p = context.getString(R.string.griver_image_str_photo_desc);
    }

    public void setDefaultDrawable(Drawable drawable) {
        this.f10498a = drawable;
    }

    public PhotoGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        if (m == null) {
            m = PhotoUtil.reorderSize(PhotoUtil.dp2px(getContext(), 125));
        }
        a(context);
    }

    public void setPhotoInfo(PhotoItem photoItem, int i2) {
        this.c = i2;
        PhotoItem photoItem2 = this.d;
        if (photoItem2 == null || photoItem != photoItem2) {
            this.d = photoItem;
            updateGrid();
            if (this.d.takePhoto) {
                this.i.setContentDescription("");
            } else if (b(photoItem)) {
                a(photoItem, i2, true);
            } else {
                a(photoItem);
                a(photoItem, i2, false);
            }
        }
    }

    private void a(PhotoItem photoItem, int i2, boolean z) {
        String a2 = a(i2 + 1, photoItem, this.j.getVisibility() == 0 ? this.g.isChecked() ? this.n : this.f10499o : "", z);
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(", ");
            sb.append(this.l.getText());
            a2 = sb.toString();
        }
        this.i.setContentDescription(a2);
    }

    private String a(int i2, PhotoItem photoItem, String str, boolean z) {
        if (z) {
            return "";
        }
        try {
            String str2 = this.p;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = TextUtils.isEmpty(photoItem.modifyTimeDesc) ? ", " : photoItem.modifyTimeDesc;
            objArr[2] = str;
            return String.format(str2, objArr);
        } catch (Exception unused) {
            return "";
        }
    }

    private void a(PhotoItem photoItem) {
        if (photoItem.getPhoto() != null) {
            this.i.setImageDrawable(photoItem.getPhoto());
        } else if (photoItem.getThumb() != null) {
            this.i.setImageDrawable(photoItem.getThumb());
        } else {
            String photoPath = photoItem.getPhotoPath();
            if (!TextUtils.isEmpty(photoPath)) {
                if (this.f10498a == null) {
                    this.f10498a = getResources().getDrawable(R.drawable.griver_image_default_photo);
                }
                ImageHelper.loadWidthThumbnailPath(this.i, photoPath, this.f10498a, m.getWidth(), m.getWidth(), PhotoUtil.getPhotoSize(photoItem), photoItem.getThumbPath(), photoItem.getMediaId(), photoItem.getIsAlbumMedia());
            }
        }
    }

    private boolean b(PhotoItem photoItem) {
        photoItem.getPhotoPath();
        if (this.d.isVideo()) {
            return true;
        }
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        return false;
    }

    public void setGridListener(GridAdapter.OnGridListener onGridListener) {
        this.b = onGridListener;
    }

    public void setCheckable(boolean z) {
        this.e = z;
    }

    public void setEnableVideoEdit(boolean z) {
        this.q = z;
    }

    public boolean isChecked() {
        return this.g.isChecked();
    }

    public void setChecked(boolean z) {
        setGridCheckStatus(z);
    }

    private void setGridCheckStatus(boolean z) {
        this.g.setChecked(z);
        a(z);
        this.h.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = (TextView) findViewById(R.id.tv_cover);
        View findViewById = findViewById(R.id.ll_camera);
        this.f = findViewById;
        findViewById.setOnClickListener(this);
        this.g = (CheckBox) findViewById(R.id.cb_selected);
        ImageView imageView = (ImageView) findViewById(R.id.iv_photo);
        this.i = imageView;
        imageView.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_select);
        this.j = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.k = (ImageView) findViewById(R.id.cameraIv);
        this.l = (TextView) findViewById(R.id.videoTimeTv);
    }

    public void updateGrid() {
        int i2 = 0;
        int i3 = this.d.takePhoto ? 0 : 8;
        this.f.setVisibility(i3);
        if (i3 == 0) {
            this.f.setTag(0);
        }
        boolean z = this.e && !this.d.takePhoto;
        if (z && this.d.isVideo() && this.q) {
            z = false;
        }
        this.j.setVisibility(z ? 0 : 8);
        if (this.d.takePhoto) {
            i2 = 8;
        }
        this.i.setVisibility(i2);
        setChecked(this.d.getSelected());
        if (!this.d.isVideo()) {
            this.k.setVisibility(8);
            this.l.setVisibility(8);
        }
    }

    public void onClick(View view) {
        GridAdapter.OnGridListener onGridListener;
        if (view.equals(this.j)) {
            setGridCheckStatus(!this.g.isChecked());
            GridAdapter.OnGridListener onGridListener2 = this.b;
            if (onGridListener2 != null) {
                onGridListener2.onGridChecked(this, this.c);
            }
        } else if ((view.equals(this.i) || view.equals(this.f)) && (onGridListener = this.b) != null) {
            onGridListener.onGridClick(this, this.c);
        }
    }

    private void a(boolean z) {
        String str;
        if (z) {
            try {
                str = this.n;
            } catch (Exception unused) {
                RVLogger.w(TAG, "Should not be here");
                return;
            }
        } else {
            str = this.f10499o;
        }
        String str2 = z ? this.f10499o : this.n;
        String str3 = (String) this.i.getContentDescription();
        if (!TextUtils.isEmpty(str3)) {
            this.i.setContentDescription(str3.replace(str2, str));
        }
    }

    public void animateSelection() {
        this.h.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1200);
        this.h.startAnimation(alphaAnimation);
        this.h.postDelayed(new Runnable() {
            public void run() {
                PhotoGrid.this.h.setVisibility(8);
            }
        }, 1000);
    }
}
