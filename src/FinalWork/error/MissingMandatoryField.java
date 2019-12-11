package FinalWork.error;

public class MissingMandatoryField extends RuntimeException{

    private static final String MESSAGE_PATERN = "%s name '%s' is mandatory field";
    public MissingMandatoryField(Class type, String fieldName) {
        super(String.format(MESSAGE_PATERN,type.getName(),fieldName));
    }
}
