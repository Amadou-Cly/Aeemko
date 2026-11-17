package exceptions;
 
// Thrown when approving/creating a registration would exceed the event capacity.
public class EventFullException extends BusinessException {
 
	private static final long serialVersionUID = 1L;
 
	public EventFullException(String eventTitle) {
		super("L'événement " + eventTitle + " est complet");
	}
}
 