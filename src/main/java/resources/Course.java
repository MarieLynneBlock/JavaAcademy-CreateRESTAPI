package resources;

public class Course {
    private int id;
    private int studyPoints;
    private String Category;
    private Professor professor;

    public Course(int id, int studyPoints, String category, Professor professor) {
        this.id = id;
        this.studyPoints = studyPoints;
        Category = category;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
