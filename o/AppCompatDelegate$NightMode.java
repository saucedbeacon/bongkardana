package o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import com.j256.ormlite.field.FieldType;
import o.onNightModeChanged;

public abstract class AppCompatDelegate$NightMode extends BaseAdapter implements Filterable, onNightModeChanged.setMax {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected onNightModeChanged IsOverlapping;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected DataSetObserver equals;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Cursor getMax = null;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Context getMin;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int isInside;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean length = true;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean setMin = false;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected getMin toFloatRange;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected FilterQueryProvider toIntRange;

    public abstract void getMax(View view, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public abstract View setMax(Context context, Cursor cursor, ViewGroup viewGroup);

    public AppCompatDelegate$NightMode(Context context) {
        this.getMin = context;
        this.isInside = -1;
        this.toFloatRange = new getMin();
        this.equals = new setMin();
    }

    public final Cursor length() {
        return this.getMax;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.setMin || (cursor = this.getMax) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.setMin || (cursor = this.getMax) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.getMax;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.setMin || (cursor = this.getMax) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.getMax.getLong(this.isInside);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.setMin) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.getMax.moveToPosition(i)) {
            if (view == null) {
                view = setMax(this.getMin, this.getMax, viewGroup);
            }
            getMax(view, this.getMax);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(i)));
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.setMin) {
            return null;
        }
        this.getMax.moveToPosition(i);
        if (view == null) {
            view = getMin(this.getMin, this.getMax, viewGroup);
        }
        getMax(view, this.getMax);
        return view;
    }

    public View getMin(Context context, Cursor cursor, ViewGroup viewGroup) {
        return setMax(context, cursor, viewGroup);
    }

    public CharSequence getMin(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor length(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.toIntRange;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.getMax;
    }

    public Filter getFilter() {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new onNightModeChanged(this);
        }
        return this.IsOverlapping;
    }

    /* access modifiers changed from: protected */
    public final void setMax() {
        Cursor cursor;
        if (this.length && (cursor = this.getMax) != null && !cursor.isClosed()) {
            this.setMin = this.getMax.requery();
        }
    }

    class getMin extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        getMin() {
            super(new Handler());
        }

        public final void onChange(boolean z) {
            AppCompatDelegate$NightMode.this.setMax();
        }
    }

    class setMin extends DataSetObserver {
        setMin() {
        }

        public final void onChanged() {
            AppCompatDelegate$NightMode.this.setMin = true;
            AppCompatDelegate$NightMode.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            AppCompatDelegate$NightMode.this.setMin = false;
            AppCompatDelegate$NightMode.this.notifyDataSetInvalidated();
        }
    }

    public void setMin(Cursor cursor) {
        Cursor cursor2 = this.getMax;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                getMin getmin = this.toFloatRange;
                if (getmin != null) {
                    cursor2.unregisterContentObserver(getmin);
                }
                DataSetObserver dataSetObserver = this.equals;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.getMax = cursor;
            if (cursor != null) {
                getMin getmin2 = this.toFloatRange;
                if (getmin2 != null) {
                    cursor.registerContentObserver(getmin2);
                }
                DataSetObserver dataSetObserver2 = this.equals;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.isInside = cursor.getColumnIndexOrThrow(FieldType.FOREIGN_ID_FIELD_SUFFIX);
                this.setMin = true;
                notifyDataSetChanged();
            } else {
                this.isInside = -1;
                this.setMin = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
