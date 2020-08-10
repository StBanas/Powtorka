package message;

public class SimpleMessageApplication {

    private MessageService messageService = new MessageService( );

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message,receiver);
        }
    }

        public boolean checkReceiver(String receiver) {
            return (receiver != null  &&  !receiver.isEmpty());
    }


}
