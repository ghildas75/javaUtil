package projetCollection;

import java.util.HashMap;

public class Exercice2 {

	private String tabs[];
	private HashMap<String, Integer> map;


	public Exercice2(String[] tabs) {
		
		this.tabs = tabs;
	}
	
public HashMap GetOccurence() 

{
	 int valeur=1;
	 String key="";
 map= new HashMap<String, Integer> ();
boolean estTrouve=true;
 for (int i = 0; i < tabs.length; i++) {
	for (int j=i+1; j<tabs.length-1;j++) {
	  key= tabs[i];
	 if(tabs[i].equalsIgnoreCase(tabs[j])&& estTrouve) {
        valeur++;
        estTrouve=false;
        map.put(key, valeur);
        break;
        
        }
      }
 }
return map;


}
}
