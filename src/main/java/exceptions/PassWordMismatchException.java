package exceptions;

public class PassWordMismatchException extends BusinessException {
	 
		private static final long serialVersionUID = 1L;
	 
		public PassWordMismatchException() {
			super("Les mots de passe ne correspondent pas");
		}
	}
	 