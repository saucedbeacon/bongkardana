package o;

import org.yaml.snakeyaml.error.YAMLException;

public final class setColorNoTranslucent {
    setbEva yaml = new setbEva();

    public final <T> T parse(String str) {
        try {
            return this.yaml.length(new addAutoLogActivity(str), Object.class);
        } catch (YAMLException e) {
            StringBuilder sb = new StringBuilder("Error parsing yaml file: ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
            return null;
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unknown error while parsing yaml file: ");
            sb2.append(e2.getLocalizedMessage());
            createLoadingDialog.e(sb2.toString());
            return null;
        }
    }
}
