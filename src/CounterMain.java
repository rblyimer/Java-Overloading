public class CounterMain {
    public static void main(String[] args) {
        Counter current = new Counter();
        Counter counter = new Counter(1);
        current.increase();
        counter.increase(2);
        System.out.println(current.value());
        System.out.println(counter.value());
        current.decrease();
        counter.decrease(3);
        System.out.println(current.value());
        System.out.println(counter.value());
    }
}