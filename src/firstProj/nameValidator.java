package firstProj;

public class nameValidator {
	void nameCheck(String name) throws InvalidNameException {

		for(char ch:name.toCharArray()) {
			if(Character.isDigit(ch)) {
				throw new InvalidNameException();
			}else {
				continue;
			}
		}
	}

}
