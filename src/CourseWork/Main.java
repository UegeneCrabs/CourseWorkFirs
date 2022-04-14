package CourseWork;

public class Main {
    public static void main(String[] args) {
        Company Zheka = new Company();
        Zheka.addDep("Коммуникации");
        Zheka.addDep("Разработки");
        Zheka.addDep("Производства");
        Zheka.getDepToEdit("Проект А", 1,"Коммуникации");
        Zheka.getDepToEdit("Проект Г", 20,"Коммуникации");
        Zheka.getDepToEdit("Проект В", 3,"Коммуникации");
        Zheka.getDepToEdit("Проект E", 13,"Коммуникации");
        Zheka.getDepToEdit("Проект К", 22,"Разработки");
        Zheka.getDepToEdit("Проект Ф", 2,"Разработки");
        Zheka.getDepToEdit("Проект Е", 12,"Разработки");
        Zheka.getDepToEdit("Проект Ж", 1,"Производства");
        Zheka.getDepToEdit("Проект З", 4,"Производства");
        Zheka.getDepToEdit("Проект Ш", 4,"Производства");
        System.out.println(Zheka.getQueue());
        System.out.print("Сумма финансирования по всей компании: ");
        System.out.println(Zheka.getSumQueue());
        Zheka.delDep();
        Zheka.getDepToDell("Проект Ф", "Разработки");
        System.out.println(Zheka.getQueue());
        System.out.print("Сумма финансирования по всей компании: ");
        System.out.println(Zheka.getSumQueue());
    }
}
