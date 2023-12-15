package kursanov.kg.linkedList.models;

public class Actor {

    private long id;
    private String fullName;

    private String role;


    public Actor() {
    }

    public Actor(long id , String fullName, String role) {
        this.fullName = fullName;
        this.role = role;
        this.id = id;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
