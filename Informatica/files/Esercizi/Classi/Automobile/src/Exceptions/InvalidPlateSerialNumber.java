package Exceptions;

public class InvalidPlateSerialNumber extends RuntimeException {

  @Override
  public String getMessage() {
    return "This serial number does not conform to the format specified";
  }

}
