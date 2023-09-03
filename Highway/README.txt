Implementare una classe Highway, che rappresenti un’autostrada a senso unico. Il costruttore
accetta la lunghezza dell’autostrada in chilometri. Il metodo insertCar prende un intero x come
argomento ed aggiunge un’automobile al chilometro x. L’automobile inserita percorrerà l’auto-
strada alla velocità di un chilometro al minuto, (60 km/h) fino alla fine della stessa. Il metodo
nCars prende un intero x e restituisce il numero di automobili presenti al chilometro x. Il metodo
progress simula il passaggio di 1 minuto di tempo (cioè fa avanzare tutte le automobili di un
chilometro).
Si supponga che thread multipli possano accedere allo stesso oggetto Highway.