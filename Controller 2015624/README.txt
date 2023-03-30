Realizzare la classe Controller, che rappresenta una centralina per autoveicoli, e la classe Function,
che rappresenta una funzionalità del veicolo, che può essere accesa o spenta. Alcune funzionalità
sono incompatibili tra loro, per cui accenderne una fa spegnere automaticamente l’altra.
La classe Controller ha due metodi: addFunction aggiunge al sistema una nuova funzionalità con
un dato nome; printOn stampa a video i nomi delle funzionalità attive. La classe Function ha tre
metodi: turnOn e turnOff per attivarla e disattivarla; setIncompatible accetta un’altra funzionalità
x e imposta un’incompatibilità tra this e x.