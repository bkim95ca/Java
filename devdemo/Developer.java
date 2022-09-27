import java.util.*;

public class Developer {
    //attributes
    public String name;
    public int yearsOfExp;
    public double hoursOfSleep;
    public ArrayList<String> languages;
    public ArrayList<Project> projects = new ArrayList<Project>();

    //methods
    public void displayStatus() {
        System.out.println("name: "  + this.name);
        System.out.println("yearsOfExp: "  + this.yearsOfExp);
        System.out.println("hoursOfSleep: "  + this.hoursOfSleep);
        System.out.println("languages: "  + this.languages);
        System.out.println("projects: ");
        for(Project eachProject: this.projects) {
            eachProject.displayInfo();
        }
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }
}
