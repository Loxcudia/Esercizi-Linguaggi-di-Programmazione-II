Implementare il metodo statico findString che accetta una stringa x e un array di stringhe a
e restituisce “vero” se x è una delle stringhe di a, e “falso” altrimenti. Per ottenere questo
risultato, il metodo usa due tecniche in parallelo: un primo thread confronta x con ciascuna
stringa dell’array; un altro thread confronta solo la lunghezza di x con quella di ciascuna stringa
dell’array. Il metodo deve restituire il controllo al chiamante appena è in grado di fornire una
risposta certa.
Ad esempio, se il secondo thread scopre che nessuna stringa dell’array ha la stessa lunghezza di
x, il metodo deve subito restituire “falso” e terminare il primo thread (se ancora in esecuzione).