// $Id: UnknownFunctionException.java,v 1.2 2013/07/26 13:14:08 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

public class UnknownFunctionException extends BadRequestException {

	private static final long serialVersionUID = 875487430638308260L;

	public UnknownFunctionException() {
	}

	public UnknownFunctionException(String message) {
		super(message);
	}

	public UnknownFunctionException(Throwable cause) {
		super(cause);
	}

	public UnknownFunctionException(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getCode() {
		return 1;
	}

}
