Implementare una classe PostOfficeQueue, che aiuta a gestire la coda in un ufficio postale. Il
costruttore accetta il numero totale di sportelli disponibili. Quando l’i-esimo sportello comincia
a servire un cliente e quindi diventa occupato, viene invocato (dall’esterno della classe) il metodo
deskStart passando i come argomento. Quando invece l’i-esimo sportello si libera, viene invocato
195
16 Multi-threading
il metodo deskFinish con argomento i. Infine, il metodo getFreeDesk restituisce il numero di uno
sportello libero. Se non ci sono sportelli liberi, il metodo attende che se ne liberi uno.
Si deve supporre che thread diversi possano invocare concorrentemente i metodi di PostOffice-
Queue. É necessario evitare race condition ed attese attive