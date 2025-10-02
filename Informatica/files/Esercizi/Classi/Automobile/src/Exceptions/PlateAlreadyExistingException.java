package Exceptions;

public class PlateAlreadyExistingException extends RuntimeException {

  @Override
  public String getMessage() {
    return "A plate with such serial number already exists";
  }

}
