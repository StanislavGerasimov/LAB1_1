public class Main{
    public static void main(String[] args) {
        int remove_index=2;

        // Створення екземпляра списку з розмірністю 5
        VectorList list = new VectorList(5);

        // Додавання елементів у список
        for(int i=1; i<6;i++)
        {
            list.add(i);
            System.out.println("Додано елемент " + i + " у список.");
        }



        // Виведення вмісту списку
       list.display();

        // Видалення елементів зі списку
        list.remove(remove_index);
        System.out.println("Видалено елемент з індексом " + remove_index + " зі списку.");
        list.display();
        remove_index = 0;
        list.remove(remove_index);
        System.out.println("Видалено елемент з індексом " + remove_index + " зі списку.");

        // Виведення вмісту списку після видалення
        list.display();
    }
}

