Si supponga che una applicazione divida un’operazione complessa tra più thread, che procedono
in parallelo. Si implementi la classe MultiProgressBar, di cui ciascun oggetto serve a tenere traccia
dello stato di avanzamento dei thread coinvolti in una data operazione.
Il costruttore accetta il numero totale n di thread coinvolti. Il metodo progress, con un argomento
intero e senza valore di ritorno, consente ad un thread di dichiarare il suo stato di avanzamento,
in percentuale. Tale metodo lancia un’eccezione se lo stesso thread dichiara uno stato di avanza-
mento inferiore ad uno precedentemente dichiarato. Il metodo getProgress, senza argomenti e con
valore di ritorno intero, restituisce il minimo stato di avanzamento tra tutti i thread coinvolti.
E’ necessario evitare eventuali race condition.