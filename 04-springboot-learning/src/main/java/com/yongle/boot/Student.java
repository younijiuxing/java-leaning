package com.yongle.boot;

/**
 * @author leyangjie
 * @date 2021/1/9 11:39
 * @describe
 */
public class Student {
    private Integer id;
    private Double score1;
    private Double score2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScore1() {
        return score1;
    }

    public void setScore1(Double score1) {
        this.score1 = score1;
    }

    public Double getScore2() {
        return score2;
    }

    public void setScore2(Double score2) {
        this.score2 = score2;
    }

    public Student() {
    }

    public Student(Integer id, Double score1, Double score2) {
        this.id = id;
        this.score1 = score1;
        this.score2 = score2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score1=" + score1 +
                ", score2=" + score2 +
                '}';
    }
}
