Implementare il metodo statico executeWithDeadline, che accetta un riferimento r a un Runnable
ed un tempo t espresso in secondi. Il metodo esegue r fino ad un tempo massimo di t secondi,
trascorsi i quali il metodo interromperà r e restituirà il controllo al chiamante.
Quindi, il metodo deve terminare quando una delle seguenti condizioni diventa vera: 1) il
Runnable termina la sua esecuzione, oppure 2) trascorrono t secondi.
Si può supporre che il Runnable termini quando viene interrotto.