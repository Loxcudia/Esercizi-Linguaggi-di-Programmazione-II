Implementare la classe thread-safe TimeToFinish, che permette a diversi thread di comunicare
quanto tempo manca alla propria terminazione. Il metodo setEstimate accetta un long che rappre-
senta il numero di millisecondi che mancano al thread chiamante per terminare la sua esecuzione
(cioè, il time-to-finish). Il metodo maxTimeToFinish restituisce in tempo costante il numero di
millisecondi necessari perché tutti i thread terminino. La stringa restituita da toString riporta il
time-to-finish di tutti i thread