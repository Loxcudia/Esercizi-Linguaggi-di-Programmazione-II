Implementare la classe parametrica MultiQueue, che rappresenta un insieme di code FIFO con
carico bilanciato.
Il costruttore accetta il numero n di code da gestire. Il metodo add aggiunge un oggetto a una
delle code che in quel momento contengono meno oggetti. Il metodo get accetta un intero i
compreso tra 0 e n − 1 e rimuove e restituisce l’oggetto in testa alla coda i-esima, mettendo il
chiamante in attesa se quella coda è vuota.
La classe deve essere thread-safe e rispettare il seguente esempio d’uso.