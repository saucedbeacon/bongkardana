package o;

public final class IDataCollectionComponent {
    private final String _bucketingKey;
    private final String _matchingKey;

    @Deprecated
    public static IDataCollectionComponent withMatchingKey(String str) {
        return new IDataCollectionComponent(str, (String) null);
    }

    @Deprecated
    public static IDataCollectionComponent withMatchingKeyAndBucketingKey(String str, String str2) {
        return new IDataCollectionComponent(str, str2);
    }

    public IDataCollectionComponent(String str, String str2) {
        this._matchingKey = str;
        this._bucketingKey = str2;
    }

    public IDataCollectionComponent(String str) {
        this(str, (String) null);
    }

    public final String matchingKey() {
        return this._matchingKey;
    }

    public final String bucketingKey() {
        return this._bucketingKey;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IDataCollectionComponent)) {
            return false;
        }
        IDataCollectionComponent iDataCollectionComponent = (IDataCollectionComponent) obj;
        return this._matchingKey.equals(iDataCollectionComponent._matchingKey) && this._bucketingKey.equals(iDataCollectionComponent._bucketingKey);
    }

    public final int hashCode() {
        return ((this._matchingKey.hashCode() ^ 17000051) * 1000003) ^ this._bucketingKey.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._matchingKey);
        sb.append(", ");
        sb.append(this._bucketingKey);
        return sb.toString();
    }
}
