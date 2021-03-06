package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            throw new NullPointerException("Student must not be null!");
        }
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (student == null) {
            throw new NullPointerException("Student must not be null!");
        }
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0;
        int numberOfStudents = 0;
        for (Student s : students) {
            if (s.calculateAverage() != 0) {
                sum += s.calculateAverage();
                numberOfStudents++;
            }
        }
        if (sum == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return (int) (sum / numberOfStudents * 100) / 100d;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (subject == null) {
            throw new NullPointerException("Subject must not be null!");
        }
        double sum = 0;
        int counter = 0;
        for (Student s : students) {
            if (s.calculateSubjectAverage(subject) > 0.0) {
                sum += s.calculateSubjectAverage(subject);
                counter++;
            }
        }
        return (int) (sum / counter * 100) / 100d;
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student s : students) {
            result.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        StringBuilder studentNamesSB = new StringBuilder();
        if (!students.isEmpty()) {
            for (Student s : students) {
                studentNamesSB.append(s.getName() + ", ");
            }
            studentNamesSB.deleteCharAt(studentNamesSB.length() - 2);
        }
        return studentNamesSB.toString().trim();
    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public int getNumberOfMarks() {
        int sum = 0;
        for (Student s : students) {
            sum += s.getNumberOfMarks();
        }
        return sum;
    }
}