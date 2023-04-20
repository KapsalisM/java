package com.akis.unipi;
import com.unipi.talepis.java20235.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PapiMember> papiMembers = new ArrayList<>();
        Student student1=new Student("123","akis","student");
        //System.out.println(student1.prettyPrint());
        //add(papiMembers,student1);
        addMember(papiMembers, student1);
        

        Student s2 = new Student();
        s2.setAm("p21056");
        s2.setName("Alexandra");
        s2.setProperty("student");
        //papiMembers.add(s2);
        addMember(papiMembers, s2);
        for (PapiMember s : papiMembers){//Java foreach
            System.out.println(s.prettyPrint());
        }
        //serializeStudent(s2);
        //Student temp = deserializeStudent("student.ser");
        //System.out.println(temp.getName());
    }
    public static void addMember(ArrayList<PapiMember> papiMembers ,PapiMember p) {
		   papiMembers.add(p);
		   
	 }
    /*
    static void serializeStudent(Student s){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("student.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static Student deserializeStudent(String fileName){
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student s;
            s = (Student) objectInputStream.readObject();//casting from object to Student
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("done");
            return s;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    */

}