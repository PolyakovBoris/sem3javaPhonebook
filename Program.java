public class Program {
    public static void main(String[] args) {
        
        // Задача 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        Task1RemoveEvenNum.RemoveEvenNum();
        System.out.println();

        // Задача 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        Task2FindMinMaxAverage.InfoAboutArray();
        System.err.println();

        // Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. 
        // В этот телефонный справочник с помощью метода add() можно добавлять записи. 
        // С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть 
        // несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        Task3PhoneBook.PhoneBook();
    }
}