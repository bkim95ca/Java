import java.util.*;

public class Developer {
    //attributes
    private String name;
    private int yearsOfExp;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;
    private static int devCount;
    private static int totalYearsOfExp;
    private static int totalProjects;

    //constructor
    public Developer() {
        this.name = "somebody";
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        devCount++;
        
    }

    public Developer(String name, int yearsOfExp, double hoursOfSleep) {
        this.name = name;
        this.yearsOfExp = yearsOfExp;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        devCount++;
        totalYearsOfExp += yearsOfExp; 
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

    //Getters and Setters

    public static int getTotalProjects() {
        return totalProjects;
    }

    public static int getTotalYearsofExp() {
        return Developer.totalYearsOfExp;
    }

    public static int getDevCount() {
        return Developer.devCount;
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
        totalProjects++;
        return this;
    }

    public Developer setProjects(ArrayList<Project> projects) {
        totalProjects += projects.size();
        this.projects = projects;
        return this;
    }

}
