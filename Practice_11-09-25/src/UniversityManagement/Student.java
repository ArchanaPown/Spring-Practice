package UniversityManagement;

public class Student {
    private String studentId;
    private String name;
    private String course;
    private int age;

    public Student(String studentId, String name, String course, int age) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static Student validateStudentDetails(String input) throws InvalidStudentException{
        String[] s=input.split(":");
//        if(s.length!=4){
//            throw new InvalidStudentException("Invalid student details");
//        }
        String id=s[0];
        String name=s[1];
        String course=s[2];
        int age=Integer.parseInt(s[3]);
        if(age<17 || age>30){
            System.out.println("Age");
        }if(!id.matches("STU/[0-9]{5}")){
            System.out.println("Id");
        }if(!name.matches("[A-Z][a-zA-Z\s]")){
            System.out.println("name");
        }if(course.equals("BTech") || course.equals("BA")||course.equals("BCom")||course.equals("BSc") ){
            return new Student(id,name,course,age);
        }else{
            System.out.println("Course");
        }
        return new Student(id,name,course,age);
    }
}
