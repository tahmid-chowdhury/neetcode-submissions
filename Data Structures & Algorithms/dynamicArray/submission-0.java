class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }

        this.array[size] = n;
        size++;
    }

    public int popback() {
        int lastElement = this.array[size - 1];

        this.size--;

        return lastElement;
    }

    private void resize() {
        int[] newArray = new int[this.capacity * 2];

        for (int i = 0; i < this.capacity; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
        this.capacity = this.capacity * 2;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
