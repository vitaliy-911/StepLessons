package ClassWork.Patern;

public class Student {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;

    public Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;
        private String phone;
        private String city;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Student build() {
            return new Student(this);
        }


    }

}
