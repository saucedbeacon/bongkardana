package o;

import org.yaml.snakeyaml.tokens.Token;

public interface takeDownCrashReport {
    boolean getMax(Token.ID... idArr);

    Token getMin();

    Token length();
}
