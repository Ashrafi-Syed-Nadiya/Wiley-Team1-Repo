package Serialization;

import java.io.*;

public class SerializeTask  {

    public static void serializeObject(Object object) {
        try(OutputStream outputStream = new FileOutputStream("Product.ser");
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

        File file= new File("Product.ser");
        Product Prd = new Product(45,"Bangalore","20231231");
        System.out.println("Before Serialization");
        System.out.println(Prd);
        serializeObject(Prd);

        Product Prd2 = (Product) deSerializeObject(file.getName());
        System.out.println("After Serialization");
        System.out.println(Prd2);

    }

}