package o;

import androidx.activity.result.ActivityResult;
import o.IPostMessageService;
import o.TinyAppActionState;

final class getIconUnicode implements IPostMessageService.Default {
    private final TinyAppActionState.getMax setMin;

    public getIconUnicode(TinyAppActionState.getMax getmax) {
        this.setMin = getmax;
    }

    public final void onActivityResult(Object obj) {
        this.setMin.getMax.getMax((ActivityResult) obj);
    }
}
