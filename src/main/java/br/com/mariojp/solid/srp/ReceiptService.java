package br.com.mariojp.solid.srp;

public class ReceiptService {
	private TaxCalculator taxCalculator;
	private ReceiptFormatter receiptFormatter;
	
	public ReceiptService(TaxCalculator taxCalculator, ReceiptFormatter receiptFormatter) {
		this.taxCalculator = taxCalculator;
		this.receiptFormatter = receiptFormatter;
	}
	
	
	
	
	
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = taxCalculator.calc(subtotal);
		double total = subtotal + tax;
		
		return receiptFormatter.formatter(order, subtotal, tax, total);
		
	}
}
