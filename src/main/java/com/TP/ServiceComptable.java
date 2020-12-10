package main.java.com.TP;

public class ServiceComptable extends OrderHandler {
    //CHANGE STATUS
    @Override
    public void handleRequest(Demande demande,Budget budget) {

         if(demande.getPrix()<=budget.getBudget()){
            demande.setState(Demande.APPROUVE);
}      nextHandler.handleRequest(demande,budget);

    }
}
