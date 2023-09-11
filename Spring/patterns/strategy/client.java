package patterns.strategy;

public class client {
    public static void main(String[] args) {
        System.out.println("client code running ---> ");
        int[] arr = { 5, 2, 7, 1, 8 };

        //since array is small, we use bubble sort strategy
        SortingStrategy strategy = new BubbleSort();
        Sorter sorter = new Sorter(strategy);

        //this sort function will decide its implementation on runtime
        sorter.sort(arr);
    }
}
