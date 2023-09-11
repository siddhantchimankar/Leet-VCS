package patterns.strategy;

public class Sorter {
    //SortingStrategy is the strategy provided by client code
    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] arr) {
        //this sort function will decide its implementation on runtime
        strategy.sort(arr);
    }
}