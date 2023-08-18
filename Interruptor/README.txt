Implementare la classe Interruptor, il cui compito è quello di interrompere un dato thread dopo un
numero fissato di secondi.
Ad esempio, se t è un riferimento ad un oggetto Thread, la linea
Interruptor i = new Interruptor(t, 10);
crea un nuovo thread di esecuzione che interrompe il thread t dopo 10 secondi.