Implementare un programma Java che avvia contemporaneamente due thread, che condividono
una lista di interi:
a) il primo thread aggiunge un numero casuale alla lista ogni decimo di secondo, terminando
quando il numero estratto è multiplo di 100;
b) il secondo thread calcola e stampa a video la somma di tutti i numeri nella lista, una volta
al secondo, terminando non appena termina il primo thread.
È necessario evitare race condition e attese attive.