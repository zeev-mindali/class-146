package exam_oop;

import java.util.Arrays;

public class Grade {
    public static final String[] prof = {"math", "chemistry", "geogarphy", "literture", "phsics", "sports"};
    private String profession;
    private int score;

    public Grade(String profession, int score) {
        setProfession(profession);
        setScore(score);
    }

    public Grade() {
        //mock data
        setProfession(prof[(int)(Math.random()*prof.length)]);
        setScore((int)(Math.random()*61)+40);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        for (String item : prof) {
            if (item.equals(profession)) {
                this.profession = profession;
                return;
            }
        }
        this.profession = "Invalid profession";
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 40 || score > 100) {
            this.score = 40;
            return;
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                " profession='" + profession + '\'' +
                " score=" + score +
                "}";
    }
}
