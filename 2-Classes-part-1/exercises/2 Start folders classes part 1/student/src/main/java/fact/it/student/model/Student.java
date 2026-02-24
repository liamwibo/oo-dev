package fact.it.student.model;

import java.util.List;

public class Student {
    private String name;
    private char level;
    private int grade;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        if(level == 'S' || level == 'M' || level == 'E') {
            this.level = level;
        }
        else{
            this.level = 'S';
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade >= 1 && grade <= 6){
            this.grade = grade;
        }
        else{
            this.grade = 1;
        }
    }

    public void increaseGrade(){
        this.grade = Math.min(this.grade + 1, 6);
    }

    public String getLevelExplained(){
        return switch (this.level) {
            case 'S' -> "Starting level";
            case 'M' -> "Middle level";
            default -> "End level";
        };
    }


}
