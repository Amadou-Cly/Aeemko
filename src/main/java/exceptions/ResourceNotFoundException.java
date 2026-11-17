package exceptions;
 
// Thrown when an entity does not exist (user, profile, event, announcement, registration).
public class ResourceNotFoundException extends RuntimeException {
 
	private static final long serialVersionUID = 1L;
 
	public ResourceNotFoundException(String message) {
		super(message);
	}
 
	// e.g. new ResourceNotFoundException("Événement", 5) -> "Événement introuvable avec l'id : 5"
	public ResourceNotFoundException(String resourceName, Object id) {
		super(resourceName + " introuvable avec l'id : " + id);
	}
}
 