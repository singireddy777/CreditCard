/**
 * 
 */
package com.hcl.fundtransfer.exception;

/**
 * @author user1
 *
 */
public class CardNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CardNotFoundException(String message) {
		super(message);
	}
	

}
