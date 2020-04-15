package domain;
/**
 * публичный класс Artist который наследует класс Employee
 * @author admin
 */ 

public class Artist extends Employee {
   /**
    * конструктор обьекта класса Artist
    * @param skiils - навык
    * @param name - имя
    * @param jobTitle - проффесия
    * @param level - уровень
    * @param dept - отдел
    */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * конструктор обьекта класса Artist
     * @param skiils - навык работы 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * конструктор обьекта класса Artist
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * метод toString() 
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * метод getSkills() возвращает параметр навыка
     * @return s - параметр skiils
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * метод setSkills() присваивает значение для параметра skiils
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * метод getSkillsLSist()
     * @return skiils
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
