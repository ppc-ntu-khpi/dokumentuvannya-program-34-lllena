package domain;
/**
 * публичный класс Editor, который наследует класс Artist
 * @author admin
 */
public class Editor extends Artist {
    /**
     * конструктор для объекта класса Editor
     * @param electronicEditing - електронное издание
     * @param skiils - навык
     * @param name - имя
     * @param jobTitle проффесия
     * @param level - уровень
     * @param dept - отдел
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор для объекта класса Editor
     * @param electronicEditing - електронное издание
     * @param skiils - навык
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор для объекта класса Editor
     * @param electronicEditing - електронное издание
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор для объекта класса Editor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * метод toString()
     * @return string
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * метод getPreferences()
     * @return electronicEditing
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * метод setPreferences()
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
