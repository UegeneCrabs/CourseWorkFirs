package CourseWork;

public class Company {

    private Department[] queueDep;
    private String nameComp;


    private Company(String _nameDep)
    {
        /*
        конструктор компании
        создание объекта department по названию отдела
         */
    }

    public void addDep(Department current, String _nameDep)
    {
        //добавление отдела в конец очереди
    }

    public Department FindDep(String _nameDep)
    {
        //поиск отдела по названию
        return null;
    }

    public void delDep(String _nameDep)
    {
        //удаление отдела из начала очереди
    }

    public Department getQueue()
    {
        /*
        получение информации обо всех отделах
        в каждом отделе получение информации о проектах
         */
        return null;
    }

    public Integer getSumQueue()
    {
        //получение общей суммы финансирования по предприятию
        return null;
    }
}
