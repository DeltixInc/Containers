package deltix.containers.interfaces;

/**
 * Created by VavilauA on 4/7/2017.
 */
public interface BinaryIdentifierReadOnly extends BinaryArrayReadOnly{
    long toLong();
    long toLong(int offset);

    // We will use Appendable instead of MutableString
    void getChars(CharEncoding charset, Appendable str);
    void getChars(CharEncoding charset, Appendable str, int offset);

    String toString(CharEncoding charset, int offset);
    String toString(CharEncoding charset);

    /*TODO: Strictly recommended to override*/
    boolean equals(BinaryIdentifierReadOnly another);
    int hashCode();
    String toString();
    @Override
    BinaryIdentifierReadOnly clone();
}
