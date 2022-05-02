package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

class getRatingType extends Resources {
    private final Resources getMax;

    public getRatingType(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.getMax = resources;
    }

    public CharSequence getText(int i) throws Resources.NotFoundException {
        return this.getMax.getText(i);
    }

    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return this.getMax.getQuantityText(i, i2);
    }

    public String getString(int i) throws Resources.NotFoundException {
        return this.getMax.getString(i);
    }

    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return this.getMax.getString(i, objArr);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.getMax.getQuantityString(i, i2, objArr);
    }

    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return this.getMax.getQuantityString(i, i2);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.getMax.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return this.getMax.getTextArray(i);
    }

    public String[] getStringArray(int i) throws Resources.NotFoundException {
        return this.getMax.getStringArray(i);
    }

    public int[] getIntArray(int i) throws Resources.NotFoundException {
        return this.getMax.getIntArray(i);
    }

    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return this.getMax.obtainTypedArray(i);
    }

    public float getDimension(int i) throws Resources.NotFoundException {
        return this.getMax.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.getMax.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.getMax.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.getMax.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.getMax.getDrawable(i);
    }

    @RequiresApi(21)
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.getMax.getDrawable(i, theme);
    }

    @RequiresApi(15)
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return this.getMax.getDrawableForDensity(i, i2);
    }

    @RequiresApi(21)
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.getMax.getDrawableForDensity(i, i2, theme);
    }

    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.getMax.getMovie(i);
    }

    public int getColor(int i) throws Resources.NotFoundException {
        return this.getMax.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return this.getMax.getColorStateList(i);
    }

    public boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.getMax.getBoolean(i);
    }

    public int getInteger(int i) throws Resources.NotFoundException {
        return this.getMax.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return this.getMax.getLayout(i);
    }

    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return this.getMax.getAnimation(i);
    }

    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return this.getMax.getXml(i);
    }

    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        return this.getMax.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return this.getMax.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.getMax.openRawResourceFd(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.getMax.getValue(i, typedValue, z);
    }

    @RequiresApi(15)
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.getMax.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.getMax.getValue(str, typedValue, z);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.getMax.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.getMax;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.getMax.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.getMax.getConfiguration();
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.getMax.getIdentifier(str, str2, str3);
    }

    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.getMax.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.getMax.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.getMax.getResourceTypeName(i);
    }

    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.getMax.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.getMax.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.getMax.parseBundleExtra(str, attributeSet, bundle);
    }
}
