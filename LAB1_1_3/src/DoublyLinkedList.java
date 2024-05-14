public class DoublyLinkedList {
    private class Node {
        String data;
        Node prev;
        Node next;

        Node(String data) {  //конструктор вузла
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private boolean isEmpty(){ return head==null;} //перевірка на порожність
    private Node head; //голова списку
    private Node tail;  //кінець списку

    public DoublyLinkedList() {  //конструктор списку
        this.head = null;
        this.tail = null;
    }

    public static boolean isInteger(String str) {  // Метод, що перевіряє, чи є вміст рядка цілим числом
        if (str == null || str.isEmpty()) {
            return false;
        }
        int length = str.length();
        for (int i=0; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    public void insertAtEnd(String data) {// метод вставлення в кінець
        if (isInteger(data)) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    }
    public void deleteFromBeginning() { //метод видалення з початку
        if (isEmpty()) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void display() {  //метод виводу списку в консоль
        if (head == null) {
            System.out.println("Список порожній.");
            return;
        }

        Node current = head;
        System.out.println("Елементи списку:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
