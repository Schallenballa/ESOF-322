import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        getStrat(null);
    }

    static void getStrat(String preChoice){
        boolean valid = false;
        String choice = preChoice;
        int counter = 0;
        Context context;
        while (valid == false) {
        	if (preChoice == null) {
        		Scanner input = new Scanner(System.in);
                System.out.println("Which database software would you like to use?");
                System.out.println("    Relational, NoSQL, or Graph?");
                choice = input.nextLine();
        	}
        	else {
        		counter = 1;
        	}
            switch (choice) {
                case "Relational":
                    valid = true;
                    context = new Context(new Relational());
                    context.executeStrategy();
                    context.setStoreStrategy(new NoSQL());
                    if (counter != 1) {
                    	System.out.println("");
                    	System.out.println("The strategy has now dynamically been set to NoSQL.");
                        getStrat("NoSQL");
                        counter++;
                    }
                    break;
                case "NoSQL":
                    valid = true;
                    context = new Context(new NoSQL());
                    context.executeStrategy();
                    context.setStoreStrategy(new Graph());
                    if (counter != 1) {
                    	System.out.println("");
                    	System.out.println("The strategy has now dynamically been set to Graph.");
                        getStrat("Graph");
                        counter++;
                    }
                    break;
                case "Graph":
                    valid = true;
                    context = new Context(new Graph());
                    context.executeStrategy();
                    context.setStoreStrategy(new Relational());
                    if (counter != 1) {
                    	System.out.println("");
                    	System.out.println("The strategy has now dynamically been set to Relational.");
                        getStrat("Relational");
                        counter++;
                    }
                    break;
                case "":
                    valid = true;
                    context = new Context(new Relational());
                    context.executeStrategy();
                    break;
                default:
                    System.out.println("PLease try again. Your response is case sensitive.");
            }
        }
    }
}