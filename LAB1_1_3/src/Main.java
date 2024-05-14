public class Main {
    public static void main(String[] args) {

        // Створення екземпляра першої структури даних (VectorList)
        VectorList vectorList = new VectorList(10);

        // Додавання елементів до першої структури даних
        for(int i=1; i<6;i++)
        {
            vectorList.add(i);
            System.out.println("Додано елемент " + i + " у список.");
        }

        // Виведення вмісту першої структури даних (VectorList)
        System.out.println("Вміст першої структури даних (VectorList):");
        vectorList.display();

        // Створення екземпляра другої структури даних (DoublyLinkedList)
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Видалення парних чисел з першої структури даних (VectorList) та додавання їх у другу структуру (DoublyLinkedList)
        for (int i = 0; i < vectorList.getSize(); i++) {
            if (vectorList.getElements()[i] % 2 == 0) {
                doublyLinkedList.insertAtEnd(Integer.toString(vectorList.getElements()[i]));
               System.out.println(vectorList.remove(i));
               /* int removedElement = vectorList.getElements()[i] - 1;
                System.out.println("Видалено елемент " + removedElement + " зі списку.");
                i--; // Зменшуємо лічильник, оскільки розмір списку vectorList зменшився*/

            }
        }

        // Виведення вмісту другої структури даних (DoublyLinkedList)
        System.out.println("Вміст другої структури даних (DoublyLinkedList):");
        doublyLinkedList.display();

        // Виведення оновленого вмісту першої структури даних (VectorList)
        System.out.println("Оновлений вміст першої структури даних (VectorList):");
        vectorList.display();
    }
}
