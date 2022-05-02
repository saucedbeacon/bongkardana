package o;

import android.database.Cursor;
import android.widget.Filter;

final class onNightModeChanged extends Filter {
    setMax getMin;

    interface setMax {
        CharSequence getMin(Cursor cursor);

        Cursor length();

        Cursor length(CharSequence charSequence);

        void setMin(Cursor cursor);
    }

    onNightModeChanged(setMax setmax) {
        this.getMin = setmax;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.getMin.getMin((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor length = this.getMin.length(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (length != null) {
            filterResults.count = length.getCount();
            filterResults.values = length;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor length = this.getMin.length();
        if (filterResults.values != null && filterResults.values != length) {
            this.getMin.setMin((Cursor) filterResults.values);
        }
    }
}
