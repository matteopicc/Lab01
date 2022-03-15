package it.polito.tdp.parole.model;

import java.util.List;
import java.util.LinkedList;
import java.util.*;

public class Parole {
	List<String>elenco;
	
		
	public Parole() {
		//TODO
		this.elenco=new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		elenco.add(p);
		Collections.sort(elenco,new ComparatoreStringhe());
	}
	
	public List<String> getElenco() {
		//TODO
		return elenco;
	}
	
	public void reset() {
		// TODO
		elenco.removeAll(elenco);
	}

}
