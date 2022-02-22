package dam.appcontactosdesliza.controllers.model;

public class Person {
    private String name;
    private String surName;
    private int age;
    private String gender;
    private String Nationality;
    private String email;
    private String telephone;

    public Person() {
    }

    public Person(String name, String surName, int age, String gender, String nationality, String email, String telephone) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.Nationality = nationality;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return  name +" "+ surName + " age: " + age + " gender: " + gender + " Nationality: " + Nationality +
                " e-mail: " + email + " telephone:" + telephone;
    }
}
