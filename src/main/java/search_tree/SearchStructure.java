package search_tree;

public interface SearchStructure<T> {
    boolean search(int input);
    T insert();
    T delete();
}
