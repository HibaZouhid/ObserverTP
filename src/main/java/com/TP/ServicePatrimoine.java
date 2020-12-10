package main.java.com.TP;

public class ServicePatrimoine extends OrderHandler {

    @Override
    public void handleRequest(Demande demande,Budget budget) {
        if(demande.getState().equals(demande.APPROUVE)){
        demande.setState(demande.INORDER);
        }
        else nextHandler.handleRequest(demande,budget);
    }
}
