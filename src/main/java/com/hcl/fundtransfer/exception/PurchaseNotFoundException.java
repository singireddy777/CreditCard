
package com.hcl.fundtransfer.exception;

public class PurchaseNotFoundException extends RuntimeException {
	

	private static final long serialVersionUID = 1L;

	public PurchaseNotFoundException(String message) {
		
		super(message);
	}


}
