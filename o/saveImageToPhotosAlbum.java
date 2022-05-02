package o;

import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;

public final class saveImageToPhotosAlbum extends setSpeed<List<RecentBankModel>, List<RecipientViewModel>> {
    public boolean getMax;

    public final /* synthetic */ Object map(Object obj) {
        List<RecentBankModel> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (RecentBankModel recentBankModel : list) {
            int size = list.size();
            RecipientViewModel recipientViewModel = null;
            if (recentBankModel != null) {
                recipientViewModel = new RecipientViewModel(recentBankModel.toDoubleRange == 3 ? size == 4 ? 13 : 14 : 2);
                if (this.getMax) {
                    recipientViewModel = new RecipientViewModel(24);
                }
                recipientViewModel.getMax = recentBankModel.getMin;
                recipientViewModel.getMax(recentBankModel.equals);
                recipientViewModel.getMin = recentBankModel.Mean$Arithmetic;
                recipientViewModel.setMin = recentBankModel.Grayscale$Algorithm;
                recipientViewModel.isInside = recentBankModel.getMax;
                recipientViewModel.IsOverlapping = recentBankModel.setMax;
                recipientViewModel.equals = recentBankModel.isInside;
                recipientViewModel.setMax = recentBankModel.valueOf.longValue();
                recipientViewModel.length = recentBankModel.setMin;
                recipientViewModel.toIntRange = recentBankModel.toFloatRange;
                recipientViewModel.toFloatRange = recentBankModel.IsOverlapping;
                recipientViewModel.length(recentBankModel.length);
                recipientViewModel.setMax(recentBankModel.toString);
                recipientViewModel.FastBitmap$CoordinateSystem = recentBankModel.FastBitmap$CoordinateSystem;
                recipientViewModel.hashCode = recentBankModel.getMin();
            }
            arrayList.add(recipientViewModel);
        }
        return arrayList;
    }
}
