package domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;

public class Collection1 {
	
	List<String> colors;
	Set<String> cricketers;
	Map<String, String> country_capital;
	
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public Set<String> getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}
	public Map<String, String> getCountry_capital() {
		return country_capital;
	}
	public void setCountry_capital(Map<String, String> country_capital) {
		this.country_capital = country_capital;
	}
	

	public void printAll(){
		
		System.out.println("===============colors============");
		for(String color:colors){
			System.out.println(color);
		}
		
		System.out.println("===============players============");
		for(String player:cricketers){
			System.out.println(player);
		}
		
		System.out.println("===============countries============");
		for(Map.Entry<String, String> e: country_capital.entrySet()){
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
	
	
	
}
