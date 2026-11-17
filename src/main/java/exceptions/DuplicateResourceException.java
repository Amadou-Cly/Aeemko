package exceptions;
 
// Thrown when a unique value is already taken (userName, email).
public class DuplicateResourceException extends BusinessException {
 
	private static final long serialVersionUID = 1L;
 
	public DuplicateResourceException(String message) {
		super(message);
	}
}
 