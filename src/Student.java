public class Student {
    private int id;
    private String name;
    private String email;
    private String branch;
    private double cgpa;

    public Student(int id, String name, String email, String branch, double cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBranch() {
        return branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Email: " + email +
               ", Branch: " + branch +
               ", CGPA: " + cgpa;
    }
    public void setName(String name) {
    this.name = name;
}

public void setEmail(String email) {
    this.email = email;
}

public void setBranch(String branch) {
    this.branch = branch;
}

public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
}
}