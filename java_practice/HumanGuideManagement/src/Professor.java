import java.util.ArrayList;

public class Professor extends Person {
    private ArrayList<String> lecturers;

    public Professor(String id, String name, String status, String birthDate, String contact) {
        super(id, name, status, birthDate, contact);
        this.lecturers = new ArrayList<>();
    }

    public void addLecture(String lecture) {
        this.lecturers.add(lecture);
    }

    public void addLecturer(String lecturer) {
        lecturers.add(lecturer);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("수강 교과목 목록");
        if (lecturers.isEmpty())
            System.out.println("없음");
        else
            for (String course : lecturers)
                System.out.println(course);
    }
}
