Implementare la classe parametrica MultiBuffer, che rappresenta un insieme di buffer. Il suo
costruttore accetta il numero n di buffer da creare. Il metodo insert inserisce un oggetto nel
buffer che in quel momento contiene meno elementi. Il metodo bloccante take accetta un intero i
compreso tra 0 ed n − 1 e restituisce il primo oggetto presente nel buffer i-esimo. La classe deve
risultare thread-safe.