package o;

import javax.inject.Singleton;

@Singleton
public class getTemplateVersion {
    public onWriteValue transform(getTabBarObject gettabbarobject) {
        onWriteValue onwritevalue;
        if (gettabbarobject != null) {
            onwritevalue = new onWriteValue();
            onwritevalue.setErrorCode(gettabbarobject.errorCode);
            onwritevalue.setSuccess(gettabbarobject.success);
        } else {
            onwritevalue = null;
        }
        uncheckAllItems.transform(onwritevalue, gettabbarobject);
        return onwritevalue;
    }
}
