package buoi3.assignment;

public class Subject {
    private String id;
    private String subjectName;
    private int sutdentCount;
    private String timeStart;
    private String timeEnd;

    public Subject() {
    }

    public Subject(String id, String subjectName, int sutdentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.sutdentCount = sutdentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSutdentCount() {
        return this.sutdentCount;
    }

    public void setSutdentCount(int sutdentCount) {
        this.sutdentCount = sutdentCount;
    }

    public String getTimeStart() {
        return this.timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return this.timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getStartMinutes() {
        String[] time = timeStart.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

    public int getEndMinutes() {
        String[] time = timeEnd.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

    public void display() {
        System.out.printf("%-4s %-30s %-20s %-20s\n", id, subjectName, sutdentCount,
                timeStart + " - " + timeEnd);
    }
}
