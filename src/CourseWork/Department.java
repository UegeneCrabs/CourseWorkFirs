package CourseWork;

import java.util.Arrays;

public class Department {

    private final String nameDep;//название отдела
    private final int size = 10;
    private int count = 0;//количество проектов в списке
    private Project[] listProject; //Массив типа Project для записи проектов
    private int sumList;

    public Department(String _nameDep)
    {
        this.nameDep = _nameDep;
        listProject = new Project[size];
    }

    public String getNameDep(){return nameDep;}

    public boolean addToList(String _name, int _volume)
    {
        Project One = new Project(_name,_volume);
        listProject[count] = One;
        count++;
        //setSortList();
        return (listProject[count] == One);
    }

    public Project FindInList(String _name)
    {
        Project result = null;
        for (int i = 0;i < size; i++)
        {
            if (listProject[i] != null){
                if (listProject[i].getName().equals(_name)) {
                    result = listProject[i];
                }
            }
        }
        return result;
    }

    public int findForDel(String _name){
        int result = 0;
        for (int i = 0;i < size; i++)
        {
            if (listProject[i] != null){
                if (listProject[i].getName().equals(_name)) {
                    result = i;
                }
            }
        }
        return result;
    }

    public boolean DelInList(String _name)
    {   boolean result = false;
        if ((FindInList(_name) != null)) {
            listProject[findForDel(_name)] = null;
            result = true;
        }
        return result;
    }

    public Integer getSumList()
    {
        sumList = 0;
        for (int i = 0;i < size; i++)
        {
            if (listProject[i] != null){
                sumList += listProject[i].getVolume();
                }
        }
        return sumList;
    }

    public String getList(){
        StringBuilder data = new StringBuilder();
        Project pTemp;
        for (int j = 0;j<size;j++){
            if (listProject[j] != null){
            pTemp = listProject[j];
            data.append("\nИмя проекта №").append(j + 1).append(" ").append(pTemp.getName());
            data.append("\nОбъем: ").append(pTemp.getVolume());
            }
        }
        return data.toString();
    }

    /*public void setSortList()
    {
        Arrays.stream(listProject).sorted();
    }*/


}
