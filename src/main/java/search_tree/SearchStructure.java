package search_tree;

public interface SearchStructure<T> {
    boolean search(int input);
    T insert(int input);
    T delete(int input);
}
