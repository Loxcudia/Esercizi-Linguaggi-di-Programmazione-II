Un oggetto Curriculum rappresenta una sequenza di lavori, ognuno dei quali è un’istanza della
classe Job. Il costruttore di Curriculum accetta il nome di una persona. Il metodo addJob aggiunge
un lavoro alla sequenza, caratterizzato da una descrizione e dall’anno di inizio, restituendo un
nuovo oggetto di tipo Job. Infine, la classe Job offre il metodo next, che restituisce in tempo
costante il lavoro successivo nella sequenza (oppure null).