Implementare il metodo statico atLeastOne, che accetta come argomenti un intero positivo n e un
Runnable r ed esegue in parallelo n copie di r. Appena una delle copie termina, le altre vengono
interrotte (con interrupt) e il metodo restituisce il controllo al chiamante.