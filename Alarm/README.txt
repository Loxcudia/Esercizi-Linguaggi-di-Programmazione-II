Realizzare la classe Alarm, nel contesto di un sistema di allarme domestico. Il compito dell’oggetto
Alarm è di stampare un messaggio se una condizione anomala permane oltre una soglia di tempo
prestabilita (un timeout). Il costruttore accetta il timeout in secondi. Il metodo anomalyStart
segnala l’inizio di una situazione anomala, mentre il metodo anomalyEnd ne segnala la fine. Se
viene invocato anomalyStart e poi non viene invocato anomalyEnd entro il timeout, l’oggetto Alarm
produce in output il messaggio “Allarme!”.
Se anomalyStart viene invocato più volte, senza che sia ancora stato invocato anomalyEnd, le
invocazioni successive alla prima vengono ignorate (cioè, non azzerano il timeout).
La classe Alarm deve risultare thread safe e i suoi metodi non devono essere bloccanti.