public class Main {
    public static void main(String[] args) {

        // Створення екземпляру двоспрямованого списку
        DoublyLinkedList list = new DoublyLinkedList();

        // Додавання елементів у список
        for(int i=1; i<6; i++){
            list.insertAtEnd(Integer.toString(i));
            System.out.println("Додано елемент " + i + " у список.");
        }

        /*list.insertAtEnd("2");
        list.insertAtEnd("3");
        list.insertAtEnd("4");
        list.insertAtEnd("5");*/

        // Виведення вмісту списку
        list.display();

        // Видалення елементів з початку списку
        list.deleteFromBeginning();
        System.out.println("Видалено елемент з початку спсику");
        list.deleteFromBeginning();
        System.out.println("Видалено елемент з початку спсику");

        // Виведення вмісту списку після видалення
        list.display();
    }
}