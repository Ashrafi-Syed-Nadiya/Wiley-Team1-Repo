package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
       private String name;
       private int age ;
       private String city;
       private transient String password;

    public Person(String name, String city, int age, String password) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.password= password;
    }

    public Person() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
