public class Counter {
    private int value;
    public Counter() {
        value = 0;
    }
    public Counter(int value){
        this.value = value;
    }
    public int value() {
        return this.value;
    }
    public void increase() {
        this.value += 1;
    }
    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            this.value += 0;
        } else {
            this.value += increaseBy;
        }
    }
    public void decrease() {
        this.value -= 1;
    }
    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            this.value += 0;
        } else {
            this.value -= decreaseBy;
        }
    }
}
