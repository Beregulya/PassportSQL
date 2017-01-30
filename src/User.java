public class User {

    private String name;
    private String surname;
    private Integer age;
    private String country;

    public User(String name, String surname, Integer age, String country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

}
