// $Id: BadRequestException.java,v 1.2 2013/07/26 13:14:09 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

public abstract class BadRequestException extends Exception {

	private static final long serialVersionUID = 2890306848166871098L;

	public BadRequestException() {
	}

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(Throwable cause) {
		super(cause);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public abstract int getCode();

}
