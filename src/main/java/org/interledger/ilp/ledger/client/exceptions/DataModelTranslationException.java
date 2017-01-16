package org.interledger.ilp.ledger.client.exceptions;

public class DataModelTranslationException extends RuntimeException {

  private static final long serialVersionUID = -8868217143062192982L;

  private Object model;
  
  public DataModelTranslationException(String message, Object sourceModel) {
    super(message);
    model = sourceModel;
  }
  
  public DataModelTranslationException(String message, Object sourceModel, Exception e) {
    super(message, e);
    model = sourceModel;
  }

  public Object getSourceModel() {
    return model;
  }

}
