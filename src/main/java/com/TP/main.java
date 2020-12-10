package main.java.com.TP;

public class main {
    public static void main(String[] args){
       OrderHandler comptable=new ServiceComptable();
       OrderHandler patrimoine=new ServicePatrimoine();

        comptable.nextHandler=patrimoine;
        patrimoine.nextHandler=comptable;
        Demande demande=new Demande(30.0);
        Budget budget=new Budget(50.0);
        demande.ajoute(budget);
        budget.setDemande(demande);
        comptable.handleRequest(demande,budget);
        System.out.println(budget.getBudget());
        System.out.println(budget.getBloque());
        System.out.println(demande.getState());
        //servicePatrimoine.handleRequest(demande,budget);
    }
}
