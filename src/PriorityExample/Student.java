package PriorityExample;

public class Student implements Comparable<Student> {
    private String name;
    private Integer Score;

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return that.getScore()-this.getScore();
    }
}
