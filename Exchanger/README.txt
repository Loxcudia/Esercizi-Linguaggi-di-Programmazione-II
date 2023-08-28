Un Exchanger è un oggetto che serve a due thread per scambiarsi due oggetti dello stesso tipo.
Ciascun thread invocherà il metodo exchange passandogli il proprio oggetto e riceverà come
risultato l’oggetto passato dall’altro thread. Il primo thread che invoca exchange dovrà aspettare
che anche il secondo thread invochi quel metodo, prima di ricevere il risultato. Quindi, il metodo
exchange risulta bloccante per il primo thread che lo invoca e non bloccante per il secondo.
Un Exchanger può essere usato per un solo scambio. Ulteriori chiamate ad exchange dopo le
prime due portano ad un’eccezione.