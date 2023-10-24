package HomeWork_17;


    // Базовый класс "Человек"
    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduceYourself() {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет.");
        }
    }

    // Класс "Студент", наследник класса Person
    class Student extends Person {
        private String university;

        public Student(String name, int age, String university) {
            super(name, age);
            this.university = university;
        }

        @Override
        public void introduceYourself() {
            super.introduceYourself();
            System.out.println("Я студент университета " + university);
        }

        public void study() {
            System.out.println("Я учусь в университете " + university);
        }
    }

    // Класс "Преподаватель", наследник класса Person
    class Teacher extends Person {
        private String subject;

        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        @Override
        public void introduceYourself() {
            super.introduceYourself();
            System.out.println("Я преподаватель по предмету " + subject);
        }

        public void teach() {
            System.out.println("Я преподаю предмет " + subject);
        }
    }

    // Класс "Врач", наследник класса Person
    class Doctor extends Person {
        private String specialization;

        public Doctor(String name, int age, String specialization) {
            super(name, age);
            this.specialization = specialization;
        }

        @Override
        public void introduceYourself() {
            super.introduceYourself();
            System.out.println("Я врач по специализации " + specialization);
        }

        public void diagnose() {
            System.out.println("Я занимаюсь диагностированием и лечением в области " + specialization);
        }
    }

    public class Task_0 {
        public static void main(String[] args) {
            Student student = new Student("Иван", 20, "Институт технологий");
            Teacher teacher = new Teacher("Анна", 35, "Математика");
            Doctor doctor = new Doctor("Петр", 40, "Кардиология");

            student.introduceYourself();
            student.study();

            teacher.introduceYourself();
            teacher.teach();

            doctor.introduceYourself();
            doctor.diagnose();
        }
}
