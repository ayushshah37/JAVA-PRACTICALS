import java.util.*;
class Main{
    public static void main(String args[]){
        Vector v=new Vector();
        v.addElement("hi");
        v.addElement("how r u");
        v.addElement("i am good");
        System.out.println(v);
        v.insertElementAt("Ayush",1);
        System.out.println(v);
        v.removeElementAt(1);
        System.out.println(v);
        
        
    }
}
