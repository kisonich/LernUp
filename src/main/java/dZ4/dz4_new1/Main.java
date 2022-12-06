package dZ4.dz4_new1;

/**
 2. Реализуйте класс Student, для описания студентов.
 Создайте нестатические поля, отвечающие за:
 - имя студента,
 - возраст,
 - название вуза,
 - номер группы,
 - средний балл,
 - любимый предмет.
 Подберите подходящие типы и модификаторы доступа для полей.
 Добавьте классу конструктор, которой в качестве параметров получает необходимые аргументы для инициализации всех полей.
 Добавьте классу нестатические методы, которые:
 - меняет номер группы,
 - меняет средний балл,
 - возвращает любимый предмет студента.
 Все методы должны иметь верное количество параметров подходящего типа и правильное возвращаемое значение, либо его отсутствие. Затем подберите подходящие модификаторы доступа.

 Создайте 2 объекта класса Student, инициализировав поля любыми значениями.
 */
public class Main {
    public static void main(String[] args) {

        Student firstStudent = new Student("Donald Trump",76,"University of Pennsylvania",105,5,
                                "Omerican history");

        System.out.println(firstStudent);
        firstStudent.changeNumberGroup(205);

        firstStudent.changeAverageRating(4);

        firstStudent.getAcademicSubject();

    }
}
class Student{
    private String name;
    private int age;
    private String university;
    private int numGroup;
    private int avgRating;
    private String favoriteLesson;

    public Student(String name, int age, String university, int numGroup, int avgRating, String favoriteLesson) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.numGroup = numGroup;
        this.avgRating = avgRating;
        this.favoriteLesson = favoriteLesson;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public String getFavoriteLesson() {
        return favoriteLesson;
    }

    public void setFavoriteLesson(String favoriteLesson) {
        this.favoriteLesson = favoriteLesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", numGroup=" + numGroup +
                ", avgRating=" + avgRating +
                ", favoriteLesson='" + favoriteLesson + '\'' +
                '}';
    }
    public void changeNumberGroup(int numGroup){
        this.numGroup = numGroup;
        System.out.println(this);
    }
    public void changeAverageRating(int avgRating){
        this.avgRating = avgRating;
        System.out.println(this);
    }
    public String getAcademicSubject(){
        System.out.println(favoriteLesson);
        return favoriteLesson;
    }
}