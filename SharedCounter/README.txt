Realizzare la classe SharedCounter, che rappresenta un contatore thread-safe, che parte dal valore
zero. Il suo metodo incr incrementa il contatore, mentre decr lo decrementa. Il contatore non può
assumere un valore negativo, quindi invocare decr quando il valore è zero non ha alcun effetto.
Il metodo waitForValue accetta un valore intero n e mette il chiamante in attesa finché il contatore
non assuma il valore n (se il contatore vale già n, il metodo restituisce subito il controllo al
chiamante).