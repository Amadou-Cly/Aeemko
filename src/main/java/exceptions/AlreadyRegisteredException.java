package exceptions;
 
public class AlreadyRegisteredException extends BusinessException {
 
	private static final long serialVersionUID = 1L;
 
	public AlreadyRegisteredException() {
		super("Vous êtes déjà inscrit à cet événement");
	}
}
 