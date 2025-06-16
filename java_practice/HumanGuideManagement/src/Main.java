import java.util.ArrayList;

public class Main {
    public  static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("20221100", "손세혁", "재학", "2000-08-26", "010-9292-9292");

        student2.addCousrses("Java");
        student2.addCousrses("Python");

        System.out.println("학생 2의 정보");
        student2.printInfo();

        Professor professor = new Professor("20212330", "홍길동", "재학", "1970-11-13", "010-1233-1111");
        professor.addLecture("Java");
        professor.addLecture("Application Security");

        System.out.println("교수님 정보");
        professor.printInfo();
    }
}

    // 0: id, 1: name, 2: status, 3: birthdate, 4: contact

//    static String[][] students = new String[studentNum][5];
//    static ArrayList<String>[] courseList = new ArrayList[studentNum];
//    public static void main(String[] args) {
//        for (int i = 0; i < studentNum; i++) {
//            courseList[i] = new ArrayList<>();
//        }
//        setStudents(0, "20221100", "손세혁", "재학", "2000-08-26", "010-9292-9292");
//        setStudents(1, "20229909", "홍길동", "휴학", "2000-04-12", "010-0101-0101");
//        setStudents(2, "20228874", "이순신", "졸업", "2000-12-23", "010-5858-5858");
//
//        addCourse(0, "자료구조");
//        addCourse(0, "운영체제");
//
//        addCourse(1, "데이터베이스");
//
//        addCourse(2, "자료구조");
//        addCourse(2, "운영체제");
//        addCourse(2, "데이터베이스");
//
//        removeCourse(2, "운영체제");
//
//        printAllStudents();
//        printStudentInfo(1);
//    }
//
//    public static void setStudents(int index, String id, String name, String status, String birthdate, String contact) {
//        students[index][0] = id;
//        students[index][1] = name;
//        students[index][2] = status;
//        students[index][3] = birthdate;
//        students[index][4] = contact;
//    }
//
//    public static void addCourse(int index, String courseName) {
//        courseList[index].add(courseName);
//    }
//
//    public static void removeCourse(int index, String courseName) {
//        courseList[index].remove(courseName);
//    }
//
//    public static int getCourseNum(int index) {
//        return courseList[index].size();
//    }
//
//    public static void printAllStudents() {
//        for (int i = 0; i < students.length; i++) {
//            printStudentInfo(i);
//            System.out.println();
//        }
//    }
//
//    public static void printStudentInfo(int index) {
//        System.out.println("=== 학생" + (index + 1) + " 정보 ===");
//        System.out.println(students[index][0]);
//        System.out.println(students[index][1]);
//        System.out.println(students[index][2]);
//        System.out.println(students[index][3]);
//        System.out.println(students[index][4]);
//
//        int courseCount = getCourseNum(index);
//        System.out.println("<수강 교과목 목록(" + courseCount + "개)>");
//        if (courseList[index].isEmpty()) {
//            System.out.println("없음");
//        } else {
//            for (String course : courseList[index]) {
//                System.out.println(course);
//            }
//        }
//    }
//
//    static final int studentNum = 3;
