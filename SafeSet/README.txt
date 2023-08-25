Realizzare la classe SafeSet, che rappresenta un insieme che richiede due passaggi per rimuovere
completamente un oggetto. Il metodo add aggiunge un elemento all’insieme, restituendo true
se l’inserimento ha avuto successo. Il metodo remove rimuove un elemento dall’insieme, ma la
rimozione è definitiva solo dopo una seconda chiamata. Il metodo contains verifica se l’insieme
contiene un dato elemento (in base a equals). Infine, un SafeSet deve essere thread-safe.