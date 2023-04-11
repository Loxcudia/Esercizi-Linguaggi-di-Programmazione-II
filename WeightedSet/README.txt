Implementare la classe parametrica WeightedSet (insieme pesato), che rappresenta un insieme in cui ad
ogni oggetto è associato un peso intero.
Il metodo add aggiunge un oggetto con un dato peso. Ad ogni oggetto può essere associato un unico peso,
mentre oggetti diversi possono avere lo stesso peso.
Il metodo atLeast accetta un peso p e restituisce una vista sull’insieme degli oggetti di peso maggiore o
uguale di p. Questa vista supporta l’inserimento di nuovi oggetti con add, ma solo se il loro peso è almeno
p, altrimenti add deve lanciare un’eccezione.
Il metodo toString di un WeightedSet deve elencare gli oggetti contenuti, senza il loro peso, ma in ordine
di peso non decrescente.