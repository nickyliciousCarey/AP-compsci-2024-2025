/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Nicky");
        
        double num = raise(100000, 15);
        System.out.println(num);
        num = raise(num, 15);System.out.println(num);
        
	}
	public static void printAnimal(){
            System.out.println(" __v_");
            System.out.println("(____\\/{");
            return;
        }
    public static void greeting(String name){
        
        System.out.println("Hey whats up "+name);
    }
    public static double raise(double salary, int percent){
        double amount = salary+(salary*(percent/100.0));
        return amount;
    }
}