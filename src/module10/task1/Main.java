package module10.task1;

public class Main {
        public static void main(String[] args) {
            try{
                throw new Exception("warning");
            } catch (Throwable e){
                System.out.println(e.getLocalizedMessage());
            }
            finally {
                System.out.println("complete");
            }
        }
}
