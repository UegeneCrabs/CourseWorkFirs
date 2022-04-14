package CourseWork;

public class Project {

    private String name;//переменная-название проекта
    private Integer volume;//переменная - объем финансирования

    public Project(String _name, Integer _volume)//Конструктор класса Project
    {
        this.name = _name;
        this.volume = _volume;
    }
    public String getName()
    {
        return name;
    }
    public Integer getVolume()
    {
        return volume;
    }
    public void setName(String _name)
    {
        this.name = _name;
    }
    public void setVolume(Integer _volume)
    {
        this.volume = _volume;
    }
}
