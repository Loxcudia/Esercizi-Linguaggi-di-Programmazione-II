Realizzare la classe parametrica Range, che rappresenta un intervallo di oggetti dotati di ordina-
mento naturale, con le seguenti funzionalità:
a) Il costruttore accetta gli estremi dell’intervallo (l’oggetto minimo e l’oggetto massimo).
b) Il metodo isInside accetta un oggetto x e restituisce true se e solo se x appartiene all’intervallo.
c) Il metodo isOverlapping accetta un altro intervallo x e restituisce true se e solo se x è
sovrapposto a questo intervallo (cioè se i due hanno intersezione non vuota).
d) Il metodo equals è ridefinito in modo che due intervalli con gli stessi estremi risultino uguali.
e) Il metodo hashCode è ridefinito in modo da essere coerente con equals