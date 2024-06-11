package poly.sort;

public class HeapSort implements Sort{
    @Override
    public void ascending(String sort) {
        System.out.println(sort + " ascending");
    }

    @Override
    public void descending(String sort) {
        System.out.println(sort + " descending");
    }

    @Override
    public void description(String sort) {
        System.out.println(sort + " 입니다.");
    }
}
