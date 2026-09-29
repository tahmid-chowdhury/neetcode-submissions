class DynamicArray {
    int capacity;
    int size;
    int[] array;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            this.resize();
        }

        this.array[this.size] = n;
        this.size++;
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
        this.capacity = capacity * 2;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
