package domain;
/**
 * класс Manager, котрый наследует класс Employee
 * @author admin
 */
public class Manager extends Employee {
    /**
     * конструктор для объекта класса Manager
     * @param employees - сотрудники
     * @param name - имя
     * @param jobTitle - проффесия
     * @param level - уровень
     * @param dept - отдел
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    /**
     * метод toString()
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * конструктор для объекта класса Manager
     * @param employees - сотрудники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * конструктор для объекта класса Manager
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * метод getEmployees() возвращает значение переменной String s
     * @return param s - навыки
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * метод setEmployees() присваивает значение параметра employees
     * @param employees - сотрудники
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * метод getEmployeesList() возвращает значения параметра employees
     * @return employees - сотрудники
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
