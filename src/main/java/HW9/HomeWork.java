package HW9;

/**
 * @Author Александр Ключка
 * @created 2022-07-18  13:25
 **/



import java.util.List;
import java.util.stream.Collectors;

public class HomeWork {

    public static void main(String[] args) {
        List<Student> students = Data.getStudentsList(); // в данном случае класс Data содержит тестовые данные, у вас они будут свои
        Course randomCourse = Data.getRandomCourse(); // ваша реализация подачи случайного курса, можно просто создать объект и его передавать
        System.out.println(getUnicsCourses(students));
        System.out.println(inquisitiveStudents(students));
        System.out.println(getStudentsFromCourse(students, randomCourse));
    }

    // 1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
    public static List<Course> getUnicsCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    // 2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных (любознательность определяется количеством курсов).
    public static List<Student> inquisitiveStudents (List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> (s2.getAllCourses().size()) - (s1.getAllCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
    public static List<Student> getStudentsFromCourse(List<Student> students, Course course) {
        System.out.println("Ищем студентов проходящих курс " + course);
        return students.stream()
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }

}