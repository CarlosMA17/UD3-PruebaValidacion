public class MenuHelper {
    private String[] alumnos;
    private int increment;

    public MenuHelper(int MaxStudents) {
        this.alumnos = new String[MaxStudents];
        this.increment = 0;
    }

    public void addStudent(String name) {
        this.alumnos[increment] = name;
        this.increment ++;
    }
}
