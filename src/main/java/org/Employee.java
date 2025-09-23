package org.codingwallah.em_project.model;

public class Employee {
    private int id;
    private String name;
    private String role;
    private String linkedIn;
    private String resume;

    public Employee() {}

    public Employee(int id, String name, String role, String linkedIn, String resume) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.linkedIn = linkedIn;
        this.resume = resume;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getLinkedIn() { return linkedIn; }
    public void setLinkedIn(String linkedIn) { this.linkedIn = linkedIn; }
    public String getResume() { return resume; }
    public void setResume(String resume) { this.resume = resume; }
}
