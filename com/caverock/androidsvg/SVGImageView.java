package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView {
    private static Method setLayerTypeMethod;

    public SVGImageView(Context context) {
        super(context);
        Class<View> cls = View.class;
        try {
            setLayerTypeMethod = cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class});
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Class<View> cls = View.class;
        try {
            setLayerTypeMethod = cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class});
        } catch (NoSuchMethodException unused) {
        }
        init(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Class<View> cls = View.class;
        try {
            setLayerTypeMethod = cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class});
        } catch (NoSuchMethodException unused) {
        }
        init(attributeSet, i);
    }

    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SVGImageView, i, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                if (internalSetImageURI(Uri.parse(string), false)) {
                    obtainStyledAttributes.recycle();
                    return;
                }
                setImageAsset(string);
            }
            obtainStyledAttributes.recycle();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setSVG(SVG svg) {
        if (svg != null) {
            setSoftwareLayerType();
            setImageDrawable(new PictureDrawable(svg.renderToPicture()));
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public void setImageResource(int i) {
        try {
            SVG fromResource = SVG.getFromResource(getContext(), i);
            setSoftwareLayerType();
            setImageDrawable(new PictureDrawable(fromResource.renderToPicture()));
        } catch (SVGParseException e) {
            Integer.valueOf(i);
            e.getMessage();
        }
    }

    public void setImageURI(Uri uri) {
        internalSetImageURI(uri, true);
    }

    public void setImageAsset(String str) {
        try {
            SVG fromAsset = SVG.getFromAsset(getContext().getAssets(), str);
            setSoftwareLayerType();
            setImageDrawable(new PictureDrawable(fromAsset.renderToPicture()));
        } catch (SVGParseException e) {
            e.getMessage();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    private boolean internalSetImageURI(Uri uri, boolean z) {
        InputStream inputStream = null;
        try {
            inputStream = getContext().getContentResolver().openInputStream(uri);
            SVG fromInputStream = SVG.getFromInputStream(inputStream);
            setSoftwareLayerType();
            setImageDrawable(new PictureDrawable(fromInputStream.renderToPicture()));
            if (inputStream == null) {
                return true;
            }
            try {
                inputStream.close();
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (FileNotFoundException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (SVGParseException e) {
            e.getMessage();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private void setSoftwareLayerType() {
        if (setLayerTypeMethod != null) {
            try {
                int i = View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()));
                setLayerTypeMethod.invoke(this, new Object[]{Integer.valueOf(i), null});
            } catch (Exception unused) {
            }
        }
    }
}
