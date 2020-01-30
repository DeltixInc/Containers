package deltix.containers.interfaces;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of Consumer.
 * @param <T1> The type of the first argument to the operation
 * @param <T2> The type of the second argument to the operation
 */
public interface BiConsumer<T1, T2>  {
    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     */
    void accept(T1 t, T2 u);
}
