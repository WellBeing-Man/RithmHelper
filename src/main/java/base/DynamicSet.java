package base;

public interface DynamicSet<T> {
    T search(int input);
    T insert(int T);
    boolean delete(int input);
}
