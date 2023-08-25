Implementare la classe SharedTotal, che permette a diversi thread di comunicare un valore nume-
rico (double) e poi ricevere la somma di tutti i valori inviati dai diversi thread. Precisamente, il
costruttore accetta come argomento un timeout in millisecondi. Il metodo sendValAndReceiveTot
accetta come argomento il valore indicato dal thread corrente, mette il thread corrente in attesa
fino allo scadere del timeout, e infine restituisce il totale di tutti i valori inviati.
Se un thread ha già chiamato sendValAndReceiveTot una volta, al secondo tentativo viene sollevata
un’eccezione.
È necessario evitare race condition.