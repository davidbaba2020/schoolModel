package models;

public class Course {
    private int id;
    private int mathScore;
    private int englishScore;


    public Course() {
    }

    public Course(int id, int mathScore, int englishScore) {
        this.id = id;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }
}
