package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	String ss="";
	
	@FXML
    private Button btnCancella;
	
	@FXML
	private TextField txtEliminata;
	
	@FXML
    private TextField txtErrore;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	String ts = txtParola.getText();
    	elenco.addParola(ts);
    	List<String>par = elenco.getElenco();
    	txtResult.clear();
    	for(String s:par) {
    		txtResult.appendText(s+"\n");
    		
    	}
    	txtParola.clear();
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	elenco.reset();
    	txtResult.setText("lista svuotata. Ricominciare");
    }
    
    @FXML
    void handleCancella(ActionEvent event) {
    	String ss=txtEliminata.getText();
    	List<String>parr = elenco.getElenco();
    	for(String sa:parr) {
    		if(ss.compareTo(sa)==0) {
    			parr.remove(sa);
    			txtErrore.setText("");
    			txtResult.clear();
    			for(String s:parr) {
    	    		txtResult.appendText(s+"\n");
    	    	}
    		}
    		else {
    			txtErrore.setText("parola non presente nell'elenco");
    		}
    	}
    	txtEliminata.clear();
    }


    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
