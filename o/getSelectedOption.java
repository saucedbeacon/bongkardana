package o;

import javax.inject.Inject;
import o.MultilevelSelectCallBack;

public final class getSelectedOption implements MultilevelSelectCallBack.getMin {
    private final addParam getMax;
    private final decryptBinary getMin = new decryptBinary() {
        public final void onError(Throwable th) {
        }

        public final void onComplete() {
            dispose();
        }
    };
    private final onServicesDiscovered length;

    @Inject
    public getSelectedOption(addParam addparam, onServicesDiscovered onservicesdiscovered) {
        this.getMax = addparam;
        this.length = onservicesdiscovered;
    }

    public final void length() {
        this.getMax.execute(this.getMin);
    }

    public final void setMin() {
        this.length.execute(new decryptBinary() {
            public final void onComplete() {
                dispose();
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e("Error get User Pan in Home Fragment", th.getMessage());
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
