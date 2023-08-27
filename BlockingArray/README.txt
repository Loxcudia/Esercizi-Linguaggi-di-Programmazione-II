Realizzare la classe BlockingArray, che rappresenta un array di dimensione fissa, in cui diversi
thread mettono e tolgono elementi.
Il costruttore accetta la dimensione dell’array. Inizialmente, tutte le celle risultano vuote. Il
metodo put(i, x) inserisce l’oggetto x nella cella i-esima, aspettando se quella cella è occupata.
Simmetricamente, il metodo take(i) preleva l’oggetto dalla cella i-esima, aspettando se quella
cella è vuota. La classe deve risultare thread-safe.