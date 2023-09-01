Implementare la classe Elevator, che simula il comportamento di un ascensore. Il costruttore
prende come argomento il numero di piani serviti (oltre al pian terreno). Il metodo call rap-
presenta la prenotazione (“chiamata”) di un piano. Se l’argomento di call è fuori dall’intervallo
corretto, viene lanciata un’eccezione.
In un thread indipendente, quando ci sono chiamate in attesa, l’ascensore cambia piano in modo
da soddisfare una delle chiamate, scelta in ordine arbitrario. L’ascensore impiega due secondi
per percorrere ciascun piano e stampa a video dei messaggi esplicativi, come nel seguente caso
d’uso.