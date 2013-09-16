// $Id: BadParameterException.java,v 1.2 2013/07/26 13:14:08 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

public class BadParameterException extends BadRequestException {

	private static final long serialVersionUID = 72520698377182812L;

	public BadParameterException() {
	}

	public BadParameterException(String message) {
		super(message);
	}

	public BadParameterException(Throwable cause) {
		super(cause);
	}

	public BadParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getCode() {
		return 3;
	}

}
