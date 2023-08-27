Implementare il metodo statico twoPhases, che accetta due Iterable<Runnable> ed esegue in
parallelo tutti i Runnable contenuti nel primo Iterable (prima fase), seguiti da tutti i Runnable
contenuti nel secondo Iterable (seconda fase). Precisamente, appena l’i-esimo Runnable del primo
gruppo termina, quel thread passa ad eseguire l’i-esimo Runnable del secondo gruppo.