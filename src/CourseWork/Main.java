package CourseWork;

public class Main {
    public static void main(String[] args) {
        Company Zheka = new Company("Компания Женька");
        Zheka.addDep("Коммуникации");
        Zheka.addDep("Разработки");
        Zheka.addDep("Производства");
        Zheka.getDepToEdit("Проект А", 1,"Коммуникации");
        Zheka.getDepToEdit("Проект Г", 2,"Коммуникации");
        Zheka.getDepToEdit("Проект В", 3,"Коммуникации");
        Zheka.getDepToEdit("Проект Г", 2,"Разработки");
        Zheka.getDepToEdit("Проект Ф", 2,"Разработки");
        Zheka.getDepToEdit("Проект Е", 2,"Разработки");
        Zheka.getDepToEdit("Проект Ж", 1,"Производства");
        Zheka.getDepToEdit("Проект З", 1,"Производства");
        Zheka.getDepToEdit("Проект А", 4,"Производства");
        Zheka.addDep("П");
        Zheka.getDepToEdit("Проект А", 10,"П");
        Zheka.getDepToEdit("Проект Б", 20,"П");
        Zheka.getDepToEdit("Проект В", 30,"П");
        System.out.println(Zheka.getQueue());
        System.out.print("Сумма финансирования по всей компании: ");
        System.out.println(Zheka.getSumQueue());
        Zheka.delDep();
        Zheka.getDepToDell("Проект Г", "Разработки");
        System.out.println(Zheka.getQueue());
        System.out.print("Сумма финансирования по всей компании: ");
        System.out.println(Zheka.getSumQueue());
    }
}
