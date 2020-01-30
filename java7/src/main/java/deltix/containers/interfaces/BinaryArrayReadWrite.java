package deltix.containers.interfaces;

public interface BinaryArrayReadWrite extends BinaryArrayReadOnly {

    BinaryArrayReadWrite assign(byte[] bytes);
    BinaryArrayReadWrite append(byte[] bytes);

    BinaryArrayReadWrite assign(byte[] bytes, int offset, int count);
    BinaryArrayReadWrite append(byte[] bytes, int offset, int count);

    BinaryArrayReadWrite assign(BinaryArrayReadOnly str);
    BinaryArrayReadWrite append(BinaryArrayReadOnly str);

    /*TODO: Strictly recommended to override*/
    @Override
    BinaryArrayReadWrite clone();

    /*TODO: implement only these methods*/
    BinaryArrayReadWrite set(int index, byte x);
    BinaryArrayReadWrite append(byte b);
    BinaryArrayReadWrite clear();

}
