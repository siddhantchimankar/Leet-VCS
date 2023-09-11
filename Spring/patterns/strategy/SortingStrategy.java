package patterns.strategy;

//interface for sorting strategy - represents the idea of sorting
public interface SortingStrategy {
    //abstract function which will be implemented on runtime
    public void sort(int[] arr);
}