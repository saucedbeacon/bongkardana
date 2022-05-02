package o;

import id.dana.contract.payqr.AddNewCardModule;
import id.dana.contract.payqr.GetPaymentResultModule;
import java.util.List;
import o.FragmentStateAdapter$5;
import o.b;
import o.enableLayers;

final class ViewPager implements RedDotManager {
    private final updateAdapter setMin;

    public ViewPager(updateAdapter updateadapter) {
        this.setMin = updateadapter;
    }

    public final void accept(Object obj) {
        updateAdapter.getMax(this.setMin, (List) obj);
    }

    public final class SavedState implements getAdapterPosition<FragmentStateAdapter$5.getMax> {
        private final GetPaymentResultModule setMax;

        private SavedState(GetPaymentResultModule getPaymentResultModule) {
            this.setMax = getPaymentResultModule;
        }

        public static SavedState setMin(GetPaymentResultModule getPaymentResultModule) {
            return new SavedState(getPaymentResultModule);
        }

        public final /* synthetic */ Object get() {
            FragmentStateAdapter$5.getMax length = this.setMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class LayoutParams implements getAdapterPosition<enableLayers.getMin> {
        private final AddNewCardModule getMin;

        private LayoutParams(AddNewCardModule addNewCardModule) {
            this.getMin = addNewCardModule;
        }

        public static LayoutParams getMax(AddNewCardModule addNewCardModule) {
            return new LayoutParams(addNewCardModule);
        }

        public final /* synthetic */ Object get() {
            enableLayers.getMin min = this.getMin.setMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class DecorView implements getAdapterPosition<FragmentStateAdapter$5.setMin> {
        private final GetPaymentResultModule length;
        private final b.C0007b<snapToPage> setMax;

        private DecorView(GetPaymentResultModule getPaymentResultModule, b.C0007b<snapToPage> bVar) {
            this.length = getPaymentResultModule;
            this.setMax = bVar;
        }

        public static DecorView getMax(GetPaymentResultModule getPaymentResultModule, b.C0007b<snapToPage> bVar) {
            return new DecorView(getPaymentResultModule, bVar);
        }

        public final /* synthetic */ Object get() {
            FragmentStateAdapter$5.setMin min = this.length.getMin(this.setMax.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
