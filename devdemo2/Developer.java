import java.util.*;

public class Developer {
    //attributes
    private String name;
    private int yearsOfExp;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;

    //constructor
    public Developer() {
        this.name = "somebody";
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }

    public Developer(String name, int yearsOfExp, double hoursOfSleep) {
        this.name = name;
        this.yearsOfExp = yearsOfExp;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }

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

    //getter 
    public String getName() {
        return this.name;
    }
    //setter
    public Developer setName(String name) {
        this.name = name;
        return this;
    }
    public int getYearsofExp() {
        return this.yearsOfExp;
    }

    public Developer setYearsofExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
        return this;
    }
    public double getHoursofSleep() {
        return this.hoursOfSleep;
    }

    public void setHoursofSleep(double hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }

    //getter 
    public ArrayList<Project> getProjects() {
        return this.projects;
    }
    //setter
    public Developer setOneProject(Project project) {
        this.projects.add(project);
        return this;
    }

    public Developer setProjects(ArrayList<Project> projects) {
        this.projects = projects;
        return this;
    }

}
