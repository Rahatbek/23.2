public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone objectClone = new ObjectClone();
        ObjectClone objectClone1 = (ObjectClone) objectClone.clone();
        System.out.println(objectClone.clone());
        System.out.println(objectClone1);
    }
}
