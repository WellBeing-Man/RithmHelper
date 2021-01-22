package search_tree;

public interface SearchStructure<T> {
    boolean search(T input);
    T insert();
    T delete();
}
