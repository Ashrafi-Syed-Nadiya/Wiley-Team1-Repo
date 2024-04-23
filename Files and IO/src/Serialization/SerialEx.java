package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerialEx {

    public static void serializeObject(Object object) {
        try(OutputStream outputStream = new FileOutputStream("Person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(object);
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }

    public static Object deSerializeObject(String filename){
        try(InputStream inputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        }
        catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static void main(String[] args) {


        Person person = new Person("Nohi","Bangalore",45,"noPass1234");
        System.out.println("Before Serialization");
        System.out.println(person);
        serializeObject(person);

        person = (Person) deSerializeObject("Person.ser");
        System.out.println("After Serialization");
        System.out.println(person);

    }

}