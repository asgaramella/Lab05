package it.polito.tdp.anagrammi.controller;



	import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import it.polito.tdp.lab05.model.Model;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	
		public class AnagrammiController {
			
		Model model;
		
		public void setModel(Model model){
			this.model=model;
		}

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtCalcola;

	    @FXML
	    private Button btnCalcola;

	    @FXML
	    private TextArea txtOK;

	    @FXML
	    private TextArea txtKO;

	    @FXML
	    private Button btnReset;

	    @FXML
	    void doCalcola(ActionEvent event) {
	    	LinkedList<String> stemp=new LinkedList(model.risolvi(txtCalcola.getText()));
	    	for(String s:stemp){
	    		if(model.trovata(s))
	    			txtOK.appendText(s+"\n");
	    		else
	    			txtKO.appendText(s+"\n");
	    	}

	    }

	    @FXML
	    void doReset(ActionEvent event) {
	    	txtKO.clear();
	    	txtOK.clear();
	    	txtCalcola.clear();
	    }

	    @FXML
	    void initialize() {
	        assert txtCalcola != null : "fx:id=\"txtCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert txtOK != null : "fx:id=\"txtOK\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert txtKO != null : "fx:id=\"txtKO\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

	    }
	}


	


