Implementare il metodo statico mergeIfSorted, che accetta due liste a e b, e un comparatore c, e
restituisce un’altra lista. Inizialmente, usando due thread diversi, il metodo verifica che le liste
a e b siano ordinate in senso non decrescente (ogni thread si occupa di una lista). Poi, se le liste
sono effettivamente ordinate, il metodo le fonde (senza modificarle) in un’unica lista ordinata,
che viene restituita al chiamante. Se, invece, almeno una delle due liste non è ordinata, il metodo
termina restituendo null.
Il metodo dovrebbe avere complessità di tempo lineare.
Porre particolare attenzione alla scelta della firma, considerando i criteri di funzionalità, comple-
tezza, correttezza, fornitura di garanzie e semplicità.