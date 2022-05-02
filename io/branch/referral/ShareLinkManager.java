package io.branch.referral;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import io.branch.referral.Branch;
import java.util.ArrayList;
import java.util.List;
import o.TinyBlurMenu;

final class ShareLinkManager {
    private static int equals = 100;
    private static int toIntRange = 2;
    private int IsOverlapping = 50;
    final int getMax = 100;
    TinyBlurMenu.TinyPopMenuReceiver getMin;
    private List<String> hashCode = new ArrayList();
    private boolean isInside = false;
    private final int length = Color.argb(60, 17, 4, 56);
    private final int setMax = Color.argb(20, 17, 4, 56);
    final int setMin = 5;
    /* access modifiers changed from: private */
    public Branch.toIntRange toDoubleRange;
    private int toFloatRange = -1;
    private List<String> toString = new ArrayList();

    ShareLinkManager() {
    }

    class MoreShareItem extends ResolveInfo {
        final /* synthetic */ ShareLinkManager setMin;

        public CharSequence loadLabel(PackageManager packageManager) {
            return this.setMin.toDoubleRange.setMin;
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return this.setMin.toDoubleRange.setMax;
        }
    }

    class CopyLinkItem extends ResolveInfo {
        final /* synthetic */ ShareLinkManager getMin;

        public CharSequence loadLabel(PackageManager packageManager) {
            return this.getMin.toDoubleRange.getMax;
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return this.getMin.toDoubleRange.getMin;
        }
    }
}
