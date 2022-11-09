package Exercise2;

import java.time.LocalDate;

public class StudentEx2 {
    public static int COUNTEX2 = 0;
    private int id;
    private String name;
    private LocalDate birthDay;
    private int score;
    public StudentEx2(String name, LocalDate birthDay, int score) {
        this.id = ++COUNTEX2;
        this.name = name;
        this.birthDay = birthDay;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentEx2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", score=" + score +
                '}';
    }

    public void setScore(int score) {
        this.score = score;
    }
}
