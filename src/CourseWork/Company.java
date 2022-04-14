package CourseWork;

public class Company {

    private int count;//Переменная счетчик
    private Queue first;//переменная, указывающая на 1 элемент в очереди
    private Queue last;//переменная, указывающая на последний элемент в очереди
    private int allSum = 0;

    public Company()
    {
        first = null;
        last = null;
    }
    public class Queue {
        public Department info;
        private Queue next;
        public Queue(Department _newDep)
        {
            info = _newDep;
            next = null;
        }
        public Queue getNext() {return next;}
    }
    public boolean getDepToEdit(String _name, Integer _volume,String _nameDep)
    {
        int i = 0;
        Queue pTemp = first;
        while (i == 0){
        if (pTemp != null && pTemp.info.getNameDep().equals(_nameDep))
        {
            pTemp.info.addToList(_name,_volume);
            i++;
        }
        else pTemp = pTemp.getNext();}
        return true;
    }
    public boolean getDepToDell(String _name,String _nameDep)
    {
        int i = 0;
        Queue pTemp = first;
        while (i == 0){
            if (pTemp != null && pTemp.info.getNameDep().equals(_nameDep))
            {
                pTemp.info.DelInList(_name);
                i++;
            }
            else pTemp = pTemp.getNext();
        }
        return true;
    }

    public void addDep(String _nameDep)
    {
        Department newDep = new Department(_nameDep);
        Queue pTemp = new Queue(newDep);
        if(first == null && last == null)
        {
            first = pTemp;
        }
        else
        {
            last.next = pTemp;
        }
        last = pTemp;
        count++;
    }

    public boolean delDep()
    {
        if(first != null)
        {
            first = first.getNext();
            count--;
            return true;
        }
        else return false;
    }

    public String getQueue(){
        StringBuilder info = new StringBuilder();
        Queue pTemp = first;
        while (pTemp != null)
        {
            info.append("Отдел ").append(pTemp.info.getNameDep());
            info.append("\nПроекты:").append(pTemp.info.getList());
            info.append("\nСумма по данному отделу: ").append(pTemp.info.getSumList()).append("\n\n");
            pTemp = pTemp.getNext();
        }
        return info.toString();
    }

    public Integer getSumQueue()
    {
        allSum = 0;
        Queue pTemp = first;
        while(pTemp != null)
        {
            allSum += pTemp.info.getSumList();
            pTemp = pTemp.getNext();
        }
        return allSum;
    }


    /*public Department FindDep(String _nameDep)
    {
        Department getInfoDep = null;
        Queue pTemp = first;
        while (pTemp.next != null)
        {
            if (pTemp.info.getNameDep().equals(_nameDep)){
            getInfoDep =  pTemp.info;
            break;}
            else pTemp = pTemp.getNext();
        }
        return getInfoDep;
    }
    public Department getLast()
    {
        //вернуть ссылку на последний элемент в очереди
        return null;
    }
    public void setLast(Department temp)
    {
        //изменить ссылку на последний элемент в очереди
    }
    public Department getFirst()
    {
        //вернуть ссылку на первый элемент в очереди
        return null;
    }
    public void setFirst(Department temp)
    {
        //изменить ссылку на первый элемент в очереди
    }
    */
}
