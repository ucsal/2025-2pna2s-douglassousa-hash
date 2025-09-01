package br.com.mariojp.solid.srp;

public class TaxCalculator {
	private double taxRate;
	
	public TaxCalculator(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public double calc(double amount) {
		return amount * taxRate;
	}
}
