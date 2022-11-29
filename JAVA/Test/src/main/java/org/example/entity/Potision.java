package org.example.entity;

public class Potision {
    private Integer potisionId;

    private String potisionName;

    public Potision(Integer potisionId, String potisionName) {
        this.potisionId = potisionId;
        this.potisionName = potisionName;
    }

    public Potision() {
    }

    public Integer getPotisionId() {
        return potisionId;
    }

    public void setPotisionId(Integer potisionId) {
        this.potisionId = potisionId;
    }

    public String getPotisionName() {
        return potisionName;
    }

    public void setPotisionName(String potisionName) {
        this.potisionName = potisionName;
    }

    @Override
    public String toString() {
        return "Potision{" +
                "potisionId=" + potisionId +
                ", potisionName='" + potisionName + '\'' +
                '}';
    }
}
