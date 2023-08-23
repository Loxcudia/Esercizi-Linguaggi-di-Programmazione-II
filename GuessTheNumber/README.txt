Realizzare la classe GuessTheNumber, che consente a diversi thread di indovinare un numero
segreto. Il costruttore accetta il numero da indovinare (int) e la durata del quiz, in millisecondi
(long). Il metodo guessAndWait consente ad un thread di proporre una soluzione (int), poi attende
fino alla fine del quiz, ed infine restituisce true se questo è il thread che si è avvicinato di più alla
soluzione, e false altrimenti.