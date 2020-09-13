package correa;

import java.util.ArrayList;

public class SalesSlip {
	public ArrayList<String> items;
	public ArrayList<Double> cost;
	public ArrayList<Integer> quantity;
	public String costDollars;
	public String str = "";

	public SalesSlip(){
		items = new ArrayList<String>();
		cost = new ArrayList<Double>();
		quantity = new ArrayList<Integer>();
	}

	public void addCart(String it, String c, String q) {
		
		//double c = Double.parseDouble(textFieldCost.getText());
		//int q = Integer.parseInt(textFieldQuantity.getText());
		items.add(it);
		cost.add(Double.parseDouble(c));
		costDollars = String.format("%,.2f", cost.get(cost.size() - 1));
		quantity.add(Integer.parseInt(q));

	}

	public String totalSale() {
		double sum = 0;
		for (int i = 0; i < cost.size(); i++) {
			sum = sum + (cost.get(i) * quantity.get(i));
		}
		String format = String.format("%,.2f", sum);
		String result = "$" + format;
		return result;
	}

	public String display() {
		str = str + items.get(items.size() - 1) + "          $" + costDollars + "           "
				+ quantity.get(quantity.size() - 1) + "\n";
		return str;
	}

}
