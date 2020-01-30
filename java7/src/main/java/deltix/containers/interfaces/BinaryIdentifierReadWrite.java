package deltix.containers.interfaces;

/**
 * Created by VavilauA on 4/7/2017.
 */
public interface BinaryIdentifierReadWrite extends BinaryArrayReadWrite, BinaryIdentifierReadOnly {
    
    BinaryIdentifierReadWrite assign(CharSequence str, boolean isASCII);
    BinaryIdentifierReadWrite append(CharSequence str, boolean isASCII);

    BinaryIdentifierReadWrite assign(long buffer);
    BinaryIdentifierReadWrite append(long buffer);
    BinaryIdentifierReadWrite assign(byte[] bytes);
    BinaryIdentifierReadWrite append(byte[] bytes);

    BinaryIdentifierReadWrite assign(byte[] bytes, int offset, int count);
    BinaryIdentifierReadWrite append(byte[] bytes, int offset, int count);

    BinaryIdentifierReadWrite assign(BinaryArrayReadOnly str);
    BinaryIdentifierReadWrite append(BinaryArrayReadOnly str);

    /*TODO: Strictly recommended to override*/
    @Override
    BinaryIdentifierReadWrite clone();

    /*TODO: implement only these methods*/
    BinaryIdentifierReadWrite set(int index, byte x);
    BinaryIdentifierReadWrite append(byte b);
    BinaryIdentifierReadWrite clear();

}
