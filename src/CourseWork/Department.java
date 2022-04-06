package CourseWork;

public class Department {

    private String nameDep;//название отдела
    private int count;//количество проектов в списке
    private Project[] listProject; //Массив типа Project для записи проектов
    private int first;//переменная, указывающая на 1 элемент в очереди
    private int last;//переменная, указывающая на последний элемент в очереди
    private int length;//переменная - длина массива-очереди



    public Department getFirst()
    {
        //вернуть ссылку на первый элемент в очереди
        return null;
    }

    public void setFirst(Project temp)
    {
        //изменить ссылку на первый элемент в очереди
    }

    public Department getLast()
    {
        //вернуть ссылку на последний элемент в очереди
        return null;
    }

    public void setLast(Project temp)
    {
        //изменить ссылку на последний элемент в очереди
    }

    public Department(String _nameDep)
    {
        /*
        конструктор класса Department (отдела)
        выставление значений first и last в нулевое значение
        установка имени отдела
         */
    }

    public void addToList(Project newProject)
    {
        //добавление в лист нового проекта
    }

    public void FindInList(String _name)
    {
        /*
        поиск проекта в листе
        Нужен как для добавления, так и для удаления проекта
         */
    }

    public void DelInList(String _name)
    {
        //удаление проекта из листа
    }

    public Integer getSumList()
    {
        //получение общей суммы финансирования по отделу
        return null;
    }

    public Project getList()
    {
        //вывод всей информации в листе
        return null;
    }

    public void setSortList()
    {
        //сортировка листа, т.к. добавление будет по алфавиту
    }
}
