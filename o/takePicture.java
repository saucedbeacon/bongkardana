package o;

import id.dana.richview.calculator.OperandType;

public interface takePicture {
    void onClearAll();

    void onClearByCharacter();

    void onOperatorClicked(@OperandType String str);

    void onPadClicked(String str);
}
