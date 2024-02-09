public class ClassNot {
    public static void main(String[] args) {
        try {
            String ClassNot1="Mad";
            Class.forName(ClassNot1);
            
        } catch (Exception e) {
            System.out.println("Error due to: "+e);
        }
    }
}
