package models;

public class Subject {

    public Subject(String subjectTitle) {
        this.subjectTitle = subjectTitle;

    }

    private String subjectTitle;
    private Double scoredMarks;

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public Double getScoredMarks() {
        return scoredMarks;
    }

    public void setScoredMarks(Double scoredMarks) {
        this.scoredMarks = scoredMarks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectTitle='" + subjectTitle + '\'' +
                ", scoredMarks=" + scoredMarks +
                '}';
    }
}
