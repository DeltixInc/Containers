package deltix.containers.interfaces;

public interface BinaryArrayReadOnly {
    void getBytes(byte[] buffer);
    void getBytes(byte[] buffer, int srcOffset, int size);
    void getBytes(byte[] buffer, int srcOffset, int dstOffset, int size);

    /*TODO: Strictly recommended to override*/
    BinaryArrayReadOnly clone();

    /*TODO: implement only these methods*/
    byte get(int index);
    int size();
    int capacity();
}
