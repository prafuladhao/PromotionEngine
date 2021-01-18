package com.product.checkout;

public class CalculateAmount {
	
	public Double CalculateSkuA(Integer count) {
		
		Double promotionAmount = (count/ProductConstants.a_promotion)*ProductConstants.a_amount.doubleValue();
		Double amount = (count%ProductConstants.a_promotion)*ProductConstants.A.doubleValue();
		Double totalAmount = promotionAmount + amount;
		return totalAmount;
	}
	
  public Double CalculateSkuB(Integer count) {
		
		Double promotionAmount = (count/ProductConstants.b_promotion)*ProductConstants.b_amount.doubleValue();
		Double amount = (count%ProductConstants.b_promotion)*ProductConstants.B.doubleValue();
		Double totalAmount = promotionAmount + amount;
		return totalAmount;
	}
  
  public Double CalculateSkuCAndD(Integer c_Count, Integer d_Count) {
		
	  	Double totalAmount = 0.0d;
	  
	  	if(c_Count==d_Count) {
	  		
	  		totalAmount = c_Count*ProductConstants.cd_amount.doubleValue();
	  	
	  	}else if(c_Count>d_Count) {
	  	
	  		Integer saperateCount = c_Count-d_Count;
	  		Integer comboCount = c_Count - saperateCount;
	  		
	  		Double c_amount = saperateCount* ProductConstants.C;
	  		Double comboAmount = comboCount* ProductConstants.cd_amount;
	  		
	  		totalAmount = c_amount+comboAmount;
	  		
	  	}else if(d_Count>c_Count) {
	  		
	  		Integer saperateCount = d_Count-c_Count;
	  		Integer comboCount = d_Count - saperateCount;
	  		
	  		Double d_amount = saperateCount* ProductConstants.D;
	  		Double comboAmount = comboCount* ProductConstants.cd_amount;
	  		
	  		totalAmount = d_amount+comboAmount;
	  	}
		return totalAmount;
	}
}
