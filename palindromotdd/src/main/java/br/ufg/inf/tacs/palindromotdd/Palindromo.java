package br.ufg.inf.tacs.palindromotdd;

public class Palindromo {

	public boolean ehPalindromo(String frase) {
	    String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
	    if(fraseFiltrada.charAt(0) != fraseFiltrada.charAt(fraseFiltrada.length() - 1))
   		 	return false;
	    
	    for(int i = 1; i < fraseFiltrada.length()/2; i++) {
	    	if(fraseFiltrada.charAt(i) != fraseFiltrada.charAt((fraseFiltrada.length()-1) -i)) 
	    		 return false;
	    
	    }
	    return true;
	}
}
