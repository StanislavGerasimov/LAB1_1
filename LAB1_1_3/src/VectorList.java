public class VectorList {
    private int capacity;   //вміст списку
    private int size;    //розмір списку
    private int[] elements;

    public int[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    boolean isFull(){ //перевірка списку на переповненість
        return size >= capacity;
    } //перевірка на переповненість
    boolean isEmpty(){ //перевірка списку на порожність
        return size == 0;
    } //перевірка на порожність

    public VectorList(int capacity) {   //конструктор
        this.capacity = capacity;
        this.size = 0;
        this.elements = new int[capacity];
    }

    public void add(int element) {   //метод додавання елементів в список
        if (!isFull()) {
            elements[size++] = element;
        }

    }

    public String remove(int index) {   //метод видалення зі списка
        if (index < 0 || index >= size) {
            return "";
        }
        String res =  "Видалено елемент " + elements[index] + " зі списку";
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return res;
    }

    public void display() {     //виведення списку в консоль
        if (!isEmpty()) {
            System.out.println("Елементи списку:");
            for (int i = 0; i < size; i++) {
                System.out.print(elements[i] + " ");
            }
            System.out.println();
        }
    }
}
