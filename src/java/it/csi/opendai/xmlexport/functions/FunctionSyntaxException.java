// $Id: FunctionSyntaxException.java,v 1.2 2013/07/26 13:14:08 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

public class FunctionSyntaxException extends BadRequestException {

	private static final long serialVersionUID = 2049776146455733433L;

	public FunctionSyntaxException() {
	}

	public FunctionSyntaxException(String message) {
		super(message);
	}

	public FunctionSyntaxException(Throwable cause) {
		super(cause);
	}

	public FunctionSyntaxException(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getCode() {
		return 2;
	}

}
