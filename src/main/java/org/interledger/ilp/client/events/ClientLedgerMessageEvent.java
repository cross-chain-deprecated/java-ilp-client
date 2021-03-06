package org.interledger.ilp.client.events;

import org.interledger.ilp.ledger.events.LedgerMessageEvent;
import org.interledger.ilp.ledger.model.LedgerMessage;

import java.util.EventObject;

public class ClientLedgerMessageEvent extends EventObject implements LedgerMessageEvent {

  private static final long serialVersionUID = -3783517030193972130L;

  private LedgerMessage message;

  public ClientLedgerMessageEvent(Object source, LedgerMessage message) {
    super(source);
    this.message = message;
  }

  @Override
  public LedgerMessage getMessage() {
    return message;
  }

}
