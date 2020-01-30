package deltix.containers;

/**
 * Created by DriapkoA on 05.04.2017.
 */
public class MemoryHelper {
    static {
        System.loadLibrary("MemoryHelper");
    }


    /**
     * Copy array of byte to array of long.
     *
     * @param src         Source array of byte.
     * @param srcOffset   Offset in byte array in bytes.
     * @param destination Destination array of long.
     * @param destOffset  Offset in long array in bytes.
     * @param count       Number of bytes to copy.
     */
    native public static void fastMemMove(byte[] src, int srcOffset, long[] destination, int destOffset, int count);

    /**
     * Copy array of byte to array of long.
     *
     * @param src         Source array of byte.
     * @param srcOffset   Offset in byte array in bytes.
     * @param destination Destination array of long.
     * @param destOffset  Offset in long array in bytes.
     * @param count       Number of bytes to copy.
     */
    native public static void memMove(byte[] src, int srcOffset, long[] destination, int destOffset, int count);

    /**
     * Get byte at position in array of longs.
     *
     * @param array Array of longs.
     * @param index Index in array of longs.
     * @return Byte at position index.
     */
    native public static byte getByte(long[] array, int index);

    /**
     * Set byte value to index in long array.
     *
     * @param array Long array.
     * @param index Index in long array in bytes.
     * @param value Byte value to set.
     */
    native public static void setByte(long[] array, int index, byte value);
}
